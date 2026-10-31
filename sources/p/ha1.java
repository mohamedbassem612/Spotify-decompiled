package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ha1 extends wa1 {
    public final String a;

    public ha1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha1) && this.a.equals(((ha1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
