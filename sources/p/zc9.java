package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zc9 implements ed9 {
    public final boolean a;

    public zc9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc9) && this.a == ((zc9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
