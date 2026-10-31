package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kxk1 {
    public final String a;
    public final String b;

    public kxk1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxk1)) {
            return false;
        }
        kxk1 kxk1Var = (kxk1) obj;
        return u890.j(this.a, kxk1Var.a) && u890.j(this.b, kxk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
