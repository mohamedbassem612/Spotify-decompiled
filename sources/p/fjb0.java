package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fjb0 implements njb0 {
    public final String a;
    public final ygh b;
    public final tv80 c;

    public fjb0(String str, ygh yghVar, tv80 tv80Var) {
        this.a = str;
        this.b = yghVar;
        this.c = tv80Var;
    }

    public final boolean a(rph rphVar) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjb0)) {
            return false;
        }
        fjb0 fjb0Var = (fjb0) obj;
        return u890.j(this.a, fjb0Var.a) && u890.j(this.b, fjb0Var.b) && u890.j(this.c, fjb0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        tv80 tv80Var = this.c;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
