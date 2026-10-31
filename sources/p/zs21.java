package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zs21 {
    public final boolean a;

    public zs21(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs21) && this.a == ((zs21) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
