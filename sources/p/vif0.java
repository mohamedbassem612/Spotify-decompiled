package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vif0 implements yif0 {
    public final String a;
    public final a9h b;
    public final String c;

    public vif0(String str, a9h a9hVar, String str2) {
        this.a = str;
        this.b = a9hVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vif0)) {
            return false;
        }
        vif0 vif0Var = (vif0) obj;
        return u890.j(this.a, vif0Var.a) && u890.j(this.b, vif0Var.b) && u890.j(this.c, vif0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
