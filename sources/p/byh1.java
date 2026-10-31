package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class byh1 extends dyh1 {
    public final String a;
    public final String b;

    public byh1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byh1)) {
            return false;
        }
        byh1 byh1Var = (byh1) obj;
        return this.a.equals(byh1Var.a) && this.b.equals(byh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
