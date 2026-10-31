package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xo4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public xo4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new zn4(this, (byte) 16));
    }

    public final boolean a() {
        xo4 xo4Var = (xo4) this.c.getValue();
        return xo4Var != null ? xo4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("cache_kodiak_source_values", "android-list-platform-endpoints-impl", a()));
    }

    public xo4(luk lukVar) {
        this(true, lukVar);
    }
}
