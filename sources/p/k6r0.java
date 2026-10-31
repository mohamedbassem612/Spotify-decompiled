package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k6r0 {
    public final String a;
    public final String b;

    public k6r0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6r0)) {
            return false;
        }
        k6r0 k6r0Var = (k6r0) obj;
        return this.a.equals(k6r0Var.a) && this.b.equals(k6r0Var.b);
    }

    public final int hashCode() {
        return cy30.d(this.a.hashCode() * 31, 961, this.b);
    }
}
