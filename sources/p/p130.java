package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p130 implements h0r0 {
    public final cbr0 a;
    public final q1n0 b;
    public final k8m0 c;
    public final zzr d;
    public final vhp e;

    public p130(cbr0 cbr0Var, q1n0 q1n0Var, k8m0 k8m0Var, zzr zzrVar, vhp vhpVar) {
        this.a = cbr0Var;
        this.b = q1n0Var;
        this.c = k8m0Var;
        this.d = zzrVar;
        this.e = vhpVar;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.a;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return new k9r(this.b, this.c, new rr10(this, (byte) 9), (byte) 12);
    }
}
