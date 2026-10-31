package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hlr0 {
    public final short a;

    public /* synthetic */ hlr0() {
        this(350);
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hlr0) && this.a == ((hlr0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Integer.hashCode(this.a) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hlr0(int i) {
        this.a = i;
    }
}
