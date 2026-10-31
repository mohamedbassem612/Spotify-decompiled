package p;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dan1 {
    public h9e0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Executor f;
    public volatile yi7 g;
    public volatile yi7 h;
    public final Semaphore i;
    public final Set j;

    public dan1(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = yi7.h;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        signInHubActivity.getApplicationContext();
        this.f = threadPoolExecutor;
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        yi7 yi7Var = this.g;
        Executor executor = this.f;
        if (yi7Var.c == 1) {
            yi7Var.c = 2;
            yi7Var.a.getClass();
            executor.execute(yi7Var.b);
            return;
        }
        int iC = l1d.C(yi7Var.c);
        if (iC == 1) {
            eg.m("Cannot execute task: the task is already running.");
        } else if (iC != 2) {
            eg.m("We should never reach this state");
        } else {
            eg.m("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final boolean b() {
        if (this.g == null) {
            return false;
        }
        if (!this.b) {
            this.e = true;
        }
        yi7 yi7Var = this.h;
        yi7 yi7Var2 = this.g;
        if (yi7Var != null) {
            yi7Var2.getClass();
            this.g = null;
            return false;
        }
        yi7Var2.getClass();
        yi7 yi7Var3 = this.g;
        yi7Var3.d.set(true);
        boolean zCancel = yi7Var3.b.cancel(false);
        if (zCancel) {
            this.h = this.g;
        }
        this.g = null;
        return zCancel;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        eqr0.n(this, sb);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
