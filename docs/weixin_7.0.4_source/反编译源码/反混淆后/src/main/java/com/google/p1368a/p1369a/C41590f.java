package com.google.p1368a.p1369a;

import com.tencent.ttpic.baseutils.IOUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.a.a.f */
public final class C41590f {
    /* renamed from: c */
    public static <T extends C25510e> String m72805c(T t) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            C41590f.m72802a(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    /* renamed from: a */
    private static void m72802a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof C25510e) {
            int modifiers;
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer).append(C41590f.m72804bg(str)).append(" <\n");
                stringBuffer.append("  ");
            }
            Class cls = obj.getClass();
            for (Field field : cls.getFields()) {
                modifiers = field.getModifiers();
                String name = field.getName();
                if (!((modifiers & 1) != 1 || (modifiers & 8) == 8 || name.startsWith("_") || name.endsWith("_"))) {
                    Class type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        C41590f.m72802a(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (modifiers = 0; modifiers < length2; modifiers++) {
                            C41590f.m72802a(name, Array.get(obj2, modifiers), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method name2 : cls.getMethods()) {
                String name3 = name2.getName();
                if (name3.startsWith("set")) {
                    String substring = name3.substring(3);
                    try {
                        if (((Boolean) cls.getMethod("has".concat(String.valueOf(substring)), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            try {
                                C41590f.m72802a(substring, cls.getMethod("get".concat(String.valueOf(substring)), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            } catch (NoSuchMethodException e) {
                            }
                        }
                    } catch (NoSuchMethodException e2) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer).append(">\n");
                return;
            }
            return;
        }
        stringBuffer2.append(stringBuffer).append(C41590f.m72804bg(str)).append(": ");
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.startsWith("http") && str2.length() > 200) {
                str2 = str2.substring(0, 200) + "[...]";
            }
            stringBuffer2.append("\"").append(C41590f.escapeString(str2)).append("\"");
        } else if (obj instanceof byte[]) {
            C41590f.m72803a((byte[]) obj, stringBuffer2);
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append(IOUtils.LINE_SEPARATOR_UNIX);
    }

    /* renamed from: bg */
    private static String m72804bg(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_').append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    private static String escapeString(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static void m72803a(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b : bArr) {
            if (b == (byte) 92 || b == (byte) 34) {
                stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS).append((char) b);
            } else if (b < (byte) 32 || b >= Byte.MAX_VALUE) {
                stringBuffer.append(String.format("\\%03o", new Object[]{Integer.valueOf(b)}));
            } else {
                stringBuffer.append((char) b);
            }
        }
        stringBuffer.append('\"');
    }
}
