package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ltm0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rtm0 b;
    public final /* synthetic */ jtm0 c;

    public /* synthetic */ ltm0(rtm0 rtm0Var, jtm0 jtm0Var, byte b) {
        this.a = b;
        this.b = rtm0Var;
        this.c = jtm0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jtm0 jtm0Var = this.c;
        rtm0 rtm0Var = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                rtm0Var.a(new zsm0(jtm0Var.a, false));
                break;
            default:
                rtm0Var.a(new ctm0(jtm0Var.a, ((i091) obj).h));
                break;
        }
        return rih1Var;
    }
}
