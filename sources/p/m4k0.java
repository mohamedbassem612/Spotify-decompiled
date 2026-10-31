package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m4k0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r4k0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4k0(r4k0 r4k0Var, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = r4k0Var;
        this.c = qim0Var;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        Function0 function0 = this.d;
        r4k0 r4k0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                r4k0Var.a(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 1:
                r4k0Var.b(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            default:
                r4k0Var.f(czo1.p(1), function0, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4k0(r4k0 r4k0Var, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = r4k0Var;
        this.d = function0;
        this.c = qim0Var;
    }
}
