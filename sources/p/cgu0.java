package p;

import android.content.res.Resources;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cgu0 implements l03 {
    public final Resources a;

    public cgu0(Resources resources) {
        this.a = resources;
    }

    public final String b() {
        return this.a.getString(2131952152);
    }

    public final List f() {
        Resources resources = this.a;
        return p7h.M(new r7u[]{new r7u(resources.getString(2131952150), "https://www.spotify.com/legal/privacy-policy"), new r7u(resources.getString(2131952153), "spotify:internal:ai-usage-limits")});
    }

    public final String i() {
        return this.a.getString(2131952151);
    }
}
