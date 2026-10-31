package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wd30 {
    public final BehaviorSubject a;

    public wd30(Context context) {
        this.a = BehaviorSubject.g(0L);
        Observable.interval(3L, TimeUnit.SECONDS);
    }
}
