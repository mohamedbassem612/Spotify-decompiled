package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class onf {
    public final String a;
    public final String b;
    public final tv80 c;

    public onf(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onf)) {
            return false;
        }
        onf onfVar = (onf) obj;
        return u890.j(this.a, onfVar.a) && u890.j(this.b, onfVar.b) && u890.j(this.c, onfVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
