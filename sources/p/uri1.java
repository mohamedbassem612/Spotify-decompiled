package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uri1 extends vxo1 {
    public final k6d1 c;

    public uri1(k6d1 k6d1Var) {
        this.c = k6d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uri1) && this.c == ((uri1) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
