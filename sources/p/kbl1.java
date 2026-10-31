package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kbl1 {
    public final String a;
    public final String b;

    public kbl1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbl1)) {
            return false;
        }
        kbl1 kbl1Var = (kbl1) obj;
        return this.a.equals(kbl1Var.a) && this.b.equals(kbl1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
