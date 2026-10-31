package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wc7 extends fqo1 {
    public final yd7 e;

    public wc7(yd7 yd7Var) {
        this.e = yd7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc7) && u890.j(this.e, ((wc7) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
