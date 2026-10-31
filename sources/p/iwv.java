package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iwv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lwv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iwv(lwv lwvVar, byte b) {
        super(1);
        this.a = b;
        this.b = lwvVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        w7x w7xVar = w7x.a;
        rih1 rih1Var = rih1.a;
        lwv lwvVar = this.b;
        switch (b) {
            case 0:
                hwv hwvVar = new hwv(lwvVar, (byte) 0);
                ((ji50) obj).b.put(kt51.class, r4o1.P(rnv.a1, w7xVar, hwvVar, fdv.X));
                break;
            case 1:
                hwv hwvVar2 = new hwv(lwvVar, (byte) 1);
                ((ji50) obj).b.put(vzu0.class, r4o1.P(rnv.b1, w7xVar, hwvVar2, fdv.Y));
                break;
            default:
                ((ji50) obj).b.put(lpw0.class, new r3r(new xzq((tyq) lwvVar.c.get(), rnv.c1), fdv.Z, 4));
                break;
        }
        return rih1Var;
    }
}
