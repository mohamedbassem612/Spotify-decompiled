package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yad1 implements zad1, ggb1 {
    public final gho1 a;

    public yad1(gho1 gho1Var) {
        this.a = gho1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yad1) && this.a.equals(((yad1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
