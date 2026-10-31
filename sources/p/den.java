package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class den implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public den(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a(zdn zdnVar) {
        String str;
        String str2;
        String str3;
        zdn zdnVar2 = zdn.d;
        if (zdnVar == zdnVar2 && (str3 = this.d) != null && str3.length() != 0) {
            return str3;
        }
        if ((zdnVar != zdn.c && zdnVar != zdnVar2) || (str = this.c) == null || str.length() == 0) {
            return (zdnVar != zdn.b || (str2 = this.b) == null || str2.length() == 0) ? this.a : str2;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof den)) {
            return false;
        }
        den denVar = (den) obj;
        return u890.j(this.a, denVar.a) && u890.j(this.b, denVar.b) && u890.j(this.c, denVar.c) && u890.j(this.d, denVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ den() {
        this("", null, null, null);
    }
}
