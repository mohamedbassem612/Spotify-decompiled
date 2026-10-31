package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qlf0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bmf0 b;
    public final /* synthetic */ Boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qlf0(bmf0 bmf0Var, Boolean bool, boolean z, float f, Function0 function0, boolean z2, boolean z3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = bmf0Var;
        this.c = bool;
        this.d = z;
        this.e = f;
        this.f = function0;
        this.g = z2;
        this.h = z3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                boolean z = this.h;
                int iP = czo1.p(1);
                wlf0.b(this.b, this.c, this.d, this.e, this.f, this.g, z, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                boolean z2 = this.h;
                int iP2 = czo1.p(1);
                wlf0.b(this.b, this.c, this.d, this.e, this.f, this.g, z2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
