package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gx {
    public final int a;
    public final boolean b;

    public gx(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx)) {
            return false;
        }
        gx gxVar = (gx) obj;
        return this.a == gxVar.a && this.b == gxVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
