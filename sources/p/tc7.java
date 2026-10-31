package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tc7 extends uc7 {
    public final wd7 a;

    public tc7(wd7 wd7Var) {
        this.a = wd7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc7) && this.a.equals(((tc7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
