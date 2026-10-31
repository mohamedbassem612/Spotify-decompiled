package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class few0 implements kew0 {
    public final long a;
    public final long b;
    public final tv80 c;

    public few0(long j, long j2, tv80 tv80Var) {
        this.a = j;
        this.b = j2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof few0)) {
            return false;
        }
        few0 few0Var = (few0) obj;
        return this.a == few0Var.a && this.b == few0Var.b && u890.j(this.c, few0Var.c);
    }

    public final int hashCode() {
        int iF = cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
        tv80 tv80Var = this.c;
        return iF + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
