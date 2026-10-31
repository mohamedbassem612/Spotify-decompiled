package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface a6z {
    static /* synthetic */ Observable a(a6z a6zVar, String str, String str2, Map map, lik1 lik1Var, r6z r6zVar, cee ceeVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        return ((q6z) a6zVar).k(str, str2, map, lik1Var, r6zVar);
    }
}
