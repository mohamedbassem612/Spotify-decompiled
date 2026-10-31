package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b81 implements d81 {
    public final n4f0 a;

    public b81(n4f0 n4f0Var) {
        this.a = n4f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b81) && u890.j(this.a, ((b81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
