package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mva0 extends pva0 {
    public final String a;
    public final String b;
    public final String c;

    public mva0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mva0)) {
            return false;
        }
        mva0 mva0Var = (mva0) obj;
        return this.a.equals(mva0Var.a) && u890.j(this.b, mva0Var.b) && u890.j(this.c, mva0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
