package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.widget.ImageView;
import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vx40 implements h8q0, Function, gvt0, cy81, djy0, xe90, xi7 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public vx40(Context context) {
        this.a = (byte) 8;
        this.b = context;
        h380 h380VarA = j380.a();
        h380VarA.e("today", 2131955588);
        h380VarA.e("yesterday", 2131955591);
        h380VarA.e("thisWeek", 2131955590);
        h380VarA.e("twoDaysAgo", 2131955589);
        h380VarA.e("unplayed", 2131955587);
        h380VarA.e("unfinished", 2131955586);
        this.c = h380VarA.b(true);
    }

    public static void B(e550 e550Var, j331 j331Var, iu30 iu30Var) {
        String str;
        Map map;
        if (j331Var instanceof v231) {
            e550Var.u("SUCCESS");
            if (iu30Var == null || (map = (Map) iu30Var.invoke(((v231) j331Var).a)) == null) {
                return;
            }
            e550Var.n(map);
            return;
        }
        String strE = "USER_CANCELED";
        if (j331Var instanceof c331) {
            e550Var.u("USER_CANCELED");
            return;
        }
        if (!(j331Var instanceof i231)) {
            eg.o();
            return;
        }
        e550Var.u("ERROR");
        i231 i231Var = (i231) j331Var;
        switch (i231Var.b()) {
            case 1:
                str = "GET_PARTNER_USER_ID";
                break;
            case 2:
                str = "CONNECT_TO_GPB";
                break;
            case 3:
                str = "GET_SUPPORTED_STATUS";
                break;
            case 4:
                str = "GET_PURCHASES";
                break;
            case 5:
                str = "GET_PRODUCT_DETAILS";
                break;
            case 6:
                str = "BLOCK_DIFFERENT_ACCOUNTS";
                break;
            case 7:
                str = "LAUNCH_BILLING_FLOW";
                break;
            case 8:
                str = "ON_PURCHASES_UPDATED";
                break;
            case 9:
                str = "GET_BILLING_CONFIG";
                break;
            default:
                throw null;
        }
        e550Var.x(str);
        if (i231Var instanceof b231) {
            b231 b231Var = (b231) j331Var;
            int i = b231Var.b;
            if (i != 12) {
                switch (i) {
                    case -2:
                        strE = "FEATURE_NOT_SUPPORTED";
                        break;
                    case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        strE = "SERVICE_DISCONNECTED";
                        break;
                    case 0:
                        strE = "OK";
                        break;
                    case 1:
                        break;
                    case 2:
                        strE = "SERVICE_UNAVAILABLE";
                        break;
                    case 3:
                        strE = "BILLING_UNAVAILABLE";
                        break;
                    case 4:
                        strE = "ITEM_UNAVAILABLE";
                        break;
                    case 5:
                        strE = "DEVELOPER_ERROR";
                        break;
                    case 6:
                        strE = "ERROR";
                        break;
                    case 7:
                        strE = "ITEM_ALREADY_OWNED";
                        break;
                    case 8:
                        strE = "ITEM_NOT_OWNED";
                        break;
                    default:
                        strE = gvg.e(i, "UNKNOWN (", ")");
                        break;
                }
            } else {
                strE = "NETWORK_ERROR";
            }
            e550Var.s("GPB_".concat(strE));
            e550Var.r(b231Var.c);
            return;
        }
        if (i231Var instanceof z131) {
            e550Var.s("ANOTHER_FLOW_ALREADY_BEING_LAUNCHED");
            return;
        }
        if (i231Var instanceof e231) {
            e550Var.s("NULL_OR_EMPTY_PRODUCT_DETAILS");
            return;
        }
        if (i231Var instanceof f231) {
            e550Var.s("PRODUCT_NOT_FOUND_IN_RESPONSE");
            return;
        }
        if (i231Var instanceof c231) {
            e550Var.s("NO_OFFER_FOUND_WITH_OFFER_TAGS");
            e550Var.r("Desired: " + ((c231) j331Var).a + ".");
            return;
        }
        if (i231Var instanceof d231) {
            e550Var.s("NO_PRODUCT_DETAILS_FOUND_WITH_ID");
            return;
        }
        if (i231Var instanceof a231) {
            e550Var.s("ANOTHER_USER_ALREADY_SUBSCRIBED");
            return;
        }
        if (i231Var instanceof g231) {
            e550Var.s("SUBSCRIPTION_NOT_OWNED_BY_GOOGLE_USER");
        } else if (!(i231Var instanceof h231)) {
            eg.o();
        } else {
            e550Var.s("UNKNOWN");
            e550Var.r(((h231) j331Var).b.toString());
        }
    }

    public static void x(e550 e550Var, vsw0 vsw0Var) {
        String str;
        e550Var.q("PRODUCT_ID", vsw0Var.a().toString());
        int i = vsw0Var.a;
        if (i == 1) {
            str = "INAPP";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "SUBS";
        }
        e550Var.q("PRODUCT_TYPE", str);
        if (vsw0Var instanceof usw0) {
            usw0 usw0Var = (usw0) vsw0Var;
            List list = usw0Var.c;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((qnc1) it.next()).b);
            }
            e550Var.q("OFFER_IDENTIFIER", arrayList.toString());
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((qnc1) it2.next()).c != null) {
                        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            gtw0 gtw0Var = ((qnc1) it3.next()).c;
                            arrayList2.add(gtw0Var != null ? p7h.M(new String[]{gtw0Var.a, gtw0Var.b.a}) : null);
                        }
                        e550Var.q("PRORATION_MODE", arrayList2.toString());
                        return;
                    }
                }
            }
            nf21 nf21Var = usw0Var.e;
            if (nf21Var != null) {
                e550Var.q("PRORATION_MODE", nf21Var.a);
            }
        }
    }

    public Object A(yx40 yx40Var) {
        non1 non1Var = (non1) ((idd1) this.c).getValue();
        non1Var.getClass();
        asd1 asd1VarB = asd1.b();
        asd1VarB.d = new ghk1(non1Var, (byte) 7);
        asd1VarB.a = new pl10[]{hm5.i};
        asd1VarB.c = (char) 37603;
        Object objM = rc2.M(((mk4) this.b).a(), new j020(non1Var.e(0, asd1VarB.a()), null, (byte) 17), yx40Var);
        return objM == d9n.a ? objM : rih1.a;
    }

    public void C(lp80 lp80Var, String str, String str2, String str3, String str4) {
        String str5 = lp80Var != null ? lp80Var.a : null;
        Float f = lp80Var != null ? lp80Var.b : null;
        t45 t45Var = lp80Var != null ? lp80Var.c : null;
        if (t45Var != null) {
            t45Var.a("result", str);
            if (str5 == null) {
                str5 = "unknown";
            }
            t45Var.a("source", str5);
            t45Var.b("url", Base64.encodeToString(str2.getBytes(nne.a), 2));
            t45Var.b("request_id", str4);
            if (f != null) {
                t45Var.b("scale_factor", new DecimalFormat("0.00").format(Float.valueOf(f.floatValue())));
            }
            if (str3 != null) {
                t45Var.b("error_description", str3);
            }
            for (Map.Entry entry : lp80Var.d.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (str7 == null) {
                    str7 = "";
                }
                t45Var.b(str6, str7);
            }
            t45Var.g("image_request");
            ((zle1) this.b).b(t45Var.e());
        }
        ((ConcurrentHashMap) this.c).remove(str4);
    }

    public Object D(ay40 ay40Var, zx40 zx40Var) {
        non1 non1Var = (non1) ((idd1) this.c).getValue();
        non1Var.getClass();
        zod.p("DeviceSuggestionsCallback", "Listener type must not be empty");
        Object objM = rc2.M(((mk4) this.b).a(), new j020(non1Var.c(new c9d0(ay40Var, "DeviceSuggestionsCallback"), 37602), null, (byte) 17), zx40Var);
        return objM == d9n.a ? objM : rih1.a;
    }

    public String a() {
        return ((g71) this.b).a();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x0138: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:43:0x0137, B:55:0x0138] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x012c: CHECK_CAST (p.mh90) (r2v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vx40.apply(java.lang.Object):java.lang.Object");
    }

    public jz40 b() {
        if (((s9x0) this.b) == null) {
            this.b = new s9x0((byte) 28);
        }
        if (((Looper) this.c) == null) {
            this.c = Looper.getMainLooper();
        }
        return new jz40((s9x0) this.b, (Looper) this.c);
    }

    public boolean c(m0u0 m0u0Var) {
        tr60 tr60Var = (tr60) this.c;
        ContextTrack contextTrack = (ContextTrack) this.b;
        String str = (String) m0u0Var.a.d.get("track_uid");
        if (str == null) {
            hhg1.n("Required value was null.");
            return false;
        }
        if (tr60Var.i1.m) {
            if (str.length() > 0 && u890.j(contextTrack.uid(), str)) {
                return true;
            }
            if (u890.j(contextTrack.uri(), c2p1.r(m0u0Var)) && ((yyd) ((w611) tr60Var).a.getTag(2131430298)).a) {
                return true;
            }
        } else if (l4o1.k(contextTrack, str, c2p1.r(m0u0Var)) && ((yyd) ((w611) tr60Var).a.getTag(2131430298)).a) {
            return true;
        }
        return false;
    }

    public int e() {
        return ((g71) this.b).e();
    }

    public boolean f() {
        return false;
    }

    public void g() {
        i8h1 i8h1Var = (i8h1) this.b;
        txk0 txk0Var = (txk0) ((ewn0) this.c).b;
        txk0Var.getClass();
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("new_joiner_ipl_session_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = txk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public String getClientId() {
        return ((g71) this.b).getClientId();
    }

    public String getState() {
        return ((g71) this.b).getState();
    }

    public void h() {
        i8h1 i8h1Var = (i8h1) this.b;
        txk0 txk0Var = (txk0) ((ewn0) this.c).b;
        txk0Var.getClass();
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("new_joiner_ipl_session_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public String i() {
        return ((g71) this.b).i();
    }

    public String j() {
        return ((g71) this.b).j();
    }

    public xig k() {
        return ((g71) this.b).k();
    }

    public Single l(Intent intent, th61 th61Var) {
        ru9 ru9Var = (ru9) this.b;
        return ((iir) ru9Var.d).m().observeOn((Scheduler) ru9Var.b).flatMap(new st60((blc0) this.c, intent, ru9Var, (byte) 28)).onErrorReturn(yi20.g);
    }

    public String m() {
        return ((g71) this.b).m();
    }

    public void o() {
        i8h1 i8h1Var = (i8h1) this.b;
        txk0 txk0Var = (txk0) ((ewn0) this.c).b;
        txk0Var.getClass();
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("new_joiner_ipl_session_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void onSuccess(Object obj) {
        zlo1 zlo1Var = (zlo1) obj;
        ohd ohdVar = (ohd) this.b;
        try {
            b450 b450Var = (b450) this.c;
            zlo1Var.getClass();
            ohdVar.resumeWith(b450Var.b(zlo1Var));
        } catch (Exception e) {
            ohdVar.resumeWith(new a2c1(5, 1, e));
        }
    }

    public String p() {
        i8h1 i8h1Var = (i8h1) this.b;
        txk0 txk0Var = (txk0) ((ewn0) this.c).b;
        txk0Var.getClass();
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("new_joiner_ipl_session_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("manage_participants_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:socialsession:participant-list")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public String[] q() {
        String stringExtra = ((Intent) this.c).getStringExtra("SCOPES");
        return stringExtra != null ? i1o1.k(stringExtra, one.b).split(" +") : new String[0];
    }

    public String r() {
        return ((g71) this.b).r();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    public mr20 s(String str) {
        String str2;
        String str3;
        byte b;
        boolean z;
        mr20 mr20VarG;
        byte b2;
        dxy dxyVar = (dxy) this.b;
        t7y t7yVar = (t7y) dxyVar.g;
        c610 c610Var = (c610) dxyVar.b;
        ypn0 ypn0Var = ypn0.a;
        if (str.equals("spotify:home")) {
            str3 = "com.spotify.androidauto.home";
        } else {
            lqn0 lqn0Var = lqn0.a;
            if (str.equals("spotify:recently-played")) {
                str3 = "com.spotify.recently-played";
            } else {
                upn0 upn0Var = upn0.a;
                if (str.equals("spotify:browse")) {
                    str3 = "com.spotify.browse";
                } else {
                    cqn0 cqn0Var = cqn0.a;
                    if (str.equals("spotify:collection")) {
                        str3 = "com.spotify.your-library";
                    } else {
                        pqn0 pqn0Var = pqn0.a;
                        if (str.equals("spotify:collection:albums")) {
                            str3 = "com.spotify.your-albums";
                        } else {
                            qqn0 qqn0Var = qqn0.a;
                            if (str.equals("spotify:collection:artists")) {
                                str3 = "com.spotify.your-artists";
                            } else {
                                uqn0 uqn0Var = uqn0.a;
                                if (str.equals("spotify:collection:playlists")) {
                                    str3 = "com.spotify.your-playlists";
                                } else {
                                    vqn0 vqn0Var = vqn0.a;
                                    if (str.equals("spotify:collection:podcasts")) {
                                        str3 = "com.spotify.your-podcasts";
                                    } else {
                                        rqn0 rqn0Var = rqn0.a;
                                        if (!str.equals("spotify:collection:audiobooks")) {
                                            sqn0 sqn0Var = sqn0.a;
                                            if (str.equals("spotify:collection:downloads")) {
                                                str3 = "com.spotify.downloaded";
                                            } else {
                                                str2 = str;
                                            }
                                            m210 m210Var = (m210) dxyVar.d;
                                            if (str.equals("spotify:home") || !t7yVar.o(2)) {
                                                b = 1;
                                                z = false;
                                            } else {
                                                b = 1;
                                                z = true;
                                            }
                                            mr20VarG = yoi1.g(c610Var.e(new r9c(null, str2, null, null, m210Var, false, true, null, 0, 4, null, z, 126125), (Bundle) null).observeOn(c610Var.b));
                                            if (!t7yVar.o(4) || t7yVar.o(5) || (str.equals("spotify:home") && t7yVar.o(b))) {
                                                if (str.equals("spotify:home")) {
                                                    b2 = 0;
                                                } else {
                                                    b2 = 0;
                                                    if (nhc1.Y(str, "spotify:section:", false)) {
                                                    }
                                                }
                                                mr20VarG = hu20.e(mr20VarG, new uls((lnm) null, (mlw0) dxyVar.f, (byte) 16));
                                            } else {
                                                b2 = 0;
                                            }
                                            mr20 mr20VarU = rqt0.u(new x010(mr20VarG, rqt0.u(new php0((mr20) dxyVar.e, (byte) 24)), new qr0(dxyVar, (lnm) null, (byte) 20), b));
                                            ytw0 ytw0Var = jfv.b;
                                            return e4p1.i(new m441(new wn2(mr20VarU, fdg1.k0(20, ngv.e), (lnm) null, (byte) 10)), new vq80(this, str, b2));
                                        }
                                        str3 = "com.spotify.your-audiobooks";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        str2 = str3;
        m210 m210Var2 = (m210) dxyVar.d;
        if (str.equals("spotify:home")) {
            b = 1;
            z = false;
        } else {
            b = 1;
            z = false;
        }
        mr20VarG = yoi1.g(c610Var.e(new r9c(null, str2, null, null, m210Var2, false, true, null, 0, 4, null, z, 126125), (Bundle) null).observeOn(c610Var.b));
        if (t7yVar.o(4)) {
            if (str.equals("spotify:home")) {
                b2 = 0;
                if (nhc1.Y(str, "spotify:section:", false)) {
                }
            } else {
                b2 = 0;
            }
            mr20VarG = hu20.e(mr20VarG, new uls((lnm) null, (mlw0) dxyVar.f, (byte) 16));
        } else {
            if (str.equals("spotify:home")) {
                b2 = 0;
                if (nhc1.Y(str, "spotify:section:", false)) {
                }
            } else {
                b2 = 0;
            }
            mr20VarG = hu20.e(mr20VarG, new uls((lnm) null, (mlw0) dxyVar.f, (byte) 16));
        }
        mr20 mr20VarU2 = rqt0.u(new x010(mr20VarG, rqt0.u(new php0((mr20) dxyVar.e, (byte) 24)), new qr0(dxyVar, (lnm) null, (byte) 20), b));
        ytw0 ytw0Var2 = jfv.b;
        return e4p1.i(new m441(new wn2(mr20VarU2, fdg1.k0(20, ngv.e), (lnm) null, (byte) 10)), new vq80(this, str, b2));
    }

    public synchronized Map t() {
        Map mapUnmodifiableMap;
        mapUnmodifiableMap = (Map) this.c;
        if (mapUnmodifiableMap == null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            this.c = mapUnmodifiableMap;
        }
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(int i, onm onmVar) {
        df90 df90Var;
        if (onmVar instanceof df90) {
            df90Var = (df90) onmVar;
            int i2 = df90Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                df90Var.c = i2 - Integer.MIN_VALUE;
            } else {
                df90Var = new df90(this, onmVar);
            }
        } else {
            df90Var = new df90(this, onmVar);
        }
        Object objB = df90Var.a;
        int i3 = df90Var.c;
        if (i3 == 0) {
            hm5.M(objB);
            ox5 ox5Var = (ox5) this.b;
            df90Var.c = 1;
            objB = ox5Var.b(i, df90Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        return Boolean.valueOf(((Bundle) objB).getInt("tr_app_widget_from", 0) == 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    public void v(y570 y570Var) {
        String str = ((jik1) this.c).getViewUri().a;
        x6h1 x6h1VarG = y570Var.r().b("ubi:impression", false) ? y1a1.G(y570Var.r(), str) : null;
        ?? Singleton = 0;
        for (sc70 sc70Var : y570Var.j().values()) {
            if (sc70Var.b.c.b("ubi:impression", false)) {
                if (Singleton == 0) {
                    Singleton = new ArrayList(x6h1VarG != null ? 2 : 1);
                }
                Singleton.add(y1a1.G(sc70Var.b.c, str));
            }
        }
        if (Singleton == 0) {
            Singleton = x6h1VarG != null ? Collections.singleton(x6h1VarG) : Collections.EMPTY_LIST;
        } else if (x6h1VarG != null) {
            Singleton.add(x6h1VarG);
        }
        for (x6h1 x6h1Var : Singleton) {
            i8h1 i8h1Var = (i8h1) this.b;
            x6h1Var.g = "22.0.0";
            y6h1 y6h1VarA = x6h1Var.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
        }
    }

    public qd60 w(lby lbyVar, d8r0 d8r0Var, String str, int i, boolean z) {
        i53 i53Var = lbyVar.e;
        i53 i53Var2 = i53Var instanceof i53 ? i53Var : null;
        if (i53Var2 == null) {
            throw new IllegalStateException(i53Var.getClass() + " cannot be highlighted");
        }
        String str2 = lbyVar.a;
        String str3 = lbyVar.b;
        String strG = tb51.g((tb51) this.c, lbyVar);
        String string = ((Resources) this.b).getString(2131961535);
        String str4 = lbyVar.c;
        ArrayList arrayList = i53Var2.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ol11) it.next()).a);
        }
        int i2 = 1;
        q8b q8bVar = z ? new q8b(p7h.N(o7h.s0(arrayList2)), true) : new q8b(z6x.a, false);
        boolean z2 = i53Var2.e;
        if (!i53Var2.f) {
            i2 = z2 ? 2 : 3;
        }
        return new qd60(str2, str3, i, strG, string, str4, str, d8r0Var, q8bVar, i2);
    }

    public Object y(ay40 ay40Var, onm onmVar) {
        non1 non1Var = (non1) ((idd1) this.c).getValue();
        dbm dbmVarJ = dzo1.j(ay40Var, ((kz40) non1Var).g, "DeviceSuggestionsCallback");
        cjn1 cjn1Var = new cjn1(non1Var, dbmVarJ);
        frl1 frl1Var = new frl1(non1Var, cjn1Var, (byte) 15);
        a6n1 a6n1Var = new a6n1(non1Var, cjn1Var, (byte) 3);
        nf11 nf11Var = new nf11();
        nf11Var.e = true;
        nf11Var.a = frl1Var;
        nf11Var.b = a6n1Var;
        nf11Var.c = dbmVarJ;
        nf11Var.d = new pl10[]{hm5.i};
        nf11Var.f = (char) 37601;
        Object objM = rc2.M(((mk4) this.b).a(), new j020(non1Var.b(nf11Var.a()), null, (byte) 17), onmVar);
        return objM == d9n.a ? objM : rih1.a;
    }

    public void z() {
        ImageView imageView = (ImageView) this.b;
        imageView.setAlpha(1.0f);
        imageView.setVisibility(0);
        imageView.setClipToOutline(true);
        imageView.setImageBitmap(((qt70) this.c).h);
    }

    public /* synthetic */ vx40(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public vx40(zle1 zle1Var) {
        this.a = (byte) 19;
        this.b = zle1Var;
        this.c = new ConcurrentHashMap();
    }

    public vx40(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                this.b = new HashMap();
                break;
        }
    }

    public vx40(Context context, mk4 mk4Var) {
        this.a = (byte) 0;
        this.b = mk4Var;
        this.c = new idd1(new mo2(context, (byte) 26));
    }
}
