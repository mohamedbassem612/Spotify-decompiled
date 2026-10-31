package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xp1 implements cq1 {
    public final String a;
    public final String b;

    public xp1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp1)) {
            return false;
        }
        xp1 xp1Var = (xp1) obj;
        return this.a.equals(xp1Var.a) && u890.j(this.b, xp1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
