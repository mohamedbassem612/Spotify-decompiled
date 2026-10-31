package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cwj0 implements mwj0 {
    public final tv80 a;

    public cwj0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwj0) && this.a.equals(((cwj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
