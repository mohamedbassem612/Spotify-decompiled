package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mnq0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ onq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnq0(onq0 onq0Var, byte b) {
        super(1);
        this.a = b;
        this.b = onq0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        onq0 onq0Var = this.b;
        switch (b) {
            case 0:
                dxy dxyVar = onq0Var.a;
                me20 me20Var = ((lnq0) obj).b;
                return ((Completable) ((ffr) dxyVar.b).invoke(me20Var)).d(Observable.just(new rnq0(me20Var))).onErrorReturn(si10.V0);
            default:
                dxy dxyVar2 = onq0Var.a;
                c560 c560Var = ((knq0) obj).b;
                return ((Completable) ((svb0) dxyVar2.e).invoke(c560Var.a())).c(j2h1.D((q8n) dxyVar2.g, new cto0(dxyVar2, c560Var, (lnm) null, (byte) 15))).h(zzc0.Y0).o(Functions.h).w();
        }
    }
}
