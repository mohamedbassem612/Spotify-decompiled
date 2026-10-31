package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class foj0 extends hoj0 {
    public final int a;

    public foj0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof foj0) && this.a == ((foj0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
