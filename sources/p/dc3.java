package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dc3 implements qhv0 {
    public final iyc0 a;
    public final Completable b;

    public dc3(String str, o241 o241Var, iyc0 iyc0Var, rh11 rh11Var) {
        this.a = iyc0Var;
        this.b = ((p241) o241Var).a.distinctUntilChanged().take(1L).flatMapCompletable(new gid(this, str, (byte) 28));
    }

    public final Object a(lnm lnmVar) {
        Object objI = fc11.i(this.b, lnmVar);
        return objI == d9n.a ? objI : rih1.a;
    }
}
