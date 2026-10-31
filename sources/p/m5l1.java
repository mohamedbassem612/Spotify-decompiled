package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m5l1 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public m5l1(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new bkk1(this, (byte) 7));
    }

    public final boolean a() {
        m5l1 m5l1Var = (m5l1) this.c.getValue();
        return m5l1Var != null ? m5l1Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("watchfeed_artwork_accessory_enabled", "watch-feed-artwork-accessory", a()));
    }

    public m5l1(luk lukVar) {
        this(false, lukVar);
    }
}
