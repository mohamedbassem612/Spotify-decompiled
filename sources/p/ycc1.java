package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeDelayWithCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ycc1 implements t6b0, Function, ObservableOnSubscribe, l381 {
    public static final hc70 d = new hc70();
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ycc1(i8h1 i8h1Var, r03 r03Var, Map map) {
        this.a = (byte) 22;
        this.b = i8h1Var;
        jyr jyrVar = (m03) map.get(r03Var.a);
        this.c = jyrVar == null ? new jyr() : jyrVar;
    }

    public static final /* synthetic */ trd1 c(ycc1 ycc1Var) {
        return (trd1) ycc1Var.b;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 4:
                if (((th61) obj).b) {
                    knb1 knb1Var = (oob1) obj2;
                    if (knb1Var instanceof knb1) {
                        pq pqVar = (pq) obj3;
                        mlb1 mlb1Var = knb1Var.b;
                        Completable completableFlatMapCompletable = ((oq) pqVar.b.get()).b(mlb1Var).flatMapCompletable(new oj80(mlb1Var, pqVar, (byte) 6));
                        completableFlatMapCompletable.getClass();
                        return completableFlatMapCompletable.o(Functions.h);
                    }
                }
                return CompletableEmpty.a;
            case 6:
                return new MaybeDelayWithCompletable(Maybe.e(obj), new CompletableFromAction(new wf0((yf0) obj2, (ContextTrack) obj3, obj, (byte) 0)));
            case 13:
                f9w f9wVar = (f9w) obj2;
                return (t600) ((py21) obj).b(new d4(f9wVar, (zd1) obj3, (byte) 14), new j2(f9wVar, (byte) 27));
            case 20:
                return ((yl2) obj2).a((String) obj3, false).map(zp8.f).onErrorReturn(rbc.f);
            case 25:
                d93 d93Var = (d93) obj;
                gid gidVar = (gid) obj2;
                String str = (String) obj3;
                ArrayList arrayList = d93Var.b;
                Single singleJust = arrayList.isEmpty() ? Single.just(gb3.a) : ((sjj0) gidVar.b).a(arrayList).map(vrg.e).map((lfb) gidVar.c).map(bbn.e).map(new oj80(d93Var, str, (byte) 23));
                singleJust.getClass();
                return singleJust;
            case 26:
                uv00 uv00Var = (uv00) obj;
                String str2 = (String) obj2;
                ez00 ez00Var = uv00Var.a(gh3.class, str2).b;
                if (ez00Var != null) {
                    return ((xb3) obj3).h1(ez00Var);
                }
                swg0.h(l1d.t("Missing metadata for Uri: ", str2, ". Response cacheStatus: "), bb00.u(uv00Var.a(gh3.class, str2).c.b), ".");
                return null;
            case 28:
                ti3 ti3Var = (vi3) obj;
                ajq0 ajq0Var = (ajq0) obj2;
                slc0 slc0Var = (slc0) obj3;
                x5j1 x5j1Var = (x5j1) ajq0Var.e;
                if (ti3Var instanceof ti3) {
                    kr60 kr60Var = (kr60) ajq0Var.b;
                    Activity activity = (Activity) ajq0Var.d;
                    String string = UUID.randomUUID().toString();
                    return ((km3) kr60Var.b).T(activity, new wq8("4dddafab4d054c70a710e1605a76f639", 2, "https://alexa.amazon.com/partner-authorization/establish", (xig) null, string, p7h.M(new String[]{"playlist-read-private", "playlist-read-collaborative", "user-follow-read", "user-library-read", "user-read-private", "streaming"}), false, 3904), (String) null).map(new ljp1((byte) 1, kr60Var, string)).onErrorReturn(qbo1.d).flatMapMaybe(new g23(ti3Var, ajq0Var, slc0Var, (byte) 7));
                }
                if (ti3Var instanceof ui3) {
                    x5j1Var.g(slc0Var, 4, "rejected grant");
                    return new MaybeError(new Throwable("Alexa authorization failed"));
                }
                if (ti3Var instanceof ri3) {
                    x5j1Var.g(slc0Var, 6, ((ri3) ti3Var).b);
                    return new MaybeError(new Throwable("Alexa authorization failed"));
                }
                if (ti3Var instanceof si3) {
                    x5j1Var.g(slc0Var, 6, "invalid URI");
                    return new MaybeError(new Throwable("Alexa authorization failed"));
                }
                eg.o();
                return null;
            default:
                nk3 nk3Var = (nk3) obj;
                String str3 = (String) obj3;
                bl3 bl3Var = (bl3) obj2;
                vlo vloVar = bl3Var.c;
                q8n q8nVar = bl3Var.f;
                int iOrdinal = nk3Var.ordinal();
                if (iOrdinal == 0) {
                    return !vloVar.a(str3) ? bl3Var.h(nk3.a, cl3.b) : rqt0.F(q8nVar, new wt(bl3Var, str3, (lnm) null, (byte) 5));
                }
                if (iOrdinal == 1) {
                    return !vloVar.a(str3) ? bl3Var.h(nk3.b, cl3.c) : rqt0.F(q8nVar, new rk3(bl3Var, str3, (lnm) null, (byte) 1)).flatMap(new w4b1(bl3Var, (byte) 15)).onErrorResumeNext(new e4b1(bl3Var, (byte) 13));
                }
                if (iOrdinal == 2) {
                    return bl3Var.h(nk3Var, cl3.d);
                }
                if (iOrdinal == 3) {
                    return bl3Var.h(nk3Var, cl3.e);
                }
                if (iOrdinal != 4) {
                    return iOrdinal != 6 ? Single.just(gk3.a) : rqt0.F(q8nVar, new rk3(bl3Var, str3, (lnm) null, (byte) 0)).flatMap(new t7o0(bl3Var, (byte) 13)).onErrorResumeNext(new ymm0(bl3Var, (byte) 12));
                }
                return bl3Var.h(nk3Var, cl3.f);
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public w470 d(Context context, l670 l670Var) {
        return new jc70(context, l670Var, (sd70) this.c, (sw9) this.b);
    }

    public k2r e() {
        return (k2r) this.b;
    }

    public k2r f() {
        return (k2r) this.c;
    }

    public void g(xcc1 xcc1Var) {
        lzn0 lzn0Var = (lzn0) this.b;
        if (xcc1Var instanceof ucc1) {
            lzn0Var.f(new dwn0(((ucc1) xcc1Var).c, "", false, false, 0, 0, true, (a690) null, (Bundle) null, (cwn0) null));
            return;
        }
        if (xcc1Var.equals(vcc1.c)) {
            lzn0Var.e();
            return;
        }
        if (!(xcc1Var instanceof wcc1)) {
            eg.o();
            return;
        }
        kt91 kt91Var = (kt91) this.c;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962946});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", 2131962946, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public String h(jm5 jm5Var) {
        w7h1 w7h1Var;
        y6h1 y6h1Var = ((zok0) this.c).b;
        boolean z = jm5Var instanceof lu80;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("account_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            Integer numValueOf = Integer.valueOf(((lu80) jm5Var).d);
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("user_item", (String) null, numValueOf, (String) null, (String) null));
            x6h1VarC2.j = true;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("login", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        } else {
            if (!(jm5Var instanceof rt80)) {
                eg.o();
                return null;
            }
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("account_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            y6h1 y6h1VarA2 = x6h1VarC3.a();
            rt80 rt80Var = (rt80) jm5Var;
            Integer numValueOf2 = Integer.valueOf(rt80Var.e);
            x6h1 x6h1VarC4 = y6h1VarA2.c();
            x6h1VarC4.i.add(new a7h1("add_user_item", (String) null, numValueOf2, (String) null, (String) null));
            x6h1VarC4.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", rt80Var.d)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
        }
        return ((i8h1) this.b).m(w7h1Var, (xj61) null).a.a;
    }

    public r6b0 i(heg hegVar, ab11 ab11Var) {
        return ((p2o0) this.b).G(hegVar, ab11Var, (ArrayList) this.c);
    }

    public void j(x3p1 x3p1Var) {
        l7h1 l7h1VarE;
        zok0 zok0Var = (zok0) this.c;
        if (x3p1Var instanceof m480) {
            l7h1VarE = zok0Var.e();
        } else {
            if (!(x3p1Var instanceof o480)) {
                eg.o();
                return;
            }
            x6h1 x6h1VarC = zok0Var.b.c();
            x6h1VarC.i.add(new a7h1("account_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            Integer numValueOf = Integer.valueOf(((o480) x3p1Var).c);
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("user_item", (String) null, numValueOf, (String) null, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA2;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var.e = zok0Var.c;
            l7h1VarE = (l7h1) k7h1Var.a();
        }
        ((i8h1) this.b).f(l7h1VarE, (Set) null);
    }

    public lzh k(Intent intent, th61 th61Var) {
        Object next;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        blc0 blc0Var = s4b1VarX.c;
        Iterator it = ((Set) this.b).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((acr0) next).a().contains(blc0Var));
        acr0 acr0Var = (acr0) next;
        if (acr0Var == null) {
            hhg1.o(blc0Var, "No link type registered for: ");
            return null;
        }
        ebr0 ebr0Var = (ebr0) ((mly0) this.c).get(acr0Var.b());
        if (ebr0Var != null) {
            return new lzh(ebr0Var, acr0Var.c(intent, s4b1VarX, th61Var));
        }
        bhn0.B(acr0Var.b(), "No page provider found for page type: ");
        return null;
    }

    public void l(ki0 ki0Var, iu30 iu30Var) {
        if (ki0Var.g().length() == 0) {
            return;
        }
        int iC = l1d.C(o0p1.k(ki0Var.g()));
        if (iC == 0) {
            ((lzn0) this.b).h(ki0Var.g());
            return;
        }
        if (iC == 1) {
            ((xn0) this.c).a(new nr0(ki0Var.h(), ki0Var.a(), ki0Var.g()));
            iu30Var.invoke(ki0Var);
        } else if (iC == 2) {
            iu30Var.invoke(ki0Var);
        } else {
            eg.o();
        }
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        i33 i33Var;
        n9m0 n9m0Var = ((f33) this.b).a;
        q13 q13Var = (q13) this.c;
        boolean z = q13Var instanceof p13;
        i33 i33Var2 = j33.a;
        if (z) {
            p13 p13Var = (p13) q13Var;
            String str = p13Var.c;
            String str2 = p13Var.b;
            if (str2.length() <= 0 || str.length() <= 0) {
                hhg1.n("Session ID and Message ID must not be empty for RecreateSession");
                return;
            }
            i33Var = new i33(str2, str);
        } else {
            i33Var = i33Var2;
        }
        if (z) {
            p13 p13Var2 = (p13) q13Var;
            i33Var2 = new i33(p13Var2.b, p13Var2.c);
        }
        i33 i33Var3 = i33Var2;
        lik1 viewUri = q13Var.getViewUri();
        o13 o13Var = q13Var instanceof o13 ? (o13) q13Var : null;
        MobiusLoop mobiusLoopA = Mobius.d(new drm1((byte) 29), RxConnectables.a(n9m0Var.a.a)).b(new zud0(n9m0Var, (byte) 16)).d(new mre0(n9m0Var, (byte) 13)).f(new AndroidLogger()).a(new s33(viewUri, o13Var != null ? o13Var.b : null, (lqf1) null, q33.a, i33Var3), Collections.singleton(i33Var instanceof i33 ? new o23(i33Var.a) : l23.a));
        mobiusLoopA.b(new y11(observableEmitter, (byte) 1));
        observableEmitter.setCancellable(new e33(mobiusLoopA));
    }

    public boolean t(Object obj) {
        la3 la3Var = (la3) obj;
        qa3 qa3Var = (qa3) this.c;
        qxc0 qxc0Var = la3Var.a;
        if (qxc0Var.S0 > 0) {
            Map map = qxc0Var.O0;
            dlc0[] dlc0VarArr = (dlc0[]) qa3Var.f.toArray(new dlc0[0]);
            if (gyo1.G(map, (dlc0[]) Arrays.copyOf(dlc0VarArr, dlc0VarArr.length)) && !la3Var.b) {
                return true;
            }
        }
        return false;
    }

    public void a() {
    }

    public ycc1(i8h1 i8h1Var) {
        this.a = (byte) 3;
        this.b = i8h1Var;
        this.c = new zok0((byte) 0);
    }

    public /* synthetic */ ycc1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ycc1(trd1 trd1Var, q8n q8nVar) {
        this.a = (byte) 10;
        this.b = trd1Var;
        this.c = us71.h(q8nVar);
    }

    public ycc1(qa3 qa3Var) {
        this.a = (byte) 24;
        this.c = qa3Var;
        this.b = qa3Var.i;
    }
}
