package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yv8 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ evz b;

    public /* synthetic */ yv8(evz evzVar, byte b) {
        this.a = b;
        this.b = evzVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 8;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        evz evzVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = evzVar.collect(new nz7(vr20Var, (byte) 7), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = evzVar.collect(new kmf(vr20Var, (byte) 26), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = evzVar.collect(new x1h(vr20Var, (byte) 19), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = evzVar.collect(new rir(vr20Var, (byte) 5), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = evzVar.collect(new uk50(vr20Var, b2), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = evzVar.collect(new xtj0(vr20Var, (byte) 10), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = evzVar.collect(new dgk0(vr20Var, (byte) 24), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = evzVar.collect(new r4t0(vr20Var, (byte) 5), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = evzVar.collect(new lpl1(vr20Var, (byte) 3), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = evzVar.collect(new lpl1(vr20Var, (byte) 8), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = evzVar.collect(new lpl1(vr20Var, (byte) 9), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            default:
                Object objCollect12 = evzVar.collect(new lpl1(vr20Var, (byte) 13), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
        }
    }
}
