package p;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d9n1 extends n8n1 {
    public final asd1 b;
    public final bsd1 c;
    public final s9x0 d;

    public d9n1(int i, asd1 asd1Var, bsd1 bsd1Var, s9x0 s9x0Var) {
        super(i);
        this.c = bsd1Var;
        this.b = asd1Var;
        this.d = s9x0Var;
        if (i == 2 && asd1Var.h()) {
            hhg1.n("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // p.g9n1
    public final void a(Status status) {
        this.d.getClass();
        this.c.c(s9x0.b(status));
    }

    @Override // p.g9n1
    public final void b(Exception exc) {
        this.c.c(exc);
    }

    @Override // p.g9n1
    public final void c(frl1 frl1Var, boolean z) {
        frl1Var.j(this.c, z);
    }

    @Override // p.g9n1
    public final void d(h8n1 h8n1Var) throws DeadObjectException {
        bsd1 bsd1Var = this.c;
        try {
            this.b.c(h8n1Var.l, bsd1Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(g9n1.e(e2));
        } catch (RuntimeException e3) {
            bsd1Var.c(e3);
        }
    }

    @Override // p.n8n1
    public final pl10[] f(h8n1 h8n1Var) {
        return this.b.i();
    }

    @Override // p.n8n1
    public final boolean g(h8n1 h8n1Var) {
        return this.b.h();
    }

    @Override // p.n8n1
    public final int h(h8n1 h8n1Var) {
        return this.b.j();
    }
}
