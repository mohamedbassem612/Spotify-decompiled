package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zfh0 implements dgh0 {
    public final boolean a;

    public zfh0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfh0) && this.a == ((zfh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
