package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jo7 {
    public final so20 a;

    public jo7(so20 so20Var) {
        this.a = so20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo7) && this.a.equals(((jo7) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
