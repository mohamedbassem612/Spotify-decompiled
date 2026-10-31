package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m251 {
    public final String a;
    public final boolean b;

    public m251(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public static m251 a(m251 m251Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = m251Var.a;
        }
        if ((i & 2) != 0) {
            z = m251Var.b;
        }
        m251Var.getClass();
        return new m251(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m251)) {
            return false;
        }
        m251 m251Var = (m251) obj;
        return u890.j(this.a, m251Var.a) && this.b == m251Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
