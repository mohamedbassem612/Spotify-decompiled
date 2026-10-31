package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kce {
    public final String a;

    public kce(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kce) && this.a.equals(((kce) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
