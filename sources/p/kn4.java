package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kn4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 17));

    public kn4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        kn4 kn4Var = (kn4) this.c.getValue();
        return kn4Var != null ? kn4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("skip_to_next_chapter_enabled", "android-libs-nowplaying-elements-skiptonextchapter", a()));
    }
}
