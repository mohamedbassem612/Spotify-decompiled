package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kk51 {
    public final String a;

    public kk51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kk51) && this.a.equals(((kk51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
