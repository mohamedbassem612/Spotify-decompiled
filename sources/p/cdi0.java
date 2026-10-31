package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cdi0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ hob1 c;
    public final /* synthetic */ i091 d;
    public final /* synthetic */ yqg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cdi0(iu30 iu30Var, hob1 hob1Var, i091 i091Var, yqg yqgVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = hob1Var;
        this.d = i091Var;
        this.e = yqgVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yqg yqgVar = this.e;
        i091 i091Var = this.d;
        hob1 hob1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new gzz(rpo1.z(hob1Var, i091Var, yqgVar)));
                break;
            case 1:
                iu30Var.invoke(new w500(rpo1.z(hob1Var, i091Var, yqgVar)));
                break;
            default:
                iu30Var.invoke(new w500(rpo1.z(hob1Var, i091Var, yqgVar)));
                break;
        }
        return rih1Var;
    }
}
