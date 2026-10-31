package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h0e0 implements k0e0 {
    public final String a;

    public h0e0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0e0) && this.a.equals(((h0e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
