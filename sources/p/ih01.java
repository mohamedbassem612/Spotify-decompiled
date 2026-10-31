package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ih01 implements lh01 {
    public final ci01 a;

    public ih01(ci01 ci01Var) {
        this.a = ci01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih01) && this.a.equals(((ih01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
