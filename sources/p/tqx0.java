package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tqx0 extends frx0 {
    public final String a;
    public final String b;

    public tqx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqx0)) {
            return false;
        }
        tqx0 tqx0Var = (tqx0) obj;
        return u890.j(this.a, tqx0Var.a) && u890.j(this.b, tqx0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
