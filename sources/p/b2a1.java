package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b2a1 implements q2a1 {
    public final String a;
    public final hr90 b;

    public b2a1(String str, hr90 hr90Var) {
        this.a = str;
        this.b = hr90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2a1)) {
            return false;
        }
        b2a1 b2a1Var = (b2a1) obj;
        return u890.j(this.a, b2a1Var.a) && this.b == b2a1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
