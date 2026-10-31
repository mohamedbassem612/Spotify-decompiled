package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class krk1 implements rrk1 {
    public final qrk1 a;
    public final String b;

    public krk1(qrk1 qrk1Var, String str) {
        this.a = qrk1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krk1)) {
            return false;
        }
        krk1 krk1Var = (krk1) obj;
        return this.a.equals(krk1Var.a) && u890.j(this.b, krk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
