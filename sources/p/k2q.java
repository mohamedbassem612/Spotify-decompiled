package p;

import android.content.Context;
import com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider;
import com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;
import com.spotify.login.loginflowimpl.DelegatingLoginActivity;
import com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k2q implements dl4, Function, jl3, il3 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public k2q(hl3 hl3Var, x4q x4qVar, String str, Flowable flowable) {
        a1q a1qVar;
        this.a = (byte) 28;
        switch (x4qVar.a) {
            case 0:
                a1qVar = new a1q(((v5q) ((thq) x4qVar.b).c).U(), flowable);
                break;
            case 1:
                a1qVar = new a1q(((s7q) x4qVar.b.d).v2(), flowable);
                break;
            default:
                a1qVar = new a1q(((thq) x4qVar.b).c.b.u0(), flowable);
                break;
        }
        this.b = a1qVar;
        this.c = hl3Var.a(str, flowable);
    }

    public static final jge c(k2q k2qVar) {
        return hu20.e(yoi1.g(((t1r) k2qVar.b).a()), new z1r((lnm) null, k2qVar, (byte) 0));
    }

    public static final y1r d(boolean z) {
        return z ? new x1r(2) : w1r.a;
    }

    public Completable a(gl3 gl3Var) {
        return ((il3) this.c).a(gl3Var);
    }

    public Object apply(Object obj) {
        Single map;
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 26:
                int iOrdinal = ((p4o0) obj).ordinal();
                if (iOrdinal == 0) {
                    Single singleJust = Single.just(g4o0.a);
                    singleJust.getClass();
                    return singleJust;
                }
                if (iOrdinal == 2) {
                    Single singleJust2 = Single.just(g4o0.c);
                    singleJust2.getClass();
                    return singleJust2;
                }
                uj ujVar = (sj) obj2;
                String str = ujVar.e;
                if (str != null) {
                    ujVar.e = null;
                    ujVar.f = null;
                    ujVar.a.a(str).subscribe(new ps4(str));
                }
                return ((kcr) obj3).d.a();
            default:
                wh80 wh80Var = (wh80) obj3;
                wj3 wj3Var = (wj3) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    return Single.just(Collections.singletonList(wh80Var.getContextUri()));
                }
                String contextUri = wh80Var.getContextUri();
                Set set = s4b1.f;
                v5b1 v5b1Var = uic.x(contextUri).d;
                b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
                if (u890.j(type, nyu0.e) || u890.j(type, wyu0.f)) {
                    map = rqt0.F(o6x.a, new clo(wj3Var, contextUri, (lnm) null, (byte) 9)).map(v560.U0);
                } else {
                    map = Single.just(Boolean.TRUE);
                }
                Single map2 = map.map(new a1q((Object) wh80Var, (Object) wj3Var, (byte) 27)).map(qz70.U0);
                ((agc0) wj3Var.g).getClass();
                return map2.onErrorReturnItem(Collections.singletonList("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ"));
        }
    }

    public Completable b() {
        return ((il3) this.c).b();
    }

    public Flowable getState() {
        return ((jl3) this.b).getState();
    }

    public void w(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                DelegatingLoginActivity delegatingLoginActivity = (DelegatingLoginActivity) obj;
                daq daqVar = (daq) obj3;
                delegatingLoginActivity.c1 = uge0.j((Context) daqVar.x1.a, (pbk1) daqVar.Oh.get());
                delegatingLoginActivity.b1 = (Scheduler) daqVar.A2.get();
                delegatingLoginActivity.a1 = (Observable) ((szp) obj2).get();
                break;
            case 1:
                ts10 ts10Var = (ts10) obj;
                s7q s7qVar = (s7q) obj3;
                ((nzo) ts10Var).V1 = (jgu) s7qVar.i.get();
                ts10Var.X1 = (v2q) ((jly0) obj2).get();
                ts10Var.W1 = new uny((rwg0) s7qVar.tj.get(), (rug0) s7qVar.uj.get(), (Random) s7qVar.b.I1.get(), (byte) 27);
                ts10Var.Y1 = s7qVar.X2();
                break;
            case 2:
                NoAnimLauncherActivity noAnimLauncherActivity = (NoAnimLauncherActivity) obj;
                daq daqVar2 = (daq) obj3;
                noAnimLauncherActivity.g = (jgu) daqVar2.a.g0.get();
                noAnimLauncherActivity.f = (wnh1) ((jly0) obj2).get();
                noAnimLauncherActivity.e = (ohv0) daqVar2.U5.get();
                break;
            case 3:
                PromptSuggestionsProvider promptSuggestionsProvider = (PromptSuggestionsProvider) obj;
                daq daqVar3 = (daq) obj3;
                promptSuggestionsProvider.a = xqu.a(daqVar3.zo);
                promptSuggestionsProvider.c = xqu.a((szp) obj2);
                promptSuggestionsProvider.b = xqu.a(daqVar3.Ao);
                break;
            case 4:
                k7c1 k7c1Var = (k7c1) obj;
                wj3 wj3Var = (wj3) obj2;
                ((hip) k7c1Var).F1 = (jgu) ((p2q) wj3Var.f).get();
                w4c1 w4c1Var = (w4c1) ((jly0) wj3Var.h).get();
                BehaviorSubject behaviorSubject = ((las0) ((jly0) wj3Var.i).get()).a;
                BehaviorSubject behaviorSubject2 = ((v6c1) ((jly0) wj3Var.t).get()).a;
                i8h1 i8h1Var = (i8h1) ((daq) wj3Var.c).A5.get();
                String strB = j310.b();
                String str = ((FandomCollectiblesStoryActivity) ((e93) wj3Var.d).b).getViewUri().a;
                c8o.m(str);
                r6h1 r6h1Var = r6h1.c;
                daq daqVar4 = (daq) obj3;
                k7c1Var.K1 = new t7c1(w4c1Var, behaviorSubject, behaviorSubject2, new r2a1(i8h1Var, new h4l0(strB, str), (byte) 20), (q8n) daqVar4.r2.get(), (q8n) daqVar4.E1.get(), j310.b());
                k7c1Var.I1 = new q881((fgi1) ((jly0) wj3Var.O0).get(), (byte) 27);
                k7c1Var.J1 = new rmr((qy7) ((jly0) wj3Var.N0).get(), (byte) 12);
                k7c1Var.H1 = new l5b1((k9c1) ((jly0) wj3Var.X).get(), (byte) 22);
                k7c1Var.G1 = new k7b1(1, (w4c1) ((jly0) wj3Var.h).get(), w4c1.class, "storyState", "storyState(I)Lcom/spotify/campaigns/storytelling/common/StoryState;", 0, (byte) 5);
                break;
            case 5:
                df81 df81Var = (df81) obj;
                df81Var.e2 = j380.l(zwv0.a, (szp) obj2);
                df81Var.d2 = (lzn0) ((s7q) obj3).U0.get();
                break;
            default:
                SlateMessageHostActivity slateMessageHostActivity = (SlateMessageHostActivity) obj;
                ((mzo) slateMessageHostActivity).a1 = (jgu) ((daq) obj3).a.g0.get();
                slateMessageHostActivity.b1 = xqu.a((szp) obj2);
                break;
        }
    }

    public k2q(daq daqVar, s7q s7qVar, byte b) {
        this.a = b;
        this.b = s7qVar;
        switch (b) {
            case 5:
                this.c = new szp(daqVar, (byte) 13);
                break;
            default:
                this.c = iy81.a(new w2q(daqVar, s7qVar, (byte) 0));
                break;
        }
    }

    public /* synthetic */ k2q(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public k2q(n67 n67Var) {
        this.a = (byte) 12;
        this.b = n67Var;
        this.c = xqu.b(new bpq(this, (byte) 7));
    }

    public k2q(tbn tbnVar) {
        this.a = (byte) 18;
        this.b = tbnVar;
        this.c = iy81.a(new hsq(this, (byte) 5));
    }

    public k2q(a0q a0qVar) {
        this.a = (byte) 16;
        this.b = a0qVar;
        this.c = iy81.a(new bpq(this, (byte) 29));
    }

    public k2q(gl90 gl90Var) {
        this.a = (byte) 14;
        this.b = gl90Var;
        this.c = iy81.a(new bpq(this, (byte) 14));
    }

    public k2q(sn91 sn91Var) {
        this.a = (byte) 13;
        this.b = sn91Var;
        this.c = iy81.a(new bpq(this, (byte) 11));
    }

    public k2q(yzp yzpVar, qop qopVar) {
        this.a = (byte) 24;
        this.b = yzpVar;
        this.c = new hsq(this, (byte) 29);
    }

    public k2q(zzp zzpVar, qop qopVar) {
        this.a = (byte) 7;
        this.b = zzpVar;
        this.c = iy81.a(new uyp(this, (byte) 3));
    }

    public k2q(l3q l3qVar, qop qopVar, lbt lbtVar) {
        this.a = (byte) 20;
        this.b = l3qVar;
        this.c = new hsq(this, (byte) 14);
    }

    public k2q(jbq jbqVar, qop qopVar) {
        this.a = (byte) 8;
        this.b = jbqVar;
        this.c = new uyp(this, (byte) 11);
    }

    public k2q(ywv0 ywv0Var) {
        this.a = (byte) 21;
        this.b = ywv0Var;
        this.c = new hsq(this, (byte) 17);
    }

    public k2q(lhc lhcVar, qop qopVar) {
        this.a = (byte) 19;
        this.b = qopVar;
        this.c = new hsq(this, (byte) 9);
    }

    public k2q(ibq ibqVar, qop qopVar) {
        this.a = (byte) 15;
        this.b = ibqVar;
        this.c = iy81.a(new bpq(this, (byte) 20));
    }

    public k2q(jij1 jij1Var) {
        this.a = (byte) 22;
        this.b = jij1Var;
        this.c = xqu.b(new hsq(this, (byte) 21));
    }

    public k2q(ok21 ok21Var, q7r0 q7r0Var) {
        this.a = (byte) 10;
        this.b = ok21Var;
        this.c = xqu.b(new uyp(this, (byte) 26));
    }

    public k2q(sct sctVar, mr51 mr51Var) {
        this.a = (byte) 11;
        this.b = sctVar;
        this.c = xqu.b(new bpq(this, (byte) 0));
    }

    public k2q(ryd1 ryd1Var, ryj ryjVar) {
        this.a = (byte) 17;
        this.b = ryd1Var;
        this.c = xqu.b(new hsq(this, (byte) 2));
    }

    public k2q(qd11 qd11Var, ryj ryjVar, rd11 rd11Var) {
        this.a = (byte) 9;
        this.b = qd11Var;
        this.c = xqu.b(new uyp(this, (byte) 23));
    }

    public k2q(iwl1 iwl1Var, jwl1 jwl1Var, q7r0 q7r0Var) {
        this.a = (byte) 23;
        this.b = iwl1Var;
        this.c = iy81.a(new hsq(this, (byte) 24));
    }

    public k2q(daq daqVar, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = daqVar;
                this.c = xqu.b(new szp(daqVar, (byte) 7));
                break;
            case 3:
                this.b = daqVar;
                this.c = new szp(daqVar, (byte) 10);
                break;
            case 4:
            case 5:
            default:
                this.b = daqVar;
                this.c = new szp(daqVar, (byte) 2);
                break;
            case 6:
                this.b = daqVar;
                this.c = new szp(daqVar, (byte) 15);
                break;
        }
    }
}
