package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class clb implements dlb {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public clb(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clb)) {
            return false;
        }
        clb clbVar = (clb) obj;
        return this.a.equals(clbVar.a) && this.b.equals(clbVar.b) && u890.j(this.c, clbVar.c) && this.d == clbVar.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return l1d.C(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
