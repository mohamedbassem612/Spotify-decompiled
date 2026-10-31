package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hvl implements cwl {
    public final sna0 a;

    public hvl(sna0 sna0Var) {
        this.a = sna0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvl) && this.a.equals(((hvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
