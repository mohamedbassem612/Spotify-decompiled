package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ada0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pzw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ada0(pzw pzwVar, byte b) {
        super(1);
        this.a = b;
        this.b = pzwVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pzw pzwVar = this.b;
        switch (b) {
            case 0:
                return (evz) ((iir) pzwVar.e).c;
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.c(new vm0(pzwVar, (lnm) null, (byte) 17));
                qtrVar.b(new jaz(pzwVar, (lnm) null, (byte) 7));
                return rih1.a;
        }
    }
}
