package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zt2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt2(Function0 function0, boolean z) {
        super(1);
        this.a = (byte) 0;
        this.c = function0;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        float fCos;
        long jA;
        float f;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fFloatValue = ((Number) function0.invoke()).floatValue();
                float f2 = hrt.f(drawScope, 24.0f);
                rmc0 rmc0VarListIterator = yt2.g.listIterator(0);
                while (true) {
                    rmc0 rmc0Var = rmc0VarListIterator;
                    if (!rmc0Var.hasNext()) {
                        return rih1Var;
                    }
                    xt2 xt2Var = (xt2) rmc0Var.next();
                    if (z2) {
                        fCos = 0.0f;
                    } else {
                        smc0 smc0Var = yt2.g;
                        fCos = (float) Math.cos(xt2Var.d - fFloatValue);
                    }
                    long j = yt2.b;
                    float f3 = 1.0f;
                    float f4 = (fCos + 1.0f) / 2.0f;
                    if (f4 >= 0.5f) {
                        jA = z4p1.A((f4 - 0.5f) * 2.0f, j, yt2.a);
                    } else {
                        jA = z4p1.A(2.0f * f4, yt2.c, j);
                    }
                    long jB = u7h.b(jA, xt2Var.c ? (0.45f * f4) + 0.55f : (0.3f * f4) + 0.5f, 0.0f, 0.0f, 0.0f, 14);
                    if (xt2Var.c) {
                        f = f4 * 1.5999999f;
                    } else {
                        f = f4 * 0.35000002f;
                        f3 = 0.65f;
                    }
                    DrawScope.b0(drawScope, jB, (f + f3) * f2, k4k.r(xt2Var, f2), 0.0f, (DrawStyle) null, 120);
                }
                break;
            case 1:
                e261 e261Var = (e261) obj;
                c261.a(e261Var);
                if (!z2) {
                    fam.a.getClass();
                    b261.o(e261Var, s9m.d);
                    e261Var.b(m161.g, new we((String) null, new vj0(function0, (byte) 6)));
                }
                return rih1Var;
            case 2:
                e261 e261Var2 = (e261) obj;
                c261.a(e261Var2);
                if (!z2) {
                    fam.a.getClass();
                    b261.o(e261Var2, s9m.c);
                    e261Var2.b(m161.g, new we((String) null, new vj0(function0, (byte) 8)));
                }
                return rih1Var;
            case 3:
                if (z2) {
                    function0.invoke();
                }
                return new tj4((byte) 7);
            case 4:
                kd31 kd31Var = (kd31) obj;
                if (!z2 && ((Boolean) function0.invoke()).booleanValue()) {
                    z = true;
                }
                kd31Var.f(z);
                return rih1Var;
            case 5:
                e261 e261Var3 = (e261) obj;
                b261.x(e261Var3, 2);
                b261.E(e261Var3, kbb.n(z2));
                b261.g(e261Var3, (String) null, new j160(function0, (byte) 29));
                return rih1Var;
            case 6:
                epb0 epb0Var = (epb0) obj;
                if (z2) {
                    epb0.Q(epb0Var, (Object) null, (Object) null, new j2i(-774472316, new oa5(function0, (byte) 12), true), 7);
                }
                epb0Var.R(7, (iu30) null, (vu30) null, aht.a1, c0j.a);
                return rih1Var;
            default:
                if (((Boolean) obj).booleanValue() && !z2) {
                    function0.invoke();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt2(boolean z, Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = function0;
    }
}
