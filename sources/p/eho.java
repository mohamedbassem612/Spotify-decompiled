package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eho {
    public final vnb1 a;
    public final String b;
    public final boolean c;

    public eho(vnb1 vnb1Var, String str, boolean z) {
        this.a = vnb1Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eho)) {
            return false;
        }
        eho ehoVar = (eho) obj;
        return this.a.equals(ehoVar.a) && u890.j(this.b, ehoVar.b) && this.c == ehoVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
