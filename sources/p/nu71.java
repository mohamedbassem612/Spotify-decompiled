package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nu71 {
    public final Context a;
    public final Observable b;
    public final ut71 c;

    public nu71(Context context, Observable observable, ut71 ut71Var) {
        this.a = context;
        this.b = observable;
        this.c = ut71Var;
    }

    public final dma1 a(String str) {
        return this.c.b(this.a, str);
    }

    public final zo51 b() {
        return new zo51(yoi1.g(this.b), this, (byte) 18);
    }
}
