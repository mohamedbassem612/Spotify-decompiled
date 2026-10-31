package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n0h {
    public final String a;

    public n0h(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0h) && this.a.equals(((n0h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
