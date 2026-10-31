package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tpy {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public tpy(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpy)) {
            return false;
        }
        tpy tpyVar = (tpy) obj;
        return u890.j(this.a, tpyVar.a) && u890.j(this.b, tpyVar.b) && u890.j(this.c, tpyVar.c) && this.d == tpyVar.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return l1d.C(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
