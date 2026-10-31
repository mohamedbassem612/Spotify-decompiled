package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class abf0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new jgd0(this, (byte) 23));

    public abf0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        abf0 abf0Var = (abf0) this.c.getValue();
        return abf0Var != null ? abf0Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("lossless_24_bit_unavailable_card_enabled", "lossless-troubleshooting", a()));
    }
}
