package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.azw */
public final class azw extends C5163c {
    private final int height = 189;
    private final int width = 189;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 189;
            case 1:
                return 189;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-16268960);
                canvas.save();
                Paint a = C5163c.m7876a(k2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(94.5f, 0.0f);
                l.cubicTo(146.69092f, 0.0f, 189.0f, 42.30909f, 189.0f, 94.5f);
                l.cubicTo(189.0f, 146.69092f, 146.69092f, 189.0f, 94.5f, 189.0f);
                l.cubicTo(42.30909f, 189.0f, 0.0f, 146.69092f, 0.0f, 94.5f);
                l.cubicTo(0.0f, 42.30909f, 42.30909f, 0.0f, 94.5f, 0.0f);
                l.close();
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-1);
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 44.5f, 0.0f, 1.0f, 39.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                a2 = C5163c.m7878a(a2, 0.8660254f, -0.5f, 46.36397f, 0.5f, 0.8660254f, 0.12389612f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(14.281093f, 17.051855f);
                l.cubicTo(14.281093f, 7.8682823f, 21.725847f, 0.4235266f, 30.90942f, 0.4235266f);
                l.lineTo(30.909422f, 0.4235266f);
                l.cubicTo(40.092995f, 0.4235266f, 47.53775f, 7.8682823f, 47.53775f, 17.051855f);
                l.lineTo(47.53775f, 43.997627f);
                l.cubicTo(47.53775f, 53.1812f, 40.092995f, 60.625954f, 30.909422f, 60.625954f);
                l.lineTo(30.90942f, 60.625954f);
                l.cubicTo(21.725847f, 60.625954f, 14.281093f, 53.1812f, 14.281093f, 43.997627f);
                l.lineTo(14.281093f, 17.051855f);
                l.close();
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(7.629761f, 33.86932f);
                l.lineTo(7.629761f, 44.035454f);
                l.cubicTo(7.629761f, 56.892452f, 18.05242f, 67.31511f, 30.90942f, 67.31511f);
                l.cubicTo(43.76642f, 67.31511f, 54.18908f, 56.892452f, 54.18908f, 44.035454f);
                l.lineTo(54.18908f, 33.86932f);
                l.lineTo(60.84041f, 33.86932f);
                l.lineTo(60.84041f, 44.07328f);
                l.cubicTo(60.84041f, 60.60371f, 47.43985f, 74.00427f, 30.90942f, 74.00427f);
                l.cubicTo(14.378991f, 74.00427f, 0.97843033f, 60.60371f, 0.97843033f, 44.07328f);
                l.lineTo(0.97843033f, 33.86932f);
                l.lineTo(7.629761f, 33.86932f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                k2 = C5163c.m7876a(k, looper);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(27.583754f, 70.65969f);
                l2.lineTo(34.235085f, 70.65969f);
                l2.lineTo(34.235085f, 80.69343f);
                l2.lineTo(27.583754f, 80.69343f);
                l2.lineTo(27.583754f, 70.65969f);
                l2.close();
                canvas.drawPath(l2, k2);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(27.583754f, 84.03801f);
                l.lineTo(34.235085f, 84.03801f);
                l.lineTo(31.560646f, 90.28269f);
                l.cubicTo(31.406612f, 90.64236f, 30.99018f, 90.80905f, 30.630516f, 90.655014f);
                l.cubicTo(30.463182f, 90.58335f, 30.329857f, 90.45002f, 30.258192f, 90.28269f);
                l.lineTo(27.583754f, 84.03801f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
