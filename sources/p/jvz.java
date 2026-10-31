package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jvz implements y600 {
    public final String a;

    public jvz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvz) && u890.j(this.a, ((jvz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
