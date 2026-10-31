package p;

import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Next;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u841 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u841(wux wuxVar, id01 id01Var) {
        super(2);
        this.a = (byte) 14;
        this.b = id01Var;
    }

    private final Object a(Object obj, Object obj2) {
        ih71 jh71Var;
        umt tmtVar;
        bb71 bb71Var;
        u771 u771Var;
        t771 t771Var;
        z771 z771Var;
        Object next;
        Object next2;
        u771 u771Var2;
        t771 t771Var2;
        z771 z771Var2;
        u771 u771Var3;
        t771 t771Var3;
        wa71 wa71Var;
        fl71 el71Var;
        zg71 zg71Var = (zg71) obj;
        tg71 tg71Var = (tg71) obj2;
        ug71 ug71Var = (ug71) this.b;
        fl71 fl71Var = zg71Var.a;
        k371 k371Var = zg71Var.b;
        if (tg71Var.equals(ig71.a)) {
            return zg71Var.e instanceof wg71 ? Next.a(Collections.singleton(new kh71(k371Var))) : Next.j();
        }
        if (tg71Var instanceof eg71) {
            return Next.i(zg71.a(zg71Var, (hl71) null, (k371) null, (Integer) null, (te71) null, (xg71) null, (yg71) null, ((eg71) tg71Var).a, (z771) null, 447), Collections.singleton(new fh71(k371Var)));
        }
        if (tg71Var.equals(dg71.a)) {
            return Next.h(zg71.a(zg71Var, new el71("Failed to resolve plugins"), (k371) null, (Integer) null, (te71) null, (xg71) null, (yg71) null, (va71) null, (z771) null, 510));
        }
        if (tg71Var instanceof sg71) {
            zg71 zg71VarA = zg71.a(zg71Var, (hl71) null, ug71Var.b, (Integer) null, (te71) null, new vg71(((sg71) tg71Var).a), (yg71) null, (va71) null, (z771) null, 493);
            return Next.i(zg71VarA, Collections.singleton(new eh71(zg71VarA)));
        }
        String strA = null;
        if (tg71Var instanceof ng71) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                Object obj3 = ((ng71) tg71Var).a;
                Throwable thA = e331.a(obj3);
                if (thA != null) {
                    wa71 wa71Var2 = k371Var.a;
                    linkedHashSet.add(new dh71(wa71Var2 != null ? wa71Var2.a : null, thA));
                }
                hm5.M(obj3);
                el71Var = new fl71((c9) obj3);
            } catch (Throwable th) {
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                el71Var = new el71(message);
            }
            return Next.i(zg71.a(zg71Var, el71Var, (k371) null, (Integer) null, (te71) null, (xg71) null, (yg71) null, (va71) null, ((ng71) tg71Var).b, 382), linkedHashSet);
        }
        if (tg71Var.equals(gg71.a)) {
            return Next.h(zg71.a(zg71Var, (hl71) null, (k371) null, (Integer) null, (te71) null, (xg71) null, (yg71) null, (va71) null, (z771) null, 507));
        }
        if (tg71Var instanceof og71) {
            og71 og71Var = (og71) tg71Var;
            return Next.h(zg71.a(zg71Var, (hl71) null, (k371) null, (Integer) null, new qe71(og71Var.a, og71Var.b), (xg71) null, (yg71) null, (va71) null, (z771) null, 503));
        }
        if (tg71Var.equals(jg71.a)) {
            zg71 zg71VarA2 = zg71.a(zg71Var, gl71.a, (k371) null, (Integer) null, (te71) null, wg71.a, (yg71) null, (va71) null, (z771) null, 494);
            return Next.i(zg71VarA2, Collections.singleton(new kh71(zg71VarA2.b)));
        }
        if (tg71Var instanceof kg71) {
            c380<bb71> c380VarA = fl71Var.a();
            int i = ((kg71) tg71Var).a;
            Iterator it = c380VarA.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((bb71) next2).b != i);
            bb71 bb71Var2 = (bb71) next2;
            Integer numValueOf = Integer.valueOf(i);
            String str = (bb71Var2 == null || (u771Var3 = bb71Var2.a) == null || (t771Var3 = u771Var3.a) == null || (wa71Var = t771Var3.a) == null) ? null : wa71Var.a;
            if (bb71Var2 != null && (u771Var2 = bb71Var2.a) != null && (t771Var2 = u771Var2.a) != null && (z771Var2 = t771Var2.b) != null) {
                strA = z771Var2.a();
            }
            Logger.b("[ShareMenu] Selected share format index updated to %d, entityUri=%s, shareFormatId=%s", new Object[]{numValueOf, str, strA});
            ArrayList arrayList = new ArrayList(q7h.U(c380VarA, 10));
            for (bb71 bb71Var3 : c380VarA) {
                int i2 = bb71Var3.b;
                u771 u771Var4 = bb71Var3.a;
                arrayList.add(i2 == i ? new bb71(u771Var4, i2, 2) : (i2 == i + (-1) || i2 == i + 1) ? new bb71(u771Var4, i2, 1) : new bb71(u771Var4, i2, 3));
            }
            return Next.h(zg71.a(zg71Var, new fl71(mqo1.F(arrayList)), (k371) null, (Integer) null, (te71) null, (xg71) null, (yg71) null, (va71) null, (z771) null, 510));
        }
        if (tg71Var.equals(fg71.a)) {
            return Next.j();
        }
        if (tg71Var instanceof qg71) {
            fl71 fl71Var2 = fl71Var instanceof fl71 ? fl71Var : null;
            if (fl71Var2 != null) {
                Iterator it2 = fl71Var2.a.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((bb71) next).a());
                bb71Var = (bb71) next;
            } else {
                bb71Var = null;
            }
            umt umtVar = ((qg71) tg71Var).a;
            String str2 = umtVar.a().a;
            wa71 wa71Var3 = k371Var.a;
            Logger.b("[ShareMenu] Destination selected: destination=%s, entityUri=%s, shareFormatId=%s", new Object[]{str2, wa71Var3 != null ? wa71Var3.a : null, (bb71Var == null || (u771Var = bb71Var.a) == null || (t771Var = u771Var.a) == null || (z771Var = t771Var.b) == null) ? null : z771Var.a()});
            wa71 wa71Var4 = k371Var.a;
            return Next.a(Collections.singleton(new bh71(umtVar, wa71Var4 != null ? wa71Var4.a : null)));
        }
        if (!(tg71Var instanceof mg71)) {
            boolean zEquals = tg71Var.equals(pg71.a);
            se71 se71Var = se71.a;
            if (zEquals) {
                return Next.h(zg71.a(zg71Var, (hl71) null, (k371) null, (Integer) null, se71Var, (xg71) null, (yg71) null, (va71) null, (z771) null, 247));
            }
            if (!(tg71Var instanceof hg71)) {
                if (tg71Var.equals(lg71.a)) {
                    return Next.h(zg71.a(zg71Var, (hl71) null, (k371) null, (Integer) null, se71Var, (xg71) null, (yg71) null, (va71) null, (z771) null, 503));
                }
                if (tg71Var instanceof rg71) {
                    return Next.a(Collections.singleton(new hh71(((rg71) tg71Var).a, zg71Var.f)));
                }
                eg.o();
                return null;
            }
            hg71 hg71Var = (hg71) tg71Var;
            p371 p371Var = hg71Var.c;
            o571 o571Var = hg71Var.a;
            pe71 pe71Var = hg71Var.b;
            zg71 zg71VarA3 = zg71.a(zg71Var, (hl71) null, (k371) null, hg71Var.e, pe71Var, (xg71) null, new yg71(o571Var, p371Var != null ? p371Var.d() : null, pe71Var instanceof re71), (va71) null, (z771) null, 211);
            if (pe71Var instanceof pe71) {
                return Next.i(zg71VarA3, Collections.singleton(new ch71(o571Var, pe71Var, ug71Var.a, hg71Var.g)));
            }
            bb71 bb71VarB = fl71Var.b();
            if (p371Var == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            o571 o571Var2 = hg71Var.a;
            String str3 = hg71Var.d;
            if (str3 != null) {
                return Next.i(zg71VarA3, Collections.singleton(new gh71(bb71VarB, p371Var, o571Var2, str3, hg71Var.f)));
            }
            hhg1.n("Required value was null.");
            return null;
        }
        mg71 mg71Var = (mg71) tg71Var;
        umt umtVar2 = mg71Var.a;
        String str4 = mg71Var.b;
        if (str4 != null) {
            p371 p371VarB = umtVar2.b();
            if (p371VarB == null) {
                hhg1.n("A permission token was created without share data");
                return null;
            }
            p371 p371VarA = p371VarB.a(sqg0.P(p371VarB.e(), new mmr0("pt", str4)));
            if (umtVar2 instanceof smt) {
                smt smtVar = (smt) umtVar2;
                tmtVar = new smt(smtVar.a, p371VarA, smtVar.c, smtVar.d, smtVar.e, smtVar.f);
            } else {
                if (!(umtVar2 instanceof tmt)) {
                    eg.o();
                    return null;
                }
                tmt tmtVar2 = (tmt) umtVar2;
                tmtVar = new tmt(tmtVar2.a, p371VarA, tmtVar2.c, tmtVar2.d, tmtVar2.e, tmtVar2.f, tmtVar2.g, tmtVar2.h);
            }
            umtVar2 = tmtVar;
        }
        if (umtVar2 instanceof smt) {
            smt smtVar2 = (smt) umtVar2;
            bkc0 bkc0Var = smtVar2.e;
            p371 p371Var2 = smtVar2.b;
            o571 o571Var3 = smtVar2.a;
            for (bb71 bb71Var4 : fl71Var.a()) {
                if (bb71Var4.a()) {
                    jh71Var = new ih71(o571Var3, ug71Var.a, bb71Var4, bkc0Var, p371Var2, smtVar2.d, smtVar2.f, smtVar2.c, zg71Var.h);
                }
            }
            bhn0.t("Collection contains no element matching the predicate.");
            return null;
        }
        if (!(umtVar2 instanceof tmt)) {
            eg.o();
            return null;
        }
        tmt tmtVar3 = (tmt) umtVar2;
        jh71Var = new jh71(tmtVar3.d, tmtVar3.a, fl71Var.b(), tmtVar3.e, ug71Var.a, tmtVar3.f, tmtVar3.b, tmtVar3.g, tmtVar3.c, zg71Var.h);
        return Next.a(Collections.singleton(jh71Var));
    }

    public final Object invoke(Object obj, Object obj2) {
        Bundle bundleG;
        Function0 function0;
        long jB;
        Object obj3;
        Object obj4;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    otw.c((u7p0) obj5, rih1Var2, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var2;
            case 1:
                i1r i1rVar = (k1r) obj2;
                dk3 dk3Var = ((s941) obj).a;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                w941 w941Var = i1rVar2 != null ? (w941) i1rVar2.a : null;
                if (dk3Var instanceof bk3) {
                    return new t941(((zwm1) ((nm1) obj5).f).i(), (Integer) null, (String) null, dk3Var);
                }
                return w941Var != null ? new t941(w941Var.a, w941Var.b, w941Var.c, dk3Var) : u941.a;
            case 2:
                ipb1 ipb1Var = (ipb1) obj2;
                hd41 hd41Var = ipb1Var instanceof hd41 ? (hd41) ipb1Var : null;
                if (hd41Var != null && (function0 = hd41Var.c) != null) {
                    function0.invoke();
                }
                mc41 mc41Var = (mc41) obj5;
                Bundle bundleG2 = pzm.g("com.spotify.element.state_holder_saved_state", true);
                try {
                    bundleG = mc41Var.d(ipb1Var.getState());
                    break;
                } catch (Exception unused) {
                    bundleG = mno1.g();
                }
                bundleG2.putBundle("element_state", bundleG);
                Bundle bundleC = ipb1Var.c();
                if (bundleC != null) {
                    bundleG2.putBundle("ui_state", bundleC);
                }
                return bundleG2;
            case 3:
                ((Number) obj2).intValue();
                vvm1.a((ec5) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                y9e1 y9e1Var = (y9e1) ((Function0) obj2).invoke();
                if (y9e1Var != null) {
                    ((tvh1) obj5).e.invoke(y9e1Var);
                }
                return rih1Var;
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b2u.g(((x5q0) obj5).a, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    eqr0.b(0, 2, ((u211) obj5).a, x340Var6, (qim0) null);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                ec51 ec51Var = (ec51) obj;
                long jLongValue = ((Number) obj2).longValue();
                if (((wb51) obj5).a != ec51Var.c) {
                    return new yb51(ec51Var, (zb51) null, 6);
                }
                ec51 ec51VarA = ec51.a(ec51Var, 0, 0L, 0L, 0, ec51Var.e + 1, null, null, 0L, 175);
                ac51 ac51Var = ec51Var.g;
                return new yb51(ec51VarA, ac51Var != null ? ac51Var.c(1, jLongValue) : null, true);
            case 8:
                return new sma1(new jpg0(f6o1.A(new w460((lzn0) ((ur6) obj5).b, false, false, false, (a1r0) null, 56), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), ej41.e1), new rma1(2131167023, null, 2131167023, 10));
            case 9:
                x6e x6eVar = (x6e) obj5;
                return new sma1(new jpg0(f6o1.A(new w460((lzn0) x6eVar.c, false, true, false, (a1r0) null, 56), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new uh51(x6eVar, (byte) 1)), new rma1(2131167023, null, 2131167023, 10));
            case 10:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                to51 to51Var = (to51) obj5;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    otw.c((maa) to51Var.c.get(), new so51(to51Var.b.a), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                wgo1.b((up51) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                dv51 dv51Var = (fv51) obj;
                gv51 gv51Var = (gv51) obj5;
                idd1 idd1Var = gv51Var.d;
                idd1 idd1Var2 = gv51Var.e;
                int iC = l1d.C(dv51Var.getSource());
                if (iC == 0) {
                    if (dv51Var instanceof dv51) {
                        wuk0 wuk0Var = (wuk0) idd1Var.getValue();
                        wuk0Var.getClass();
                        x6h1 x6h1VarC = wuk0Var.a.c();
                        x6h1VarC.i.add(new a7h1("suggested_users", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        dv51 dv51Var2 = dv51Var;
                        Integer numValueOf = Integer.valueOf(dv51Var2.c);
                        String str = dv51Var2.e;
                        x6h1 x6h1VarC2 = y6h1VarA.c();
                        x6h1VarC2.i.add(new a7h1("user", (String) null, numValueOf, str, (String) null));
                        x6h1VarC2.j = true;
                        y6h1 y6h1VarA2 = x6h1VarC2.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA2;
                        ((xjn) k7h1Var).b = r6h1.c;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        return k7h1Var.a();
                    }
                    if (!(dv51Var instanceof ev51)) {
                        eg.o();
                        return null;
                    }
                    wuk0 wuk0Var2 = (wuk0) idd1Var.getValue();
                    wuk0Var2.getClass();
                    x6h1 x6h1VarC3 = wuk0Var2.a.c();
                    x6h1VarC3.i.add(new a7h1("selectable_users", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC3.a();
                    ev51 ev51Var = (ev51) dv51Var;
                    Integer numValueOf2 = Integer.valueOf(ev51Var.c);
                    String str2 = ev51Var.e;
                    x6h1 x6h1VarC4 = y6h1VarA3.c();
                    x6h1VarC4.i.add(new a7h1("user", (String) null, numValueOf2, str2, (String) null));
                    x6h1VarC4.j = true;
                    y6h1 y6h1VarA4 = x6h1VarC4.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA4;
                    ((xjn) k7h1Var2).b = r6h1.c;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    return k7h1Var2.a();
                }
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                if (dv51Var instanceof dv51) {
                    suk0 suk0Var = (suk0) idd1Var2.getValue();
                    suk0Var.getClass();
                    x6h1 x6h1VarC5 = suk0Var.a.c();
                    x6h1VarC5.i.add(new a7h1("suggested_users", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC5.a();
                    dv51 dv51Var3 = dv51Var;
                    Integer numValueOf3 = Integer.valueOf(dv51Var3.c);
                    String str3 = dv51Var3.e;
                    x6h1 x6h1VarC6 = y6h1VarA5.c();
                    x6h1VarC6.i.add(new a7h1("user", (String) null, numValueOf3, str3, (String) null));
                    x6h1VarC6.j = true;
                    y6h1 y6h1VarA6 = x6h1VarC6.a();
                    k7h1 k7h1Var3 = new k7h1();
                    ((xjn) k7h1Var3).a = y6h1VarA6;
                    ((xjn) k7h1Var3).b = r6h1.c;
                    ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                    return k7h1Var3.a();
                }
                if (!(dv51Var instanceof ev51)) {
                    eg.o();
                    return null;
                }
                suk0 suk0Var2 = (suk0) idd1Var2.getValue();
                suk0Var2.getClass();
                x6h1 x6h1VarC7 = suk0Var2.a.c();
                x6h1VarC7.i.add(new a7h1("invitable_users", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                y6h1 y6h1VarA7 = x6h1VarC7.a();
                ev51 ev51Var2 = (ev51) dv51Var;
                Integer numValueOf4 = Integer.valueOf(ev51Var2.c);
                String str4 = ev51Var2.e;
                x6h1 x6h1VarC8 = y6h1VarA7.c();
                x6h1VarC8.i.add(new a7h1("user", (String) null, numValueOf4, str4, (String) null));
                x6h1VarC8.j = true;
                y6h1 y6h1VarA8 = x6h1VarC8.a();
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1VarA8;
                ((xjn) k7h1Var4).b = r6h1.c;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            case 13:
                long jR = ((r3g) obj5).b;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        jR = who1.r(jR);
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                return new u7h(jR);
            case 14:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                id01 id01Var = (id01) obj5;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    gra graVar = een.h;
                    qim0 qim0VarR = u291.r(nim0Var, 24.0f);
                    u7h u7hVar = id01Var != null ? new u7h(id01Var.a) : null;
                    if (u7hVar == null) {
                        x340Var10.i0(1756792225);
                        uwr uwrVar = cbx.a;
                        jB = u7h.b(cbx.a(x340Var10).b.b, 0.7f, 0.0f, 0.0f, 0.0f, 14);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(1756789497);
                        x340Var10.r(false);
                        jB = u7hVar.a;
                    }
                    cr31 cr31Var = er31.a;
                    qim0 qim0VarF = dug.f(qim0VarR, jB, cr31Var);
                    float f = yy51.c;
                    long j = yy51.b;
                    qim0 qim0VarE = d1u.E(f, u7h.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), qim0VarF, cr31Var);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM = x340Var10.m();
                    qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarE);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(hmb0.t1);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(gfh0VarC, x340Var10, y580.O0);
                    nko1.H(xos0VarM, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE2, x340Var10, y580.Y);
                    if (id01Var != null) {
                        x340Var10.i0(-1380854397);
                        w0h1.a(ilx.c, isl.a, u291.r(nim0Var, 12.0f), j, 0L, false, x340Var10, ilx.d | 3120, 48);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-1380548179);
                        x340Var10.r(false);
                    }
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 15:
                wyz0 wyz0Var = ((e161) obj2).a;
                return new jxz0(wyz0Var != null ? wyz0Var.b : 0, wyz0Var != null ? wyz0Var.a : "", ((i161) obj5).b, wyz0Var != null ? wyz0Var.c : z6x.a);
            case 16:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                dc61 dc61Var = (dc61) obj5;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var12, 2131952219);
                    boolean zI = x340Var12.i(dc61Var);
                    Object objT = x340Var12.T();
                    if (zI || objT == fkj0.X) {
                        obj3 = objT;
                        l451 l451Var = new l451(dc61Var, (byte) 16);
                        x340Var12.s0(l451Var);
                        obj3 = l451Var;
                    }
                    obj3 = objT;
                    boo1.p(0, strO0, (Function0) obj3, x340Var12);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return yoi1.g(BehaviorSubject.g(new an41(new fh61((dn41) obj2, (ni61) obj5, (byte) 0))));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Bundle bundle = (Bundle) obj;
                hn61 hn61VarP = lro1.p(((jn61) obj5).a, (gn61) obj2);
                if (!bundle.containsKey("doNotShowAgain")) {
                    bundle = null;
                }
                return hn61.a(hn61VarP, bundle != null ? Boolean.valueOf(bundle.getBoolean("doNotShowAgain")) : null);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                vt61 vt61Var = (vt61) obj5;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    rzo0 rzo0Var = vt61Var.g;
                    kk11 kk11Var = new kk11(vt61Var, (byte) 3);
                    x340Var14.i0(-754602784);
                    List<gbr0> list = (List) ((idd1) rzo0Var.d).getValue();
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (gbr0 gbr0Var : list) {
                        sq61 sq61Var = gbr0Var.e;
                        arrayList.add(new hbr0(gbr0Var, new ibr0(sq61Var, kk11Var.invoke(sq61Var, x340Var14, 0))));
                    }
                    x340Var14.r(false);
                    vt61Var.c(new sjq0(rzo0Var, arrayList), x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                ((wu61) obj5).a((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    lap1.d(((q571) obj5).b, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 22:
                im0 im0Var = (im0) obj5;
                v671 v671Var = new v671(im0Var);
                a6o1.t((lsw) obj, new a771(im0Var, v671Var, (byte) 0), new a771(im0Var, v671Var, (byte) 1));
                return rih1Var;
            case 23:
                uvk0 uvk0Var = (uvk0) ((idd1) ((z3i0) obj5).h).getValue();
                uvk0Var.getClass();
                x6h1 x6h1VarC9 = uvk0Var.a.c();
                x6h1VarC9.i.add(new a7h1("share_history_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = true;
                y6h1 y6h1VarA9 = x6h1VarC9.a();
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1VarA9;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var5.e = uvk0Var.b;
                return k7h1Var5.a();
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                a971 a971Var = (a971) obj5;
                c971 c971Var = a971Var.c;
                e821 e821Var = a971Var.b;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    Object objT2 = x340Var18.T();
                    m4c m4cVar = fkj0.X;
                    if (objT2 == m4cVar) {
                        obj4 = objT2;
                        String strB = ((skc0) e821Var.e).b(c971Var.a);
                        x340Var18.s0(strB);
                        obj4 = strB;
                    }
                    obj4 = objT2;
                    String str5 = (String) obj4;
                    String str6 = c971Var.b;
                    cc71 cc71Var = new cc71((Uri) null, cwl1.n0(2131962297, new Object[]{str5}, x340Var18));
                    boolean zI2 = x340Var18.i(e821Var) | x340Var18.g(str6);
                    Object objT3 = x340Var18.T();
                    Object obj6 = objT3;
                    if (zI2 || objT3 == m4cVar) {
                        xd1 xd1Var = new xd1(e821Var, str5, str6, (lnm) null);
                        x340Var18.s0(xd1Var);
                        obj6 = xd1Var;
                    }
                    cc71 cc71Var2 = (cc71) yto.q(cc71Var, x340Var18, (vu30) obj6).getValue();
                    z871 z871Var = a971Var.d;
                    boolean zI3 = x340Var18.i(z871Var);
                    Object objT4 = x340Var18.T();
                    if (zI3 || objT4 == m4cVar) {
                        ggx0 ggx0Var = new ggx0(0, z871Var, z871.class, "logLinkCopied", "logLinkCopied()V", 0, (byte) 25);
                        x340Var18.s0(ggx0Var);
                        objT4 = ggx0Var;
                    }
                    Function0 function1 = (Function0) objT4;
                    boolean zI4 = x340Var18.i(a971Var) | x340Var18.g(cc71Var2);
                    Object objT5 = x340Var18.T();
                    Object obj7 = objT5;
                    if (zI4 || objT5 == m4cVar) {
                        fh61 fh61Var = new fh61(a971Var, cc71Var2, (byte) 13);
                        x340Var18.s0(fh61Var);
                        obj7 = fh61Var;
                    }
                    yzo1.h(6, str5, function1, (Function0) obj7, x340Var18, (qim0) null);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ra71 ra71Var = (ra71) obj5;
                    hso1.h(384, ra71Var.k, ra71Var.l, x340Var20, anm1.N("media.share.audioui.view", u291.d(nim0Var, 1.0f)));
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                k1p1.c((pd71) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    rh71 rh71Var = (rh71) obj5;
                    ngs0 ngs0Var = rh71Var.c;
                    th71 th71Var = rh71Var.b;
                    otw.c(ngs0Var, new qh71(th71Var.a, th71Var.b, th71Var.c, th71Var.d, th71Var.e), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 28:
                return a(obj, obj2);
            default:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ((ej71) ((cj71) obj5).b.get()).a(x340Var24, 6);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u841(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u841(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
