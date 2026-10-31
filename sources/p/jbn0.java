package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jbn0 implements lbn0 {
    public final qbn0 a;

    public jbn0(qbn0 qbn0Var) {
        this.a = qbn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbn0) && u890.j(this.a, ((jbn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
