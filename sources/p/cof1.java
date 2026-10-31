package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cof1 {
    public final String a;
    public final String b;
    public final String c;

    public cof1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cof1)) {
            return false;
        }
        cof1 cof1Var = (cof1) obj;
        return u890.j(this.a, cof1Var.a) && this.b.equals(cof1Var.b) && u890.j(this.c, cof1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
