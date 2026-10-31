package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface h971 {
    static /* synthetic */ Object a(h971 h971Var, s4b1 s4b1Var, boolean z, String str, onm onmVar, int i) {
        int i2 = (i & 2) != 0 ? -1 : 12;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        return ((s971) h971Var).e(s4b1Var, i2, z, str, onmVar);
    }
}
