package p;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class x95 {
    public static final ye90 a = ye90.m(new String[]{"a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa"});
    public static final ye90 b = ye90.m(new String[]{"k"});

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    public static w95 a(nha0 nha0Var, fcf0 fcf0Var) {
        k9 k9Var;
        q95 q95VarY;
        fcf0 fcf0Var2 = fcf0Var;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z = nha0Var.o() == 3;
        if (z) {
            nha0Var.c();
        }
        q95 q95Var = null;
        r95 r95VarA = null;
        y95 y95VarB = null;
        k9 k9VarD = null;
        q95 q95VarY2 = null;
        q95 q95VarY3 = null;
        p95 p95VarB = null;
        q95 q95VarY4 = null;
        q95 q95VarY5 = null;
        while (nha0Var.g()) {
            switch (nha0Var.q(a)) {
                case 0:
                    nha0Var.c();
                    while (nha0Var.g()) {
                        if (nha0Var.q(b) != 0) {
                            nha0Var.u();
                            nha0Var.v();
                        } else {
                            r95VarA = s95.a(nha0Var, fcf0Var);
                        }
                    }
                    nha0Var.e();
                    fcf0Var2 = fcf0Var;
                    break;
                case 1:
                    y95VarB = s95.b(nha0Var, fcf0Var);
                    fcf0Var2 = fcf0Var;
                    break;
                case 2:
                    k9VarD = xpn1.D(nha0Var, fcf0Var);
                    fcf0Var2 = fcf0Var;
                    break;
                case 3:
                    fcf0Var2.a("Lottie doesn't support 3D layers.");
                    q95VarY = xpn1.y(nha0Var, fcf0Var2, false);
                    if (q95VarY.l0().isEmpty()) {
                        q95VarY.l0().add(new sua0(fcf0Var2, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(fcf0Var2.m)));
                    } else if (((sua0) q95VarY.l0().get(0)).b == null) {
                        q95VarY.l0().set(0, new sua0(fcf0Var2, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(fcf0Var2.m)));
                    }
                    fcf0Var2 = fcf0Var;
                    q95Var = q95VarY;
                    break;
                case 4:
                    q95VarY = xpn1.y(nha0Var, fcf0Var2, false);
                    if (q95VarY.l0().isEmpty()) {
                        q95VarY.l0().add(new sua0(fcf0Var2, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(fcf0Var2.m)));
                    } else if (((sua0) q95VarY.l0().get(0)).b == null) {
                        q95VarY.l0().set(0, new sua0(fcf0Var2, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(fcf0Var2.m)));
                    }
                    fcf0Var2 = fcf0Var;
                    q95Var = q95VarY;
                    break;
                case 5:
                    p95VarB = xpn1.B(nha0Var, fcf0Var);
                    break;
                case 6:
                    q95VarY4 = xpn1.y(nha0Var, fcf0Var2, false);
                    break;
                case 7:
                    q95VarY5 = xpn1.y(nha0Var, fcf0Var2, false);
                    break;
                case 8:
                    q95VarY2 = xpn1.y(nha0Var, fcf0Var2, false);
                    break;
                case 9:
                    q95VarY3 = xpn1.y(nha0Var, fcf0Var2, false);
                    break;
                default:
                    nha0Var.u();
                    nha0Var.v();
                    break;
            }
        }
        if (z) {
            nha0Var.e();
        }
        r95 r95Var = (r95VarA == null || (r95VarA.o0() && ((PointF) ((sua0) ((ArrayList) r95VarA.l0()).get(0)).b).equals(0.0f, 0.0f))) ? null : r95VarA;
        if (y95VarB == null || (!(y95VarB instanceof t95) && y95VarB.o0() && ((PointF) ((sua0) y95VarB.l0().get(0)).b).equals(0.0f, 0.0f))) {
            y95VarB = null;
        }
        q95 q95Var2 = (q95Var == null || (q95Var.o0() && ((Float) ((sua0) q95Var.l0().get(0)).b).floatValue() == 0.0f)) ? null : q95Var;
        if (k9VarD == null) {
            k9Var = null;
        } else {
            if (k9VarD.o0()) {
                pg41 pg41Var = (pg41) ((sua0) k9VarD.l0().get(0)).b;
                if (pg41Var.a == 1.0f && pg41Var.b == 1.0f) {
                    k9Var = null;
                }
            }
            k9Var = k9VarD;
        }
        return new w95(r95Var, y95VarB, k9Var, q95Var2, p95VarB, q95VarY4, q95VarY5, (q95VarY2 == null || (q95VarY2.o0() && ((Float) ((sua0) q95VarY2.l0().get(0)).b).floatValue() == 0.0f)) ? null : q95VarY2, (q95VarY3 == null || (q95VarY3.o0() && ((Float) ((sua0) q95VarY3.l0().get(0)).b).floatValue() == 0.0f)) ? null : q95VarY3);
    }
}
