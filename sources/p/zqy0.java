package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zqy0 {
    public final boolean a;

    public zqy0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqy0) && this.a == ((zqy0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
