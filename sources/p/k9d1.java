package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k9d1 {
    public final String a;
    public final int b;
    public final s1f1 c;

    public k9d1(String str, int i, s1f1 s1f1Var) {
        this.a = str;
        this.b = i;
        this.c = s1f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9d1)) {
            return false;
        }
        k9d1 k9d1Var = (k9d1) obj;
        return this.a.equals(k9d1Var.a) && this.b == k9d1Var.b && this.c.equals(k9d1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
