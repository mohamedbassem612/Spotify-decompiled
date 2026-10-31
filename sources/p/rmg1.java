package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rmg1 {
    public final String a;
    public final String b;
    public final String c;

    public rmg1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmg1)) {
            return false;
        }
        rmg1 rmg1Var = (rmg1) obj;
        return this.a.equals(rmg1Var.a) && this.b.equals(rmg1Var.b) && u890.j(this.c, rmg1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
