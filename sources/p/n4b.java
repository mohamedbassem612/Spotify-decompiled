package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.socialprompting.v1.FilterPill;
import com.spotify.socialprompting.v1.GeneratePromptedPlaylistRequest;
import com.spotify.socialprompting.v1.GeneratePromptedPlaylistResponse;
import com.spotify.socialprompting.v1.GetFilterPillsRequest;
import com.spotify.socialprompting.v1.GetFilterPillsResponse;
import com.spotify.socialprompting.v1.GetSuggestedPromptsRequest;
import com.spotify.socialprompting.v1.GetSuggestedPromptsResponse;
import com.spotify.socialprompting.v1.SocialPromptSession;
import com.spotify.socialprompting.v1.SuggestedPrompt;
import com.spotify.userinteractivityservice.usercomments.v1.proto.CreateCommentRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.CreateReplyRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.DeleteCommentRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.DeleteReactionRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetReactionsCountRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListReactionsRequest;
import com.spotify.userinteractivityservice.usercomments.v1.proto.PutReactionRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n4b implements sz3, n4c, Function, k1q0, ya, fhd, Producer, fxc, qiw, cwh, ObservableOnSubscribe, i2q0 {
    public final /* synthetic */ byte a;
    public Object b;

    public n4b(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.b = new i2i1((byte) 17);
                break;
        }
    }

    public static String z(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public g871 A() {
        yfu yfuVar = (yfu) this.b;
        t2j0 t2j0Var = (t2j0) yfuVar.c;
        return new g871(new ii9(t2j0Var), new b6y(t2j0Var, new khc((byte) 24)), (zwz0) yfuVar.b, t2j0Var);
    }

    public dwh a(iac0 iac0Var) {
        return new a1q((v5q) this.b, iac0Var, (byte) 0);
    }

    public boolean accept(Object obj) {
        wqg wqgVar = (wqg) this.b;
        String str = ((ksk) obj).a;
        wqgVar.getClass();
        return str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD");
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                Map map = (Map) obj;
                ConcurrentHashMap.KeySetView keySetView = ((kmc) this.b).b;
                Boolean boolValueOf = Boolean.FALSE;
                Iterator it = keySetView.iterator();
                while (it.hasNext()) {
                    boolValueOf = Boolean.valueOf(map.keySet().contains((String) it.next()) || boolValueOf.booleanValue());
                }
                return boolValueOf;
            case 4:
                return Single.just(Boolean.valueOf(((dma1) obj).h((bma1) this.b, false)));
            case 6:
                nmr0 nmr0Var = (nmr0) obj;
                lrd lrdVar = (lrd) this.b;
                LoggingParams loggingParams = (LoggingParams) nmr0Var.a;
                beh behVar = (feh) nmr0Var.b;
                behVar.getClass();
                if (behVar instanceof beh) {
                    String lowerCase = behVar.a.toLowerCase(Locale.ROOT);
                    Logger.b("[AA-RESUME] resume command failed reasons=".concat(lowerCase), new Object[0]);
                    if (ihc1.h0(lowerCase, "not_playing_context", false)) {
                        Logger.b("[AA-RESUME] not_playing_context fallback -> playSomething", new Object[0]);
                        return new b8p1(lrdVar.n, 2, "android_auto", (String) loggingParams.interactionId().b(), (byte) 3).w(lrdVar.k.c().f(lrdVar.l, loggingParams));
                    }
                } else {
                    Logger.b("[AA-RESUME] resume command succeeded", new Object[0]);
                }
                return Single.just(new ceh());
            case 15:
                azl azlVar = (azl) obj;
                nzl nzlVar = (nzl) this.b;
                azlVar.getClass();
                List list = azlVar.e;
                xl81 xl81Var = azlVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!azlVar.d.contains(((qpl) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                cq00 cq00Var = xl81Var instanceof cq00 ? (cq00) xl81Var : null;
                int iZ = cq00Var != null ? cq00Var.z() : 0;
                Observable observableFlatMap = Observable.just(arrayList).flatMap(new mgc(iZ, azlVar, nzlVar, (byte) 13));
                iti1 iti1Var = new iti1();
                iti1Var.b = iZ;
                iti1Var.c = azlVar;
                iti1Var.a = xl81Var instanceof qpl;
                return observableFlatMap.map(iti1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((uqn) this.b).b.a().map(vrg.T0).toObservable();
            default:
                k9r k9rVar = ((kcr) this.b).a;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context = (Context) k9rVar.b;
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                intent.addFlags(268435456);
                context.startActivity(intent);
                return lcr.b;
        }
    }

    public Type b() {
        return (Type) this.b;
    }

    public void c(nhn nhnVar) {
        this.b = nhnVar;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public void d(Typeface typeface) {
        pzg pzgVar = (pzg) this.b;
        ghd ghdVar = pzgVar.A;
        if (ghdVar != null) {
            ghdVar.e = true;
        }
        if (pzgVar.y != typeface) {
            pzgVar.y = typeface;
            pzgVar.i(false);
        }
    }

    public void e(Bundle bundle, String str) {
        nhn nhnVar = (nhn) this.b;
        if (nhnVar != null) {
            try {
                String str2 = "$A$:" + z(bundle, str);
                ohn ohnVar = nhnVar.a;
                ohnVar.getClass();
                ((djn) ohnVar.p.b).a(new mhn(ohnVar, System.currentTimeMillis() - ohnVar.d, str2, (byte) 0));
            } catch (JSONException unused) {
            }
        }
    }

    public void f(dgo dgoVar, xwa xwaVar, xwa xwaVar2, xwa xwaVar3, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1306702388);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(dgoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xwaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(xwaVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xwaVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(this) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            Object objT = x340Var.T();
            int i5 = i2;
            if (objT == fkj0.X) {
                objT = g2z.x((g2z) this.b, xwaVar3, 3);
                x340Var.s0(objT);
            }
            ka71 ka71Var = (ka71) objT;
            llw0 llw0Var = dgoVar.e;
            int iC = l1d.C(dgoVar.f);
            if (iC == 0) {
                i3 = 2;
                i4 = 1;
            } else if (iC == 1) {
                i4 = 1;
                i3 = 1;
            } else if (iC != 2) {
                eg.o();
                return;
            } else {
                i4 = 1;
                i3 = 3;
            }
            z971 z971Var = new z971(llw0Var, i3, i4);
            qim0 qim0VarA = h2c.a.a(u291.d(nim0.a, 1.0f), graVar);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            otw.c(ka71Var, z971Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
            und.a(xwaVar, (qim0) null, 0.0f, apo.r(-961053985, new g1o(dgoVar, xwaVar2, (byte) 5), x340Var), x340Var, ((i5 >> 3) & 14) | 3072, 6);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0((Object) this, (Object) dgoVar, (Object) xwaVar, (Object) xwaVar2, (Object) xwaVar3, qim0Var, i, (byte) 14);
        }
    }

    public void g(mby mbyVar) {
        ((v280) ((i2i1) this.b).b).c(mbyVar);
    }

    public Object get() {
        return new SchedulerWorkRunner(((u9h) this.b).a);
    }

    public Completable h(String str, String str2) {
        ldi1 ldi1Var = (ldi1) this.b;
        jyy0 jyy0VarO = PutReactionRequest.o();
        jyy0VarO.n(str);
        jyy0VarO.q(str2);
        return ldi1Var.c(jyy0VarO.build()).map(f331.h).ignoreElement();
    }

    public Object i(wyp0 wyp0Var) {
        byh byhVar = new byh(wyp0Var);
        wyp0Var.p(new i3b(byhVar, (byte) 17));
        return byhVar;
    }

    public cw7 j() {
        wv7 wv7Var = (wv7) this.b;
        Activity activity = (Activity) wv7Var.a.get();
        c8o.l(activity);
        lzn0 lzn0Var = (lzn0) wv7Var.d.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) wv7Var.e.get();
        c8o.l(a1r0Var);
        return new cw7(activity, lzn0Var, a1r0Var);
    }

    public nnm k() {
        return new nnm(this);
    }

    public Completable l(String str, List list, String str2) {
        ldi1 ldi1Var = (ldi1) this.b;
        sjn sjnVarP = CreateCommentRequest.p();
        sjnVarP.r(str);
        sjnVarP.q(str2);
        sjnVarP.n(list);
        return ldi1Var.d(sjnVarP.build()).map(u321.R0).ignoreElement();
    }

    public Single m(String str, List list, String str2) {
        ldi1 ldi1Var = (ldi1) this.b;
        oqn oqnVarP = CreateReplyRequest.p();
        oqnVarP.r(str);
        oqnVarP.q(str2);
        oqnVarP.n(list);
        return ldi1Var.a(oqnVarP.build());
    }

    public Completable n(String str) {
        ldi1 ldi1Var = (ldi1) this.b;
        w6t w6tVarO = DeleteCommentRequest.o();
        w6tVarO.n(str);
        return ldi1Var.i(w6tVarO.build()).map(uh21.R0).ignoreElement();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(String str, String str2, gzx0 gzx0Var, onm onmVar) {
        k4b k4bVar;
        if (onmVar instanceof k4b) {
            k4bVar = (k4b) onmVar;
            int i = k4bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k4bVar.c = i - Integer.MIN_VALUE;
            } else {
                k4bVar = new k4b(this, onmVar);
            }
        } else {
            k4bVar = new k4b(this, onmVar);
        }
        Object objB = k4bVar.a;
        int i2 = k4bVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            fe40 fe40VarN = GeneratePromptedPlaylistRequest.n();
            fe40VarN.n(str);
            fe40VarN.q(str2);
            if (gzx0Var instanceof fzx0) {
                fe40VarN.s(((fzx0) gzx0Var).a);
                fe40VarN.r(eyx0.b);
            } else {
                if (!(gzx0Var instanceof ezx0)) {
                    eg.o();
                    return null;
                }
                fe40VarN.r(eyx0.c);
            }
            i4b i4bVar = (i4b) this.b;
            GeneratePromptedPlaylistRequest generatePromptedPlaylistRequest = (GeneratePromptedPlaylistRequest) fe40VarN.build();
            k4bVar.c = 1;
            objB = i4bVar.b(generatePromptedPlaylistRequest, k4bVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        return ((GeneratePromptedPlaylistResponse) objB).n();
    }

    public void onComplete(Task task) {
        ayh ayhVar = ((elr) this.b).e;
        try {
            if (!task.j()) {
                Throwable thF = task.f();
                if (thF == null) {
                    thF = new IllegalStateException("Cast initialization failed");
                }
                ayhVar.y0(thF);
                return;
            }
            Object objG = task.g();
            if (objG == null) {
                throw new IllegalStateException("Cast initialization completed without a CastContext");
            }
            zod.n("Must be called from the main thread.");
            ayhVar.m0(new gg61(((b3e) objG).b));
        } catch (Exception e) {
            Logger.d("CastBasic->%s", new Object[]{l1d.m("Cast initialization callback failed: ", e.getMessage())});
            ayhVar.y0(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(String str, onm onmVar) {
        l4b l4bVar;
        if (onmVar instanceof l4b) {
            l4bVar = (l4b) onmVar;
            int i = l4bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l4bVar.c = i - Integer.MIN_VALUE;
            } else {
                l4bVar = new l4b(this, onmVar);
            }
        } else {
            l4bVar = new l4b(this, onmVar);
        }
        Object objC = l4bVar.a;
        int i2 = l4bVar.c;
        if (i2 == 0) {
            hm5.M(objC);
            jn40 jn40VarN = GetFilterPillsRequest.n();
            jn40VarN.n(str);
            GetFilterPillsRequest getFilterPillsRequestBuild = jn40VarN.build();
            i4b i4bVar = (i4b) this.b;
            getFilterPillsRequestBuild.getClass();
            l4bVar.c = 1;
            objC = i4bVar.c(getFilterPillsRequestBuild, l4bVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (FilterPill filterPill : ((GetFilterPillsResponse) objC).n()) {
            int iN = filterPill.n();
            int i3 = iN == 0 ? -1 : j4b.a[l1d.C(iN)];
            int i4 = 2;
            if (i3 == 1) {
                SocialPromptSession socialPromptSessionO = filterPill.o();
                String sessionId = socialPromptSessionO.getSessionId();
                String prompt = socialPromptSessionO.getPrompt();
                String strO = socialPromptSessionO.o();
                int i5 = o4b.a[socialPromptSessionO.p().ordinal()];
                if (i5 != 1) {
                    i4 = i5 != 2 ? i5 != 3 ? 1 : 4 : 3;
                }
                arrayList.add(new ea61(sessionId, prompt, i4, strO));
            } else if (i3 == 2) {
                SuggestedPrompt suggestedPromptP = filterPill.p();
                arrayList2.add(new ktc1(suggestedPromptP.o(), suggestedPromptP.getPrompt()));
            }
        }
        return new yb20(mqo1.A(arrayList), mqo1.A(arrayList2));
    }

    public Single q(String str) {
        ldi1 ldi1Var = (ldi1) this.b;
        ip40 ip40VarO = GetReactionsCountRequest.o();
        ip40VarO.n(str);
        return ldi1Var.k(ip40VarO.build());
    }

    public Single r(String str, String str2, String str3) {
        ldi1 ldi1Var = (ldi1) this.b;
        h1d0 h1d0VarO = ListReactionsRequest.o();
        h1d0VarO.n(str);
        if (str2 != null) {
            h1d0VarO.r(str2);
        }
        if (str3 != null) {
            h1d0VarO.q(str3);
        }
        return ldi1Var.g(h1d0VarO.build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable s(String str, onm onmVar) {
        m4b m4bVar;
        if (onmVar instanceof m4b) {
            m4bVar = (m4b) onmVar;
            int i = m4bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m4bVar.c = i - Integer.MIN_VALUE;
            } else {
                m4bVar = new m4b(this, onmVar);
            }
        } else {
            m4bVar = new m4b(this, onmVar);
        }
        Object objA = m4bVar.a;
        int i2 = m4bVar.c;
        if (i2 == 0) {
            hm5.M(objA);
            i4b i4bVar = (i4b) this.b;
            nq40 nq40VarN = GetSuggestedPromptsRequest.n();
            nq40VarN.n(str);
            GetSuggestedPromptsRequest getSuggestedPromptsRequest = (GetSuggestedPromptsRequest) nq40VarN.build();
            m4bVar.c = 1;
            objA = i4bVar.a(getSuggestedPromptsRequest, m4bVar);
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
        List<SuggestedPrompt> suggestedPromptsList = ((GetSuggestedPromptsResponse) objA).getSuggestedPromptsList();
        ArrayList arrayList = new ArrayList(q7h.U(suggestedPromptsList, 10));
        for (SuggestedPrompt suggestedPrompt : suggestedPromptsList) {
            suggestedPrompt.getClass();
            arrayList.add(new ktc1(suggestedPrompt.o(), suggestedPrompt.getPrompt()));
        }
        return arrayList;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        ConnectivityManager.NetworkCallback lu4Var = new lu4(new n1r(observableEmitter, (byte) 0), (byte) 1);
        o1r o1rVar = (o1r) this.b;
        ((ConnectivityManager) o1rVar.c.getValue()).registerDefaultNetworkCallback(lu4Var);
        observableEmitter.setCancellable(new pc6(o1rVar, lu4Var, (byte) 2));
    }

    public haa0 t() {
        dw7 dw7Var = (dw7) ((wv7) this.b).f.get();
        c8o.l(dw7Var);
        return new haa0(dw7Var);
    }

    public tdl0 u() {
        iga1 iga1Var = (iga1) this.b;
        return new tdl0(((n6r0) iga1Var.b.get()).path(), ((lik1) iga1Var.c.get()).a, (byte) 22);
    }

    public void v(Object obj) {
        switch (this.a) {
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((dt71) this.b).a((Set) obj);
                break;
            default:
                dbb1 dbb1Var = (dbb1) obj;
                if (dbb1Var.a) {
                    zmr zmrVar = (zmr) this.b;
                    String str = dbb1Var.b;
                    e93 e93Var = zmrVar.e;
                    wmr wmrVar = new wmr(zmrVar, (byte) 1);
                    ArtworkView artworkView = (ArtworkView) e93Var.d;
                    if (str == null || str.length() == 0) {
                        artworkView.setVisibility(8);
                        ((TextView) e93Var.U0).setVisibility(0);
                    } else {
                        artworkView.setVisibility(0);
                    }
                    artworkView.n(wmrVar);
                    artworkView.h(new l07(new g07(str), true));
                }
                break;
        }
    }

    public void w(s880 s880Var, Thread thread, Throwable th) {
        hfp1 hfp1VarE;
        jhn jhnVar = (jhn) this.b;
        synchronized (jhnVar) {
            Objects.toString(th);
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            long jCurrentTimeMillis = System.currentTimeMillis();
            djn djnVar = (djn) jhnVar.e.b;
            hhn hhnVar = new hhn(jhnVar, jCurrentTimeMillis, th, thread, s880Var);
            synchronized (djnVar.b) {
                hfp1VarE = djnVar.c.e(djnVar.a, new thn(hhnVar, (byte) 1));
                djnVar.c = hfp1VarE;
            }
            try {
                opi1.a(hfp1VarE);
            } catch (TimeoutException | Exception unused) {
            }
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(655);
        ((FrameLayout) ((zyf) this.b).d.b).setPadding(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
        return hsl1.b;
    }

    public Completable y(String str) {
        ldi1 ldi1Var = (ldi1) this.b;
        d9t d9tVarO = DeleteReactionRequest.o();
        d9tVarO.n(str);
        return ldi1Var.j(d9tVarO.build()).map(j561.R0).ignoreElement();
    }

    public /* synthetic */ n4b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public n4b(Context context) {
        this.a = (byte) 27;
        this.b = new ogv(context.getResources(), (byte) 0);
    }

    public n4b(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.a = (byte) 7;
        this.b = frameLayout;
    }

    public n4b(daq daqVar, v5q v5qVar) {
        this.a = (byte) 23;
        this.b = v5qVar;
    }
}
