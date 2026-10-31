package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ck20 {
    public final Context a;
    public final ut71 b;
    public final Observable c;

    public ck20(Context context, Observable observable, ut71 ut71Var) {
        this.a = context;
        this.b = ut71Var;
        this.c = observable.filter(e710.c).map(new mjv(this, (byte) 15));
    }

    public final Completable a() {
        return this.c.take(1L).flatMapCompletable(d710.c);
    }
}
