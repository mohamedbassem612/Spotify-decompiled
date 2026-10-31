package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ox81 {
    public final j4b1 a;

    public ox81(j4b1 j4b1Var) {
        this.a = j4b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ox81) && this.a == ((ox81) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(2131101695) + (this.a.hashCode() * 31);
    }
}
