package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wth extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ adj1 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wth(adj1 adj1Var, iu30 iu30Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = adj1Var;
        this.c = iu30Var;
        this.d = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.d;
        adj1 adj1Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                p9p1.i(adj1Var, iu30Var, z, (b0k) obj, czo1.p(385));
                break;
            case 1:
                ((Number) obj2).intValue();
                s9p1.j(adj1Var, iu30Var, z, (b0k) obj, czo1.p(385));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = adj1Var.a().d.a;
                    String str2 = czd1.c;
                    if (z) {
                        x340Var2.i0(-1957170332);
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new y720(iu30Var, (byte) 28);
                            x340Var2.s0(objT);
                        }
                        function0 = (Function0) objT;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1957098909);
                        x340Var2.r(false);
                        function0 = null;
                    }
                    cpn1.a(str, str2, function0, (qim0) null, (yf) null, (djc0) null, x340Var2, 0, 56);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wth(adj1 adj1Var, boolean z, iu30 iu30Var) {
        super(2);
        this.a = (byte) 2;
        this.b = adj1Var;
        this.d = z;
        this.c = iu30Var;
    }
}
