package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a5h0 implements h5h0 {
    public final String a;
    public final c380 b;

    public a5h0(String str, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5h0)) {
            return false;
        }
        a5h0 a5h0Var = (a5h0) obj;
        return this.a.equals(a5h0Var.a) && u890.j(this.b, a5h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
