package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jte1 {
    public final String a;

    public jte1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jte1) && this.a.equals(((jte1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
