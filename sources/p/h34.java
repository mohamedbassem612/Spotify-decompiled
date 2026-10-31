package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h34 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i34 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h34(i34 i34Var, byte b) {
        super(1);
        this.a = b;
        this.b = i34Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i34 i34Var = this.b;
        switch (b) {
            case 0:
                z2s z2sVar = (z2s) obj;
                z2sVar.R(e04.class, (qtw) i34Var.c, dt3.i, dt3.t, dt3.Z, false, p83.d1);
                z2sVar.R(d04.class, (qtw) i34Var.c, dt3.X, dt3.Y, dt3.N0, false, p83.e1);
                break;
            default:
                o4o1.o((y2s) obj, (kdn0) i34Var.d, new h34(i34Var, (byte) 0));
                break;
        }
        return rih1Var;
    }
}
