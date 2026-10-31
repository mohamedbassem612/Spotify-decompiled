package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class od3 {
    public final tzx a;
    public final kt91 b;
    public final q8n c;

    public od3(tzx tzxVar, kt91 kt91Var, q8n q8nVar) {
        this.a = tzxVar;
        this.b = kt91Var;
        this.c = q8nVar;
    }

    public final void a(int i) {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        kt91 kt91Var = this.b;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }
}
