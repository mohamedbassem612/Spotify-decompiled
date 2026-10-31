package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xvl implements cwl {
    public final iyf1 a;

    public xvl(iyf1 iyf1Var) {
        this.a = iyf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvl) && this.a.equals(((xvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
