package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b2s extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d2s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2s(d2s d2sVar, byte b) {
        super(1);
        this.a = b;
        this.b = d2sVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d2s d2sVar = this.b;
        switch (b) {
            case 0:
                d2sVar.d.c.a((String) null, false);
                break;
            case 1:
                d2sVar.d.a(d2sVar.t.p(), true);
                break;
            case 2:
                d2sVar.t.h();
                d2sVar.b.d();
                break;
            default:
                d2sVar.t.o();
                d2sVar.b.d();
                break;
        }
        return rih1Var;
    }
}
