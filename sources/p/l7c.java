package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class l7c implements au11, ldd1, Function, tax, vf10, g1d1, mqr0, z1g0, ya, c290, it41, zdl1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ l7c(byte b) {
        this.a = b;
    }

    public static final String f(hi hiVar) {
        ArrayList arrayList = wfa1.i;
        String str = ((qi) hiVar).b;
        if (o7h.i0(wfa1.j, str)) {
            return "https://spotify-tap.spotifycdn.com/onboarding/generic/Headphones_Spotify_Tap.json";
        }
        return o7h.i0(wfa1.k, str) ? "https://spotify-tap.spotifycdn.com/onboarding/generic/Speaker_Spotify_Tap.json" : "https://spotify-tap.spotifycdn.com/onboarding/generic/Earbuds_Spotify_Tap.json";
    }

    public static final int i(hi hiVar) {
        ArrayList arrayList = wfa1.i;
        return o7h.i0(wfa1.k, ((qi) hiVar).b) ? 2131963037 : 2131963036;
    }

    public static String l(StringBuilder sb) {
        int length = sb.length();
        if (length == 0) {
            eg.m("StringBuilder must not be empty");
            return null;
        }
        int iCharAt = (sb.charAt(0) << 18) + ((length >= 2 ? sb.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb.charAt(3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & 255);
        char c2 = (char) ((iCharAt >> 8) & 255);
        char c3 = (char) (iCharAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c);
        if (length >= 2) {
            sb2.append(c2);
        }
        if (length >= 3) {
            sb2.append(c3);
        }
        return sb2.toString();
    }

    public static blc0 m(int i) {
        return blc0.b[i];
    }

    public static int n(String str, String str2) {
        if (str2 != null) {
            str = str2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1) {
            return iHashCode;
        }
        return 0;
    }

    public static g4t p(gmh1 gmh1Var, boolean z) {
        boolean zE;
        if (gmh1Var instanceof g4t) {
            return (g4t) gmh1Var;
        }
        gmh1Var.t0();
        if ((gmh1Var.t0().s() instanceof y0h1) || (gmh1Var instanceof w8o0)) {
            z0h1 z0h1VarS = gmh1Var.t0().s();
            z0h1 z0h1Var = z0h1VarS instanceof z0h1 ? z0h1VarS : null;
            zE = true;
            if (z0h1Var == null || z0h1Var.Z) {
                zE = (z && (gmh1Var.t0().s() instanceof y0h1)) ? o1h1.e(gmh1Var) : true ^ jto1.x(c4x0.N0.r0(), i3p1.C(gmh1Var), g0h1.d);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (gmh1Var instanceof dq20) {
            dq20 dq20Var = (dq20) gmh1Var;
            u890.j(dq20Var.b.t0(), dq20Var.c.t0());
        }
        return new g4t(i3p1.C(gmh1Var).A0(false), z);
    }

    public void a(MainLayout mainLayout, b2g0 b2g0Var) {
        h2g0 h2g0Var = (h2g0) b2g0Var;
        View navigationContainerTop = mainLayout.getNavigationContainerTop();
        boolean z = h2g0Var.a;
        navigationContainerTop.setVisibility(z ? 0 : 8);
        Iterator it = mainLayout.getNowPlayingViews().iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).setVisibility(h2g0Var.b ? 0 : 8);
        }
        mainLayout.getBannerContainer().setVisibility(h2g0Var.c ? 0 : 8);
        Iterator it2 = mainLayout.getBottomGradientViews().iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(z ? 0 : 8);
        }
        View navigationContainerTop2 = z ? mainLayout.getNavigationContainerTop() : mainLayout.getFragmentContainer();
        MainLayoutContentContainerView responseAgentContainer = mainLayout.getResponseAgentContainer();
        qhl layoutParams = responseAgentContainer.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        qhlVar.t = navigationContainerTop2.getId();
        qhlVar.v = navigationContainerTop2.getId();
        responseAgentContainer.setLayoutParams(qhlVar);
        MainLayoutContentContainerView thinkingAgentContainer = mainLayout.getThinkingAgentContainer();
        qhl layoutParams2 = thinkingAgentContainer.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar2 = layoutParams2;
        qhlVar2.t = navigationContainerTop2.getId();
        qhlVar2.v = navigationContainerTop2.getId();
        thinkingAgentContainer.setLayoutParams(qhlVar2);
    }

    public boolean accept(Object obj) {
        switch (this.a) {
            case 18:
                return ((ksk) obj).c == le30.d1;
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:141:0x0240  */
    /* JADX WARN: Code duplicated, block: B:143:0x0245  */
    /* JADX WARN: Code duplicated, block: B:144:0x0248  */
    /* JADX WARN: Code duplicated, block: B:170:0x0282 A[PHI: r2
      0x0282: PHI (r2v10 int) = (r2v0 int), (r2v11 int) binds: [B:160:0x026d, B:163:0x0272] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x01e1  */
    public Object apply(Object obj) {
        String str;
        String str2;
        int i;
        long jH;
        cen cenVar;
        String str3;
        String str4;
        String str5;
        String string;
        String str6;
        String strO;
        String strProvider;
        int i2;
        jtw0 itw0Var;
        int i3 = 3;
        int i4 = 2;
        switch (this.a) {
            case 3:
                return new w23((String) obj);
            case 9:
                i1z i1zVar = ((i9z) obj).a;
                tu00 tu00Var = i1zVar.D;
                boolean zK = k8p1.k(tu00Var.a(b9v0.class));
                String str7 = i1zVar.a;
                g281 g281Var = i1zVar.z;
                String str8 = (g281Var == null || (str6 = g281Var.a) == null) ? "" : str6;
                if (g281Var == null || (str5 = g281Var.d) == null) {
                    str = "";
                } else {
                    int length = str5.length() - 1;
                    int i5 = 0;
                    boolean z = false;
                    while (i5 <= length) {
                        boolean z2 = u890.q(str5.charAt(!z ? i5 : length), 32) <= 0;
                        if (z) {
                            if (z2) {
                                length--;
                            } else {
                                string = str5.subSequence(i5, length + 1).toString();
                                if (string == null) {
                                    str = "";
                                } else {
                                    str = string;
                                }
                            }
                        } else if (z2) {
                            i5++;
                        } else {
                            z = true;
                        }
                    }
                    string = str5.subSequence(i5, length + 1).toString();
                    if (string == null) {
                        str = "";
                    } else {
                        str = string;
                    }
                }
                String str9 = (g281Var == null || (str4 = g281Var.e) == null) ? "" : str4;
                String str10 = (g281Var == null || (cenVar = g281Var.j) == null || (str3 = cenVar.a) == null) ? "" : str3;
                cen cenVar2 = i1zVar.d;
                String str11 = cenVar2.a;
                String str12 = cenVar2.c;
                if (g281Var != null) {
                    cen cenVar3 = g281Var.j;
                    String str13 = cenVar3.c;
                    String str14 = cenVar3.a;
                    boolean z3 = (str12 == null || str12.length() == 0 || str12.equals(str14) || str12.equals(str13)) ? false : true;
                    boolean z4 = (str11 == null || str11.length() == 0 || str11.equals(str14) || str11.equals(str13)) ? false : true;
                    if (z3) {
                        str2 = str12;
                    } else if (z4) {
                        str2 = str11;
                    } else {
                        str2 = null;
                    }
                } else {
                    boolean z5 = str12 != null && str12.length() > 0;
                    boolean z6 = str11.length() > 0;
                    if (z5) {
                        str2 = str12;
                    } else if (z6) {
                        str2 = str11;
                    } else {
                        str2 = null;
                    }
                }
                int iC = l1d.C(i1zVar.E);
                if (iC == 0) {
                    i = 1;
                } else if (iC == 1) {
                    i = i4;
                } else {
                    if (iC != 2) {
                        i4 = 4;
                        if (iC != 3) {
                            i3 = 5;
                            if (iC != 4) {
                                if (iC != 5) {
                                    eg.o();
                                    return null;
                                }
                                i3 = 6;
                            }
                        } else {
                            i = i4;
                        }
                    }
                    i = i3;
                }
                r4z r4zVar = new r4z(zK, str7, str8, str, str9, str10, str2, i, i1zVar.B, i1zVar.v);
                boolean zK2 = k8p1.k(tu00Var.a(b9v0.class));
                Integer num = i1zVar.r;
                if (num != null) {
                    int iIntValue = i1zVar.q - num.intValue();
                    ytw0 ytw0Var = jfv.b;
                    jH = jfv.h(fdg1.k0(iIntValue, ngv.e));
                } else {
                    jH = 0;
                }
                return new zit0(r4zVar, zK2, jH);
            case 16:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                if (contextTrack == null || !l4o1.U(contextTrack)) {
                    strO = o4p1.o(playerState);
                } else {
                    ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
                    strO = contextTrack2 != null ? l4o1.a0(contextTrack2, "pointer.uri") : null;
                    if (strO == null) {
                        strO = o4p1.o(playerState);
                    }
                }
                ContextTrack contextTrack3 = (ContextTrack) playerState.track().h();
                if (contextTrack3 == null || (strProvider = contextTrack3.provider()) == null) {
                    strProvider = "unknown";
                }
                return new ufm0(strO, strProvider);
            case 21:
                bbz0 bbz0Var = (bbz0) obj;
                int iOrdinal = bbz0Var.c.ordinal();
                if (iOrdinal == 0) {
                    i2 = 1;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            i2 = 3;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    i2 = 2;
                }
                int iC2 = l1d.C(bbz0Var.b);
                if (iC2 == 0) {
                    itw0Var = new itw0(bbz0Var.k, bbz0Var.d, bbz0Var.e, bbz0Var.g, bbz0Var.h, bbz0Var.f, bbz0Var.i, bbz0Var.j, bbz0Var.l, bbz0Var.m);
                } else if (iC2 == 1) {
                    itw0Var = new htw0(i2, bbz0Var.k, bbz0Var.d, bbz0Var.e, bbz0Var.f, bbz0Var.g, bbz0Var.h, bbz0Var.i, bbz0Var.j, bbz0Var.l, bbz0Var.m);
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    itw0Var = jtw0.l;
                }
                return new a8z0(itw0Var);
            default:
                List list = ((teh1) obj).a;
                ArrayList<sf51> arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r7h.W(((peh1) it.next()).a, arrayList);
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (sf51 sf51Var : arrayList) {
                    String str15 = sf51Var.a;
                    if (str15 == null) {
                        str15 = "";
                    }
                    List list2 = sf51Var.b;
                    ArrayList<bi51> arrayList3 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (((bi51) obj2).e != null) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    for (bi51 bi51Var : arrayList3) {
                        String str16 = bi51Var.e;
                        wlc0 wlc0Var = bi51Var.b;
                        if (str16 == null) {
                            str16 = wlc0Var.a;
                        }
                        String str17 = str16;
                        String str18 = bi51Var.c;
                        String str19 = bi51Var.d;
                        arrayList4.add(new aa51(str18, str19 == null ? "" : str19, bi51Var.a.a, str17, wlc0Var.a, (String) null));
                    }
                    arrayList2.add(new ba51(str15, arrayList4));
                }
                return arrayList2;
        }
    }

    public h1d1 b(uqs uqsVar) {
        return new wk30((Context) uqsVar.c, (String) uqsVar.d, (up20) uqsVar.e, uqsVar.a, uqsVar.b);
    }

    public void c(xax xaxVar) {
        boolean z;
        String str = xaxVar.a;
        StringBuilder sb = xaxVar.c;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            z = true;
            if (!xaxVar.b()) {
                break;
            }
            char cA = xaxVar.a();
            if (cA >= ' ' && cA <= '?') {
                sb2.append(cA);
            } else {
                if (cA < '@' || cA > '^') {
                    eko1.w(cA);
                    throw null;
                }
                sb2.append((char) (cA - '@'));
            }
            xaxVar.d++;
            if (sb2.length() >= 4) {
                sb.append(l(sb2));
                sb2.delete(0, 4);
                if (eko1.A(xaxVar.d, 4, str) != 4) {
                    xaxVar.e = 0;
                    break;
                }
            }
        }
        sb2.append((char) 31);
        try {
            int length = sb2.length();
            if (length == 0) {
                xaxVar.e = 0;
                return;
            }
            if (length == 1) {
                xaxVar.c(sb.length());
                int length2 = xaxVar.f.b - sb.length();
                int length3 = (str.length() - xaxVar.g) - xaxVar.d;
                if (length3 > length2) {
                    xaxVar.c(sb.length() + 1);
                    length2 = xaxVar.f.b - sb.length();
                }
                if (length3 <= length2 && length2 <= 2) {
                    xaxVar.e = 0;
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String strL = l(sb2);
            if (xaxVar.b() || i > 2) {
                z = false;
            }
            if (i <= 2) {
                xaxVar.c(sb.length() + i);
                if (xaxVar.f.b - sb.length() >= 3) {
                    xaxVar.c(sb.length() + strL.length());
                    z = false;
                }
            }
            if (z) {
                xaxVar.f = null;
                xaxVar.d -= i;
            } else {
                sb.append(strL);
            }
            xaxVar.e = 0;
        } catch (Throwable th) {
            xaxVar.e = 0;
            throw th;
        }
    }

    public Object convert(int i) {
        c4u0 c4u0VarA = c4u0.a(i);
        return c4u0VarA == null ? c4u0.Z0 : c4u0VarA;
    }

    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        dw50 dw50Var = new dw50(parcel);
        dw50Var.a = parcel.readFloat();
        dw50Var.b = parcel.readInt() != 0;
        return dw50Var;
    }

    public void d() {
        wf10.u = true;
    }

    public b2g0 e(c2g0 c2g0Var) {
        ggr0 ggr0Var = c2g0Var.a;
        if (ggr0Var instanceof dgr0) {
            return new h2g0(true, true, true);
        }
        if (ggr0Var instanceof egr0) {
            return new h2g0(false, false, false);
        }
        if (ggr0Var instanceof fgr0) {
            return new h2g0(true, true, true);
        }
        eg.o();
        return null;
    }

    public List h(MainLayout mainLayout, b2g0 b2g0Var, a2g0 a2g0Var) {
        c7p0 c7p0Var = a2g0Var.a;
        smc0 smc0VarN = k4p1.n();
        ogc0 ogc0Var = new ogc0(80);
        ogc0Var.b(mainLayout.getNavigationContainerTop());
        Iterator it = mainLayout.getBottomGradientViews().iterator();
        while (it.hasNext()) {
            ogc0Var.b((View) it.next());
        }
        c7p0 c7p0Var2 = c7p0.b;
        if (c7p0Var == c7p0Var2) {
            Iterator it2 = mainLayout.getNowPlayingViews().iterator();
            while (it2.hasNext()) {
                ogc0Var.b((View) it2.next());
            }
        }
        smc0VarN.add(ogc0Var);
        ogc0 ogc0Var2 = new ogc0(48);
        ogc0Var2.b(mainLayout.getBannerContainer());
        smc0VarN.add(ogc0Var2);
        if (c7p0Var != c7p0Var2) {
            ogc0 ogc0Var3 = new ogc0(8388613);
            Iterator it3 = mainLayout.getNowPlayingViews().iterator();
            while (it3.hasNext()) {
                ogc0Var3.b((View) it3.next());
            }
            smc0VarN.add(ogc0Var3);
        }
        rce rceVar = new rce();
        rceVar.b(mainLayout.getFragmentContainer());
        rceVar.b(mainLayout.getResponseAgentContainer());
        rceVar.b(mainLayout.getThinkingAgentContainer());
        smc0VarN.add(rceVar);
        return k4p1.k(smc0VarN);
    }

    public boolean j() {
        return false;
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        return null;
    }

    public Object[] newArray(int i) {
        return new dw50[i];
    }

    public Signature[] o(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void g(int i) {
    }
}
