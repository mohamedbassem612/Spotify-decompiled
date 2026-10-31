package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dew implements hiw {
    public final String a;
    public final String b;
    public final tv80 c;

    public dew(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dew)) {
            return false;
        }
        dew dewVar = (dew) obj;
        return u890.j(this.a, dewVar.a) && u890.j(this.b, dewVar.b) && u890.j(this.c, dewVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
