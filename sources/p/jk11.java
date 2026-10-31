package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jk11 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fk11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk11(fk11 fk11Var, byte b) {
        super(3);
        this.a = b;
        this.b = fk11Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fk11 fk11Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                String strH = kw7.h(fk11Var.c, fk11Var.d, x340Var);
                if (strH.length() <= 0) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1360473431);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1360707202);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strH, (qim0) null, cbx.d(x340Var3).j, cbx.a(x340Var3).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var3, 0, 0, 1714);
                    x340Var3.r(false);
                }
                break;
            case 1:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (fk11Var.h == null) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(2066514919);
                    x340Var5.r(false);
                } else {
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(2066263850);
                    String str = fk11Var.h;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var6).j, cbx.a(x340Var6).b.b, (a0e1) null, (iu30) null, 2, false, new zic0(2), 0, (qx8) null, x340Var6, 0, 0, 1714);
                    x340Var6.r(false);
                }
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = fk11Var.b;
                uwr uwrVar3 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar).g, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(3), 0, (qx8) null, b0kVar, 0, 0, 1714);
                break;
        }
        return rih1Var;
    }
}
