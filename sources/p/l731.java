package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l731 implements m731 {
    public final String a;
    public final xuh1 b;

    public l731(String str, xuh1 xuh1Var) {
        this.a = str;
        this.b = xuh1Var;
    }

    public final String a() {
        return this.a;
    }

    public final xuh1 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l731)) {
            return false;
        }
        l731 l731Var = (l731) obj;
        return u890.j(this.a, l731Var.a) && this.b.equals(l731Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
