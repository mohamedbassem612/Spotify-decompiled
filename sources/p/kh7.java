package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kh7 {
    public final String a;

    public kh7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh7) && this.a.equals(((kh7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
