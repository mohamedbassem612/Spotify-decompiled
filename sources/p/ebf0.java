package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ebf0 extends h7w {
    public final c380 d;

    public ebf0(c380 c380Var) {
        this.d = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebf0) && u890.j(this.d, ((ebf0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
