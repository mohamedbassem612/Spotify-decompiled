package p;

import com.spotify.adsdisplay.elementimpl.survey.events.proto.AdPreferenceChangedEvent;
import com.spotify.adsinternal.adscommon.events.proto.AdError;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Consumer;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qt61 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt61(boolean z, rk41 rk41Var, wgm1 wgm1Var, lf6 lf6Var, Function0 function0, Map map, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 7;
        this.b = z;
        this.c = rk41Var;
        this.e = wgm1Var;
        this.f = lf6Var;
        this.g = function0;
        this.h = map;
        this.d = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                return new qt61((vt61) obj3, (ven0) this.e, (sjq0) obj2, (ven0) this.f, lnmVar);
            case 1:
                return new qt61((byte) 1, this.d, this.e, this.f, obj3, obj2, lnmVar);
            case 2:
                return new qt61((ki71) this.f, (ei71) obj3, (fl71) obj2, lnmVar);
            case 3:
                return new qt61(this.c, this.d, this.e, this.f, obj3, obj2, lnmVar, (byte) 3);
            case 4:
                qt61 qt61Var = new qt61((byte) 4, this.d, this.e, this.f, obj3, obj2, lnmVar);
                qt61Var.c = obj;
                return qt61Var;
            case 5:
                return new qt61((byte) 5, this.d, this.e, this.f, obj3, obj2, lnmVar);
            case 6:
                qt61 qt61Var2 = new qt61((byte) 6, this.d, this.e, this.f, obj3, obj2, lnmVar);
                qt61Var2.c = obj;
                return qt61Var2;
            case 7:
                return new qt61(this.b, (rk41) this.c, (wgm1) this.e, (lf6) this.f, (Function0) obj3, (Map) obj2, (ven0) this.d, lnmVar);
            case 8:
                qt61 qt61Var3 = new qt61((q9g1) obj3, (jyv0) obj2, (ven0) this.d, (ven0) this.e, (ven0) this.f, lnmVar);
                qt61Var3.c = obj;
                return qt61Var3;
            case 9:
                return new qt61(this.c, this.d, this.e, this.f, obj3, obj2, lnmVar, (byte) 9);
            case 10:
                return new qt61(this.c, this.d, this.e, this.f, obj3, obj2, lnmVar, (byte) 10);
            case 11:
                return new qt61((ven0) this.d, (yqg) obj3, (ven0) this.e, (frr0) obj2, (ven0) this.f, lnmVar);
            case 12:
                return new qt61((jkr0) this.c, (q9l1) this.e, (Consumer) this.f, (jjr0) obj3, (hdn0) obj2, (ven0) this.d, lnmVar);
            case 13:
                return new qt61((hdl1) this.c, (yqg) this.f, (Function0) obj3, (ven0) this.d, (ven0) this.e, (hdn0) obj2, lnmVar);
            default:
                qt61 qt61Var4 = new qt61((ieo1) obj3, (yln1) obj2, lnmVar);
                qt61Var4.f = obj;
                return qt61Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:329:0x0764  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0190 -> B:68:0x0194). Please report as a decompilation issue!!! */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ven0 ven0Var;
        lqs0 lqs0VarE;
        Object objN;
        iu30 iu30Var;
        Object objA;
        Object objE;
        fl71 fl71Var;
        ki71 ki71Var;
        ei71 ei71Var;
        Object objA2;
        m231 m231Var;
        Map mapT;
        Object objD;
        boolean z;
        b7x b7xVar;
        String str;
        jx0 jx0Var;
        String str2;
        k5u0 k5u0Var;
        ieo1 ieo1Var;
        zwo1 zwo1Var;
        yln1 yln1Var;
        xgn0 xgn0Var;
        byte b = this.a;
        int i = 10;
        m231 m231Var2 = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        c9 tt61Var = null;
        switch (b) {
            case 0:
                vt61 vt61Var = (vt61) obj3;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    ven0Var = (ven0) this.f;
                    ven0 ven0Var2 = (ven0) this.e;
                    lqs0 lqs0Var = vt61.j;
                    String str3 = ((c8e1) ven0Var2.getValue()).a.b;
                    if (ihc1.y0(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        lqs0VarE = vt61.e(str3);
                        sjq0 sjq0Var = (sjq0) obj2;
                        if ((!lqs0VarE.isEmpty() ? lqs0VarE : null) != null) {
                            q961 q961Var = new q961(vt61Var, lqs0VarE);
                            this.c = lqs0VarE;
                            this.d = ven0Var;
                            this.b = true;
                            objN = xq61.N(sjq0Var, q961Var, this);
                            if (objN == d9nVar) {
                                return d9nVar;
                            }
                        }
                        if (tt61Var == null) {
                            tt61Var = fg91.b;
                        }
                        tt61Var = new tt61(tt61Var, lqs0VarE);
                    }
                    lqs0 lqs0Var2 = vt61.j;
                    ven0Var.setValue(tt61Var);
                    return m231Var2;
                }
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ven0Var = (ven0) this.d;
                lqs0VarE = (lqs0) this.c;
                hm5.M(obj);
                objN = obj;
                List list = (List) objN;
                if (list != null) {
                    List<wq61> list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    for (wq61 wq61Var : list2) {
                        arrayList.add(new wq61(wq61Var.a, wq61Var.b, wq61Var.c, wq61Var.d, ((ibr0) wq61Var.e).a));
                    }
                    tt61Var = mqo1.F(arrayList);
                }
                if (tt61Var == null) {
                    tt61Var = fg91.b;
                }
                tt61Var = new tt61(tt61Var, lqs0VarE);
                lqs0 lqs0Var3 = vt61.j;
                ven0Var.setValue(tt61Var);
                return m231Var2;
            case 1:
                hl71 hl71Var = (hl71) this.d;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (!(hl71Var instanceof fl71)) {
                        return m231Var2;
                    }
                    ii71 ii71Var = (ii71) this.e;
                    lnm lnmVar = null;
                    gi71 gi71Var = ii71Var instanceof gi71 ? (gi71) ii71Var : null;
                    if (u890.j(gi71Var != null ? gi71Var.a : null, hl71Var)) {
                        return m231Var2;
                    }
                    iu30Var = (iu30) this.f;
                    ki71 ki71Var2 = (ki71) obj3;
                    this.c = iu30Var;
                    this.b = true;
                    objA = ki71Var2.h.a("sharing.off_platform_destinations_loading", null, new p651((Object) ki71Var2, obj2, hl71Var, lnmVar, (byte) 12), this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iu30 iu30Var2 = (iu30) this.c;
                    hm5.M(obj);
                    iu30Var = iu30Var2;
                    objA = obj;
                }
                iu30Var.invoke(objA);
                return m231Var2;
            case 2:
                ei71 ei71Var2 = (ei71) obj3;
                ki71 ki71Var3 = (ki71) this.f;
                boolean z4 = this.b;
                try {
                    if (z4) {
                        if (z4) {
                            fl71 fl71Var2 = (fl71) this.e;
                            ei71 ei71Var3 = (ei71) this.d;
                            ki71Var = (ki71) this.c;
                            hm5.M(obj);
                            fl71Var = fl71Var2;
                            ei71Var = ei71Var3;
                            objE = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return tt61Var;
                    }
                    hm5.M(obj);
                    fl71 fl71Var3 = (fl71) obj2;
                    kp00 kp00Var = ki71Var3.b;
                    cmt cmtVar = ei71Var2.b;
                    c380 c380Var = fl71Var3.a;
                    this.c = ki71Var3;
                    this.d = ei71Var2;
                    this.e = fl71Var3;
                    this.b = true;
                    objE = kp00Var.e(cmtVar, c380Var, this);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                    fl71Var = fl71Var3;
                    ki71Var = ki71Var3;
                    ei71Var = ei71Var2;
                    tt61Var = new gi71(fl71Var, ki71Var.e.l(ei71Var.b.b, (List) objE), ei71Var.b, ei71Var.c, ei71Var.d, ei71Var.e, ei71Var.f, ei71Var.g);
                    break;
                } catch (Throwable th) {
                    tt61Var = new m231(th);
                }
                Throwable thA = e331.a(tt61Var);
                if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                Throwable thA2 = e331.a(tt61Var);
                if (thA2 != null) {
                    Logger.d(j2h1.I(thA2), new Object[0]);
                    vyo1.y(ki71Var3.f, k771.i, thA2, (p371) null, (ela1) null, (o571) null, ei71Var2.h, 28);
                }
                if (tt61Var instanceof m231) {
                    return fi71.a;
                }
                return tt61Var;
            case 3:
                tq71 tq71Var = (tq71) this.d;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    il71 il71Var = (il71) this.c;
                    ae1 ae1Var = new ae1(tq71Var, il71Var, (String) this.f, (String) this.e, (z771) obj3, (exy) obj2, (lnm) null, (byte) 20);
                    this.b = true;
                    objA2 = il71Var.a("fetching_sticker", ae1Var, this);
                    if (objA2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA2 = obj;
                }
                return new zd71(tq71Var.a, (String) this.e, (jq71) objA2, null, null, 16);
            case 4:
                boolean z6 = this.b;
                try {
                    if (!z6) {
                        hm5.M(obj);
                        ua91 ua91Var = (ua91) this.d;
                        tv80 tv80Var = (tv80) this.e;
                        String str4 = (String) this.f;
                        String str5 = (String) obj3;
                        gn10 gn10Var = (gn10) obj2;
                        p410 p410Var = (p410) ua91Var.d;
                        n4a0 n4a0Var = n4a0.a;
                        ou80 ou80Var = tv80Var.a;
                        aet0 aet0Var = new aet0(str4, str5, gn10Var, ou80Var);
                        this.c = null;
                        this.b = true;
                        if (p410Var.B(n4a0Var, ou80Var, aet0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z6) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = m231Var2;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th2) {
                    m231Var = new m231(th2);
                }
                Throwable thA3 = e331.a(m231Var);
                if (thA3 == null) {
                    return m231Var2;
                }
                Logger.e(thA3, "Error while starting Group Session", new Object[0]);
                return m231Var2;
            case 5:
                b5d1 b5d1Var = (b5d1) this.d;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        mapT = (Map) this.c;
                        hm5.M(obj);
                        objD = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                List<z6d1> list3 = b5d1Var.a.b;
                ArrayList arrayList2 = new ArrayList();
                for (z6d1 z6d1Var : list3) {
                    List list4 = z6d1Var.e;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it = list4.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                y6d1 y6d1Var = (y6d1) it.next();
                                if (y6d1Var.c && y6d1Var.d) {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                        }
                    }
                    List list5 = z6d1Var.e;
                    ArrayList<y6d1> arrayList3 = new ArrayList();
                    for (Object obj4 : list5) {
                        if (!((y6d1) obj4).c) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, i));
                    for (y6d1 y6d1Var2 : arrayList3) {
                        arrayList4.add(new mmr0(y6d1Var2.a, Boolean.valueOf(y6d1Var2.d && !z)));
                    }
                    r7h.W(arrayList4, arrayList2);
                    i = 10;
                }
                mapT = sqg0.T(arrayList2);
                il0 il0Var = (il0) this.e;
                this.c = mapT;
                this.b = true;
                objD = il0Var.d(mapT, this);
                if (objD == d9nVar) {
                    return d9nVar;
                }
                ly0 ly0Var = (ny0) objD;
                if (!u890.j(ly0Var, my0.a)) {
                    if (ly0Var instanceof ly0) {
                        b7xVar = ly0Var.a;
                    } else {
                        eg.o();
                    }
                    return null;
                }
                b7xVar = b7x.a;
                g7d1 g7d1Var = b5d1Var.a;
                String str6 = g7d1Var.a;
                c6d1 c6d1Var = (c6d1) this.f;
                esa1 esa1Var = (esa1) obj3;
                cof0 cof0Var = (cof0) obj2;
                for (String str7 : b7xVar.values()) {
                    int iOrdinal = c6d1Var.b.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            jx0Var = jx0.i;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    jx0Var = jx0.c;
                    int iOrdinal2 = c6d1Var.a.ordinal();
                    if (iOrdinal2 == 0) {
                        str2 = "brand_survey";
                    } else {
                        if (iOrdinal2 != 1) {
                            eg.o();
                            return null;
                        }
                        str2 = "topic_survey";
                    }
                    wn0 wn0VarN = AdError.n();
                    wn0VarN.n(str6);
                    String str8 = g7d1Var.h;
                    if (str8 == null) {
                        str8 = null;
                    }
                    String str9 = "";
                    if (str8 == null) {
                        str8 = "";
                    }
                    wn0VarN.t(str8);
                    wn0VarN.r("preferenceNotUpdated");
                    wn0VarN.q(str7);
                    String str10 = g7d1Var.g;
                    if (str10 == null) {
                        str10 = null;
                    }
                    if (str10 != null) {
                        str9 = str10;
                    }
                    wn0VarN.s(str9);
                    wn0VarN.w(jx0Var.a);
                    wn0VarN.y(g7d1Var.k);
                    wn0VarN.u(str2);
                    ((t2j0) esa1Var.c).a(wn0VarN.build());
                }
                for (Map.Entry entry : sqg0.L(mapT, b7xVar.keySet()).entrySet()) {
                    String str11 = (String) entry.getKey();
                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                    hv0 hv0VarN = AdPreferenceChangedEvent.n();
                    hv0VarN.s();
                    hv0VarN.t(str11);
                    hv0VarN.q(zBooleanValue ? "INTEREST_LEVEL_SEE_MORE" : "INTEREST_LEVEL_DEFAULT");
                    hv0VarN.u();
                    hv0VarN.n(str6);
                    Map map = g7d1Var.l;
                    if (map != null && (str = (String) map.get(str11)) != null) {
                        hv0VarN.r(str);
                    }
                    cof0Var.a.a(hv0VarN.build());
                }
                return new t6d1(b7xVar.isEmpty());
            case 6:
                nav0 nav0Var = (nav0) this.d;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    nqd1 nqd1Var = new nqd1((c9n) this.c, new p9w0(nav0Var), (iu30) this.e, (iu30) this.f, (xu30) obj3, (iu30) obj2, null);
                    this.b = true;
                    return s9p1.D(nav0Var, nqd1Var, this) == d9nVar ? d9nVar : m231Var2;
                }
                if (z8) {
                    hm5.M(obj);
                    return m231Var2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                rk41 rk41Var = (rk41) this.c;
                lf6 lf6Var = (lf6) this.f;
                fbf1 fbf1Var = (fbf1) lf6Var.f;
                hm5.M(obj);
                if (!this.b && !rk41Var.a) {
                    StoryCard storyCard = ((wgm1) this.e).a;
                    if (u890.j(storyCard != null ? storyCard.getId() : null, fbf1Var.a) && !fbf1Var.c.isEmpty()) {
                        ((Function0) obj3).invoke();
                        lf6.e((wgm1) this.e, lf6Var, (Map) obj2, rk41Var, (ven0) this.d, 0);
                    }
                }
                return m231Var2;
            case 8:
                c9n c9nVar = (c9n) this.c;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!((q9g1) obj3).d) {
                    return m231Var2;
                }
                jyv0 jyv0Var = (jyv0) obj2;
                long jLongValue = ((Number) ((ven0) this.d).getValue()).longValue() + ((Number) ((ven0) this.e).getValue()).longValue();
                xd2 xd2Var = new xd2((ven0) this.f, (byte) 22);
                this.c = null;
                this.b = true;
                return nb51.H(c9nVar, jyv0Var, jLongValue, xd2Var, this) == d9nVar ? d9nVar : m231Var2;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC = ((ylk0) ((dlg1) this.c).b).c((String) this.d, (String) this.e, (String) this.f, (String) obj3, ddd1.W0, (zxc0) obj2, this);
                    return objC == d9nVar ? d9nVar : objC;
                }
                if (z10) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ = rwq.q(new wt41((xtb0) this.c, (byte) 11));
                wxl wxlVar = (wxl) this.d;
                d9l d9lVar = new d9l(wxlVar, (dp5) this.e, (e4h1) this.f, (v3h1) obj3, (hdn0) obj2, (byte) 11);
                this.b = true;
                Object objCollect = m441VarQ.collect(new yhg1((byte) 16, wxlVar, d9lVar), this);
                if (objCollect != d9nVar) {
                    objCollect = m231Var2;
                }
                return objCollect == d9nVar ? d9nVar : m231Var2;
            case 11:
                ven0 ven0Var3 = (ven0) this.f;
                frr0 frr0Var = (frr0) obj2;
                yqg yqgVar = (yqg) obj3;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    if (((Boolean) ((ven0) this.d).getValue()).booleanValue() || (k5u0Var = (k5u0) ((ven0) this.e).getValue()) == null) {
                        return m231Var2;
                    }
                    Long lA = k5u0Var.a(yqgVar.b());
                    if (lA != null) {
                        long jLongValue2 = lA.longValue();
                        frr0Var.t(jLongValue2);
                        ven0Var3.setValue(new Long(jLongValue2));
                    }
                    if (!k5u0Var.g || k5u0Var.e || k5u0Var.f <= 0.0f) {
                        return m231Var2;
                    }
                    this.c = k5u0Var;
                    this.b = true;
                    if (hap1.i(250L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k5u0Var = (k5u0) this.c;
                    hm5.M(obj);
                }
                Long lA2 = k5u0Var.a(yqgVar.b());
                if (lA2 != null) {
                    long jLongValue3 = lA2.longValue();
                    frr0Var.t(jLongValue3);
                    ven0Var3.setValue(new Long(jLongValue3));
                }
                return k5u0Var.g ? m231Var2 : m231Var2;
            case 12:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ2 = rwq.q(new of((jkr0) this.c, (byte) 13));
                d9l d9lVar2 = new d9l((q9l1) this.e, (Consumer) this.f, (jjr0) obj3, (hdn0) obj2, (ven0) this.d, (byte) 12);
                this.b = true;
                return m441VarQ2.collect(d9lVar2, this) == d9nVar ? d9nVar : m231Var2;
            case 13:
                ven0 ven0Var4 = (ven0) this.d;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    if (((Number) ven0Var4.getValue()).longValue() <= 0) {
                        return m231Var2;
                    }
                    this.b = true;
                    if (hap1.i(500L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (((yqg) this.f).b() - ((Number) ven0Var4.getValue()).longValue() < 500) {
                    return m231Var2;
                }
                ((ven0) this.e).setValue(Boolean.FALSE);
                ((hdn0) obj2).t(0);
                ((Function0) obj3).invoke();
                return m231Var2;
            default:
                if (this.b) {
                    yln1 yln1Var2 = (yln1) this.e;
                    ieo1Var = (ieo1) this.d;
                    xgn0Var = (xgn0) this.c;
                    zwo1 zwo1Var2 = (zwo1) this.f;
                    hm5.M(obj);
                    yln1Var = yln1Var2;
                    zwo1Var = zwo1Var2;
                } else {
                    hm5.M(obj);
                    zwo1 zwo1Var3 = (zwo1) this.f;
                    ieo1Var = (ieo1) obj3;
                    yln1 yln1Var3 = (yln1) obj2;
                    xgn0 xgn0Var2 = ieo1Var.k;
                    this.f = zwo1Var3;
                    this.c = xgn0Var2;
                    this.d = ieo1Var;
                    this.e = yln1Var3;
                    this.b = true;
                    if (xgn0Var2.a(this) == d9nVar) {
                        return d9nVar;
                    }
                    zwo1Var = zwo1Var3;
                    yln1Var = yln1Var3;
                    xgn0Var = xgn0Var2;
                }
                ieo1 ieo1Var2 = ieo1Var;
                try {
                    if (!ieo1Var2.l) {
                        ieo1Var2.h = fn31.q(ieo1Var2.p.a(), (o8n) null, 0, new q4m1(zwo1Var, ieo1Var2, yln1Var, (lnm) null, (byte) 15), 3);
                        ieo1Var2.l = true;
                        break;
                    }
                    return m231Var2;
                } finally {
                    xgn0Var.c((Object) null);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt61(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt61(ven0 ven0Var, yqg yqgVar, ven0 ven0Var2, frr0 frr0Var, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        this.d = ven0Var;
        this.g = yqgVar;
        this.e = ven0Var2;
        this.h = frr0Var;
        this.f = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt61(jkr0 jkr0Var, q9l1 q9l1Var, Consumer consumer, jjr0 jjr0Var, hdn0 hdn0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.c = jkr0Var;
        this.e = q9l1Var;
        this.f = consumer;
        this.g = jjr0Var;
        this.h = hdn0Var;
        this.d = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt61(vt61 vt61Var, ven0 ven0Var, sjq0 sjq0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.g = vt61Var;
        this.e = ven0Var;
        this.h = sjq0Var;
        this.f = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt61(ki71 ki71Var, ei71 ei71Var, fl71 fl71Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.f = ki71Var;
        this.g = ei71Var;
        this.h = fl71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt61(q9g1 q9g1Var, jyv0 jyv0Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.g = q9g1Var;
        this.h = jyv0Var;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt61(hdl1 hdl1Var, yqg yqgVar, Function0 function0, ven0 ven0Var, ven0 ven0Var2, hdn0 hdn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.c = hdl1Var;
        this.f = yqgVar;
        this.g = function0;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.h = hdn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt61(ieo1 ieo1Var, yln1 yln1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 14;
        this.g = ieo1Var;
        this.h = yln1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt61(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
    }
}
