package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w110 implements z110 {
    public final iu30 a;

    public w110(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w110) && this.a.equals(((w110) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
