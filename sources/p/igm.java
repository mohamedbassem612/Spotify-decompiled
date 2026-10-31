package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class igm {
    public final String a;
    public final rzn1 b;
    public final String c;

    public /* synthetic */ igm(String str, rzn1 rzn1Var, String str2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : rzn1Var, (i & 4) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igm)) {
            return false;
        }
        igm igmVar = (igm) obj;
        return u890.j(this.a, igmVar.a) && u890.j(this.b, igmVar.b) && u890.j(this.c, igmVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rzn1 rzn1Var = this.b;
        int iHashCode2 = (iHashCode + (rzn1Var == null ? 0 : rzn1Var.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public igm(String str, rzn1 rzn1Var, String str2) {
        this.a = str;
        this.b = rzn1Var;
        this.c = str2;
    }
}
