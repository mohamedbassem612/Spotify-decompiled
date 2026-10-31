package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k44 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new g82(this, (byte) 28));

    public k44(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        k44 k44Var = (k44) this.c.getValue();
        return k44Var != null ? k44Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_podcast_creator_sponsorship_npv", "android-adsdisplay-podcastsponsorship", a()));
    }
}
