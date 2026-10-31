package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tn implements View.OnClickListener {
    public final /* synthetic */ un a;
    public final /* synthetic */ int b;
    public final /* synthetic */ n5 c;
    public final /* synthetic */ q8i1 d;

    public tn(un unVar, int i, n5 n5Var, q8i1 q8i1Var) {
        this.a = unVar;
        this.b = i;
        this.c = n5Var;
        this.d = q8i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strH = this.a.W0.h(new lu80(this.b));
        q8i1 q8i1Var = this.d;
        this.c.invoke(new ln(q8i1Var.b, q8i1Var.c, strH));
    }
}
