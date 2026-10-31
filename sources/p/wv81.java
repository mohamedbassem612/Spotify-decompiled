package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wv81 {
    public final int a;
    public final c380 b;

    public wv81(int i, c380 c380Var) {
        this.a = i;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv81)) {
            return false;
        }
        wv81 wv81Var = (wv81) obj;
        return this.a == wv81Var.a && u890.j(this.b, wv81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
