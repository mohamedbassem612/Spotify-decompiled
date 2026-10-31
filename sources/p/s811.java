package p;

import java.util.function.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s811 implements BiFunction {
    public final /* synthetic */ jh5 a;
    public final /* synthetic */ l811 b;

    public s811(jh5 jh5Var, l811 l811Var) {
        this.a = jh5Var;
        this.b = l811Var;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        r811 r811Var = (r811) obj2;
        if (r811Var == null) {
            eg.h("The key ", this.a, " is not active");
            return null;
        }
        if (r811Var.a.decrementAndGet() != 0) {
            return r811Var;
        }
        this.b.a = true;
        return null;
    }
}
