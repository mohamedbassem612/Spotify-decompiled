package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m140 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m140(float f, iu30 iu30Var, Function0 function0, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.b = f;
        this.e = iu30Var;
        this.f = function0;
        this.c = z;
        this.g = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.c;
                float f = this.b;
                k4k.h((a140) obj5, (String) obj4, z, f, (w140) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                float f2 = this.b;
                boolean z2 = this.c;
                nb51.a(f2, (iu30) obj5, (Function0) obj4, z2, (qim0) obj3, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(65);
                float f3 = this.b;
                int i2 = this.d;
                boolean z3 = this.c;
                rwq.d(f3, (f5v0) obj5, i2, z3, (tob1) obj4, (qim0) obj3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m140(float f, f5v0 f5v0Var, int i, boolean z, tob1 tob1Var, qim0 qim0Var, int i2) {
        super(2);
        this.b = f;
        this.e = f5v0Var;
        this.d = i;
        this.c = z;
        this.f = tob1Var;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m140(a140 a140Var, String str, boolean z, float f, w140 w140Var, int i) {
        super(2);
        this.e = a140Var;
        this.f = str;
        this.c = z;
        this.b = f;
        this.g = w140Var;
        this.d = i;
    }
}
