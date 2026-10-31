package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j161 extends hab0 implements iu30 {
    public final /* synthetic */ ff8 N0;
    public final /* synthetic */ xkg1 O0;
    public final /* synthetic */ fkn0 X;
    public final /* synthetic */ hx Y;
    public final /* synthetic */ fw3 Z;
    public final /* synthetic */ cx a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ fli0 f;
    public final /* synthetic */ ob9 g;
    public final /* synthetic */ dh51 h;
    public final /* synthetic */ es00 i;
    public final /* synthetic */ r9g t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j161(cx cxVar, boolean z, boolean z2, boolean z3, iu30 iu30Var, fli0 fli0Var, ob9 ob9Var, dh51 dh51Var, es00 es00Var, r9g r9gVar, fkn0 fkn0Var, hx hxVar, fw3 fw3Var, ff8 ff8Var, xkg1 xkg1Var) {
        super(1);
        this.a = cxVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = iu30Var;
        this.f = fli0Var;
        this.g = ob9Var;
        this.h = dh51Var;
        this.i = es00Var;
        this.t = r9gVar;
        this.X = fkn0Var;
        this.Y = hxVar;
        this.Z = fw3Var;
        this.N0 = ff8Var;
        this.O0 = xkg1Var;
    }

    public final Object invoke(Object obj) {
        rtb0 rtb0Var = (rtb0) obj;
        fli0 fli0Var = this.f;
        ob9 ob9Var = this.g;
        cx cxVar = this.a;
        rtb0.c(rtb0Var, "avatarRowElement", new j2i(2067525049, new nu31(fli0Var, ob9Var, cxVar, (byte) 4), true), 2);
        boolean z = cxVar.e;
        boolean z2 = cxVar.i;
        dh51 dh51Var = this.h;
        if (z || z2) {
            rtb0.c(rtb0Var, "playbackSectionHeader", new j2i(-964441452, new v0c0(dh51Var, (byte) 3), true), 2);
            if (z) {
                rtb0.c(rtb0Var, "explicitContentToggleRowElement", new j2i(-833777233, new rt11(this.i, cxVar, (byte) 14), true), 2);
            }
            if (z2 && this.b) {
                rtb0.c(rtb0Var, "chooseVideoSettingsRowElement", new j2i(1604478694, new rt11(this.t, fli0Var, (byte) 15), true), 2);
            }
            rtb0.c(rtb0Var, "playbackSectionDivider", zfj.a, 2);
        }
        rtb0.c(rtb0Var, "accountSectionHeader", new j2i(-204712336, new v0c0(dh51Var, (byte) 4), true), 2);
        rtb0.c(rtb0Var, "nameRowElement", new j2i(1346942193, new w0c0(this.X, fli0Var, (byte) 2), true), 2);
        rtb0.c(rtb0Var, "accountTypeRowElement", new j2i(-1396370574, new rt11(this.Y, cxVar, (byte) 16), true), 2);
        if (this.c && !cxVar.h.isEmpty()) {
            rtb0.c(rtb0Var, "allocationsRowElement", new j2i(-1936693109, new rt11(this.Z, cxVar, (byte) 17), true), 2);
        }
        if (this.d && cxVar.f && cxVar.g.length() > 0) {
            rtb0.c(rtb0Var, "audiobooksTopUpRowElement", new j2i(-385038580, new rt11(this.N0, cxVar, (byte) 18), true), 2);
        }
        rtb0.c(rtb0Var, "accountSectionDivider", zfj.b, 2);
        if (cxVar.d) {
            rtb0.c(rtb0Var, "transitionRowElement", new j2i(1166615949, new nu31(this.O0, fli0Var, cxVar, (byte) 3), true), 2);
        }
        this.e.invoke(rtb0Var);
        return rih1.a;
    }
}
