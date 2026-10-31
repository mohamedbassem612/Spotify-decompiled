package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ezh1 {
    public final lzn0 a;

    public ezh1(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    public final void a(dzh1 dzh1Var, tv80 tv80Var, boolean z) {
        this.a.a("spotify:internal:cultural-moment:upsell", tv80Var, mno1.h(new mmr0[]{new mmr0("upsell_content", dzh1Var), new mmr0("use_simplified_design", Boolean.valueOf(z))}));
    }

    public final void b(dzh1 dzh1Var, boolean z) {
        this.a.i(new dwn0("spotify:internal:cultural-moment:upsell", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), mno1.h(new mmr0[]{new mmr0("upsell_content", dzh1Var), new mmr0("use_simplified_design", Boolean.valueOf(z))}));
    }
}
