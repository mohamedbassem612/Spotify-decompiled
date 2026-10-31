package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b7e0 implements d7e0 {
    public final y6l1 a;
    public final String b;

    public b7e0(String str, y6l1 y6l1Var) {
        this.a = y6l1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7e0)) {
            return false;
        }
        b7e0 b7e0Var = (b7e0) obj;
        return this.a.equals(b7e0Var.a) && this.b.equals(b7e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
