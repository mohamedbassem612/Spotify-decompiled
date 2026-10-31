package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s2l extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ short i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2l(String str, String str2, String str3, Function0 function0, Function0 function1, qim0 qim0Var, String str4, hux huxVar, int i, int i2) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = function0;
        this.g = function1;
        this.t = qim0Var;
        this.e = str4;
        this.X = huxVar;
        this.h = i;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        Object obj3 = this.g;
        Object obj4 = this.t;
        Object obj5 = this.f;
        Object obj6 = this.X;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                short s = this.i;
                String str = this.b;
                String str2 = this.c;
                y7y0.d(str, str2, (String) obj8, (Function0) obj5, (Function0) obj3, (qim0) obj4, (String) obj7, (hux) obj6, (b0k) obj, iP, s);
                break;
            case 1:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj3;
                int iP2 = czo1.p(i | 1);
                short s2 = this.i;
                String str3 = this.b;
                String str4 = this.c;
                vby0.c(str3, str4, (String) obj8, (yf) obj4, (String) obj7, (Function0) obj5, (String) obj6, function0, (b0k) obj, iP2, s2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                short s3 = this.i;
                String str5 = this.b;
                String str6 = this.c;
                jap1.l((qim0) obj4, (qim0) obj7, str5, str6, (String) obj8, (gbx) obj5, (yf) obj3, (vu30) obj6, (b0k) obj, iP3, s3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                short s4 = this.i;
                String str7 = this.b;
                String str8 = this.c;
                vbe.u((lfc) obj8, (aec) obj7, str7, str8, (hux) obj6, (gbx) obj5, (qim0) obj4, (yf) obj3, (b0k) obj, iP4, s4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2l(String str, String str2, String str3, yf yfVar, String str4, Function0 function0, String str5, Function0 function1, int i, int i2) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.t = yfVar;
        this.e = str4;
        this.f = function0;
        this.X = str5;
        this.g = function1;
        this.h = i;
        this.i = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2l(lfc lfcVar, aec aecVar, String str, String str2, hux huxVar, gbx gbxVar, qim0 qim0Var, yf yfVar, int i, int i2) {
        super(2);
        this.d = lfcVar;
        this.e = aecVar;
        this.b = str;
        this.c = str2;
        this.X = huxVar;
        this.f = gbxVar;
        this.t = qim0Var;
        this.g = yfVar;
        this.h = i;
        this.i = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2l(qim0 qim0Var, qim0 qim0Var2, String str, String str2, String str3, gbx gbxVar, yf yfVar, vu30 vu30Var, int i, int i2) {
        super(2);
        this.t = qim0Var;
        this.e = qim0Var2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = gbxVar;
        this.g = yfVar;
        this.X = vu30Var;
        this.h = i;
        this.i = i2;
    }
}
