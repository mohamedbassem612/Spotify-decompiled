package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jn6 {
    public final String a;

    public jn6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jn6) && u890.j(this.a, ((jn6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
