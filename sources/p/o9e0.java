package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o9e0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o9e0(int i, int i2, long j, String str, String str2, qim0 qim0Var) {
        super(2);
        this.b = str;
        this.f = str2;
        this.c = j;
        this.d = qim0Var;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(this.e | 1);
                long j = this.c;
                u4p1.l((String) obj4, j, (Function0) obj3, this.d, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                byte b2 = this.e;
                long j2 = this.c;
                uvg0.k(iP2, b2, j2, (String) obj4, (String) obj3, (b0k) obj, this.d);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                byte b3 = this.e;
                qim0 qim0Var = this.d;
                long j3 = this.c;
                gfx0.a((jfx0) obj4, qim0Var, j3, (Function0) obj3, (b0k) obj, iP3, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o9e0(String str, long j, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = j;
        this.f = function0;
        this.d = qim0Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o9e0(jfx0 jfx0Var, qim0 qim0Var, long j, Function0 function0, int i, int i2) {
        super(2);
        this.b = jfx0Var;
        this.d = qim0Var;
        this.c = j;
        this.f = function0;
        this.e = i2;
    }
}
