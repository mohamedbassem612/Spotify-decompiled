package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kd7 extends ld7 {
    public final boolean a;

    public kd7(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd7) && this.a == ((kd7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
