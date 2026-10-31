package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cl21 {
    public final ji0 a;
    public final String b;

    public cl21(String str, ji0 ji0Var) {
        this.a = ji0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl21)) {
            return false;
        }
        cl21 cl21Var = (cl21) obj;
        return this.a.equals(cl21Var.a) && this.b.equals(cl21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
