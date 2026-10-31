package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zlp0 implements xpw {
    public final ic9 a;
    public final add b;
    public final String c;
    public final bmp0 d;
    public final q8n e;
    public final q8n f;
    public final e7m0 g;
    public final idd1 h;
    public final u7h1 i;
    public final psw t;

    public zlp0(ic9 ic9Var, add addVar, String str, wq9 wq9Var, hhq hhqVar, bmp0 bmp0Var, q8n q8nVar, q8n q8nVar2, gp0 gp0Var) {
        this.a = ic9Var;
        this.b = addVar;
        this.c = str;
        this.d = bmp0Var;
        this.e = q8nVar;
        this.f = q8nVar2;
        pzo0 pzo0Var = pzo0.d1;
        wam0 wam0Var = new wam0(this, (byte) 4);
        thq thqVar = hhqVar.a;
        teq teqVar = thqVar.c;
        bfd bfdVar = (bfd) teqVar.O1.get();
        ynb0 ynb0VarA = xqu.a(teqVar.i);
        daq daqVar = thqVar.b;
        this.g = sbl.C(pzo0Var, wam0Var, new mlp0(bfdVar, ynb0VarA, wq9Var, (q8n) daqVar.V2.get(), teqVar.c, (q8n) daqVar.r2.get(), gp0Var), ofo0.U0, new y3o0(this, (byte) 29));
        this.h = new idd1(new xlp0(this, (byte) 2));
        this.i = new u7h1(new nso0(this, (byte) 2), new qsn0(this, (byte) 13));
        j2i j2iVar = new j2i(-1077231337, new aso0(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final uvk0 e() {
        return (uvk0) this.h.getValue();
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
