package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mlg {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public mlg(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlg)) {
            return false;
        }
        mlg mlgVar = (mlg) obj;
        return u890.j(this.a, mlgVar.a) && this.b.equals(mlgVar.b) && this.c == mlgVar.c && u890.j(this.d, mlgVar.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
