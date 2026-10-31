package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class djt implements dkt {
    public final int a;
    public final int b;

    public djt(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djt)) {
            return false;
        }
        djt djtVar = (djt) obj;
        return this.a == djtVar.a && this.b == djtVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ab80.k(this.b, l1d.C(this.a) * 31, 31);
    }
}
