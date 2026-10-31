package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jvm1 implements h0r0 {
    public final cbr0 a;
    public final q1n0 b;
    public final k8m0 c;
    public final n1t d;
    public final kvq e;

    public jvm1(cbr0 cbr0Var, q1n0 q1n0Var, k8m0 k8m0Var, n1t n1tVar, kvq kvqVar) {
        this.a = cbr0Var;
        this.b = q1n0Var;
        this.c = k8m0Var;
        this.d = n1tVar;
        this.e = kvqVar;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.a;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return new k9r(this.b, this.c, new fak1(this, (byte) 24), (byte) 12);
    }
}
