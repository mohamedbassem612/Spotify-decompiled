package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class so81 extends s9p1 {
    public final c6s0 c;

    public so81(c6s0 c6s0Var) {
        this.c = c6s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so81) && this.c.equals(((so81) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
