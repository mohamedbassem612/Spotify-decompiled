package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tdz0 implements wdz0 {
    public final jh9 a;

    public tdz0(jh9 jh9Var) {
        this.a = jh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdz0) && u890.j(this.a, ((tdz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
