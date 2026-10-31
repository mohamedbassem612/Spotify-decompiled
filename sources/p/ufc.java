package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ufc implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public ufc(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new ptb(this, (byte) 7));
    }

    public final boolean a() {
        ufc ufcVar = (ufc) this.c.getValue();
        return ufcVar != null ? ufcVar.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("ducking_enabled", "byom-flags", a()));
    }

    public ufc(luk lukVar) {
        this(false, lukVar);
    }
}
