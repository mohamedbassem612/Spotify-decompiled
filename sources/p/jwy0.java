package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jwy0 extends kwy0 {
    public final String a;

    public jwy0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwy0) && u890.j(this.a, ((jwy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
