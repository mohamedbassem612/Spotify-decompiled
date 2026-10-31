package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tm3 extends ym3 {
    public final jm3 a;

    public tm3(jm3 jm3Var) {
        this.a = jm3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm3) && this.a.equals(((tm3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
