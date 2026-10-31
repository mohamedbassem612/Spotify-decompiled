package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aho0 implements cho0 {
    public final int a;

    public aho0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aho0) && this.a == ((aho0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
