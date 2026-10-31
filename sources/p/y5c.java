package p;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y5c extends Observable {
    public final Context a;
    public final IntentFilter b;
    public final Handler c;

    public y5c(Context context, IntentFilter intentFilter, Handler handler) {
        this.a = context;
        this.b = intentFilter;
        this.c = handler;
    }

    public final void subscribeActual(Observer observer) {
        observer.onSubscribe(new x5c(observer, this.a, this.b, this.c));
    }
}
