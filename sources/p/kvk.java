package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kvk {
    public final boolean a;

    public kvk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvk) && this.a == ((kvk) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
