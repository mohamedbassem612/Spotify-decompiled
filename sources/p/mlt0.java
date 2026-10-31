package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mlt0 implements nlt0 {
    public final String a;
    public final String b;
    public final String c;

    public mlt0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlt0)) {
            return false;
        }
        mlt0 mlt0Var = (mlt0) obj;
        return this.a.equals(mlt0Var.a) && u890.j(this.b, mlt0Var.b) && u890.j(this.c, mlt0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
