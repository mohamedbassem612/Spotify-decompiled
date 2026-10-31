package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class plp0 implements ulp0 {
    public final boolean a;

    public plp0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof plp0) && this.a == ((plp0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
