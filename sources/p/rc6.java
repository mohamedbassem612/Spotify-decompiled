package p;

import com.spotify.player.model.PlayerError;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rc6 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BehaviorSubject b;

    public /* synthetic */ rc6(BehaviorSubject behaviorSubject, byte b) {
        this.a = b;
        this.b = behaviorSubject;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        BehaviorSubject behaviorSubject = this.b;
        switch (b) {
            case 0:
                behaviorSubject.onNext((PlayerError) obj);
                break;
            case 1:
                behaviorSubject.onNext((h06) obj);
                break;
            case 2:
                behaviorSubject.onNext((Boolean) obj);
                break;
            case 3:
                behaviorSubject.onNext((c7l) obj);
                break;
            case 4:
                behaviorSubject.onNext((Boolean) obj);
                break;
            case 5:
                behaviorSubject.onNext((Boolean) obj);
                break;
            case 6:
                behaviorSubject.onNext((Boolean) obj);
                break;
            case 7:
                behaviorSubject.onNext((e2l) obj);
                break;
            case 8:
                behaviorSubject.onNext((gvw0) obj);
                break;
            default:
                behaviorSubject.onNext((atq0) obj);
                break;
        }
    }
}
