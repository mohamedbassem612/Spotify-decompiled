package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tbl implements Function {
    public final kly0 a;
    public final kly0 b;

    public /* synthetic */ tbl(kly0 kly0Var, kly0 kly0Var2) {
        this.a = kly0Var;
        this.b = kly0Var2;
    }

    public Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? (b691) this.a.get() : (b691) this.b.get();
    }
}
