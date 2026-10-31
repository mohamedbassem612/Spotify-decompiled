package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nl4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new gk4(this, (byte) 9));

    public nl4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        nl4 nl4Var = (nl4) this.c.getValue();
        return nl4Var != null ? nl4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_related_card_in_npv", "android-legacy-related-track-card", a()));
    }
}
