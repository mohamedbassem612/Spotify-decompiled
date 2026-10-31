package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dra0 implements sra0 {
    public final lpu a;

    public dra0(lpu lpuVar) {
        this.a = lpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dra0) && u890.j(this.a, ((dra0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
