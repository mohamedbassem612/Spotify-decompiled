package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class p4j1 {
    public static final o4j1 Companion = new o4j1();
    public final m4j1 a;
    public final m4j1 b;

    public /* synthetic */ p4j1(int i, m4j1 m4j1Var, m4j1 m4j1Var2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = m4j1Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = m4j1Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4j1)) {
            return false;
        }
        p4j1 p4j1Var = (p4j1) obj;
        return u890.j(this.a, p4j1Var.a) && u890.j(this.b, p4j1Var.b);
    }

    public final int hashCode() {
        m4j1 m4j1Var = this.a;
        int iHashCode = (m4j1Var == null ? 0 : m4j1Var.hashCode()) * 31;
        m4j1 m4j1Var2 = this.b;
        return iHashCode + (m4j1Var2 != null ? m4j1Var2.hashCode() : 0);
    }

    public p4j1(m4j1 m4j1Var, m4j1 m4j1Var2) {
        this.a = m4j1Var;
        this.b = m4j1Var2;
    }
}
