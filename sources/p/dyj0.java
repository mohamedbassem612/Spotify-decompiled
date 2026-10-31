package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dyj0 {
    public final v3u a;
    public final giq0 b;

    public dyj0(v3u v3uVar, giq0 giq0Var) {
        this.a = v3uVar;
        this.b = giq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyj0)) {
            return false;
        }
        dyj0 dyj0Var = (dyj0) obj;
        return this.a.equals(dyj0Var.a) && this.b == dyj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
