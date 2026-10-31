package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class q630 implements Consumer {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ n630 b;

    public /* synthetic */ q630(boolean z, n630 n630Var) {
        this.a = z;
        this.b = n630Var;
    }

    public final void accept(Object obj) {
        r630.f(((Throwable) obj).getMessage(), this.b, this.a);
    }
}
