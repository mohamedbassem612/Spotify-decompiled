package p;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.familyviewservice.v1.GetMemberDetailsRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListRepliesRequest;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hod0 implements qiw, Function, ete0, oi30, jrn0, k2i1, com.spotify.mobius.functions.Function, w710 {
    public final /* synthetic */ byte a;
    public final Object b;

    public hod0() {
        this.a = (byte) 17;
        this.b = new xok0((byte) 0);
    }

    public void a(String str, String str2) {
        ((wre0) this.b).a.a('V', "Spotify", wre0.g(str, str2), (Throwable) null);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0359  */
    public Object apply(Object obj) {
        int size;
        xrf0 wrf0Var;
        asf0 zrf0Var;
        int i;
        CompletableObserveOn completableObserveOnN;
        nam namVar;
        u7l t7lVar;
        doj0 doj0Var;
        String str;
        switch (this.a) {
            case 3:
                a4e0 a4e0Var = (a4e0) this.b;
                return rqt0.F(a4e0Var.d, new xtz((j8u) obj, a4e0Var, (lnm) null, (byte) 27));
            case 4:
                fnh fnhVar = (fnh) obj;
                tjh tjhVar = ((h1e0) this.b).b;
                String str2 = fnhVar.a;
                String str3 = fnhVar.b;
                ldi1 ldi1Var = (ldi1) tjhVar.c.b;
                u1d0 u1d0VarO = ListRepliesRequest.o();
                u1d0VarO.n(str2);
                if (str3 != null) {
                    u1d0VarO.q(str3);
                }
                return ldi1Var.h(u1d0VarO.build()).map(new m4e0(fnhVar, (byte) 0)).onErrorReturn(new ruc0(fnhVar, (byte) 6));
            case 7:
                vpf0 vpf0Var = ((jhf0) obj).a;
                if (!(vpf0Var instanceof vpf0) || !vpf0Var.a.a.g.a) {
                    return Observable.just(new sif0(false));
                }
                wlk1 wlk1Var = (wlk1) this.b;
                return Observable.combineLatest(yoi1.i(wlk1Var.c.a(o6n.a), o6x.a), new ObservableFromPublisher(wlk1Var.b.x(n9x0.W0).t(o9x0.V0)), new xq81(wlk1Var, (byte) 29)).map(ud20.Z);
            case 8:
                evf1 evf1Var = (evf1) obj;
                pqf0 pqf0Var = (pqf0) this.b;
                List list = pqf0Var.a;
                int i2 = pqf0Var.b;
                int i3 = evf1Var.a;
                if (i2 != 1) {
                    int i4 = 2;
                    if (list.isEmpty()) {
                        size = -1;
                    } else {
                        long j = i3;
                        long j2 = 100;
                        if (j < ((xlf0) list.get(0)).c - 100) {
                            size = -1;
                        } else {
                            size = list.size() - 1;
                            int i5 = 0;
                            while (i5 < size) {
                                int i6 = (i5 + size) / i4;
                                j2 = j2;
                                long j3 = ((xlf0) list.get(i6)).c - j2;
                                int i7 = i6 + 1;
                                long j4 = ((xlf0) list.get(i7)).c - j2;
                                if (j3 > j || j >= j4) {
                                    if (j < j3) {
                                        size = i6 - 1;
                                    } else {
                                        i5 = i7;
                                    }
                                    i4 = 2;
                                } else {
                                    size = i6;
                                }
                            }
                        }
                    }
                    int iC = l1d.C(i2);
                    if (iC != 0) {
                        if (iC == 1) {
                            wrf0Var = new wrf0(size);
                        } else if (iC == 2) {
                            xlf0 xlf0Var = (xlf0) o7h.t0(size, list);
                            if (xlf0Var == null || i3 == -1) {
                                i = 0;
                            } else {
                                i = 0;
                                for (cef0 cef0Var : xlf0Var.d) {
                                    if (cef0Var.a <= i3) {
                                        i += cef0Var.b;
                                    }
                                }
                            }
                            wrf0Var = new xrf0(size, i);
                        } else {
                            eg.o();
                        }
                        int i8 = evf1Var.b;
                        zrf0Var = new zrf0(wrf0Var, i8 == 2, i8 != 2);
                    } else {
                        bhn0.w();
                    }
                    return null;
                }
                zrf0Var = asf0.a;
                return new uqf0(zrf0Var);
            case 10:
                ob0 ob0Var = (tb0) obj;
                gfr gfrVar = (gfr) this.b;
                if (ob0Var instanceof ob0) {
                    CompletableFromAction completableFromAction = new CompletableFromAction(new tt60(gfrVar, ob0Var, (byte) 3));
                    hce1 hce1Var = (hce1) gfrVar.b;
                    return completableFromAction.c(((Single) ((na) hce1Var.c).invoke()).flatMapCompletable(new bih1(ob0Var.a, hce1Var, (byte) 4)));
                }
                if (ob0Var.equals(pb0.a) || ob0Var.equals(qb0.a) || (ob0Var instanceof sb0)) {
                    return CompletableEmpty.a;
                }
                eg.o();
                return null;
            case 14:
                gj10 gj10Var = (gj10) this.b;
                String str4 = ((jki0) obj).b;
                jo40 jo40VarO = GetMemberDetailsRequest.o();
                jo40VarO.n(str4);
                GetMemberDetailsRequest getMemberDetailsRequestBuild = jo40VarO.build();
                hj10 hj10Var = gj10Var.a;
                getMemberDetailsRequestBuild.getClass();
                return hj10Var.g(getMemberDetailsRequestBuild).map(new v9c(gj10Var, (byte) 10)).map(qs10.P0).onErrorReturn(ws10.P0);
            case 16:
                spj0 spj0Var = (spj0) this.b;
                return spj0Var.h.debounce(200L, TimeUnit.MILLISECONDS, spj0Var.d).take(1L);
            case 19:
                x9m0 x9m0Var = (x9m0) obj;
                sam0 sam0Var = (sam0) this.b;
                yue0 yue0Var = sam0Var.e;
                String str5 = sam0Var.a;
                synchronized (yue0Var.a) {
                    yue0Var.a.remove(str5);
                    Set setP1 = o7h.p1(yue0Var.a);
                    setP1.toString();
                    yue0Var.b.onNext(setP1);
                }
                x9m0Var.e.onNext(kn41.a);
                sam0 sam0Var2 = (sam0) this.b;
                xbm xbmVar = x9m0Var.f;
                xbmVar.L().f = xbmVar.i();
                pam0 pam0Var = new pam0(sam0Var2, xbmVar, (byte) 1);
                System.nanoTime();
                pam0Var.invoke();
                jam0 jam0Var = jam0.a;
                System.nanoTime();
                return jam0Var;
            case 22:
                q1o0 q1o0Var = (q1o0) this.b;
                return Integer.valueOf(q1o0Var.a.b(q1o0Var.e, (String) obj).l(bma1.b.n("key_bt_permissions_flow_started_count_v2"), 0));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                n2o0 n2o0Var = (n2o0) obj;
                if (n2o0Var == n2o0.b) {
                    d3o0 d3o0Var = (d3o0) ((p2o0) this.b).c;
                    completableObserveOnN = d3o0Var.b().flatMapCompletable(new swm0(d3o0Var, (byte) 5)).n(d3o0Var.d);
                } else {
                    completableObserveOnN = CompletableEmpty.a;
                }
                return completableObserveOnN.d(Observable.just(n2o0Var));
            case 26:
                t1p0 t1p0Var = (t1p0) obj;
                t1p0Var.getClass();
                float f = ((o0p0) this.b).k0().getConfiguration().fontScale;
                doj0 doj0Var2 = doj0.b;
                doj0 doj0Var3 = doj0.a;
                nam namVar2 = pam.a;
                d7l d7lVar = t1p0Var.c;
                cam camVar = t1p0Var.b;
                hbu0 hbu0Var = t1p0Var.a;
                if (hbu0Var instanceof gbu0) {
                    return d2p0.a;
                }
                if (hbu0Var instanceof hbu0) {
                    if (u890.j(camVar, z9m.a)) {
                        namVar = namVar2;
                    } else if (u890.j(camVar, u9m.a)) {
                        namVar = oam.a;
                    } else if (camVar instanceof t9m) {
                        t9m t9mVar = (t9m) camVar;
                        namVar = new nam(t9mVar.a, t9mVar.b);
                    } else {
                        eg.o();
                    }
                    if (d7lVar instanceof a7l) {
                        t7lVar = s7l.a;
                    } else if (d7lVar instanceof y6l) {
                        t7lVar = new r7l(((y6l) d7lVar).a);
                    } else if (d7lVar instanceof x6l) {
                        t7lVar = q7l.a;
                    } else if (d7lVar instanceof w6l) {
                        t7lVar = new t7l(((w6l) d7lVar).a);
                    } else {
                        eg.o();
                    }
                    boolean z = (namVar instanceof pam) && (!(d7lVar instanceof w6l) || ((w6l) d7lVar).b);
                    boolean z2 = t1p0Var.d && z;
                    if (f > 1.8f) {
                        doj0Var = doj0Var3;
                    } else if ((t1p0Var.e && z) || (t7lVar instanceof s7l) || (t7lVar instanceof r7l)) {
                        doj0Var = doj0Var2;
                    } else {
                        if (!(t7lVar instanceof q7l) && !(t7lVar instanceof t7l)) {
                            eg.o();
                        }
                        doj0Var = doj0Var3;
                    }
                    hbu0 hbu0Var2 = hbu0Var;
                    gjf1 gjf1Var = hbu0Var2.a;
                    String str6 = gjf1Var.b;
                    String str7 = gjf1Var.e;
                    String str8 = (namVar.equals(namVar2) || (str = gjf1Var.f) == null) ? "#ff282828" : str;
                    j5u0 j5u0Var = hbu0Var2.b;
                    return new e2p0(str6, str7, z2, doj0Var, str8, namVar, t7lVar, new xfx0(j5u0Var.d, j5u0Var.c, j5u0Var.b), new s1p0(str6, camVar, d7lVar, gjf1Var.k), z, t1p0Var.f);
                }
                eg.o();
                return null;
            case 27:
                mmr0 mmr0Var = (mmr0) obj;
                String str9 = (String) mmr0Var.a;
                Long l = (Long) mmr0Var.b;
                bxh bxhVar = (uwh) this.b;
                return new MaybeSwitchIfEmpty(cwl1.e0(bxhVar.d, new zi3(bxhVar, str9, (int) l.longValue(), (lnm) null, (byte) 4)).f(eh10.S0), Maybe.e(Boolean.FALSE)).m();
            default:
                LinkedHashSet<String> linkedHashSet = ((oj91) obj).a;
                fip0 fip0Var = (fip0) this.b;
                ArrayList arrayList = new ArrayList(q7h.U(linkedHashSet, 10));
                for (String str10 : linkedHashSet) {
                    arrayList.add((Observable) ((ConcurrentHashMap) fip0Var.h).computeIfAbsent(str10, new bdd0(fip0Var, str10, (byte) 1)));
                }
                return Observable.combineLatest(arrayList, bk20.R0).map(b610.S0);
        }
    }

    public void b(Uri uri) {
        ((e4b1) this.b).g();
    }

    public boolean c(Map map) {
        if (((um4) this.b).b()) {
            return Boolean.parseBoolean((String) map.get("is_video_first")) || map.containsKey("session_control_display.displayName.video_first");
        }
        return false;
    }

    public ComponentName d() {
        return (ComponentName) this.b;
    }

    public String e() {
        return ((ComponentName) this.b).getPackageName();
    }

    public rqw f(u710 u710Var) {
        return n3o1.q(u710Var).a(new x3o0(this, (byte) 6), n3o0.b1);
    }

    public boolean g(ContextTrack contextTrack) {
        boolean z = contextTrack.metadata().get("live.deeplink_url") != null;
        String str = (String) contextTrack.metadata().get("context_uri");
        if (str == null) {
            str = "";
        }
        return j(str, z);
    }

    public boolean h(PlayerState playerState) {
        if (playerState.track().c()) {
            String strUri = ((ContextTrack) playerState.track().b()).uri();
            w6b1 w6b1VarA = f7b1.a(blc0.ea);
            if (w6b1VarA != null ? new kik1(w6b1VarA.d).a(strUri) : false) {
                return true;
            }
        }
        return false;
    }

    public void i(String str, String str2, Throwable th) {
        ((wre0) this.b).a.a('V', "Spotify", wre0.g(str, str2), th);
    }

    public boolean j(String str, boolean z) {
        if (z) {
            w6b1 w6b1VarA = f7b1.a(blc0.ea);
            if (w6b1VarA != null ? new kik1(w6b1VarA.d).a(str) : false) {
                return true;
            }
        }
        if (((Boolean) ((x5u) this.b).invoke()).booleanValue()) {
            jxu0 jxu0VarC = oxu0.a.c(str);
            jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
            if (u890.j(jxu0Var != null ? jxu0Var.a : null, "listening-party")) {
                return true;
            }
        }
        return false;
    }

    public m6e0 k() {
        return bbp1.g(((c881) this.b).a.a().map(ybx0.Y));
    }

    public irn0 l(Intent intent, th61 th61Var) {
        nw3 nw3Var = (nw3) this.b;
        Set set = s4b1.f;
        String strJ = uic.x(intent.getDataString()).j();
        if (strJ == null) {
            strJ = "";
        }
        return nw3Var.b(strJ);
    }

    public ill0 m() {
        return new ill0((r6h1) this.b);
    }

    public void q(Bundle bundle, String str) {
        wp20 wp20Var = (wp20) this.b;
        i8h1 i8h1Var = (i8h1) wp20Var.d;
        awf awfVar = (awf) jhc1.t(bundle, "RESULT_KEY", awf.class);
        if (awfVar == null) {
            return;
        }
        UUID uuidB = ((pf61) wp20Var.e).b();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-checkout-dialogs";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = uuidB.toString();
        x6h1 x6h1VarC = x6h1VarI.a().c();
        x6h1VarC.i.add(new a7h1("logout_unavailable_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        if (u890.j(awfVar.a(), "LOGOUT_DIALOG_TAG")) {
            Logger.g("Got action " + awfVar, new Object[0]);
            boolean z = awfVar instanceof yvf;
            b7x b7xVar = b7x.a;
            if (z) {
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("close_web_view_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((fyf) wp20Var.c).g();
                return;
            }
            if (awfVar instanceof zvf) {
                x6h1 x6h1VarC3 = y6h1VarA.c();
                x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 13:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public void v(Object obj) {
        u7l u7lVar = (u7l) obj;
        kqd0 kqd0Var = (kqd0) this.b;
        boolean z = (u7lVar instanceof q7l) || (u7lVar instanceof t7l);
        kqd0Var.t.setVisibility(z ? 4 : 0);
        dtw dtwVar = kqd0Var.N0;
        if (dtwVar != null) {
            dtwVar.w.setVisibility(z ? 0 : 8);
        } else {
            u890.C("connectLabelVH");
            throw null;
        }
    }

    public /* synthetic */ hod0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public hod0(c9c c9cVar, x5u x5uVar) {
        this.a = (byte) 11;
        this.b = x5uVar;
    }
}
