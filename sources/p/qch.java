package p;

import com.google.android.gms.internal.meet_coactivities.zzdl;
import com.google.android.gms.internal.meet_coactivities.zzfe;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qch extends q790 {
    public final Executor c;
    public final /* synthetic */ rch d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ rch f;
    public final Object g;

    public qch(rch rchVar, Object obj, Executor executor, byte b) {
        this.e = b;
        this.f = rchVar;
        this.d = rchVar;
        executor.getClass();
        this.c = executor;
        this.g = obj;
    }

    @Override // p.q790
    public final void a(Throwable th) {
        rch rchVar = this.d;
        rchVar.i = null;
        if (th instanceof ExecutionException) {
            rchVar.v(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            rchVar.cancel(false);
        } else {
            rchVar.v(th);
        }
    }

    @Override // p.q790
    public final void b(Object obj) {
        this.d.i = null;
        byte b = this.e;
        rch rchVar = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                rchVar.w((n8d0) obj);
                break;
            default:
                rchVar.u(obj);
                break;
        }
    }

    @Override // p.q790
    public final boolean d() {
        return this.d.isDone();
    }

    @Override // p.q790
    public final Object e() {
        byte b = this.e;
        Object obj = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                zzdl zzdlVar = (zzdl) obj;
                n8d0 n8d0VarCall = zzdlVar.call();
                dm5.t("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", n8d0VarCall, zzdlVar);
                return n8d0VarCall;
            default:
                return ((zzfe) obj).call();
        }
    }

    @Override // p.q790
    public final String f() {
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((zzdl) this.g).toString();
            default:
                return ((zzfe) this.g).toString();
        }
    }
}
