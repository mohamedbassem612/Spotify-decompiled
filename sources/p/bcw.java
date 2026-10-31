package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bcw implements oiw {
    public final String a;

    public bcw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcw) && u890.j(this.a, ((bcw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
