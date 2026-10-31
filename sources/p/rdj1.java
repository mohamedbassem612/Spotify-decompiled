package p;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.libs.connect.events.proto.SystemVolumeControl;
import com.spotify.yourupdates.badgingstate.models.BadgingState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rdj1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public rdj1(String str, vi11 vi11Var) {
        this.a = (byte) 11;
        this.b = vi11Var;
    }

    public final void accept(Object obj) {
        View view;
        Double d;
        Double d2;
        switch (this.a) {
            case 0:
                ywv0 ywv0Var = (ywv0) this.b;
                ((kt91) ywv0Var.a).k(new er91((fs91) null, ((Resources) ywv0Var.b).getString(2131955897), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return;
            case 1:
                mmr0 mmr0Var = (mmr0) obj;
                Boolean bool = (Boolean) mmr0Var.a;
                twj1 twj1Var = (twj1) mmr0Var.b;
                tij1 tij1Var = (tij1) this.b;
                boolean zBooleanValue = bool.booleanValue();
                int i = tij1.k1;
                boolean z = !zBooleanValue || (twj1Var instanceof rwj1);
                tij1Var.c1.setVisibility(!z ? 0 : 8);
                boolean z2 = tij1Var.Z0;
                ImageView imageView = tij1Var.e1;
                if (!z2) {
                    imageView.setVisibility(z ? 0 : 8);
                    return;
                }
                imageView.setVisibility(8);
                dtw dtwVar = tij1Var.h1;
                if (dtwVar == null || (view = dtwVar.w) == null) {
                    return;
                }
                view.setVisibility(z ? 0 : 8);
                return;
            case 2:
                qma qmaVar = (qma) obj;
                upy0 upy0Var = (upy0) this.b;
                mrj1 mrj1Var = (mrj1) upy0Var.c;
                aj4 aj4Var = (aj4) upy0Var.h;
                int iJ = aj4Var.j();
                boolean zN = aj4Var.n();
                daq daqVar = mrj1Var.a.a;
                k9k k9kVar = new k9k(daqVar, qmaVar);
                krj1 krj1Var = (krj1) ((Cosmonaut) daqVar.w3.get()).createCosmosService(krj1.class);
                c8o.m(krj1Var);
                Scheduler scheduler = (Scheduler) daqVar.z1.get();
                Scheduler scheduler2 = (Scheduler) daqVar.r3.get();
                v1k v1kVar = new v1k(krj1Var, scheduler, scheduler2);
                it8 it8Var = new it8((byte) 11);
                it8 it8Var2 = new it8((byte) 11);
                m2p m2pVar = (m2p) daqVar.uq.get();
                dkp dkpVar = (dkp) daqVar.cu.get();
                d0u0 cv7Var = new cv7((sf0) daqVar.oc.get(), (byte) 0);
                l9q l9qVar = (l9q) daqVar.Hr.get();
                o9q o9qVar = (o9q) daqVar.Lr.get();
                m9q m9qVar = (m9q) daqVar.Jr.get();
                n9q n9qVar = (n9q) daqVar.Kr.get();
                p9q p9qVar = (p9q) daqVar.Mr.get();
                q9q q9qVar = (q9q) daqVar.Nr.get();
                y9q y9qVar = (y9q) daqVar.du.get();
                r9q r9qVar = (r9q) daqVar.Or.get();
                s9q s9qVar = (s9q) daqVar.Pr.get();
                p44 p44Var = new p44(false, false, (luk) daqVar.L1.get());
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(l9qVar);
                if (p44Var.a()) {
                    smc0VarN.add(m9qVar);
                }
                if (p44Var.b()) {
                    smc0VarN.add(n9qVar);
                }
                smc0VarN.add(o9qVar);
                smc0VarN.add(p9qVar);
                smc0VarN.add(q9qVar);
                smc0VarN.add(y9qVar);
                smc0VarN.add(r9qVar);
                smc0VarN.add(s9qVar);
                smc0 smc0VarK = k4p1.k(smc0VarN);
                c8o.m(smc0VarK);
                ArrayList arrayListN0 = o7h.N0(Collections.singletonList((pqc1) daqVar.O8.get()), o7h.N0(smc0VarK, p7h.M(new d0u0[]{dkpVar.a(new bas(2)), cv7Var, (vwj1) daqVar.R8.get(), (dw7) daqVar.zs.get()})));
                w2k1 w2k1Var = (w2k1) daqVar.L8.get();
                yna ynaVar = (yna) ((zjp) ((gkp) daqVar.V8.get()).K.get()).y.get();
                cnh0 cnh0Var = (cnh0) ((gkp) daqVar.V8.get()).j.get();
                c8o.m(cnh0Var);
                ktp0 ktp0Var = new ktp0(ynaVar, cnh0Var.a(l1b0.o((w5b1) daqVar.W3.get()), qmaVar));
                ynb0 ynb0VarA = xqu.a(daqVar.yq);
                ynb0 ynb0VarA2 = xqu.a(daqVar.eu);
                m9n m9nVar = (m9n) ((jly0) k9kVar.c).get();
                Scheduler scheduler3 = (Scheduler) daqVar.r3.get();
                ynb0 ynb0VarA3 = xqu.a((p2p) k9kVar.d);
                ynb0 ynb0VarA4 = xqu.a((p2p) k9kVar.e);
                fpa fpaVar = (fpa) daqVar.X8.get();
                phi0 phi0Var = new phi0((m9n) ((jly0) k9kVar.c).get());
                utg0 utg0Var = (utg0) ((jly0) k9kVar.f).get();
                p74 p74Var = (p74) ynb0VarA4.get();
                boolean zE = p74Var.e();
                boolean zD = p74Var.d();
                boolean zA = p74Var.a();
                boolean zC = p74Var.c();
                soa soaVarF = m2pVar.a(qmaVar).f();
                soaVarF.w = "context-player-ad";
                soaVarF.u = w2k1Var;
                soaVarF.x = false;
                soaVarF.y = true;
                if (zE) {
                    soaVarF.z = (bpa) ynb0VarA3.get();
                }
                soa soaVarF2 = m2pVar.a(qmaVar).f();
                soaVarF2.w = "context-player";
                soaVarF2.u = w2k1Var;
                soaVarF2.x = true;
                soaVarF2.y = true;
                soaVarF2.B = ktp0Var;
                soaVarF2.D = (yna) ynb0VarA.get();
                soaVarF2.z = (bpa) ynb0VarA2.get();
                apa apaVar = new apa(it8Var, it8Var2, soaVarF, soaVarF2, m9nVar, scheduler3, phi0Var, ynb0VarA3, zE, zD, zA, zC, fpaVar, utg0Var);
                ArrayList arrayListO0 = o7h.O0(utg0Var, o7h.N0(arrayListN0, Collections.singletonList(apaVar)));
                soaVarF.v = new ArrayList(arrayListO0);
                soaVarF2.v = new ArrayList(arrayListO0);
                v290 v290Var = (v290) daqVar.Kn.get();
                yjj1 yjj1Var = (yjj1) daqVar.zq.get();
                s311 s311Var = (s311) daqVar.fu.get();
                nwj1 nwj1Var = (nwj1) daqVar.S8.get();
                dxz0 dxz0Var = (dxz0) daqVar.I4.get();
                vwj1 vwj1Var = (vwj1) daqVar.R8.get();
                zia ziaVar = nwj1Var.c;
                if (!ziaVar.c()) {
                    ziaVar.accept(nwj1Var.c());
                }
                zia ziaVar2 = nwj1Var.d;
                if (!ziaVar2.c()) {
                    ziaVar2.accept(nwj1Var.b());
                }
                Observable observableDistinctUntilChanged = Observable.combineLatest(ziaVar, ziaVar2, dxz0Var.c().map(y1x0.W0), yoi1.i(vwj1Var.b, o6x.a).map(a2x0.X0), new twa(new rtw0((byte) 21))).distinctUntilChanged();
                Scheduler scheduler4 = (Scheduler) daqVar.z1.get();
                dw7 dw7Var = (dw7) daqVar.zs.get();
                utg0 utg0Var2 = (utg0) ((jly0) k9kVar.f).get();
                p74 p74Var2 = (p74) xqu.a((p2p) k9kVar.e).get();
                Observable observableA = yjj1Var.a();
                Observable observableDistinctUntilChanged2 = new ObservableFromPublisher(s311Var.a.J(avw0.c).x(i2x0.f).J(r3x0.f).x(u3x0.f).t(Functions.a)).map(a4x0.f).distinctUntilChanged();
                BehaviorSubject behaviorSubject = dw7Var.b;
                akm akmVar = new akm(v1kVar, apaVar, v290Var, observableA, observableDistinctUntilChanged2, observableDistinctUntilChanged, scheduler4, behaviorSubject, utg0Var2, p74Var2.b(), yjj1Var);
                akmVar.f = iJ;
                akmVar.g = zN;
                Disposable disposable = (Disposable) v1kVar.c;
                if (disposable == null || disposable.isDisposed()) {
                    v1kVar.d = akmVar;
                    v1kVar.c = krj1Var.b().subscribeOn(scheduler2).observeOn(scheduler).subscribe(new yrh(v1kVar, (byte) 9), p.t);
                }
                vku vkuVar = akmVar.h;
                vkuVar.a(observableA.observeOn(scheduler4).map(y580.U0).subscribe(new xu(akmVar, (byte) 18)));
                vkuVar.a(observableDistinctUntilChanged2.observeOn(scheduler4).subscribe(new zjm(akmVar, (byte) 0)));
                vkuVar.a(observableDistinctUntilChanged.observeOn(scheduler4).subscribe(new zjm(akmVar, (byte) 1)));
                vkuVar.a(behaviorSubject.observeOn(scheduler4).subscribe(new zjm(akmVar, (byte) 2)));
                mrj1Var.b = akmVar;
                fn31.T(upy0Var.b, (o8n) null, 0, new ku91(qmaVar, upy0Var, (lnm) null, (byte) 28), 3);
                return;
            case 3:
                ((ych1) ((e821) this.b).a).h();
                return;
            case 4:
                ((Observer) this.b).onError((Throwable) obj);
                return;
            case 5:
                jrk1 jrk1Var = (jrk1) obj;
                cpr cprVar = (cpr) this.b;
                String str = jrk1Var.a;
                float f = (float) jrk1Var.b;
                Double d3 = jrk1Var.c;
                Float fValueOf = d3 != null ? Float.valueOf((float) d3.doubleValue()) : null;
                int i2 = jrk1Var.d;
                String lowerCase = i2 != 0 ? td6.j(i2).toLowerCase(Locale.ROOT) : null;
                red1 red1VarN = SystemVolumeControl.n();
                red1VarN.r(str);
                red1VarN.s(f);
                if (fValueOf != null) {
                    red1VarN.q(fValueOf.floatValue());
                }
                if (lowerCase != null) {
                    red1VarN.n(lowerCase);
                }
                cprVar.a.a(red1VarN.build());
                return;
            case 6:
                xsk1 xsk1Var = (xsk1) obj;
                Double d4 = xsk1Var.a;
                Double d5 = xsk1Var.b;
                l0l l0lVar = xsk1Var.c;
                Map map = xsk1Var.j;
                zsk1 zsk1Var = (zsk1) this.b;
                xsk1 xsk1Var2 = zsk1Var.h;
                if (!u890.j(xsk1Var2 != null ? xsk1Var2.b() : null, xsk1Var.b())) {
                    zsk1Var.d.onNext(spq0.a(xsk1Var.b()));
                }
                xsk1 xsk1Var3 = zsk1Var.h;
                if (!u890.j((xsk1Var3 == null || (d2 = xsk1Var3.b) == null) ? null : new k0u(d2.doubleValue(), xsk1Var3.c), d5 != null ? new k0u(d5.doubleValue(), l0lVar) : null)) {
                    zsk1Var.b.onNext(spq0.a(d5 != null ? new k0u(d5.doubleValue(), l0lVar) : null));
                }
                xsk1 xsk1Var4 = zsk1Var.h;
                if (!u890.j((xsk1Var4 == null || (d = xsk1Var4.a) == null) ? null : new k0u(d.doubleValue(), xsk1Var4.c), d4 != null ? new k0u(d4.doubleValue(), l0lVar) : null)) {
                    zsk1Var.c.onNext(spq0.a(d4 != null ? new k0u(d4.doubleValue(), l0lVar) : null));
                }
                xsk1 xsk1Var5 = zsk1Var.h;
                if (!u890.j(xsk1Var5 != null ? xsk1Var5.j : null, map)) {
                    bpb1 bpb1Var = zsk1Var.e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), Double.valueOf(((wk50) entry.getValue()).a));
                    }
                    bpb1Var.m((Object) null, linkedHashMap);
                }
                zsk1Var.h = xsk1Var;
                return;
            case 7:
                spq0 spq0Var = (spq0) obj;
                ftk1 ftk1Var = (ftk1) this.b;
                d6b1 d6b1Var = ftk1Var.b;
                if (!spq0Var.c() || ((l0l) spq0Var.b()).l()) {
                    if (spq0Var.c() && ((l0l) spq0Var.b()).l()) {
                        etk1 etk1Var = ftk1Var.h;
                        wdx0 wdx0Var = wdx0.W0;
                        if (etk1Var.equals(wdx0Var)) {
                            return;
                        }
                        d6b1Var.a().d();
                        ftk1Var.h = wdx0Var;
                        return;
                    }
                    return;
                }
                l0l l0lVar2 = (l0l) spq0Var.b();
                double dC = ((double) l0lVar2.c()) / 65535.0d;
                int iA = l0lVar2.A();
                int i3 = (!l0lVar2.F() || iA <= 0) ? 1 : 3;
                u7p u7pVar = ftk1Var.c;
                String str2 = l0lVar2.G().a;
                b8p b8pVar = u7pVar.a.a;
                w7l w7lVar = (w7l) b8pVar.K.get();
                ssk1 ssk1VarB = b8pVar.b();
                ysk1 ysk1Var = new ysk1(i3, iA, jch0.S(((double) iA) * dC), "");
                av7 av7Var = new av7();
                av7Var.d = ysk1Var;
                av7Var.e = w7lVar;
                av7Var.f = ssk1VarB;
                av7Var.g = str2;
                av7Var.a = iA;
                av7Var.b = i3;
                d6b1Var.a().c(av7Var);
                euk1 euk1Var = ftk1Var.d;
                euk1Var.d = av7Var;
                euk1Var.c.b(euk1Var.a.a().observeOn(euk1Var.b).subscribe(new vlk1(euk1Var, (byte) 2)));
                if (i3 != 1 && i3 != 2 && i3 != 3) {
                    throw null;
                }
                ftk1Var.h = new dtk1(l0lVar2);
                return;
            case 8:
                vtk1 vtk1Var = (vtk1) this.b;
                utk1 utk1Var = vtk1Var.g;
                if (utk1Var != null && utk1Var.i > 0) {
                    vtk1Var.c(utk1Var);
                }
                vtk1Var.g = null;
                vtk1Var.i.a();
                return;
            case 9:
                ((xy2) this.b).invoke(Boolean.valueOf(((z0l1) obj).a));
                return;
            case 10:
                ((m7m0) this.b).invoke(((p0l1) obj).a);
                return;
            case 11:
                ((my30) ((vi11) this.b).c).a(new l2l1((String) null, 3, (Map) null, "resolvingSiteStarted"));
                return;
            case 12:
                f5l1 f5l1Var = (g5l1) obj;
                h5l1 h5l1Var = (h5l1) this.b;
                if (!(f5l1Var instanceof f5l1)) {
                    if (!(f5l1Var instanceof e5l1)) {
                        eg.o();
                        return;
                    }
                    h5l1Var.h.a.a(new jhv0("start_retry", "error_endpoint_pses_fetch", 4, ((e5l1) f5l1Var).a));
                    c5l1 c5l1Var = h5l1Var.e;
                    c5l1Var.N0().getWindow().setBackgroundDrawableResource(2131104047);
                    c5l1Var.Y0().c(ljt.a, new ifl1((Object) null, (byte) 25), true);
                    return;
                }
                g1f0 g1f0Var = f5l1Var.a;
                dwe0 dwe0Var = h5l1Var.f;
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.b()), "IDENTITYLESS_LOGIN");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.j()), "AUTOFILL_MANAGER_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.q()), "COMPOSE_AUTOFILL_DISABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.B()), "CREDENTIAL_MANAGER_DISABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.c()), "ALLOW_RECAPTCHA_DUPES_ENABLED");
                dwe0Var.b.b(Integer.valueOf(g1f0Var.o()), "RECAPTCHA_TOKEN_TIMEOUT_MILLIS");
                dwe0Var.b.b(Integer.valueOf(g1f0Var.O()), "RECAPTCHA_SMS_LOGIN_GRACE_PERIOD_MILLIS");
                dwe0Var.b.b(Integer.valueOf(g1f0Var.h()), "RECAPTCHA_GOOGLE_LOGIN_GRACE_PERIOD_MILLIS");
                dwe0Var.b.b(Integer.valueOf(g1f0Var.t()), "RECAPTCHA_MAGICLINK_LOGIN_GRACE_PERIOD_MILLIS");
                dwe0Var.b.b(Integer.valueOf(g1f0Var.K()), "RECAPTCHA_EMAIL_OTP_LOGIN_GRACE_PERIOD_MILLIS");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.A()), "EMAIL_METHOD_CHOOSER_DIALOG_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.J()), "MAGICLINK_AS_DEFAULT_FALLBACK_METHOD_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.u()), "CREDENTIAL_MANAGER_GOOGLE_SIGN_IN_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.N()), "NEW_AGE_ENTRY_PAGE_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.L()), "AGE_CONFIRMATION_DIALOG_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.g()), "SIGNUP_STEP_INFO_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.d()), "RECAPTCHA_SDK_ENABLED_V2");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.i()), "RECAPTCHA_EMAIL_LOGIN_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.f()), "RECAPTCHA_SMS_LOGIN_GRACE_PERIOD_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.E()), "RECAPTCHA_GOOGLE_LOGIN_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.m()), "RECAPTCHA_MAGICLINK_LOGIN_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.F()), "RECAPTCHA_EMAIL_OTP_LOGIN_ENABLED");
                dwe0Var.b.b(g1f0Var.s(), "INFO_BUTTON");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.x()), "RECAPTCHA_EMAIL_SIGNUP_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.y()), "RECAPTCHA_GOOGLE_SIGNUP_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.M()), "RECAPTCHA_PHONE_SIGNUP_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.a()), "RECAPTCHA_MAGICLINK_GENERATION_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.z()), "FREE_MANAGED_ACCOUNTS_UPGRADE_DIALOG_ENABLED");
                boolean zL = g1f0Var.l();
                dwe0Var.b.b(Boolean.valueOf(zL), "DIRECT_AUTH_EVENT_PUBLISH_ENABLED");
                dwe0Var.c.a = zL;
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.e()), "EMAIL_OTP_LOGIN_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.v()), "EMAIL_OTP_SIGNUP_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.k()), "WHATSAPP_OTP_AUTOFILL_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.w()), "RECAPTCHA_NON_BLOCKING_ALL_AUTH_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.H()), "DIRECT_MANAGED_ACCOUNT_SIGNUP_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.p()), "PASSKEYS_AUTHENTICATION_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.n()), "PASSKEY_REGISTRATION_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.I()), "USERNAME_LOGIN_HINT_ENABLED");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.G()), "BRAZIL_PHONE_NUMBER_PLACEHOLDER_ENABLED");
                dwe0Var.b.b(g1f0Var.C(), "INTENT_INLINE_FORM");
                dwe0Var.b.b(Boolean.valueOf(g1f0Var.r()), "PREFER_WELCOME_SCREEN_CREDENTIAL_MANAGER");
                c5l1 c5l1Var2 = h5l1Var.e;
                c5l1Var2.N0().getWindow().setBackgroundDrawableResource(2131104047);
                fn31.T(cto1.q(c5l1Var2.n0()), (o8n) null, 0, new fkj1(c5l1Var2, (lnm) null, (byte) 10), 3);
                return;
            case 13:
                if (((Boolean) obj).booleanValue()) {
                    ((lxh1) ((alg1) this.b).b).l();
                    return;
                }
                return;
            case 14:
                jfl1 jfl1Var = (jfl1) obj;
                lfl1 lfl1Var = (lfl1) this.b;
                int iC = l1d.C(jfl1Var.a);
                if (iC != 0) {
                    if (iC == 1) {
                        kfl1 kfl1Var = lfl1Var.k;
                        mma0[] mma0VarArr = lfl1.m;
                        mma0 mma0Var = mma0VarArr[1];
                        if (((z7a) ((sgp0) kfl1Var).a) == null) {
                            lfl1Var.k.c(mma0VarArr[1], lfl1Var, y6a.d(lfl1Var.c, new g5a(lfl1Var.i), false, 4));
                        }
                        lfl1Var.j.c(mma0VarArr[0], lfl1Var, jfl1Var);
                        return;
                    }
                    if (iC != 2) {
                        eg.o();
                        return;
                    }
                }
                kfl1 kfl1Var2 = lfl1Var.k;
                mma0[] mma0VarArr2 = lfl1.m;
                kfl1Var2.c(mma0VarArr2[1], lfl1Var, (Object) null);
                lfl1Var.j.c(mma0VarArr2[0], lfl1Var, (Object) null);
                return;
            case 15:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                yfl1 yfl1Var = (yfl1) this.b;
                if (zBooleanValue2) {
                    if (!yfl1Var.c()) {
                        alg1 alg1Var = yfl1Var.c;
                        yfl1Var.h = alg1Var;
                        alg1Var.i(yfl1Var.j);
                    }
                    yfl1Var.h.a();
                    return;
                }
                return;
            case 16:
                if (((Boolean) obj).booleanValue()) {
                    pu71 pu71Var = ((ppl1) this.b).c;
                    l1d.B(pu71Var.b, pu71Var.a.edit(), pu71.d);
                    return;
                }
                return;
            case 17:
                ((r241) ((zxl1) ((dr41) this.b).b).c).a("your-episodes-remove-played-episodes", ((tqm1) obj).d.c);
                return;
            case 18:
                ((r241) ((zxl1) ((ep31) this.b).b).c).a("your-episodes-remove-unplayed-episodes", ((uqm1) obj).d.c);
                return;
            case 19:
                BadgingState badgingState = ((n3a) obj).a ? BadgingState.SHOW_BADGE : BadgingState.HIDE_BADGE;
                ((i0n1) this.b).a.b.onNext(badgingState);
                Logger.g("YourUpdatesLoggedInLifecyclePluginImpl: Refreshed Your Updates BadgeState. New BadgingState = " + badgingState, new Object[0]);
                return;
            default:
                ((j0n1) this.b).b.onNext(((a120) obj).a ? BadgingState.SHOW_BADGE : BadgingState.HIDE_BADGE);
                return;
        }
    }

    public /* synthetic */ rdj1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
