package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zsa {
    public final String a;

    public zsa(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsa) && this.a.equals(((zsa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
