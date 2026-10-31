package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m260 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pbq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m260(pbq pbqVar, byte b) {
        super(1);
        this.a = b;
        this.b = pbqVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pbq pbqVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return (r6h1) pbqVar.t;
            default:
                return new h3h1(new m260(pbqVar, (byte) 0));
        }
    }
}
