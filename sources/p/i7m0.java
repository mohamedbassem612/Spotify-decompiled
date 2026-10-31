package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i7m0 implements Consumer {
    public final /* synthetic */ j7m0 a;

    public i7m0(j7m0 j7m0Var) {
        this.a = j7m0Var;
    }

    public final void accept(Object obj) {
        com.spotify.mobius.functions.Consumer consumer = this.a.g;
        if (consumer != null) {
            consumer.accept(vuy0.a);
        } else {
            u890.C("eventConsumer");
            throw null;
        }
    }
}
