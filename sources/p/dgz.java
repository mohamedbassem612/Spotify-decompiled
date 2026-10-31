package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dgz {
    public final String a;
    public final String b;
    public final cgz c;
    public final boolean d;

    public dgz(String str, String str2, cgz cgzVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = cgzVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgz)) {
            return false;
        }
        dgz dgzVar = (dgz) obj;
        return u890.j(this.a, dgzVar.a) && u890.j(this.b, dgzVar.b) && u890.j(this.c, dgzVar.c) && this.d == dgzVar.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        cgz cgzVar = this.c;
        return Boolean.hashCode(this.d) + ((iD + (cgzVar == null ? 0 : cgzVar.hashCode())) * 961);
    }

    public /* synthetic */ dgz(String str, String str2, cgz cgzVar, boolean z, int i) {
        this(str, str2, cgzVar, (i & 16) != 0 ? false : z);
    }
}
