package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vi60 implements zi60 {
    public final int a;
    public final String b;
    public final String c;

    public vi60(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi60)) {
            return false;
        }
        vi60 vi60Var = (vi60) obj;
        return this.a == vi60Var.a && this.b.equals(vi60Var.b) && u890.j(this.c, vi60Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(this.a) * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
