package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qt6 implements st6 {
    public final String a;
    public final int b;

    public qt6(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt6)) {
            return false;
        }
        qt6 qt6Var = (qt6) obj;
        return this.a.equals(qt6Var.a) && this.b == qt6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
