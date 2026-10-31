package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sq50 implements xn11 {
    public final String a;

    public sq50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sq50) && this.a.equals(((sq50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
