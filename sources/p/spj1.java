package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class spj1 {
    public final knj1 a;

    public spj1(knj1 knj1Var) {
        this.a = knj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof spj1) && this.a == ((spj1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
