package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a2s extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xe90 b;
    public final /* synthetic */ d2s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2s(xe90 xe90Var, d2s d2sVar, byte b) {
        super(1);
        this.a = b;
        this.b = xe90Var;
        this.c = d2sVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d2s d2sVar = this.c;
        xe90 xe90Var = this.b;
        switch (b) {
            case 0:
                d2sVar.d.a(xe90Var.p(), false);
                break;
            case 1:
                xe90Var.h();
                d2sVar.b.d();
                break;
            default:
                xe90Var.o();
                d2sVar.b.d();
                break;
        }
        return rih1Var;
    }
}
