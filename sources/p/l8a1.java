package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l8a1 {
    public final String a;
    public final int b;

    public l8a1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8a1)) {
            return false;
        }
        l8a1 l8a1Var = (l8a1) obj;
        return u890.j(this.a, l8a1Var.a) && this.b == l8a1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
