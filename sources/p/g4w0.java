package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g4w0 extends i4w0 {
    public final String a;

    public g4w0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g4w0) && this.a.equals(((g4w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
