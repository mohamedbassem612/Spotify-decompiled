package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e351 {
    public final sh91 a;

    public e351(sh91 sh91Var) {
        this.a = sh91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e351) && this.a.equals(((e351) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
