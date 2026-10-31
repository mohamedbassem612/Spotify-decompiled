package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iu9 extends a4p1 {
    public final String c;

    public iu9(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu9) && u890.j(this.c, ((iu9) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
