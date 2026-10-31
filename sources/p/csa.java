package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class csa implements Consumer {
    public final /* synthetic */ esa a;

    public csa(esa esaVar) {
        this.a = esaVar;
    }

    public final void accept(Object obj) {
        ((Consumer) this.a.d.get()).accept((w2d1) obj);
    }
}
