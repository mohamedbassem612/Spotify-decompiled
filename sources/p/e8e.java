package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e8e {
    public final bi90 a;

    public e8e(bi90 bi90Var) {
        this.a = bi90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8e) && this.a.equals(((e8e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
