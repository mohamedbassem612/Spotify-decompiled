package p;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class uua0 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final ye90 b = ye90.m(new String[]{"t", "s", "e", "o", "i", "h", "to", "ti"});
    public static final ye90 c = ye90.m(new String[]{"x", "y"});

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        pointF.x = itj0.b(pointF.x, -1.0f, 1.0f);
        pointF.y = itj0.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = itj0.b(pointF2.x, -1.0f, 1.0f);
        float fB = itj0.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        p5r p5rVar = qpi1.a;
        try {
            return poo1.B(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? poo1.B(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    public static sua0 b(eha0 eha0Var, fcf0 fcf0Var, float f, usi1 usi1Var, boolean z, boolean z2) {
        Object obj;
        BaseInterpolator baseInterpolatorA;
        BaseInterpolator baseInterpolatorA2;
        BaseInterpolator baseInterpolatorA3;
        Object obj2;
        sua0 sua0Var;
        ye90 ye90Var;
        ye90 ye90Var2;
        PointF pointF;
        ye90 ye90Var3 = b;
        LinearInterpolator linearInterpolator = a;
        if (!z || !z2) {
            ye90 ye90Var4 = ye90Var3;
            if (!z) {
                return new sua0(usi1Var.h(eha0Var, f));
            }
            eha0Var.c();
            PointF pointFB = null;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            boolean z3 = false;
            Object objH = null;
            float fI = 0.0f;
            Object objH2 = null;
            while (eha0Var.g()) {
                ye90Var4 = ye90Var4;
                switch (eha0Var.q(ye90Var4)) {
                    case 0:
                        fI = (float) eha0Var.i();
                        continue;
                    case 1:
                        objH = usi1Var.h(eha0Var, f);
                        break;
                    case 2:
                        objH2 = usi1Var.h(eha0Var, f);
                        break;
                    case 3:
                        pointFB4 = pha0.b(eha0Var, 1.0f);
                        break;
                    case 4:
                        pointFB = pha0.b(eha0Var, 1.0f);
                        break;
                    case 5:
                        z3 = eha0Var.j() == 1;
                        break;
                    case 6:
                        pointFB2 = pha0.b(eha0Var, f);
                        break;
                    case 7:
                        pointFB3 = pha0.b(eha0Var, f);
                        break;
                    default:
                        eha0Var.v();
                        break;
                }
            }
            eha0Var.e();
            if (!z3) {
                if (pointFB4 == null || pointFB == null) {
                    obj = objH2;
                } else {
                    baseInterpolatorA = a(pointFB4, pointFB);
                    obj = objH2;
                }
                sua0 sua0Var2 = new sua0(fcf0Var, objH, obj, baseInterpolatorA, fI, (Float) null);
                sua0Var2.o = pointFB2;
                sua0Var2.f111p = pointFB3;
                return sua0Var2;
            }
            obj = objH;
            baseInterpolatorA = linearInterpolator;
            sua0 sua0Var3 = new sua0(fcf0Var, objH, obj, baseInterpolatorA, fI, (Float) null);
            sua0Var3.o = pointFB2;
            sua0Var3.f111p = pointFB3;
            return sua0Var3;
        }
        eha0Var.c();
        PointF pointF2 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z4 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF3 = null;
        Object objH3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fI2 = 0.0f;
        Object objH4 = null;
        while (eha0Var.g()) {
            int iQ = eha0Var.q(ye90Var3);
            ye90 ye90Var5 = c;
            linearInterpolator = linearInterpolator;
            switch (iQ) {
                case 0:
                    ye90Var = ye90Var3;
                    fI2 = (float) eha0Var.i();
                    ye90Var3 = ye90Var;
                    break;
                case 1:
                    ye90Var = ye90Var3;
                    objH3 = usi1Var.h(eha0Var, f);
                    ye90Var3 = ye90Var;
                    break;
                case 2:
                    ye90Var = ye90Var3;
                    objH4 = usi1Var.h(eha0Var, f);
                    ye90Var3 = ye90Var;
                    break;
                case 3:
                    ye90Var = ye90Var3;
                    boolean z5 = z4;
                    Object obj3 = objH3;
                    PointF pointF6 = pointF4;
                    if (eha0Var.o() == 3) {
                        eha0Var.c();
                        float fI3 = 0.0f;
                        float fI4 = 0.0f;
                        float fI5 = 0.0f;
                        float fI6 = 0.0f;
                        while (eha0Var.g()) {
                            int iQ2 = eha0Var.q(ye90Var5);
                            if (iQ2 != 0) {
                                if (iQ2 != 1) {
                                    eha0Var.v();
                                } else if (eha0Var.o() == 7) {
                                    fI6 = (float) eha0Var.i();
                                    fI4 = fI6;
                                } else {
                                    eha0Var.a();
                                    fI4 = (float) eha0Var.i();
                                    fI6 = eha0Var.o() == 7 ? (float) eha0Var.i() : fI4;
                                    eha0Var.d();
                                }
                            } else if (eha0Var.o() == 7) {
                                fI5 = (float) eha0Var.i();
                                fI3 = fI5;
                            } else {
                                eha0Var.a();
                                fI3 = (float) eha0Var.i();
                                fI5 = eha0Var.o() == 7 ? (float) eha0Var.i() : fI3;
                                eha0Var.d();
                            }
                        }
                        PointF pointF7 = new PointF(fI3, fI4);
                        pointF4 = new PointF(fI5, fI6);
                        eha0Var.e();
                        pointF3 = pointF7;
                    } else {
                        pointFB7 = pha0.b(eha0Var, f);
                        pointF4 = pointF6;
                    }
                    z4 = z5;
                    objH3 = obj3;
                    ye90Var3 = ye90Var;
                    break;
                case 4:
                    boolean z6 = z4;
                    if (eha0Var.o() == 3) {
                        eha0Var.c();
                        float fI7 = 0.0f;
                        float fI8 = 0.0f;
                        float fI9 = 0.0f;
                        float fI10 = 0.0f;
                        while (eha0Var.g()) {
                            Object obj4 = objH3;
                            int iQ3 = eha0Var.q(ye90Var5);
                            if (iQ3 != 0) {
                                ye90Var2 = ye90Var3;
                                if (iQ3 != 1) {
                                    eha0Var.v();
                                } else if (eha0Var.o() == 7) {
                                    fI10 = (float) eha0Var.i();
                                    pointF4 = pointF4;
                                    fI8 = fI10;
                                } else {
                                    pointF = pointF4;
                                    eha0Var.a();
                                    fI8 = (float) eha0Var.i();
                                    fI10 = eha0Var.o() == 7 ? (float) eha0Var.i() : fI8;
                                    eha0Var.d();
                                    pointF4 = pointF;
                                }
                            } else {
                                ye90Var2 = ye90Var3;
                                pointF = pointF4;
                                if (eha0Var.o() == 7) {
                                    fI9 = (float) eha0Var.i();
                                    pointF4 = pointF;
                                    fI7 = fI9;
                                } else {
                                    eha0Var.a();
                                    fI7 = (float) eha0Var.i();
                                    fI9 = eha0Var.o() == 7 ? (float) eha0Var.i() : fI7;
                                    eha0Var.d();
                                    pointF4 = pointF;
                                }
                            }
                            objH3 = obj4;
                            ye90Var3 = ye90Var2;
                        }
                        ye90Var = ye90Var3;
                        PointF pointF8 = new PointF(fI7, fI8);
                        pointF2 = new PointF(fI9, fI10);
                        eha0Var.e();
                        pointF5 = pointF8;
                    } else {
                        ye90Var = ye90Var3;
                        pointFB8 = pha0.b(eha0Var, f);
                    }
                    z4 = z6;
                    ye90Var3 = ye90Var;
                    break;
                case 5:
                    z4 = eha0Var.j() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFB5 = pha0.b(eha0Var, f);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFB6 = pha0.b(eha0Var, f);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    eha0Var.v();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        BaseInterpolator baseInterpolatorA4 = linearInterpolator;
        boolean z7 = z4;
        Object obj5 = objH3;
        PointF pointF9 = pointF4;
        eha0Var.e();
        if (z7) {
            obj2 = obj5;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF3 != null && pointF9 != null && pointF5 != null && pointF2 != null) {
                    baseInterpolatorA2 = a(pointF3, pointF5);
                    baseInterpolatorA3 = a(pointF9, pointF2);
                    obj2 = objH4;
                    baseInterpolatorA4 = null;
                }
                if (baseInterpolatorA2 != null || baseInterpolatorA3 == null) {
                    sua0Var = new sua0(fcf0Var, obj5, obj2, baseInterpolatorA4, fI2, (Float) null);
                } else {
                    sua0Var = new sua0(fcf0Var, obj5, obj2, baseInterpolatorA2, baseInterpolatorA3, fI2);
                }
                sua0Var.o = pointFB5;
                sua0Var.f111p = pointFB6;
                return sua0Var;
            }
            baseInterpolatorA4 = a(pointFB7, pointFB8);
            obj2 = objH4;
        }
        baseInterpolatorA2 = null;
        baseInterpolatorA3 = null;
        if (baseInterpolatorA2 != null) {
            sua0Var = new sua0(fcf0Var, obj5, obj2, baseInterpolatorA4, fI2, (Float) null);
        } else {
            sua0Var = new sua0(fcf0Var, obj5, obj2, baseInterpolatorA4, fI2, (Float) null);
        }
        sua0Var.o = pointFB5;
        sua0Var.f111p = pointFB6;
        return sua0Var;
    }
}
