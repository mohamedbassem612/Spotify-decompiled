package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class coi0 implements doi0 {
    public final s521 a;

    public coi0(s521 s521Var) {
        this.a = s521Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof coi0) && this.a.equals(((coi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
