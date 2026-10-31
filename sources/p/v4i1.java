package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v4i1 {
    public final String a;
    public final String b;
    public final String c;

    public v4i1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4i1)) {
            return false;
        }
        v4i1 v4i1Var = (v4i1) obj;
        return this.a.equals(v4i1Var.a) && this.b.equals(v4i1Var.b) && u890.j(this.c, v4i1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
