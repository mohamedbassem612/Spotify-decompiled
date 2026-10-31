package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class uvc0 implements Supplier {
    public final /* synthetic */ vvc0 a;
    public final /* synthetic */ Completable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ hlr0 e;

    public /* synthetic */ uvc0(vvc0 vvc0Var, Completable completable, String str, boolean z, hlr0 hlr0Var) {
        this.a = vvc0Var;
        this.b = completable;
        this.c = str;
        this.d = z;
        this.e = hlr0Var;
    }

    public final Object get() {
        vvc0 vvc0Var = this.a;
        fkv fkvVar = (fkv) vvc0Var.i.get();
        Observable observableA = don1.z(fkvVar.b()).replay(1).a(1);
        String str = this.c;
        return this.b.e(vvc0Var.c(str, this.d, this.e)).flatMap(new tws(vvc0Var, str, fkvVar, observableA, (byte) 2)).doFinally(new w43(fkvVar, (byte) 7));
    }
}
