package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jtp0 implements rhh0 {
    public final mwm1 a;
    public final e821 b;
    public final Observable c;

    public jtp0(mwm1 mwm1Var, e821 e821Var, Observable observable) {
        this.a = mwm1Var;
        this.b = e821Var;
        this.c = observable;
    }

    @Override // p.w310
    public final Observable a(r9c r9cVar) {
        return Observable.combineLatest(c(ksm1.d), c(ksm1.b), c(ksm1.e), o810.U0);
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        return Single.zip(d(ksm1.d), d(ksm1.b), d(ksm1.e), e710.U0);
    }

    public final Observable c(ksm1 ksm1Var) {
        return this.c.map(new mre0(ksm1Var, (byte) 22)).switchMap(new qkn0(this, (byte) 8)).map(new ewn0(this, (byte) 11));
    }

    public final Single d(ksm1 ksm1Var) {
        return this.c.map(new mre0(ksm1Var, (byte) 22)).switchMap(new e5l0(this, (byte) 15)).filter(yb10.U0).firstOrError().map(new zud0(this, (byte) 27));
    }
}
