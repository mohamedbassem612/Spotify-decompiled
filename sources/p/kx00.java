package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kx00 implements lx00 {
    public final String a;
    public final long b;

    public kx00(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // p.lx00
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx00)) {
            return false;
        }
        kx00 kx00Var = (kx00) obj;
        return u890.j(this.a, kx00Var.a) && this.b == kx00Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
