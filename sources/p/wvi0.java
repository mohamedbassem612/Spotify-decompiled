package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wvi0 extends gwi0 {
    public final String a;
    public final long b;
    public final String c;
    public final svi0 d;

    public wvi0(String str, long j, String str2, svi0 svi0Var) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = svi0Var;
    }

    @Override // p.gwi0
    public final svi0 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvi0)) {
            return false;
        }
        wvi0 wvi0Var = (wvi0) obj;
        return u890.j(this.a, wvi0Var.a) && this.b == wvi0Var.b && u890.j(this.c, wvi0Var.c) && u890.j(this.d, wvi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }
}
