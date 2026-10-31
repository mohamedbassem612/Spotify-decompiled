package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d8m extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ kes e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8m(Function0 function0, iu30 iu30Var, c9n c9nVar, kes kesVar, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
        this.c = iu30Var;
        this.d = c9nVar;
        this.e = kesVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kes kesVar = this.e;
        c9n c9nVar = this.d;
        iu30 iu30Var = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function0.invoke();
                iu30Var.invoke(a7m.a);
                fn31.T(c9nVar, (o8n) null, 0, new c8m(kesVar, null, (byte) 0), 3);
                break;
            default:
                function0.invoke();
                iu30Var.invoke(z6m.a);
                fn31.T(c9nVar, (o8n) null, 0, new c8m(kesVar, null, (byte) 1), 3);
                break;
        }
        return rih1Var;
    }
}
