package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dwx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xfx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dwx(xfx xfxVar, byte b) {
        super(2);
        this.a = b;
        this.b = xfxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        xfx xfxVar = this.b;
        switch (b) {
            case 0:
                return new eos(xfxVar.a.a, (byte) 0);
            case 1:
                return new tps(xfxVar.a.a);
            case 2:
                return new dvs(xfxVar.c.b);
            case 3:
                return new qws(xfxVar.h.a, 2131626283);
            case 4:
                return new ver(xfxVar.a.a, (byte) 0);
            case 5:
                return new yir(xfxVar.a.a, (byte) 0);
            case 6:
                return new emr(xfxVar.a.a);
            case 7:
                return new zpr(xfxVar.d.a);
            case 8:
                return new cqr(xfxVar.a.a);
            case 9:
                return new plr(xfxVar.a.a);
            case 10:
                return new fcs(xfxVar.a.a, (byte) 0);
            case 11:
                return new gcs(xfxVar.a.a);
            default:
                return new whs(xfxVar.a.a);
        }
    }
}
