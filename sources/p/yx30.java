package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yx30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx30(int i, String str, String str2, Function0 function0, boolean z) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = function0;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    gdx gdxVarP = yla.p(x340Var2);
                    qim0 qim0VarN = anm1.N(this.b, u291.f(nim0.a, 1.0f));
                    Function0 function0 = this.d;
                    boolean zG = x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new zg20(function0, (byte) 8);
                        x340Var2.s0(objT);
                    }
                    foo1.c(new gbx(z50.c, (Function0) objT), this.e ? new idx(19) : jdx.c, qim0VarN, (max) null, gdxVarP, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1523551089, new ps00(this.c, (byte) 17), x340Var2), x340Var2, 0, 48, 2008);
                }
                break;
            default:
                ((Number) obj2).intValue();
                fqo1.j(czo1.p(1), this.b, this.c, this.d, (b0k) obj, this.e);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx30(String str, String str2, Function0 function0, boolean z) {
        super(2);
        this.b = str;
        this.d = function0;
        this.e = z;
        this.c = str2;
    }
}
