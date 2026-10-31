package p;

import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lb50 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb50(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke(Object obj) {
        w7h1 w7h1Var;
        byte b = this.a;
        byte b2 = 17;
        b7x b7xVar = b7x.a;
        byte b3 = 16;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                nb50 nb50Var = (nb50) ((ven0) obj2).getValue();
                i8h1 i8h1Var = (i8h1) nb50Var.a.get();
                ksk0 ksk0Var = nb50Var.b;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("privacy_policy_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", (String) obj4)), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                ((iu30) ((ven0) obj3).getValue()).invoke(o000.e);
                return rih1Var;
            case 1:
                lc20 lc20Var = (lc20) obj4;
                i8h1 i8h1Var2 = (i8h1) lc20Var.b;
                wqk0 wqk0Var = (wqk0) lc20Var.d;
                x6h1 x6h1VarC2 = wqk0Var.c.c();
                x6h1VarC2.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null);
                fn31.T((c9n) obj2, (o8n) null, 0, new xr00((lh50) obj3, (String) obj, (lnm) null, (byte) 25), 3);
                return rih1Var;
            case 2:
                rtb0 rtb0Var = (rtb0) obj;
                jqi0 jqi0Var = (jqi0) obj4;
                rtb0.c(rtb0Var, "add", new j2i(-979204109, new cex(jqi0Var, (iu30) obj2, b2), true), 2);
                ArrayList arrayList = jqi0Var.d;
                rtb0Var.e(arrayList.size(), new ry4(arrayList, (byte) 28), new ry4(arrayList, (byte) 29), new j2i(802480018, new oh50(arrayList, (iu30) obj3, (byte) 0), true));
                return rih1Var;
            case 3:
                ven0 ven0Var = (ven0) obj2;
                float fM0 = ((wat) obj4).M0((int) (((elb0) obj).b() & 4294967295L));
                if (p3v.b(fM0, 0.0f) > 0 && !p3v.c(fM0, ((p3v) ven0Var.getValue()).a)) {
                    pzm.k(fM0, ven0Var);
                    ((iu30) obj3).invoke(new p3v(fM0));
                }
                return rih1Var;
            case 4:
                it0 it0Var = new it0((byte) 4, (pe) obj3, (ven0) obj2);
                iac0 iac0Var = (iac0) obj4;
                iac0Var.getLifecycle().a(it0Var);
                return new ht0((Object) iac0Var, (Object) it0Var, (byte) 23);
            case 5:
                r960 r960Var = (r960) obj2;
                int iOrdinal = ((rwf1) obj).ordinal();
                if (iOrdinal == 0) {
                    ((iu30) obj4).invoke(r960Var.a);
                } else if (iOrdinal == 2) {
                    ((iu30) obj3).invoke(r960Var.a);
                }
                return rih1Var;
            case 6:
                rtb0 rtb0Var2 = (rtb0) obj;
                iu30 iu30Var = (iu30) obj3;
                bm00 bm00Var = (bm00) obj2;
                c380 c380Var = (c380) obj4;
                if (c380Var.isEmpty()) {
                    rtb0.c(rtb0Var2, "HistoryEmptyState-TodayHeader", new j2i(503541578, new gn50(bm00Var, b3), true), 2);
                    rtb0.c(rtb0Var2, "HistoryEmptyState-NewConversationRow", new j2i(-1985776525, new cex((Object) bm00Var, (Object) iu30Var, (byte) 21), true), 2);
                } else {
                    rtb0Var2.e(c380Var.size(), new xg50(c380Var, (byte) 6), new xg50(c380Var, (byte) 7), new j2i(2039820996, new rf1(c380Var, bm00Var, iu30Var, (byte) 14), true));
                }
                return rih1Var;
            case 7:
                List list = (List) obj4;
                ((rtb0) obj).e(list.size(), new s6(list, (byte) 27), new s6(list, (byte) 28), new j2i(-817309187, new gk0(list, (tyq) obj2, (c491) obj3, (byte) 14), true));
                return rih1Var;
            case 8:
                String str = ((s220) obj3).a;
                iu30 iu30Var2 = (iu30) obj4;
                if (((wz20) obj).b()) {
                    iu30Var2.invoke(new ij80(str));
                } else {
                    iu30Var2.invoke(new hj80((String) ((ven0) obj2).getValue(), str));
                }
                return rih1Var;
            case 9:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                r390 r390Var = (r390) obj2;
                ajr ajrVar = r390Var.S0;
                r590 r590Var = (r590) obj4;
                if (r590Var != null) {
                    ajrVar.c(r390Var.X, r590Var);
                    exoPlayer.J(r590Var);
                } else {
                    r590 r590Var2 = (r590) obj3;
                    if (r590Var2 != null) {
                        ajrVar.a(r590Var2);
                        exoPlayer.P(r590Var2);
                    }
                }
                return rih1Var;
            case 10:
                List list2 = (List) obj4;
                rtb0.b((rtb0) obj, list2.size(), (iu30) null, new j2i(-672655888, new gk0(list2, (jx90) obj2, (iu30) obj3, (byte) 16), true), 6);
                return rih1Var;
            case 11:
                Set setSingleton = Collections.singleton(((tna0) obj4).a.a);
                bpb1 bpb1Var = (wen0) obj2;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, setSingleton);
                mko mkoVar = (mko) obj3;
                mkoVar.a(setSingleton);
                mkoVar.b().c(setSingleton);
                return new tj4((byte) 11);
            case 12:
                if (!((kib0) obj4).a) {
                    l811 l811Var = (l811) obj2;
                    if (!l811Var.a) {
                        l811Var.a = true;
                        ((x680) obj3).invoke();
                    }
                }
                return rih1Var;
            case 13:
                List list3 = (List) obj;
                if (!list3.isEmpty()) {
                    fn31.T((c9n) obj4, (o8n) null, 0, new az80(list3, (pbr0) obj2, (yqg) obj3, (lnm) null, (byte) 4), 3);
                }
                return rih1Var;
            case 14:
                ((bxb0) ((dg90) obj2).b).a((String) obj4, (String) obj3);
                return rih1Var;
            case 15:
                xmu0 xmu0Var = ((myb0) obj2).g;
                int iOrdinal2 = ((pc31) obj).ordinal();
                if (iOrdinal2 == 0) {
                    xmu0Var.f(4, (String) obj4, ((x4i1) obj3).a);
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    xmu0Var.e();
                }
                return rih1Var;
            case 16:
                c1d0 c1d0Var = (c1d0) obj2;
                String str2 = (String) obj4;
                dg30 dg30Var = c1d0Var.a;
                if (((wls0) obj3).a()) {
                    fn31.T(cto1.q(dg30Var), (o8n) null, 0, new a1d0(c1d0Var, str2, (lnm) null, (byte) 0), 3);
                } else {
                    mw40 mw40VarT = yoi1.T(c1d0Var.g.a, dg30Var.getString(2131960066), dg30Var.getString(2131960063));
                    String string = dg30Var.getString(2131960065);
                    ln5 ln5Var = new ln5(c1d0Var, str2, (byte) 15);
                    mw40VarT.a = string;
                    mw40VarT.c = ln5Var;
                    String string2 = dg30Var.getString(2131960064);
                    oad oadVar = new oad(c1d0Var, (byte) 19);
                    mw40VarT.b = string2;
                    mw40VarT.d = oadVar;
                    mw40VarT.b().b();
                }
                return rih1Var;
            case 17:
                eea0 eea0Var = ((c1d0) obj2).d;
                int iOrdinal3 = ((pc31) obj).ordinal();
                if (iOrdinal3 == 0) {
                    String str3 = (String) obj4;
                    i8h1 i8h1Var3 = (i8h1) eea0Var.b;
                    int iOrdinal4 = ((d1d0) obj3).ordinal();
                    if (iOrdinal4 == 0) {
                        r6h1 r6h1Var = r6h1.c;
                        y6h1 y6h1Var = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-dialogs-try-again";
                        x6h1VarI.f = "3.0.0";
                        x6h1VarI.g = "22.0.0";
                        x6h1 x6h1VarC3 = x6h1VarI.a().c();
                        x6h1VarC3.i.add(new a7h1("try_again_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("make_playlist_public", 1, Collections.singletonMap("playlist_to_be_made_public", str3)), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        if (iOrdinal4 != 1) {
                            eg.o();
                            return null;
                        }
                        r6h1 r6h1Var2 = r6h1.c;
                        y6h1 y6h1Var2 = y6h1.i;
                        x6h1 x6h1VarI2 = i3o1.i();
                        x6h1VarI2.h = "music";
                        x6h1VarI2.a = "mobile-dialogs-try-again";
                        x6h1VarI2.f = "3.0.0";
                        x6h1VarI2.g = "22.0.0";
                        x6h1 x6h1VarC5 = x6h1VarI2.a().c();
                        x6h1VarC5.i.add(new a7h1("try_again_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                        x6h1VarC6.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("make_playlist_private", 1, Collections.singletonMap("playlist_to_be_made_private", str3)), x6h1VarC6.a(), r6h1Var2, System.currentTimeMillis());
                    }
                    i8h1Var3.m(w7h1Var, (xj61) null);
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    i8h1 i8h1Var4 = (i8h1) eea0Var.b;
                    r6h1 r6h1Var3 = r6h1.c;
                    y6h1 y6h1Var3 = y6h1.i;
                    x6h1 x6h1VarI3 = i3o1.i();
                    x6h1VarI3.h = "music";
                    x6h1VarI3.a = "mobile-dialogs-try-again";
                    x6h1VarI3.f = "3.0.0";
                    x6h1VarI3.g = "22.0.0";
                    x6h1 x6h1VarC7 = x6h1VarI3.a().c();
                    x6h1VarC7.i.add(new a7h1("try_again_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1Var3, System.currentTimeMillis()), (xj61) null);
                }
                return rih1Var;
            case 18:
                q7d0 q7d0Var = (q7d0) obj4;
                fn31.T(q7d0Var.g, (o8n) null, 0, new ary((tv80) obj, q7d0Var, (cxc0) obj2, (b431) obj3, (lnm) null), 3);
                return rih1Var;
            case 19:
                ((p811) obj4).a = new lb50(obj2, obj, obj3, (byte) 18);
                return rih1Var;
            case 20:
                rtb0 rtb0Var3 = (rtb0) obj;
                p9d0 p9d0Var = (p9d0) obj4;
                if (p9d0Var.f.a() && ((Boolean) ((tob1) obj3).getValue()).booleanValue()) {
                    rtb0.c(rtb0Var3, "all-followers-toggle", new j2i(2038691346, new n9d0(p9d0Var, (byte) 0), true), 2);
                    rtb0.c(rtb0Var3, "audience-add-friends", new j2i(-233546039, new n9d0(p9d0Var, (byte) 1), true), 2);
                } else {
                    rtb0.c(rtb0Var3, "send-chat-invite", new j2i(-93413093, new n9d0(p9d0Var, (byte) 2), true), 2);
                }
                List list4 = (List) obj2;
                rtb0Var3.e(list4.size(), new xg50(list4, (byte) 21), new xg50(list4, (byte) 22), new j2i(2039820996, new ot(list4, p9d0Var, (byte) 11), true));
                return rih1Var;
            case 21:
                izz0 izz0Var = (izz0) obj;
                String str4 = ((c1j0) obj2).d;
                iu30 iu30Var3 = (iu30) obj4;
                if (izz0Var.equals(dzz0.a)) {
                    iu30Var3.invoke(new o0j0(str4));
                } else if (izz0Var.equals(ezz0.a)) {
                    ((Function0) obj3).invoke();
                } else if (izz0Var.equals(gzz0.a)) {
                    iu30Var3.invoke(new s0j0(str4));
                } else if (izz0Var instanceof fzz0) {
                    iu30Var3.invoke(new p0j0(str4, ((fzz0) izz0Var).a));
                } else if (izz0Var instanceof hzz0) {
                    iu30Var3.invoke(new t0j0(str4, ((hzz0) izz0Var).a));
                } else {
                    if (!(izz0Var instanceof czz0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var3.invoke(new m0j0(str4, ((czz0) izz0Var).a));
                }
                return rih1Var;
            case 22:
                ven0 ven0Var2 = (ven0) obj2;
                x8c0 x8c0Var = (x8c0) obj4;
                View view = (View) obj3;
                dt90 dt90Var = new dt90(ven0Var2, x8c0Var, view, (byte) 11);
                ek2 ek2Var = new ek2(dt90Var, (byte) 12);
                x22 x22Var = new x22(dt90Var, (byte) 6);
                p811 p811Var = new p811();
                dt90 dt90Var2 = new dt90(view, p811Var, x22Var, (byte) 10);
                bsc0 bsc0Var = new bsc0(p811Var, x22Var, (byte) 7);
                wus wusVar = new wus(dt90Var2, dt90Var, bsc0Var, ven0Var2);
                x8c0Var.a(ek2Var);
                view.addOnAttachStateChangeListener(wusVar);
                if (view.isAttachedToWindow()) {
                    dt90Var2.invoke();
                }
                dt90Var.invoke();
                return new e96((x8c0) obj4, ek2Var, (View) obj3, wusVar, bsc0Var, (byte) 2);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                azd0 azd0Var = (azd0) obj;
                rzd0 rzd0Var = (rzd0) obj4;
                iu30 iu30Var4 = (iu30) obj2;
                if (azd0Var instanceof dyd0) {
                    dyd0 dyd0Var = (dyd0) azd0Var;
                    String str5 = dyd0Var.a;
                    iu30Var4.invoke(new dyd0(str5, rzd0Var.b(new kzd0(str5, true)), dyd0Var.b));
                } else if (azd0Var instanceof gyd0) {
                    boolean z = ((rwd0) obj3).a.m;
                    gyd0 gyd0Var = (gyd0) azd0Var;
                    boolean z2 = gyd0Var.a;
                    String str6 = gyd0Var.b;
                    if (!z2 && !z) {
                        iu30Var4.invoke(new gyd0(z2, str6, null));
                    } else if (z2 || !z) {
                        iu30Var4.invoke(new gyd0(z2, str6, rzd0Var.a(new kzd0(str6, false))));
                    } else {
                        iu30Var4.invoke(new gyd0(z2, str6, rzd0Var.a(new ozd0(str6))));
                    }
                } else if (azd0Var instanceof ryd0) {
                    iu30Var4.invoke(new ryd0(((ryd0) azd0Var).a, rzd0Var.c()));
                } else if (azd0Var instanceof eyd0) {
                    eyd0 eyd0Var = (eyd0) azd0Var;
                    boolean z3 = eyd0Var.a;
                    if (z3) {
                        iu30Var4.invoke(new eyd0(eyd0Var.b, rzd0Var.b(new jzd0(true)), z3, eyd0Var.c));
                    } else {
                        rzd0Var.a(new jzd0(false));
                        iu30Var4.invoke(azd0Var);
                    }
                } else if (azd0Var instanceof zxd0) {
                    rzd0Var.a(new izd0(((zxd0) azd0Var).a));
                    iu30Var4.invoke(azd0Var);
                } else if (azd0Var.equals(uxd0.a)) {
                    rzd0Var.a(ezd0.a);
                    iu30Var4.invoke(azd0Var);
                } else if (azd0Var.equals(vxd0.a)) {
                    rzd0Var.a(gzd0.a);
                    iu30Var4.invoke(azd0Var);
                } else if (azd0Var instanceof syd0) {
                    rzd0Var.a(new pzd0(((syd0) azd0Var).a));
                    iu30Var4.invoke(azd0Var);
                } else if (azd0Var instanceof yxd0) {
                    String str7 = ((yxd0) azd0Var).a;
                    iu30Var4.invoke(new yxd0(str7, rzd0Var.b(new hzd0(str7))));
                } else if (azd0Var instanceof jyd0) {
                    String str8 = ((jyd0) azd0Var).a;
                    iu30Var4.invoke(new jyd0(str8, rzd0Var.b(new lzd0(str8))));
                } else {
                    iu30Var4.invoke(azd0Var);
                }
                return rih1Var;
            case 24:
                try {
                    String strH = y520.H(new File("/proc/self/task/" + ((Number) obj).intValue() + "/stat"));
                    n811 n811Var = (n811) obj4;
                    n811Var.a = n811Var.a + 1;
                    return strH;
                } catch (IOException e) {
                    ((n811) obj2).a++;
                    ((p811) obj3).a = e;
                    return null;
                }
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                rtb0 rtb0Var4 = (rtb0) obj;
                yge0 yge0Var = (yge0) obj3;
                iu30 iu30Var5 = (iu30) obj2;
                ume0 ume0Var = (ume0) obj4;
                nhe0 nhe0Var = ume0Var.b;
                List list5 = ume0Var.f;
                if (nhe0Var != null) {
                    rtb0.c(rtb0Var4, (Object) null, new j2i(457354954, new cy00(yge0Var, nhe0Var, iu30Var5, (byte) 27), true), 3);
                }
                if (!list5.isEmpty()) {
                    c380 c380VarA = mqo1.A(list5);
                    rtb0.c(rtb0Var4, (Object) null, mxi.a, 3);
                    rtb0Var4.e(c380VarA.size(), new nt(c380VarA, (byte) 8), new nt(c380VarA, (byte) 9), new j2i(2039820996, new rf1(c380VarA, yge0Var, iu30Var5, (byte) 17), true));
                }
                return rih1Var;
            case 26:
                c380 c380Var2 = (c380) obj4;
                ((rtb0) obj).e(c380Var2.size(), new xg50(c380Var2, (byte) 27), new xg50(c380Var2, (byte) 28), new j2i(2039820996, new rf1(c380Var2, (yge0) obj2, (iu30) obj3, (byte) 16), true));
                return rih1Var;
            case 27:
                eqc eqcVar = (eqc) obj;
                mmr0[] mmr0VarArr = p3f0.b;
                mmr0[] mmr0VarArr2 = (mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * 3.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) * 3.0f)) & 4294967295L);
                ArrayList arrayList2 = new ArrayList(mmr0VarArr2.length);
                for (mmr0 mmr0Var : mmr0VarArr2) {
                    u7h u7hVar = (u7h) mmr0Var.b;
                    long j = u7hVar.a;
                    arrayList2.add(u7hVar);
                }
                ArrayList arrayList3 = new ArrayList(mmr0VarArr2.length);
                for (mmr0 mmr0Var2 : mmr0VarArr2) {
                    arrayList3.add(Float.valueOf(((Number) mmr0Var2.a).floatValue()));
                }
                return eqcVar.a(new m3f0((tob1) obj4, (o95) obj2, (dui1) obj3, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * 0.20180225f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) * 0.12577738f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * 0.7697677f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) * 0.87980705f)) & 4294967295L), new mic0(2, 0L, jFloatToRawIntBits, arrayList2, arrayList3)));
            case 28:
                qdf0 qdf0Var = (qdf0) obj4;
                qdf0Var.e((jdf0) obj2);
                qdf0Var.d((jdf0) obj3);
                return rih1Var;
            default:
                qdf0 qdf0Var2 = (qdf0) obj4;
                qdf0Var2.e((jdf0) obj2);
                qdf0Var2.d((jdf0) obj3);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb50(Object obj, Object obj2, String str, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb50(Object obj, Object obj2, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = ven0Var;
    }
}
