package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kvl implements cwl {
    public final mwi0 a;

    public kvl(mwi0 mwi0Var) {
        this.a = mwi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvl) && this.a.equals(((kvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
