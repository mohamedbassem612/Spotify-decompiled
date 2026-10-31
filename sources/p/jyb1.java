package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jyb1 implements lyb1 {
    public final String a;

    public jyb1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyb1) && this.a.equals(((jyb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
