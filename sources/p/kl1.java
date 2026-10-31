package p;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kl1 implements Function, k8x0, xfp0, i761, waa {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public kl1(byte b) {
        switch (b) {
            case 16:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                this.e = new HashMap();
                this.f = new HashMap();
                break;
            case 17:
                this.b = new LinkedHashSet();
                this.c = z6x.a;
                break;
            case 18:
            default:
                this.e = new Handler(Looper.getMainLooper());
                this.f = new xfz0(this, (byte) 0);
                break;
            case 19:
                this.b = new LinkedHashSet();
                this.c = new LinkedHashMap();
                this.d = new jen0();
                this.a = true;
                this.e = w7x.a;
                break;
        }
    }

    public static rrt0 D(PlayerState playerState) {
        return (playerState.isBuffering() || !playerState.isPlaying() || playerState.isPaused()) ? rrt0.c : rrt0.a;
    }

    public static void x(kl1 kl1Var, tka0 tka0Var, dnm dnmVar) {
        HashMap map = (HashMap) kl1Var.b;
        dnm dnmVar2 = (dnm) map.get(tka0Var);
        if (dnmVar2 != null && !dnmVar2.equals(dnmVar)) {
            throw new f761("Contextual serializer or serializer provider for " + tka0Var + " already registered in this module");
        }
        map.put(tka0Var, dnmVar);
        if (syo1.w(tka0Var)) {
            kl1Var.a = true;
        }
    }

    public void A() {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.c = null;
        agz0 agz0Var = (agz0) this.b;
        if ((agz0Var != null ? agz0Var.getAlpha() : 1.0f) == 1.0f) {
            return;
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) this.d;
        if (valueAnimator2 != null ? valueAnimator2.isRunning() : false) {
            return;
        }
        if (!this.a) {
            this.a = true;
        }
        agz0 agz0Var2 = (agz0) this.b;
        float alpha = agz0Var2 != null ? agz0Var2.getAlpha() : 1.0f;
        ValueAnimator valueAnimator3 = (ValueAnimator) this.c;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new wfz0(this, (byte) 0));
        valueAnimatorOfFloat.start();
        this.d = valueAnimatorOfFloat;
    }

    public void B(Set set) {
        Set<rl7> setV0 = dm61.v0(set, (Set) this.e);
        Set<rl7> setV1 = dm61.v0((Set) this.e, set);
        this.e = set;
        for (rl7 rl7Var : setV1) {
            ltf1 ltf1Var = (ltf1) this.f;
            if (ltf1Var != null) {
                Iterator it = ((y9l1) ltf1Var.b).b.iterator();
                while (it.hasNext()) {
                    ((sl7) it.next()).a(rl7Var);
                }
            }
        }
        for (rl7 rl7Var2 : setV0) {
            ltf1 ltf1Var2 = (ltf1) this.f;
            if (ltf1Var2 != null) {
                Iterator it2 = ((y9l1) ltf1Var2.b).b.iterator();
                while (it2.hasNext()) {
                    ((sl7) it2.next()).b(rl7Var2);
                }
            }
        }
    }

    public void C(List list) {
        this.d = new rrc1(list);
    }

    public void E(float f) {
        ((drr0) this.d).t(f);
    }

    public void F() {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            jen0 jen0Var = (jen0) ((LinkedHashMap) this.c).get((rl7) obj);
            if (jen0Var != null && jen0Var.e((jen0) this.d) >= 0.5f) {
                arrayList.add(obj);
            }
        }
        B(o7h.p1(o7h.d1(o7h.a1(arrayList, new fpj1(this, (byte) 1)), 1)));
    }

    public void G(xjr0 xjr0Var) {
        mfh0 mfh0Var = xjr0Var.j;
        this.e = mfh0Var != null ? mfh0Var.d : null;
        if (this.a || !xjr0Var.a.isEmpty()) {
            this.a = true;
            int i = mfh0Var != null ? mfh0Var.a : 0;
            float f = xjr0Var.k;
            ((err0) this.c).t(i);
            ((ksb0) this.f).c(i);
            ((drr0) this.d).t(f);
        }
    }

    public void H(fmw0 fmw0Var) {
        synchronized (this) {
            try {
                if (((fmw0) this.d).equals(fmw0Var)) {
                    return;
                }
                this.d = fmw0Var;
                fmw0Var.toString();
                j2h1.o("StreamStateObserver");
                ((kdn0) this.c).j(fmw0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void I(lal lalVar) {
        h8n1 h8n1Var = (h8n1) ((pz40) this.f).t.get((gi5) this.c);
        if (h8n1Var != null) {
            h8n1Var.k(lalVar);
        }
    }

    public void a(tka0 tka0Var, tka0 tka0Var2, nma0 nma0Var) {
        Object next;
        tka0 tka0Var3;
        String strH = nma0Var.getDescriptor().h();
        HashMap map = (HashMap) this.c;
        Object map2 = map.get(tka0Var);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(tka0Var, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = (HashMap) this.e;
        Object map5 = map4.get(tka0Var);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(tka0Var, map5);
        }
        Map map6 = (Map) map5;
        nma0 nma0Var2 = (nma0) map3.get(tka0Var2);
        if (nma0Var2 != null && !nma0Var2.equals(nma0Var)) {
            throw new f761("Serializer for " + tka0Var2 + " already registered in the scope of " + tka0Var);
        }
        nma0 nma0Var3 = (nma0) map6.get(strH);
        if (nma0Var3 == null || nma0Var3.equals(nma0Var)) {
            map3.put(tka0Var2, nma0Var);
            map6.put(strH, nma0Var);
            return;
        }
        Iterator it = map3.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Map.Entry) next).getValue() != nma0Var3);
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (tka0Var3 = (tka0) entry.getKey()) == null) {
            n9v.h("Name ", strH, " is registered in the module but no Kotlin class is associated with it.");
            return;
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + tka0Var + "' have the same serial name '" + strH + "': " + nma0Var + " for '" + tka0Var2 + "' and " + nma0Var3 + " for '" + tka0Var3 + '\'');
    }

    public Object apply(Object obj) {
        kio kioVar = (kio) obj;
        ghl ghlVar = (ghl) this.b;
        return rqt0.F(ghlVar.h, new fhl(ghlVar, (List) this.c, (String) this.d, (String) this.e, this.a, kioVar, (gj3) this.f, (lnm) null, (byte) 0)).map(new dg8(ghlVar, kioVar));
    }

    public String b() {
        return ((Activity) this.c).getResources().getString(2131960544);
    }

    public void c(tka0 tka0Var, iu30 iu30Var) {
        HashMap map = (HashMap) this.d;
        iu30 iu30Var2 = (iu30) map.get(tka0Var);
        if (iu30Var2 == null || iu30Var2.equals(iu30Var)) {
            map.put(tka0Var, iu30Var);
        } else {
            hhg1.i("Default serializers provider for ", tka0Var, " is already registered: ", iu30Var2);
        }
    }

    public void d(Object obj) {
        m3d m3dVar = (m3d) obj;
        m3d m3dVar2 = m3d.f;
        fmw0 fmw0Var = fmw0.a;
        if (m3dVar == m3dVar2 || m3dVar == m3d.d || m3dVar == m3d.c || m3dVar == m3d.b) {
            H(fmw0Var);
            if (this.a) {
                this.a = false;
                jx30 jx30Var = (jx30) this.f;
                if (jx30Var != null) {
                    jx30Var.cancel(false);
                    this.f = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((m3dVar == m3d.g || m3dVar == m3d.h || m3dVar == m3d.e) && !this.a) {
            l3d l3dVar = (l3d) this.b;
            H(fmw0Var);
            ArrayList arrayList = new ArrayList();
            mzc mzcVar = new mzc();
            mzcVar.c = new it21();
            pzc pzcVar = new pzc(mzcVar);
            mzcVar.b = pzcVar;
            mzcVar.a = x0d.class;
            try {
                a1d a1dVar = new a1d(mzcVar, l3dVar);
                arrayList.add(a1dVar);
                l3dVar.h(n5u.a(), a1dVar);
                mzcVar.a = "waitForCaptureResult";
            } catch (Exception e) {
                pzcVar.a(e);
            }
            dce dceVarJ = poz0.J(jx30.a(pzcVar), new wlw0(this), n5u.a());
            wlw0 wlw0Var = new wlw0(this);
            dce dceVarJ2 = poz0.J(dceVarJ, new mev(wlw0Var, (byte) 20), n5u.a());
            this.f = dceVarJ2;
            aru0 aru0Var = new aru0(this, arrayList, l3dVar, false, (byte) 25);
            dceVarJ2.b(new nx30(dceVarJ2, aru0Var, (byte) 0), n5u.a());
            this.a = true;
        }
    }

    public void e(tka0 tka0Var, iu30 iu30Var) {
        HashMap map = (HashMap) this.f;
        iu30 iu30Var2 = (iu30) map.get(tka0Var);
        if (iu30Var2 == null || iu30Var2.equals(iu30Var)) {
            map.put(tka0Var, iu30Var);
        } else {
            hhg1.i("Default deserializers provider for ", tka0Var, " is already registered: ", iu30Var2);
        }
    }

    public kl1 f() {
        return new kl1((HashMap) this.b, (HashMap) this.c, (HashMap) this.d, (HashMap) this.e, (HashMap) this.f, this.a);
    }

    public void g(lal lalVar) {
        ((pz40) this.f).N0.post(new mqh1((Object) this, (Object) lalVar, false, (byte) 8));
    }

    public void h(tka0 tka0Var, nma0 nma0Var) {
        x(this, tka0Var, new bnm(nma0Var));
    }

    public Observable i(j8x0 j8x0Var) {
        Observable observableNever;
        if (this.a) {
            observableNever = ((koy0) this.f).a();
        } else {
            observableNever = Observable.never();
            observableNever.getClass();
        }
        return Observable.defer(new yj1(observableNever.startWithItem(rih1.a), (byte) 9)).switchMap(new rut0(this, (byte) 4));
    }

    public void k(tka0 tka0Var, iu30 iu30Var) {
        x(this, tka0Var, new cnm(iu30Var));
    }

    public jhm m(String str, String str2, String str3) {
        int i;
        wlx wlxVar = wlx.c;
        boolean z = this.a;
        if (z) {
            i = 2131953984;
        } else {
            if (z) {
                eg.o();
                return null;
            }
            i = 2131953987;
        }
        return new jhm("remove_from_folder_item", wlxVar, (fhm) null, Integer.valueOf(i), (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(new q4z0(str2, (byte) 26), i021.X0), new v721(this, str, str3, (byte) 1)), 244);
    }

    public void n(i761 i761Var) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            tka0 tka0Var = (tka0) entry.getKey();
            dnm dnmVar = (dnm) entry.getValue();
            if (dnmVar instanceof bnm) {
                i761Var.h(tka0Var, ((bnm) dnmVar).a);
            } else {
                if (!(dnmVar instanceof cnm)) {
                    eg.o();
                    return;
                }
                i761Var.k(tka0Var, ((cnm) dnmVar).a);
            }
        }
        for (Map.Entry entry2 : ((Map) this.c).entrySet()) {
            tka0 tka0Var2 = (tka0) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                i761Var.a(tka0Var2, (tka0) entry3.getKey(), (nma0) entry3.getValue());
            }
        }
        for (Map.Entry entry4 : ((Map) this.d).entrySet()) {
            tka0 tka0Var3 = (tka0) entry4.getKey();
            iu30 iu30Var = (iu30) entry4.getValue();
            w0h1.o(1, iu30Var);
            i761Var.c(tka0Var3, iu30Var);
        }
        for (Map.Entry entry5 : ((Map) this.f).entrySet()) {
            tka0 tka0Var4 = (tka0) entry5.getKey();
            iu30 iu30Var2 = (iu30) entry5.getValue();
            w0h1.o(1, iu30Var2);
            i761Var.e(tka0Var4, iu30Var2);
        }
    }

    public nma0 o(List list, tka0 tka0Var) {
        dnm dnmVar = (dnm) ((Map) this.b).get(tka0Var);
        nma0 nma0VarA = dnmVar != null ? dnmVar.a(list) : null;
        if (nma0VarA instanceof nma0) {
            return nma0VarA;
        }
        return null;
    }

    public void onError(Throwable th) {
        jx30 jx30Var = (jx30) this.f;
        if (jx30Var != null) {
            jx30Var.cancel(false);
            this.f = null;
        }
        H(fmw0.a);
    }

    public int p() {
        return ((err0) this.c).s();
    }

    public float q() {
        return ((drr0) this.d).s();
    }

    public nma0 r(String str, tka0 tka0Var) {
        Map map = (Map) ((Map) this.e).get(tka0Var);
        nma0 nma0Var = map != null ? (nma0) map.get(str) : null;
        if (!(nma0Var instanceof nma0)) {
            nma0Var = null;
        }
        if (nma0Var != null) {
            return nma0Var;
        }
        Object obj = ((Map) this.f).get(tka0Var);
        iu30 iu30Var = w0h1.y(1, obj) ? (iu30) obj : null;
        if (iu30Var != null) {
            return (nma0) iu30Var.invoke(str);
        }
        return null;
    }

    public nma0 s(tka0 tka0Var, Object obj) {
        nma0 nma0Var;
        if (tka0Var.m(obj)) {
            Map map = (Map) ((Map) this.c).get(tka0Var);
            if (map != null) {
                nma0Var = (nma0) map.get(rc11.a.b(obj.getClass()));
            } else {
                nma0Var = null;
            }
            nma0 nma0Var2 = nma0Var instanceof nma0 ? nma0Var : null;
            if (nma0Var2 != null) {
                return nma0Var2;
            }
            Object obj2 = ((Map) this.d).get(tka0Var);
            iu30 iu30Var = w0h1.y(1, obj2) ? (iu30) obj2 : null;
            if (iu30Var != null) {
                return (nma0) iu30Var.invoke(obj);
            }
        }
        return null;
    }

    public void t(int i) {
        FrameLayout labelContainer;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.c = null;
        agz0 agz0Var = (agz0) this.b;
        if (agz0Var != null) {
            agz0Var.setAlpha(1.0f);
        }
        ((Handler) this.e).removeCallbacks((xfz0) this.f);
        agz0 agz0Var2 = (agz0) this.b;
        if (agz0Var2 != null && (labelContainer = agz0Var2.getLabelContainer()) != null) {
            labelContainer.setVisibility(0);
        }
        if (this.a) {
            return;
        }
        this.a = true;
    }

    public int type() {
        return 3;
    }

    public boolean u() {
        agz0 agz0Var = (agz0) this.b;
        if ((agz0Var != null ? agz0Var.getAlpha() : 0.0f) == 0.0f) {
            return true;
        }
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        return valueAnimator != null ? valueAnimator.isRunning() : false;
    }

    public int v(sjr0 sjr0Var, int i) {
        int iP = qmo1.p(i, this.e, sjr0Var);
        if (i != iP) {
            ((err0) this.c).t(iP);
            ((ksb0) this.f).c(i);
        }
        return iP;
    }

    public mr20 w(o3r o3rVar, Object obj) {
        return o4p1.r(hu20.e(d3p1.F((d0r) this.b, o3rVar, obj), new i64(3, (lnm) null, (byte) 0)), (q8n) this.e);
    }

    public void y(float f, int i) {
        ((err0) this.c).t(i);
        ((ksb0) this.f).c(i);
        ((drr0) this.d).t(f);
        this.e = null;
    }

    public void z(long j) {
        if (u()) {
            return;
        }
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new wfz0(this, (byte) 1));
        valueAnimatorOfFloat.start();
        this.c = valueAnimatorOfFloat;
    }

    public /* synthetic */ kl1(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.a = z;
        this.f = obj5;
    }

    public kl1(pz40 pz40Var, px40 px40Var, gi5 gi5Var) {
        Objects.requireNonNull(pz40Var);
        this.f = pz40Var;
        this.d = null;
        this.e = null;
        this.a = false;
        this.b = px40Var;
        this.c = gi5Var;
    }

    public /* synthetic */ kl1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.a = z;
    }

    public kl1(boolean z, gmt gmtVar, n3q0 n3q0Var, Scheduler scheduler, Scheduler scheduler2, vku vkuVar) {
        this.a = z;
        this.b = gmtVar;
        this.c = n3q0Var;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = vkuVar;
    }

    public kl1(int i, float f, jkr0 jkr0Var) {
        this.b = jkr0Var;
        this.c = new err0(i);
        this.d = new drr0(f);
        this.f = new ksb0(i, 30, 100);
    }

    public kl1(xd0 xd0Var, Flowable flowable, Scheduler scheduler, yqg yqgVar, boolean z) {
        this.b = xd0Var;
        this.c = flowable;
        this.d = scheduler;
        this.e = yqgVar;
        this.a = z;
        this.f = new idd1(new pdy(this, (byte) 5));
    }
}
