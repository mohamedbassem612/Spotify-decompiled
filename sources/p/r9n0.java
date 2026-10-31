package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r9n0 extends op71 {
    public final String c;

    public r9n0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9n0) && this.c.equals(((r9n0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
