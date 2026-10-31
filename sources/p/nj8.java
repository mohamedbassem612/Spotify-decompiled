package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nj8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nj8(dfm dfmVar, int i, boolean z, Function0 function0, int i2) {
        super(2);
        this.a = (byte) 5;
        this.b = dfmVar;
        this.d = i;
        this.c = z;
        this.f = function0;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.e;
                gyo1.c(iP, b2, (Function0) obj3, (b0k) obj, (qim0) obj4, this.c);
                break;
            case 1:
                ((Number) obj2).intValue();
                String str = (String) obj3;
                qim0 qim0Var = (qim0) obj4;
                lzj.b(czo1.p(i | 1), this.e, str, (b0k) obj, qim0Var, this.c);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.e;
                vgo1.f((tl7) obj3, (xtb0) obj4, this.c, (b0k) obj, iP2, b3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.e;
                eqn1.g((xqn0) obj3, (qim0) obj4, this.c, (b0k) obj, iP3, b4);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                boolean z = this.c;
                byte b5 = this.e;
                aym.f((ksw) obj4, b5, (Function0) obj3, (b0k) obj, iP4, z ? 1 : 0);
                break;
            default:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(this.e | 1);
                int i2 = this.d;
                ((dfm) obj4).e(i2, iP5, (Function0) obj3, (b0k) obj, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nj8(Object obj, Object obj2, boolean z, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.b = obj2;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nj8(ksw kswVar, int i, Function0 function0, int i2, int i3) {
        super(2);
        this.a = (byte) 4;
        this.b = kswVar;
        this.e = i;
        this.f = function0;
        this.d = i2;
        this.c = i3;
    }
}
