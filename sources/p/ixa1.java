package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ixa1 implements ez00 {
    public final boolean a;

    public ixa1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixa1) && this.a == ((ixa1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
