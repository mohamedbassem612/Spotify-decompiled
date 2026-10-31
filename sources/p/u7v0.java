package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u7v0 extends b8v0 {
    public final String a;
    public final String b;

    public u7v0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7v0)) {
            return false;
        }
        u7v0 u7v0Var = (u7v0) obj;
        return u890.j(this.a, u7v0Var.a) && u890.j(this.b, u7v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
