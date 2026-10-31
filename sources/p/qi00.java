package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qi00 extends li00 {
    public final pi00 a;

    public qi00(pi00 pi00Var) {
        this.a = pi00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qi00) && this.a.equals(((qi00) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
