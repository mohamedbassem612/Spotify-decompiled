package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w301 implements y301 {
    public final d301 a;

    public w301(d301 d301Var) {
        this.a = d301Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w301) && this.a.equals(((w301) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
