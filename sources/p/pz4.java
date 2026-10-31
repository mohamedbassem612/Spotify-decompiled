package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pz4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 27));

    public pz4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        pz4 pz4Var = (pz4) this.c.getValue();
        return pz4Var != null ? pz4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("compose_ratings_page_enabled", "android-ratings-ratingsandreviewspage", a()));
    }
}
