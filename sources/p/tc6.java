package p;

import android.content.res.Resources;
import android.view.View;
import com.spotify.player.model.Context;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tc6 {
    public final zeu0 a;
    public final Resources b;
    public final kt91 c;
    public final Flowable d;
    public final e7p0 e;
    public final eu4 f;
    public final ynb0 g;
    public final xye1 h;
    public final muz i;
    public final String j;
    public final Scheduler k;
    public final ruz l;
    public final Scheduler m;

    public tc6(zeu0 zeu0Var, Resources resources, kt91 kt91Var, Flowable flowable, e7p0 e7p0Var, eu4 eu4Var, ynb0 ynb0Var, xye1 xye1Var, muz muzVar, String str, Scheduler scheduler, ruz ruzVar, Scheduler scheduler2, q8n q8nVar) {
        this.a = zeu0Var;
        this.b = resources;
        this.c = kt91Var;
        this.d = flowable;
        this.e = e7p0Var;
        this.f = eu4Var;
        this.g = ynb0Var;
        this.h = xye1Var;
        this.i = muzVar;
        this.j = str;
        this.k = scheduler;
        this.l = ruzVar;
        this.m = scheduler2;
    }

    public static boolean e(feh fehVar) {
        return (fehVar instanceof beh) && ihc1.h0(((beh) fehVar).a, "pick_and_shuffle_capped_video_context", false);
    }

    public final Single a(nc6 nc6Var) {
        if (this.f.e() && (nc6Var instanceof lc6) && ((lc6) nc6Var).a == ErrorType.VIDEO_GEORESTRICTED) {
            Flowable flowable = this.d;
            return x0d.j(flowable, flowable).filter(v560.g).firstOrError().map(qz70.g).flatMap(new bv40(this, (byte) 20));
        }
        Single singleJust = Single.just(nc6Var);
        singleJust.getClass();
        return singleJust;
    }

    public final Single b(Single single, Observable observable) {
        return single.toObservable().withLatestFrom(observable, b6j0.f).firstOrError().flatMap(new lan1(this, (byte) 23));
    }

    public final Single c(String str) {
        Observable observableF = f();
        PlayCommand.Builder builder = PlayCommand.Builder.builder();
        builder.context(Context.fromUri(this.j));
        builder.playOrigin(PlayOrigin.create("free-tier-artist"));
        return b(this.i.a(builder.build()).observeOn(this.k).doOnSuccess(new oc6(this, (byte) 0)).observeOn(this.m).flatMap(new ow3(this, str, (byte) 10)), observableF).flatMap(new fl1((Object) this, (byte) 22)).map(ios.g).doOnSuccess(new a21(str, this, (byte) 11)).doOnError(new oc6(this, (byte) 1)).onErrorReturnItem(Boolean.FALSE);
    }

    public final Single d(String str) {
        Observable observableF = f();
        PlayCommand.Builder builder = PlayCommand.Builder.builder();
        builder.context(Context.fromUri(str).toBuilder().metadata(Collections.singletonMap("is_single_track_video_content", "true")).build());
        builder.playOrigin(PlayOrigin.create("free-tier-artist"));
        builder.options(PreparePlayOptions.builder().skipTo(SkipToTrack.fromUri(str)).build());
        return b(this.i.a(builder.build()).flatMap(new em3((Object) this, (Object) str, (byte) 13)), observableF).flatMap(new cp5(this, (byte) 21)).map(fmv.g).doOnSuccess(new oc6(this, (byte) 2)).doOnError(new oc6(this, (byte) 3)).onErrorReturnItem(Boolean.FALSE);
    }

    public final Observable f() {
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(PlayerError.builder(ErrorType.SUCCESS).build());
        return Observable.create(new km3((Object) behaviorSubjectG, (Object) this.a.a().subscribe(new rc6(behaviorSubjectG, (byte) 0)), (byte) 12));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(onm onmVar) {
        sc6 sc6Var;
        if (onmVar instanceof sc6) {
            sc6Var = (sc6) onmVar;
            int i = sc6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sc6Var.c = i - Integer.MIN_VALUE;
            } else {
                sc6Var = new sc6(this, onmVar);
            }
        } else {
            sc6Var = new sc6(this, onmVar);
        }
        Object objI = sc6Var.a;
        int i2 = sc6Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                ezc ezcVar = ((ov20) this.g.get()).a;
                sc6Var.c = 1;
                objI = b5p1.i(ezcVar, sc6Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objI);
            }
            return (Map) objI;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void h(String str) {
        er91 er91Var = new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        kt91 kt91Var = this.c;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }
}
