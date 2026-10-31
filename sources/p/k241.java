package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k241 {
    public final Observable a;
    public final kdn0 b;
    public Disposable c;
    public final boolean d;
    public final boolean e;

    public k241(Observable observable, boolean z, boolean z2) {
        dj20.p();
        this.b = new kdn0(k5e0.a);
        this.a = observable;
        this.d = z;
        this.e = z2;
    }

    public final synchronized void a() {
        if (this.c != null) {
            throw new IllegalStateException("Loader is already running.");
        }
        this.c = this.a.subscribe((Consumer) new fv5(this, (byte) 17));
    }

    public final synchronized void b() {
        c();
    }

    public final void c() {
        Disposable disposable = this.c;
        if (disposable == null) {
            eg.m("This loader has already been stopped.");
            return;
        }
        disposable.dispose();
        this.c = null;
        if (this.d) {
            dj20.p();
            this.b.j(k5e0.a);
        }
    }
}
