package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class svu extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xvu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ svu(xvu xvuVar, byte b) {
        super(1);
        this.a = b;
        this.b = xvuVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        xvu xvuVar = this.b;
        switch (b) {
            case 0:
                l78 l78Var = (l78) xvuVar.h;
                return new x010(new p3t(yoi1.g(l78Var.a(((fvu) obj).d.c()).flatMapObservable(new fl1(l78Var, (byte) 26))), (byte) 9), new huz(Boolean.FALSE, (byte) 10), new ce2(3, (lnm) null, (byte) 15), (byte) 1);
            default:
                ((qtr) obj).b(new wm0(xvuVar, (lnm) null, (byte) 3));
                return rih1.a;
        }
    }
}
