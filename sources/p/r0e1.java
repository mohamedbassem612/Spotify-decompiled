package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r0e1 implements t0e1 {
    public final chf0 a;

    public r0e1(chf0 chf0Var) {
        this.a = chf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0e1) && this.a == ((r0e1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
