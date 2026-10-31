package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ikp0 extends t9p1 {
    public final l0l c;

    public ikp0(l0l l0lVar) {
        this.c = l0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ikp0) && u890.j(this.c, ((ikp0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
