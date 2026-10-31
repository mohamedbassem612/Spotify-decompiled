package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c640 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jb3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c640(jb3 jb3Var, byte b) {
        super(1);
        this.a = b;
        this.b = jb3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jb3 jb3Var = this.b;
        switch (b) {
            case 0:
                return (epb1) jb3Var.d;
            case 1:
                ((qtr) obj).b(new skv(jb3Var, (lnm) null, (byte) 11));
                return rih1.a;
            case 2:
                b640 b640Var = (b640) obj;
                return new wco("", b640Var.b, "", ((mcn1) jb3Var.f).b, b640Var.c, false, Integer.valueOf(((ij81) jb3Var.g).b), 32);
            default:
                return ((hjc) jb3Var.c).a(uco.b);
        }
    }
}
