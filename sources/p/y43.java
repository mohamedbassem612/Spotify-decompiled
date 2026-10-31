package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mdata.esperanto.proto.ObserveResponse;
import com.spotify.messages.AlarmClockWarmupStateMonitorSignalNonAuth;
import com.spotify.messages.WhereToPlayClientRecommendationNotDisplayed;
import com.spotify.player.model.ContextTrack$TrackAction;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y43 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public y43(oxb oxbVar, String str, String str2, w4l0 w4l0Var, ccb1 ccb1Var) {
        this.a = (byte) 1;
        this.c = oxbVar;
        this.b = str;
        this.d = w4l0Var;
        this.e = ccb1Var;
    }

    public final void accept(Object obj) {
        String str;
        boolean z = false;
        switch (this.a) {
            case 0:
                Logger.b("SpotifyAlarmLauncherService cachePlaylistContext launched from sessionStateMonitor.observe()", new Object[0]);
                z43 z43Var = (z43) this.c;
                hr0 hr0Var = z43Var.e;
                String str2 = (String) this.b;
                t2j0 t2j0Var = hr0Var.a;
                v43 v43VarN = AlarmClockWarmupStateMonitorSignalNonAuth.n();
                v43VarN.n(str2);
                t2j0Var.a(v43VarN.build());
                z43Var.a((String) this.d, str2, (nx2) this.e);
                return;
            case 1:
                r981 r981Var = (s981) obj;
                oxb oxbVar = (oxb) this.c;
                String str3 = (String) this.b;
                w4l0 w4l0Var = (w4l0) this.d;
                ccb1 ccb1Var = (ccb1) this.e;
                synchronized (oxbVar) {
                    try {
                        if (r981Var instanceof r981) {
                            oxbVar.Y = r981Var.a;
                            oxbVar.Z = str3;
                            oxbVar.g.k(str3, w4l0Var);
                            ccb1 ccb1Var2 = oxbVar.X;
                            if (ccb1Var2 != null) {
                                ccb1Var2.invoke(nd21.a);
                            }
                        } else {
                            if (!(r981Var instanceof q981)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            mwb mwbVar = oxbVar.h;
                            int iC = l1d.C(((q981) r981Var).a);
                            if (iC == 0) {
                                str = "failureAnotherPresentationShowing";
                            } else if (iC == 1) {
                                str = "failureUINotReady";
                            } else if (iC == 2) {
                                str = "failureWrongAppState";
                            } else {
                                if (iC != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "Unknown";
                            }
                            t2j0 t2j0Var2 = mwbVar.a;
                            unl1 unl1VarN = WhereToPlayClientRecommendationNotDisplayed.n();
                            unl1VarN.q("rejectedByMessagingPlatform(" + str + ")");
                            unl1VarN.r();
                            unl1VarN.n(str3);
                            WhereToPlayClientRecommendationNotDisplayed whereToPlayClientRecommendationNotDisplayedBuild = unl1VarN.build();
                            Objects.toString(whereToPlayClientRecommendationNotDisplayedBuild);
                            t2j0Var2.a(whereToPlayClientRecommendationNotDisplayedBuild);
                            ccb1Var.invoke(new md21(ffu.a));
                            oxbVar.Y = null;
                            oxbVar.Z = null;
                            oxbVar.X = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                mmr0 mmr0Var = (mmr0) obj;
                j7z j7zVar = (j7z) this.c;
                j7z j7zVar2 = (j7z) this.d;
                String str4 = j7zVar2.a;
                oxr oxrVar = (oxr) this.b;
                s8u0 s8u0Var = oxrVar.a;
                vku vkuVar = oxrVar.t;
                Boolean bool = (Boolean) mmr0Var.a;
                Boolean bool2 = (Boolean) mmr0Var.b;
                if (bool.booleanValue() && bool2.booleanValue()) {
                    int i = j7zVar2.b;
                    dlg1 dlg1Var = oxrVar.c;
                    bpl0 bpl0VarL = dlg1Var.l();
                    Integer numValueOf = Integer.valueOf(i);
                    x6h1 x6h1VarC = bpl0VarL.b.c();
                    x6h1VarC.i.add(new a7h1("episode_card_container", (String) null, numValueOf, str4, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("play_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    vkuVar.a(s8u0Var.b(((i8h1) dlg1Var.a).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1(ContextTrack$TrackAction.PAUSE, 1, Collections.singletonMap("item_to_be_paused", str4)), x6h1VarC3.a(), bpl0VarL.a, System.currentTimeMillis()), (xj61) null).a).subscribe());
                    return;
                }
                if (!j7zVar.e.a(j7zVar.d)) {
                    e6v0 e6v0Var = (e6v0) ((Function0) this.e).invoke();
                    if (j7zVar.f && oxrVar.g.b() && oxrVar.h.d()) {
                        z = true;
                    }
                    vkuVar.a(s8u0Var.c(e6v0Var).observeOn(oxrVar.i).subscribe(new bj8(z, oxrVar, e6v0Var, (byte) 2)));
                    return;
                }
                aod aodVar = oxrVar.e;
                int i2 = j7zVar2.d;
                String str5 = ((lik1) oxrVar.b.get()).a;
                String str6 = j7zVar2.c;
                int iC2 = l1d.C(i2);
                if (iC2 == 0) {
                    ((wr00) aodVar.b).a(str4);
                    return;
                } else if (iC2 == 1) {
                    ((yh2) aodVar.c).b(str4, str6);
                    return;
                } else {
                    mna0.e("Episode Restriction ", zjy.s(i2), " not supported");
                    return;
                }
            case 3:
                ((z1s) ((mxr) this.c).c).a(new ui70(((eoo) this.e).a ? 1 : 2, (String) this.b, (tv80) this.d));
                return;
            case 4:
                ((muu) this.c).b.b((xwp0) this.b, (v1v) obj, (rvr) this.d, (rvr) this.e);
                return;
            case 5:
                s0w s0wVar = (s0w) obj;
                Object obj2 = ((bey0) this.c).get();
                iu30 iu30Var = (iu30) this.b;
                kma0 kma0Var = (kma0) this.d;
                idd1 idd1Var = (idd1) this.e;
                qzh qzhVar = (qzh) obj2;
                s0wVar.getClass();
                if (!((Boolean) iu30Var.invoke(s0wVar)).booleanValue()) {
                    qzhVar.getView().setVisibility(8);
                    return;
                }
                qzhVar.getView().setVisibility(0);
                e1w e1wVar = (e1w) idd1Var.getValue();
                String str7 = (String) kma0Var.invoke(s0wVar);
                if (str7 == null) {
                    str7 = "";
                }
                qzhVar.f(e1w.a(e1wVar, str7));
                return;
            case 6:
                ObserveResponse observeResponse = (ObserveResponse) obj;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
                nif1 nif1Var = (nif1) this.d;
                if (((AtomicBoolean) this.c).get()) {
                    return;
                }
                int iIncrementAndGet = ((AtomicInteger) this.b).incrementAndGet();
                nif1Var.e("await_response_" + iIncrementAndGet);
                if (!observeResponse.p()) {
                    atomicBoolean.set(false);
                    return;
                }
                nif1Var.c((Long) null, "await_response_" + (iIncrementAndGet + 1));
                atomicBoolean.set(true);
                return;
            case 7:
                z1s z1sVar = (z1s) ((byp) this.c).a;
                tv80 tv80Var = (tv80) this.b;
                int i3 = ((eoo) this.d).a ? 1 : 2;
                po90 po90Var = (po90) this.e;
                String str8 = po90Var.a;
                if (ihc1.y0(str8)) {
                    str8 = po90Var.b;
                }
                z1sVar.a(new ui70(i3, str8, tv80Var));
                return;
            case 8:
                fn31.T((c9n) this.c, (o8n) null, 0, new az80((spj0) this.b, this.d, (p811) this.e, (lnm) null, (byte) 24), 3);
                return;
            case 9:
                if (!((no4) ((b0a0) this.c).a.get()).H() || ((dxz0) this.b).d()) {
                    return;
                }
                ((z1s) this.e).a(new zh70(((Context) this.d).getResources().getString(2131962658)));
                return;
            default:
                lis lisVar = (lis) this.c;
                i8h1 i8h1Var = lisVar.a;
                tdl0 tdl0Var = lisVar.c;
                x6h1 x6h1VarC4 = tdl0Var.b.c();
                x6h1VarC4.i.add(new a7h1("confirm_discard_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA = x6h1VarC4.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = tdl0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                lls0 lls0Var = (lls0) this.b;
                j2u j2uVar = (j2u) this.d;
                lls0Var.B(new ln5(lisVar, j2uVar, (byte) 20), new ok5(lisVar, j2uVar, (fyw0) obj, (ma41) this.e, (byte) 3));
                return;
        }
    }

    public /* synthetic */ y43(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public y43(mxr mxrVar, tv80 tv80Var, eoo eooVar, String str) {
        this.a = (byte) 3;
        this.c = mxrVar;
        this.d = tv80Var;
        this.e = eooVar;
        this.b = str;
    }
}
