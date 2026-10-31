package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fk4 {
    public final boolean a;

    public fk4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk4) && this.a == ((fk4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
