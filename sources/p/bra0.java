package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bra0 implements sra0 {
    public final boolean a;

    public bra0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bra0) && this.a == ((bra0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
