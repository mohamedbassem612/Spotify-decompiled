package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class btw extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dtw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ btw(dtw dtwVar, byte b) {
        super(1);
        this.a = b;
        this.b = dtwVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        dtw dtwVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                Object obj2 = dtwVar.f;
                t8r0 t8r0Var = dtwVar.x;
                loo1.o(th, obj2, t8r0Var != null ? ((h141) ((rl1) t8r0Var.b).d).getState() : null, dtwVar.a.b());
                throw null;
            case 1:
                return dtwVar.w;
            case 2:
                return dtwVar.w;
            case 3:
                return dtwVar.w;
            default:
                return dtwVar.w;
        }
    }
}
