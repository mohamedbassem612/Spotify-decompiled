package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nag1 {
    public static final nag1 c = new nag1("", 0);
    public final String a;
    public final int b;

    public nag1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nag1)) {
            return false;
        }
        nag1 nag1Var = (nag1) obj;
        return this.a.equals(nag1Var.a) && this.b == nag1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
