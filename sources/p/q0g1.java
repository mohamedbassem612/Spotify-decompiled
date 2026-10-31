package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q0g1 {
    public final jo70 a;
    public final String b;

    public q0g1(String str, jo70 jo70Var) {
        this.a = jo70Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0g1)) {
            return false;
        }
        q0g1 q0g1Var = (q0g1) obj;
        return this.a.equals(q0g1Var.a) && this.b.equals(q0g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
