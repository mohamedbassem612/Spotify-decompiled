package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zzi0 extends a0j0 {
    public final boolean a;

    public zzi0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzi0) && this.a == ((zzi0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
