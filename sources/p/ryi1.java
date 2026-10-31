package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ryi1 extends yoi1 {
    public final String h;

    public ryi1(String str) {
        super((byte) 21);
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ryi1) && this.h.equals(((ryi1) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
