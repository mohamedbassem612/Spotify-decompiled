package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wy8 {
    public int a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public String h;
    public List i;
    public byte j;

    public final xy8 a() {
        String str;
        if (this.j == 63 && (str = this.b) != null) {
            return new xy8(this.a, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.b == null) {
            sb.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb.append(" timestamp");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public final void b(List list) {
        this.i = list;
    }

    public final void c(int i) {
        this.d = i;
        this.j = (byte) (this.j | 4);
    }

    public final void d(int i) {
        this.a = i;
        this.j = (byte) (this.j | 1);
    }

    public final void e(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null processName");
        }
    }

    public final void f(long j) {
        this.e = j;
        this.j = (byte) (this.j | 8);
    }

    public final void g(int i) {
        this.c = i;
        this.j = (byte) (this.j | 2);
    }

    public final void h(long j) {
        this.f = j;
        this.j = (byte) (this.j | 16);
    }

    public final void i(long j) {
        this.g = j;
        this.j = (byte) (this.j | 32);
    }

    public final void j(String str) {
        this.h = str;
    }
}
