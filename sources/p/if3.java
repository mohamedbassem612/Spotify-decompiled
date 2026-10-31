package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class if3 {
    public final String a;
    public final String b;
    public final g07 c;
    public final o1v d;

    public if3(String str, String str2, g07 g07Var, o1v o1vVar) {
        this.a = str;
        this.b = str2;
        this.c = g07Var;
        this.d = o1vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if3)) {
            return false;
        }
        if3 if3Var = (if3) obj;
        return this.a.equals(if3Var.a) && u890.j(this.b, if3Var.b) && this.c.equals(if3Var.c) && this.d == if3Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
