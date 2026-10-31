package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d9a1 extends hab0 implements zu30 {
    public final /* synthetic */ w6a1 N0;
    public final /* synthetic */ cm0 O0;
    public final /* synthetic */ u7h P0;
    public final /* synthetic */ b9u0 Q0;
    public final /* synthetic */ Context R0;
    public final /* synthetic */ r6h1 X;
    public final /* synthetic */ wks Y;
    public final /* synthetic */ zob1 Z;
    public final /* synthetic */ hw2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lik1 c;
    public final /* synthetic */ vzq0 d;
    public final /* synthetic */ hvp0 e;
    public final /* synthetic */ xyf1 f;
    public final /* synthetic */ d0r g;
    public final /* synthetic */ iac0 h;
    public final /* synthetic */ kkw0 i;
    public final /* synthetic */ njm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9a1(hw2 hw2Var, String str, lik1 lik1Var, vzq0 vzq0Var, hvp0 hvp0Var, xyf1 xyf1Var, d0r d0rVar, iac0 iac0Var, kkw0 kkw0Var, njm njmVar, r6h1 r6h1Var, wks wksVar, zob1 zob1Var, w6a1 w6a1Var, cm0 cm0Var, u7h u7hVar, b9u0 b9u0Var, Context context) {
        super(4);
        this.a = hw2Var;
        this.b = str;
        this.c = lik1Var;
        this.d = vzq0Var;
        this.e = hvp0Var;
        this.f = xyf1Var;
        this.g = d0rVar;
        this.h = iac0Var;
        this.i = kkw0Var;
        this.t = njmVar;
        this.X = r6h1Var;
        this.Y = wksVar;
        this.Z = zob1Var;
        this.N0 = w6a1Var;
        this.O0 = cm0Var;
        this.P0 = u7hVar;
        this.Q0 = b9u0Var;
        this.R0 = context;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        nbh nbhVar = (nbh) obj;
        long j = ((hjl) obj2).a;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(nbhVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
            otw.c(this.a, new r9a1(this.b, this.c.a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            w2g0.c(nbhVar.a(1.0f, nim0.a, true), (tl3) null, apo.r(-1335683172, new xka(this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, this.R0, (byte) 1), x340Var2), x340Var2, 3072, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
