package p;

import android.content.Context;
import com.spotify.appauthorization.builtinauth.model.FieldValidator;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class olm extends xca {
    public final /* synthetic */ byte f = 1;
    public final Context g;
    public Disposable h;
    public Object i;
    public Object j;

    public olm(Context context, x610 x610Var, aos aosVar, Scheduler scheduler, ow3 ow3Var) {
        super(x610Var, aosVar);
        this.h = EmptyDisposable.a;
        this.g = context;
        this.j = scheduler;
        this.i = ow3Var;
    }

    @Override // p.xca
    public final void c() {
        switch (this.f) {
            case 0:
                this.h = ((poj0) this.i).r(this.g.getResources()).map(new eqg((byte) 8)).subscribe(new fv5(this, (byte) 1), new jld((byte) 2));
                break;
            case 1:
                this.h = new ObservableFromPublisher(this.c.a.a.J(new ifb1(this, (byte) 5)).L((Scheduler) this.j)).doOnDispose(new w43(this, (byte) 13)).subscribe(new fv5(this, (byte) 27), new jld((byte) 20));
                break;
        }
    }

    @Override // p.xca
    public final void d() {
        switch (this.f) {
            case 0:
                Disposable disposable = this.h;
                if (disposable != null && !disposable.isDisposed()) {
                    this.h.dispose();
                    break;
                }
                break;
            case 1:
                Disposable disposable2 = this.h;
                if (disposable2 != null && !disposable2.isDisposed()) {
                    this.h.dispose();
                    break;
                }
                break;
            default:
                this.h.dispose();
                break;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException */
    @Override // p.xca
    public final void e(q881 q881Var, int i) {
        switch (this.f) {
            case 0:
                qq5 qq5Var = (qq5) this.j;
                if (qq5Var != null) {
                    b(qq5Var);
                } else if (this.h == null) {
                    c();
                }
                break;
            case 1:
                xt5 xt5Var = (xt5) this.i;
                if (xt5Var != null) {
                    b(xt5Var);
                }
                break;
            default:
                n57.s("TokenSubscriptionManager called with options: ".concat(String.valueOf(q881Var)));
                au5 au5Var = (au5) ((m8b0) q881Var.b).c(au5.class, 2);
                try {
                    nhc.E(au5Var, "params");
                    List list = au5Var.c;
                    String str = au5Var.b;
                    nhc.E(str, "client_id");
                    nhc.E(list, "scopes");
                    if (list.isEmpty()) {
                        throw new FieldValidator.ValidationException("\"scopes\" can not be empty");
                    }
                    wq8 wq8Var = new wq8(str, 1, au5Var.d, new xig("", ""), UUID.randomUUID().toString(), list, false, 4032);
                    ow3 ow3Var = (ow3) this.i;
                    km3 km3Var = (km3) ow3Var.b;
                    this.h = ((yze1) km3Var.b).c().map(t9w.X).flatMap(new cp5(km3Var, (byte) 28)).flatMap(new hr8(ow3Var, this.g, wq8Var, true, (byte) 0)).onErrorReturn(new kr60(wq8Var, (byte) 25)).observeOn((Scheduler) this.j).doOnError(new jld((byte) 21)).subscribe(new ild(this, i, (byte) 1));
                } catch (FieldValidator.ValidationException e) {
                    e.getMessage();
                    a(i, new du5(e.getMessage(), null, 2));
                    this.a.remove(Integer.valueOf(i));
                }
                break;
        }
    }

    public void f(nhz nhzVar, int i) {
        a(i, new du5(nhzVar.a.toLowerCase(Locale.getDefault()), null, 2));
        this.a.remove(Integer.valueOf(i));
    }

    public olm(Context context, x610 x610Var, aos aosVar, Scheduler scheduler) {
        super(x610Var, aosVar);
        this.g = context;
        this.j = scheduler;
    }

    public olm(Context context, x610 x610Var, aos aosVar, poj0 poj0Var) {
        super(x610Var, aosVar);
        this.g = context;
        this.i = poj0Var;
    }

    private final void g() {
    }
}
