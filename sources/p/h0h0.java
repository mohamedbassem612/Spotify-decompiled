package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h0h0 implements k0h0 {
    public final String a;

    public h0h0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0h0) && this.a.equals(((h0h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
