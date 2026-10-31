package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h7r0 extends upn1 {
    public final boolean c;

    public h7r0(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7r0) && this.c == ((h7r0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
