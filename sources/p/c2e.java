package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface c2e {
    static /* synthetic */ Object a(c2e c2eVar, String str, ice0 ice0Var, boolean z, boolean z2, String str2, String str3, String str4, onm onmVar, int i) {
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        return c2eVar.b(str, ice0Var, z, z2, str2, str3, (i & 64) == 0, (i & 128) != 0 ? null : str4, onmVar);
    }

    Object b(String str, ice0 ice0Var, boolean z, boolean z2, String str2, String str3, boolean z3, String str4, onm onmVar);
}
