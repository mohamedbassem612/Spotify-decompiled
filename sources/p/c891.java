package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c891 implements d891 {
    public final long a;
    public final float b;
    public final i6h1 c;

    public c891(long j, float f, i6h1 i6h1Var) {
        this.a = j;
        this.b = f;
        this.c = i6h1Var;
    }

    public final i6h1 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c891)) {
            return false;
        }
        c891 c891Var = (c891) obj;
        return this.a == c891Var.a && Float.compare(this.b, c891Var.b) == 0 && u890.j(this.c, c891Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.f(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
