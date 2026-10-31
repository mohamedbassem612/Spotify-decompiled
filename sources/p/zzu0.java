package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zzu0 {
    public final boolean a;

    public zzu0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzu0) && this.a == ((zzu0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
