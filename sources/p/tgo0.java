package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tgo0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dxy b;
    public final /* synthetic */ ugo0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tgo0(dxy dxyVar, ugo0 ugo0Var, byte b) {
        super(1);
        this.a = b;
        this.b = dxyVar;
        this.c = ugo0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ugo0 ugo0Var = this.c;
        dxy dxyVar = this.b;
        switch (b) {
            case 0:
                mvn0 mvn0Var = new mvn0(ugo0Var, dxyVar, (tv80) obj, (byte) 1);
                String str = ugo0Var.b;
                if (!ihc1.y0(str)) {
                    mvn0Var.invoke(str);
                }
                break;
            default:
                ((ggl) dxyVar.d).e(ugo0Var.h, (String) obj, ugo0Var.e);
                break;
        }
        return rih1Var;
    }
}
