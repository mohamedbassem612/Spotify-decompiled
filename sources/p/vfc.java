package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vfc implements nwo0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ vfc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.nwo0
    public final owo0 a(q2p0 q2p0Var, ivn0 ivn0Var, v1r0 v1r0Var, kko kkoVar) {
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 1;
        byte b4 = 2;
        byte b5 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new wfc((xvp) obj, b5);
            case 1:
                return new wfc((mmr) obj, b3);
            case 2:
                return new e7o((cvp) obj, kkoVar, b5);
            case 3:
                return new wfc((evp) obj, b4);
            case 4:
                return new tkv((otu) obj, (byte) 0);
            case 5:
                return new wfc((fvp) obj, b2);
            case 6:
                return new wfc((ivp) obj, (byte) 4);
            case 7:
                return new e7o((dg90) obj, q2p0Var.c().a(), b4);
            case 8:
                return new wfc((l0x0) obj, (byte) 5);
            case 9:
                return new e7o((jvp) obj, q2p0Var.c().a(), b2);
            case 10:
                return new wfc((nvp) obj, (byte) 6);
            case 11:
                return new wfc((gvp) obj, (byte) 7);
            case 12:
                aru0 aru0Var = (aru0) obj;
                n6r0 n6r0VarI = q2p0Var.i();
                lik1 lik1VarE = q2p0Var.e();
                return new tkv(new dx0(((jep) aru0Var.b).a(false), ((ubv0) aru0Var.c).a((yeu0) aru0Var.d, lik1VarE), n6r0VarI, lik1VarE), (byte) 1);
            default:
                return new r7m((bwp) obj, q2p0Var.c().c(), q2p0Var.c().a(), b4);
        }
    }
}
