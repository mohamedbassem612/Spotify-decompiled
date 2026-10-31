package p;

import android.app.Application;
import android.net.Uri;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerError;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uic implements Function, Init, c290, Predicate, BiPredicate, ya {
    public final /* synthetic */ byte a;

    public static s4b1 A(String str) {
        if (str.length() != 22) {
            hhg1.n("Failed requirement.");
            return null;
        }
        return x("spotify:show:" + str + ":settings");
    }

    public static s4b1 B(String str) {
        if (str.length() == 22) {
            return x("spotify:track:".concat(str));
        }
        hhg1.n("Failed requirement.");
        return null;
    }

    public static s4b1 C(String str, String str2) {
        String strM = l1d.m("spotify:user:", Uri.encode(str));
        if (str2 != null) {
            strM = f4i1.f(strM, ":", str2);
        }
        return x(strM);
    }

    public static s4b1 D(String str) {
        return x("spotify:presents:wrappedshareinstance:".concat(str));
    }

    public static s4b1 b(String str) {
        if (str.length() == 22) {
            return x("spotify:album:".concat(str));
        }
        hhg1.n("Failed requirement.");
        return null;
    }

    public static s4b1 c(String str) {
        if (str.length() == 22) {
            return x("spotify:artist:".concat(str));
        }
        hhg1.n("Failed requirement.");
        return null;
    }

    public static vsr0 d(String str, String str2) {
        return new vsr0(f4i1.f(str, "---", str2));
    }

    public static s4b1 e(String str) {
        return x("spotify:user:" + Uri.encode(str) + ":collection:your-episodes");
    }

    public static s4b1 f(String str) {
        if (str.length() == 22) {
            return x("spotify:concept:".concat(str));
        }
        hhg1.n("Failed requirement.");
        return null;
    }

    public static boolean g(String str, blc0 blc0Var) {
        return x(str).c == blc0Var;
    }

    public static boolean h(String str, blc0... blc0VarArr) {
        s4b1 s4b1VarX = x(str);
        for (blc0 blc0Var : blc0VarArr) {
            if (blc0Var == s4b1VarX.c) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(String str, LinkedHashSet linkedHashSet) {
        v5b1 v5b1Var = x(str).d;
        if (v5b1Var == null) {
            return false;
        }
        return linkedHashSet.contains(v5b1Var.getType());
    }

    public static boolean j(String str, b3i1 b3i1Var) {
        v5b1 v5b1Var = x(str).d;
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, b3i1Var);
    }

    public static boolean k(String str, b3i1... b3i1VarArr) {
        v5b1 v5b1Var = x(str).d;
        if (v5b1Var != null) {
            for (b3i1 b3i1Var : b3i1VarArr) {
                if (u890.j(b3i1Var, v5b1Var.getType())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void l(Application application, String str, String str2, cnr cnrVar, bvz0 bvz0Var) {
        synchronized (pvz0.n) {
            llm llmVar = pvz0.q;
            if (llmVar != null) {
                fn31.T(llmVar, (o8n) null, 0, new hvz0(bvz0Var, application, str, str2, cnrVar, (lnm) null), 3);
            }
        }
    }

    public static s4b1 m(String str) {
        if (str.length() != 22) {
            hhg1.n("Failed requirement.");
            return null;
        }
        return x("spotify:internal:navigation:podcast:episode:" + str + ":comments");
    }

    public static s4b1 n() {
        return x("spotify:internal:comments:reaction-sheet");
    }

    public static s4b1 o(String str, String str2) {
        if (str.length() != 22) {
            hhg1.n("Failed requirement.");
            return null;
        }
        if (str2.length() != 22) {
            hhg1.n("Failed requirement.");
            return null;
        }
        return x("spotify:internal:navigation:podcast:episode:" + str + ":comments:" + str2);
    }

    public static s4b1 p(String str) {
        if (str.length() == 22) {
            return x("spotify:episode:".concat(str));
        }
        hhg1.n("Failed requirement.");
        return null;
    }

    public static ArrayList q(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            b9v0 b9v0VarA = ((i1z) obj).D.a(b9v0.class);
            if (!(b9v0VarA != null ? b9v0VarA.d : false)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String r(vsr0 vsr0Var) {
        String str = vsr0Var.a;
        List listQ0 = ihc1.Q0(str, new String[]{"---"}, 0, 6);
        return listQ0.size() == 2 ? (String) listQ0.get(1) : str;
    }

    public static LinkedHashSet s() {
        return s4b1.g;
    }

    public static String t(vsr0 vsr0Var) {
        List listQ0 = ihc1.Q0(vsr0Var.a, new String[]{"---"}, 0, 6);
        if (listQ0.size() == 2) {
            return (String) listQ0.get(0);
        }
        return null;
    }

    public static boolean u(String str) {
        s4b1 s4b1VarX = x(str);
        return (s4b1VarX.c == blc0.o6 && s4b1VarX.d == null) ? false : true;
    }

    public static s4b1 v(String str, String str2) {
        return x("spotify:list:" + Uri.encode(str) + ":" + Uri.encode(str2));
    }

    public static s4b1 w(String str) {
        return x("spotify:listening-activity:details:" + Uri.encode(str));
    }

    public static s4b1 x(String str) {
        Map map = s4b1.j;
        s4b1 s4b1Var = (s4b1) map.get(str);
        if (s4b1Var != null) {
            return s4b1Var;
        }
        s4b1 s4b1Var2 = new s4b1(str);
        map.put(str, s4b1Var2);
        return s4b1Var2;
    }

    public static s4b1 y(String str) {
        return x("spotify:playlist:".concat(str));
    }

    public static s4b1 z(String str) {
        if (str.length() == 22) {
            return x("spotify:show:".concat(str));
        }
        hhg1.n("Failed requirement.");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    public void a(kba0 kba0Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1355179395);
        int i2 = i | (x340Var.g(kba0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | 24576 | (x340Var.g(this) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            if (kba0Var instanceof iba0) {
                x340Var.i0(543522906);
                iba0 iba0Var = (iba0) kba0Var;
                xea0 xea0Var = iba0Var.g;
                oa10 oa10Var = iba0Var.f;
                boolean z = oa10Var != null && oa10Var.d;
                boolean z2 = iba0Var.h;
                no90 no90Var = iba0Var.c;
                no90 no90Var2 = iba0Var.d;
                int iOrdinal = xea0Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 13) {
                        no90Var = null;
                    }
                } else if (!z) {
                    if (z2) {
                        no90Var = null;
                    } else {
                        no90Var = no90Var2;
                    }
                }
                int i3 = i2 & 14;
                int i4 = i2 << 3;
                sgc1.b(iba0Var, no90Var, iu30Var, iu30Var2, function0, x340Var, (i4 & 57344) | i3 | (i4 & 896) | (i4 & 7168) | 196608);
                x340Var.r(false);
            } else {
                if (!kba0Var.equals(jba0.a)) {
                    throw p3d1.k(x340Var, -952299559, false);
                }
                x340Var.i0(544211075);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy(this, kba0Var, iu30Var, iu30Var2, function0, qim0Var2, i, (byte) 9);
        }
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).b;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new gmc(ulc.p(), "device:back-online:v1", TriggerType.CLIENT_EVENT, (String) obj, (tv80) null, (uy31) null, (DynamicTagsMetadata) null, new d3j0(new z2j0(false), x2j0.a), 496);
            case 3:
                return mfo.b.get(obj);
            case 16:
                th61 th61Var = (th61) obj;
                if (th61Var.c || th61Var.d) {
                    return a4n0.a;
                }
                return th61Var.b ? a4n0.b : a4n0.c;
            default:
                Map map = (Map) obj;
                return new tvw0(y7y0.t("has-podcasts-available", map), y7y0.L(map), rh11.c(map), y7y0.t("disable-blocked-content", map), y7y0.t("apply-child-content-restrictions", map), y7y0.x(map));
        }
    }

    public Object convert(int i) {
        wv11 wv11Var = null;
        switch (this.a) {
            case 9:
                if (i == 0) {
                    wv11Var = eoz.b;
                } else if (i == 1) {
                    wv11Var = eoz.c;
                } else if (i == 2) {
                    wv11Var = eoz.d;
                }
                return wv11Var == null ? eoz.e : wv11Var;
            case 11:
                mig migVarA = mig.a(i);
                return migVarA == null ? mig.f : migVarA;
            case 22:
                if (i == 0) {
                    wv11Var = wv11.RELEASE_TAG_UNKNOWN;
                } else if (i == 1) {
                    wv11Var = wv11.RELEASE_TAG_LATEST_RELEASE;
                } else if (i == 2) {
                    wv11Var = wv11.RELEASE_TAG_PRE_RELEASE;
                }
                return wv11Var == null ? wv11.UNRECOGNIZED : wv11Var;
            default:
                hjh1 hjh1VarA = hjh1.a(i);
                return hjh1VarA == null ? hjh1.Y : hjh1VarA;
        }
    }

    public First e0(Object obj) {
        t8g t8gVar = (t8g) obj;
        s8g s8gVar = t8gVar.a;
        boolean z = s8gVar instanceof a8g;
        e6g e6gVar = e6g.a;
        if (z) {
            return First.c(new t8g(f8g.a), Collections.singleton(e6gVar));
        }
        if (s8gVar instanceof f8g) {
            return First.c(t8gVar, Collections.singleton(e6gVar));
        }
        if (s8gVar instanceof g8g) {
            t7g t7gVar = ((g8g) s8gVar).a;
            return First.c(t8gVar, Collections.singleton(new f6g(t7gVar.a, t7gVar.b)));
        }
        boolean z2 = s8gVar instanceof e8g;
        d6g d6gVar = d6g.a;
        if (z2) {
            e8g e8gVar = (e8g) s8gVar;
            return e8gVar.c == 1 ? First.c(new t8g(new u7g(e8gVar.a, e8gVar.b)), Collections.singleton(d6gVar)) : First.b(t8gVar);
        }
        if (s8gVar instanceof k8g) {
            return First.c(new t8g(v7g.a), Collections.singleton(d6gVar));
        }
        if (s8gVar instanceof o8g) {
            return First.c(t8gVar, Collections.singleton(o6g.a));
        }
        if (s8gVar instanceof w7g) {
            return First.c(t8gVar, Collections.singleton(d6gVar));
        }
        if ((s8gVar instanceof c8g) || (s8gVar instanceof d8g) || (s8gVar instanceof h8g) || (s8gVar instanceof l8g) || (s8gVar instanceof j8g) || (s8gVar instanceof r8g) || (s8gVar instanceof z7g) || (s8gVar instanceof b8g)) {
            return First.b(t8gVar);
        }
        eg.o();
        return null;
    }

    public boolean test(Object obj, Object obj2) {
        z6x0 z6x0Var = (z6x0) obj;
        z6x0 z6x0Var2 = (z6x0) obj2;
        z6x0Var.getClass();
        z6x0Var2.getClass();
        m3x0 m3x0Var = z6x0Var.a;
        String str = m3x0Var.c;
        m3x0 m3x0Var2 = z6x0Var2.a;
        return u890.j(str, m3x0Var2.c) && u890.j(m3x0Var.a, m3x0Var2.a) && m3x0Var.f == m3x0Var2.f && u890.j(m3x0Var.d, m3x0Var2.d) && m3x0Var.i == m3x0Var2.i && u890.j(m3x0Var.X, m3x0Var2.X) && m3x0Var.Z == m3x0Var2.Z && z6x0Var.b == z6x0Var2.b && z6x0Var.c == z6x0Var2.c && z6x0Var.d == z6x0Var2.d && z6x0Var.e == z6x0Var2.e && z6x0Var.h == z6x0Var2.h && z6x0Var.i == z6x0Var2.i && u890.j(m3x0Var.Q0, m3x0Var2.Q0) && u890.j(m3x0Var.S0, m3x0Var2.S0) && u890.j(m3x0Var.R0, m3x0Var2.R0) && u890.j(m3x0Var.U0, m3x0Var2.U0) && m3x0Var.f1 == m3x0Var2.f1 && m3x0Var.g1 == m3x0Var2.g1 && u890.j(m3x0Var.i1, m3x0Var2.i1) && m3x0Var.W0 == m3x0Var2.W0 && z6x0Var.t == z6x0Var2.t && z6x0Var.X == z6x0Var2.X;
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "SCROLL";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ uic(byte b) {
        this.a = b;
    }

    public boolean test(Object obj) {
        String strTrackUri = ((PlayerError) obj).trackUri();
        w6b1 w6b1VarA = f7b1.a(blc0.ea);
        if (w6b1VarA != null) {
            return new kik1(w6b1VarA.d).a(strTrackUri);
        }
        return false;
    }
}
