package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pv50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv50(Function0 function0, qim0 qim0Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = qim0Var;
        this.d = j2iVar;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        j2i j2iVar = this.d;
        qim0 qim0Var = this.c;
        Function0 function0 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                i1o1.g(czo1.p(i | 1), function0, j2iVar, b0kVar, qim0Var);
                break;
            case 1:
                yzo1.a(czo1.p(i | 1), function0, j2iVar, b0kVar, qim0Var);
                break;
            default:
                prn1.d(czo1.p(i | 1), function0, j2iVar, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }
}
