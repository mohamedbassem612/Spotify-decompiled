package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qv60 {
    public final int a;

    public qv60(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qv60) && this.a == ((qv60) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
