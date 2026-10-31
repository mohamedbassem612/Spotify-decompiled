package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumDestinationPageRequest;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.functions.Function;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vrv0 implements Function, uzr0, joj1 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public vrv0(zm81 zm81Var, tm81 tm81Var) {
        this.a = (byte) 2;
        this.f = zm81Var;
        this.c = tm81Var;
        Object obj = zm81Var.b.get(tm81Var.a);
        List list = (List) (obj == null ? z6x.a : obj);
        this.d = list;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((om81) it.next()).a);
        }
        this.e = arrayList;
        List list3 = (List) this.d;
        boolean z = false;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (((om81) it2.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        this.b = z;
    }

    public static zvw0 c(long j, ie30 ie30Var, List list, String str, String str2, n4b1 n4b1Var) {
        List list2 = n4b1Var.a;
        return new zvw0(j, ie30Var, list, str, str2, ((spl) o7h.q0(list2)).a, ((spl) o7h.q0(list2)).c - ((spl) o7h.q0(list2)).b);
    }

    public static void h(kl1 kl1Var, String str, x8v x8vVar) {
        if (str == null || str.length() == 0) {
            Iterator it = z1a1.i(x8vVar, h9v.a).iterator();
            while (it.hasNext()) {
                ((LinkedHashSet) kl1Var.b).add((rpt0) it.next());
            }
        }
    }

    public static x8v k(x8v x8vVar, boolean z, String str) {
        if (z && str != null && str.length() != 0) {
            byte[] bArrDecode = Base64.decode(str, 0);
            if (bArrDecode.length == 16) {
                UUID uuid = h9v.b;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrDecode);
                byte[] bArrM = n3o1.m(uuid, new UUID[]{new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong())}, (byte[]) null);
                tr80 tr80VarQ = yoi1.Q(0, x8vVar.d);
                ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
                lr80 it = tr80VarQ.iterator();
                while (((sr80) it).c) {
                    arrayList.add(x8vVar.a[it.nextInt()]);
                }
                w8v w8vVar = new w8v(h9v.b, "https://spclient.wg.spotify.com", "video/mp4", bArrM);
                String str2 = x8vVar.c;
                w8v[] w8vVarArr = (w8v[]) o7h.O0(w8vVar, arrayList).toArray(new w8v[0]);
                return new x8v(str2, true, (w8v[]) Arrays.copyOf(w8vVarArr, w8vVarArr.length));
            }
        }
        return x8vVar;
    }

    public void a(d3p1 d3p1Var) {
        int i;
        bpb1 bpb1Var = (bpb1) this.e;
        if (d3p1Var instanceof tnj1) {
            boolean z = ((Number) ((inj1) this.c).invoke()).intValue() - ((tnj1) d3p1Var).c < ((Number) ((inj1) this.d).invoke()).intValue();
            if (z) {
                i = !this.b ? 1 : 3;
            } else {
                i = 2;
            }
            if (i == 1) {
                this.b = true;
            }
            coj1 coj1Var = (coj1) bpb1Var.getValue();
            boj1 boj1Var = coj1Var instanceof boj1 ? (boj1) coj1Var : null;
            bpb1Var.m((Object) null, new boj1(i, z, boj1Var != null ? boj1Var.c : false));
            return;
        }
        if (d3p1Var instanceof rnj1) {
            coj1 coj1Var2 = (coj1) bpb1Var.getValue();
            boj1 boj1Var2 = coj1Var2 instanceof boj1 ? (boj1) coj1Var2 : null;
            if (boj1Var2 == null) {
                return;
            }
            bpb1Var.m((Object) null, new boj1(boj1Var2.b, boj1Var2.a, true));
            return;
        }
        if (d3p1Var instanceof snj1) {
            coj1 coj1Var3 = (coj1) bpb1Var.getValue();
            boj1 boj1Var3 = coj1Var3 instanceof boj1 ? (boj1) coj1Var3 : null;
            if (boj1Var3 == null) {
                return;
            }
            bpb1Var.m((Object) null, new boj1(boj1Var3.b, boj1Var3.a, false));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    public Object apply(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String strF;
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        String str9 = null;
        switch (b) {
            case 0:
                uov0 uov0Var = (vov0) obj;
                djw0 djw0Var = (djw0) this.f;
                mzr0 mzr0Var = (mzr0) obj3;
                if (uov0Var instanceof uov0) {
                    uov0 uov0Var2 = uov0Var;
                    str = uov0Var2.a;
                    str2 = uov0Var2.b;
                } else {
                    str = "";
                    str2 = "";
                }
                wdm wdmVar = (wdm) mzr0Var.g;
                String str10 = (String) wdmVar.e;
                if (str10 == null) {
                    str10 = (String) wdmVar.d;
                }
                String str11 = Build.MANUFACTURER;
                String str12 = (String) wdmVar.Z;
                if (u890.j(str12, "com.android.vending")) {
                    str3 = "google";
                } else {
                    str3 = u890.j(str12, "com.amazon.venezia") ? "amazon" : null;
                }
                csv0 csv0VarN = PremiumDestinationPageRequest.n();
                String str13 = (String) obj2;
                if (str13 == null) {
                    str13 = (String) wdmVar.b;
                }
                csv0VarN.C(str13);
                csv0VarN.s((String) wdmVar.c);
                csv0VarN.B(str);
                csv0VarN.E(str2);
                csv0VarN.q(str10);
                String str14 = (String) wdmVar.g;
                if (str14 != null) {
                    csv0VarN.w(str14);
                }
                String str15 = (String) wdmVar.h;
                if (str15 != null) {
                    csv0VarN.z(str15);
                }
                if (djw0Var == null || (str4 = djw0Var.a) == null) {
                    str4 = (String) wdmVar.i;
                }
                if (str4 != null) {
                    csv0VarN.v(str4);
                }
                str9 = djw0Var != null ? "scheduler-api" : null;
                if (str9 != null) {
                    csv0VarN.y(str9);
                }
                csv0VarN.F(false);
                if (djw0Var != null && (str8 = djw0Var.c) != null) {
                    str11 = str8;
                }
                if (str11 != null) {
                    csv0VarN.u(str11);
                }
                if (djw0Var == null || (str5 = djw0Var.d) == null) {
                    str5 = (String) this.e;
                }
                if (str5 != null) {
                    csv0VarN.A(str5);
                }
                if (djw0Var == null || (str6 = djw0Var.e) == null) {
                    str6 = (String) wdmVar.t;
                }
                if (str6 != null) {
                    csv0VarN.t(str6);
                }
                String str16 = (String) wdmVar.X;
                if (str16 != null) {
                    csv0VarN.r(str16);
                }
                String str17 = (String) wdmVar.Y;
                if (str17 != null) {
                    csv0VarN.x(str17);
                }
                if (str3 != null) {
                    csv0VarN.n(str3);
                }
                if (djw0Var != null && (str7 = djw0Var.d) != null) {
                    csv0VarN.D(str7);
                }
                return (this.b ? (yrv0) mzr0Var.f : (yrv0) mzr0Var.d).a((PremiumDestinationPageRequest) csv0VarN.build());
            default:
                YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs yourLibraryPredefinedPlaylistConfigs = (YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs) obj;
                gvm1 gvm1VarO = YourLibraryRequest.o();
                hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
                boolean z = this.b;
                s4b1 s4b1Var = (s4b1) obj3;
                zxl1 zxl1Var = (zxl1) this.e;
                r9c r9cVar = (r9c) this.f;
                String str18 = (String) obj2;
                hvm1VarQ.C(350);
                if (z && (strF = s4b1Var.f()) != null) {
                    rhc rhcVarV = u890.v(strF);
                    if (rhcVarV.a.length != 8) {
                        hhg1.f("Invalid folderId, ".concat(strF));
                        return null;
                    }
                    hvm1VarQ.v(rhcVarV.a().asLongBuffer().get());
                }
                hvm1VarQ.I(((r2a1) zxl1Var.b).k(r9cVar, str18, s4b1Var));
                jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
                boolean z2 = r9cVar.g;
                ksm1 ksm1Var = ksm1.i;
                if (!z2) {
                    jsm1VarR.q(ksm1Var);
                }
                ksm1 ksm1Var2 = ksm1.d;
                if (z) {
                    str9 = ksm1Var2;
                } else {
                    String str19 = r9cVar.b;
                    if (u890.j(str19, "com.spotify.your-albums")) {
                        str9 = ksm1.b;
                    } else if (u890.j(str19, "com.spotify.your-artists")) {
                        str9 = ksm1.c;
                    } else if (u890.j(str19, "com.spotify.your-playlists")) {
                        str9 = ksm1Var2;
                    } else if (u890.j(str19, "com.spotify.your-podcasts")) {
                        str9 = ksm1.e;
                    } else if (u890.j(str19, "com.spotify.your-audiobooks")) {
                        str9 = ksm1.f;
                    } else if (u890.j(str19, "com.spotify.downloaded")) {
                        str9 = ksm1Var;
                    } else {
                        u890.j(str19, "com.spotify.your-library");
                    }
                }
                if (str9 != null) {
                    jsm1VarR.q(str9);
                }
                hvm1VarQ.u(jsm1VarR.build());
                gvm1VarO.n(hvm1VarQ);
                gvm1VarO.s(yourLibraryPredefinedPlaylistConfigs);
                return gvm1VarO.build();
        }
    }

    public void b() {
        TabLayout tabLayout = (TabLayout) this.c;
        ViewPager2 viewPager2 = (ViewPager2) this.d;
        if (this.b) {
            eg.m("TabLayoutMediator is already attached");
            return;
        }
        z511 adapter = viewPager2.getAdapter();
        this.f = adapter;
        if (adapter == null) {
            eg.m("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.b = true;
        viewPager2.b(new ihd1(tabLayout));
        tabLayout.a(new pwd(viewPager2, (byte) 3));
        ((z511) this.f).w(new pn(this, (byte) 6));
        j();
        tabLayout.k(0.0f, viewPager2.getCurrentItem(), true, true);
    }

    public /* bridge */ /* synthetic */ Object d(Uri uri, g3r g3rVar) {
        return i(g3rVar);
    }

    public void e(String str) {
        Exception exc = new Exception(str);
        Iterator it = new ArrayList((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ((SingleEmitter) it.next()).onError(exc);
        }
    }

    public Single f(boolean z) {
        return Single.create(new s7s(this, z, (byte) 8));
    }

    public void g(Intent intent, int i) {
        if (((Boolean) ((x0s0) this.d).a.apply(intent, Integer.valueOf(i))).booleanValue()) {
            return;
        }
        e("Account linking fragment is not present");
    }

    public xe01 getState() {
        return (xe01) this.f;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25851. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public p.d5b1 i(java.io.InputStream r37) {
        /*
            Method dump skipped, instruction units count: 2585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vrv0.i(java.io.InputStream):p.d5b1");
    }

    public void j() {
        TabLayout tabLayout = (TabLayout) this.c;
        tabLayout.i();
        z511 z511Var = (z511) this.f;
        if (z511Var != null) {
            int iE = z511Var.e();
            for (int i = 0; i < iE; i++) {
                dhd1 dhd1VarH = tabLayout.h();
                ((hhd1) this.e).a(dhd1VarH, i);
                tabLayout.b(dhd1VarH, false);
            }
            if (iE > 0) {
                int iMin = Math.min(((ViewPager2) this.d).getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.j(tabLayout.g(iMin), true);
                }
            }
        }
    }

    public void l() {
        if (this.b) {
            ymk0 ymk0Var = ((zm81) this.f).a;
            tm81 tm81Var = (tm81) this.c;
            dma1 dma1Var = ymk0Var.b;
            vm81 vm81Var = new vm81(ymk0Var, tm81Var, (byte) 0);
            hma1 hma1VarEdit = dma1Var.edit();
            vm81Var.invoke(hma1VarEdit);
            hma1VarEdit.g();
        }
    }

    public void m() {
        if (this.b) {
            ymk0 ymk0Var = ((zm81) this.f).a;
            tm81 tm81Var = (tm81) this.c;
            dma1 dma1Var = ymk0Var.b;
            vm81 vm81Var = new vm81(ymk0Var, tm81Var, (byte) 1);
            hma1 hma1VarEdit = dma1Var.edit();
            vm81Var.invoke(hma1VarEdit);
            hma1VarEdit.g();
        }
    }

    public void reset() {
        this.b = false;
    }

    public vrv0(mzr0 mzr0Var, String str, djw0 djw0Var, String str2, boolean z) {
        this.a = (byte) 0;
        this.c = mzr0Var;
        this.d = str;
        this.f = djw0Var;
        this.e = str2;
        this.b = z;
    }

    public vrv0(boolean z, s4b1 s4b1Var, zxl1 zxl1Var, r9c r9cVar, String str) {
        this.a = (byte) 7;
        this.b = z;
        this.c = s4b1Var;
        this.e = zxl1Var;
        this.f = r9cVar;
        this.d = str;
    }

    public vrv0(inj1 inj1Var, inj1 inj1Var2) {
        this.a = (byte) 5;
        this.c = inj1Var;
        this.d = inj1Var2;
        bpb1 bpb1VarB = gio1.b(new boj1(2, false, false));
        this.e = bpb1VarB;
        this.f = d5p1.h(bpb1VarB);
    }

    public vrv0(u9c u9cVar, String str, l2t l2tVar, sln1 sln1Var) {
        this.a = (byte) 8;
        this.f = u9cVar;
        this.d = str;
        this.c = l2tVar;
        this.e = sln1Var;
        this.b = true;
    }

    public vrv0(w741 w741Var, x0s0 x0s0Var, d1s0 d1s0Var, g741 g741Var) {
        this.a = (byte) 1;
        this.e = new ArrayList(2);
        this.f = j5.a;
        this.c = w741Var;
        this.d = x0s0Var;
        x0s0Var.b = new jf11(this, (byte) 8);
        this.b = d1s0Var.a() && g741Var.a() >= 1100000000;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vrv0(nfa0 nfa0Var, qma qmaVar, int i) {
        this(nfa0Var, qmaVar, "unknown", (i & 8) == 0);
        this.a = (byte) 3;
    }

    public vrv0(nfa0 nfa0Var, qma qmaVar, String str, boolean z) {
        this.a = (byte) 3;
        this.c = nfa0Var;
        this.e = qmaVar;
        this.d = str;
        this.b = z;
        this.f = new LinkedHashMap();
    }

    public vrv0(TabLayout tabLayout, ViewPager2 viewPager2, hhd1 hhd1Var) {
        this.a = (byte) 6;
        this.c = tabLayout;
        this.d = viewPager2;
        this.e = hhd1Var;
    }

    public vrv0(Function0 function0, boolean z) {
        this.a = (byte) 4;
        this.b = z;
        this.c = function0;
        this.d = c97.b(0.0f);
        this.e = new ArrayList();
    }
}
