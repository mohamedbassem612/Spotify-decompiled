package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yfz extends grn1 {
    public final String e;

    public yfz(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yfz) && u890.j(this.e, ((yfz) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
