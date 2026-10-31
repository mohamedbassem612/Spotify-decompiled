package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cdh1 extends hab0 implements xu30 {
    public final /* synthetic */ Context N0;
    public final /* synthetic */ fos X;
    public final /* synthetic */ cm0 Y;
    public final /* synthetic */ xzq Z;
    public final /* synthetic */ vzq0 a;
    public final /* synthetic */ hvp0 b;
    public final /* synthetic */ zob1 c;
    public final /* synthetic */ xyf1 d;
    public final /* synthetic */ d0r e;
    public final /* synthetic */ iac0 f;
    public final /* synthetic */ kkw0 g;
    public final /* synthetic */ mjm h;
    public final /* synthetic */ r6h1 i;
    public final /* synthetic */ hw2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdh1(vzq0 vzq0Var, hvp0 hvp0Var, zob1 zob1Var, xyf1 xyf1Var, d0r d0rVar, iac0 iac0Var, kkw0 kkw0Var, mjm mjmVar, r6h1 r6h1Var, hw2 hw2Var, fos fosVar, cm0 cm0Var, xzq xzqVar, Context context) {
        super(3);
        this.a = vzq0Var;
        this.b = hvp0Var;
        this.c = zob1Var;
        this.d = xyf1Var;
        this.e = d0rVar;
        this.f = iac0Var;
        this.g = kkw0Var;
        this.h = mjmVar;
        this.i = r6h1Var;
        this.t = hw2Var;
        this.X = fosVar;
        this.Y = cm0Var;
        this.Z = xzqVar;
        this.N0 = context;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fC = i2cVar.c() - 100.0f;
            vzq0 vzq0Var = this.a;
            float f = zjy.p(0.0f, new p3v(fC - vzq0Var.a())).a;
            ng5 ng5Var = ng5.a1;
            ng5 ng5Var2 = ng5.Z0;
            Object objT = x340Var2.T();
            Object obj4 = fkj0.X;
            if (objT == obj4) {
                dnc0 dnc0VarD = hvp0.d(this.b, ng5Var, ng5Var2);
                two1.v(dnc0VarD, new mnc0(rqt0.u(new ry50(this.c, (byte) 29)), (byte) 0), false, new z1(this.t, this.d.a(this.e, this.f, this.g, this.h, this.i), this.X, this.Z, new bl6(f), this.Y, this.N0, (byte) 10));
                objT = dnc0VarD.a();
                x340Var2.s0(objT);
            }
            cnc0 cnc0Var = (cnc0) objT;
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            Object objT2 = x340Var2.T();
            if (objT2 == obj4) {
                objT2 = Integer.valueOf(((err0) xtb0VarA.e.b).s());
                x340Var2.s0(objT2);
            }
            int iIntValue2 = ((Number) objT2).intValue();
            Object objT3 = x340Var2.T();
            if (objT3 == obj4) {
                objT3 = Integer.valueOf(((err0) xtb0VarA.e.c).s());
                x340Var2.s0(objT3);
            }
            int iIntValue3 = ((Number) objT3).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue2);
            Integer numValueOf2 = Integer.valueOf(iIntValue3);
            boolean zG = x340Var2.g(xtb0VarA);
            Object objT4 = x340Var2.T();
            if (zG || objT4 == obj4) {
                fl9 fl9Var = new fl9(xtb0VarA, iIntValue2, iIntValue3, (lnm) null, (byte) 4);
                x340Var2.s0(fl9Var);
                objT4 = fl9Var;
            }
            qxd0.r(xtb0VarA, numValueOf, numValueOf2, (vu30) objT4, x340Var2);
            q1d0 q1d0VarN = jyo1.n(xtb0VarA, cnc0Var, (h3h1) null, x340Var2, 0);
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, vzq0Var.a(), 7);
            qim0 qim0VarN = anm1.N("artists_dna_list_root", u291.d(nim0.a, 1.0f));
            boolean zI = x340Var2.i(q1d0VarN);
            Object objT5 = x340Var2.T();
            if (zI || objT5 == obj4) {
                objT5 = new xo8(q1d0VarN, (byte) 11);
                x340Var2.s0(objT5);
            }
            ujo1.d(qim0VarN, xtb0VarA, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT5, x340Var2, 6, 504);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
