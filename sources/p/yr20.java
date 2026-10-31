package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yr20 implements bs20 {
    public final qs20 a;

    public yr20(qs20 qs20Var) {
        this.a = qs20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr20) && this.a.equals(((yr20) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
