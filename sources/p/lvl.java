package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lvl implements cwl {
    public final qwi0 a;

    public lvl(qwi0 qwi0Var) {
        this.a = qwi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvl) && this.a.equals(((lvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
