package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nke {
    public final String a;

    public nke(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nke) && u890.j(this.a, ((nke) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
