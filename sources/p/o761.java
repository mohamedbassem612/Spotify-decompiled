package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o761 {
    public final String a;

    public o761(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o761) && this.a.equals(((o761) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
