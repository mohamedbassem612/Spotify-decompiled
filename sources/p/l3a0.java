package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l3a0 implements q3a0 {
    public final boolean a;

    public l3a0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3a0) && this.a == ((l3a0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
