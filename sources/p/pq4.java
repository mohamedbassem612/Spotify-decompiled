package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public pq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new lp4(this, (byte) 28));
    }

    public final boolean a() {
        pq4 pq4Var = (pq4) this.c.getValue();
        return pq4Var != null ? pq4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_livestream_error_dialog_page", "android-liveroom-errordialogfragment", a()));
    }

    public pq4(luk lukVar) {
        this(false, lukVar);
    }
}
