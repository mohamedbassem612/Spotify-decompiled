package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oop0 {
    public final boolean a;

    public oop0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oop0) && this.a == ((oop0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
