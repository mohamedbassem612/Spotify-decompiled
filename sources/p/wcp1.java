package p;

import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wcp1 implements Function, BiFunction, s2i1, t2n, Predicate, Init {
    public static wcp1 b;
    public final /* synthetic */ byte a;
    public static final wcp1 c = new wcp1(1);
    public static final wcp1 d = new wcp1(2);
    public static final wcp1 e = new wcp1(3);
    public static final wcp1 f = new wcp1(5);
    public static final wcp1 g = new wcp1(6);
    public static final wcp1 h = new wcp1(7);
    public static final wcp1 i = new wcp1(8);
    public static final wcp1 t = new wcp1(9);
    public static final wcp1 X = new wcp1(10);
    public static final wcp1 Y = new wcp1(11);
    public static final wcp1 Z = new wcp1(12);
    public static final wcp1 N0 = new wcp1(13);
    public static final wcp1 O0 = new wcp1(14);
    public static final wcp1 P0 = new wcp1(15);
    public static final wcp1 Q0 = new wcp1(16);
    public static final wcp1 R0 = new wcp1(18);
    public static final wcp1 S0 = new wcp1(19);
    public static final wcp1 T0 = new wcp1(20);
    public static final wcp1 U0 = new wcp1(21);
    public static final wcp1 V0 = new wcp1(22);
    public static final wcp1 W0 = new wcp1(23);
    public static final wcp1 X0 = new wcp1(24);
    public static final wcp1 Y0 = new wcp1(25);
    public static final wcp1 Z0 = new wcp1(26);
    public static final wcp1 a1 = new wcp1(27);
    public static final wcp1 b1 = new wcp1(28);
    public static final wcp1 c1 = new wcp1(29);

    public /* synthetic */ wcp1(byte b2) {
        this.a = b2;
    }

    public static boolean a(zwa zwaVar) {
        return ((r34) zwaVar.b).b();
    }

    public static boolean b(zwa zwaVar) {
        return ((r34) zwaVar.b).a();
    }

    public static Next d(fn3 fn3Var, wub1 wub1Var, List list) {
        fn3 fn3VarA;
        wub1 wub1Var2 = fn3Var.b;
        xo41 xo41Var = wub1Var.c;
        List list2 = fn3Var.c;
        EntryPoint entryPoint = fn3Var.a;
        List list3 = list;
        ArrayList arrayListN0 = o7h.N0(list3, list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListN0) {
            if (obj instanceof qpl) {
                arrayList.add(obj);
            }
        }
        if (xo41Var instanceof xo41) {
            fn3VarA = fn3.a(fn3Var, null, wub1.a(wub1Var2, new xo41(xo41Var.a, arrayList)), arrayListN0, null, 9);
        } else if (xo41Var instanceof so41) {
            fn3VarA = fn3.a(fn3Var, null, wub1.a(wub1Var2, new so41((String) null, arrayList)), arrayListN0, null, 9);
        } else {
            boolean z = xo41Var instanceof po41;
            vo41 vo41Var = vo41.a;
            fn3VarA = z ? fn3.a(fn3Var, null, wub1.a(wub1Var2, vo41Var), arrayListN0, null, 9) : fn3.a(fn3Var, null, wub1.a(wub1Var2, vo41Var), arrayListN0, null, 9);
        }
        fn3 fn3Var2 = fn3VarA;
        r00 r00Var = wub1Var.b;
        if (u890.j(r00Var, xz.a)) {
            return Next.h(fn3Var2);
        }
        if (!(r00Var instanceof r00)) {
            if (u890.j(r00Var, ez.a)) {
                return Next.a(Collections.singleton(new fm3(true, entryPoint, "Completed with Action.Dismiss on processAction")));
            }
            if (r00Var instanceof y00) {
                String str = ((y00) r00Var).a;
                return Next.a(Collections.singleton(new fm3(true, entryPoint, f4i1.f("Completed with Action.Uri on processAction [", str, "]"), str)));
            }
            eg.o();
            return null;
        }
        ro41 ro41Var = wub1Var2.c;
        int size = list.size();
        if ((ro41Var instanceof ro41) && entryPoint != null && entryPoint.getCanExit() && ro41Var.h == 0 && size == 0) {
            return Next.a(Collections.singleton(new fm3(true, entryPoint, "Exited with no selection")));
        }
        String str2 = r00Var.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((xl81) it.next()).getUri());
        }
        hm3 hm3Var = new hm3(str2, arrayList2, entryPoint, wub1Var.c instanceof xo41);
        return Next.i(fn3.a(fn3Var2, null, null, null, hm3Var, 7), Collections.singleton(hm3Var));
    }

    public static Next e(fn3 fn3Var, ym3 ym3Var) {
        ro41 xo41Var;
        jm3 jm3Var = fn3Var.d;
        wub1 wub1Var = fn3Var.b;
        EntryPoint entryPoint = fn3Var.a;
        if (ym3Var instanceof wm3) {
            wm3 wm3Var = (wm3) ym3Var;
            return Next.i(fn3.a(fn3Var, wm3Var.a, fn3.e.b, null, null, 12), Collections.singleton(new gm3(wm3Var.a)));
        }
        if (!(ym3Var instanceof um3)) {
            if (ym3Var instanceof tm3) {
                return Next.h(fn3.a(fn3Var, null, wub1.a(wub1Var, new to41(wub1Var.a)), null, ((tm3) ym3Var).a, 5));
            }
            if (!(ym3Var instanceof sm3)) {
                if (ym3Var instanceof vm3) {
                    return jm3Var != null ? Next.a(Collections.singleton(jm3Var)) : Next.j();
                }
                if (ym3Var instanceof xm3) {
                    return Next.a(Collections.singleton(new fm3(false, entryPoint, ((xm3) ym3Var).a)));
                }
                eg.o();
                return null;
            }
            sm3 sm3Var = (sm3) ym3Var;
            if (wub1Var.c instanceof to41) {
                return Next.i(fn3.a(fn3Var, null, wub1.a(wub1Var, vo41.a), null, null, 13), Collections.singleton(jm3Var));
            }
            ip41 ip41Var = sm3Var.a;
            List list = ip41Var.b;
            int iC = l1d.C(ip41Var.a);
            if (iC == 0) {
                wub1 wub1Var2 = wub1Var.d;
                return wub1Var2 != null ? d(fn3Var, wub1Var2, list) : Next.j();
            }
            if (iC == 1) {
                wub1 wub1Var3 = wub1Var.e;
                return wub1Var3 != null ? d(fn3Var, wub1Var3, list) : Next.j();
            }
            eg.o();
            return null;
        }
        wub1 wub1Var4 = ((um3) ym3Var).a;
        if (wub1Var4.c instanceof xo41) {
            wub1 wub1Var5 = wub1Var4.d;
            h10 h10Var = wub1Var5 != null ? wub1Var5.b : null;
            if (u890.j(h10Var, ez.a)) {
                return Next.a(Collections.singleton(new fm3(true, entryPoint, "Completed with Action.Dismiss from onPresentNextStep")));
            }
            if (h10Var instanceof y00) {
                String str = ((y00) h10Var).a;
                return Next.a(Collections.singleton(new fm3(true, entryPoint, f4i1.f("Completed with Action.Uri from onPresentNextStep [", str, "]"), str)));
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list2 = fn3Var.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof qpl) {
                arrayList.add(obj);
            }
        }
        ro41 ro41VarA = wub1Var4.c;
        if (ro41VarA instanceof ro41) {
            ro41VarA = ro41.a(ro41VarA, (ArrayList) null, (List) null, (List) null, 0, entryPoint.getCanExit(), 6143);
        } else {
            if (ro41VarA instanceof so41) {
                xo41Var = new so41(((so41) ro41VarA).a, arrayList);
            } else if (ro41VarA instanceof xo41) {
                xo41Var = new xo41(((xo41) ro41VarA).a, arrayList);
            }
            ro41VarA = xo41Var;
        }
        return Next.i(fn3.a(fn3Var, null, wub1.a(wub1Var4, ro41VarA), null, null, 5), linkedHashSet);
    }

    public static synchronized void f() {
        if (b == null) {
            b = new wcp1((byte) 0);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return (Long) ((spq0) obj).b();
            case 2:
                jn41 jn41Var = (ln41) obj;
                return jn41Var instanceof jn41 ? new b81(((ui8) jn41Var.a).d()) : c81.a;
            case 3:
                return new dm2((pk2) obj);
            case 5:
                return Boolean.valueOf(((String) obj).equals("1"));
            case 6:
                sm6 sm6Var = (sm6) obj;
                return new rq6(sm6Var.a, sm6Var.b, sm6Var.c);
            case 7:
                return ((th61) obj).a;
            case 8:
                return new m910(false, false);
            case 14:
                Logger.e((Throwable) obj, "Error loading the UC choice screen", new Object[0]);
                return j7g.a;
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return Status.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_esperanto.proto.Status: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 21:
                eh20 eh20Var = (eh20) obj;
                String str = eh20Var.c;
                if (str == null || str.length() == 0) {
                    return new eh20(null);
                }
                return ihc1.e1(str).toString().length() < 3 ? new eh20(null) : eh20Var;
            case 22:
                return (xi5) ((spq0) obj).b();
            case 27:
                return Boolean.valueOf(((GetCommentCardResponse) obj).q() != tuw.d);
            default:
                return new ceh();
        }
    }

    public void c(wax waxVar) {
        aga0 aga0Var = (aga0) waxVar;
        aga0Var.c(le61.class, jx8.a);
        aga0Var.c(qf61.class, kx8.a);
        aga0Var.c(twq.class, hx8.a);
        aga0Var.c(xz5.class, gx8.a);
        aga0Var.c(c54.class, fx8.a);
        aga0Var.c(grw0.class, ix8.a);
    }

    public First e0(Object obj) {
        xbk xbkVar = (xbk) obj;
        xj61 xj61VarV = k4k.v(xbkVar);
        String str = xbkVar.a;
        return First.c(xbkVar, dm61.y0(xj61VarV, f46.S0(new u9k[]{new r9k(str), new s9k(str)})));
    }

    public Object g(Object obj) {
        return (tn21) obj;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new lab(str2, str, xkg0Var);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 13:
                m210 m210Var = ((o710) obj).b;
                return u890.j(m210Var.f, "car") && !u890.j(m210Var.a, "android_auto");
            case 19:
                wv00 wv00Var = (uv00) obj;
                return !wv00Var.f || wv00Var.c();
            case 20:
                return !((uv00) obj).f;
            case 23:
                wv00 wv00Var2 = (uv00) obj;
                return wv00Var2.c() || !wv00Var2.f;
            case 24:
                return ((gcl1) obj) instanceof fcl1;
            case 25:
                return ((Boolean) obj).booleanValue();
            case 26:
                return ((tv00) obj).b != null;
            default:
                return ((ipw) obj) instanceof gpw;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new vw9((ub10) obj, ((Number) obj2).intValue());
    }
}
