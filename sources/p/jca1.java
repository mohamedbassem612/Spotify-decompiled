package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jca1 implements kca1 {
    public final String a;

    public jca1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jca1) && this.a.equals(((jca1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
