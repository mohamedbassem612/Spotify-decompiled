package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class srg0 extends rzn1 {
    public final String f;

    public srg0(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srg0) && this.f.equals(((srg0) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
