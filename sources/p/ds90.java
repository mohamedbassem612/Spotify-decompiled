package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ds90 implements fs90 {
    public final int a;

    public ds90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds90) && this.a == ((ds90) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
