package p;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ui2 implements byf0 {
    public final ri2 a;
    public final e4b1 b;
    public final llm c;
    public faa0 d;

    public ui2(ri2 ri2Var, q8n q8nVar, e4b1 e4b1Var) {
        this.a = ri2Var;
        this.b = e4b1Var;
        this.c = smo1.e(q8nVar);
    }

    public final void c() {
        faa0 faa0Var = this.d;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.d = c921.y(this.c, (o8n) null, 0, new qm(this, (lnm) null, (byte) 14), 3);
    }

    public final void d() {
        faa0 faa0Var = this.d;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
    }

    public final void g(ViewGroup viewGroup) {
    }
}
