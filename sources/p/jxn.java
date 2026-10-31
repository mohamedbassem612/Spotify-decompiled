package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jxn implements ez00 {
    public final fg51 a;

    public jxn(fg51 fg51Var) {
        this.a = fg51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxn) && this.a.equals(((jxn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
