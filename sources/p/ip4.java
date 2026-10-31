package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ip4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public ip4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new zn4(this, (byte) 27));
    }

    public final boolean a() {
        ip4 ip4Var = (ip4) this.c.getValue();
        return ip4Var != null ? ip4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("row_slots_enabled", "android-list-ux-platform-consumers-celebrity-blend-shared", a()));
    }

    public ip4(luk lukVar) {
        this(false, lukVar);
    }
}
