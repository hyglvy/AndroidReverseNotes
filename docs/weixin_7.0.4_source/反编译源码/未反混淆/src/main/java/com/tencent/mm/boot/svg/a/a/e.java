package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class e extends c {
    private final int height = 96;
    private final int width = 96;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                Paint a = c.a(k, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(0.0f, 24.019958f);
                l.cubicTo(8.014991f, 16.016632f, 16.029982f, 8.003326f, 24.054966f, 0.0f);
                l.cubicTo(25.47408f, 1.4370062f, 26.893192f, 2.8740125f, 28.292316f, 4.3209977f);
                l.cubicTo(22.73579f, 9.869439f, 17.179262f, 15.4079f, 11.63273f, 20.95634f);
                l.cubicTo(23.755154f, 20.96632f, 35.877575f, 20.95634f, 48.0f, 20.96632f);
                l.lineTo(48.0f, 27.013721f);
                l.lineTo(11.582761f, 27.013721f);
                l.cubicTo(17.129293f, 32.612057f, 22.725796f, 38.15052f, 28.292316f, 43.728897f);
                l.cubicTo(26.873203f, 45.155926f, 25.444098f, 46.57297f, 24.01499f, 48.0f);
                l.cubicTo(16.009995f, 40.006653f, 8.004997f, 32.013306f, 0.0f, 24.019958f);
                l.lineTo(0.0f, 24.019958f);
                l.lineTo(0.0f, 24.019958f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
