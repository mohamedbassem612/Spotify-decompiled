package p;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.res.Resources;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Handler;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.socialrecs.v1.GetSessionRecsForUserResponse;
import com.spotify.socialrecs.v1.Member;
import com.spotify.socialrecs.v1.Track;
import com.spotify.thestage.vtec.datasource.EmptyHTTPErrorBodyException;
import com.spotify.thestage.vtec.datasource.TheStageRestrictedException;
import com.spotify.thestage.vtec.datasource.TheStageRestrictedGenericException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n381 implements m381, Function, ObservableOnSubscribe, lqw, BiFunction {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public n381(i8h1 i8h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 14:
                this.b = i8h1Var;
                r6h1 r6h1Var = r6h1.c;
                this.c = new rrk0((byte) 14);
                break;
            case 19:
                this.b = i8h1Var;
                r6h1 r6h1Var2 = r6h1.c;
                this.c = new yok0((byte) 0);
                break;
            case 23:
                this.b = i8h1Var;
                this.c = new pdl0((byte) 14);
                break;
            default:
                this.b = i8h1Var;
                this.c = new ezl0();
                break;
        }
    }

    public static final Object a(n381 n381Var, vse0 vse0Var) {
        Object objC = ((zkv) n381Var.b).c(p7h.M(new alv[]{alv.c, alv.b}), vse0Var);
        return objC == d9n.a ? objC : rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.thestage.vtec.datasource.EmptyHTTPErrorBodyException */
    public Object apply(Object obj) throws EmptyHTTPErrorBodyException {
        uz21 uz21Var;
        String strF;
        Completable completableA;
        ou80 ou80Var;
        int i;
        g gVarC;
        ArrayList arrayList;
        h290<Member> h290VarN;
        u310 u310Var;
        byte b = this.a;
        String str = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                rmy rmyVar = (rmy) obj;
                return rmyVar.d == 3 ? ((t781) obj3).c.g((String) obj2).onErrorReturn(wbx0.Y).map(new ks21(rmyVar, (byte) 18)) : Single.just(rmyVar);
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    return ((mz01) obj3).b;
                }
                ((q7j0) ((yon) obj2).d).a();
                return "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ";
            case 8:
                return ((bkf1) obj3).j((i) obj2, (List) obj);
            case 9:
                List list = (List) obj;
                fv81 fv81Var = (fv81) obj3;
                q3t0 q3t0Var = (q3t0) obj2;
                String strF2 = f4i1.f(fv81Var.j.a, "/", q3t0Var.a);
                long j = q3t0Var.c;
                String str2 = q3t0Var.a;
                String str3 = q3t0Var.b;
                return Collections.singletonMap(strF2, new hv81(new el51(str2, str3), new ivd(list, !list.isEmpty(), new el51(str2, str3), w7x.a, fv81Var.f), j));
            case 11:
                HttpException httpException = (Throwable) obj;
                g291 g291Var = (g291) obj3;
                String str4 = (String) obj2;
                my30 my30Var = g291Var.b;
                if (!(httpException instanceof HttpException) || httpException.a != 403) {
                    String message = httpException.getMessage();
                    my30Var.a(new l2l1(null, 1, Collections.singletonMap("error", "No site found for site lookup token: " + str4 + ". Server error: " + (message != null ? message : "UNKNOWN")), "resolvingSiteFailed"));
                    return Single.error(new NoSuchElementException());
                }
                try {
                    sy21 sy21Var = httpException.c;
                    if (sy21Var == null || (uz21Var = sy21Var.c) == null || (strF = uz21Var.f()) == null) {
                        throw new EmptyHTTPErrorBodyException("HTTP response body cannot be null");
                    }
                    j291 j291Var = (j291) g291Var.c.a(strF, j291.Companion.serializer());
                    String str5 = j291Var.a;
                    if (str5 == null) {
                        str5 = "UNKNOWN";
                    }
                    my30Var.a(new l2l1(null, 1, Collections.singletonMap("error", "No site found for site lookup token: " + str4 + ". Server error: " + str5), "resolvingSiteFailed"));
                    Single singleError = Single.error(new TheStageRestrictedException(j291Var.a));
                    singleError.getClass();
                    return singleError;
                } catch (Exception e) {
                    String message2 = e.getMessage();
                    my30Var.a(new l2l1(null, 1, Collections.singletonMap("error", "No site found for site lookup token: " + str4 + ". Server error: " + (message2 != null ? message2 : "UNKNOWN")), "resolvingSiteFailed"));
                    Single singleError2 = Single.error(new TheStageRestrictedGenericException(e.getMessage()));
                    singleError2.getClass();
                    return singleError2;
                }
            case 12:
                t380 t380Var = (t380) obj;
                n691 n691Var = (n691) obj3;
                t380Var.getClass();
                tv80 tv80Var = (tv80) obj2;
                if (t380Var.isEmpty()) {
                    w9u0 w9u0Var = n691Var.b;
                    if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                        str = ou80Var.a;
                    }
                    completableA = w9u0Var.a(new m9u0(SkipToNextTrackCommand.builder().loggingParams(LoggingParams.builder().interactionId(str).build()).build())).ignoreElement();
                } else {
                    completableA = t380Var.contains("mft_disallow") ? n691Var.c.a(tv80Var) : CompletableEmpty.a;
                }
                completableA.getClass();
                return completableA;
            case 17:
                dbv dbvVar = (dbv) obj2;
                PlayerState playerState = (PlayerState) obj3;
                if (!((Boolean) obj).booleanValue()) {
                    return MaybeEmpty.a;
                }
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                if (contextTrack == null) {
                    return MaybeEmpty.a;
                }
                if (!ydh.b(ln91.a(contextTrack))) {
                    return MaybeEmpty.a;
                }
                Resources resources = dbvVar.b;
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(playerState.contextUri());
                v5b1 v5b1Var = s4b1VarX.d;
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                    i = 2131959218;
                } else {
                    int iOrdinal = s4b1VarX.c.ordinal();
                    i = iOrdinal != 30 ? iOrdinal != 44 ? 2131959217 : 2131959216 : 2131959215;
                }
                return Maybe.e(rno1.m(new d1p0((Integer) null, resources.getString(i)), (CompletableFromAction) null, 14));
            case 21:
                return rca.n((rca) ((n381) obj3).b, (String) obj, (fq21) null, 2, (Object) null).map(m9x0.P0).timeout(10000L, TimeUnit.MILLISECONDS, (Scheduler) obj2, Single.error(new TimeoutException())).doOnError(new z0u0((byte) 19, new Object[0], "currentSession failed"));
            case 22:
                return rqt0.F(w0h1.h((Scheduler) obj3), new b751((p5a0) obj2, str, (byte) 28)).map(u9x0.O0).onErrorReturn(vbx0.P0);
            case 24:
                List<yh90> list2 = (List) obj;
                List tracksList = ((GetSessionRecsForUserResponse) obj2).getTracksList();
                lfb lfbVar = (lfb) ((sp01) obj3).f;
                List list3 = tracksList;
                int iS = zno1.s(q7h.U(list3, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj4 : list3) {
                    linkedHashMap.put(((Track) obj4).getUri(), obj4);
                }
                ArrayList arrayList2 = new ArrayList();
                for (yh90 yh90Var : list2) {
                    if (yh90Var instanceof yh90) {
                        Track track = (Track) linkedHashMap.get(yh90Var.a);
                        g gVarC2 = lfbVar.c(yh90Var);
                        g gVar = gVarC2 instanceof g ? gVarC2 : null;
                        if (gVar != null) {
                            if (track == null || (h290VarN = track.n()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(q7h.U(h290VarN, 10));
                                for (Member member : h290VarN) {
                                    arrayList.add(new h(member.getUsername(), member.getDisplayName(), member.n()));
                                }
                            }
                            gVarC = g.j(gVar, false, arrayList, false, 3071);
                        } else {
                            gVarC = null;
                        }
                    } else {
                        gVarC = lfbVar.c(yh90Var);
                    }
                    if (gVarC != null) {
                        arrayList2.add(gVarC);
                    }
                }
                return arrayList2;
            case 25:
                e6a1 e6a1Var = ((g6a1) obj3).a;
                return new f6a1((InputStream) obj, e6a1Var.a, e6a1Var.b, ((BluetoothDevice) obj2).getName());
            case 28:
                return Boolean.valueOf(((dma1) obj3).h((bma1) obj2, false));
            default:
                nmr0 nmr0Var = (nmr0) obj;
                l9o0 l9o0Var = (l9o0) obj3;
                String str6 = ((r9c) obj2).b;
                Object obj5 = nmr0Var.a;
                if (obj5 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                List<y9b1> list4 = (List) obj5;
                Object obj6 = nmr0Var.b;
                if (obj6 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                String str7 = (String) obj6;
                ArrayList arrayList3 = new ArrayList(list4.size());
                for (y9b1 y9b1Var : list4) {
                    if (y9b1Var instanceof y9b1) {
                        y9b1 y9b1Var2 = y9b1Var;
                        String str8 = y9b1Var2.a;
                        if (str8 == null) {
                            u310Var = null;
                        } else {
                            Context context = l9o0Var.b;
                            String string = Uri.parse(str6 + ":" + str8).toString();
                            Uri uri = Uri.EMPTY;
                            String str9 = y9b1Var2.b;
                            if (str9 == null) {
                                str9 = "";
                            }
                            u310Var = new u310(string, (String) null, str9, (String) null, kno1.q(context, 2131233204), (Uri) null, uri, uri, uri, (Uri) null, (Uri) null, 2, false, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                        }
                        if (u310Var != null) {
                            arrayList3.add(u310Var);
                        }
                    }
                    if (y9b1Var instanceof r2k) {
                        fvt0 fvt0Var = ((r2k) y9b1Var).d;
                        u310 u310VarA = fvt0Var == null ? null : ((myy) l9o0Var.f).a(fvt0Var, str7);
                        if (u310VarA != null) {
                            arrayList3.add(u310VarA);
                        }
                    }
                }
                return new z310(arrayList3, (f410) null, (m510) null, (String) null);
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public mxr c(Activity activity) {
        l8q l8qVar = (l8q) this.b;
        Scheduler scheduler = (Scheduler) this.c;
        daq daqVar = l8qVar.a.a;
        h991 h991Var = (h991) daqVar.Mg.get();
        zor zorVar = (zor) daqVar.V6.get();
        g0l g0lVar = (g0l) daqVar.E5.get();
        i8h1 i8h1Var = (i8h1) daqVar.A5.get();
        c8o.l(g0lVar);
        c8o.l(h991Var);
        iir iirVar = new iir(g0lVar, h991Var);
        c8o.l(i8h1Var);
        l6s l6sVar = new l6s();
        l6sVar.a = g0lVar;
        l6sVar.b = i8h1Var;
        l6sVar.c = new e0m0("", r6h1.c);
        h9n h9nVar = new h9n(new hur(activity, l6sVar, (byte) 17), (byte) 16);
        c8o.l(zorVar);
        zfr zfrVar = new zfr((Object) zorVar, (Object) h991Var, (byte) 22);
        c8o.l(scheduler);
        return new mxr(iirVar, h9nVar, zfrVar, scheduler);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    public void d(Object obj) {
        h141 h141Var = (h141) this.b;
        th91 th91Var = (th91) h141Var.getState();
        ArrayList arrayListJ = tx9.j(th91Var);
        ArrayList arrayList = ((sh91) obj).a;
        ArrayList arrayListX = tx9.x(arrayList, arrayListJ);
        int i = th91Var.c + (arrayListX.size() > arrayListJ.size() ? 1 : 0);
        List list = th91Var.e;
        if (list == null) {
            list = null;
        } else {
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((oh91) it.next()).a);
            }
            Set setP1 = o7h.p1(arrayList2);
            if (arrayListX.isEmpty()) {
                list = null;
            } else {
                c380 c380Var = th91Var.a;
                ArrayList arrayList3 = new ArrayList(q7h.U(c380Var, 10));
                Iterator it2 = c380Var.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((oh91) it2.next()).a);
                }
                if (!o7h.p1(arrayList3).equals(setP1) || o7h.p1(list).equals(o7h.p1(arrayListX))) {
                    list = null;
                }
            }
        }
        h141Var.e(tx9.k(arrayList, arrayListX, i, false, list));
    }

    public Single e(String str) {
        return rca.f((rca) this.b, str, (fq21) null, 2, (Object) null);
    }

    public Completable f(String str) {
        return rca.J((rca) this.b, str, (fq21) null, 2, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, onm onmVar) {
        afa1 afa1Var;
        if (onmVar instanceof afa1) {
            afa1Var = (afa1) onmVar;
            int i = afa1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                afa1Var.c = i - Integer.MIN_VALUE;
            } else {
                afa1Var = new afa1(this, onmVar);
            }
        } else {
            afa1Var = new afa1(this, onmVar);
        }
        Object objA = afa1Var.a;
        int i2 = afa1Var.c;
        Comparable comparable = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            zea1 zea1Var = (zea1) this.b;
            afa1Var.c = 1;
            objA = zea1Var.a(str, afa1Var);
            if (objA != comparable) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objA);
                return objA;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objA);
        afa1Var.c = 2;
        Comparable comparableO = o((sy21) objA, afa1Var);
        return comparableO == comparable ? comparable : comparableO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, String str2, onm onmVar) {
        bfa1 bfa1Var;
        if (onmVar instanceof bfa1) {
            bfa1Var = (bfa1) onmVar;
            int i = bfa1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfa1Var.c = i - Integer.MIN_VALUE;
            } else {
                bfa1Var = new bfa1(this, onmVar);
            }
        } else {
            bfa1Var = new bfa1(this, onmVar);
        }
        Object objB = bfa1Var.a;
        int i2 = bfa1Var.c;
        Comparable comparable = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            String strX0 = ihc1.X0(str2, ":");
            zea1 zea1Var = (zea1) this.b;
            bfa1Var.c = 1;
            objB = zea1Var.b(str, strX0, bfa1Var);
            if (objB != comparable) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objB);
                return objB;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        bfa1Var.c = 2;
        Comparable comparableO = o((sy21) objB, bfa1Var);
        return comparableO == comparable ? comparable : comparableO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, onm onmVar) {
        cfa1 cfa1Var;
        if (onmVar instanceof cfa1) {
            cfa1Var = (cfa1) onmVar;
            int i = cfa1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfa1Var.c = i - Integer.MIN_VALUE;
            } else {
                cfa1Var = new cfa1(this, onmVar);
            }
        } else {
            cfa1Var = new cfa1(this, onmVar);
        }
        Object objC = cfa1Var.a;
        int i2 = cfa1Var.c;
        Comparable comparable = d9n.a;
        if (i2 == 0) {
            hm5.M(objC);
            zea1 zea1Var = (zea1) this.b;
            cfa1Var.c = 1;
            objC = zea1Var.c(str, cfa1Var);
            if (objC != comparable) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objC);
                return objC;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objC);
        cfa1Var.c = 2;
        Comparable comparableO = o((sy21) objC, cfa1Var);
        return comparableO == comparable ? comparable : comparableO;
    }

    public tv80 j() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((rrk0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("set_timer_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void k(Object obj, tqw tqwVar) {
        ArrayList arrayListJ0;
        ph91 ph91Var = (rh91) obj;
        h141 h141Var = (h141) this.b;
        th91 th91Var = (th91) h141Var.getState();
        List listJ = th91Var.e;
        if (listJ == null) {
            listJ = tx9.j(th91Var);
        }
        c380 c380Var = th91Var.a;
        if (ph91Var instanceof ph91) {
            if (c380Var == null || !c380Var.isEmpty()) {
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    String str = ((oh91) it.next()).a;
                    String str2 = ph91Var.a;
                    if (u890.j(str, str2)) {
                        arrayListJ0 = listJ.contains(str2) ? o7h.J0(listJ, str2) : o7h.O0(str2, listJ);
                    }
                }
                return;
            }
            return;
        }
        if (!ph91Var.equals(qh91.a)) {
            eg.o();
            return;
        }
        arrayListJ0 = z6x.a;
        ArrayList arrayList = arrayListJ0;
        if (arrayList.equals(listJ)) {
            return;
        }
        h141Var.e(new th91(c380Var, th91Var.b, th91Var.c, th91Var.d, arrayList));
        ((iu30) this.c).invoke(new i151(arrayList, tqwVar != null ? n3o1.y(tqwVar) : null));
    }

    public void l() {
        ((i8h1) this.b).f(((rrk0) this.c).e(), (Set) null);
    }

    public void m() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((yok0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("account_switch_snackbar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = r6h1.c;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public void n(String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        v4m0 v4m0Var = (v4m0) this.c;
        x6h1 x6h1VarC = v4m0Var.b.c();
        x6h1VarC.i.add(new a7h1("sort_filter_sheet", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("sort_option", str, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), y6h1VarA, v4m0Var.a, System.currentTimeMillis()), (xj61) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Comparable o(sy21 sy21Var, onm onmVar) {
        dfa1 dfa1Var;
        if (onmVar instanceof dfa1) {
            dfa1Var = (dfa1) onmVar;
            int i = dfa1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dfa1Var.c = i - Integer.MIN_VALUE;
            } else {
                dfa1Var = new dfa1(this, onmVar);
            }
        } else {
            dfa1Var = new dfa1(this, onmVar);
        }
        Object objH = dfa1Var.a;
        int i2 = dfa1Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            if (!sy21Var.a.Q0) {
                eg.m("Could not fetch the image");
                return null;
            }
            xmu0 xmu0Var = (xmu0) this.c;
            Object obj = sy21Var.b;
            obj.getClass();
            InputStream inputStreamA = ((uz21) obj).a();
            dfa1Var.c = 1;
            objH = xmu0Var.h(inputStreamA, dfa1Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        Uri uri = (Uri) objH;
        if (uri != null) {
            return uri;
        }
        eg.m("Could not save the image");
        return null;
    }

    public void p() {
        ((SoundPool) ((zkv) this.b).c.getValue()).release();
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        return ((Boolean) ((iu30) this.c).invoke(vhc1Var)).booleanValue();
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                x981 x981Var = (x981) obj2;
                ((Handler) x981Var.d).post(new sl21((f301) obj, x981Var, observableEmitter, (byte) 5));
                break;
            default:
                x981 x981Var2 = (x981) obj2;
                ((Handler) x981Var2.d).post(new sl21(x981Var2, (pnh) obj, observableEmitter, (byte) 8));
                break;
        }
    }

    public void dispose() {
    }

    public n381(il91 il91Var, rig rigVar, String str) {
        this.a = (byte) 16;
        this.b = rigVar;
        this.c = str;
    }

    public /* synthetic */ n381(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public n381(String str, n6r0 n6r0Var, r6h1 r6h1Var, i8h1 i8h1Var) {
        this.a = (byte) 27;
        this.b = i8h1Var;
        this.c = new v4m0(n6r0Var.path(), str, r6h1Var);
    }

    public n381(lik1 lik1Var, n6r0 n6r0Var, i8h1 i8h1Var) {
        this.a = (byte) 18;
        this.b = i8h1Var;
        this.c = new f0m0(n6r0Var.path(), lik1Var.a, r6h1.c);
    }

    public n381(iu30 iu30Var) {
        this.a = (byte) 0;
        this.c = iu30Var;
        this.b = new o3r(z6x.a, rz71.X, false);
    }

    public Object apply(Object obj, Object obj2) {
        Set setB0;
        int i;
        if81 if81VarN;
        kl91 kl91Var = (kl91) obj;
        List list = (List) obj2;
        int i2 = ((rig) this.b).b;
        String str = (String) this.c;
        rtw0 rtw0Var = rtw0.g;
        Map map = kl91Var.n;
        Map map2 = kl91Var.m;
        Map map3 = kl91Var.e;
        ubm ubmVar = (ubm) map3.get(str);
        if81 if81Var = if81.d;
        if81 if81VarH0 = ubmVar != null ? rtw0Var.h0(kl91Var, ubmVar) : if81Var;
        ubm ubmVar2 = (ubm) map3.get(str);
        if81 if81VarI0 = ubmVar2 != null ? rtw0Var.i0(kl91Var, ubmVar2) : if81Var;
        Integer numValueOf = Integer.valueOf(i2);
        ubm ubmVar3 = (ubm) map3.get(str);
        if (ubmVar3 != null && (if81VarN = rtw0Var.N(kl91Var, ubmVar3, numValueOf)) != null) {
            if81Var = if81VarN;
        }
        ybd1 ybd1Var = (ybd1) map2.get(str);
        if81 if81Var2 = ybd1Var != null ? ybd1Var.a : null;
        ybd1 ybd1Var2 = (ybd1) map2.get(str);
        if81 if81Var3 = ybd1Var2 != null ? ybd1Var2.b : null;
        ybd1 ybd1Var3 = (ybd1) map2.get(str);
        int i3 = ybd1Var3 != null ? ybd1Var3.c : 0;
        ybd1 ybd1Var4 = (ybd1) map.get(str);
        if81 if81Var4 = ybd1Var4 != null ? ybd1Var4.a : null;
        ybd1 ybd1Var5 = (ybd1) map.get(str);
        if81 if81Var5 = ybd1Var5 != null ? ybd1Var5.b : null;
        ybd1 ybd1Var6 = (ybd1) map.get(str);
        int i4 = ybd1Var6 != null ? ybd1Var6.c : 0;
        ubm ubmVar4 = (ubm) map3.get(str);
        if (ubmVar4 != null) {
            Set setB = ubmVar4.e().b();
            if81 if81Var6 = if81.a;
            if (!setB.contains(if81Var6)) {
                if81Var6 = null;
            }
            Set setB2 = ubmVar4.e().b();
            if81 if81Var7 = if81.b;
            if (!setB2.contains(if81Var7)) {
                if81Var7 = null;
            }
            setB0 = dm61.B0(new if81[]{if81Var6, if81Var7, rtw0Var.J(kl91Var, ubmVar4) ? if81.c : null});
        } else {
            setB0 = w7x.a;
        }
        boolean zE = rtw0.E(kl91Var, Integer.valueOf(i2));
        ubm ubmVar5 = (ubm) map3.get(str);
        if (ubmVar5 == null) {
            i = 4;
        } else if (ubmVar5.e.c) {
            i = rtw0Var.W(kl91Var, ubmVar5, (Integer) null) ? 2 : 1;
        } else {
            i = 3;
        }
        return new ul91(new nl91(i2, str, if81VarH0, if81VarI0, if81Var, if81Var2, if81Var3, i3, if81Var4, if81Var5, i4, setB0, zE, i, rtw0.Z(kl91Var, str)), list);
    }
}
