package p;

import android.content.res.Resources;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ooe implements l03 {
    public final Resources a;

    public ooe(Resources resources) {
        this.a = resources;
    }

    public final String b() {
        return this.a.getString(2131952148);
    }

    public final List f() {
        return Collections.singletonList(new r7u(this.a.getString(2131952146), "https://www.spotify.com/legal/privacy-policy"));
    }

    public final String g() {
        return this.a.getString(2131952145);
    }

    public final String i() {
        return this.a.getString(2131952147);
    }
}
