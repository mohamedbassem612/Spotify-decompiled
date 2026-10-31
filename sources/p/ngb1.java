package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ngb1 {
    public final on71 a;

    public ngb1(on71 on71Var) {
        this.a = on71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngb1) && this.a.equals(((ngb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
