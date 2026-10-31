package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zly {
    public final bjw0 a;

    public zly(bjw0 bjw0Var) {
        this.a = bjw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zly) && this.a.equals(((zly) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
