package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class le7 extends x7e0 implements b031 {
    public final rd7 d;
    public final Scheduler e;
    public final ld7 f;
    public sd7 i;
    public final rku g = new rku();
    public final BehaviorSubject h = BehaviorSubject.f();
    public final idd1 t = new idd1(new i26(this, (byte) 14));

    public le7(rd7 rd7Var, Scheduler scheduler, ld7 ld7Var) {
        this.d = rd7Var;
        this.e = scheduler;
        this.f = ld7Var;
    }

    public final void a(Bundle bundle) {
        sd7 sd7Var = this.i;
        if (sd7Var == null) {
            ie7 ie7Var = (ie7) bundle.getParcelable("AssistedCurationSearchLoadableResource");
            sd7Var = ie7Var != null ? new sd7(ie7Var.a, ie7Var.b, ie7Var.c, ie7Var.d, ie7Var.e, 1134) : null;
        }
        this.i = sd7Var;
    }

    public final void e() {
        this.g.b(((Observable) this.t.getValue()).distinctUntilChanged().subscribe(new je7(this, (byte) 1)));
    }

    public final void f() {
        this.g.a();
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        sd7 sd7Var = this.i;
        bundle.putParcelable("AssistedCurationSearchLoadableResource", sd7Var != null ? new ie7(sd7Var.a, sd7Var.e, sd7Var.h, sd7Var.i, sd7Var.t) : null);
        return bundle;
    }
}
