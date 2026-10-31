package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w040 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w040(String str, gdx gdxVar, boolean z, boolean z2, boolean z3, qtg qtgVar, Function0 function0, int i) {
        super(2);
        this.f = str;
        this.g = gdxVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.h = qtgVar;
        this.i = function0;
        this.e = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        int i = this.e;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                lyg.g((String) obj6, (gdx) obj5, z, z2, z3, (qtg) obj4, (Function0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                int iP2 = czo1.p(12582913);
                boolean z4 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                int i2 = this.e;
                y251.b((y7e1) obj6, z4, z5, (qim0) obj5, z6, i2, (u251) obj4, iu30Var, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                boolean z7 = this.b;
                xia1.a((dia1) obj6, (as3) obj5, z7, (iu30) obj4, (qim0) obj3, this.c, this.d, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w040(dia1 dia1Var, as3 as3Var, boolean z, iu30 iu30Var, qim0 qim0Var, boolean z2, boolean z3, int i) {
        super(2);
        this.f = dia1Var;
        this.g = as3Var;
        this.b = z;
        this.h = iu30Var;
        this.i = qim0Var;
        this.c = z2;
        this.d = z3;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w040(y7e1 y7e1Var, boolean z, boolean z2, qim0 qim0Var, boolean z3, int i, u251 u251Var, iu30 iu30Var, int i2) {
        super(2);
        this.f = y7e1Var;
        this.b = z;
        this.c = z2;
        this.g = qim0Var;
        this.d = z3;
        this.e = i;
        this.h = u251Var;
        this.i = iu30Var;
    }
}
