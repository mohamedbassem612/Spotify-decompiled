package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ibw0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kbw0 b;
    public final /* synthetic */ xpw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibw0(kbw0 kbw0Var, yxb0 yxb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = kbw0Var;
        this.c = yxb0Var;
    }

    public final Object invoke(Object obj) {
        mmr0 mmr0VarM;
        mmr0 mmr0VarM2;
        byte b = this.a;
        xpw xpwVar = this.c;
        x360 x360Var = null;
        kbw0 kbw0Var = this.b;
        switch (b) {
            case 0:
                sei0 sei0Var = (tei0) obj;
                if (sei0Var instanceof sei0) {
                    if (!jhi0.a.contains(((lmo) kbw0Var.c.c).a)) {
                        x360Var = sei0Var.d;
                    }
                }
                String str = sei0Var.b().b;
                smc0 smc0VarN = k4p1.n();
                if (x360Var != null && (mmr0VarM = kbw0Var.j.m(x360Var)) != null) {
                    smc0VarN.add(new hg51((xpw) mmr0VarM.a, mmr0VarM.b, kbw0Var.d.b));
                }
                smc0VarN.add(new hg51(xpwVar, sei0Var.b(), 0));
                return new ig51(str, k4p1.k(smc0VarN), new hbw0(sei0Var, (byte) 0));
            default:
                sei0 sei0Var2 = (tei0) obj;
                if (sei0Var2 instanceof sei0) {
                    if (!jhi0.a.contains(((lmo) kbw0Var.c.c).a)) {
                        x360Var = sei0Var2.d;
                    }
                }
                String str2 = sei0Var2.b().b;
                smc0 smc0VarN2 = k4p1.n();
                if (x360Var != null && (mmr0VarM2 = kbw0Var.j.m(x360Var)) != null) {
                    smc0VarN2.add(new hg51((xpw) mmr0VarM2.a, mmr0VarM2.b, kbw0Var.d.b));
                }
                smc0VarN2.add(new hg51(xpwVar, sei0Var2.b(), 0));
                return new ig51(str2, k4p1.k(smc0VarN2), new hbw0(sei0Var2, (byte) 1));
        }
    }
}
