package p;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsSetOptions;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableConcatIterable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ij01 implements Function, j7k1, Function6, qiw, jrn0, ya, xi7 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ij01(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public int a(View view) {
        return a.Q(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    public boolean accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 20:
                return ((xx4) obj2).b();
            default:
                return ((xp4) obj2).b();
        }
    }

    public Object apply(Object obj) {
        int i;
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                String str = (String) obj;
                ytp0 ytp0Var = (ytp0) ((cr6) obj2).d;
                str.getClass();
                return ytp0Var.C(str).w();
            case 3:
                knh knhVar = (knh) obj;
                return ((h1e0) obj2).b.a(knhVar.a, knhVar.b);
            case 6:
                List list = (List) obj;
                xaz0 xaz0Var = (xaz0) obj2;
                if (!list.isEmpty()) {
                    return rpm1.a((rpm1) xaz0Var.b, list).o(Functions.h);
                }
                CompletableEmpty completableEmpty = CompletableEmpty.a;
                completableEmpty.getClass();
                return completableEmpty;
            case 10:
                i1z i1zVar = (i1z) obj;
                g281 g281Var = i1zVar.z;
                return g281Var == null ? MaybeEmpty.a : ((hv00) obj2).a.b(new oi("gated-podcast-upsell-flow", false, new zw11(g281Var, (byte) 12))).filter(y6x0.g).map(new ks21(g281Var, (byte) 2)).filter(l9x0.h).map(new dc31(g281Var, i1zVar, (byte) 0)).firstElement();
            case 15:
                pj91 pj91Var = (pj91) obj;
                pf81 pf81Var = (pf81) ((yx11) obj2).b;
                String str2 = pj91Var.a;
                boolean z2 = pj91Var.b;
                boolean z3 = pj91Var.c;
                boolean z4 = pj91Var.d;
                boolean z5 = pj91Var.e;
                inm inmVar = pf81Var.a;
                y6b1 y6b1VarU = tto1.u(str2);
                ArrayList arrayListO = p7h.O(new Completable[]{y6b1VarU == null ? CompletableEmpty.a : inmVar.c.firstOrError().observeOn(inmVar.b).flatMapCompletable(new hr8(y6b1VarU, z2, inmVar, str2, (byte) 1))});
                if (z5) {
                    arrayListO.add(pf81Var.d.flatMapCompletable(new jqd0(pf81Var, str2, z3, (byte) 18)));
                }
                arrayListO.add(pf81Var.a(str2, z2, z3, z4));
                return new CompletableConcatIterable(arrayListO).w();
            case 16:
                gn01 gn01Var = ((ny41) obj2).b;
                String str3 = ((ao3) obj).d;
                gn01Var.getClass();
                return new CompletableFromRunnable(new aih0(gn01Var, str3, z, (byte) 15)).s(gn01Var.a);
            case 21:
                xqx0 xqx0Var = (xqx0) obj;
                h4e0 h4e0Var = (h4e0) obj2;
                return new CompletableFromAction(new tt60(h4e0Var, xqx0Var, (byte) 23)).e(h4e0Var.b.h(xqx0Var.a, xqx0Var.c, new svi0(xqx0Var.d, xqx0Var.e))).flatMapObservable(new ep31(xqx0Var, (byte) 8)).onErrorReturn(new ks21(xqx0Var, (byte) 13));
            case 23:
                vj91 vj91Var = (vj91) obj;
                n801 n801Var = (n801) obj2;
                boolean z6 = vj91Var.a;
                Map mapSingletonMap = Collections.singletonMap("context_enhancement", vj91Var.b ? "RECOMMENDATION" : "NONE");
                orz orzVarO = EsSetOptions.SetOptionsRequest.o();
                ppz ppzVarN = EsOptional.OptionalBoolean.n();
                ppzVarN.n(z6);
                orzVarO.v(ppzVarN.build());
                orzVarO.n(mapSingletonMap);
                return ((ujm) n801Var.b).a(orzVarO.build()).ignoreElement().w();
            case 27:
                mmr0 mmr0Var = (mmr0) obj;
                x181 x181Var = (x181) obj2;
                PlayerState playerState = (PlayerState) mmr0Var.a;
                Object obj3 = mmr0Var.b;
                PlayerState playerState2 = (PlayerState) obj3;
                yqg yqgVar = x181Var.a;
                if (x181Var.e.a() && !x181Var.c.b() && l4o1.G((ContextTrack) playerState2.track().b()) && x181Var.b.d()) {
                    qes qesVar = x181Var.d;
                    if (qesVar.b().size() <= 2 && !qesVar.b().contains(f4p1.o(yqgVar.d().getTime())) && 22 <= (i = yqgVar.d().get(11)) && i < 24 && (!playerState.track().c() ? !(!playerState2.isPlaying() || playerState2.isPaused()) : !((playerState.isPlaying() && !playerState.isPaused()) || !playerState2.isPlaying() || playerState2.isPaused()))) {
                        z = true;
                    }
                }
                return new w181(z, o4p1.o((PlayerState) obj3));
            default:
                return Observable.create(new ks21((yon) obj2, (byte) 19));
        }
    }

    public int b() {
        return ((a) this.b).getPaddingTop();
    }

    public Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        ContextTrack contextTrack = (ContextTrack) obj;
        fvf1 fvf1Var = (fvf1) obj2;
        Restrictions restrictions = (Restrictions) obj3;
        Boolean bool = (Boolean) obj4;
        tig0 tig0Var = (tig0) obj5;
        agv agvVar = (agv) obj6;
        ri11 ri11Var = (ri11) this.b;
        boolean z = tig0Var instanceof rig0;
        if (restrictions.disallowSeekingReasons().isEmpty()) {
            i = 1;
        } else {
            i = (u890.j(restrictions.disallowSeekingReasons(), ri11.P0) && (ri11Var.t.e() || z)) ? 3 : 2;
        }
        String strUri = contextTrack.uri();
        boolean z2 = true;
        long j = fvf1Var.a;
        long j2 = fvf1Var.b;
        if (i == 2) {
            z2 = false;
        }
        boolean zBooleanValue = bool.booleanValue();
        jn4 jn4Var = ri11Var.i;
        iu30 iu30Var = (iu30) olv.a.get(l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_CONTEXT_URI));
        return new ni11(new f0g1(strUri, j, j2, z2, false, zBooleanValue, iu30Var != null ? (yzf1) iu30Var.invoke(jn4Var) : null, agvVar, 16), i, tig0Var);
    }

    public npn0 d(gp41 gp41Var) {
        return new npn0(gp41Var, (ohv0) this.b);
    }

    public int e() {
        a aVar = (a) this.b;
        return aVar.P0 - aVar.getPaddingBottom();
    }

    public View f(int i) {
        return ((a) this.b).H(i);
    }

    public int g(View view) {
        return a.L(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(d4y d4yVar, vr20 vr20Var, onm onmVar) {
        y941 y941Var;
        if (onmVar instanceof y941) {
            y941Var = (y941) onmVar;
            int i = y941Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                y941Var.d = i - Integer.MIN_VALUE;
            } else {
                y941Var = new y941(this, onmVar);
            }
        } else {
            y941Var = new y941(this, onmVar);
        }
        Object objI = y941Var.b;
        int i2 = y941Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            String str = d4yVar.a;
            String str2 = d4yVar.b;
            if (!u890.j(str, str2)) {
                y941Var.a = vr20Var;
                y941Var.d = 1;
                objI = i(str2, y941Var);
                if (objI != d9nVar) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objI);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vr20Var = y941Var.a;
        hm5.M(objI);
        y941Var.a = null;
        y941Var.d = 2;
        return vr20Var.emit(objI, y941Var) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, onm onmVar) {
        z941 z941Var;
        if (onmVar instanceof z941) {
            z941Var = (z941) onmVar;
            int i = z941Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z941Var.c = i - Integer.MIN_VALUE;
            } else {
                z941Var = new z941(this, onmVar);
            }
        } else {
            z941Var = new z941(this, onmVar);
        }
        Object obj = z941Var.a;
        int i2 = z941Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableB = ((r241) this.b).b("dj-language", str);
                z941Var.c = 1;
                Object objI = fc11.i(completableB, z941Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return r4y.a;
        } catch (IOException unused) {
            return q4y.a;
        }
    }

    public hxo1 j(Message message, List list, gmc gmcVar, klc klcVar) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<Rule> list2 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        for (Rule rule : list2) {
            bz31 bz31Var = (bz31) this.b;
            az3 az3Var = (ty31) bz31Var.b.get(rule);
            if (az3Var == null) {
                az3Var = bz31Var.a;
                Logger.d("RuleHandler for Rule: " + rule + " not found. Returning alwaysDisallowRuleHandler", new Object[0]);
            }
            rqg0 rqg0VarA = az3Var.a(message, gmcVar, klcVar);
            if (rqg0VarA instanceof wy31) {
                arrayList.add(rule);
                String str = ((wy31) rqg0VarA).f;
                if (str != null) {
                    linkedHashSet.add(new mmr0(rule, str));
                }
            }
            arrayList2.add(rih1.a);
        }
        return arrayList.isEmpty() ? xri1.c : new vri1(arrayList, linkedHashSet);
    }

    public Single l(Intent intent, th61 th61Var) {
        return rqt0.F(igu.b, new p651(intent, (b72) this.b, th61Var, (lnm) null, (byte) 7));
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                s7a s7aVar = (s7a) obj;
                bz11 bz11Var = ((sj21) obj2).a;
                ConstraintLayout constraintLayout = (ConstraintLayout) bz11Var.a;
                EncoreTextView encoreTextView = (EncoreTextView) bz11Var.b;
                fjg1.a(constraintLayout, (jhg1) null);
                if (s7aVar instanceof q7a) {
                    encoreTextView.setVisibility(0);
                    q7a q7aVar = (q7a) s7aVar;
                    encoreTextView.setText(constraintLayout.getContext().getString(q7aVar.a));
                    encoreTextView.setTextAppearance(q7aVar.b);
                } else if (!s7aVar.equals(o7a.a)) {
                    eg.o();
                } else {
                    encoreTextView.setVisibility(8);
                }
                break;
            default:
                List list = (List) obj;
                list.getClass();
                ((mbg1) obj2).a(list, tcd1.b, true, 1);
                break;
        }
    }

    /* JADX INFO: renamed from: l, reason: collision with other method in class */
    public irn0 m699l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        return (irn0) ((xu30) this.b).invoke(intent, uic.x(intent.getDataString()), th61Var);
    }
}
