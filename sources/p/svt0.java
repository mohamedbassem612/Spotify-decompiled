package p;

import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class svt0 implements Supplier {
    public final /* synthetic */ tvt0 a;
    public final /* synthetic */ hkt0 b;

    public svt0(tvt0 tvt0Var, hkt0 hkt0Var) {
        this.a = tvt0Var;
        this.b = hkt0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return tvt0.d(this.a, this.b);
    }
}
