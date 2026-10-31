package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jmg {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public jmg(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmg)) {
            return false;
        }
        jmg jmgVar = (jmg) obj;
        return u890.j(this.a, jmgVar.a) && u890.j(this.b, jmgVar.b) && this.c.equals(jmgVar.c) && this.d == jmgVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
