package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jle1 {
    public final rih1 a = rih1.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jle1) && this.a == ((jle1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
