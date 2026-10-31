package p;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w8n1 extends g9n1 {
    public final jan1 b;

    public w8n1(int i, jan1 jan1Var) {
        super(i);
        this.b = jan1Var;
    }

    @Override // p.g9n1
    public final void a(Status status) {
        try {
            this.b.n(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // p.g9n1
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.n(new Status(10, l1d.q(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // p.g9n1
    public final void c(frl1 frl1Var, boolean z) {
        frl1Var.i(this.b, z);
    }

    @Override // p.g9n1
    public final void d(h8n1 h8n1Var) {
        try {
            this.b.m(h8n1Var.l);
        } catch (RuntimeException e) {
            b(e);
        }
    }
}
