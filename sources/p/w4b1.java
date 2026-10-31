package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.watchfeedentrypoints.api.v1.CreateSessionRequest;
import com.spotify.watchfeedentrypoints.api.v1.GetMessageRequest;
import com.spotify.watchfeedentrypoints.api.v1.SubmitMessageRequest;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import j$.time.LocalDate;
import java.util.Calendar;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w4b1 implements ah70, Function, qiw, BiFunction, oi30, SingleOnSubscribe, Init {
    public static final blq0 c = new blq0();
    public static final alq0 d = new alq0();
    public final /* synthetic */ byte a;
    public final Object b;

    public w4b1(koc0 koc0Var, qs6 qs6Var) {
        this.a = (byte) 27;
        this.b = ((roc0) koc0Var).e().map(pbo1.f).filter(qbo1.f).map(new mgx0(this)).distinctUntilChanged().switchMap(new ymm0(qs6Var, (byte) 21)).map(cxo1.h).onErrorComplete();
    }

    public Object a(w33 w33Var) {
        v33 v33Var = (v33) this.b;
        wqn wqnVarN = CreateSessionRequest.n();
        wqnVarN.n();
        return v33Var.d(wqnVarN.build(), w33Var);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                uv00 uv00Var = (uv00) obj;
                String str = ((m2) obj2).g;
                jo70 jo70Var = uv00Var.a(jo70.class, str).b;
                String str2 = jo70Var != null ? jo70Var.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                pnt pntVar = uv00Var.a(pnt.class, str).b;
                String str3 = pntVar != null ? pntVar.a : null;
                return new q2(str2, str3 != null ? str3 : "");
            case 3:
            case 5:
            case 6:
            case 11:
            case 13:
            case 16:
            case 17:
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            default:
                Observable observable = (Observable) obj;
                y87 y87Var = (y87) obj2;
                return Observable.combineLatest(observable, yoi1.i(new lt20(rqt0.u(new ht20(h4p1.g(new wc5(y87Var, new c64(yoi1.g(observable), y87Var, (byte) 14), (lnm) null, (byte) 8)), new sd0(2, (lnm) null, (byte) 13))), new jk(3, (lnm) null, (byte) 8), (byte) 0), o6xVar), new f2x0(y87Var));
            case 4:
                return ((v5n) ((yu) obj2).f.get()).a(((th61) obj).a);
            case 7:
                return new d1f0(((u11) obj2).j.n, ((e331) obj).a);
            case 8:
                return ((j71) obj2).a.d(((x61) obj).c).ignoreElement().w();
            case 9:
                b301 b301Var = (b301) obj;
                return new CompletableToSingle(j2h1.D(o6xVar, new c6((zj1) obj2, new frd1(b301Var.b, b301Var.a), b301Var, (lnm) null, (byte) 8)), new yj1(b301Var, (byte) 0), (Object) null).onErrorReturn(new ymm0(b301Var, (byte) 8));
            case 10:
                return yoi1.i(new m441(new q4((e4b1) obj2, (yr01) obj, (lnm) null, (byte) 23)), o6xVar);
            case 12:
                ch2 ch2Var = (ch2) obj;
                hh2 hh2Var = (hh2) obj2;
                djx0 djx0Var = hh2Var.d;
                int i = ch2Var.a;
                int i2 = ch2Var.b;
                int i3 = ch2Var.c;
                djx0Var.getClass();
                int i4 = Calendar.getInstance().get(1);
                if (1900 <= i3 && i3 <= i4) {
                    try {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setLenient(false);
                        calendar.set(i3, i2, i);
                        calendar.getTime();
                        LocalDate localDateNow = LocalDate.now();
                        LocalDate localDateOf = LocalDate.of(i3, i2 + 1, i);
                        if (localDateOf.isBefore(localDateNow) || localDateOf.isEqual(localDateNow)) {
                            z = true;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (z) {
                    hh2Var.a.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                }
                return new ig2(z);
            case 14:
                f7h f7hVar = (f7h) ((Map) obj).get(((tf3) obj2).a);
                return Boolean.valueOf(f7hVar != null ? f7hVar.c : false);
            case 15:
                kk3 kk3Var = ((mk3) obj).a;
                if (kk3Var == null) {
                    return ((bl3) obj2).h(nk3.b, cl3.c);
                }
                Single singleJust = Single.just(kk3Var);
                singleJust.getClass();
                return singleJust;
            case 20:
                return Single.create(new e4b1((hk4) obj2, (byte) 18));
            case 21:
                ContextTrack contextTrack = (ContextTrack) obj;
                ys4 ys4Var = (ys4) obj2;
                contextTrack.getClass();
                if (!l4o1.L(contextTrack)) {
                    return Flowable.I("");
                }
                q0i0 q0i0Var = ys4Var.u;
                return yoi1.i(new tf2(hu20.e(q0i0Var.a, new c6e0((lnm) null, new n0i0(l4o1.b0(contextTrack), q0i0Var, (byte) 0), (Object) null, (byte) 2)), (byte) 17), o6xVar).map(new ymm0(ys4Var, (byte) 17)).toFlowable(BackpressureStrategy.d);
        }
    }

    public rue0 b(String str) {
        return (v4b1) this.b;
    }

    public Object c(String str, String str2, w33 w33Var) {
        v33 v33Var = (v33) this.b;
        ko40 ko40VarN = GetMessageRequest.n();
        ko40VarN.q(str);
        ko40VarN.n(str2);
        return v33Var.b(ko40VarN.build(), w33Var);
    }

    public n8d0 d() {
        return (pzc) this.b;
    }

    public w2r0 e() {
        xf4 xf4Var = (xf4) this.b;
        if (xf4Var.i()) {
            return w2r0.d1;
        }
        return xf4Var.y() ? w2r0.U0 : w2r0.W0;
    }

    public First e0(Object obj) {
        eo5 eo5Var = (eo5) obj;
        eo5Var.getClass();
        do5 do5Var = ((ho5) this.b).e.a;
        return First.c(eo5Var, dm61.A0(do5Var != null ? new un5(do5Var) : null));
    }

    public Object f(String str, String str2, w33 w33Var) {
        v33 v33Var = (v33) this.b;
        pmc1 pmc1VarN = SubmitMessageRequest.n();
        pmc1VarN.n(str2);
        pmc1VarN.q(str);
        return v33Var.c(pmc1VarN.build(), w33Var);
    }

    public void q(Bundle bundle, String str) {
        kp41 kp41Var;
        if (str.hashCode() == -198424014 && str.equals("ALLBOARDING_SCREEN_RESPONSE") && (kp41Var = (kp41) bundle.getParcelable("ALLBOARDING_SCREEN_RESPONSE")) != null) {
            ajq0 ajq0Var = (ajq0) this.b;
            ((gon0) ajq0Var.a).t();
            ((ve3) ajq0Var.d).invoke(kp41Var);
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 17:
                singleEmitter.onSuccess(new b44(((Boolean) Single.create(new e4b1((f44) obj, (byte) 15)).blockingGet()).booleanValue()));
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                g84 g84Var = (g84) obj;
                luk lukVar = g84Var.c;
                if (lukVar == null || !lukVar.i("android-boombox-settings.crossfade_enabled")) {
                    lukVar = g84Var.d;
                }
                if (lukVar != null) {
                }
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                eh4 eh4Var = (eh4) obj;
                singleEmitter.onSuccess(new ch4(((Boolean) Single.create(new e4b1(eh4Var, (byte) 17)).blockingGet()).booleanValue(), ((Boolean) Single.create(new t4d1(eh4Var, (byte) 13)).blockingGet()).booleanValue()));
                break;
            case 20:
            case 21:
            case 23:
            case 24:
            default:
                m26 m26Var = (m26) obj;
                luk lukVar2 = m26Var.r;
                if (lukVar2 == null || !lukVar2.i("apps-music-libs-eventsender.rate_limiting_rule_3_time_unit_seconds")) {
                    lukVar2 = m26Var.s;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new k26(singleEmitter, m26Var, (byte) 12));
                }
                break;
            case 22:
                ax4 ax4Var = (ax4) obj;
                luk lukVar3 = ax4Var.q;
                if (lukVar3 == null || !lukVar3.i("android-perf-tracking.ads_fetch_oops_sampling_bps")) {
                    lukVar3 = ax4Var.r;
                }
                if (lukVar3 != null) {
                    lukVar3.e(new e44(singleEmitter, ax4Var, (byte) 3));
                }
                break;
            case 25:
                singleEmitter.onSuccess(new a26((y16) Single.create(new e4b1((c26) obj, (byte) 22)).blockingGet()));
                break;
        }
    }

    public void v(Object obj) {
        pun0 pun0Var = (run0) obj;
        sp spVar = (sp) this.b;
        xo xoVar = xo.b;
        t3b1 t3b1Var = (AccountSelectionActivity) spVar.e;
        if (pun0Var instanceof pun0) {
            Intent intent = pun0Var.a;
            t3b1Var.finish();
            t3b1Var.startActivity(intent);
            Consumer consumer = (Consumer) spVar.f;
            if (consumer != null) {
                consumer.accept(xoVar);
                return;
            } else {
                u890.C("consumer");
                throw null;
            }
        }
        if (!pun0Var.equals(nun0.a)) {
            if (pun0Var.equals(oun0.a)) {
                return;
            }
            eg.o();
        } else {
            t3b1Var.finish();
            Consumer consumer2 = (Consumer) spVar.f;
            if (consumer2 != null) {
                consumer2.accept(xoVar);
            } else {
                u890.C("consumer");
                throw null;
            }
        }
    }

    public w4b1() {
        this.a = (byte) 0;
        v4b1 v4b1Var = new v4b1();
        ((mkn0) v4b1Var).a = "spotify";
        this.b = v4b1Var;
    }

    public /* synthetic */ w4b1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public w4b1(o241 o241Var, buf0 buf0Var, xf4 xf4Var) {
        this.a = (byte) 28;
        this.b = xf4Var;
    }

    public w4b1(luk lukVar, krh krhVar, RetrofitMaker retrofitMaker, yqg yqgVar, Context context, gma1 gma1Var, Observable observable, q8n q8nVar, y2g0 y2g0Var) {
        this.a = (byte) 6;
        this.b = lukVar;
    }

    public Object apply(Object obj, Object obj2) {
        String strN;
        String str = (String) obj;
        spq0 spq0Var = (spq0) obj2;
        Resources resources = (Resources) ((gid) this.b).c;
        String string = str.length() == 0 ? resources.getString(2131952027) : str;
        if (str.length() == 0) {
            strN = xap1.x(resources, xap1.l(spq0Var), false, (Integer) null);
        } else {
            strN = xap1.n(resources, xap1.l(spq0Var), false, (Integer) null);
        }
        return new t62(string, strN);
    }
}
