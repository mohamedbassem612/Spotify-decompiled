package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gq4 implements pdy0 {
    public final int a;
    public final int b;
    public final luk c;
    public final idd1 d;

    public gq4(int i, int i2, luk lukVar) {
        this.a = i;
        this.b = i2;
        this.c = lukVar;
        this.d = new idd1(new lp4(this, (byte) 19));
    }

    public final int a() {
        gq4 gq4Var = (gq4) this.d.getValue();
        return gq4Var != null ? gq4Var.a() : this.a;
    }

    public final int b() {
        gq4 gq4Var = (gq4) this.d.getValue();
        return gq4Var != null ? gq4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("kodiak_prefetch_buffer_size", "android-list-ux-platform-consumers-standard-listcomponents-kodiakprefetch", a(), 0, 100), new fpb("kodiak_prefetch_timeout_ms", "android-list-ux-platform-consumers-standard-listcomponents-kodiakprefetch", b(), 0, 2000)});
    }

    public gq4(luk lukVar) {
        this(20, 0, lukVar);
    }
}
