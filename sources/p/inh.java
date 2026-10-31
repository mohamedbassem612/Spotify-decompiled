package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class inh implements snh {
    public final s9k1 a;

    public inh(s9k1 s9k1Var) {
        this.a = s9k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inh) && this.a.equals(((inh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
