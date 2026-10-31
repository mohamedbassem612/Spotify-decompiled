package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zql1 implements ybj1 {
    public final boolean a;

    public zql1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zql1) && this.a == ((zql1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
