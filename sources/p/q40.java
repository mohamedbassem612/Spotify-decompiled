package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q40 {
    public final x40 a;

    public q40(x40 x40Var) {
        this.a = x40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q40) && this.a.equals(((q40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
