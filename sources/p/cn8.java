package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cn8 implements en8 {
    public final String a;
    public final String b;

    public cn8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn8)) {
            return false;
        }
        cn8 cn8Var = (cn8) obj;
        return u890.j(this.a, cn8Var.a) && this.b.equals(cn8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
