package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yra implements Consumer {
    public final /* synthetic */ esa a;

    public yra(esa esaVar) {
        this.a = esaVar;
    }

    public final void accept(Object obj) {
        ((Consumer) this.a.g.get()).accept((zjb0) obj);
    }
}
