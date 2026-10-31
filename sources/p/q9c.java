package p;

import com.spotify.externalintegration.ubi.UbiSpecificationId;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q9c {
    public String a;
    public boolean b;
    public final int c;
    public final int d;
    public String e;
    public String f;
    public String g;
    public m210 h;
    public boolean j;
    public boolean k;
    public String n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f30p;
    public boolean q;
    public boolean i = true;
    public hlr0 l = new hlr0();
    public UbiSpecificationId m = UbiSpecificationId.UNKNOWN;

    public q9c(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final r9c a() {
        return new r9c(this.e, this.a, this.f, this.g, this.h, this.b, this.i, this.j, this.k, this.l, this.c, this.d, this.m, this.n, this.o, this.f30p, this.q);
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void c() {
        this.b = true;
    }
}
