package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a5w implements c5w {
    public final String a;

    public a5w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5w) && u890.j(this.a, ((a5w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
