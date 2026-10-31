package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface m0i {
    default Object a(Class cls) {
        return d(lzy0.a(cls));
    }

    lly0 b(lzy0 lzy0Var);

    default Set c(lzy0 lzy0Var) {
        return (Set) b(lzy0Var).get();
    }

    default Object d(lzy0 lzy0Var) {
        lly0 lly0VarE = e(lzy0Var);
        if (lly0VarE == null) {
            return null;
        }
        return lly0VarE.get();
    }

    lly0 e(lzy0 lzy0Var);

    aqq0 f(lzy0 lzy0Var);

    default lly0 g(Class cls) {
        return e(lzy0.a(cls));
    }
}
