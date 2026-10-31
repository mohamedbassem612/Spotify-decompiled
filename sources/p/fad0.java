package p;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.home.slotloading.SlotEffect$LoadSlotContent;
import com.spotify.pam.v2.GetInviteMembersViewRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fad0 implements Function, p2r0 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public fad0(Clock clock, TimeZone timeZone) {
        ZoneId zoneIdOfTotalSeconds;
        this.a = (byte) 10;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        this.b = clock;
        long jMillis = clock.millis();
        Set availableZoneIds = ZoneId.getAvailableZoneIds();
        if ("Asia/Hanoi".equals(timeZone.getID()) && !availableZoneIds.contains("Asia/Hanoi")) {
            zoneIdOfTotalSeconds = ZoneId.of("Asia/Ho_Chi_Minh");
        } else if ("Europe/Kyiv".equals(timeZone.getID()) && !availableZoneIds.contains("Europe/Kyiv")) {
            zoneIdOfTotalSeconds = ZoneId.of("Europe/Kiev");
        } else if (!"America/Ciudad_Juarez".equals(timeZone.getID()) || availableZoneIds.contains("America/Ciudad_Juarez")) {
            try {
                zoneIdOfTotalSeconds = ZoneId.of(timeZone.getID());
            } catch (DateTimeException unused) {
                zoneIdOfTotalSeconds = ZoneOffset.ofTotalSeconds(timeZone.getOffset(jMillis) / 1000);
            }
            zoneIdOfTotalSeconds.getClass();
        } else {
            zoneIdOfTotalSeconds = ZoneId.of("America/Chihuahua");
        }
        this.c = dateTimeFormatter.withZone(zoneIdOfTotalSeconds);
    }

    public static fad0 g(iac0 iac0Var) {
        return new fad0(iac0Var, ((sck1) iac0Var).o());
    }

    public hmh0 a() {
        return new hmh0(this);
    }

    public Object apply(Object obj) {
        w3s0 v3s0Var;
        byte b = 4;
        switch (this.a) {
            case 1:
                ((wp20) this.b).J((Context) this.c, false);
                return CompletableEmpty.a;
            case 2:
                nth0 nth0Var = (rth0) obj;
                rkd0 rkd0Var = (rkd0) this.b;
                long jLongValue = ((Long) this.c).longValue();
                rkd0Var.getClass();
                long jR = k1p1.r(nth0Var.a().a) - jLongValue;
                if (!(nth0Var instanceof nth0)) {
                    if ((nth0Var instanceof kth0) || (nth0Var instanceof qth0)) {
                        return new u3s0(jR, nth0Var.a().b);
                    }
                    eg.o();
                    return null;
                }
                nth0 nth0Var2 = nth0Var;
                fsh fshVar = nth0Var2.a;
                vnt0 vnt0Var = nth0Var2.c;
                String str = vnt0Var.a;
                z6x z6xVar = vnt0Var.c;
                if (str == null) {
                    eg.m("expecting trackUri to be present");
                    return null;
                }
                ytw0 ytw0Var = jfv.b;
                String str2 = vnt0Var.b;
                if (str2 == null) {
                    str2 = "0s";
                }
                try {
                    long jT = fdg1.T(str2, false);
                    if (jfv.f(jT, jfv.e)) {
                        throw new IllegalStateException("invariant failed");
                    }
                    long jH = jfv.h(jT);
                    List list = (Collection) z6xVar;
                    if (list == null || list.isEmpty()) {
                        v3s0Var = new v3s0(new y6b1(str, false), jH, jR, fshVar.b);
                    } else {
                        List listSingletonList = Collections.singletonList(str);
                        if (z6xVar == null) {
                            z6xVar = z6x.a;
                        }
                        ArrayList arrayListN0 = o7h.N0((Iterable) z6xVar, listSingletonList);
                        ArrayList arrayList = new ArrayList(q7h.U(arrayListN0, 10));
                        Iterator it = arrayListN0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new y6b1((String) it.next(), false));
                        }
                        v3s0Var = new w3s0(jH, jR, fshVar.b, arrayList);
                    }
                    return v3s0Var;
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException(f4i1.f("Invalid duration string format: '", str2, "'."), e);
                }
            case 6:
                Throwable th = (Throwable) obj;
                zd1 zd1Var = (zd1) this.b;
                Logger.e(th, "Failed to load reactions for entity, target: " + ((frd1) zd1Var.c) + " filter: " + ((String) zd1Var.d), new Object[0]);
                return new s101(((g101) this.c).a, th);
            case 15:
                Logger.e((Throwable) obj, "Error loading translated lyrics from fullscreen; retrying original lyrics", new Object[0]);
                lnf0 lnf0Var = (lnf0) this.b;
                ihf0 ihf0Var = (ihf0) this.c;
                return lnf0Var.d(ihf0Var.a.uri(), ihf0Var.b, dhf0.b, (String) null);
            case 16:
                boolean z = ((q461) this.c).d;
                nxf0 nxf0Var = (nxf0) this.b;
                ry21 ry21Var = ((sy21) obj).a;
                if (ry21Var.Q0) {
                    return ts21.a;
                }
                int i = ry21Var.d;
                if (i == 429) {
                    nxf0Var.a(new vp80(3, ""));
                    return new ss21(os21.a);
                }
                if (i == 404) {
                    nxf0Var.a(new wp80(2, z ? 7 : 6, (Map) null));
                    return new ss21(qs21.a);
                }
                if (i == 400) {
                    nxf0Var.a(new wp80(2, z ? (byte) 5 : (byte) 4, (Map) null));
                } else {
                    nxf0Var.a(new vp80(1, String.valueOf(i)));
                }
                return new ss21(new ps21(i));
            case 22:
                spq0 spq0VarTrack = ((PlayerState) obj).track();
                if (spq0VarTrack.c()) {
                    return ((s24) this.b).h0(((ContextTrack) spq0VarTrack.b()).uri(), (m210) this.c);
                }
                Logger.d("Couldn't find a track to start radio for.", new Object[0]);
                return CompletableEmpty.a;
            case 25:
                wph0 wph0Var = (wph0) this.b;
                String str3 = (String) this.c;
                wph0Var.getClass();
                Logger.e((Throwable) obj, "Failed to complete action " + str3 + ".", new Object[0]);
                return new ch61(-1);
            case 26:
                qli0 qli0Var = (qli0) obj;
                return gj10.k((gj10) this.b, qli0Var.a, (String) null, ((nwa) this.c).a(qli0Var.b), (Boolean) null, (Boolean) null, (Boolean) null, 58).d(Observable.just(tli0.a)).onErrorReturn(a020.O0);
            default:
                ndj0 ndj0Var = (ndj0) obj;
                Set set = (Set) this.b;
                kcs kcsVar = (kcs) this.c;
                String str4 = ndj0Var.c;
                String str5 = ndj0Var.d;
                hzi0 hzi0VarA = sdj0.a(str4, set);
                CompletablePeek completablePeekH = hzi0VarA != null ? hzi0VarA.a(str5).g(new tt60(kcsVar, str5, b)).h(new w090(kcsVar, str5, (byte) 16)) : null;
                return completablePeekH != null ? completablePeekH.w() : Observable.empty();
        }
    }

    public luk b() {
        return (luk) this.b;
    }

    public vqo c() {
        uqo uqoVar = new uqo(2131957378, (String) null, (Integer) null, (ks21) null, 30);
        cg60 cg60Var = new cg60(((jed0) this.b).d(), (byte) 2);
        c0g.x.getClass();
        cxo1 cxo1Var = cxo1.P0;
        kly0 kly0Var = (kly0) this.c;
        tqo.a.getClass();
        return new vqo("listeningActivityAudience", uqoVar, cg60Var, cxo1Var, kly0Var, rqo.c);
    }

    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ina1 ina1Var = ((j9e0) this.c).b;
        if (ina1Var.g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String strConcat = str.concat("    ");
            for (int i = 0; i < ina1Var.g(); i++) {
                h9e0 h9e0Var = (h9e0) ina1Var.h(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(ina1Var.d(i));
                printWriter.print(": ");
                printWriter.println(h9e0Var.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                printWriter.println(h9e0Var.Y);
                dan1 dan1Var = h9e0Var.Y;
                String strConcat2 = strConcat.concat("  ");
                dan1Var.getClass();
                printWriter.print(strConcat2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(dan1Var.a);
                if (dan1Var.b || dan1Var.e) {
                    printWriter.print(strConcat2);
                    printWriter.print("mStarted=");
                    printWriter.print(dan1Var.b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(dan1Var.e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (dan1Var.c || dan1Var.d) {
                    printWriter.print(strConcat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(dan1Var.c);
                    printWriter.print(" mReset=");
                    printWriter.println(dan1Var.d);
                }
                if (dan1Var.g != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mTask=");
                    printWriter.print(dan1Var.g);
                    printWriter.print(" waiting=");
                    dan1Var.g.getClass();
                    printWriter.println(false);
                }
                if (dan1Var.h != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(dan1Var.h);
                    printWriter.print(" waiting=");
                    dan1Var.h.getClass();
                    printWriter.println(false);
                }
                if (h9e0Var.N0 != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(h9e0Var.N0);
                    i9e0 i9e0Var = h9e0Var.N0;
                    String strConcat3 = strConcat.concat("  ");
                    i9e0Var.getClass();
                    printWriter.print(strConcat3);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(i9e0Var.b);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                dan1 dan1Var2 = h9e0Var.Y;
                Object objE = h9e0Var.e();
                dan1Var2.getClass();
                StringBuilder sb = new StringBuilder(64);
                eqr0.n(objE, sb);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(((ymd0) h9e0Var).c > 0);
            }
        }
    }

    public Single e() {
        return ((wmi0) this.b).a().map(va20.N0);
    }

    public Single f() {
        fni0 fni0Var = (fni0) this.c;
        bo40 bo40VarN = GetInviteMembersViewRequest.n();
        bo40VarN.n();
        return fni0Var.a((GetInviteMembersViewRequest) bo40VarN.build()).map(kc20.O0);
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        return new o3e0(((wp20) this.b).h(q7r0Var, bundle), (ipe0) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object i(SlotEffect$LoadSlotContent slotEffect$LoadSlotContent, String str, boolean z, boolean z2, String str2, onm onmVar) {
        w4e0 w4e0Var;
        SlotEffect$LoadSlotContent slotEffect$LoadSlotContent2;
        String str3;
        he91 m231Var;
        if (onmVar instanceof w4e0) {
            w4e0Var = (w4e0) onmVar;
            int i = w4e0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4e0Var.e = i - Integer.MIN_VALUE;
            } else {
                w4e0Var = new w4e0(this, onmVar);
            }
        } else {
            w4e0Var = new w4e0(this, onmVar);
        }
        w4e0 w4e0Var2 = w4e0Var;
        Object objM = w4e0Var2.c;
        int i2 = w4e0Var2.e;
        try {
            if (i2 == 0) {
                hm5.M(objM);
                try {
                    ua91 ua91Var = (ua91) this.c;
                    ef91 slotType = slotEffect$LoadSlotContent.getSlotType();
                    ice0 loadingStrategy = slotEffect$LoadSlotContent.getLoadingStrategy();
                    String sessionId = slotEffect$LoadSlotContent.getSessionId();
                    hp60 hp60Var = new hp60(this, slotEffect$LoadSlotContent, str, z, z2, str2, (lnm) null);
                    w4e0Var2.a = slotEffect$LoadSlotContent;
                    str3 = str;
                    w4e0Var2.b = str3;
                    w4e0Var2.e = 1;
                    objM = ua91Var.M(slotType, loadingStrategy, z, sessionId, hp60Var, w4e0Var2);
                    d9n d9nVar = d9n.a;
                    if (objM == d9nVar) {
                        return d9nVar;
                    }
                    slotEffect$LoadSlotContent2 = slotEffect$LoadSlotContent;
                } catch (Throwable th) {
                    th = th;
                    slotEffect$LoadSlotContent2 = slotEffect$LoadSlotContent;
                    m231Var = new m231(th);
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = w4e0Var2.b;
                slotEffect$LoadSlotContent2 = w4e0Var2.a;
                try {
                    hm5.M(objM);
                } catch (Throwable th2) {
                    th = th2;
                    m231Var = new m231(th);
                }
            }
            nd91 nd91Var = (nd91) objM;
            m231Var = new he91(slotEffect$LoadSlotContent2.getSlotType(), nd91Var.a, slotEffect$LoadSlotContent2.getLoadingStrategy(), nd91Var.b, str3, nd91Var.e, nd91Var.f, nd91Var.g, nd91Var.h);
            Throwable thA = e331.a(m231Var);
            return thA == null ? m231Var : new ke91(slotEffect$LoadSlotContent2.getSlotType(), thA, slotEffect$LoadSlotContent2.getLoadingStrategy());
        } catch (CancellationException e) {
            throw e;
        }
    }

    public void j(rc2 rc2Var) {
        tv80 tv80VarM;
        int i;
        int i2;
        ksk0 ksk0Var = (ksk0) this.c;
        r6h1 r6h1Var = ksk0Var.b;
        y6h1 y6h1Var = ksk0Var.c;
        ikp ikpVar = (ikp) this.b;
        boolean zEquals = rc2Var.equals(st80.e);
        b7x b7xVar = b7x.a;
        if (zEquals) {
            i8h1 i8h1Var = (i8h1) ikpVar.get();
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            x6h1 x6h1VarC3 = x6h1VarC2.a().c();
            x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
        } else if (rc2Var instanceof du80) {
            i8h1 i8h1Var2 = (i8h1) ikpVar.get();
            x6h1 x6h1VarC4 = y6h1Var.c();
            x6h1VarC4.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = true;
            x6h1 x6h1VarC5 = x6h1VarC4.a().c();
            x6h1VarC5.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
            x6h1VarC6.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            tv80VarM = i8h1Var2.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", ((du80) rc2Var).d)), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
        } else {
            int i3 = 3;
            if (rc2Var instanceof fu80) {
                i8h1 i8h1Var3 = (i8h1) ikpVar.get();
                x6h1 x6h1VarC7 = y6h1Var.c();
                x6h1VarC7.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("location_results", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                y6h1 y6h1VarA = x6h1VarC9.a();
                fu80 fu80Var = (fu80) rc2Var;
                int iC = l1d.C(fu80Var.f);
                if (iC == 0) {
                    i2 = 1;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    i2 = 2;
                }
                Integer numValueOf = Integer.valueOf(fu80Var.e);
                int iC2 = l1d.C(fu80Var.g);
                if (iC2 == 0) {
                    i3 = 1;
                } else if (iC2 == 1) {
                    i3 = 2;
                } else if (iC2 != 2) {
                    eg.o();
                    return;
                }
                x6h1 x6h1VarC10 = y6h1VarA.c();
                x6h1VarC10.i.add(new a7h1("location_row", mdl0.a(i2), numValueOf, (String) null, mdl0.b(i3)));
                x6h1VarC10.j = false;
                tv80VarM = i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC10.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            } else if (rc2Var instanceof iu80) {
                i8h1 i8h1Var4 = (i8h1) ikpVar.get();
                x6h1 x6h1VarC11 = y6h1Var.c();
                x6h1VarC11.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = true;
                x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                x6h1VarC12.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                x6h1VarC13.i.add(new a7h1("location_results", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                y6h1 y6h1VarA2 = x6h1VarC13.a();
                iu80 iu80Var = (iu80) rc2Var;
                int iC3 = l1d.C(iu80Var.e);
                if (iC3 == 0) {
                    i = 1;
                } else {
                    if (iC3 != 1) {
                        eg.o();
                        return;
                    }
                    i = 2;
                }
                Integer numValueOf2 = Integer.valueOf(iu80Var.d);
                int iC4 = l1d.C(1);
                if (iC4 == 0) {
                    i3 = 1;
                } else if (iC4 == 1) {
                    i3 = 2;
                } else if (iC4 != 2) {
                    eg.o();
                    return;
                }
                x6h1 x6h1VarC14 = y6h1VarA2.c();
                x6h1VarC14.i.add(new a7h1("location_row", mdl0.a(i), numValueOf2, (String) null, mdl0.b(i3)));
                x6h1VarC14.j = false;
                tv80VarM = i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_recent_searches_item", 1, b7xVar), x6h1VarC14.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            } else if (rc2Var.equals(st80.d)) {
                i8h1 i8h1Var5 = (i8h1) ikpVar.get();
                x6h1 x6h1VarC15 = y6h1Var.c();
                x6h1VarC15.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = true;
                x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                x6h1VarC16.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = false;
                x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                x6h1VarC17.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC17.j = false;
                tv80VarM = i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC17.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            } else if (rc2Var.equals(st80.k)) {
                i8h1 i8h1Var6 = (i8h1) ikpVar.get();
                x6h1 x6h1VarC18 = y6h1Var.c();
                x6h1VarC18.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
                x6h1VarC18.j = true;
                x6h1 x6h1VarC19 = x6h1VarC18.a().c();
                x6h1VarC19.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC19.j = false;
                x6h1 x6h1VarC20 = x6h1VarC19.a().c();
                x6h1VarC20.i.add(new a7h1("query", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC20.j = false;
                tv80VarM = i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC20.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            } else if (rc2Var.equals(st80.f)) {
                i8h1 i8h1Var7 = (i8h1) ikpVar.get();
                x6h1 x6h1VarC21 = y6h1Var.c();
                x6h1VarC21.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
                x6h1VarC21.j = true;
                x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                x6h1VarC22.i.add(new a7h1("preferred_location_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC22.j = false;
                x6h1 x6h1VarC23 = x6h1VarC22.a().c();
                x6h1VarC23.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC23.j = false;
                tv80VarM = i8h1Var7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC23.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            } else if (rc2Var.equals(st80.g)) {
                i8h1 i8h1Var8 = (i8h1) ikpVar.get();
                x6h1 x6h1VarC24 = y6h1Var.c();
                x6h1VarC24.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
                x6h1VarC24.j = true;
                x6h1 x6h1VarC25 = x6h1VarC24.a().c();
                x6h1VarC25.i.add(new a7h1("preferred_location_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC25.j = false;
                x6h1 x6h1VarC26 = x6h1VarC25.a().c();
                x6h1VarC26.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC26.j = false;
                tv80VarM = i8h1Var8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC26.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            } else if (rc2Var.equals(st80.j)) {
                i8h1 i8h1Var9 = (i8h1) ikpVar.get();
                x6h1 x6h1VarC27 = y6h1Var.c();
                x6h1VarC27.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
                x6h1VarC27.j = true;
                x6h1 x6h1VarC28 = x6h1VarC27.a().c();
                x6h1VarC28.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC28.j = false;
                x6h1 x6h1VarC29 = x6h1VarC28.a().c();
                x6h1VarC29.i.add(new a7h1("preferred_location_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC29.j = false;
                tv80VarM = i8h1Var9.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC29.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            } else if (rc2Var.equals(st80.h)) {
                i8h1 i8h1Var10 = (i8h1) ikpVar.get();
                x6h1 x6h1VarC30 = y6h1Var.c();
                x6h1VarC30.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
                x6h1VarC30.j = true;
                x6h1 x6h1VarC31 = x6h1VarC30.a().c();
                x6h1VarC31.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC31.j = false;
                x6h1 x6h1VarC32 = x6h1VarC31.a().c();
                x6h1VarC32.i.add(new a7h1("preferred_location_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC32.j = false;
                x6h1 x6h1VarC33 = x6h1VarC32.a().c();
                x6h1VarC33.i.add(new a7h1("clear_buton", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC33.j = false;
                tv80VarM = i8h1Var10.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC33.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            } else {
                if (!rc2Var.equals(st80.i)) {
                    eg.o();
                    return;
                }
                i8h1 i8h1Var11 = (i8h1) ikpVar.get();
                x6h1 x6h1VarC34 = y6h1Var.c();
                x6h1VarC34.i.add(new a7h1("page", "events-location-search-page-id", (Integer) null, (String) null, (String) null));
                x6h1VarC34.j = true;
                x6h1 x6h1VarC35 = x6h1VarC34.a().c();
                x6h1VarC35.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC35.j = false;
                x6h1 x6h1VarC36 = x6h1VarC35.a().c();
                x6h1VarC36.i.add(new a7h1("preferred_location_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC36.j = false;
                x6h1 x6h1VarC37 = x6h1VarC36.a().c();
                x6h1VarC37.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC37.j = false;
                tv80VarM = i8h1Var11.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC37.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            }
        }
        String str = tv80VarM.a.a;
    }

    public void k() {
        ina1 ina1Var = ((j9e0) this.c).b;
        int iG = ina1Var.g();
        for (int i = 0; i < iG; i++) {
            ((h9e0) ina1Var.h(i)).o();
        }
    }

    public void l(d2e0 d2e0Var) {
        this.c = d2e0Var;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                eqr0.n((iac0) this.b, sb);
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fad0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public fad0(Context context) {
        this.a = (byte) 17;
        this.b = new idd1(new qnd0(context, (byte) 8));
        this.c = new DecelerateInterpolator();
    }

    public fad0(i8h1 i8h1Var) {
        this.a = (byte) 14;
        this.b = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.c = new yok0((byte) 16);
    }

    public fad0(ConstraintLayout constraintLayout, ViewStub viewStub, Barrier barrier) {
        this.a = (byte) 3;
        this.b = constraintLayout;
        this.c = barrier;
    }

    public fad0(iac0 iac0Var, rck1 rck1Var) {
        this.a = (byte) 8;
        this.b = iac0Var;
        hce1 hce1Var = new hce1(rck1Var, j9e0.d, csn.b);
        tka0 tka0VarB = rc11.a.b(j9e0.class);
        String strO = tka0VarB.o();
        if (strO != null) {
            this.c = hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
        } else {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public fad0(byte[] bArr) {
        this.a = (byte) 24;
        this.b = bArr;
    }

    public fad0(hvp0 hvp0Var, dt71 dt71Var, ntf0 ntf0Var) {
        this.a = (byte) 21;
        this.b = dt71Var;
        dnc0 dnc0VarB = hvp0.b(hvp0Var);
        dnc0VarB.b(new gj50(new z6h0(this, (byte) 0), false), ntf0Var);
        this.c = dnc0VarB.a();
    }
}
