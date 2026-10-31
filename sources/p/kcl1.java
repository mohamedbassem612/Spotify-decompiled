package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kcl1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p5j1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcl1(p5j1 p5j1Var, Function0 function0, Function0 function1, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = p5j1Var;
                this.c = function0;
                this.d = function1;
                this.e = i;
                super(2);
                break;
            default:
                this.b = p5j1Var;
                this.c = function0;
                this.d = function1;
                this.e = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Function0 function0 = this.d;
        Function0 function1 = this.c;
        p5j1 p5j1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                apo.h(p5j1Var, function1, function0, b0kVar, czo1.p(i | 1));
                break;
            default:
                apo.h(p5j1Var, function1, function0, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
