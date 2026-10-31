package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kh20 extends lh20 {
    public final String a;

    public kh20(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh20) && this.a.equals(((kh20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
