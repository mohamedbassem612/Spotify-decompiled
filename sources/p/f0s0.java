package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f0s0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r8s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0s0(r8s r8sVar, byte b) {
        super(1);
        this.a = b;
        this.b = r8sVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        r8s r8sVar = this.b;
        switch (b) {
            case 0:
                return new x010((bpb1) r8sVar.X, (mr20) r8sVar.Y, new a82(3, (lnm) null, (byte) 5), (byte) 1);
            case 1:
                return r8sVar.e((d0s0) obj);
            default:
                ((qtr) obj).b(new pnp0(r8sVar, lnmVar, (byte) 4));
                return rih1.a;
        }
    }
}
