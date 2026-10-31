package p;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mam0 implements Observer {
    public final Observer a;
    public final /* synthetic */ nam0 b;

    public mam0(nam0 nam0Var, Observer observer) {
        this.b = nam0Var;
        this.a = observer;
    }

    public final void onComplete() {
        this.a.onError(new IllegalStateException(f4i1.f("Source of ", this.b.b.a, " has completed unexpectedly.")));
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    public final void onNext(Object obj) {
        an41 an41Var = (cn41) obj;
        sam0 sam0Var = this.b.b;
        if (an41Var instanceof an41) {
            sam0Var.i.a(new dam0(an41Var));
        } else if (an41Var.equals(bn41.a)) {
            sam0Var.i.a(eam0.a);
        } else {
            eg.o();
        }
    }

    public final void onSubscribe(Disposable disposable) {
        sam0 sam0Var = this.b.b;
        MobiusLoop mobiusLoop = sam0Var.i;
        Observer observer = this.a;
        mobiusLoop.a(new iam0(observer));
        observer.onSubscribe(Disposable.d(new tt60(sam0Var, disposable, (byte) 7)));
    }
}
