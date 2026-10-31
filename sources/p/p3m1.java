package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p3m1 extends b4m1 {
    public final int a;

    public p3m1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3m1) && this.a == ((p3m1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
