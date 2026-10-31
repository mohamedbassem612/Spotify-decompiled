package p;

import android.os.SystemClock;
import com.spotify.concertview.concertfeedview.v1.GetFeedNextPageResponse;
import com.spotify.concertview.concertfeedview.v1.Section;
import com.spotify.mobius.Next;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.share.logging.impl.events.proto.ShareDebugError;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class khc implements bhc, BiFunction, Function, Predicate, jqc1, xqg {
    public final /* synthetic */ byte a;

    public static ShareDebugError d(Object obj) {
        a471 a471VarN = ShareDebugError.n();
        a471VarN.r("share.restrictions");
        a471VarN.n(4);
        a471VarN.q(((i8r) obj).c);
        return a471VarN.build();
    }

    public static p1d0 f(khc khcVar, LinkedHashMap linkedHashMap, Map map, iu30 iu30Var, int i) {
        if ((i & 2) != 0) {
            map = b7x.a;
        }
        khcVar.getClass();
        return new p1d0(linkedHashMap, map, 250L, iu30Var);
    }

    public static String g() {
        return UUID.randomUUID().toString();
    }

    public static h7g0 i(r6g0 r6g0Var) {
        List list = r6g0Var.i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((mxr0) obj).e) {
                arrayList.add(obj);
            }
        }
        List list2 = r6g0Var.h;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((bzr0) obj2).e) {
                arrayList2.add(obj2);
            }
        }
        smc0 smc0VarN = k4p1.n();
        if (!arrayList.isEmpty()) {
            smc0VarN.add(i7g0.b);
        }
        if (!arrayList2.isEmpty()) {
            smc0VarN.add(i7g0.c);
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        i7g0 i7g0Var = r6g0Var.d;
        if (!smc0VarK.contains(i7g0Var)) {
            i7g0Var = null;
        }
        if (i7g0Var == null) {
            i7g0Var = i7g0.a;
        }
        return new h7g0(r6g0Var.a, r6g0Var.b, r6g0Var.c, i7g0Var, smc0VarK, r6g0Var.e, arrayList2, arrayList);
    }

    public static int k(PlayerState playerState) {
        String strA0;
        Integer numC0;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (((contextTrack == null || (strA0 = l4o1.a0(contextTrack, "iteration")) == null || (numC0 = nhc1.c0(strA0)) == null) ? 0 : numC0.intValue()) > 0) {
            return 3;
        }
        if (playerState.isPaused()) {
            return 1;
        }
        return (!playerState.playbackSpeed().c() || u890.g((Double) playerState.playbackSpeed().b(), 0.0d)) ? 2 : 1;
    }

    public byte[] a(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                b380 b380Var = ((rd70) obj).a.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : b380Var) {
                    if (lmw.z((gd70) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (hashSet.add(lmw.z((gd70) obj3))) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                int i = 0;
                for (Object obj4 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    gd70 gd70Var = (gd70) obj4;
                    String strZ = lmw.z(gd70Var);
                    fd70 fd70Var = gd70Var.a;
                    hd70 hd70Var = fd70Var.c.a;
                    String str = hd70Var.a;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = hd70Var.b;
                    String str4 = str3 == null ? "" : str3;
                    ld70 ld70Var = fd70Var.d.a.c;
                    String str5 = ld70Var != null ? ld70Var.a.c : null;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    arrayList3.add(new ow01(i, strZ, str, str2, str4));
                    i = i2;
                }
                return arrayList3;
            case 12:
                return Boolean.valueOf(((tal) obj) instanceof sal);
            case 16:
                rd70 rd70Var = rd70.c;
                return pvc.j((re70) obj);
            case 17:
                throw td6.k(obj);
            case 18:
                f6r0 f6r0Var = (f6r0) obj;
                eir0 eir0Var = f6r0Var instanceof eir0 ? (eir0) f6r0Var : null;
                return eir0Var != null ? eir0Var : f6r0Var;
            case 22:
                return Boolean.valueOf(rh11.c((Map) obj));
            default:
                mmr0 mmr0Var = (mmr0) obj;
                List list = (List) mmr0Var.a;
                Boolean bool = (Boolean) mmr0Var.b;
                bool.getClass();
                List<ContextTrack> list2 = list;
                ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                for (ContextTrack contextTrack : list2) {
                    arrayList4.add(new mmr0(contextTrack.uri(), ac10.b(contextTrack)));
                }
                return new mmr0(bool, arrayList4);
        }
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public int c(ie30 ie30Var) {
        return 1;
    }

    public boolean e(ie30 ie30Var) {
        return false;
    }

    public lqc1 h(ie30 ie30Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    public Next j(z551 z551Var, rz41 rz41Var) {
        String strF = ejb.f();
        re20 re20Var = z551Var.h;
        if (!(re20Var instanceof re20)) {
            if ((re20Var instanceof se20) || (re20Var instanceof te20)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        z551 z551VarA = z551.a(z551Var, (String) null, (String) null, 0, y851.a, (val) null, (fw41) null, jlr0.a, re20.a(re20Var, (xo20) null, false, 2), (xrt0) null, 0, (m131) null, (e7r0) null, false, (h1z0) null, false, 32563);
        val valVar = z551VarA.e;
        if (!(valVar instanceof ral)) {
            if (valVar instanceof pal) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        tv80 tv80Var = rz41Var.a;
        String str = z551VarA.a;
        String strG = uap1.g(z551VarA);
        fw41 fw41Var = z551Var.f;
        return Next.i(z551VarA, f46.S0(new xyn1[]{sc51.b, new rx41(str, strF, strG, fw41Var.d, (gyh) null, tv80Var, fw41Var.c, 16)}));
    }

    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        String strUri = contextTrack != null ? contextTrack.uri() : null;
        if (strUri == null) {
            strUri = "";
        }
        ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
        j380 j380VarMetadata = contextTrack2 != null ? contextTrack2.metadata() : null;
        if (j380VarMetadata == null) {
            j380VarMetadata = b7x.a;
        }
        Set set = s4b1.f;
        return !((uic.g(strUri, blc0.Pg) && Boolean.parseBoolean((String) j380VarMetadata.get("has_companion_content"))) ? false : true);
    }

    public Object apply(Object obj, Object obj2) {
        t3k1 qf50Var;
        rod0 rod0Var = (rod0) obj;
        GetFeedNextPageResponse getFeedNextPageResponse = (GetFeedNextPageResponse) obj2;
        List listN0 = rod0Var.b;
        h290<Section> h290VarO = getFeedNextPageResponse.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (Section section : h290VarO) {
            section.getClass();
            arrayList.add(xto.x(section));
        }
        boolean zN = getFeedNextPageResponse.n();
        if (listN0.isEmpty()) {
            listN0 = arrayList;
        } else if (!arrayList.isEmpty()) {
            if (zN) {
                uf51 uf51Var = (uf51) o7h.A0(listN0);
                t3k1 t3k1Var = uf51Var.c;
                t3k1 t3k1Var2 = ((uf51) o7h.q0(arrayList)).c;
                if (t3k1Var == null && t3k1Var2 != null) {
                    qf50Var = t3k1Var2;
                } else if (t3k1Var != null && t3k1Var2 == null) {
                    qf50Var = t3k1Var;
                } else if ((t3k1Var instanceof qf50) && (t3k1Var2 instanceof qf50)) {
                    qf50Var = new qf50(o7h.N0(((qf50) t3k1Var2).b, ((qf50) t3k1Var).b));
                } else {
                    t3k1Var = null;
                    qf50Var = t3k1Var;
                }
                listN0 = o7h.N0(o7h.k0(arrayList, 1), o7h.O0(new uf51(uf51Var.a, uf51Var.b, qf50Var, uf51Var.d, uf51Var.e, uf51Var.f, uf51Var.g, uf51Var.h, uf51Var.i, uf51Var.t, uf51Var.X), o7h.l0(1, listN0)));
            } else {
                listN0 = o7h.N0(arrayList, listN0);
            }
        }
        return rod0.a(rod0Var, (zu50) null, listN0, (a6x) null, getFeedNextPageResponse.getNextPageToken(), 13);
    }
}
