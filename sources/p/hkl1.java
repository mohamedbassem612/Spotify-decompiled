package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hkl1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ikl1 b;

    public /* synthetic */ hkl1(ikl1 ikl1Var, byte b) {
        this.a = b;
        this.b = ikl1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ikl1 ikl1Var = this.b;
        switch (b) {
            case 0:
                ikl1Var.d.a(ikl1Var.c.e().switchMap(new dmj1(ikl1Var, (byte) 7)).subscribe(new rc6(ikl1Var.e, (byte) 9), new hkl1(ikl1Var, (byte) 1)));
                break;
            default:
                ikl1Var.e.onNext(new xsq0((Throwable) obj));
                break;
        }
    }
}
