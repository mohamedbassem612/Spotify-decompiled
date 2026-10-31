package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jg1 {
    public final String a;

    public jg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg1) && this.a.equals(((jg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
