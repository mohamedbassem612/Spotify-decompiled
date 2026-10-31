package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ith1 {
    public final String a;
    public final String b;

    public ith1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ith1)) {
            return false;
        }
        ith1 ith1Var = (ith1) obj;
        return this.a.equals(ith1Var.a) && this.b.equals(ith1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
