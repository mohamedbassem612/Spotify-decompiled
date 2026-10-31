package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hzl1 {
    public final String a;
    public final String b;
    public final String c;

    public hzl1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzl1)) {
            return false;
        }
        hzl1 hzl1Var = (hzl1) obj;
        return this.a.equals(hzl1Var.a) && this.b.equals(hzl1Var.b) && u890.j(this.c, hzl1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
