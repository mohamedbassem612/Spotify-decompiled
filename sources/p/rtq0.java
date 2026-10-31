package p;

import app.p000rive.runtime.kotlin.R;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rtq0 implements vu30 {
    public final /* synthetic */ elk1 N0;
    public final /* synthetic */ idn0 O0;
    public final /* synthetic */ vu30 P0;
    public final /* synthetic */ vu30 Q0;
    public final /* synthetic */ vu30 R0;
    public final /* synthetic */ vu30 S0;
    public final /* synthetic */ hw61 T0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j4e1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ lee1 h;
    public final /* synthetic */ kua0 i;
    public final /* synthetic */ bua0 t;

    /* JADX WARN: Multi-variable type inference failed */
    public rtq0(qim0 qim0Var, boolean z, j4e1 j4e1Var, String str, iu30 iu30Var, boolean z2, boolean z3, lee1 lee1Var, kua0 kua0Var, bua0 bua0Var, boolean z4, int i, int i2, elk1 elk1Var, idn0 idn0Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, hw61 hw61Var) {
        this.a = qim0Var;
        this.b = z;
        this.c = j4e1Var;
        this.d = str;
        this.e = iu30Var;
        this.f = z2;
        this.g = z3;
        this.h = lee1Var;
        this.i = kua0Var;
        this.t = bua0Var;
        this.X = z4;
        this.Y = i;
        this.Z = i2;
        this.N0 = elk1Var;
        this.O0 = idn0Var;
        this.P0 = vu30Var;
        this.Q0 = vu30Var2;
        this.R0 = vu30Var3;
        this.S0 = vu30Var4;
        this.T0 = hw61Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            x340Var2.i0(-903106918);
            x340Var2.r(false);
            qim0 qim0VarThen = this.a.then(nim0.a);
            String strQ = bno1.q(x340Var2, R.string.default_error_message);
            boolean z = this.b;
            if (z) {
                qim0VarThen = s161.b(qim0VarThen, false, new jfa(strQ, (byte) 16));
            }
            qim0 qim0VarA = u291.a(qim0VarThen, 280.0f, 56.0f);
            j4e1 j4e1Var = this.c;
            n6a1 n6a1Var = new n6a1(z ? j4e1Var.j : j4e1Var.i);
            vu30 vu30Var = this.S0;
            hw61 hw61Var = this.T0;
            String str = this.d;
            boolean z2 = this.f;
            boolean z3 = this.X;
            elk1 elk1Var = this.N0;
            idn0 idn0Var = this.O0;
            xea.a(str, this.e, qim0VarA, z2, this.g, this.h, this.i, this.t, z3, this.Y, this.Z ? 1 : 0, elk1Var, null, idn0Var, n6a1Var, apo.r(-1189274459, new qtq0(str, z2, z3, elk1Var, idn0Var, this.b, this.P0, this.Q0, this.R0, vu30Var, j4e1Var, hw61Var), x340Var2), x340Var2, 0, 196608, SemanticState.Obscured);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
