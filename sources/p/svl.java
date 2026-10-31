package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class svl implements cwl {
    public final tm11 a;

    public svl(tm11 tm11Var) {
        this.a = tm11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof svl) && this.a.equals(((svl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
