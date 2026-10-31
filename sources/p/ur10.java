package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ur10 implements miu {
    public final xx10 a;

    public ur10(xx10 xx10Var) {
        this.a = xx10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur10) && this.a.equals(((ur10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
