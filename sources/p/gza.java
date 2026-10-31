package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gza {
    public final lzn0 a;

    public void a(String str, tv80 tv80Var) {
        String str2 = nik1.q6.a + "?uri=" + Uri.encode(str) + "&config=edit";
        lzn0 lzn0Var = this.a;
        if (tv80Var != null) {
            lzn0Var.a(str2, tv80Var, (Bundle) null);
        } else {
            lzn0Var.h(str2);
        }
    }
}
