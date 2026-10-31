package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q050 implements Consumer {
    public final /* synthetic */ com.spotify.mobius.functions.Consumer a;

    public q050(com.spotify.mobius.functions.Consumer consumer) {
        this.a = consumer;
    }

    public final void accept(Object obj) {
        this.a.accept((n050) obj);
    }
}
