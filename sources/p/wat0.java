package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wat0 implements ebt0 {
    public final String a;
    public final tv80 b;

    public wat0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wat0)) {
            return false;
        }
        wat0 wat0Var = (wat0) obj;
        return u890.j(this.a, wat0Var.a) && u890.j(this.b, wat0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
