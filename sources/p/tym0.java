package p;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.quizaccessservice.v1.ChallengeMetadata;
import com.spotify.quizaccessservice.v1.CheckUserQuizStateRequest;
import com.spotify.quizaccessservice.v1.CheckUserQuizStateResponse;
import com.spotify.tap.playback.TapLoggedOutException;
import com.spotify.voiceassistants.playbackerrorlogger.events.proto.AssistantPlaybackErrorNonAuth;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tym0 implements Function, qiw, pah, Producer, ya, h860 {
    public final /* synthetic */ byte a;
    public Object b;

    public tym0(byte b) {
        this.a = b;
        switch (b) {
            case 28:
                this.b = Pattern.compile("spotify:show:[a-zA-Z0-9]{22}:episode:[a-zA-Z0-9]{22}");
                break;
            default:
                this.b = new float[64];
                break;
        }
    }

    public static final /* synthetic */ dp5 a(tym0 tym0Var) {
        return (dp5) tym0Var.b;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.ArrayList j(p.tym0 r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tym0.j(p.tym0, java.lang.String):java.util.ArrayList");
    }

    public static gfi1 l(CheckUserQuizStateResponse checkUserQuizStateResponse) {
        if (checkUserQuizStateResponse.r()) {
            return new efi1(checkUserQuizStateResponse.o().n());
        }
        if (checkUserQuizStateResponse.q()) {
            checkUserQuizStateResponse.n();
            ChallengeMetadata challengeMetadataN = checkUserQuizStateResponse.n().p() ? checkUserQuizStateResponse.n().n() : null;
            return new dfi1(challengeMetadataN != null ? new yh(new jce(challengeMetadataN.o(), challengeMetadataN.n())) : zh.b);
        }
        if (!checkUserQuizStateResponse.s()) {
            eg.m("Invalid quiz state response");
            return null;
        }
        String title = checkUserQuizStateResponse.p().getTitle();
        String message = checkUserQuizStateResponse.p().getMessage();
        int i = e5n0.a[checkUserQuizStateResponse.p().o().ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                eg.o();
                return null;
            }
        }
        return new ffi1(i2, title, message);
    }

    public boolean accept(Object obj) {
        return ((up4) this.b).a() && u890.j(((ksk) obj).a, "spotify:list:offline-playable:all");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object apply(Object obj) {
        Object objValueOf;
        Observable observableJust;
        CompletableOnErrorComplete completableOnErrorCompleteO;
        wkd wkdVar;
        Single singleFlatMap;
        tu00 tu00Var;
        List listSingletonList;
        String str;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        boolean z = false;
        switch (b) {
            case 0:
                return ((uym0) this.b).d.a((q9u0) obj).ignoreElement();
            case 3:
                return new CompletableFromAction(new r1o0((t1o0) this.b, (Integer) obj, (byte) 1));
            case 4:
                o4o0 o4o0Var = (o4o0) this.b;
                int iIntValue = ((Integer) obj).intValue();
                q2o0 q2o0Var = o4o0Var.f;
                objValueOf = q2o0Var != null ? Boolean.valueOf(iIntValue == 0 || ((Boolean) q2o0Var.invoke()).booleanValue()) : null;
                return (objValueOf == null || (observableJust = Observable.just(objValueOf)) == null) ? Observable.empty() : observableJust;
            case 7:
                ugw ugwVar = (ugw) obj;
                if (ugwVar instanceof tgw) {
                    return anm1.L(o6xVar, new q721(((tgw) ugwVar).g, (k811) this.b, (lnm) null, (byte) 1)).onErrorComplete(vbx0.g);
                }
                if (ugwVar instanceof sgw) {
                    return Observable.empty();
                }
                eg.o();
                return null;
            case 10:
                ((tgp0) this.b).d();
                return rih1.a;
            case 13:
                return yz10.h((ovp0) this.b, b7x.a);
            case 15:
                Throwable th = (Throwable) obj;
                rzo0 rzo0Var = (rzo0) this.b;
                if (!(th instanceof TapLoggedOutException)) {
                    th.getClass();
                    return Completable.j(th);
                }
                CompletableSource completableSourceO = new CompletableFromRunnable(new an90(rzo0Var, (byte) 15)).o(yb10.V0);
                if (((ki4) rzo0Var.d).w()) {
                    c341 c341Var = (c341) rzo0Var.c;
                    Context context = (Context) rzo0Var.b;
                    Uri uri = gz40.a;
                    String string = context.getString(2131956262);
                    Locale locale = Locale.US;
                    c341Var.getClass();
                    completableOnErrorCompleteO = new CompletableCreate(new b341(c341Var.a.getApplicationContext(), string, c341Var.b)).h(zzc0.X0).o(Functions.h);
                } else {
                    completableOnErrorCompleteO = CompletableEmpty.a;
                    completableOnErrorCompleteO.getClass();
                }
                return Completable.m(new CompletableSource[]{completableSourceO, completableOnErrorCompleteO});
            case 17:
                olr0 olr0Var = (plr0) obj;
                qlr0 qlr0Var = (qlr0) this.b;
                if (!(olr0Var instanceof olr0)) {
                    return Single.create(new qkn0(qlr0Var, (byte) 14));
                }
                Single singleJust = Single.just(olr0Var.a);
                singleJust.getClass();
                return singleJust;
            case 19:
                rx41 rx41Var = (rx41) obj;
                yon yonVar = (yon) this.b;
                ((t5h1) yonVar.d).getClass();
                String strA = t5h1.a();
                String str2 = rx41Var.b;
                String str3 = rx41Var.c;
                String str4 = rx41Var.d;
                int i = rx41Var.e;
                gyh gyhVar = rx41Var.f;
                tv80 tv80Var = rx41Var.g;
                boolean z2 = rx41Var.h;
                l651 l651Var = (l651) yonVar.e;
                icf1 icf1Var = new icf1(str2, strA, str3, str4, i, tv80Var, z2, gyhVar, l651Var);
                z = str4.length() == 0;
                hce1 hce1Var = (hce1) yonVar.c;
                z2g0 z2g0Var = (z2g0) ((ydf0) ((n0v0) hce1Var.e).b).c(new w8f1(str2, str4, i, z2, l651Var));
                if (z2g0Var != null) {
                    singleFlatMap = Single.just(z2g0Var);
                } else {
                    g2z g2zVar = (g2z) hce1Var.c;
                    uny unyVar = (uny) g2zVar.e;
                    v8n0 v8n0Var = (v8n0) unyVar.c;
                    boolean zP0 = ((di4) unyVar.b).p0();
                    b75 b75Var = v8n0Var.d;
                    boolean zD = b75Var.d();
                    int iOrdinal = b75Var.h().ordinal();
                    if (iOrdinal == 0) {
                        wkdVar = xkd.c;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        wkdVar = wkd.c;
                    }
                    singleFlatMap = yoi1.i(new mpy0(new evz(v8n0Var.b(zP0, zD, wkdVar), unyVar, (byte) 8), icf1Var, g2zVar, (byte) 21), o6xVar).firstOrError().flatMap(new ffe1(hce1Var, icf1Var, (byte) 4));
                }
                boolean z3 = z;
                return singleFlatMap.map(new acn1(strA, (byte) 9)).map(new svh0(yonVar, icf1Var, z, (byte) 7)).doOnError(new vrk1((byte) 27)).onErrorReturn(new jqd0(yonVar, icf1Var, z3, strA, (byte) 9)).toObservable().compose(z3 ? (lk1) yonVar.b : nm3.Y);
            case 23:
                Boolean bool = (Boolean) obj;
                if (bool.equals(Boolean.TRUE)) {
                    return ((w9u0) ((myq0) this.b).c).a(new d9u0("embeddedhome-ads-playercontroller", false)).ignoreElement();
                }
                if (bool.equals(Boolean.FALSE)) {
                    return CompletableEmpty.a;
                }
                eg.o();
                return null;
            case 24:
                ueu0 ueu0Var = (ueu0) obj;
                bxh bxhVar = ((veu0) this.b).a;
                return new MaybeSwitchIfEmpty(Maybe.o(cwl1.e0(bxhVar.d, new zi3(bxhVar, ueu0Var.a, ueu0Var.b, (lnm) null, (byte) 4)).f(c710.Y0)), Maybe.e(j5.a)).m().M(e710.a1);
            case 25:
                Boolean bool2 = (Boolean) obj;
                if (!((tg60) this.b).a && !bool2.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 27:
                k2u k2uVar = (k2u) obj;
                y5v0 y5v0Var = (y5v0) this.b;
                g281 g281Var = k2uVar.a;
                boolean z4 = g281Var.x;
                String str5 = g281Var.a;
                String str6 = g281Var.d;
                String str7 = g281Var.e;
                String str8 = g281Var.j.b;
                w281 w281Var = k2uVar.b;
                i1z i1zVar = k2uVar.d;
                String str9 = i1zVar != null ? i1zVar.a : null;
                String str10 = str9 == null ? "" : str9;
                if (i1zVar != null && (tu00Var = i1zVar.D) != null) {
                    tu00Var.a(b9v0.class);
                }
                objValueOf = i1zVar != null ? i1zVar.c : null;
                return y5v0Var.c(str5, z4, str6, str7, str8, str10, w281Var, objValueOf == null ? "" : objValueOf, k2uVar.c);
            default:
                oto0 oto0Var = (oto0) this.b;
                List<mh90> list = ((mh90) obj).f;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (mh90 mh90Var : list) {
                    if (mh90Var instanceof mh90) {
                        str = mh90Var.b;
                    } else {
                        if (!(mh90Var instanceof rh90)) {
                            eg.o();
                            return null;
                        }
                        str = ((rh90) mh90Var).b;
                    }
                    arrayList.add(new mmr0(str, mh90Var));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    String str11 = (String) ((mmr0) obj2).a;
                    if (!u890.j(str11, "notify-messages") || oto0Var.b.a.h()) {
                        if (!u890.j(str11, "notify-comments") || oto0Var.a.i()) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    String str12 = (String) ((mmr0) obj3).a;
                    t0z t0zVar = mmq0.i;
                    ArrayList arrayList4 = new ArrayList(q7h.U(t0zVar, 10));
                    Iterator it = t0zVar.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((mmq0) it.next()).a);
                    }
                    if (!arrayList4.contains(str12)) {
                        t0z t0zVar2 = lmq0.c;
                        ArrayList arrayList5 = new ArrayList(q7h.U(t0zVar2, 10));
                        Iterator it2 = t0zVar2.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(((lmq0) it2.next()).a);
                        }
                        if (arrayList5.contains(str12)) {
                        }
                    }
                    arrayList3.add(obj3);
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    rh90 rh90Var = (bi90) ((mmr0) it3.next()).b;
                    if (rh90Var instanceof rh90) {
                        listSingletonList = Collections.singletonList(new s8e(rh90Var));
                    } else {
                        if (!(rh90Var instanceof mh90)) {
                            eg.o();
                            return null;
                        }
                        listSingletonList = Collections.singletonList(new r8e((mh90) rh90Var));
                    }
                    r7h.W(listSingletonList, arrayList6);
                }
                return arrayList6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object b(String str, String str2, onm onmVar) {
        f5n0 f5n0Var;
        if (onmVar instanceof f5n0) {
            f5n0Var = (f5n0) onmVar;
            int i = f5n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f5n0Var.c = i - Integer.MIN_VALUE;
            } else {
                f5n0Var = new f5n0(this, onmVar);
            }
        } else {
            f5n0Var = new f5n0(this, onmVar);
        }
        Object objA = f5n0Var.a;
        int i2 = f5n0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                dvf dvfVarN = CheckUserQuizStateRequest.n();
                dvfVarN.q(str);
                if (str2 != null) {
                    dvfVarN.n(str2);
                }
                CheckUserQuizStateRequest checkUserQuizStateRequest = (CheckUserQuizStateRequest) dvfVarN.build();
                g5n0 g5n0Var = (g5n0) this.b;
                checkUserQuizStateRequest.getClass();
                f5n0Var.c = 1;
                objA = g5n0Var.a(checkUserQuizStateRequest, f5n0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            sy21 sy21Var = (sy21) objA;
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return l((CheckUserQuizStateResponse) obj);
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("Failed to check quiz state: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }

    public void c(int i) {
        ((j2p0) this.b).Z.getBackground().setTint(i);
    }

    public byte[] d(ie30 ie30Var) {
        byte[] bArrB;
        ysp0 ysp0Var = (ysp0) this.b;
        synchronized (ysp0Var) {
            dm5.m(ie30Var.t != null);
            bArrB = ysp0Var.b(ie30Var);
        }
        return bArrB;
    }

    public mmr0 e(byte[] bArr) {
        Pair pairCreate;
        ysp0 ysp0Var = (ysp0) this.b;
        synchronized (ysp0Var) {
            try {
                y8v y8vVarA = ysp0Var.a(1, ysp0.f, bArr);
                em61 em61Var = new em61();
                ysp0Var.d.post(new wsp0(ysp0Var, em61Var, y8vVarA, (byte) 0));
                try {
                    try {
                        pairCreate = (Pair) em61Var.get();
                        ysp0Var.c();
                    } catch (Throwable th) {
                        ysp0Var.c();
                        throw th;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    throw new IllegalStateException(e);
                }
            } catch (DrmSession.DrmSessionException e2) {
                if (!(e2.getCause() instanceof KeysExpiredException)) {
                    throw e2;
                }
                pairCreate = Pair.create(0L, 0L);
            }
        }
        return new mmr0(pairCreate.first, pairCreate.second);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r6 == r4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.y1q0
            if (r0 == 0) goto L13
            r0 = r6
            p.y1q0 r0 = (p.y1q0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.y1q0 r0 = new p.y1q0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L58
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L45
        L35:
            p.hm5.M(r6)
            java.lang.Object r5 = r5.b
            p.p3t r5 = (p.p3t) r5
            r0.c = r3
            java.lang.Object r6 = p.b5p1.k(r5, r0)
            if (r6 != r4) goto L45
            goto L57
        L45:
            p.nw80 r6 = (p.nw80) r6
            if (r6 == 0) goto L5f
            p.zob1 r5 = r6.c()
            if (r5 == 0) goto L5f
            r0.c = r2
            java.lang.Object r6 = p.b5p1.k(r5, r0)
            if (r6 != r4) goto L58
        L57:
            return r4
        L58:
            p.dx80 r6 = (p.dx80) r6
            if (r6 == 0) goto L5f
            r6.cancel()
        L5f:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tym0.f(p.onm):java.lang.Object");
    }

    public boolean g(Context context) {
        NotificationManager notificationManager = (NotificationManager) this.b;
        if (Build.VERSION.SDK_INT >= 33) {
            return x74.j(context, "android.permission.POST_NOTIFICATIONS") == 0 && notificationManager.areNotificationsEnabled();
        }
        return notificationManager.areNotificationsEnabled();
    }

    public Object get() {
        return new DispatcherWorker(((l4p0) this.b).b);
    }

    public void h(d77 d77Var) {
        String str;
        e77 e77VarN = AssistantPlaybackErrorNonAuth.n();
        switch (d77Var.c) {
            case 1:
                str = "backend_error";
                break;
            case 2:
                str = "player_error";
                break;
            case 3:
                str = "not_authenticated";
                break;
            case 4:
                str = "timeout";
                break;
            case 5:
                str = "gen_playlist_timeout";
                break;
            case 6:
                str = "exception";
                break;
            default:
                throw null;
        }
        e77VarN.r(str);
        e77VarN.t(d77Var.a);
        e77VarN.u(d77Var.b);
        e77VarN.q(d77Var.d);
        String str2 = d77Var.e;
        if (str2 != null) {
            e77VarN.s(str2);
        }
        String str3 = d77Var.f;
        if (str3 != null) {
            e77VarN.n(str3);
        }
        String str4 = d77Var.g;
        if (str4 != null) {
            e77VarN.v(str4);
        }
        ((t2j0) this.b).a(e77VarN.build());
    }

    public boolean i() {
        OtpInputView otpInputView = (OtpInputView) this.b;
        int i = OtpInputView.N0;
        int i2 = otpInputView.i;
        if (i2 < 0) {
            return false;
        }
        boolean zEquals = otpInputView.c(i2).equals(" ");
        int i3 = otpInputView.i;
        if (!zEquals) {
            otpInputView.h(i3, " ");
            return true;
        }
        if (i3 > 0) {
            otpInputView.a(i3 - 1);
            otpInputView.h(otpInputView.i, " ");
        }
        return true;
    }

    public void k() {
        ((ysp0) this.b).c.quit();
    }

    public void v(Object obj) {
        zgk1 zgk1Var = (zgk1) obj;
        co6 co6Var = (co6) this.b;
        lzn0 lzn0Var = (lzn0) co6Var.d;
        kt91 kt91Var = (kt91) co6Var.e;
        ur00 ur00Var = (ur00) co6Var.f;
        if (zgk1Var.equals(ffk1.a)) {
            ((EncoreButton) ur00Var.f).setEnabled(false);
            ((ProgressBar) ur00Var.d).setVisibility(8);
            return;
        }
        if (zgk1Var.equals(ifk1.a)) {
            ((EncoreButton) ur00Var.f).setEnabled(true);
            ((ProgressBar) ur00Var.d).setVisibility(8);
            return;
        }
        if (zgk1Var.equals(mgk1.a)) {
            ((EncoreButton) ur00Var.f).setEnabled(false);
            ((ProgressBar) ur00Var.d).setVisibility(0);
            return;
        }
        if (zgk1Var.equals(pgk1.a)) {
            ((EncoreButton) ur00Var.f).setEnabled(true);
            ((ProgressBar) ur00Var.d).setVisibility(8);
            kt91Var.k(new er91((fs91) null, ((ConstraintLayout) ur00Var.b).getResources().getString(2131958473), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        } else if (zgk1Var.equals(sgk1.a)) {
            ((InputMethodManager) ((Context) co6Var.b).getSystemService("input_method")).hideSoftInputFromWindow(((ConstraintLayout) ur00Var.b).getWindowToken(), 0);
            lzn0Var.e();
            kt91Var.k(new er91((fs91) null, ((ConstraintLayout) ur00Var.b).getResources().getString(2131959630), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        } else if (zgk1Var.equals(dfk1.a)) {
            lzn0Var.e();
        } else {
            eg.o();
        }
    }

    public tym0(eb80 eb80Var, hfb hfbVar, jma jmaVar) {
        this.a = (byte) 26;
        this.b = eb80Var;
    }

    public /* synthetic */ tym0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public tym0(Flowable flowable, yqg yqgVar, tau0 tau0Var, i8h1 i8h1Var) {
        this.a = (byte) 20;
        this.b = tau0Var;
    }
}
