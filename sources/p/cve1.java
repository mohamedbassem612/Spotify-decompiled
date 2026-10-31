package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cve1 extends si1 {
    public final int e;
    public final rdi1 f;

    public cve1(int i, rdi1 rdi1Var) {
        this.e = i;
        this.f = rdi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cve1)) {
            return false;
        }
        cve1 cve1Var = (cve1) obj;
        return this.e == cve1Var.e && this.f.equals(cve1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (Integer.hashCode(this.e) * 31);
    }

    @Override // p.si1
    public final int o() {
        return this.e;
    }
}
