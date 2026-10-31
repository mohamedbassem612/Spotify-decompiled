package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jdr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ j2i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jdr(boolean z, Function0 function0, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.d = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.d;
        Function0 function0 = this.c;
        boolean z = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                p6p1.j(z, function0, j2iVar, b0kVar, czo1.p(385));
                break;
            default:
                kyo1.a(z, function0, j2iVar, b0kVar, czo1.p(385));
                break;
        }
        return rih1Var;
    }
}
