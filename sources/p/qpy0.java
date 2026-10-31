package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qpy0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new h2y0(this, (byte) 18));

    public qpy0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        qpy0 qpy0Var = (qpy0) this.c.getValue();
        return qpy0Var != null ? qpy0Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enabled", "puffin-cross-device-syncing", a()));
    }
}
