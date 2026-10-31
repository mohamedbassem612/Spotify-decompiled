package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s0l1 extends f1l1 {
    public final boolean a;

    public s0l1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0l1) && this.a == ((s0l1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
