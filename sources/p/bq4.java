package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public bq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new lp4(this, (byte) 14));
    }

    public final boolean a() {
        bq4 bq4Var = (bq4) this.c.getValue();
        return bq4Var != null ? bq4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("covers_playlist_plugins_enabled", "android-list-ux-platform-consumers-songdnacovers-shared", a()));
    }

    public bq4(luk lukVar) {
        this(false, lukVar);
    }
}
