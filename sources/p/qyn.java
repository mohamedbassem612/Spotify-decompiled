package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qyn {
    public final int a;
    public final int b;

    public qyn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyn)) {
            return false;
        }
        qyn qynVar = (qyn) obj;
        return this.a == qynVar.a && this.b == qynVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
