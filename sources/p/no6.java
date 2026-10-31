package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class no6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ short d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cv30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ no6(Object obj, Object obj2, boolean z, boolean z2, cv30 cv30Var, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.b = z;
        this.c = z2;
        this.h = cv30Var;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.d;
        Function0 function0 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                byte b2 = this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                eko1.b((c380) obj4, (qim0) obj3, z, z2, (xu30) function0, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                byte b3 = this.e;
                boolean z3 = this.b;
                boolean z4 = this.c;
                ((osq0) obj4).h((isq0) obj3, z3, z4, function0, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
