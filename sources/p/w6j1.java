package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w6j1 implements y6j1 {
    public final so20 a;

    public w6j1(so20 so20Var) {
        this.a = so20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6j1) && this.a.equals(((w6j1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
