package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h7f implements xpw {
    public final w4i1 N0;
    public final String O0;
    public final iu30 P0;
    public final e821 Q0;
    public final e7m0 R0;
    public final idd1 S0;
    public final idd1 T0;
    public final u7h1 U0;
    public final psw V0;
    public final String X;
    public final String Y;
    public final lz20 Z;
    public final yqg a;
    public final add b;
    public final yxb0 c;
    public final nu d;
    public final awb1 e;
    public final byb1 f;
    public final ztw0 g;
    public final ojh0 h;
    public final wwb1 i;
    public final yuu0 t;

    public h7f(yqg yqgVar, add addVar, yxb0 yxb0Var, nu nuVar, awb1 awb1Var, byb1 byb1Var, ztw0 ztw0Var, ojh0 ojh0Var, i7f i7fVar, wwb1 wwb1Var, yuu0 yuu0Var, n7q n7qVar, q8n q8nVar, q8n q8nVar2, String str, String str2, boolean z, lz20 lz20Var, w4i1 w4i1Var, String str3, iu30 iu30Var, e821 e821Var, vu30 vu30Var) {
        f7f f7fVar;
        this.a = yqgVar;
        this.b = addVar;
        this.c = yxb0Var;
        this.d = nuVar;
        this.e = awb1Var;
        this.f = byb1Var;
        this.g = ztw0Var;
        this.h = ojh0Var;
        this.i = wwb1Var;
        this.t = yuu0Var;
        this.X = str;
        this.Y = str2;
        this.Z = lz20Var;
        this.N0 = w4i1Var;
        this.O0 = str3;
        this.P0 = iu30Var;
        this.Q0 = e821Var;
        cce cceVarA = i7fVar.a(str2);
        switch (n7qVar.a) {
            case 0:
                r7q r7qVar = n7qVar.b;
                q8n q8nVar3 = (q8n) r7qVar.b.r2.get();
                s7q s7qVar = r7qVar.d;
                f7fVar = new f7f(q8nVar3, xqu.a(s7qVar.Uf), xqu.a(s7qVar.Vf), xqu.a(s7qVar.Kf), vu30Var, cceVarA);
                break;
            default:
                r7q r7qVar2 = n7qVar.b;
                q8n q8nVar4 = (q8n) r7qVar2.b.r2.get();
                teq teqVar = r7qVar2.d;
                f7fVar = new f7f(q8nVar4, xqu.a(teqVar.J1), xqu.a(teqVar.K1), xqu.a(teqVar.v1), vu30Var, cceVarA);
                break;
        }
        qf4 qf4Var = addVar.a;
        boolean z2 = ((qf4Var.h() && qf4Var.z()) || addVar.s()) && str.length() > 0 && (!z || (addVar.a() && qf4Var.H()));
        boolean z3 = qf4Var.h() && qf4Var.i0();
        boolean z4 = str.length() > 0 && (!z || addVar.p());
        boolean z5 = str.length() > 0 && (!z || (addVar.a() && qf4Var.j0()));
        boolean zC = addVar.c();
        boolean zG = addVar.g();
        boolean zO = addVar.o();
        boolean z6 = z5;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = z2;
        this.R0 = sbl.B(oqo1.x(new t6f((t7q0) null, z8, z6, z7, true, z2 ? 2 : 1, fg91.b, false, (String) null, (String) null, (bc71) null), zC, zG), n4.u, f7fVar, new u6f(z8, z6, z7, z9, zC, zG, zO, (byte) 0), new w6f(z8, z6, z7, z9, zC, zG, zO, q8nVar, q8nVar2));
        this.S0 = new idd1(new g7f(this, (byte) 1));
        this.T0 = new idd1(new g7f(this, (byte) 0));
        this.U0 = eth.a0((vu30) null, new dwd(this, (byte) 16), 1);
        j2i j2iVar = new j2i(-1971210877, new gtd(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.V0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.U0;
    }

    public final jsw c() {
        return this.V0;
    }

    public final ovk0 e() {
        return (ovk0) this.T0.getValue();
    }

    public final mqw getBehavior() {
        return this.R0;
    }
}
