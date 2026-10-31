package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hup implements m8b, imf0 {
    public final nwp a;

    public jmf0 a(p2p0 p2p0Var, Flowable flowable, PublishProcessor publishProcessor) {
        return new wtp(this.a, flowable, publishProcessor);
    }

    public n8b create() {
        return new iup(this.a);
    }
}
