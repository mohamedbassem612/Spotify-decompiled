package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xif implements xpw {
    public final ia00 X;
    public final psw Y;
    public final ic9 a;
    public final b7b b;
    public final add c;
    public final zif d;
    public final int e;
    public final w4i1 f;
    public final String g;
    public final q8n h;
    public final q8n i;
    public final e7m0 t;

    public xif(ic9 ic9Var, b7b b7bVar, add addVar, ehq ehqVar, zif zifVar, int i, w4i1 w4i1Var, String str, String str2, wq9 wq9Var, gp0 gp0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = ic9Var;
        this.b = b7bVar;
        this.c = addVar;
        this.d = zifVar;
        this.e = i;
        this.f = w4i1Var;
        this.g = str;
        this.h = q8nVar;
        this.i = q8nVar2;
        vif vifVar = new vif(0, 0, false);
        dq7 dq7Var = new dq7(this, (byte) 4);
        thq thqVar = ehqVar.a;
        daq daqVar = thqVar.b;
        r630 r630Var = (r630) daqVar.ya.get();
        teq teqVar = thqVar.c;
        this.t = sbl.B(vifVar, dq7Var, new hif(r630Var, (bfd) teqVar.O1.get(), xqu.a(teqVar.i), wq9Var, (q8n) daqVar.V2.get(), teqVar.c, (q8n) daqVar.r2.get(), gp0Var), eqe.i, new m4d(this, (byte) 23));
        this.X = n3o1.q(this).a(new pm6(str2, (byte) 2), new zee(this, (byte) 10));
        j2i j2iVar = new j2i(-890894472, new gtd(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.Y;
    }

    public final int e() {
        int iC = l1d.C(this.e);
        if (iC == 0) {
            return 3;
        }
        if (iC == 1) {
            return 1;
        }
        eg.o();
        return 0;
    }

    public final mqw getBehavior() {
        return this.t;
    }
}
