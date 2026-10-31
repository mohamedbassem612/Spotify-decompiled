package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ljb0 implements d9j1 {
    public final saj1 a;
    public final String b;

    public ljb0(saj1 saj1Var, String str) {
        this.a = saj1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljb0)) {
            return false;
        }
        ljb0 ljb0Var = (ljb0) obj;
        return this.a.equals(ljb0Var.a) && this.b.equals(ljb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
