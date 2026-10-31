package p;

import com.spotify.player.model.PlayerError;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qc6 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ObservableEmitter b;

    public /* synthetic */ qc6(ObservableEmitter observableEmitter, byte b) {
        this.a = b;
        this.b = observableEmitter;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ObservableEmitter observableEmitter = this.b;
        switch (b) {
            case 0:
                observableEmitter.onNext((PlayerError) obj);
                break;
            case 1:
                observableEmitter.onNext((Set) obj);
                break;
            case 2:
                observableEmitter.onNext(obj);
                break;
            default:
                observableEmitter.tryOnError((Throwable) obj);
                break;
        }
    }
}
