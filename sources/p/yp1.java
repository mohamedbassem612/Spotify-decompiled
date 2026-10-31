package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yp1 implements cq1 {
    public final String a;
    public final String b;

    public yp1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp1)) {
            return false;
        }
        yp1 yp1Var = (yp1) obj;
        return u890.j(this.a, yp1Var.a) && u890.j(this.b, yp1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
