package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a2a1 implements q2a1 {
    public final String a;
    public final hr90 b;

    public a2a1(String str, hr90 hr90Var) {
        this.a = str;
        this.b = hr90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2a1)) {
            return false;
        }
        a2a1 a2a1Var = (a2a1) obj;
        return u890.j(this.a, a2a1Var.a) && this.b == a2a1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
