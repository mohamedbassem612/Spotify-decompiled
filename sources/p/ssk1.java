package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.spotify.appauthorization.builtinauth.model.FieldValidator;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.interappprotocol.UserIsNotLoggedInException;
import com.spotify.interapp.service.IapException;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.login.loginflowimpl.DelegatingLoginActivity;
import com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver;
import com.spotify.player.model.AudioStream;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ssk1 implements y4l1, n7b1, Function, b1o1, h8q0, ebn1 {
    public final Object a;

    public ssk1(ezb1 ezb1Var) {
        this.a = ((v280) ezb1Var.b).g();
    }

    public static final /* synthetic */ tmc0 i(ssk1 ssk1Var) {
        return (tmc0) ssk1Var.a;
    }

    public nwo1 a(String str, String str2, sln1 sln1Var, long j) {
        return new nwo1(31, new mug(this, str, sln1Var, j, (lnm) null, (byte) 7), (Integer) null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public Object apply(Object obj) {
        YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs yourLibraryPredefinedPlaylistConfigs = (YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs) obj;
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        r9c r9cVar = (r9c) this.a;
        boolean z = r9cVar.g;
        String str = r9cVar.b;
        if (!z) {
            hvm1VarQ.C(350);
            jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
            ksm1 ksm1Var = ksm1.i;
            jsm1VarR.q(ksm1Var);
            bzu0 bzu0VarC = oxu0.a.c(str);
            bzu0 bzu0Var = bzu0VarC instanceof bzu0 ? bzu0VarC : null;
            ksm1 ksm1Var2 = ksm1.d;
            if (bzu0Var != null) {
                ksm1Var = ksm1Var2;
            } else if (str.equals("com.spotify.your-albums")) {
                ksm1Var = ksm1.b;
            } else if (str.equals("com.spotify.your-artists")) {
                ksm1Var = ksm1.c;
            } else if (str.equals("com.spotify.your-playlists")) {
                ksm1Var = ksm1Var2;
            } else if (str.equals("com.spotify.your-podcasts")) {
                ksm1Var = ksm1.e;
            } else if (str.equals("com.spotify.your-audiobooks")) {
                ksm1Var = ksm1.f;
            } else if (!str.equals("com.spotify.downloaded")) {
                str.equals("com.spotify.your-library");
                ksm1Var = null;
            }
            if (ksm1Var != null) {
                jsm1VarR.q(ksm1Var);
            }
            hvm1VarQ.u(jsm1VarR.build());
        }
        gvm1VarO.n(hvm1VarQ);
        gvm1VarO.s(yourLibraryPredefinedPlaylistConfigs);
        return gvm1VarO.build();
    }

    public void b() {
        dg30 dg30VarF0 = ((ijl1) this.a).f0();
        if (dg30VarF0 != null) {
            dg30VarF0.finish();
        }
    }

    public nwo1 c(long j, yln1 yln1Var) {
        return new nwo1(30, new oz80(this, j, yln1Var, (lnm) null), (Integer) null);
    }

    public void d(Bitmap bitmap) {
        ((a8p1) this.a).d(3, bitmap);
    }

    public qwo1 e(String str, String str2) {
        return new qwo1(new ow2(2, (lnm) null, (byte) 1));
    }

    public void f(m8b0 m8b0Var) {
        s24 s24Var = (s24) this.a;
        if (((p1f0) s24Var.e) != null) {
            String strD = m8b0Var.d(1);
            zq5 zq5Var = (zq5) m8b0Var.c(zq5.class, 2);
            final p1f0 p1f0Var = (p1f0) s24Var.e;
            s24 s24Var2 = (s24) p1f0Var.b;
            aos aosVar = (aos) p1f0Var.a;
            xig xigVar = aosVar.k;
            String str = zq5Var.e;
            List list = zq5Var.d;
            if (str == null) {
                str = "";
            }
            e6j0 e6j0Var = aosVar.j;
            if (!((vd) p1f0Var.g).a(new tzc(str, xigVar.a))) {
                s24Var2.Y(new es5("Client not allowed"), "wamp.error.not_authorized");
                p1f0Var.r(false);
                return;
            }
            try {
                e6j0Var.getClass();
                e6j0.H(strD, zq5Var);
                if (aosVar.d) {
                    e6j0.I(zq5Var);
                }
                List list2 = zq5Var.c.c;
                if (!(list2 != null ? v1d1.a.containsAll(list2) : true)) {
                    s24Var2.Y(new es5("Feature mismatch"), "com.spotify.error.unsupported_version");
                    p1f0Var.r(false);
                    return;
                }
                aosVar.a = zq5Var;
                if (list.isEmpty()) {
                    p1f0Var.t();
                } else {
                    ro5 ro5Var = (ro5) aosVar.c.get(list.get(0));
                    if (ro5Var == null) {
                        s24Var2.Y(new es5("Unsupported authentication method"), "wamp.error");
                        p1f0Var.r(false);
                    } else {
                        fy8 fy8Var = new fy8(zq5Var.e, zq5Var.f, list, xigVar);
                        try {
                            ro5Var.b(fy8Var);
                            final byte b = 10;
                            p1f0Var.h = ro5Var.a(fy8Var).subscribe(new Action() { // from class: p.w43
                                /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.interapp.service.IapException */
                                /* JADX WARN: Type inference failed for: r12v8, types: [android.app.Activity, android.content.Context, com.spotify.appauthorization.sso.AuthorizationActivity] */
                                public final void run() throws IapException {
                                    byte b2 = b;
                                    Uri uriBuild = null;
                                    Object obj = p1f0Var;
                                    switch (b2) {
                                        case 0:
                                            fnh0 fnh0Var = ((x43) obj).l;
                                            w2z w2zVar = fnh0Var.g;
                                            w2zVar.u(new kz20(false, AudioStream.DEFAULT, enh0.b, 7));
                                            jnh0 jnh0Var = fnh0Var.c;
                                            Handler handler = jnh0Var.b;
                                            if (handler != null) {
                                                handler.post(new unc0(fnh0Var.a, fnh0Var.h, w2zVar, fnh0Var.f, fnh0Var.b, jnh0Var, fnh0Var.e, (byte) 1));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            AppProtocolRemoteService appProtocolRemoteService = (AppProtocolRemoteService) obj;
                                            int i = AppProtocolRemoteService.f1;
                                            ArrayList<aos> arrayList = appProtocolRemoteService.d1;
                                            for (aos aosVar2 : arrayList) {
                                                if (aosVar2.l != 2) {
                                                    aosVar2.b("wamp.error.system_shutdown");
                                                    mj61 mj61Var = aosVar2.g;
                                                    mj61Var.getClass();
                                                    int i2 = aosVar2.e;
                                                    ConcurrentHashMap concurrentHashMap = mj61Var.a;
                                                    concurrentHashMap.remove(Integer.valueOf(i2));
                                                    mj61Var.b.onNext(new ArrayList(concurrentHashMap.values()));
                                                }
                                            }
                                            arrayList.clear();
                                            appProtocolRemoteService.a1 = null;
                                            appProtocolRemoteService.Q0.a.m((Object) null, "unknown");
                                            return;
                                        case 2:
                                            ?? r12 = (AuthorizationActivity) ((gr8) obj);
                                            u2f0 u2f0Var = r12.r1;
                                            if (u2f0Var == null) {
                                                u890.C("loginTrigger");
                                                throw null;
                                            }
                                            wq8 wq8Var = r12.h1;
                                            if (wq8Var != null) {
                                                Uri.Builder builder = new Uri.Builder();
                                                Uri.Builder builderAppendQueryParameter = builder.scheme("https").authority("accounts.spotify.com").appendPath("inapp-authorize").appendQueryParameter("client_id", wq8Var.a).appendQueryParameter("redirect_uri", wq8Var.c).appendQueryParameter("state", wq8Var.e).appendQueryParameter("show_dialog", String.valueOf(wq8Var.h));
                                                String str2 = wq8Var.j;
                                                if (str2 != null) {
                                                    builderAppendQueryParameter.appendQueryParameter("utm_medium", str2);
                                                }
                                                String str3 = wq8Var.i;
                                                if (str3 != null) {
                                                    builderAppendQueryParameter.appendQueryParameter("utm_source", str3);
                                                }
                                                String str4 = wq8Var.k;
                                                if (str4 != null) {
                                                    builderAppendQueryParameter.appendQueryParameter("utm_campaign", str4);
                                                }
                                                String str5 = wq8Var.l;
                                                if (str5 != null) {
                                                    builderAppendQueryParameter.appendQueryParameter("associated_content", str5);
                                                }
                                                fyq0 fyq0Var = wq8Var.g;
                                                if (fyq0Var != null) {
                                                    builderAppendQueryParameter.appendQueryParameter("code_challenge", fyq0Var.a);
                                                    builderAppendQueryParameter.appendQueryParameter("code_challenge_method", fyq0Var.b);
                                                }
                                                builderAppendQueryParameter.appendQueryParameter("response_type", td6.r(wq8Var.b)).appendQueryParameter("scope", o7h.y0(wq8Var.f, " ", (String) null, (String) null, (iu30) null, 62));
                                                uriBuild = builder.build();
                                            }
                                            if (u2f0Var.b(1, uriBuild)) {
                                                r12.startActivityForResult(p5x0.d((Context) r12, 268468224), 1337);
                                                return;
                                            }
                                            u2f0Var.b.getClass();
                                            Intent intent = new Intent((Context) r12, (Class<?>) DelegatingLoginActivity.class);
                                            intent.setFlags(0);
                                            intent.setData(uriBuild);
                                            Uri referrer = r12.getReferrer();
                                            if (referrer != null) {
                                                intent.putExtra("android.intent.extra.REFERRER", referrer);
                                            }
                                            r12.startActivityForResult(intent, 1337);
                                            return;
                                        case 3:
                                            synchronized (((mp8) obj)) {
                                            }
                                            return;
                                        case 4:
                                            pr5 pr5Var = (pr5) obj;
                                            if (pr5Var == null || pr5Var.b == null) {
                                                throw new IapException(new es5("ImageUri is null or empty."), "wamp.error.invalid_argument");
                                            }
                                            return;
                                        case 5:
                                            if (obj == null) {
                                                throw new IapException(new es5("Identifier is null."), "wamp.error.invalid_argument");
                                            }
                                            return;
                                        case 6:
                                            th61 th61Var = (th61) ((dbm) obj).b;
                                            if (th61Var == null || !th61Var.b) {
                                                throw new UserIsNotLoggedInException();
                                            }
                                            return;
                                        case 7:
                                            ((fkv) obj).a();
                                            return;
                                        case 8:
                                            int i3 = MediaButtonReceiver.h;
                                            ((BroadcastReceiver.PendingResult) obj).finish();
                                            return;
                                        case 9:
                                            zgz0 zgz0Var = (zgz0) obj;
                                            if (((spq0) zgz0Var.b).c()) {
                                                ((Runnable) ((spq0) zgz0Var.b).b()).run();
                                                return;
                                            }
                                            return;
                                        case 10:
                                            ((p1f0) obj).t();
                                            return;
                                        case 11:
                                            d6b1 d6b1Var = (d6b1) obj;
                                            Logger.g("Clearing EIS binder", new Object[0]);
                                            txh0 txh0Var = d6b1Var.c;
                                            txh0Var.d = null;
                                            txh0Var.b = null;
                                            h1i0 h1i0Var = d6b1Var.f;
                                            h1i0Var.getClass();
                                            Logger.g("Stopping MediaSessionStateHandler", new Object[0]);
                                            h1i0Var.f.g();
                                            return;
                                        case 12:
                                            ((rku) obj).a();
                                            return;
                                        default:
                                            ((olm) obj).i = null;
                                            return;
                                    }
                                }
                            }, new fv5(p1f0Var, (byte) 18));
                        } catch (FieldValidator.ValidationException e) {
                            Logger.d(e.getMessage(), new Object[0]);
                            es5.Companion.getClass();
                            s24Var2.Y(ds5.a(e), "wamp.error.invalid_argument");
                            p1f0Var.r(false);
                        }
                    }
                }
                ((mj61) p1f0Var.c).a(aosVar);
            } catch (FieldValidator.ValidationException e2) {
                Logger.d(e2.getMessage(), new Object[0]);
                es5.Companion.getClass();
                s24Var2.Y(ds5.a(e2), "wamp.error.invalid_argument");
                p1f0Var.r(false);
            }
        }
    }

    public bih1 g() {
        return (bih1) this.a;
    }

    public Bundle h() {
        Bundle bundle = new Bundle();
        bg11 bg11Var = (bg11) this.a;
        if (!bg11Var.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            int i = bg11Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(((k7o1) bg11Var.get(i2)).a());
            }
            bundle.putParcelableArrayList("A", arrayList);
        }
        return bundle;
    }

    public /* synthetic */ void onSuccess(Object obj) {
        ((b3e) this.a).k = new q3e((Bundle) obj);
    }

    public ssk1(r9c r9cVar, yut0 yut0Var) {
        this.a = r9cVar;
    }
}
