package p;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m7h0 implements nrm0 {
    public final /* synthetic */ ven0 N0;
    public final /* synthetic */ ven0 O0;
    public final /* synthetic */ ven0 P0;
    public final /* synthetic */ ven0 Q0;
    public final /* synthetic */ ven0 R0;
    public final /* synthetic */ ven0 S0;
    public final /* synthetic */ ven0 T0;
    public final /* synthetic */ ven0 U0;
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ ven0 Z;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ n7h0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    public m7h0(boolean z, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, n7h0 n7h0Var, Function0 function0, ven0 ven0Var4, ven0 ven0Var5, ven0 ven0Var6, ven0 ven0Var7, ven0 ven0Var8, ven0 ven0Var9, ven0 ven0Var10, ven0 ven0Var11, ven0 ven0Var12, ven0 ven0Var13, ven0 ven0Var14, ven0 ven0Var15, ven0 ven0Var16, ven0 ven0Var17, ven0 ven0Var18) {
        this.a = z;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
        this.e = n7h0Var;
        this.f = function0;
        this.g = ven0Var4;
        this.h = ven0Var5;
        this.i = ven0Var6;
        this.t = ven0Var7;
        this.X = ven0Var8;
        this.Y = ven0Var9;
        this.Z = ven0Var10;
        this.N0 = ven0Var11;
        this.O0 = ven0Var12;
        this.P0 = ven0Var13;
        this.Q0 = ven0Var14;
        this.R0 = ven0Var15;
        this.S0 = ven0Var16;
        this.T0 = ven0Var17;
        this.U0 = ven0Var18;
    }

    public final void d(Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        Function0 function1 = function0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(410539813);
        int i2 = i | (b0kVar3.i(function1) ? 4 : 2) | (b0kVar3.g(this) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = this.a;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = b0kVar3.h(z);
            ven0 ven0Var = this.b;
            boolean zI = zH | b0kVar3.i(ven0Var);
            boolean z2 = false;
            ven0 ven0Var2 = this.c;
            boolean zI2 = zI | b0kVar3.i(ven0Var2);
            ven0 ven0Var3 = this.d;
            boolean zI3 = zI2 | b0kVar3.i(ven0Var3);
            if ((i2 & 14) == 4) {
                z2 = true;
            }
            boolean z3 = zI3 | z2;
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                z290 z290Var = new z290(this.a, function1, ven0Var, ven0Var2, ven0Var3, (lnm) null);
                b0kVar3.s0(z290Var);
                objT = z290Var;
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT);
            b0kVar2 = b0kVar3;
            this.e.d((iu30) this.g.getValue(), ((Boolean) this.h.getValue()).booleanValue(), ((Boolean) this.i.getValue()).booleanValue(), ((Boolean) this.t.getValue()).booleanValue(), ((Boolean) this.X.getValue()).booleanValue(), (Function0) this.Y.getValue(), ((Boolean) this.Z.getValue()).booleanValue(), ((Boolean) this.N0.getValue()).booleanValue(), function0, (String) this.O0.getValue(), (iu30) this.P0.getValue(), ((Boolean) this.Q0.getValue()).booleanValue(), (Uri) this.R0.getValue(), ((Boolean) ven0Var2.getValue()).booleanValue(), ((Boolean) this.S0.getValue()).booleanValue(), ((Boolean) this.T0.getValue()).booleanValue(), (Function0) this.U0.getValue(), this.f, u291.f(nim0.a, 1.0f), b0kVar2, (i2 << 24) & 234881024);
            function1 = function0;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q0g0(this, function1, i, (byte) 11);
        }
    }
}
