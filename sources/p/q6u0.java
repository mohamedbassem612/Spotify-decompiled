package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q6u0 {
    public final String a;
    public final String b;
    public final c380 c;

    public q6u0(String str, String str2, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6u0)) {
            return false;
        }
        q6u0 q6u0Var = (q6u0) obj;
        return this.a.equals(q6u0Var.a) && this.b.equals(q6u0Var.b) && u890.j(this.c, q6u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
