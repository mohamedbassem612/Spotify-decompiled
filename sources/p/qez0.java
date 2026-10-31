package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qez0 extends uez0 {
    public final pk1 a;

    public qez0(pk1 pk1Var) {
        this.a = pk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qez0) && this.a.equals(((qez0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
