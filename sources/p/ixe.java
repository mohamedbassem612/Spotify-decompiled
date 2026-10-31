package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ixe implements nye {
    public final String a;
    public final ou80 b;
    public final int c;

    public ixe(String str, ou80 ou80Var, int i) {
        this.a = str;
        this.b = ou80Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixe)) {
            return false;
        }
        ixe ixeVar = (ixe) obj;
        return u890.j(this.a, ixeVar.a) && u890.j(this.b, ixeVar.b) && this.c == ixeVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ou80 ou80Var = this.b;
        int iHashCode2 = (iHashCode + (ou80Var == null ? 0 : ou80Var.a.hashCode())) * 31;
        int i = this.c;
        return iHashCode2 + (i != 0 ? l1d.C(i) : 0);
    }
}
