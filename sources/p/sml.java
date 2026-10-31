package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sml {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final qwm e;

    public sml(String str, String str2, String str3, int i, qwm qwmVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = qwmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sml)) {
            return false;
        }
        sml smlVar = (sml) obj;
        return this.a.equals(smlVar.a) && u890.j(this.b, smlVar.b) && u890.j(this.c, smlVar.c) && this.d == smlVar.d && u890.j(this.e, smlVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i = this.d;
        int iC = (iHashCode3 + (i == 0 ? 0 : l1d.C(i))) * 31;
        qwm qwmVar = this.e;
        return iC + (qwmVar != null ? qwmVar.hashCode() : 0);
    }
}
