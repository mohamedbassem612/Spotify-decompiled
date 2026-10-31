package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class e0e1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g0e1 b;

    public /* synthetic */ e0e1(g0e1 g0e1Var, byte b) {
        this.a = b;
        this.b = g0e1Var;
    }

    public final Object invoke(Object obj) {
        long jA;
        boolean z;
        byte b = this.a;
        y9e1 y9e1Var = null;
        g0e1 g0e1Var = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                y9e1 y9e1Var2 = g0e1Var.H1().o;
                if (y9e1Var2 != null) {
                    x9e1 x9e1Var = y9e1Var2.a;
                    af5 af5Var = x9e1Var.a;
                    lee1 lee1Var = g0e1Var.P0;
                    x9h x9hVar = g0e1Var.Y0;
                    if (x9hVar != null) {
                        jA = x9hVar.a();
                    } else {
                        int i = u7h.l;
                        jA = u7h.k;
                    }
                    y9e1 y9e1Var3 = new y9e1(new x9e1(af5Var, lee1.f(lee1Var, jA, 0L, (FontWeight) null, (FontFamily) null, 0L, 0, 0L, 16777214), x9e1Var.c, x9e1Var.d, x9e1Var.e, x9e1Var.f, x9e1Var.g, x9e1Var.h, x9e1Var.i, x9e1Var.j), y9e1Var2.b, y9e1Var2.c);
                    list.add(y9e1Var3);
                    y9e1Var = y9e1Var3;
                }
                return Boolean.valueOf(y9e1Var != null);
            case 1:
                af5 af5Var2 = (af5) obj;
                f0e1 f0e1Var = g0e1Var.e1;
                z6x z6xVar = z6x.a;
                if (f0e1Var == null) {
                    f0e1 f0e1Var2 = new f0e1(g0e1Var.O0, af5Var2);
                    csm0 csm0Var = new csm0(af5Var2, g0e1Var.P0, g0e1Var.Q0, g0e1Var.S0, g0e1Var.T0, g0e1Var.U0, g0e1Var.V0, z6xVar, g0e1Var.Z0);
                    csm0Var.d(g0e1Var.H1().k);
                    f0e1Var2.d = csm0Var;
                    g0e1Var.e1 = f0e1Var2;
                } else if (!u890.j(af5Var2, f0e1Var.b)) {
                    f0e1Var.b = af5Var2;
                    csm0 csm0Var2 = f0e1Var.d;
                    if (csm0Var2 != null) {
                        lee1 lee1Var2 = g0e1Var.P0;
                        f930 f930Var = g0e1Var.Q0;
                        int i2 = g0e1Var.S0;
                        boolean z2 = g0e1Var.T0;
                        int i3 = g0e1Var.U0;
                        int i4 = g0e1Var.V0;
                        m0e1 m0e1Var = g0e1Var.Z0;
                        csm0Var2.a = af5Var2;
                        csm0Var2.f(lee1Var2);
                        csm0Var2.b = f930Var;
                        csm0Var2.c = i2;
                        csm0Var2.d = z2;
                        csm0Var2.e = i3;
                        csm0Var2.f = i4;
                        csm0Var2.g = z6xVar;
                        csm0Var2.h = m0e1Var;
                        csm0Var2.s = (csm0Var2.s << 2) | 2;
                        csm0Var2.m = null;
                        csm0Var2.o = null;
                        csm0Var2.q = -1;
                        csm0Var2.p = -1;
                        csm0Var2.r = null;
                    }
                }
                nko1.C(g0e1Var);
                dio1.y(g0e1Var);
                ha71.x(g0e1Var);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                f0e1 f0e1Var3 = g0e1Var.e1;
                if (f0e1Var3 == null) {
                    z = false;
                } else {
                    iu30 iu30Var = g0e1Var.a1;
                    if (iu30Var != null) {
                        iu30Var.invoke(f0e1Var3);
                    }
                    f0e1 f0e1Var4 = g0e1Var.e1;
                    if (f0e1Var4 != null) {
                        f0e1Var4.c = zBooleanValue;
                    }
                    nko1.C(g0e1Var);
                    dio1.y(g0e1Var);
                    ha71.x(g0e1Var);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
