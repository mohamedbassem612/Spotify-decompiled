package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public iq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new lp4(this, (byte) 21));
    }

    public final boolean a() {
        iq4 iq4Var = (iq4) this.c.getValue();
        return iq4Var != null ? iq4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enabled", "android-list-ux-platform-consumers-standard-listcomponents-providedsortreconciliation", a()));
    }

    public iq4(luk lukVar) {
        this(true, lukVar);
    }
}
