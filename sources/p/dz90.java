package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dz90 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dz90(cs90 cs90Var, byte b) {
        super(1);
        this.a = b;
        this.b = cs90Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cs90 cs90Var = this.b;
        switch (b) {
            case 0:
                return cs90.f((pp90) cs90Var.b.b.current().getValue());
            default:
                rwq0.z((qtr) obj, new bt70(cs90Var, (byte) 12));
                return rih1.a;
        }
    }
}
