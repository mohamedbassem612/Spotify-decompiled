package p;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class kf40 extends t8 implements Serializable {
    public static hf40 e(t8 t8Var, t8 t8Var2, int i, lul1 lul1Var, Class cls) {
        return new hf40(t8Var, Collections.EMPTY_LIST, t8Var2, new ff40(i, lul1Var, true), cls);
    }

    public static hf40 f(t8 t8Var, Object obj, t8 t8Var2, int i, lul1 lul1Var, Class cls) {
        return new hf40(t8Var, obj, t8Var2, new ff40(i, lul1Var, false), cls);
    }
}
