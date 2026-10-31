package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cvl implements cwl {
    public final qd60 a;

    public cvl(qd60 qd60Var) {
        this.a = qd60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvl) && this.a.equals(((cvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
