package p;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class th41 implements ihr0 {
    public final cir0 a;
    public final lzn0 b;
    public tv80 c;

    public th41(cir0 cir0Var, lzn0 lzn0Var) {
        this.a = cir0Var;
        this.b = lzn0Var;
    }

    public final boolean b(ehr0 ehr0Var) {
        if (!(ehr0Var instanceof wh0)) {
            return false;
        }
        Intent intent = ((wh0) ehr0Var).a;
        String stringExtra = intent != null ? intent.getStringExtra("com.spotify.scannables.scannables.RESULT") : null;
        if (stringExtra != null) {
            Bundle bundleG = pzm.g("from_scannable", true);
            tv80 tv80Var = this.c;
            if (tv80Var != null) {
                this.b.a(stringExtra, tv80Var, bundleG);
            }
        }
        return true;
    }
}
