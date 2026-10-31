package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ys1 implements bt1 {
    public final int a;

    public ys1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys1) && this.a == ((ys1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
