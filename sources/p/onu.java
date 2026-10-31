package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class onu extends hab0 implements xu30 {
    public final /* synthetic */ dou a;
    public final /* synthetic */ rm0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ zeu e;
    public final /* synthetic */ ngs0 f;
    public final /* synthetic */ tm g;
    public final /* synthetic */ ven0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onu(dou douVar, rm0 rm0Var, int i, iu30 iu30Var, zeu zeuVar, ngs0 ngs0Var, tm tmVar, ven0 ven0Var) {
        super(3);
        j2i j2iVar = vji.a;
        this.a = douVar;
        this.b = rm0Var;
        this.c = i;
        this.d = iu30Var;
        this.e = zeuVar;
        this.f = ngs0Var;
        this.g = tmVar;
        this.h = ven0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(vzq0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            qim0 qim0VarW = uyn1.w(nim0.a, vzq0Var);
            j2i j2iVar = vji.a;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarW);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            ven0 ven0Var = this.h;
            j2i j2iVarR = apo.r(-1507725010, new xd2(ven0Var), x340Var2);
            dou douVar = this.a;
            boolean z = douVar instanceof cou;
            iu30 iu30Var = this.d;
            if (z) {
                x340Var2.i0(-77325867);
                cou couVar = (cou) douVar;
                boolean z2 = couVar.a;
                boolean zG = x340Var2.g(iu30Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new wq9(iu30Var, ven0Var, (byte) 13);
                    x340Var2.s0(objT);
                }
                qxd0.k(this.b, this.c, z2, (Function0) objT, couVar.d, j2iVarR, (qim0) null, x340Var2, 196616);
                x340Var2.r(false);
            } else {
                if (!(douVar instanceof bou)) {
                    throw p3d1.k(x340Var2, -77327763, false);
                }
                x340Var2.i0(-77308489);
                pxd0.e((bou) douVar, iu30Var, this.e, this.f, this.g, j2iVarR, null, x340Var2, 196608);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
