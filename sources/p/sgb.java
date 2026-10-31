package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sgb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sgb(rwj rwjVar, byte b) {
        super(1);
        this.a = b;
        this.b = rwjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rwj rwjVar = this.b;
        switch (b) {
            case 0:
                rjr rjrVar = (rjr) ((ynb0) rwjVar.f).get();
                inr inrVar = rjrVar.a;
                return new rgb(new ht20(new qer(yoi1.g(Observable.combineLatest(hqq0.K(inrVar), inrVar.j(), new ejb(rjrVar, (byte) 6))), rjrVar, (byte) 4), new qjr(2, (lnm) null, (byte) 0)), (byte) 0);
            default:
                ((qtr) obj).b(new kr(rwjVar, (lnm) null, (byte) 9));
                return rih1.a;
        }
    }
}
