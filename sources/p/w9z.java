package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w9z {
    public final String a;
    public final String b;
    public final String c;
    public final k4m d;
    public final saz e;

    public w9z(String str, String str2, String str3, k4m k4mVar, saz sazVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = k4mVar;
        this.e = sazVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9z)) {
            return false;
        }
        w9z w9zVar = (w9z) obj;
        return this.a.equals(w9zVar.a) && u890.j(this.b, w9zVar.b) && u890.j(this.c, w9zVar.c) && this.d == w9zVar.d && this.e.equals(w9zVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + p3d1.g(this.d, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }
}
