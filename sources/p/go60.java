package p;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class go60 extends k611 {
    public final /* synthetic */ ho60 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ RecyclerView e;

    public go60(ho60 ho60Var, List list, boolean z, boolean z2, RecyclerView recyclerView) {
        this.a = ho60Var;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = recyclerView;
    }

    public final void h(RecyclerView recyclerView, int i, int i2) {
        k030 k030VarB;
        ho60 ho60Var = this.a;
        vz20 vz20Var = ho60Var.b;
        if (i2 != 0) {
            ij81 ij81Var = ho60Var.a;
            uz20 uz20Var = vz20Var.c;
            String strB = (uz20Var == null || (k030VarB = uz20Var.b()) == null) ? null : k030VarB.b();
            boolean z = this.c;
            List list = this.b;
            boolean zR = ij81Var.r(pro1.j(recyclerView, strB, list, z), recyclerView);
            vz20Var.a(new yz(!zR));
            if (zR || !this.d) {
                return;
            }
            ho60Var.a(this.e, list, ho60Var.i, false);
        }
    }
}
