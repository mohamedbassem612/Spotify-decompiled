package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class crw0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public crw0(List list, p40 p40Var, hz5 hz5Var, op41 op41Var, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, int i, int i2) {
        super(2);
        this.a = (byte) 2;
        this.b = list;
        this.e = p40Var;
        this.f = hz5Var;
        this.g = op41Var;
        this.d = qim0Var;
        this.c = iu30Var;
        this.h = iu30Var2;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                byte b2 = this.i;
                iu30 iu30Var = this.c;
                qim0 qim0Var = this.d;
                i1k0.g((tqw0) obj7, iu30Var, qim0Var, (mr20) obj6, (mr20) obj5, (Function0) obj4, (gpv0) obj3, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                byte b3 = this.i;
                iu30 iu30Var2 = this.c;
                qim0 qim0Var2 = this.d;
                i1k0.g((tqw0) obj7, iu30Var2, qim0Var2, (mr20) obj6, (mr20) obj5, (Function0) obj4, (gpv0) obj3, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                byte b4 = this.i;
                qim0 qim0Var3 = this.d;
                iu30 iu30Var3 = this.c;
                ryn1.i((List) obj7, (p40) obj6, (hz5) obj5, (op41) obj4, qim0Var3, iu30Var3, (iu30) obj3, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ crw0(tqw0 tqw0Var, iu30 iu30Var, qim0 qim0Var, mr20 mr20Var, mr20 mr20Var2, Function0 function0, gpv0 gpv0Var, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = tqw0Var;
        this.c = iu30Var;
        this.d = qim0Var;
        this.e = mr20Var;
        this.f = mr20Var2;
        this.g = function0;
        this.h = gpv0Var;
        this.i = i2;
    }
}
