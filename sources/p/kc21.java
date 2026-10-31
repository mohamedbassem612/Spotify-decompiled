package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kc21 implements mc21 {
    public final String a;

    public kc21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kc21) && this.a.equals(((kc21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
