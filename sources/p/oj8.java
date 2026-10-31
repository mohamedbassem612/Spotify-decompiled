package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oj8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj8(int i, boolean z, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 6;
        this.e = i;
        this.b = z;
        this.c = function0;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        Function0 function0 = this.c;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                gyo1.d(czo1.p(i | 1), function0, (b0k) obj, qim0Var, z);
                break;
            case 1:
                ((Number) obj2).intValue();
                gyo1.f(czo1.p(i | 1), function0, (b0k) obj, qim0Var, z);
                break;
            case 2:
                ((Number) obj2).intValue();
                gyo1.k(czo1.p(i | 1), function0, (b0k) obj, qim0Var, z);
                break;
            case 3:
                ((Number) obj2).intValue();
                gyo1.n(czo1.p(i | 1), function0, (b0k) obj, qim0Var, z);
                break;
            case 4:
                ((Number) obj2).intValue();
                gyo1.x(czo1.p(i | 1), function0, (b0k) obj, qim0Var, z);
                break;
            case 5:
                ((Number) obj2).intValue();
                gyo1.y(czo1.p(i | 1), function0, (b0k) obj, qim0Var, z);
                break;
            case 6:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.d;
                int iP = czo1.p(1);
                vbe.i(this.e, iP, this.c, (b0k) obj, qim0Var2, this.b);
                break;
            case 7:
                ((Number) obj2).intValue();
                qim0 qim0Var3 = this.d;
                int iP2 = czo1.p(1);
                grn1.c(this.e, iP2, this.c, (b0k) obj, qim0Var3, this.b);
                break;
            case 8:
                ((Number) obj2).intValue();
                hw10.b(czo1.p(i | 1), function0, (b0k) obj, qim0Var, z);
                break;
            case 9:
                ((Number) obj2).intValue();
                xa4.e(czo1.p(i | 1), function0, (b0k) obj, qim0Var, z);
                break;
            default:
                ((Number) obj2).intValue();
                pok1.g(czo1.p(i | 1), function0, (b0k) obj, qim0Var, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj8(boolean z, int i, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 7;
        this.b = z;
        this.e = i;
        this.c = function0;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj8(boolean z, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.d = qim0Var;
        this.e = i;
    }
}
