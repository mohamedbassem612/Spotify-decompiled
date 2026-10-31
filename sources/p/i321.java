package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i321 extends l6p1 {
    public final String d;

    public i321(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i321) && this.d.equals(((i321) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
