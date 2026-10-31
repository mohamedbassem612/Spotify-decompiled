package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b5r0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ahi0 b;
    public final /* synthetic */ g5r0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5r0(ahi0 ahi0Var, g5r0 g5r0Var, boolean z, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ahi0Var;
        this.c = g5r0Var;
        this.d = z;
        this.e = function0;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.e(this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.j(this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
