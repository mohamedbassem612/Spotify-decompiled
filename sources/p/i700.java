package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i700 {
    public final w6v0 a;

    public i700(w6v0 w6v0Var) {
        this.a = w6v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i700) && this.a == ((i700) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
