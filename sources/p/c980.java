package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c980 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c980(byte b, String str, Function0 function0, boolean z) {
        super(2);
        this.a = b;
        switch (b) {
            case 3:
                this.d = function0;
                this.c = z;
                this.b = str;
                super(2);
                break;
            default:
                this.d = function0;
                this.c = z;
                this.b = str;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        max haxVar = jax.a;
        String str = this.b;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        boolean z = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                k4p1.d(czo1.p(1), str, function0, (b0k) obj, z);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                o4o1.d(czo1.p(1), str, function0, (b0k) obj, z);
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    if (ihc1.y0("Save event")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar = new gbx(new y50("Save event"), function0);
                    if (z) {
                        x340Var2.i0(-1547530287);
                    } else {
                        x340Var2.i0(-1547479602);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131959207));
                    }
                    x340Var2.r(false);
                    foo1.f(gbxVar, nim0.a, haxVar, yla.p(x340Var2), (idn0) null, (vu30) null, (vu30) null, apo.r(819732205, new tej0(str, (byte) 20), x340Var2), x340Var2, 12582912, 112);
                }
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zG = x340Var4.g(function0);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new sah1(function0, (byte) 12);
                        x340Var4.s0(objT);
                    }
                    gbx gbxVar2 = new gbx(z50.c, (Function0) objT);
                    idx idxVar = new idx(19);
                    gdx gdxVarR = yla.r(x340Var4);
                    if (!z) {
                        haxVar = new hax(str);
                    }
                    foo1.c(gbxVar2, idxVar, anm1.N("user_info_next_button", nim0.a), haxVar, gdxVarR, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, opj.a, x340Var4, 0, 48, 1992);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    cpn1.a(this.b, czd1.c, z ? function0 : null, (qim0) null, (yf) null, (djc0) null, x340Var6, 0, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                g2p1.A(czo1.p(1), str, function0, (b0k) obj, z);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c980(byte b, int i, String str, Function0 function0, boolean z) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = z;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c980(String str, boolean z, Function0 function0) {
        super(2);
        this.a = (byte) 4;
        this.b = str;
        this.c = z;
        this.d = function0;
    }
}
