package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zvl implements cwl {
    public final svi1 a;

    public zvl(svi1 svi1Var) {
        this.a = svi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zvl) && this.a.equals(((zvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
