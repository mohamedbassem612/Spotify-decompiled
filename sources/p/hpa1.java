package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hpa1 implements jpa1 {
    public final String a;

    public hpa1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpa1) && this.a.equals(((hpa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
