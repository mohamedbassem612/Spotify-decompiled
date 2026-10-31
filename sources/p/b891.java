package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b891 implements d891 {
    public final String a;
    public final long b;
    public final long c;
    public final i6h1 d;

    public b891(String str, long j, long j2, i6h1 i6h1Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i6h1Var;
    }

    public final i6h1 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b891)) {
            return false;
        }
        b891 b891Var = (b891) obj;
        return u890.j(this.a, b891Var.a) && this.b == b891Var.b && this.c == b891Var.c && u890.j(this.d, b891Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }
}
