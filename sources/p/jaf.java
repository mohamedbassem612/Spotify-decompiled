package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jaf extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaf(List list, boolean z, swx swxVar, zwx zwxVar, int i) {
        super(3);
        this.d = list;
        this.b = z;
        this.e = swxVar;
        this.f = zwxVar;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                foo1.c(new gbx(z50.c, (Function0) obj6), (yf) obj5, (qim0) null, (max) null, yla.s(b0kVar), (vzq0) null, (idn0) null, (ga80) null, !this.b ? wbi.b : null, (vu30) null, apo.r(1105916661, new ue0(i, (String) obj4, (byte) 2), b0kVar), b0kVar, 0, 48, 1500);
                break;
            case 1:
                tb91 tb91Var = (tb91) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(tb91Var) : x340Var.i(tb91Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var2.b0();
                } else {
                    guo1.j(tb91Var.d.s(), tb91Var.c, (List) obj6, this.b, (swx) obj5, (zwx) obj4, this.c, x340Var2, 0);
                }
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                ((b0i0) obj6).a((iu30) obj5, this.b, ((xyz0) obj4).b(b0kVar2), uyn1.B(nim0.a, i > 0 ? 8.0f : 0.0f, 3.0f, 0.0f, 3.0f, 4), b0kVar2, 0);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaf(Function0 function0, boolean z, yf yfVar, int i, String str) {
        super(3);
        this.d = function0;
        this.b = z;
        this.e = yfVar;
        this.c = i;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaf(b0i0 b0i0Var, iu30 iu30Var, boolean z, xyz0 xyz0Var, int i) {
        super(3);
        this.d = b0i0Var;
        this.e = iu30Var;
        this.b = z;
        this.f = xyz0Var;
        this.c = i;
    }
}
