package p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f0t extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h98 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0t(h98 h98Var, byte b) {
        super(1);
        this.a = b;
        this.b = h98Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h98 h98Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                RecyclerView recyclerView = ((pes0) h98Var.b).b;
                w611 w611VarN = recyclerView.N(iIntValue);
                if (w611VarN == null) {
                    recyclerView.k(new p470(h98Var, recyclerView, iIntValue));
                } else {
                    ((h0z) h98Var.c).getClass();
                    if (w611VarN instanceof g0z) {
                        ((g0z) w611VarN).V0.c(zyz.e);
                    }
                }
                break;
            default:
                w611 w611VarN2 = ((pes0) h98Var.b).b.N(((Number) obj).intValue());
                if (w611VarN2 != null) {
                    ((h0z) h98Var.c).getClass();
                    if (w611VarN2 instanceof g0z) {
                        ((g0z) w611VarN2).V0.c(zyz.f);
                    }
                }
                break;
        }
        return rih1Var;
    }
}
