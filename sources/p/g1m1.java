package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g1m1 implements r1m1 {
    public final boolean a;

    public g1m1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1m1) && this.a == ((g1m1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
