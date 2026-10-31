package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lxn implements txn {
    public final int a;

    public lxn(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxn) && this.a == ((lxn) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
