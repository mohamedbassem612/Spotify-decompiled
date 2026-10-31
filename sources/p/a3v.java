package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a3v {
    public final String a;

    public a3v(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3v) && u890.j(this.a, ((a3v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
