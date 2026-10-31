package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class tvc0 implements Supplier {
    public final /* synthetic */ vvc0 a;
    public final /* synthetic */ Completable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ hlr0 e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ tvc0(vvc0 vvc0Var, Completable completable, String str, boolean z, hlr0 hlr0Var, boolean z2) {
        this.a = vvc0Var;
        this.b = completable;
        this.c = str;
        this.d = z;
        this.e = hlr0Var;
        this.f = z2;
    }

    public final Object get() {
        vvc0 vvc0Var = this.a;
        fkv fkvVar = (fkv) vvc0Var.i.get();
        ObservableRefCount observableRefCountF = don1.z(fkvVar.b()).replay(1).f();
        String str = this.c;
        return this.b.d(vvc0Var.c(str, this.d, this.e).toObservable()).flatMap(new tws(vvc0Var, str, fkvVar, observableRefCountF, (byte) 1)).switchMap(new s7s(vvc0Var, this.f, (byte) 4)).doFinally(new w43(fkvVar, (byte) 7));
    }
}
