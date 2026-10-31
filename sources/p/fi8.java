package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fi8 extends hi8 {
    public final ug8 a;

    public fi8(ug8 ug8Var) {
        this.a = ug8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi8) && this.a.equals(((fi8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
