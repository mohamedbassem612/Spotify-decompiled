package p;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r741 implements byf0 {
    public final l6s a;
    public final boolean b;
    public final q8n c;
    public xab1 d;

    public r741(l6s l6sVar, boolean z, q8n q8nVar) {
        this.a = l6sVar;
        this.b = z;
        this.c = q8nVar;
    }

    public final void c() {
        if (this.b && this.d == null) {
            this.d = fn31.T(smo1.e(flo1.l(guo1.B(), this.c)), (o8n) null, 0, new ic01(this, (lnm) null, (byte) 22), 3);
        }
    }

    public final void d() {
        xab1 xab1Var = this.d;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.d = null;
    }

    public final void g(ViewGroup viewGroup) {
    }
}
