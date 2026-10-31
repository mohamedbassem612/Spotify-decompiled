package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wum1 implements mtm1 {
    public final /* synthetic */ byte a;
    public final ley b;
    public final xpw c;

    public /* synthetic */ wum1(ley leyVar, xpw xpwVar, byte b) {
        this.a = b;
        this.b = leyVar;
        this.c = xpwVar;
    }

    @Override // p.mtm1
    public final String a(mhy mhyVar) {
        switch (this.a) {
            case 0:
                ihy ihyVar = (ihy) mhyVar;
                return "placeholder_" + ihyVar.a + "_" + ihyVar.b;
            default:
                ihy ihyVar2 = (ihy) mhyVar;
                return "placeholder_" + ihyVar2.a + "_" + ihyVar2.b;
        }
    }

    @Override // p.mtm1
    public final kpg0 b(ft30 ft30Var) {
        byte b = this.a;
        cx0 cx0Var = this.c;
        switch (b) {
            case 0:
                return new kpg0(cx0Var, new c4m1(this, (byte) 15));
            default:
                return new kpg0((br0) cx0Var, new c4m1(this, (byte) 16));
        }
    }
}
