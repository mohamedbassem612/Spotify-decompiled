package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dv31 implements aw31 {
    public final int a;

    public dv31(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv31) && this.a == ((dv31) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int p() {
        return this.a;
    }
}
