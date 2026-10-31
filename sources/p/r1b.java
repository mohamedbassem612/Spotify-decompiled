package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r1b extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ldo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1b(ldo ldoVar, byte b) {
        super(1);
        this.a = b;
        this.b = ldoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ldo ldoVar = this.b;
        switch (b) {
            case 0:
                return new c64((ik) ldoVar.d, (n1b) obj, (byte) 27);
            default:
                ((qtr) obj).b(new ep0(ldoVar, (lnm) null, (byte) 8));
                return rih1.a;
        }
    }
}
