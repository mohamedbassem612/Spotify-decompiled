package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zb extends ac {
    public final int a;

    public zb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb) && this.a == ((zb) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
