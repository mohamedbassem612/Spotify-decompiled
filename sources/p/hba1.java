package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hba1 implements jba1 {
    public final String a;
    public final String b;

    public hba1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hba1)) {
            return false;
        }
        hba1 hba1Var = (hba1) obj;
        return u890.j(this.a, hba1Var.a) && u890.j(this.b, hba1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
