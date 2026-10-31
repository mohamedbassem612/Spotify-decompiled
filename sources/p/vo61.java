package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vo61 implements wo61 {
    public final tr80 a;

    public vo61(tr80 tr80Var) {
        this.a = tr80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo61) && this.a.equals(((vo61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
