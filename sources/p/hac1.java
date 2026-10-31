package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hac1 extends sio1 {
    public final o7c1 c;

    public hac1(o7c1 o7c1Var) {
        this.c = o7c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hac1) && this.c.equals(((hac1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
