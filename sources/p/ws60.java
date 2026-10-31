package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ws60 extends cto1 {
    public final int b;

    public ws60(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ws60) && this.b == ((ws60) obj).b;
    }

    public final int hashCode() {
        return l1d.C(this.b);
    }
}
