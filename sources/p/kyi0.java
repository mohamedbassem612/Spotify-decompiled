package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kyi0 implements lyi0 {
    public final String a;

    public kyi0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyi0) && this.a.equals(((kyi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
