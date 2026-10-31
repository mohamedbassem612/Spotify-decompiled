package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e04 implements f04 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public e04(int i, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e04)) {
            return false;
        }
        e04 e04Var = (e04) obj;
        return this.a.equals(e04Var.a) && this.b.equals(e04Var.b) && u890.j(this.c, e04Var.c) && this.d.equals(e04Var.d) && this.e.equals(e04Var.e) && this.f == e04Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iD2 = cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        int i = this.f;
        return iD2 + (i != 0 ? l1d.C(i) : 0);
    }
}
