package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jk7 implements lk7 {
    public final String a;

    public jk7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jk7) && this.a.equals(((jk7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
