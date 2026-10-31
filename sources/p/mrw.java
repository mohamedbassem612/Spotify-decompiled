package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mrw extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ es41 c;
    public final /* synthetic */ g36 d;
    public final /* synthetic */ nl3 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ iu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrw(qim0 qim0Var, es41 es41Var, g36 g36Var, nl3 nl3Var, boolean z, iu30 iu30Var, int i) {
        super(2);
        this.b = qim0Var;
        this.c = es41Var;
        this.d = g36Var;
        this.e = nl3Var;
        this.f = z;
        this.g = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarH = l6o1.H(this.b, this.c, this.f, 12);
                    mbh mbhVarA = jbh.a(this.d, this.e, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarH);
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
                    x340Var2.i0(-1922712212);
                    nqw nqwVar = new nqw();
                    this.g.invoke(nqwVar);
                    int i = 0;
                    for (Object obj3 : nqwVar.a) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        mmr0 mmr0Var = (mmr0) obj3;
                        Object obj4 = mmr0Var.a;
                        vu30 vu30Var = (vu30) mmr0Var.b;
                        x340Var2.f0(-1063997158, obj4);
                        ago1.b(new k3h1(i), apo.r(1896625557, new k7f((byte) 12, vu30Var, false), x340Var2), x340Var2, 48);
                        x340Var2.r(false);
                        i = i2;
                    }
                    x340Var2.r(false);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                h4o1.c(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrw(qim0 qim0Var, es41 es41Var, boolean z, g36 g36Var, nl3 nl3Var, iu30 iu30Var) {
        super(2);
        this.b = qim0Var;
        this.c = es41Var;
        this.f = z;
        this.d = g36Var;
        this.e = nl3Var;
        this.g = iu30Var;
    }
}
