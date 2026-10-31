package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mft0 implements pft0 {
    public final int a;

    public mft0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mft0) && this.a == ((mft0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
