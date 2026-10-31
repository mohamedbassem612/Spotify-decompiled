package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zue1 extends si1 {
    public final int e;
    public final dte1 f;

    public zue1(int i, dte1 dte1Var) {
        this.e = i;
        this.f = dte1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zue1)) {
            return false;
        }
        zue1 zue1Var = (zue1) obj;
        return this.e == zue1Var.e && this.f.equals(zue1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (Integer.hashCode(this.e) * 31);
    }

    @Override // p.si1
    public final int o() {
        return this.e;
    }
}
