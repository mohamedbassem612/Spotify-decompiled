package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vy01 extends syo1 {
    public final kee1 c;

    public vy01(kee1 kee1Var) {
        this.c = kee1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy01) && this.c.equals(((vy01) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
