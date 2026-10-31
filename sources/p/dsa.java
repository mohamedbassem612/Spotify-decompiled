package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dsa implements Consumer {
    public final /* synthetic */ esa a;

    public dsa(esa esaVar) {
        this.a = esaVar;
    }

    public final void accept(Object obj) {
        ((Consumer) this.a.f.get()).accept((zoc1) obj);
    }
}
