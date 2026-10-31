package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jdf implements bef {
    public final String a;

    public jdf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdf) && u890.j(this.a, ((jdf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
