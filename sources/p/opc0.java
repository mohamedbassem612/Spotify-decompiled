package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class opc0 implements rpc0 {
    public final qnc0 a;

    public opc0(qnc0 qnc0Var) {
        this.a = qnc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opc0) && this.a.equals(((opc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
