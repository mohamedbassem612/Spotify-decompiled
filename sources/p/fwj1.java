package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fwj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yup0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwj1(yup0 yup0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yup0Var;
    }

    public final Object invoke(Object obj) {
        bwj1 bwj1Var;
        byte b = this.a;
        yup0 yup0Var = this.b;
        switch (b) {
            case 0:
                int iOrdinal = ((nn4) yup0Var.d).a().ordinal();
                if (iOrdinal == 0) {
                    bwj1Var = bwj1.a;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    bwj1Var = bwj1.b;
                }
                return new cwj1(bwj1Var, z6x.a, null);
            default:
                ((qtr) obj).b(new efj1(yup0Var, null, (byte) 1));
                return rih1.a;
        }
    }
}
