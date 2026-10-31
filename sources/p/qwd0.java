package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qwd0 extends swd0 {
    public final int a;

    public qwd0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwd0) && this.a == ((qwd0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
