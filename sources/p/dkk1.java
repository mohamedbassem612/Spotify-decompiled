package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dkk1 implements tj0 {
    public final int a;

    public dkk1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkk1) && this.a == ((dkk1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
