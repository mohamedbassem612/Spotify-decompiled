package p;

import com.spotify.messages.PuffinHeadphonesNotSupportedEvent;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fjg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gjg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fjg0(gjg0 gjg0Var, byte b) {
        super(1);
        this.a = b;
        this.b = gjg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        byte b = this.a;
        gjg0 gjg0Var = this.b;
        switch (b) {
            case 0:
                cjg0 cjg0Var = (cjg0) obj;
                uw0 uw0Var = gjg0Var.a;
                boolean z = cjg0Var.c;
                q560 q560Var = cjg0Var.d;
                t2j0 t2j0Var = ((qy30) uw0Var.h).a;
                gqy0 gqy0VarN = PuffinHeadphonesNotSupportedEvent.n();
                gqy0VarN.s(q560Var.a);
                String str = q560Var.c;
                if (str != null) {
                    gqy0VarN.n(str);
                }
                String str2 = q560Var.d;
                if (str2 != null) {
                    gqy0VarN.q(str2);
                }
                String str3 = q560Var.b;
                if (str3 != null) {
                    gqy0VarN.r(str3);
                }
                t2j0Var.a(gqy0VarN.build());
                return ((Completable) ((gfr) uw0Var.Z).invoke()).c(new CompletableFromAction(new djg0(z, uw0Var, (byte) 0))).s((Scheduler) uw0Var.c).w();
            case 1:
                return ((Single) ((na) gjg0Var.a.e).invoke()).flatMapObservable(sa20.N0).doOnComplete(ps4.S0).doOnError(zzc0.g).onErrorReturn(ta20.N0);
            case 2:
                bjg0 bjg0Var = (bjg0) obj;
                uw0 uw0Var2 = gjg0Var.a;
                le20 le20Var = bjg0Var.c;
                String str4 = bjg0Var.d;
                hpq0 hpq0Var = bjg0Var.e;
                tb0 tb0Var = bjg0Var.f;
                ((cpr) uw0Var2.g).b(hpq0Var);
                if (tb0Var instanceof sb0) {
                    l560 l560Var = (l560) ((q5) uw0Var2.O0).invoke(tb0Var, str4);
                    hma1 hma1VarEdit = ((iov0) uw0Var2.N0).a.edit();
                    hma1VarEdit.d(jov0.a, l560Var.a);
                    hma1VarEdit.g();
                }
                return Completable.l(p7h.M(new Completable[]{j2h1.D((q8n) uw0Var2.Y, new tfe0(uw0Var2, le20Var, (lnm) null, (byte) 17)), ((vqb0) uw0Var2.b).invoke()})).d(Observable.just(new ujg0(le20Var)));
            case 3:
                uw0 uw0Var3 = gjg0Var.a;
                fpt fptVar = ((wig0) obj).c;
                return ((Single) ((ek1) uw0Var3.f).invoke(fptVar.b, fptVar.c)).flatMapObservable(sa20.N0).doOnComplete(ps4.S0).doOnError(zzc0.g).onErrorReturn(ta20.N0);
            case 4:
                uw0 uw0Var4 = gjg0Var.a;
                le20 le20Var2 = ((uig0) obj).c;
                String str5 = le20Var2.a.a;
                String str6 = le20Var2.b.a;
                woa1 woa1Var = le20Var2.c;
                String str7 = woa1Var != null ? woa1Var.a : null;
                String str8 = le20Var2.d.a;
                boolean z2 = woa1Var != null;
                String str9 = woa1Var != null ? woa1Var.e : null;
                return ((Completable) ((ffr) uw0Var4.i).invoke(new me20(str5, str6, str7, str8, str9, true, z2))).d(Observable.just(new pjg0(le20Var2, str9))).doOnComplete(ps4.R0).doOnError(zzc0.f).onErrorReturn(a020.N0);
            default:
                uw0 uw0Var5 = gjg0Var.a;
                Scheduler scheduler = (Scheduler) uw0Var5.c;
                return (((vig0) obj).c ? ((Completable) ((x631) uw0Var5.t).invoke("android-puffin-onboarding")).c(new CompletableFromAction(new wqd0(uw0Var5, (byte) 5)).s(scheduler)) : new CompletableFromAction(new wqd0(uw0Var5, (byte) 5)).s(scheduler)).w();
        }
    }
}
