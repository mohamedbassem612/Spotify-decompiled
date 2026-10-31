package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qvl implements cwl {
    public final s0x0 a;

    public qvl(s0x0 s0x0Var) {
        this.a = s0x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvl) && this.a.equals(((qvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
