package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qdc0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zdc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdc0(zdc0 zdc0Var, byte b) {
        super(1);
        this.a = b;
        this.b = zdc0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 3;
        lnm lnmVar = null;
        zdc0 zdc0Var = this.b;
        switch (b) {
            case 0:
                return q601.b(new x010(new x880(new fu20(zdc0Var.h.c, new ss90(zdc0Var, null, (byte) 21), (byte) 1), zdc0Var, (byte) 20), zdc0Var.Z, new vv70(3, (lnm) null, (byte) 7), (byte) 1));
            default:
                ((qtr) obj).b(new w3a(zdc0Var, lnmVar, b2));
                return rih1.a;
        }
    }
}
