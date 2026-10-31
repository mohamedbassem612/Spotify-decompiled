package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jyz0 implements kyz0 {
    public final myz0 a;

    public jyz0(myz0 myz0Var) {
        this.a = myz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyz0) && this.a.equals(((jyz0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
