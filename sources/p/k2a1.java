package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k2a1 implements m2a1 {
    public final int a;

    public k2a1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2a1) && this.a == ((k2a1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
