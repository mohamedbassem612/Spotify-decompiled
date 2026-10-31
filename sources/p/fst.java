package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fst extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fst(xu30 xu30Var, float f, qim0 qim0Var, xu30 xu30Var2, xu30 xu30Var3, int i, int i2) {
        super(2);
        this.a = (byte) 3;
        this.f = xu30Var;
        this.c = f;
        this.b = qim0Var;
        this.g = xu30Var2;
        this.h = xu30Var3;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.b;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.e;
                ((lqc) obj6).e((pst) obj4, (Function0) obj3, (qim0) obj5, this.c, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.e;
                float f = this.c;
                ((b6n0) obj6).f((String) obj4, (qim0) obj5, f, (qqb) obj3, (b0k) obj, iP2, b3);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.e;
                fiw0.i((giw0) obj6, (j2i) obj4, (vu30) obj3, (vu30) obj5, this.c, (b0k) obj, iP3, b4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                byte b5 = this.e;
                float f2 = this.c;
                fq7.x((xu30) obj6, f2, (qim0) obj5, (xu30) obj4, (xu30) obj3, (b0k) obj, iP4, b5);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fst(Object obj, Object obj2, cv30 cv30Var, Object obj3, float f, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.h = cv30Var;
        this.b = obj3;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fst(b6n0 b6n0Var, String str, qim0 qim0Var, float f, qqb qqbVar, int i, int i2) {
        super(2);
        this.a = (byte) 1;
        this.f = b6n0Var;
        this.g = str;
        this.b = qim0Var;
        this.c = f;
        this.h = qqbVar;
        this.d = i;
        this.e = i2;
    }
}
