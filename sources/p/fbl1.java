package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fbl1 implements ez00 {
    public final kkn a;

    public fbl1(kkn kknVar) {
        this.a = kknVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbl1) && this.a.equals(((fbl1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
