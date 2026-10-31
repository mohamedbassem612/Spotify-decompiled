package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ag21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag21(iu30 iu30Var, boolean z, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = z;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(Boolean.valueOf(!z));
                break;
            case 1:
                iu30Var.invoke(Boolean.valueOf(!z));
                break;
            case 2:
                iu30Var.invoke(z ? yl91.a : xl91.a);
                break;
            case 3:
                iu30Var.invoke(new mbd1(!z));
                break;
            case 4:
                iu30Var.invoke(Boolean.valueOf(!z));
                break;
            case 5:
                iu30Var.invoke(new arl1(z));
                break;
            case 6:
                iu30Var.invoke(new arl1(z));
                break;
            case 7:
                iu30Var.invoke(new zql1(z));
                break;
            default:
                iu30Var.invoke(z ? o5m1.a : p5m1.a);
                break;
        }
        return rih1Var;
    }
}
