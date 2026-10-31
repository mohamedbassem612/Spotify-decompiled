package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class na60 implements qa60 {
    public final String a;

    public na60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof na60) && this.a.equals(((na60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
