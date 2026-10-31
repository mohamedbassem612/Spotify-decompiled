package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fuj0 implements ez00 {
    public final boolean a;

    public fuj0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fuj0) && this.a == ((fuj0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
