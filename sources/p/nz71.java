package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nz71 {
    public final String a;

    public nz71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nz71) && this.a.equals(((nz71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
