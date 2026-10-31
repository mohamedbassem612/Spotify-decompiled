package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nbb implements vbb {
    public final String a;

    public nbb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbb) && u890.j(this.a, ((nbb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
