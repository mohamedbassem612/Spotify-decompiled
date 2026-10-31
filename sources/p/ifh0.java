package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ifh0 extends p890 {
    hfh0 B(int i, int i2, Map map, iu30 iu30Var, iu30 iu30Var2);

    default hfh0 S(int i, int i2, Map map, iu30 iu30Var) {
        return B(i, i2, map, null, iu30Var);
    }
}
