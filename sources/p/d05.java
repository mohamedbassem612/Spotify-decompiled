package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d05 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new uz4(this, (byte) 7));

    public d05(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        d05 d05Var = (d05) this.c.getValue();
        return d05Var != null ? d05Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("is_contextual_page_enabled", "android-reinvent-free-download-upsell", a()));
    }
}
