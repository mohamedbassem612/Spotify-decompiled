package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y1d0 implements a2d0 {
    public final int a;

    public y1d0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1d0) && this.a == ((y1d0) obj).a;
    }

    @Override // p.a2d0
    public final int getReason() {
        return this.a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
