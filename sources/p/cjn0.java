package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cjn0 extends fjn0 {
    public final int a;

    public cjn0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjn0) && this.a == ((cjn0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
