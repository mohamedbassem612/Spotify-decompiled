package p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class md7 implements Consumer {
    public final PublishSubject a;
    public final PublishSubject b;

    public md7() {
        PublishSubject publishSubject = new PublishSubject();
        this.a = publishSubject;
        this.b = publishSubject;
    }

    public final void accept(Object obj) {
        this.a.onNext((ld7) obj);
    }
}
