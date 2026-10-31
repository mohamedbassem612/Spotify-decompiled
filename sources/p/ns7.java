package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ns7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ns7(int i, zl80 zl80Var, vl80 vl80Var, String str, vu30 vu30Var, qim0 qim0Var, Integer num, int i2, int i3) {
        super(2);
        this.b = i;
        this.g = zl80Var;
        this.h = vl80Var;
        this.c = str;
        this.i = vu30Var;
        this.d = qim0Var;
        this.t = num;
        this.e = i2;
        this.f = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                int i2 = this.b;
                String str = this.c;
                cso1.a((jlw0) obj6, i2, str, (String) obj5, (s171) obj4, (xwa) obj3, this.d, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                Integer num = (Integer) obj3;
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                int i3 = this.b;
                String str2 = this.c;
                b9p1.h(i3, (zl80) obj6, (vl80) obj5, str2, (vu30) obj4, this.d, num, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.f;
                String str3 = this.c;
                int i4 = this.b;
                qim0 qim0Var = this.d;
                e130.h((Function0) obj6, str3, (String) obj5, (String) obj4, i4, qim0Var, (String) obj3, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ns7(Function0 function0, String str, String str2, String str3, int i, qim0 qim0Var, String str4, int i2, int i3) {
        super(2);
        this.g = function0;
        this.c = str;
        this.h = str2;
        this.i = str3;
        this.b = i;
        this.d = qim0Var;
        this.t = str4;
        this.e = i2;
        this.f = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ns7(jlw0 jlw0Var, int i, String str, String str2, s171 s171Var, xwa xwaVar, qim0 qim0Var, int i2, int i3) {
        super(2);
        this.g = jlw0Var;
        this.b = i;
        this.c = str;
        this.h = str2;
        this.i = s171Var;
        this.t = xwaVar;
        this.d = qim0Var;
        this.e = i2;
        this.f = i3;
    }
}
