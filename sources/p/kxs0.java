package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kxs0 {
    public final String a;

    public kxs0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxs0) && this.a.equals(((kxs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
