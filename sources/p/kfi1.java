package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kfi1 {
    public final String a;
    public final String b;

    public kfi1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfi1)) {
            return false;
        }
        kfi1 kfi1Var = (kfi1) obj;
        return u890.j(this.a, kfi1Var.a) && u890.j(this.b, kfi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
