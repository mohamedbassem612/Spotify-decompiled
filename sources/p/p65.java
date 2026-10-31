package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p65 implements pdy0 {
    public final int a;
    public final int b;
    public final luk c;
    public final idd1 d;

    public p65(int i, int i2, luk lukVar) {
        this.a = i;
        this.b = i2;
        this.c = lukVar;
        this.d = new idd1(new f55(this, (byte) 14));
    }

    public final int a() {
        p65 p65Var = (p65) this.d.getValue();
        return p65Var != null ? p65Var.a() : this.a;
    }

    public final int b() {
        p65 p65Var = (p65) this.d.getValue();
        return p65Var != null ? p65Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("received_tokens_eviction_interval_millis", "android-usersnearby-discoveryreceiver-impl", a(), 0, 100000), new fpb("received_tokens_ttl_millis", "android-usersnearby-discoveryreceiver-impl", b(), 0, 100000)});
    }

    public p65(luk lukVar) {
        this(3000, 6000, lukVar);
    }
}
