package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d0f0 implements f0f0 {
    public final n4f0 a;

    public d0f0(n4f0 n4f0Var) {
        this.a = n4f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0f0) && u890.j(this.a, ((d0f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
