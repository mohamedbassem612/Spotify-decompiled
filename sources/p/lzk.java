package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lzk {
    public final String a;
    public final String b;
    public final String c;

    public lzk(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzk)) {
            return false;
        }
        lzk lzkVar = (lzk) obj;
        return u890.j(this.a, lzkVar.a) && u890.j(this.b, lzkVar.b) && u890.j(this.c, lzkVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
