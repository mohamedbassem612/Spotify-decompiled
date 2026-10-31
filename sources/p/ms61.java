package p;

import android.os.Bundle;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Observable;
import spotify.autodownload.esperanto.proto.EnabledShowsCountRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ms61 extends gs61 implements b031 {
    public static final tr80 i;
    public final fs61 d;
    public final nr61 e;
    public is61 f;
    public final rku g = new rku();
    public MobiusLoop.Controller h;

    static {
        tr61.a.getClass();
        i = new tr80(0, sr61.b.a, 1);
    }

    public ms61(fs61 fs61Var, nr61 nr61Var) {
        this.d = fs61Var;
        this.e = nr61Var;
    }

    public final void a(Bundle bundle) {
        this.f = (is61) bundle.getParcelable("SettingsPageLoadableResourceImpl.savedState");
    }

    public final void e() {
        if (this.h != null) {
            j();
            i();
            return;
        }
        is61 is61Var = this.f;
        tr80 tr80Var = is61Var != null ? new tr80(is61Var.a, is61Var.b, 1) : i;
        nr61 nr61Var = this.e;
        nt8 nt8Var = nr61Var.a;
        Observable observableC = nt8Var.c();
        mt8 mt8Var = nt8Var.a;
        fax faxVarO = EnabledShowsCountRequest.o();
        faxVarO.n();
        this.g.b(Observable.combineLatest(observableC, mt8Var.a(faxVarO.build()).map(b6j0.i), nt8Var.b(tr80Var), Observable.combineLatest(nr61Var.d, nr61Var.b.distinctUntilChanged(), nr61Var.c.distinctUntilChanged(), ybx0.X).distinctUntilChanged(), hcx0.X).firstOrError().map(new js61(this)).doOnSubscribe(new ks61(this, (byte) 0)).subscribe(new ls61(this), new ks61(this, (byte) 1)));
    }

    public final void f() {
        this.g.a();
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        MobiusLoop.Controller controller = this.h;
        if (controller == null) {
            return bundle;
        }
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        tr80 tr80Var = ((mr61) controller.a()).d.c;
        bundle.putParcelable("SettingsPageLoadableResourceImpl.savedState", new is61(((rr80) tr80Var).a, ((rr80) tr80Var).b));
        return bundle;
    }
}
