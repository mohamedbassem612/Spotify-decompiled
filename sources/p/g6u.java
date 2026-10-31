package p;

import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g6u implements Function0 {
    public final gfr a;
    public final hce1 b;
    public final ffr c;
    public final iov0 d;

    public g6u(gfr gfrVar, hce1 hce1Var, ffr ffrVar, iov0 iov0Var) {
        this.a = gfrVar;
        this.b = hce1Var;
        this.c = ffrVar;
        this.d = iov0Var;
    }

    public final Object invoke() {
        return ((Observable) this.a.invoke()).distinctUntilChanged().switchMapCompletable(new sun((Object) this, (byte) 26));
    }
}
