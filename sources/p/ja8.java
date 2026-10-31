package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ja8 {
    public final lzn0 a;

    public ja8(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    public final void a(String str) {
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("showUri", str)});
        this.a.i(new dwn0("spotify:internal:audiobook:hyde", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundleH);
    }
}
