package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qs11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hpc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs11(hpc hpcVar, byte b) {
        super(2);
        this.a = b;
        this.b = hpcVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        hpc hpcVar = this.b;
        switch (b) {
            case 0:
                return new jpg0((laa) hpcVar.invoke(), br11.b1);
            default:
                return new jpg0((laa) hpcVar.invoke(), ss11.b);
        }
    }
}
