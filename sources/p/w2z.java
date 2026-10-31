package p;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.home.slotloading.SlotEffect;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w2z implements Function, r1v0, SingleOnSubscribe, j720, uzr0, p2r0, kvp0, cy81 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public w2z(byte b) {
        this.a = b;
        switch (b) {
            case 26:
                break;
            default:
                this.b = new Object();
                break;
        }
    }

    public mr20 a() {
        return (mr20) ((idd1) this.c).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    public Object apply(Object obj) {
        Observable observableJust;
        u510 u510Var;
        u510 u510Var2;
        switch (this.a) {
            case 0:
                uv00 uv00Var = (uv00) obj;
                String str = (String) this.b;
                v740 v740Var = uv00Var.a(v740.class, str).b;
                mdz mdzVar = uv00Var.a(mdz.class, str).b;
                if (mdzVar != null ? mdzVar.l : false) {
                    Observable observableJust2 = Observable.just(new gq21(str));
                    observableJust2.getClass();
                    return observableJust2;
                }
                if (v740Var != null && !v740Var.a.isEmpty()) {
                    x2z x2zVar = (x2z) this.c;
                    return x2zVar.a.b(new oi("GatedContentRouter", false, new kov(str, (byte) 22))).filter(cq41.b1).flatMap(new uny(str, x2zVar, v740Var, (byte) 4));
                }
                Observable observableJust3 = Observable.just(new hq21(str));
                observableJust3.getClass();
                return observableJust3;
            case 1:
                y6z y6zVar = (y6z) this.c;
                String str2 = (String) this.b;
                return ((uu00) ((k9) y6zVar).b).b(new oi("save-for-later", false, new kov(str2, (byte) 27))).filter(fmv.d1).map(new x6z(str2, y6zVar, (byte) 0)).map(new j3v((kk3) obj, (byte) 10));
            case 2:
            case 5:
            case 6:
            case 8:
            default:
                fbr fbrVar = (fbr) obj;
                return new a500((ContextTrack) this.b, fbrVar.a.o(), fbrVar.b, fbrVar.c, (qtf1) this.c);
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    Single singleJust = Single.just(Boolean.TRUE);
                    singleJust.getClass();
                    return singleJust;
                }
                sdz sdzVar = (sdz) this.c;
                String str3 = (String) this.b;
                return sdzVar.b.a(Collections.singletonList(str3), sdz.d).map(new mcn1(str3, (byte) 4)).onErrorReturnItem(Boolean.FALSE);
            case 4:
                Map map = (Map) obj;
                gvd0 gvd0Var = (gvd0) this.b;
                List<ivd0> list = gvd0Var.k;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (ivd0 ivd0Var : list) {
                    Boolean bool = (Boolean) map.get(ivd0Var.c);
                    arrayList.add(new ivd0(ivd0Var.a, ivd0Var.b, ivd0Var.c, bool != null ? bool.booleanValue() : false));
                }
                return new jvd0(new gvd0(gvd0Var.a, gvd0Var.b, gvd0Var.c, gvd0Var.d, gvd0Var.e, gvd0Var.f, gvd0Var.g, gvd0Var.h, gvd0Var.i, gvd0Var.j, arrayList, gvd0Var.l, gvd0Var.m, gvd0Var.n, gvd0Var.o), ((jvd0) this.c).b);
            case 7:
                ez00 ez00Var = ((uv00) obj).a((Class) this.c, (String) this.b).b;
                return (ez00Var == null || (observableJust = Observable.just(ez00Var)) == null) ? Observable.empty() : observableJust;
            case 9:
                if (((Boolean) obj).booleanValue()) {
                    return CompletableEmpty.a;
                }
                r410 r410Var = (r410) this.b;
                vgq0 vgq0Var = (vgq0) this.c;
                r410Var.getClass();
                return ((ugq0) vgq0Var.b).a().map(eh10.V0).map(o9p1.e1).flatMapCompletable(new wb00(r410Var, (byte) 1));
            case 10:
                return ((z410) this.b).a((PreparePlayOptions) obj, ((Context) this.c).uri());
            case 11:
                kow kowVar = (kow) obj;
                if (kowVar instanceof iow) {
                    return new u510(true);
                }
                if (!(kowVar instanceof jow)) {
                    eg.o();
                    return null;
                }
                Object objH = ((ai8) this.b).c.h();
                if (objH == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                ml8 ml8Var = (nl8) objH;
                boolean z = ml8Var instanceof ml8;
                u510 u510Var3 = v510.a;
                if (z) {
                    int iOrdinal = ml8Var.a.ordinal();
                    if (iOrdinal == 2) {
                        u510Var2 = new u510(false);
                    } else if (iOrdinal != 9 && ml8Var.a() && ml8Var.a.a()) {
                        u510Var2 = new u510(false);
                    } else {
                        u510Var = u510Var3;
                    }
                    u510Var = u510Var2;
                } else {
                    u510Var = u510Var3;
                }
                if (!(u510Var instanceof v510)) {
                    return u510Var;
                }
                String str4 = ((r9c) this.c).b;
                ml8Var.toString();
                return u510Var;
            case 12:
                return ((Boolean) obj).booleanValue() ? j2h1.D(o6x.a, new d610((g610) this.c, (String) this.b, (lnm) null, (byte) 3)) : CompletableEmpty.a;
            case 13:
                return ((g710) this.b).j(((Long) obj).longValue(), (spq0) this.c);
        }
    }

    public void b() {
        this.b = null;
        this.c = null;
    }

    public void c(tv80 tv80Var) {
        ou80 ou80Var;
        iu30 iu30Var = (iu30) ((p811) this.c).a;
        if (iu30Var != null) {
            iu30Var.invoke((tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a);
        }
    }

    public Object d(Uri uri, g3r g3rVar) {
        kf20 kf20Var = (kf20) ((uzr0) this.b).d(uri, g3rVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? kf20Var : (kf20) kf20Var.a(list);
    }

    @Override // p.r1v0
    public yrg0 f(vi11 vi11Var) {
        FrameLayout frameLayout = new FrameLayout((android.content.Context) vi11Var.f);
        jl11 jl11Var = (jl11) this.b;
        jl11Var.getClass();
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(frameLayout.getContext()).inflate(2131625123, (ViewGroup) null, false);
        int i = 2131430626;
        if (((TextView) m5n1.t(constraintLayoutInflate, 2131430626)) != null) {
            i = 2131430627;
            RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131430627);
            if (recyclerViewT != null) {
                jl11Var.a = new sb30(constraintLayoutInflate, recyclerViewT);
                recyclerViewT.setAdapter(jl11Var.b);
                recyclerViewT.getContext();
                recyclerViewT.setLayoutManager(new LinearLayoutManager(1));
                sb30 sb30Var = jl11Var.a;
                if (sb30Var == null) {
                    u890.C("binding");
                    throw null;
                }
                sb30Var.a.setVisibility(8);
                sb30 sb30Var2 = jl11Var.a;
                if (sb30Var2 == null) {
                    u890.C("binding");
                    throw null;
                }
                frameLayout.addView(sb30Var2.a);
                frameLayout.addOnAttachStateChangeListener(new c9s(this, vi11Var, (byte) 4));
                return new yrg0(frameLayout, (byte) 7);
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object g(SlotEffect.FetchLayout fetchLayout, qkg qkgVar, ks21 ks21Var, onm onmVar) {
        kz10 kz10Var;
        ge91 m231Var;
        SlotEffect.FetchLayout fetchLayout2;
        ks21 ks21Var2;
        if (onmVar instanceof kz10) {
            kz10Var = (kz10) onmVar;
            int i = kz10Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kz10Var.e = i - Integer.MIN_VALUE;
            } else {
                kz10Var = new kz10(this, onmVar);
            }
        } else {
            kz10Var = new kz10(this, onmVar);
        }
        kz10 kz10Var2 = kz10Var;
        Object objA = kz10Var2.c;
        int i2 = kz10Var2.e;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                pb00 pb00Var = (pb00) this.c;
                boolean zIsRefresh = fetchLayout.isRefresh();
                String sessionId = fetchLayout.getSessionId();
                l24 l24Var = new l24(this, qkgVar, fetchLayout, (lnm) null, (byte) 7);
                kz10Var2.a = fetchLayout;
                kz10Var2.b = ks21Var;
                kz10Var2.e = 1;
                objA = pb00Var.a(qkgVar, zIsRefresh, sessionId, l24Var, kz10Var2);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
                fetchLayout2 = fetchLayout;
                ks21Var2 = ks21Var;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ks21 ks21Var3 = kz10Var2.b;
                SlotEffect.FetchLayout fetchLayout3 = kz10Var2.a;
                hm5.M(objA);
                ks21Var2 = ks21Var3;
                fetchLayout2 = fetchLayout3;
            }
            pe91 pe91Var = (pe91) objA;
            ArrayList arrayList = pe91Var.a;
            int iS = zno1.s(q7h.U(arrayList, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj : arrayList) {
                linkedHashMap.put(obj, ks21Var2.f((ef91) obj, fetchLayout2.isRefresh()));
            }
            m231Var = new ge91(pe91Var.a, linkedHashMap, pe91Var.b);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        return thA == null ? m231Var : new ie91(thA);
    }

    public mr20 getTitle() {
        return (evz) this.b;
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        il00 il00Var = (il00) this.b;
        sh20 sh20Var = (sh20) this.c;
        uh20 uh20Var = sh20Var.b;
        String str = uh20Var.a;
        s7r0 s7r0Var = q7r0Var.d;
        sp00 sp00Var = new sp00(il00Var, str, cto1.q(s7r0Var.c));
        b0d0 b0d0Var = sh20Var.g;
        String str2 = uh20Var.a;
        huz huzVar = new huz(w7x.a, (byte) 10);
        iac0 iac0Var = s7r0Var.c;
        ruz ruzVar = sh20Var.h;
        huz huzVar2 = new huz((Object) null, (byte) 10);
        EsPlayOrigin.PlayOrigin playOriginP = EsPlayOrigin.PlayOrigin.p();
        b7x b7xVar = b7x.a;
        k0d0 k0d0VarB = b0d0Var.b(str2, huzVar, iac0Var, ruzVar, huzVar2, playOriginP, new huz(b7xVar, (byte) 10), new huz(b7xVar, (byte) 10));
        gsl gslVar = sh20Var.a;
        d0r d0rVarC = cwl1.C(q7r0Var);
        qim0 qim0VarY = voo1.y(nim0.a, voo1.e);
        j2i j2iVar = new j2i(253914462, new xx00(sh20Var, k0d0VarB, sp00Var, (byte) 15), true);
        return gslVar.a.a(new uh0(gslVar, d0rVarC, qim0VarY, new qxl(), j2iVar, (byte) 16)).h(q7r0Var, bundle);
    }

    public void i() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((xok0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public Observable j(w8v0 w8v0Var) {
        int i;
        g620 i620Var;
        g620 g620Var;
        pos posVar = (pos) this.c;
        String str = posVar.a;
        o8z o8zVar = new o8z(w8v0Var.c.a ? 1 : 0);
        xfa1 xfa1Var = w8v0Var.b;
        if (xfa1Var.equals(xfa1.a)) {
            i = 1;
        } else if (xfa1Var.equals(xfa1.b)) {
            i = 2;
        } else {
            if (!xfa1Var.equals(xfa1.c)) {
                eg.o();
                return null;
            }
            i = 3;
        }
        p620 p620Var = w8v0Var.a;
        if (p620Var.equals(h620.b)) {
            g620Var = g620.d;
        } else if (p620Var.equals(h620.a)) {
            g620Var = g620.c;
        } else {
            if (!p620Var.equals(h620.c)) {
                if (p620Var.equals(h620.d)) {
                    g620Var = g620.h;
                } else {
                    if (!(p620Var instanceof j620)) {
                        eg.o();
                        return null;
                    }
                    i620Var = new i620(((j620) p620Var).a);
                }
                return ((n481) this.b).b(new b481(str, o8zVar, i, i620Var, posVar.b, Boolean.TRUE, Boolean.FALSE, 65056));
            }
            g620Var = g620.g;
        }
        i620Var = g620Var;
        return ((n481) this.b).b(new b481(str, o8zVar, i, i620Var, posVar.b, Boolean.TRUE, Boolean.FALSE, 65056));
    }

    public void k(ily0 ily0Var) {
        ((ssw0) this.c).l(new pyc(ily0Var));
    }

    public void l(ily0 ily0Var) {
        if (ily0Var.equals((ily0) this.b)) {
            return;
        }
        this.b = ily0Var;
        ((ssw0) this.c).l(new qyc(ily0Var));
    }

    public void m(ily0 ily0Var) {
        if (ily0Var.equals((ily0) this.b)) {
            this.b = null;
        }
        ((ssw0) this.c).l(new ryc(ily0Var));
    }

    public void n(p7s p7sVar, pr31 pr31Var) {
        ((ssw0) this.c).l(new tyc(pr31Var, p7sVar.d()));
    }

    public void o(p7s p7sVar, pr31 pr31Var) {
        ((ssw0) this.c).l(new uyc(pr31Var, p7sVar.d()));
    }

    public void p(p7s p7sVar, pr31 pr31Var) {
        ((ssw0) this.c).l(new vyc(pr31Var, p7sVar.d()));
    }

    public void q(p7s p7sVar, pr31 pr31Var, int i) {
        ((ssw0) this.c).l(new wyc(pr31Var, p7sVar.d(), i));
    }

    public void r(p7s p7sVar, pr31 pr31Var) {
        ((ssw0) this.c).l(new yyc(pr31Var, p7sVar.d()));
    }

    public void s(p7s p7sVar, pr31 pr31Var, pr31 pr31Var2, int i, int i2) {
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            throw null;
        }
        ((ssw0) this.c).l(new zyc(pr31Var, p7sVar.d(), i, pr31Var2, i2));
    }

    public void subscribe(SingleEmitter singleEmitter) {
        ac10 ac10Var = (ac10) this.c;
        ixg ixgVarF = ((gw70) ac10Var.b).f((String) this.b);
        ixgVarF.s((ufg1) ac10Var.c);
        ixgVarF.r("color_extraction");
        singleEmitter.setCancellable(new ter(ixgVarF, (byte) 1));
        ixgVarF.j(new zb10(singleEmitter, ac10Var));
    }

    public void t(p7s p7sVar, pr31 pr31Var, int i) {
        ((ssw0) this.c).l(new azc(pr31Var, p7sVar.d(), i));
    }

    public void u(kz20 kz20Var) {
        synchronized (this.b) {
            this.c = kz20.a(kz20Var, 0, 31);
        }
    }

    public void z() {
        bpb1 bpb1Var = (bpb1) this.b;
        nn30 nn30Var = (nn30) this.c;
        boolean z = nn30Var.s;
        bpb1Var.m((Object) null, Boolean.valueOf(z));
        hec hecVar = nn30Var.r;
        EncoreButton encoreButton = nn30Var.C;
        if (encoreButton == null) {
            u890.C("sceneButton");
            throw null;
        }
        sgc1.x(hecVar, encoreButton, ((zda) nn30Var).c, nn30Var.y, bpb1Var, new sg0(1, (lnm) null, (byte) 12));
        EncoreButton encoreButton2 = nn30Var.C;
        if (encoreButton2 == null) {
            u890.C("sceneButton");
            throw null;
        }
        encoreButton2.setVisibility(z ? 4 : 0);
        EncoreButton encoreButton3 = nn30Var.C;
        if (encoreButton3 == null) {
            u890.C("sceneButton");
            throw null;
        }
        encoreButton3.setAlpha(z ? 0.0f : 1.0f);
        View view = nn30Var.A;
        if (view == null) {
            u890.C("cardContainer");
            throw null;
        }
        View view2 = nn30Var.B;
        if (view2 == null) {
            u890.C("labelsContainer");
            throw null;
        }
        View view3 = nn30Var.D;
        if (view3 == null) {
            u890.C("termsAndConditionsView");
            throw null;
        }
        for (View view4 : p7h.M(new View[]{view, view2, view3})) {
            view4.setVisibility(0);
            view4.setAlpha(z ? 0.0f : 1.0f);
        }
    }

    public /* synthetic */ w2z(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public w2z(cdn0 cdn0Var) {
        this.a = (byte) 25;
        this.b = cdn0Var;
        this.c = new idd1(new f710(this, (byte) 13));
    }

    public w2z(String str, t881 t881Var, n481 n481Var) {
        this.a = (byte) 6;
        this.b = n481Var;
        this.c = new pos(str, t881Var);
    }

    public w2z(ConstraintLayout constraintLayout, TextView textView, ThreeDotsLoaderView threeDotsLoaderView) {
        this.a = (byte) 27;
        this.b = textView;
        this.c = threeDotsLoaderView;
    }

    public w2z(FrameLayout frameLayout, FrameLayout frameLayout2, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView) {
        this.a = (byte) 28;
        this.b = frameLayout;
        this.c = recyclerView;
    }

    public w2z(ssw0 ssw0Var) {
        this.a = (byte) 8;
        this.c = ssw0Var;
    }

    public /* synthetic */ w2z(byte b, Object obj, String str) {
        this.a = b;
        this.c = obj;
        this.b = str;
    }
}
