package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w6o0 implements w310 {
    public final rhh0 a;
    public final w310 b;
    public final iu30 c;

    public w6o0(rhh0 rhh0Var, w310 w310Var, int i) {
        dt3 dt3Var = (i & 4) != 0 ? null : dt3.O0;
        this.a = rhh0Var;
        this.b = w310Var;
        this.c = dt3Var;
    }

    public final Observable a(r9c r9cVar) {
        Observable map;
        if (!r9cVar.g) {
            return this.b.a(r9cVar);
        }
        Observable observableA = this.a.a(r9cVar);
        iu30 iu30Var = this.c;
        return (iu30Var == null || (map = observableA.map(new ze3(iu30Var, (byte) 2))) == null) ? observableA : map;
    }

    public final Single b(r9c r9cVar) {
        Single map;
        if (!r9cVar.g) {
            return this.b.b(r9cVar);
        }
        Single singleB = this.a.b(r9cVar);
        iu30 iu30Var = this.c;
        return (iu30Var == null || (map = singleB.map(new mqr(iu30Var))) == null) ? singleB : map;
    }
}
