package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vcc0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zcc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vcc0(zcc0 zcc0Var, byte b) {
        super(1);
        this.a = b;
        this.b = zcc0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zcc0 zcc0Var = this.b;
        switch (b) {
            case 0:
                tcc0 tcc0Var = (tcc0) obj;
                return new lt20(yoi1.g(Observable.combineLatest(zcc0Var.c.a, ((mq6) zcc0Var.d).a(tcc0Var.a).retry(3L), ws10.X).switchMap(new x390(zcc0Var, tcc0Var, (byte) 26))), new pq0(3, (lnm) null, (byte) 2), (byte) 0);
            default:
                ((qtr) obj).b(new xcc0(zcc0Var, (lnm) null, (byte) 0));
                return rih1.a;
        }
    }
}
