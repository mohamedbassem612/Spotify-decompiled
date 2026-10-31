package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xb {
    public final boolean a;
    public final int b;

    public xb(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb)) {
            return false;
        }
        xb xbVar = (xb) obj;
        return this.a == xbVar.a && this.b == xbVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
