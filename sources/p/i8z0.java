package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i8z0 extends z8z0 {
    public final int a;

    public i8z0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8z0) && this.a == ((i8z0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
