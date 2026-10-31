package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s8o0 implements dot {
    public final a0m a;

    public s8o0(a0m a0mVar) {
        this.a = a0mVar;
    }

    @Override // p.dot
    public final iu30 create() {
        ife0 ife0VarA = this.a.a();
        Integer numA = ife0VarA.a();
        mmr0 mmr0VarN = numA != null ? oqn1.n("ipv4prefix", String.valueOf(numA.intValue())) : null;
        Integer numB = ife0VarA.b();
        return new csb(sqg0.T(f46.i0(new mmr0[]{mmr0VarN, numB != null ? oqn1.n("ipv6prefix", String.valueOf(numB.intValue())) : null})), this);
    }
}
