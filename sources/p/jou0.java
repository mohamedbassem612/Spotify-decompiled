package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jou0 {
    public final String a;

    public jou0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jou0) && this.a.equals(((jou0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
