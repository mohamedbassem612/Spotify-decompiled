package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aj80 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ lz20 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ y7e1 g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ hdn0 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj80(boolean z, String str, Function0 function0, String str2, lz20 lz20Var, iu30 iu30Var, y7e1 y7e1Var, j2i j2iVar, hdn0 hdn0Var, boolean z2) {
        super(2);
        this.a = z;
        this.b = str;
        this.c = function0;
        this.d = str2;
        this.e = lz20Var;
        this.f = iu30Var;
        this.g = y7e1Var;
        this.h = j2iVar;
        this.i = hdn0Var;
        this.t = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            String str = this.a ? null : this.b;
            c6e1 c6e1Var = new c6e1(0, 4, 1);
            kua0 kua0Var = new kua0(3, (Boolean) null, 0, 4, 118);
            Function0 function0 = this.c;
            boolean zG = x340Var2.g(function0);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new uy5(function0, (byte) 2);
                x340Var2.s0(objT);
            }
            yta0 yta0Var = (yta0) objT;
            String str2 = this.d;
            boolean zG2 = x340Var2.g(str2);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new ry40(str2, (byte) 15);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarP = vby0.p(s161.b(nim0.a, false, (iu30) objT2), this.e);
            boolean zG3 = x340Var2.g(function0);
            Object objT3 = x340Var2.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = new xet(function0, (byte) 19);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarT = y9g1.t(qim0VarP, (iu30) objT3);
            iu30 iu30Var = this.f;
            boolean zG4 = x340Var2.g(iu30Var);
            Object objT4 = x340Var2.T();
            if (zG4 || objT4 == m4cVar) {
                objT4 = new bv70(iu30Var, (byte) 7);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarG = cev0.G(qim0VarT, (iu30) objT4);
            hdn0 hdn0Var = this.i;
            boolean zI = x340Var2.i(hdn0Var);
            Object objT5 = x340Var2.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new yoe(hdn0Var, (byte) 2);
                x340Var2.s0(objT5);
            }
            pwo1.a(this.g, qim0VarG, (max) null, str, rqf.b, (lee1) null, this.h, kua0Var, yta0Var, (mqf) null, c6e1Var, (vu30) objT5, this.t, (dk80) null, x340Var2, 0, 0, 8740);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
