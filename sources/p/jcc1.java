package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jcc1 extends kcc1 {
    public final String a;

    public jcc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcc1) && this.a.equals(((jcc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
