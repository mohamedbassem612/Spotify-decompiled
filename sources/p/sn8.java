package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sn8 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ yqg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn8(iu30 iu30Var, yqg yqgVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = yqgVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yqg yqgVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new nn8(yqgVar != null ? yqgVar.b() : 0L));
                break;
            case 1:
                iu30Var.invoke(new bp8(yqgVar.b()));
                break;
            case 2:
                iu30Var.invoke(new dfk(yqgVar != null ? yqgVar.b() : 0L));
                break;
            case 3:
                iu30Var.invoke(new ul20(yqgVar.b()));
                break;
            case 4:
                iu30Var.invoke(new od60(yqgVar != null ? yqgVar.b() : 0L));
                break;
            case 5:
                iu30Var.invoke(new qna0(yqgVar.b()));
                break;
            case 6:
                iu30Var.invoke(new s2v0(yqgVar != null ? yqgVar.b() : 0L));
                break;
            case 7:
                iu30Var.invoke(new oq31(yqgVar.b()));
                break;
            default:
                iu30Var.invoke(new rvi1(yqgVar != null ? yqgVar.b() : 0L));
                break;
        }
        return rih1Var;
    }
}
