package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dty extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fty b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dty(fty ftyVar, byte b) {
        super(1);
        this.a = b;
        this.b = ftyVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        fty ftyVar = this.b;
        switch (b) {
            case 0:
                xsy xsyVar = (xsy) obj;
                if (!ftyVar.e) {
                    return new ipr(d3p1.H(ftyVar.c, ftyVar.f, xsyVar), ftyVar, xsyVar, (byte) 10);
                }
                Flowable flowable = ftyVar.a;
                vbm[] vbmVarArr = q601.a;
                return hu20.e(rqt0.w(new kge(flowable), rqy.Q0, rqt0.b), new y3s(ftyVar, xsyVar, (lnm) null));
            case 1:
                xsy xsyVar2 = (xsy) obj;
                return ftyVar.e ? ysy.a : new zsy(xsyVar2.a, xsyVar2.b);
            default:
                ((qtr) obj).b(new ety(ftyVar, (lnm) null));
                return rih1.a;
        }
    }
}
