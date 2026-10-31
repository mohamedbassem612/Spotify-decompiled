package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tfh {
    public final String a;
    public final k8p1 b;
    public final bce0 c;

    public tfh(String str, k8p1 k8p1Var, bce0 bce0Var) {
        this.a = str;
        this.b = k8p1Var;
        this.c = bce0Var;
    }

    public static tfh a(tfh tfhVar, String str, k8p1 k8p1Var, bce0 bce0Var, int i) {
        if ((i & 1) != 0) {
            str = tfhVar.a;
        }
        if ((i & 2) != 0) {
            k8p1Var = tfhVar.b;
        }
        if ((i & 4) != 0) {
            bce0Var = tfhVar.c;
        }
        tfhVar.getClass();
        return new tfh(str, k8p1Var, bce0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfh)) {
            return false;
        }
        tfh tfhVar = (tfh) obj;
        return this.a.equals(tfhVar.a) && this.b.equals(tfhVar.b) && this.c.equals(tfhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
