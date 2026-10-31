package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xbo extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zbo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xbo(zbo zboVar, byte b) {
        super(1);
        this.a = b;
        this.b = zboVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zbo zboVar = this.b;
        switch (b) {
            case 0:
                sbo sboVar = (sbo) obj;
                if (!zboVar.a.l()) {
                    return r6x.a;
                }
                cco ccoVar = zboVar.b;
                qbo qboVar = sboVar.l;
                return o4p1.r(new m441(new us0(ccoVar, new kbo(qboVar.a, qboVar.b, sboVar.c, sboVar.b, qboVar.c, qboVar.d, qboVar.e, qboVar.f), (lnm) null, (byte) 25)), ccoVar.f);
            default:
                ((qtr) obj).b(new ep0(zboVar, null, (byte) 22));
                return rih1.a;
        }
    }
}
