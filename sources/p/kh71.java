package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kh71 extends u1p1 {
    public final k371 c;

    public kh71(k371 k371Var) {
        this.c = k371Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh71) && u890.j(this.c, ((kh71) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
