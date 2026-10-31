package p;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bwu implements puu, quu {
    public final /* synthetic */ xab1 a;
    public final /* synthetic */ yjq b;
    public final /* synthetic */ lik1 c;
    public final /* synthetic */ i1z d;
    public final /* synthetic */ drj0 e;
    public final /* synthetic */ boolean f;

    public bwu(xab1 xab1Var, yjq yjqVar, i1z i1zVar, lik1 lik1Var, drj0 drj0Var, boolean z) {
        this.a = xab1Var;
        this.b = yjqVar;
        this.d = i1zVar;
        this.c = lik1Var;
        this.e = drj0Var;
        this.f = z;
    }

    public void a() {
        yjq yjqVar = this.b;
        ayl aylVar = (ayl) yjqVar.e;
        String str = this.d.a;
        ayl.b(aylVar, str, this.c.a, 4);
        this.e.j(str, 4, true);
        if (this.f) {
            kt91 kt91Var = (kt91) yjqVar.d;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963280});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", 2131963280, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        this.a.d((CancellationException) null);
    }

    public void b(List list) {
        lik1 lik1Var;
        yjq yjqVar = this.b;
        ayl aylVar = (ayl) yjqVar.e;
        String str = this.d.a;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            lik1Var = this.c;
            if (!zHasNext) {
                break;
            } else {
                ayl.c(aylVar, (String) it.next(), lik1Var.a, 4);
            }
        }
        ayl.c(aylVar, str, lik1Var.a, 4);
        this.e.j(str, 4, false);
        if (this.f) {
            kt91 kt91Var = (kt91) yjqVar.d;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963291});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", 2131963291, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        this.a.d((CancellationException) null);
    }

    public bwu(xab1 xab1Var, yjq yjqVar, lik1 lik1Var, i1z i1zVar, drj0 drj0Var, boolean z) {
        this.a = xab1Var;
        this.b = yjqVar;
        this.c = lik1Var;
        this.d = i1zVar;
        this.e = drj0Var;
        this.f = z;
    }
}
