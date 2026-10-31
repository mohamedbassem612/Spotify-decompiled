package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o9e extends ln90 {
    public final String c;

    public o9e(String str) {
        super(1);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9e) && u890.j(this.c, ((o9e) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return gvg.k(new StringBuilder("CategoryTitle(title="), this.c, ')');
    }
}
