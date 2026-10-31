package p;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yia implements Disposable, Predicate {
    public final Observer a;
    public final zia b;
    public boolean c;
    public boolean d;
    public mgc e;
    public boolean f;
    public volatile boolean g;
    public long h;

    public yia(Observer observer, zia ziaVar) {
        this.a = observer;
        this.b = ziaVar;
    }

    public void dispose() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.f(this);
    }

    public boolean isDisposed() {
        return this.g;
    }

    public final boolean test(Object obj) {
        if (this.g) {
            return false;
        }
        this.a.onNext(obj);
        return false;
    }
}
