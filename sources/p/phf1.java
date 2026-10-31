package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class phf1 implements xn11 {
    public final String a;

    public phf1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phf1) && this.a.equals(((phf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
