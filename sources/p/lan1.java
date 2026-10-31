package p;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.fitness.workoutimpl.domain.effecthandlers.CueAudioPlaybackCancelledException;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lan1 implements Function, ya, vd, SingleOnSubscribe, Predicate, Producer {
    public static lan1 c;
    public final /* synthetic */ byte a;
    public final Object b;

    public lan1(Context context) {
        String strE;
        this.a = (byte) 0;
        l0c1 l0c1VarA = l0c1.a(context);
        this.b = l0c1VarA;
        l0c1VarA.b();
        String strE2 = l0c1VarA.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = l0c1VarA.e(l0c1.f("googleSignInOptions", strE2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.j(strE);
        } catch (JSONException unused) {
        }
    }

    public static synchronized lan1 d(Context context) {
        lan1 lan1Var;
        Context applicationContext = context.getApplicationContext();
        synchronized (lan1.class) {
            lan1Var = c;
            if (lan1Var == null) {
                lan1Var = new lan1(applicationContext);
                c = lan1Var;
            }
        }
        return lan1Var;
        return lan1Var;
    }

    public boolean a(tzc tzcVar) {
        String strEncodeToString;
        Object obj = ((Map) ((idd1) ((ow3) this.b).c).getValue()).get(tzcVar.b);
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(tzcVar.a.getBytes(StandardCharsets.UTF_8)), 2);
            strEncodeToString.getClass();
        } catch (Exception e) {
            v8i0.j("Failed to hash client ID: ", e.getMessage());
            strEncodeToString = "";
        }
        return u890.j(obj, strEncodeToString);
    }

    public boolean accept(Object obj) {
        return ((cp4) this.b).a() && ((ksk) obj).b;
    }

    public Object apply(Object obj) {
        ContextTrack contextTrack;
        Completable completableFlatMapCompletable;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                return ((bza0) obj2).b.a.c(((oo) obj).a).map(f610.i).toObservable().map(stf0.f).onErrorReturn(olj0.c);
            case 3:
                l62 l62Var = (l62) obj;
                qu0 qu0Var = (qu0) obj2;
                uu0 uu0Var = qu0Var.f;
                if (uu0Var != null) {
                    uu0Var.h = l62Var.Z instanceof lsn ? new ru0(true) : new ru0(false);
                }
                nwq0 nwq0Var = qu0Var.g;
                nwq0 nwq0Var2 = nwq0.a;
                if (nwq0Var != nwq0Var2) {
                    if (uu0Var != null) {
                        uu0Var.t(false);
                    }
                    qu0Var.g = nwq0Var2;
                }
                return !(l62Var.P0 instanceof l860) ? Observable.empty() : Observable.timer(2000L, TimeUnit.MILLISECONDS, qu0Var.b);
            case 4:
                Throwable th = (Throwable) obj;
                o811 o811Var = (o811) obj2;
                long j = o811Var.a + 1;
                o811Var.a = j;
                if (j >= 5) {
                    int i = Flowable.a;
                    return new FlowableError(Functions.h(th));
                }
                Logger.k("AuthClient Authentication - attempt " + j + "/5 error: " + th, new Object[0]);
                long j2 = o811Var.a;
                int i2 = Flowable.a;
                return Flowable.a0(j2 * j2, TimeUnit.SECONDS, Schedulers.b);
            case 5:
                y01 y01VarA = ((u11) obj2).c.a();
                bk8 bk8Var = y01VarA.a;
                return new qlj0(bk8Var != null ? new w01(y01VarA.b, y01VarA.c, bk8Var) : null);
            case 6:
                y61 y61Var = (y61) obj;
                j71 j71Var = (j71) obj2;
                return j71Var.d.a.c(y61Var.c).map(cxo1.d).concatMap(new e4b1(j71Var, (byte) 6)).concatMap(new oj80(j71Var, y61Var, (byte) 13)).flatMapObservable(o9p1.d).onErrorReturn(vap1.c);
            case 7:
                gz01 gz01Var = (gz01) obj;
                gx01 gx01Var = (gx01) ((bk1) obj2).b;
                String str = gz01Var.a;
                String str2 = gz01Var.b;
                String str3 = gz01Var.c;
                tv80 tv80Var = gz01Var.d;
                gx01Var.getClass();
                return Completable.f(new CompletableSource[]{new CompletableFromAction(new dx01(gx01Var, str2, (byte) 0)), gx01Var.g.a(str, str2, str3).p(new cx01(gx01Var, str, str2, str3, tv80Var)).p(new hyy0((Object) gx01Var, (Object) str2, (byte) 12))}).x(new xz01(str2, str3)).onErrorReturn(new x5j1(gz01Var, (byte) 7)).toObservable();
            case 8:
                String str4 = ((ax41) obj).b;
                return str4.length() == 0 ? Observable.empty() : j2h1.D(o6x.a, new nn01(((cz1) obj2).b, str4, (tv80) null, (lnm) null, (byte) 0)).w();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                bh90 bh90Var = (hi90) obj;
                return ((sjj0) ((yo31) obj2).b).a(bh90Var.f).map(new x5j1(bh90Var, (byte) 10));
            case 15:
                return Single.create(new yo31(obj2, (byte) 16));
            case 19:
                PlayerState playerState = (PlayerState) obj;
                return (!playerState.isPlaying() || playerState.isPaused() || (contextTrack = (ContextTrack) playerState.track().h()) == null || !l4o1.G(contextTrack)) ? Flowable.I(playerState) : Flowable.G(60L, 60L, TimeUnit.SECONDS, ((ys4) obj2).b).J(new rs4(playerState, (byte) 0)).U(playerState);
            case 21:
                if (!((Boolean) obj).booleanValue()) {
                    return CompletableEmpty.a;
                }
                odb0 odb0Var = (odb0) obj2;
                String str5 = (String) odb0Var.f.get();
                return odb0Var.c.x(mif1.g1).t(sa20.i).J(new dg90(odb0Var, (byte) 5)).x(new acn1(str5, (byte) 6)).B(new v6a0(odb0Var, str5, (byte) 7)).h(new f93(str5, (byte) 6)).s(odb0Var.a).o(Functions.h);
            case 23:
                mmr0 mmr0Var = (mmr0) obj;
                feh fehVar = (feh) mmr0Var.a;
                PlayerError playerError = (PlayerError) mmr0Var.b;
                boolean zC = ((tc6) obj2).f.c();
                lc6 lc6Var = mc6.a;
                if (!zC) {
                    if (!(fehVar instanceof ceh) && !tc6.e(fehVar)) {
                        lc6Var = new lc6(ErrorType.UNKNOWN);
                    }
                    Single singleJust = Single.just(lc6Var);
                    singleJust.getClass();
                    return singleJust;
                }
                if ((fehVar instanceof ceh) || tc6.e(fehVar)) {
                    if (tc6.e(fehVar)) {
                        return Single.just(lc6Var);
                    }
                    return playerError.error() == ErrorType.SUCCESS ? Single.just(lc6Var) : Single.just(new lc6(playerError.error()));
                }
                Single singleJust2 = Single.just(new lc6(ErrorType.UNKNOWN));
                singleJust2.getClass();
                return singleJust2;
            case 27:
                return ((lhc) obj2).k((hp40) obj);
            default:
                MessagePresentationStatus.Dismissed dismissed = (MessagePresentationStatus) obj;
                dismissed.toString();
                ye8 ye8Var = ((ze8) obj2).b;
                Single single = ye8Var.c;
                if (dismissed instanceof MessagePresentationStatus.Presented) {
                    completableFlatMapCompletable = single.flatMapCompletable(new t4d1(ye8Var, (byte) 21));
                } else if (dismissed instanceof MessagePresentationStatus.Dismissed) {
                    DismissReason.MessageButtonTapped dismissReason = dismissed.getDismissReason();
                    if ((dismissReason instanceof DismissReason.MessageButtonTapped) && u890.j(dismissReason.getButton().getIdentifier(), "Primary")) {
                        completableFlatMapCompletable = single.flatMapCompletable(new e4b1(ye8Var, (byte) 28));
                    } else {
                        completableFlatMapCompletable = CompletableEmpty.a;
                        completableFlatMapCompletable.getClass();
                    }
                } else {
                    completableFlatMapCompletable = CompletableEmpty.a;
                }
                return completableFlatMapCompletable.d(Observable.just(rih1.a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(c0m1 c0m1Var, onm onmVar) {
        ly7 ly7Var;
        if (onmVar instanceof ly7) {
            ly7Var = (ly7) onmVar;
            int i = ly7Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ly7Var.d = i - Integer.MIN_VALUE;
            } else {
                ly7Var = new ly7(this, onmVar);
            }
        } else {
            ly7Var = new ly7(this, onmVar);
        }
        Object obj = ly7Var.b;
        int i2 = ly7Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                ec4 ec4Var = (ec4) this.b;
                byte[] bArr = c0m1Var.a;
                ly7Var.a = c0m1Var;
                ly7Var.d = 1;
                Object objC = ec4Var.c(bArr, ly7Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0m1Var = ly7Var.a;
                hm5.M(obj);
            }
            return new e1m1(c0m1Var.b);
        } catch (Exception e) {
            teo teoVarA = ueo.a(e, 5);
            String message = e.getMessage();
            if (message == null) {
                message = "Audio playback failed";
            }
            return new d1m1(teoVarA.a, message, c0m1Var.b);
        } catch (CueAudioPlaybackCancelledException unused) {
            return new c1m1(c0m1Var.b);
        } catch (CancellationException e2) {
            throw e2;
        }
    }

    public void c(Uri uri) {
        Activity activity = (Activity) this.b;
        try {
            oxg1 oxg1Var = new oxg1();
            oxg1Var.g();
            oxg1Var.a().j(activity, uri);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.intent.action.VIEW", uri));
        }
    }

    public synchronized void e() {
        l0c1 l0c1Var = (l0c1) this.b;
        ReentrantLock reentrantLock = l0c1Var.a;
        reentrantLock.lock();
        try {
            l0c1Var.b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Object get() {
        return new DispatcherWorker(((wm8) this.b).b);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 16:
                o84 o84Var = (o84) obj;
                luk lukVar = o84Var.c;
                if (lukVar == null || !lukVar.i("android-cal-rollout-service.minimum_gearhead_version")) {
                    lukVar = o84Var.d;
                }
                if (lukVar != null) {
                    lukVar.e(new p54(singleEmitter, o84Var, (byte) 2));
                }
                break;
            case 17:
                bk4 bk4Var = (bk4) obj;
                singleEmitter.onSuccess(new yj4(((Boolean) Single.create(new yo31((Object) bk4Var, (byte) 18)).blockingGet()).booleanValue(), ((Boolean) Single.create(new fl1(bk4Var, (byte) 16)).blockingGet()).booleanValue()));
                break;
            case 18:
                singleEmitter.onSuccess(new ik4(((Boolean) Single.create(new yo31(obj, (byte) 19)).blockingGet()).booleanValue()));
                break;
            case 19:
            default:
                m26 m26Var = (m26) obj;
                luk lukVar2 = m26Var.r;
                if (lukVar2 == null || !lukVar2.i("apps-music-libs-eventsender.event_sending_interval_seconds")) {
                    lukVar2 = m26Var.s;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new k26(singleEmitter, m26Var, (byte) 3));
                }
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                singleEmitter.onSuccess(new mx4(((Boolean) Single.create(new yo31(obj, (byte) 21)).blockingGet()).booleanValue()));
                break;
        }
    }

    public boolean test(Object obj) {
        goj0 goj0VarA;
        hoj0 hoj0VarC = ((ioj0) obj).c(iq6.class, ((wp6) this.b).a);
        iq6 iq6Var = (iq6) ((hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA.a);
        return (iq6Var != null ? (op6) o7h.s0(iq6Var.a) : null) != null;
    }

    public lan1(bq6 bq6Var, wp6 wp6Var) {
        this.a = (byte) 24;
        this.b = wp6Var;
    }

    public /* synthetic */ lan1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
