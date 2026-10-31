package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zm11 {
    public final String a;

    public zm11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm11) && this.a.equals(((zm11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
