package p;

import app.p000rive.runtime.kotlin.R;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v5e1 implements vu30 {
    public final /* synthetic */ hw61 N0;
    public final /* synthetic */ elk1 X;
    public final /* synthetic */ idn0 Y;
    public final /* synthetic */ vu30 Z;
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ j4e1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ lee1 f;
    public final /* synthetic */ kua0 g;
    public final /* synthetic */ bua0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: Multi-variable type inference failed */
    public v5e1(qim0 qim0Var, j4e1 j4e1Var, String str, iu30 iu30Var, boolean z, lee1 lee1Var, kua0 kua0Var, bua0 bua0Var, int i, int i2, elk1 elk1Var, idn0 idn0Var, vu30 vu30Var, hw61 hw61Var) {
        this.a = qim0Var;
        this.b = j4e1Var;
        this.c = str;
        this.d = iu30Var;
        this.e = z;
        this.f = lee1Var;
        this.g = kua0Var;
        this.h = bua0Var;
        this.i = i;
        this.t = i2;
        this.X = elk1Var;
        this.Y = idn0Var;
        this.Z = vu30Var;
        this.N0 = hw61Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            bno1.q(x340Var2, R.string.default_error_message);
            qim0 qim0VarA = u291.a(this.a, 280.0f, 56.0f);
            j4e1 j4e1Var = this.b;
            n6a1 n6a1Var = new n6a1(j4e1Var.i);
            vu30 vu30Var = this.Z;
            hw61 hw61Var = this.N0;
            String str = this.c;
            boolean z = this.e;
            elk1 elk1Var = this.X;
            idn0 idn0Var = this.Y;
            xea.a(str, this.d, qim0VarA, z, false, this.f, this.g, this.h, false, this.i, this.t ? 1 : 0, elk1Var, null, idn0Var, n6a1Var, apo.r(1451491557, new u5e1(str, z, elk1Var, idn0Var, vu30Var, hw61Var, j4e1Var), x340Var2), x340Var2, 0, 196608, SemanticState.Obscured);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
