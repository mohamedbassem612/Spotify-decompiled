package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v34 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public v34(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new g82(this, (byte) 19));
    }

    public final boolean a() {
        v34 v34Var = (v34) this.c.getValue();
        return v34Var != null ? v34Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("prototype_entrypoint_enabled", "android-account-management-platform", a()));
    }

    public v34(luk lukVar) {
        this(false, lukVar);
    }
}
