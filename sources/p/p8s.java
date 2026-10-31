package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p8s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ o95 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8s(c9n c9nVar, ven0 ven0Var, o95 o95Var, byte b) {
        super(0);
        this.a = b;
        this.b = c9nVar;
        this.c = ven0Var;
        this.d = o95Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o95 o95Var = this.d;
        c9n c9nVar = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.TRUE);
                fn31.T(c9nVar, (o8n) null, 0, new b(o95Var, (lnm) null, (byte) 9), 3);
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                fn31.T(c9nVar, (o8n) null, 0, new b(o95Var, (lnm) null, (byte) 10), 3);
                break;
        }
        return rih1Var;
    }
}
