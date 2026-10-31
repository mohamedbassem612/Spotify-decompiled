package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bq81 extends sn81 {
    public final vov0 a;

    public bq81(vov0 vov0Var) {
        this.a = vov0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq81) && this.a.equals(((bq81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
