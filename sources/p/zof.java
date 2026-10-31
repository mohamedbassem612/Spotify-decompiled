package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zof extends kuo1 {
    public final String b;

    public zof(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zof) && this.b.equals(((zof) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
