package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xz2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz2(float f, znb0 znb0Var, hob1 hob1Var, i091 i091Var, yqg yqgVar, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = f;
        this.c = znb0Var;
        this.d = hob1Var;
        this.e = i091Var;
        this.f = yqgVar;
        this.h = qim0Var;
        this.g = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        float f = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                apo.a((mih1) obj8, this.b, (j2i) obj7, (j2i) obj6, (j2i) obj5, (j2i) obj4, (qim0) obj3, (b0k) obj, czo1.p(224641));
                return rih1Var;
            case 1:
                hav0 hav0Var = (hav0) obj;
                ven0 ven0Var = (ven0) obj6;
                ven0Var.setValue(new v3v(((v3v) ven0Var.getValue()).a, Float.intBitsToFloat((int) (((Offset) obj2).a & 4294967295L)) + ((v3v) ven0Var.getValue()).b));
                iu30 iu30Var = (iu30) ((ven0) obj5).getValue();
                v3v v3vVar = (v3v) ven0Var.getValue();
                ll10 ll10VarA = (ll10) ((ven0) obj4).getValue();
                int iIntValue = ((Number) ((ven0) obj3).getValue()).intValue();
                xtb0 xtb0Var = (xtb0) obj8;
                c9n c9nVar = (c9n) obj7;
                if (iIntValue <= 0) {
                    hav0Var.a();
                } else {
                    float f2 = iIntValue - f;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    float fO = yoi1.o(v3vVar.a + v3vVar.b, 0.0f, f2);
                    float f3 = f2 > 0.0f ? fO / f2 : 0.0f;
                    fn31.T(c9nVar, (o8n) null, 0, new mz2(xtb0Var, f3, (lnm) null, (byte) 2), 3);
                    hav0Var.a();
                    ll10VarA = ll10.a(ll10VarA, false, false, f3, fO, 0, 0L, 51);
                }
                iu30Var.invoke(ll10VarA);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                rpo1.h(this.b, (znb0) obj8, (hob1) obj7, (i091) obj6, (yqg) obj5, (qim0) obj3, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nim0 nim0Var = nim0.a;
                    op71.g(x340Var2, u291.c(nim0Var, 0.13f));
                    qim0 qim0VarZ = uyn1.z(24.0f, 0.0f, 2, u291.d(nim0Var, 1.0f));
                    vu30 vu30Var = (vu30) obj8;
                    rk41 rk41Var = (rk41) obj7;
                    kkz0 kkz0Var = (kkz0) obj6;
                    ven0 ven0Var2 = (ven0) obj5;
                    qam1 qam1Var = (qam1) obj4;
                    ven0 ven0Var3 = (ven0) obj3;
                    mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 54);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    y2o1.e((vnr0) vu30Var.invoke(x340Var2, 0), rk41Var.a, kkz0Var.c, u291.f(nim0Var, 1.0f), ((Boolean) ven0Var3.getValue()).booleanValue() ? 1 : 0, x340Var2, 3080, 0);
                    kiv kivVar = dhe0.a;
                    nma1 nma1Var = ((che0) x340Var2.k(kivVar)).a;
                    op71.g(x340Var2, u291.h(nim0Var, 24.0f));
                    float f4 = ((che0) x340Var2.k(kivVar)).a.b;
                    int size = ((rhz0) ven0Var2.getValue()).f.size();
                    float f5 = (f - ((size - 1) * f4)) / size;
                    qim0 qim0VarH = u291.h(nim0Var, f);
                    rhz0 rhz0Var = (rhz0) ven0Var2.getValue();
                    boolean zBooleanValue = ((Boolean) ven0Var3.getValue()).booleanValue();
                    boolean z = rk41Var.a;
                    boolean z2 = kkz0Var.c;
                    boolean zI = x340Var2.i(kkz0Var) | x340Var2.g(ven0Var2) | x340Var2.i(qam1Var) | x340Var2.i(rk41Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new vvu0(kkz0Var, qam1Var, rk41Var, ven0Var2, (byte) 9);
                        x340Var2.s0(objT);
                    }
                    n3o1.f(rhz0Var, zBooleanValue, f5, f4, z, (iu30) objT, z2, qim0VarH, x340Var2, 0);
                    x0d.s(nim0Var, 16.0f, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz2(float f, xtb0 xtb0Var, c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4) {
        super(2);
        this.b = f;
        this.c = xtb0Var;
        this.d = c9nVar;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.g = ven0Var3;
        this.h = ven0Var4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz2(che0 che0Var, vu30 vu30Var, rk41 rk41Var, kkz0 kkz0Var, float f, ven0 ven0Var, qam1 qam1Var, ven0 ven0Var2) {
        super(2);
        this.c = vu30Var;
        this.d = rk41Var;
        this.e = kkz0Var;
        this.b = f;
        this.f = ven0Var;
        this.g = qam1Var;
        this.h = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz2(mih1 mih1Var, float f, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, qim0 qim0Var, int i) {
        super(2);
        this.c = mih1Var;
        this.b = f;
        this.d = j2iVar;
        this.e = j2iVar2;
        this.f = j2iVar3;
        this.g = j2iVar4;
        this.h = qim0Var;
    }
}
