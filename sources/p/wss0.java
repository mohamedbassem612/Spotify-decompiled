package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wss0 implements rhh0 {
    public final dts0 a;

    public wss0(dts0 dts0Var) {
        this.a = dts0Var;
    }

    public final Observable a(r9c r9cVar) {
        return this.a.e(r9cVar, 1);
    }

    public final Single b(r9c r9cVar) {
        return this.a.d(r9cVar, 1).map(fj10.W0);
    }
}
