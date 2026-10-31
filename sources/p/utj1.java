package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class utj1 implements cuj1 {
    public final oi31 a;

    public utj1(oi31 oi31Var) {
        this.a = oi31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof utj1) && u890.j(this.a, ((utj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
