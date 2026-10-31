package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w490 extends vbe {
    public final Throwable e;

    public w490(Throwable th) {
        super((byte) 9);
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w490) && u890.j(this.e, ((w490) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return super.toString();
    }
}
