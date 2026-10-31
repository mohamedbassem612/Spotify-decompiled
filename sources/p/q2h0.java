package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q2h0 implements e4h0 {
    public final String a;
    public final String b;

    public q2h0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2h0)) {
            return false;
        }
        q2h0 q2h0Var = (q2h0) obj;
        return u890.j(this.a, q2h0Var.a) && this.b.equals(q2h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
