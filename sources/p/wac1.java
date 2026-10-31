package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wac1 extends ebc1 {
    public final kas0 a;

    public wac1(kas0 kas0Var) {
        this.a = kas0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wac1) && this.a == ((wac1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
