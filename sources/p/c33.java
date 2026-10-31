package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c33 implements d33 {
    public final String a;
    public final long b;
    public final String c;

    public c33(long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c33)) {
            return false;
        }
        c33 c33Var = (c33) obj;
        return this.a.equals(c33Var.a) && this.b == c33Var.b && u890.j(this.c, c33Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
