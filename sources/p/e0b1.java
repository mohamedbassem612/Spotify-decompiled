package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e0b1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r8s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0b1(r8s r8sVar, byte b) {
        super(1);
        this.a = b;
        this.b = r8sVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        r8s r8sVar = this.b;
        switch (b) {
            case 0:
                return (jge) r8sVar.Y;
            default:
                ((qtr) obj).b(new pnp0(r8sVar, null, (byte) 29));
                return rih1.a;
        }
    }
}
