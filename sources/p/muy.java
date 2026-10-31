package p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class muy extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ouy b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muy(ouy ouyVar, String str, String str2, c380 c380Var, boolean z) {
        super(2);
        this.b = ouyVar;
        this.c = str;
        this.e = str2;
        this.d = c380Var;
        this.f = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarC = u291.c(nim0Var, 1.0f);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                    int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM = b0kVar2.m();
                    qim0 qim0VarE = zr7.E(b0kVar2, qim0VarC);
                    hzj.A.getClass();
                    if (((x340) b0kVar2).a == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(hmb0.t1);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(mbhVarA, b0kVar2, y580.O0);
                    nko1.H(xos0VarM, b0kVar2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                    nko1.F(b0kVar2);
                    nko1.H(qim0VarE, b0kVar2, y580.Y);
                    ouy ouyVar = this.b;
                    ouyVar.e(this.c, b0kVar2, 0);
                    wty wtyVar = (wty) ouyVar.f.get();
                    lik1 lik1Var = ouyVar.a;
                    rty rtyVar = rty.e;
                    WeakHashMap weakHashMap = osl1.x;
                    vk80 vk80VarX = poo1.x(new bgc0(lhc.g(b0kVar2).g, 32), b0kVar2);
                    qim0 qim0VarN = anm1.N("entitySegmentsOnFullscreenPage", u291.c(nim0Var, 1.0f).then(new wnb0(1.0f, true)));
                    boolean z = this.f;
                    boolean zH = b0kVar2.h(z) | b0kVar2.i(ouyVar);
                    Object objT = b0kVar2.T();
                    if (zH || objT == fkj0.X) {
                        objT = new cb8(z, ouyVar, (byte) 8);
                        b0kVar2.s0(objT);
                    }
                    wtyVar.a(lik1Var, this.e, this.d, qim0VarN, rtyVar, vk80VarX, (iu30) objT, b0kVar2, 16777216, 0);
                    b0kVar2.r(true);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                this.b.c(czo1.p(24577), this.c, this.e, (b0k) obj, this.d, this.f);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muy(ouy ouyVar, String str, c380 c380Var, String str2, boolean z, int i) {
        super(2);
        this.b = ouyVar;
        this.c = str;
        this.d = c380Var;
        this.e = str2;
        this.f = z;
    }
}
