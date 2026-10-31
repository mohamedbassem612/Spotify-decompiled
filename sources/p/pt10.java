package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pt10 implements st10 {
    public final String a;
    public final String b;

    public pt10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt10)) {
            return false;
        }
        pt10 pt10Var = (pt10) obj;
        return this.a.equals(pt10Var.a) && u890.j(this.b, pt10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
