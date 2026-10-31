package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m7l1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n0o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7l1(n0o n0oVar, byte b) {
        super(1);
        this.a = b;
        this.b = n0oVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        n0o n0oVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(n0oVar.b, (o3r) n0oVar.t, (j7l1) obj);
            case 1:
                ((qtr) obj).b(new efj1(n0oVar, null, (byte) 5));
                return rih1.a;
            default:
                return (String) n0oVar.f;
        }
    }
}
