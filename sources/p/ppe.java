package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ppe {
    public final jre a;
    public final vzq0 b;
    public final boolean c;
    public final boolean d;

    public ppe(jre jreVar, vzq0 vzq0Var, boolean z, boolean z2) {
        this.a = jreVar;
        this.b = vzq0Var;
        this.c = z;
        this.d = z2;
    }

    public static ppe a(ppe ppeVar, ire ireVar, int i) {
        jre jreVar = ireVar;
        if ((i & 1) != 0) {
            jreVar = ppeVar.a;
        }
        return new ppe(jreVar, ppeVar.b, ppeVar.c, (i & 16) != 0 ? ppeVar.d : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppe)) {
            return false;
        }
        ppe ppeVar = (ppe) obj;
        return u890.j(this.a, ppeVar.a) && this.b.equals(ppeVar.b) && this.c == ppeVar.c && this.d == ppeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g((this.b.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, true)) * 31, 31, this.c);
    }
}
