package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f8f1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8f1(int i, hdl1 hdl1Var, iu30 iu30Var) {
        super(0);
        this.a = (byte) 4;
        this.c = i;
        this.b = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                iu30Var.invoke(Integer.valueOf(i));
                break;
            case 1:
                iu30Var.invoke(Integer.valueOf(i));
                break;
            case 2:
                iu30Var.invoke(Integer.valueOf(i));
                break;
            case 3:
                iu30Var.invoke(Integer.valueOf(i));
                break;
            default:
                iu30Var.invoke(Integer.valueOf(i == 1 ? 10 : -10));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8f1(iu30 iu30Var, int i, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = i;
    }
}
