package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ah00 extends mh00 {
    public final String a;
    public final rod0 b;

    public ah00(String str, rod0 rod0Var) {
        this.a = str;
        this.b = rod0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah00)) {
            return false;
        }
        ah00 ah00Var = (ah00) obj;
        return u890.j(this.a, ah00Var.a) && this.b.equals(ah00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
