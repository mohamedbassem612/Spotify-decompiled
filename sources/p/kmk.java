package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kmk implements omk {
    public final fbh0 a;

    public kmk(fbh0 fbh0Var) {
        this.a = fbh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmk) && this.a.equals(((kmk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
