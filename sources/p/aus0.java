package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aus0 {
    public static final nma0 d = m5n1.z(new r36(m0d.Companion.serializer(), (byte) 0));
    public final Context a;
    public final nfa0 b;
    public final Observable c;

    public aus0(Context context, nfa0 nfa0Var, Observable observable) {
        this.a = context;
        this.b = nfa0Var;
        this.c = observable.map(rh20.X0).map(new hvp0((Object) this, (byte) 8));
    }
}
