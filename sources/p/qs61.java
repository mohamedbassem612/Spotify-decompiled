package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qs61 implements Connectable, Consumer {
    public final PublishSubject a = new PublishSubject();

    public final Connection L(Consumer consumer) {
        return new n1b0(this.a.subscribe(new k1p0(consumer, (byte) 9)), (byte) 28);
    }

    public final void accept(Object obj) {
        this.a.onNext(new wp61((tr80) obj));
    }
}
