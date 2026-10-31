package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lkb0 implements i570 {
    public final lzn0 a;
    public final i8h1 b;
    public final g341 c;
    public final c4n0 d;
    public final Scheduler e;
    public final vku f = new vku();

    public lkb0(iac0 iac0Var, lzn0 lzn0Var, i8h1 i8h1Var, g341 g341Var, c4n0 c4n0Var, Scheduler scheduler) {
        this.a = lzn0Var;
        this.b = i8h1Var;
        this.c = g341Var;
        this.d = c4n0Var;
        this.e = scheduler;
        iac0Var.getLifecycle().a(new kkb0(this, iac0Var));
    }

    public final void a(j570 j570Var, u570 u570Var) {
        String strB = ((sc70) j570Var).a().B("uri");
        if (strB == null) {
            return;
        }
        this.f.a(this.c.b(Uri.parse(strB)).map(ud20.i).observeOn(this.e).doOnSuccess(new qg7(this, u570Var, strB, (byte) 14)).subscribe(k530.T0, k530.U0));
    }
}
