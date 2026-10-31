package p;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a9n1 extends n8n1 {
    public final bsd1 b;
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a9n1(c9d0 c9d0Var, bsd1 bsd1Var) {
        this(4, bsd1Var);
        this.c = (byte) 1;
        this.d = c9d0Var;
    }

    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    public final void b(Exception exc) {
        this.b.c(exc);
    }

    public final /* bridge */ /* synthetic */ void c(frl1 frl1Var, boolean z) {
        byte b = this.c;
    }

    public final void d(h8n1 h8n1Var) throws DeadObjectException {
        try {
            k(h8n1Var);
        } catch (DeadObjectException e) {
            a(g9n1.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(g9n1.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    public final pl10[] f(h8n1 h8n1Var) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (pl10[]) ((r8n1) obj).a.d;
            default:
                r8n1 r8n1Var = (r8n1) h8n1Var.p.get((c9d0) obj);
                if (r8n1Var == null) {
                    return null;
                }
                return (pl10[]) r8n1Var.a.d;
        }
    }

    public final boolean g(h8n1 h8n1Var) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((r8n1) obj).a.a;
            default:
                r8n1 r8n1Var = (r8n1) h8n1Var.p.get((c9d0) obj);
                return r8n1Var != null && r8n1Var.a.a;
        }
    }

    public final int h(h8n1 h8n1Var) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((r8n1) obj).a.b;
            default:
                r8n1 r8n1Var = (r8n1) h8n1Var.p.get((c9d0) obj);
                if (r8n1Var != null) {
                    return r8n1Var.a.b;
                }
                return -1;
        }
    }

    public final void k(h8n1 h8n1Var) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                r8n1 r8n1Var = (r8n1) this.d;
                lne lneVar = r8n1Var.a;
                lneVar.d(h8n1Var.l, this.b);
                c9d0 c9d0Var = (c9d0) ((dbm) lneVar.c).b;
                if (c9d0Var != null) {
                    h8n1Var.p.put(c9d0Var, r8n1Var);
                }
                break;
            default:
                r8n1 r8n1Var2 = (r8n1) h8n1Var.p.remove((c9d0) this.d);
                if (r8n1Var2 == null) {
                    this.b.d(Boolean.FALSE);
                } else {
                    ((nf11) r8n1Var2.b.c).b.accept(h8n1Var.l, this.b);
                    ((dbm) r8n1Var2.a.c).b = null;
                }
                break;
        }
    }

    public a9n1(int i, bsd1 bsd1Var) {
        super(i);
        this.b = bsd1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a9n1(r8n1 r8n1Var, bsd1 bsd1Var) {
        this(3, bsd1Var);
        this.c = (byte) 0;
        this.d = r8n1Var;
    }

    private final /* bridge */ /* synthetic */ void i(frl1 frl1Var, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(frl1 frl1Var, boolean z) {
    }
}
