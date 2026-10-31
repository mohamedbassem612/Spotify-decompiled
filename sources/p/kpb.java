package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kpb implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public kpb(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new vv8(this, (byte) 28));
    }

    public final boolean a() {
        kpb kpbVar = (kpb) this.c.getValue();
        return kpbVar != null ? kpbVar.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_otfn", "boombox-settings", a()));
    }

    public kpb(luk lukVar) {
        this(false, lukVar);
    }
}
