package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o15 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new uz4(this, (byte) 21));

    public o15(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        o15 o15Var = (o15) this.c.getValue();
        return o15Var != null ? o15Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_save_to_playlist_button", "android-sharecard-cardproviders-musicvideosticker-impl", a()));
    }
}
