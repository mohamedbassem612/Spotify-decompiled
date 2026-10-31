package p;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y0b0 implements byf0, qyo0 {
    public final d1b0 a;
    public xab1 b;
    public final llm c;

    public y0b0(d1b0 d1b0Var, q8n q8nVar) {
        this.a = d1b0Var;
        this.c = smo1.e(q8nVar);
    }

    public final void c() {
        xab1 xab1Var = this.b;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.b = fn31.T(this.c, (o8n) null, 0, new no70(this, (lnm) null, (byte) 18), 3);
    }

    public final void d() {
        xab1 xab1Var = this.b;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.b = null;
    }

    public final void g(ViewGroup viewGroup) {
    }
}
