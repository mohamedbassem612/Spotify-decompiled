package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x1g1 {
    public final String a;
    public final String b;

    public x1g1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1g1)) {
            return false;
        }
        x1g1 x1g1Var = (x1g1) obj;
        return this.a.equals(x1g1Var.a) && this.b.equals(x1g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
