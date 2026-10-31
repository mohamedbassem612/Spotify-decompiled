package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g8l implements Connectable {
    public final Observer a;
    public final Observable b;

    public g8l(Observable observable, Observer observer) {
        this.a = observer;
        this.b = observable;
    }

    @Override // com.spotify.mobius.Connectable
    public final Connection L(Consumer consumer) {
        return new cn(this.b.subscribe((io.reactivex.rxjava3.functions.Consumer) new dn(consumer, (byte) 14)), this, (byte) 10);
    }
}
