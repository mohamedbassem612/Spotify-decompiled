package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zi00 extends li00 {
    public final sh51 a;

    public zi00(sh51 sh51Var) {
        this.a = sh51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi00) && this.a.equals(((zi00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
