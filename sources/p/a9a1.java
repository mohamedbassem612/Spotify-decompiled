package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a9a1 extends hab0 implements zu30 {
    public final /* synthetic */ hw2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lik1 c;
    public final /* synthetic */ x8a1 d;
    public final /* synthetic */ cm0 e;
    public final /* synthetic */ vzq0 f;
    public final /* synthetic */ u7h g;
    public final /* synthetic */ w6a1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9a1(hw2 hw2Var, String str, lik1 lik1Var, x8a1 x8a1Var, cm0 cm0Var, vzq0 vzq0Var, u7h u7hVar, w6a1 w6a1Var) {
        super(4);
        this.a = hw2Var;
        this.b = str;
        this.c = lik1Var;
        this.d = x8a1Var;
        this.e = cm0Var;
        this.f = vzq0Var;
        this.g = u7hVar;
        this.h = w6a1Var;
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
            for (sic1 sic1Var : this.d.c) {
                if (sic1Var instanceof ric1) {
                    x340Var2.i0(-60063354);
                    ric1 ric1Var = (ric1) sic1Var;
                    otw.c(this.e, new m9a1(((Context) x340Var2.k(AndroidCompositionLocals_androidKt.b)).getString(ric1Var.a), ric1Var.b, (String) null, ric1Var.d, (String) null, false, (String) null, 116), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                    x340Var2.r(false);
                } else if (sic1Var instanceof pic1) {
                    x340Var2.i0(-59581149);
                    otw.c(this.h, new u6a1(((pic1) sic1Var).a, this.g.a, uyn1.j(0.0f, 0.0f, 0.0f, this.f.a(), 7), e2x0.Q0), nbhVar.a(1.0f, u291.d(nim0.a, 1.0f), true), (ipb1) null, x340Var2, 64, 8);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-59037471);
                    x340Var2.r(false);
                }
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
