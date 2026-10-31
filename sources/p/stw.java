package p;

import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class stw extends hab0 implements vu30 {
    public final /* synthetic */ ttw a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ jsw c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ d75 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stw(ttw ttwVar, boolean z, jsw jswVar, iu30 iu30Var, d75 d75Var) {
        super(2);
        this.a = ttwVar;
        this.b = z;
        this.c = jswVar;
        this.d = iu30Var;
        this.e = d75Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        b0k b0kVar = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (x340) b0kVar;
        if (x340Var.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            ttw ttwVar = this.a;
            uhk1 uhk1VarB = ttw.b(ttwVar);
            ComposeView composeView = (ComposeView) uhk1VarB.b;
            if (((llm) uhk1VarB.d) == null) {
                if (composeView.getParent() != null) {
                    uhk1VarB.e();
                } else {
                    ((ien0) uhk1VarB.f).c(uhk1VarB.g(xhk1.a(composeView)));
                }
            }
            uhk1 uhk1VarB2 = ttw.b(ttwVar);
            boolean zI = x340Var.i(ttwVar);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new i5w(ttwVar, (byte) 5);
                x340Var.s0(objT);
            }
            qxd0.i(uhk1VarB2, (iu30) objT, x340Var);
            qsw.b((ien0) ttw.b(ttwVar).f, apo.r(575888361, new rtw(ttwVar, this.b, this.c, this.d, this.e, (byte) 2), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        return rih1.a;
    }
}
