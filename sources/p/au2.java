package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class au2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public au2(int i, int i2, Function0 function0, boolean z) {
        super(2);
        this.b = z;
        this.e = function0;
        this.d = i;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj3 = this.e;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                k4k.a(czo1.p(i | 1), b0kVar, (qim0) obj3, z2, z);
                break;
            case 1:
                int iP = czo1.p(i | 1);
                e9k.c(z ? 1 : 0, iP, (String) obj3, b0kVar, z2);
                break;
            case 2:
                q3p1.b(czo1.p(i | 1), z ? 1 : 0, (Function0) obj3, b0kVar, z2);
                break;
            default:
                ((oxj1) obj3).e(z2, z, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public au2(String str, int i, int i2, boolean z) {
        super(2);
        this.b = z;
        this.e = str;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au2(qim0 qim0Var, boolean z, boolean z2, int i) {
        super(2);
        this.b = z;
        this.c = z2;
        this.e = qim0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au2(oxj1 oxj1Var, boolean z, boolean z2, int i) {
        super(2);
        this.e = oxj1Var;
        this.b = z;
        this.c = z2;
        this.d = i;
    }
}
