package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rxe0 implements w11 {
    public final int a;

    public rxe0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxe0) && this.a == ((rxe0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
