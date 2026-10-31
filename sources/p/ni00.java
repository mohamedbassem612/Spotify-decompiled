package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ni00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ni00(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni00)) {
            return false;
        }
        ni00 ni00Var = (ni00) obj;
        return this.a.equals(ni00Var.a) && u890.j(this.b, ni00Var.b) && this.c.equals(ni00Var.c) && this.d.equals(ni00Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
