package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bun {
    public final cp11 a;

    public bun(cp11 cp11Var) {
        this.a = cp11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bun) && this.a.equals(((bun) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
