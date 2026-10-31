package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zw50 implements bx50 {
    public final boolean a;

    public zw50(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zw50) && this.a == ((zw50) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
