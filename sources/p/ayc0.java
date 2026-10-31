package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ayc0 {
    public final String a;
    public final phc b;
    public final phc c;
    public final boolean d;
    public final String e;

    public ayc0(String str, phc phcVar, phc phcVar2, boolean z, String str2, int i) {
        phcVar = (i & 2) != 0 ? null : phcVar;
        phcVar2 = (i & 4) != 0 ? null : phcVar2;
        z = (i & 8) != 0 ? false : z;
        str2 = (i & 16) != 0 ? null : str2;
        this.a = str;
        this.b = phcVar;
        this.c = phcVar2;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayc0)) {
            return false;
        }
        ayc0 ayc0Var = (ayc0) obj;
        return u890.j(this.a, ayc0Var.a) && u890.j(this.b, ayc0Var.b) && u890.j(this.c, ayc0Var.c) && this.d == ayc0Var.d && u890.j(this.e, ayc0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        phc phcVar = this.b;
        int iHashCode2 = (iHashCode + (phcVar == null ? 0 : phcVar.hashCode())) * 31;
        phc phcVar2 = this.c;
        int iG = xcg1.g((iHashCode2 + (phcVar2 == null ? 0 : phcVar2.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return iG + (str != null ? str.hashCode() : 0);
    }
}
