package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e42 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public e42(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new g3(this, (byte) 26));
    }

    public final boolean a() {
        e42 e42Var = (e42) this.c.getValue();
        return e42Var != null ? e42Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("fetch_connected_accessories_at_start", "ads-device-info", a()));
    }

    public e42(luk lukVar) {
        this(false, lukVar);
    }
}
