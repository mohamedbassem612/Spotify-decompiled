package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pl41 implements ul41 {
    public final String a;

    public pl41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pl41) && u890.j(this.a, ((pl41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
