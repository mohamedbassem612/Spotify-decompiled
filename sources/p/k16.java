package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k16 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k16(int i, Function0 function0, Function0 function1, int i2, byte b) {
        super(2);
        this.a = b;
        this.d = i;
        this.b = function0;
        this.c = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Function0 function0 = this.c;
        Function0 function1 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                s3o1.a(function1, function0, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                kub.e(function1, function0, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                hxo1.c(function1, function0, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                itu.d(i, function1, function0, b0kVar, czo1.p(1));
                break;
            case 4:
                yon1.c(function1, function0, b0kVar, czo1.p(i | 1));
                break;
            case 5:
                wqn1.g(i, function1, function0, b0kVar, czo1.p(1));
                break;
            default:
                wro1.t(function1, function0, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k16(Function0 function0, Function0 function1, int i, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = function1;
        this.d = i;
    }
}
