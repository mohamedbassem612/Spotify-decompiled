package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zrm1 implements pdy0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public zrm1(boolean z, int i, int i2, boolean z2, luk lukVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.e = lukVar;
        this.f = new idd1(new yrm1(this, (byte) 0));
    }

    public final boolean a() {
        zrm1 zrm1Var = (zrm1) this.f.getValue();
        return zrm1Var != null ? zrm1Var.a() : this.a;
    }

    public final int b() {
        zrm1 zrm1Var = (zrm1) this.f.getValue();
        return zrm1Var != null ? zrm1Var.b() : this.b;
    }

    public final int c() {
        zrm1 zrm1Var = (zrm1) this.f.getValue();
        return zrm1Var != null ? zrm1Var.c() : this.c;
    }

    public final boolean d() {
        zrm1 zrm1Var = (zrm1) this.f.getValue();
        return zrm1Var != null ? zrm1Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb(rca.d, "your-library-audiobook-progress-nudge", a()), new fpb("percentage_threshold", "your-library-audiobook-progress-nudge", b(), 0, 100), new fpb("time_threshold", "your-library-audiobook-progress-nudge", c(), 2, Integer.MAX_VALUE), new fpb("use_show_esperanto_endpoint", "your-library-audiobook-progress-nudge", d()));
    }

    public zrm1(luk lukVar) {
        this(false, 20, 18, false, lukVar);
    }
}
