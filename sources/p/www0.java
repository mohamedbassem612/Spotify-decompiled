package p;

import android.content.Context;
import com.spotify.profile.completionsheetimpl.ProfileCompletionNotShownException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class www0 {
    public final Context a;
    public final Scheduler b;
    public final Scheduler c;
    public final v5n d;
    public final yww0 e;
    public final Observable f;
    public final b0x0 g;
    public final gdx0 h;

    public www0(Context context, Scheduler scheduler, Scheduler scheduler2, v5n v5nVar, yww0 yww0Var, Observable observable, b0x0 b0x0Var, gdx0 gdx0Var) {
        this.a = context;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = v5nVar;
        this.e = yww0Var;
        this.f = observable;
        this.g = b0x0Var;
        this.h = gdx0Var;
    }

    public final Single a(vww0 vww0Var) {
        return this.e.a(wgo1.t(vww0Var.a())).doOnError(xfs0.a1).map(new l1p0(vww0Var, (byte) 25)).onErrorReturn(aj20.e1).filter(bj20.e1).k(Single.error((Throwable) new ProfileCompletionNotShownException(vww0Var.a()))).ignoreElement().e(this.f.firstOrError()).flatMap(new uip0(this, (byte) 21)).subscribeOn(this.c).observeOn(this.b).flatMap(new yeu0(this, vww0Var, (byte) 21)).onErrorReturnItem(wzw0.c);
    }
}
