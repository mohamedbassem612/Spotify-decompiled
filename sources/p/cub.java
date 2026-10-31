package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cub extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sdp0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cub(sdp0 sdp0Var, float f, boolean z, boolean z2, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = sdp0Var;
        this.c = f;
        this.d = z;
        this.e = z2;
        this.f = function0;
        this.g = qim0Var;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                kub.g(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                kub.g(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
