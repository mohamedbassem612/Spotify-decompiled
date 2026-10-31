package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class px4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fv4(this, (byte) 27));

    public px4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        px4 px4Var = (px4) this.c.getValue();
        return px4Var != null ? px4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("use_visref_color_extraction", "android-playlist-artwork-cover-art-page", a()));
    }
}
