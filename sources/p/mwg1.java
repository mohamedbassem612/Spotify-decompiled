package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mwg1 extends q790 {
    public final /* synthetic */ byte c = 1;
    public final /* synthetic */ nwg1 d;
    public final Object e;

    public mwg1(nwg1 nwg1Var, Callable callable) {
        this.d = nwg1Var;
        callable.getClass();
        this.e = callable;
    }

    @Override // p.q790
    public final void a(Throwable th) {
        byte b = this.c;
        nwg1 nwg1Var = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                nwg1Var.v(th);
                break;
            default:
                nwg1Var.v(th);
                break;
        }
    }

    @Override // p.q790
    public final void b(Object obj) {
        byte b = this.c;
        nwg1 nwg1Var = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                nwg1Var.w((n8d0) obj);
                break;
            default:
                nwg1Var.u(obj);
                break;
        }
    }

    @Override // p.q790
    public final boolean d() {
        byte b = this.c;
        nwg1 nwg1Var = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return nwg1Var.isDone();
    }

    @Override // p.q790
    public final Object e() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uh7 uh7Var = (uh7) obj;
                n8d0 n8d0VarCall = uh7Var.call();
                dm5.t("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", n8d0VarCall, uh7Var);
                return n8d0VarCall;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // p.q790
    public final String f() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((uh7) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    public mwg1(nwg1 nwg1Var, uh7 uh7Var) {
        this.d = nwg1Var;
        this.e = uh7Var;
    }
}
