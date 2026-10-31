package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p1a1 extends q1a1 {
    public final int a;

    public p1a1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1a1) && this.a == ((p1a1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
