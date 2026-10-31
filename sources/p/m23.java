package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m23 {
    public final String a;
    public final String b;

    public m23(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m23)) {
            return false;
        }
        m23 m23Var = (m23) obj;
        return this.a.equals(m23Var.a) && u890.j(this.b, m23Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
