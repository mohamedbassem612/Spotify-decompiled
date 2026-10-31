package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b9y {
    public final a1r0 a;

    public b9y(a1r0 a1r0Var) {
        this.a = a1r0Var;
    }

    public final void a(long j, String str, String str2, ArrayList arrayList) {
        a1r0.j(this.a, "spotify:internal:enhanced-share-card", (String) null, mno1.h(new mmr0[]{new mmr0("trackURI", str), new mmr0("timestamp", Long.valueOf(j)), new mmr0("cacheId", str2), new mmr0("selectedLineIndices", arrayList)}), true, 2);
    }
}
