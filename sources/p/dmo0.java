package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dmo0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y1c1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dmo0(y1c1 y1c1Var, byte b) {
        super(1);
        this.a = b;
        this.b = y1c1Var;
    }

    public final Object invoke(Object obj) {
        amo0 amo0Var;
        mmr0 m231Var;
        byte b = this.a;
        y1c1 y1c1Var = this.b;
        switch (b) {
            case 0:
                yb10 yb10Var = yb10.R0;
                aoo0 aoo0Var = ((boo0) ((w2c1) y1c1Var).U(boo0.class).getValue()).a;
                if (aoo0Var instanceof yno0) {
                    amo0Var = ylo0.a;
                } else {
                    if (!(aoo0Var instanceof zno0)) {
                        eg.o();
                        return null;
                    }
                    amo0Var = zlo0.a;
                }
                return new bmo0("", amo0Var, yb10Var);
            case 1:
                ((qtr) obj).b(new skv(y1c1Var, (lnm) null, (byte) 29));
                return rih1.a;
            case 2:
                String str = (String) obj;
                try {
                    m231Var = ((w2c1) y1c1Var).V(ad2.class);
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    return new kdn0();
                }
                mmr0 mmr0VarV = ((w2c1) y1c1Var).V(ad2.class);
                return w6d1.q(wgo1.F((ymd0) mmr0VarV.a, mmr0VarV.b), new q4z0(str, (byte) 19));
            case 3:
                o3r o3rVar = vmd1.a;
                return new elo(y1c1Var, (byte) 1);
            case 4:
                o3r o3rVar2 = vmd1.a;
                return new yxu(y1c1Var, (byte) 1);
            case 5:
                return ((w2c1) y1c1Var).U(qae.class);
            case 6:
                o3r o3rVar3 = vmd1.a;
                return new rmd1(y1c1Var);
            case 7:
                o3r o3rVar4 = vmd1.a;
                return new smd1(y1c1Var);
            case 8:
                o3r o3rVar5 = vmd1.a;
                return new umd1(y1c1Var);
            case 9:
                return vmd1.b(y1c1Var);
            default:
                String str2 = (String) obj;
                zob1 zob1VarU = ((w2c1) y1c1Var).U(k2v.class);
                k2v k2vVar = (k2v) zob1VarU.getValue();
                m441 m441Var = new m441(new bfb1(zob1VarU, str2, (lnm) null, (byte) 22));
                h2v h2vVar = (h2v) k2vVar.a.get(str2);
                q1v q1vVarD = q1v.a;
                q1v q1vVarD2 = h2vVar != null ? rwq0.D(h2vVar) : q1vVarD;
                h2v h2vVar2 = (h2v) k2vVar.b.get(str2);
                if (h2vVar2 != null) {
                    q1vVarD = rwq0.D(h2vVar2);
                }
                dt11 dt11Var = new dt11(q1vVarD2, q1vVarD);
                fai0 fai0Var = new fai0();
                fai0Var.m(dt11Var);
                fai0Var.n(t5p1.j(m441Var, 3), new u160(fai0Var, (byte) 2));
                return fai0Var;
        }
    }
}
