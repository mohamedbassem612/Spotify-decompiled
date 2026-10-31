package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ope {
    public final jre a;
    public final zzq0 b;
    public final boolean c;

    public ope(jre jreVar, zzq0 zzq0Var, boolean z) {
        this.a = jreVar;
        this.b = zzq0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ope)) {
            return false;
        }
        ope opeVar = (ope) obj;
        return u890.j(this.a, opeVar.a) && this.b.equals(opeVar.b) && this.c == opeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, true)) * 31);
    }
}
