package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t2h0 implements e4h0 {
    public final lpu a;

    public t2h0(lpu lpuVar) {
        this.a = lpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2h0) && u890.j(this.a, ((t2h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
