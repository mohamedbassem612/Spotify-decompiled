package p;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q141 implements Observer {
    public Disposable a;
    public Object b;
    public boolean c;
    public final /* synthetic */ ohd d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public q141(ohd ohdVar, int i, Object obj) {
        this.d = ohdVar;
        this.e = i;
        this.f = obj;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        boolean z = this.c;
        ohd ohdVar = this.d;
        if (z) {
            if (ohdVar.s() instanceof ago0) {
                ohdVar.resumeWith(this.b);
                return;
            }
            return;
        }
        int i = this.e;
        if (i == 2) {
            ohdVar.resumeWith(this.f);
        } else if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(new m231(new NoSuchElementException("No value received via onNext for ".concat(cfm0.t(i)))));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        this.d.resumeWith(new m231(th));
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        int i = this.e;
        int iC = l1d.C(i);
        ohd ohdVar = this.d;
        if (iC == 0 || iC == 1) {
            if (this.c) {
                return;
            }
            this.c = true;
            ohdVar.resumeWith(obj);
            Disposable disposable = this.a;
            if (disposable != null) {
                disposable.dispose();
                return;
            } else {
                u890.C("subscription");
                throw null;
            }
        }
        if (iC != 2 && iC != 3) {
            eg.o();
            return;
        }
        if (i != 4 || !this.c) {
            this.b = obj;
            this.c = true;
            return;
        }
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(new m231(new IllegalArgumentException("More than one onNext value for ".concat(cfm0.t(i)))));
        }
        Disposable disposable2 = this.a;
        if (disposable2 != null) {
            disposable2.dispose();
        } else {
            u890.C("subscription");
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        this.a = disposable;
        this.d.n(new gqb0(disposable, (byte) 15));
    }
}
