package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cl31 extends hab0 implements vu30 {
    public final /* synthetic */ kj31 X;
    public final /* synthetic */ vnr0 Y;
    public final /* synthetic */ String a;
    public final /* synthetic */ tlc1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ dzo1 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ idn0 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ yk31 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl31(String str, tlc1 tlc1Var, float f, float f2, dzo1 dzo1Var, Function0 function0, idn0 idn0Var, String str2, yk31 yk31Var, boolean z, kj31 kj31Var, vnr0 vnr0Var) {
        super(2);
        this.a = str;
        this.b = tlc1Var;
        this.c = f;
        this.d = f2;
        this.e = dzo1Var;
        this.f = function0;
        this.g = idn0Var;
        this.h = str2;
        this.i = yk31Var;
        this.t = z;
        this.X = kj31Var;
        this.Y = vnr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            String str = this.a;
            boolean zG = x340Var2.g(str);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new sc21(str, (byte) 12);
                x340Var2.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT);
            tlc1 tlc1Var = this.b;
            float f = this.c;
            qim0 qim0VarS = u291.s(qim0VarB, tlc1Var.N0(f), tlc1Var.N0(this.d));
            Function0 function0 = this.f;
            boolean zG2 = x340Var2.g(function0);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new us21(function0, (byte) 11);
                x340Var2.s0(objT2);
            }
            gbx gbxVar = new gbx(this.e, (Function0) objT2);
            cwl1.b(qim0VarS, (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, this.g, jtr.g, gbxVar, (gbx) null, apo.r(93459254, new u8s(this.i, this.t, this.X, this.Y, tlc1Var, this.c), x340Var2), x340Var2, 100663296, 48, 1134);
            if (this.h != null) {
                x340Var2.i0(-1439016038);
                qim0 qim0VarV = u291.v(nim0Var, tlc1Var.N0(f));
                uwr uwrVar = cbx.a;
                uwo1.e(this.h, qim0VarV, cbx.d(x340Var2).k, cbx.a(x340Var2).b.b, new a0e1(1), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1696);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1438657213);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
