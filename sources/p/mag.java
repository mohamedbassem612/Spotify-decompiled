package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mag {
    public final String a;
    public final String b;
    public final akb1 c;

    public mag(String str, String str2, akb1 akb1Var) {
        this.a = str;
        this.b = str2;
        this.c = akb1Var;
    }

    public final boolean a(trj1 trj1Var) {
        if (this.c == null) {
            return b(trj1Var);
        }
        return u890.j(trj1Var.a, this.a) && !u890.j(trj1Var.d.get("pointer.npv_mode"), "standalone");
    }

    public final boolean b(trj1 trj1Var) {
        String str = trj1Var.a;
        String str2 = this.a;
        if (u890.j(str, str2) || u890.j(str, this.b)) {
            return true;
        }
        return this.c != null && u890.j(trj1Var.d.get("album_uri"), str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mag)) {
            return false;
        }
        mag magVar = (mag) obj;
        return u890.j(this.a, magVar.a) && u890.j(this.b, magVar.b) && u890.j(this.c, magVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        akb1 akb1Var = this.c;
        return iD + (akb1Var == null ? 0 : akb1Var.hashCode());
    }
}
