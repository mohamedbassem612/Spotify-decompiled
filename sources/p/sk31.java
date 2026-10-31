package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sk31 {
    public final int a;
    public final String b;

    public sk31(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk31)) {
            return false;
        }
        sk31 sk31Var = (sk31) obj;
        return this.a == sk31Var.a && u890.j(this.b, sk31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
