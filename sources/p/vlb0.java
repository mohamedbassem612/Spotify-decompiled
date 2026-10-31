package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vlb0 implements wlb0 {
    public final int a;

    public vlb0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlb0) && this.a == ((vlb0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
