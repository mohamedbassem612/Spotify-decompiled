package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class he71 {
    public final String a;

    public he71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he71) && this.a.equals(((he71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
