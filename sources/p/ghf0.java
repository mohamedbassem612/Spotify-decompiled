package p;

import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ghf0 extends hab0 implements zu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghf0(String str, String str2, String str3, boolean z, iu30 iu30Var) {
        super(4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        ikf0 ikf0Var = (jkf0) obj2;
        x340 x340Var = (b0k) obj3;
        ((Number) obj4).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, o0c.d(nim0Var, (ni20) null, 3));
        WeakHashMap weakHashMap = osl1.x;
        qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarZ);
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        if (ikf0Var instanceof fkf0) {
            x340Var3.i0(-1882813193);
            x340Var3.r(false);
        } else {
            boolean z = ikf0Var instanceof gkf0;
            iu30 iu30Var = this.e;
            if (z) {
                x340Var3.i0(1762385739);
                dem1.i(0, this.a, this.b, this.c, x340Var, iu30Var, o0c.d(nim0Var, (ni20) null, 3), this.d);
                x340Var3.r(false);
            } else {
                if (!(ikf0Var instanceof ikf0)) {
                    throw p3d1.k(x340Var3, -1882813754, false);
                }
                x340Var3.i0(1762721593);
                t9p1.d(ikf0Var.c, o0c.d(nim0Var, (ni20) null, 3), iu30Var, x340Var, 0);
                x340Var3.r(false);
            }
        }
        x340Var3.r(true);
        return rih1.a;
    }
}
