package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uw50 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw50(vnr0 vnr0Var, qim0 qim0Var, boolean z, ven0 ven0Var, float f) {
        super(3);
        this.d = vnr0Var;
        this.e = qim0Var;
        this.c = z;
        this.f = ven0Var;
        this.b = f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        float f = this.b;
        Object obj6 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    vnr0 vnr0Var = (vnr0) obj6;
                    x340Var2.i0(-462546280);
                    qim0 qim0VarD = u291.D((qim0) obj5, (era) null, 3);
                    ven0 ven0Var = (ven0) obj4;
                    if (this.c) {
                        boolean zG = x340Var2.g(ven0Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == m4cVar) {
                            objT = new i030(ven0Var, (byte) 12);
                            x340Var2.s0(objT);
                        }
                        qim0 qim0VarB = eqr0.B(nim0.a, (iu30) objT);
                        boolean zD = x340Var2.d(f);
                        Object objT2 = x340Var2.T();
                        if (zD || objT2 == m4cVar) {
                            objT2 = new jc5((byte) 24, f);
                            x340Var2.s0(objT2);
                        }
                        qim0VarD = qim0VarD.then(i541.C(qim0VarB, (iu30) objT2));
                    }
                    x340Var2.r(false);
                    qgo1.f(vnr0Var, qim0VarD, new a0e1(3), 0, false, null, x340Var2, 8, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                u011 u011Var = (u011) obj6;
                poo1.a(u011Var.c, dm5.e0(et40.a, f), this.c, (q10) obj5, u011Var.a, 1, x340Var3, 0, 0);
                vy01 vy01Var = (syo1) obj4;
                if (vy01Var instanceof vy01) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-1932936086);
                    o4p1.g(u011Var.a, null, vy01Var.c, 1, x340Var4, 3072, 2);
                    x340Var4.r(false);
                } else {
                    if (!vy01Var.equals(uy01.c)) {
                        throw p3d1.k(x340Var3, 1046022962, false);
                    }
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-1932732664);
                    x340Var5.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw50(u011 u011Var, float f, boolean z, q10 q10Var, syo1 syo1Var) {
        super(3);
        this.d = u011Var;
        this.b = f;
        this.c = z;
        this.e = q10Var;
        this.f = syo1Var;
    }
}
