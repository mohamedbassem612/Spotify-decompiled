package p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yf7 implements Consumer {
    public final PublishSubject a = new PublishSubject();

    public final void accept(Object obj) {
        this.a.onNext((xf7) obj);
    }
}
