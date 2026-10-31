package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jmk implements omk {
    public final String a;

    public jmk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmk) && u890.j(this.a, ((jmk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
