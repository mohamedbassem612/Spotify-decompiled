package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xqa1 implements era1 {
    public final String a;
    public final String b;

    public xqa1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqa1)) {
            return false;
        }
        xqa1 xqa1Var = (xqa1) obj;
        return u890.j(this.a, xqa1Var.a) && u890.j(this.b, xqa1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
