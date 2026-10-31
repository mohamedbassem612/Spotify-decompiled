package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rqf1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ crf1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rqf1(iu30 iu30Var, int i, crf1 crf1Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = i;
        this.d = crf1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        crf1 crf1Var = this.d;
        int i = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new arf1(i, crf1Var.e));
                break;
            default:
                iu30Var.invoke(new yqf1(i, crf1Var.e));
                break;
        }
        return rih1Var;
    }
}
