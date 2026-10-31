package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tkk0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ j2i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tkk0(boolean z, Function0 function0, iu30 iu30Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.d = iu30Var;
        this.e = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                j2i j2iVar = this.e;
                int iP = czo1.p(3073);
                t3p1.n(this.b, this.c, this.d, j2iVar, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                j2i j2iVar2 = this.e;
                int iP2 = czo1.p(3073);
                t3p1.n(this.b, this.c, this.d, j2iVar2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
