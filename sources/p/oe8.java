package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oe8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cv30 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe8(cab cabVar, String str, String str2, float f, mic0 mic0Var, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.e = cabVar;
        this.b = str;
        this.f = str2;
        this.c = f;
        this.g = mic0Var;
        this.h = iu30Var;
        this.i = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.i;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Function0 function0 = this.h;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj3;
                int iP = czo1.p(i | 1);
                float f = this.c;
                String str = this.b;
                wxo1.c((i2c) obj6, f, (w61) obj5, str, (vu30) obj4, function0, j2iVar, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                String str2 = this.b;
                float f2 = this.c;
                ((cab) obj6).h(str2, (String) obj5, f2, (mic0) obj4, (iu30) function0, (qim0) obj3, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                String str3 = this.b;
                float f3 = this.c;
                rqt0.c(str3, f3, (mic0) obj6, function0, (Function0) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe8(String str, float f, mic0 mic0Var, Function0 function0, Function0 function1, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = f;
        this.e = mic0Var;
        this.h = function0;
        this.f = function1;
        this.g = iu30Var;
        this.i = qim0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe8(i2c i2cVar, float f, w61 w61Var, String str, vu30 vu30Var, Function0 function0, j2i j2iVar, int i) {
        super(2);
        this.e = i2cVar;
        this.c = f;
        this.f = w61Var;
        this.b = str;
        this.g = vu30Var;
        this.h = function0;
        this.i = j2iVar;
        this.d = i;
    }
}
