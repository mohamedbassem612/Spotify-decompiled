package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ma60 implements qa60 {
    public final String a;

    public ma60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma60) && this.a.equals(((ma60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
