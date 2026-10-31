package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bvl implements cwl {
    public final ej40 a;

    public bvl(ej40 ej40Var) {
        this.a = ej40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvl) && this.a.equals(((bvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
