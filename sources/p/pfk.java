package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pfk extends nln {
    public final String e;

    public pfk(String str) {
        super((byte) 4);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfk) && this.e.equals(((pfk) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
