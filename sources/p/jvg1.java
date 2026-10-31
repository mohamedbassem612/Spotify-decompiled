package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jvg1 {
    public final String a;

    public jvg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvg1) && u890.j(this.a, ((jvg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
