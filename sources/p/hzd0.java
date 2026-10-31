package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hzd0 implements qzd0 {
    public final String a;

    public hzd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzd0) && this.a.equals(((hzd0) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.a.hashCode() * 31);
    }
}
