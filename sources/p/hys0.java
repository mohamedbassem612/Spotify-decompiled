package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hys0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public hys0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new kks0(this, (byte) 3));
    }

    public final boolean a() {
        hys0 hys0Var = (hys0) this.c.getValue();
        return hys0Var != null ? hys0Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("should_show_pigeon_upsell", "pigeon-upsell", a()));
    }

    public hys0(luk lukVar) {
        this(false, lukVar);
    }
}
