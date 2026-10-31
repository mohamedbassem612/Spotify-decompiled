package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q0o0 {
    public final hux a;
    public final String b;
    public final String c;

    public q0o0(String str, String str2, hux huxVar) {
        this.a = huxVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0o0)) {
            return false;
        }
        q0o0 q0o0Var = (q0o0) obj;
        return u890.j(this.a, q0o0Var.a) && this.b.equals(q0o0Var.b) && this.c.equals(q0o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
