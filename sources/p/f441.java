package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f441 implements e0x {
    public final e441 a;

    public f441(e441 e441Var) {
        this.a = e441Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f441) && this.a.equals(((f441) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
