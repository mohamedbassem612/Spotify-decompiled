package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y3y implements zu30 {
    public final /* synthetic */ c380 a;
    public final /* synthetic */ n5y b;
    public final /* synthetic */ int c;
    public final /* synthetic */ muo d;
    public final /* synthetic */ l5y e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;

    public y3y(c380 c380Var, n5y n5yVar, int i, muo muoVar, l5y l5yVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3) {
        this.a = c380Var;
        this.b = n5yVar;
        this.c = i;
        this.d = muoVar;
        this.e = l5yVar;
        this.f = ven0Var;
        this.g = ven0Var2;
        this.h = ven0Var3;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        muo muoVar;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            m5y m5yVar = (m5y) this.a.get(iIntValue);
            x340Var2.i0(-1209738906);
            nrs0 nrs0Var = new nrs0(this.b.b, this.c, iIntValue);
            muo muoVar2 = this.d;
            boolean zG = x340Var2.g(muoVar2) | x340Var2.g(nrs0Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                muoVar = muoVar2;
                objT = new quo(muoVar2 != null ? muoVar2.b : gio1.b(oaw0.a), new w3w((byte) 16, nrs0Var, this.f), new lhx(this.g, this.h, nrs0Var, muoVar, (byte) 1));
                x340Var2.s0(objT);
            } else {
                muoVar = muoVar2;
            }
            otw.c((quo) objT, new ouo(m5yVar.a, m5yVar.b, m5yVar.c, m5yVar.d, m5yVar.e != null, this.e.e && muoVar != null), u291.f(nim0.a, 1.0f), (ipb1) null, x340Var2, 392, 8);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
