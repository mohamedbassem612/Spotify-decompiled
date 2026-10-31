package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m840 implements o840 {
    public final String a;
    public final String b;

    public m840(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m840)) {
            return false;
        }
        m840 m840Var = (m840) obj;
        return u890.j(this.a, m840Var.a) && this.b.equals(m840Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
