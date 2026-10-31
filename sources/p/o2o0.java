package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o2o0 implements Function, j1o0 {
    public final p2o0 a;

    public /* synthetic */ o2o0(p2o0 p2o0Var) {
        this.a = p2o0Var;
    }

    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        boolean zBooleanValue = ((Boolean) ((q2o0) this.a.b).invoke()).booleanValue();
        return (!(zBooleanValue && num.intValue() == 0) && (zBooleanValue || num.intValue() != 1)) ? n2o0.c : n2o0.b;
    }

    public Single b() {
        return this.a.D().flatMap(f4x0.Y);
    }
}
