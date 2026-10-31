package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dre implements jre {
    public final int a;

    public dre(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dre) && this.a == ((dre) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
