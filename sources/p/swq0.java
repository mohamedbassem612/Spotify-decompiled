package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class swq0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ qwq0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swq0(vu30 vu30Var, qwq0 qwq0Var, iu30 iu30Var, Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = vu30Var;
        this.c = qwq0Var;
        this.d = iu30Var;
        this.e = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.e;
        iu30 iu30Var = this.d;
        qwq0 qwq0Var = this.c;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                vu30Var.invoke((zf30) obj, qwq0Var);
                iu30Var.invoke(qwq0Var);
                function0.invoke();
                break;
            default:
                vu30Var.invoke((zf30) obj, qwq0Var);
                iu30Var.invoke(qwq0Var);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
