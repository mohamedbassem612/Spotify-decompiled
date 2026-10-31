package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qt90 implements tt90 {
    public final p2a0 a;
    public final String b;
    public final m4o0 c;
    public final zo90 d;

    public qt90(p2a0 p2a0Var, String str, m4o0 m4o0Var, zo90 zo90Var) {
        this.a = p2a0Var;
        this.b = str;
        this.c = m4o0Var;
        this.d = zo90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt90)) {
            return false;
        }
        qt90 qt90Var = (qt90) obj;
        return this.a.equals(qt90Var.a) && u890.j(this.b, qt90Var.b) && u890.j(this.c, qt90Var.c) && this.d.equals(qt90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
