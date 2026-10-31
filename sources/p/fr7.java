package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fr7 extends jr7 {
    public final String a;

    public fr7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr7) && this.a.equals(((fr7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
