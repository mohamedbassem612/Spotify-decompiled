package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pgk extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sgk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pgk(sgk sgkVar, byte b) {
        super(1);
        this.a = b;
        this.b = sgkVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        sgk sgkVar = this.b;
        switch (b) {
            case 0:
                mr20 mr20VarI = t5p1.i(sgkVar.d);
                String str = ((ngk) obj).a;
                return new x010(new ld2(mr20VarI, str, (byte) 4), yoi1.g(sgkVar.c.c(str)), new uvc(3, (lnm) null, (byte) 1), (byte) 1);
            case 1:
                ((qtr) obj).b(new u08(sgkVar, (lnm) null, (byte) 3));
                return rih1.a;
            default:
                return sgkVar.a.a(b900.a);
        }
    }
}
