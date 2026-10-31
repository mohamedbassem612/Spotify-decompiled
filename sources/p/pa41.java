package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pa41 extends ha71 {
    public final boolean c;

    public pa41(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa41) && this.c == ((pa41) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
