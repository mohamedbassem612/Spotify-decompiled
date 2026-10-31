package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qxd implements sxd {
    public final int a;
    public final int b;

    public qxd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxd)) {
            return false;
        }
        qxd qxdVar = (qxd) obj;
        return this.a == qxdVar.a && this.b == qxdVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
