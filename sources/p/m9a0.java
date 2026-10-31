package p;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class m9a0 {
    public static final double a = 5.759586531581287d;
    public static final PointF b = new PointF(0.0f, 0.0f);

    public static PointF a(double d, float f) {
        double d2 = f;
        return new PointF((float) (Math.cos(d) * d2), (float) (Math.sin(d) * d2));
    }

    public static List b(double d, double d2) {
        float fTan = ((float) (Math.tan(0.39269908169872414d) * 1.3333333333333333d)) * 0.9f;
        PointF pointFA = a(4.1887902047863905d, 0.9f);
        double d3 = a;
        PointF pointFA2 = a(d3, (float) ((1.0d - (d2 * d)) * 0.8999999761581421d));
        PointF pointF = b;
        PointF pointFD = d(pointF, pointFA2);
        PointF pointFA3 = a(7.330382858376184d, 0.9f);
        PointF pointFA4 = a(8.901179185171081d, 0.9f);
        double d4 = (d3 + 1.5707963267948966d) - (((d * 2.0d) * 3.141592653589793d) / 3.0d);
        mmr0 mmr0VarC = c(pointF, pointFA3, pointFA4);
        PointF pointF2 = (PointF) mmr0VarC.a;
        PointF pointF3 = (PointF) mmr0VarC.b;
        mmr0 mmr0VarC2 = c(pointF, pointFA4, pointFA);
        return p7h.M(new beo[]{new beo(pointFA, d(pointFA, a(5.759586531581287d, fTan)), d(pointFD, a(d4 - 3.141592653589793d, fTan)), pointFD), new beo(pointFD, d(pointFD, a(d4, fTan)), d(pointFA3, a(5.759586531581288d, fTan)), pointFA3), new beo(pointFA3, pointF2, pointF3, pointFA4), new beo(pointFA4, (PointF) mmr0VarC2.a, (PointF) mmr0VarC2.b, pointFA)});
    }

    public static mmr0 c(PointF pointF, PointF pointF2, PointF pointF3) {
        float f = pointF2.x;
        float f2 = pointF.x;
        float f3 = f - f2;
        float f4 = pointF2.y;
        float f5 = pointF.y;
        float f6 = f4 - f5;
        float f7 = pointF3.x - f2;
        float f8 = pointF3.y - f5;
        float f9 = (f6 * f6) + (f3 * f3);
        float f10 = (f6 * f8) + (f3 * f7) + f9;
        float fSqrt = ((((float) Math.sqrt((2.0f * f9) * f10)) - f10) * 1.3333334f) / ((f3 * f8) - (f6 * f7));
        float f11 = pointF.x;
        float f12 = (f11 + f3) - (fSqrt * f6);
        float f13 = pointF.y;
        return new mmr0(new PointF(f12, (f3 * fSqrt) + f6 + f13), new PointF((fSqrt * f8) + f11 + f7, (f13 + f8) - (fSqrt * f7)));
    }

    public static PointF d(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }
}
