package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pcx0 extends rcx0 {
    public final String a;

    public pcx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcx0) && this.a.equals(((pcx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
