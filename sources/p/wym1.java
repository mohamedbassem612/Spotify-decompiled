package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wym1 implements yym1 {
    public final byte a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public wym1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wym1)) {
            return false;
        }
        wym1 wym1Var = (wym1) obj;
        return this.a == wym1Var.a && u890.j(this.b, wym1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
