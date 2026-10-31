package p;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface bq11 {
    static /* synthetic */ Serializable c(bq11 bq11Var, String str, String str2, List list, String str3, Long l, wp11 wp11Var, boolean z, onm onmVar, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            wp11Var = new wp11();
        }
        if ((i & 128) != 0) {
            z = false;
        }
        return ((op11) bq11Var).f(str, str2, list, str3, null, l, wp11Var, z, onmVar);
    }
}
