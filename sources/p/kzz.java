package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kzz implements x600 {
    public final String a;

    public kzz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kzz) && this.a.equals(((kzz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
