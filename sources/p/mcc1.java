package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mcc1 implements Consumer {
    public final /* synthetic */ com.spotify.mobius.functions.Consumer a;

    public mcc1(com.spotify.mobius.functions.Consumer consumer) {
        this.a = consumer;
    }

    public final void accept(Object obj) {
        this.a.accept((xcc1) obj);
    }
}
