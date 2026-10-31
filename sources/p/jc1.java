package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jc1 implements pc1 {
    public final String a;

    public jc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc1) && u890.j(this.a, ((jc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
