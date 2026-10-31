package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qra implements Consumer {
    public final /* synthetic */ esa a;

    public qra(esa esaVar) {
        this.a = esaVar;
    }

    public final void accept(Object obj) {
        ((Consumer) this.a.e.get()).accept((ysa) obj);
    }
}
