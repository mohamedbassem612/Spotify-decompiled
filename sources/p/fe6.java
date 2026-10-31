package p;

import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.mobius.functions.Consumer;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fe6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe6(int i, Object obj, lnm lnmVar, g7m1 g7m1Var, oe6 oe6Var) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.c = i;
        this.d = obj;
        this.e = g7m1Var;
        this.f = oe6Var;
    }

    public static final int e(ptb0 ptb0Var, int i, int i2) {
        Object next;
        Iterator it = ptb0Var.l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((qtb0) next).a != i2);
        qtb0 qtb0Var = (qtb0) next;
        return qtb0Var != null ? qtb0Var.q : i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                return new fe6(this.c, this.d, lnmVar, (g7m1) obj4, (oe6) obj3);
            case 1:
                return new fe6(obj2, this.c, obj4, obj3, lnmVar, (byte) 1);
            case 2:
                return new fe6(obj2, this.c, obj4, obj3, lnmVar, (byte) 2);
            case 3:
                return new fe6(obj2, obj4, this.c, obj3, lnmVar, (byte) 3);
            case 4:
                return new fe6(obj2, obj4, this.c, obj3, lnmVar, (byte) 4);
            case 5:
                return new fe6(obj2, this.c, obj4, obj3, lnmVar, (byte) 5);
            case 6:
                return new fe6(obj2, obj4, obj3, this.c, lnmVar, (byte) 6);
            case 7:
                return new fe6(obj2, obj4, obj3, this.c, lnmVar, (byte) 7);
            case 8:
                fe6 fe6Var = new fe6((owy0) obj2, (String) obj4, (String) obj3, lnmVar, (byte) 8);
                fe6Var.c = ((Number) obj).intValue();
                return fe6Var;
            case 9:
                fe6 fe6Var2 = new fe6((owy0) obj2, (String) obj4, (String) obj3, lnmVar, (byte) 9);
                fe6Var2.c = ((Number) obj).intValue();
                return fe6Var2;
            case 10:
                return new fe6(obj2, obj4, obj3, this.c, lnmVar, (byte) 10);
            case 11:
                return new fe6(obj2, obj4, this.c, obj3, lnmVar, (byte) 11);
            case 12:
                return new fe6(obj2, obj4, this.c, obj3, lnmVar, (byte) 12);
            case 13:
                return new fe6(obj2, obj4, this.c, obj3, lnmVar, (byte) 13);
            case 14:
                return new fe6(obj2, obj4, this.c, obj3, lnmVar, (byte) 14);
            case 15:
                return new fe6(obj2, obj4, obj3, this.c, lnmVar, (byte) 15);
            default:
                return new fe6(obj2, obj4, obj3, this.c, lnmVar, (byte) 16);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3 A[LOOP:2: B:46:0x00dd->B:48:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    public final Object invokeSuspend(Object obj) {
        Object objE1;
        Object objJ;
        um91 um91Var;
        ptb0 ptb0VarH;
        int i;
        ArrayList arrayList;
        Iterator it;
        int iG;
        boolean z;
        int i2;
        String str;
        byte b = this.a;
        int i3 = -1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Comparable comparable = d9n.a;
        Object objS = null;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int i4 = this.c;
                bju bjuVar = ((g7m1) obj3).b;
                String strC = f4i1.c(i4, "artist_");
                i24 i24Var = new i24((SceneTemplate.ArtistCardsContent.TradingCard) obj4, (oe6) obj2, (lnm) null, (byte) 3);
                this.b = true;
                Object objE = bjuVar.e(strC, i24Var, this);
                return objE == comparable ? comparable : objE;
            case 1:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                SceneTemplate.ArtistCardsContent.TradingCard tradingCard = (SceneTemplate.ArtistCardsContent.TradingCard) obj4;
                int i5 = this.c;
                bju bjuVar2 = (bju) obj3;
                gw70 gw70Var = (gw70) obj2;
                this.b = true;
                int iV = tradingCard.v();
                int i6 = iV == 0 ? -1 : vj6.a[l1d.C(iV)];
                if (i6 != -1) {
                    if (i6 == 1) {
                        Object objZ = xio1.z(tradingCard.n(), i5, bjuVar2, gw70Var, this);
                        if (objZ != comparable) {
                            objZ = (bj6) objZ;
                        }
                        objS = objZ;
                    } else if (i6 == 2) {
                        SceneTemplate.ArtistCardsContent.BonusCard bonusCardT = tradingCard.t();
                        if (bonusCardT.r() && bonusCardT.q() && !bonusCardT.o().n().isEmpty() && !bonusCardT.n().p().isEmpty()) {
                            objS = smo1.s(new yj6(bonusCardT, bjuVar2, i5, gw70Var, (lnm) null), this);
                        }
                        if (objS != comparable) {
                            objS = (bj6) objS;
                        }
                    } else if (i6 != 3) {
                        eg.o();
                        return null;
                    }
                }
                return objS == comparable ? comparable : objS;
            case 2:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    return pxd0.v((pob0) obj4, this.c, (lbh) obj3, (ar41) obj2, this) == comparable ? comparable : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i7 = this.c;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        objE1 = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                objE1 = ((k9) obj4).e1((vjh0) obj3, this);
                if (objE1 == comparable) {
                    return comparable;
                }
                if (((Boolean) objE1).booleanValue()) {
                    return new mmr0(new Integer(i7), ((ksc) obj2).d.invoke(new Integer(i7)));
                }
                return null;
            case 4:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (((String) obj4) == null || !((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    return rih1Var;
                }
                int i8 = this.c - 1;
                this.b = true;
                df41 df41Var = xtb0.y;
                return ((xtb0) obj3).f(i8, 0, this) == comparable ? comparable : rih1Var;
            case 5:
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                bbc bbcVar = (bbc) obj2;
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        int i9 = this.c;
                        mr20 mr20Var = ((mr20[]) obj4)[i9];
                        ybh ybhVar = new ybh(bbcVar, i9);
                        this.b = true;
                        if (mr20Var.collect(ybhVar, this) == comparable) {
                            return comparable;
                        }
                    } else {
                        if (!z7) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    if (atomicInteger.decrementAndGet() != 0) {
                        return rih1Var;
                    }
                    bbcVar.H((Throwable) null);
                    return rih1Var;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        bbcVar.H((Throwable) null);
                    }
                    throw th;
                }
            case 6:
                es41 es41Var = (es41) obj2;
                err0 err0Var = es41Var.f;
                ven0 ven0Var = (ven0) obj4;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    if (((Boolean) ven0Var.getValue()).booleanValue() || ((xbk) ((ven0) obj3).getValue()).a.length() <= 0 || err0Var.s() <= 0) {
                        return rih1Var;
                    }
                    int i10 = this.c;
                    int iS = err0Var.s();
                    if (i10 > iS) {
                        i10 = iS;
                    }
                    this.b = true;
                    if (kqn1.v(es41Var, i10 - es41Var.a.s(), this) == comparable) {
                        return comparable;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 7:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    int i11 = this.c;
                    this.b = true;
                    return ((a680) ((cp31) obj4).e).t((km61) obj3, (Integer) obj2, i11, this) == comparable ? comparable : rih1Var;
                }
                if (z9) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                int i12 = this.c;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.c = i12;
                this.b = true;
                Comparable comparableB = ((dy70) obj4).e.b((String) obj3, i12, (String) obj2, q520.b, this);
                return comparableB == comparable ? comparable : comparableB;
            case 9:
                int i13 = this.c;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.c = i13;
                this.b = true;
                Comparable comparableB2 = ((g0a0) obj4).f.b((String) obj3, i13, (String) obj2, q520.b, this);
                return comparableB2 == comparable ? comparable : comparableB2;
            case 10:
                Consumer consumer = (Consumer) obj2;
                String str2 = (String) obj3;
                cr6 cr6Var = (cr6) obj4;
                boolean z12 = this.b;
                if (!z12) {
                    mr20 mr20VarK = o4p1.k(new m441(new z290(new lt20(h4p1.f(new n0a0((vld0) cr6Var.b, str2, (lnm) null)), new bz0(3, (lnm) null, (byte) 17), (byte) 0), (lnm) null, cy30.u(obj), consumer)), 0, 3);
                    n77 n77Var = new n77(cr6Var, this.c, str2, consumer);
                    this.b = true;
                    return mr20VarK.collect(n77Var, this) == comparable ? comparable : rih1Var;
                }
                if (z12) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarF = h4p1.f(new tv1((l0x0) obj4, (Set) obj3, this.c, (LinkedHashMap) obj2, (lnm) null, (byte) 7));
                this.b = true;
                Object objI = b5p1.i(ezcVarF, this);
                return objI == comparable ? comparable : objI;
            case 12:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                vp70 vp70Var = l041.h;
                Object objD = ((l041) obj4).d((String) obj3, this.c, (dqz0) obj2, this);
                return objD == comparable ? comparable : objD;
            case 13:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    rn41 rn41Var = new rn41((AtomicInteger) obj3, this.c, (ssw0) obj2, (byte) 1);
                    this.b = true;
                    return ((mr20) obj4).collect(rn41Var, this) == comparable ? comparable : rih1Var;
                }
                if (z15) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    p1f0 p1f0Var = (p1f0) ((rbc0) obj4).d;
                    Single singleFlatMap = Single.zip(((xvo) p1f0Var.d).a(true).firstOrError(), Single.just(Boolean.valueOf(((c9c0) p1f0Var.c).b.current().getValue() != null)), ((o241) p1f0Var.b).a.map(c4x0.O0).firstOrError(), new dn81(p1f0Var, (byte) 3)).flatMap(new jn91(p1f0Var, this.c, (SmartShuffleButtonView) obj3, (byte) 1));
                    this.b = true;
                    objJ = fc11.j(singleFlatMap, this);
                    if (objJ == comparable) {
                        return comparable;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ = obj;
                }
                if (((in91) objJ) != in91.a || (um91Var = (um91) obj2) == null) {
                    return rih1Var;
                }
                i8h1 i8h1Var = um91Var.a;
                f0m0 f0m0Var = um91Var.c;
                String str3 = um91Var.b;
                x6h1 x6h1VarC = f0m0Var.b.c();
                x6h1VarC.i.add(new a7h1("onboarding_tooltip", (String) null, (Integer) null, str3, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = f0m0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 15:
                xtb0 xtb0Var = (xtb0) obj3;
                int i14 = this.c;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str4 = (String) obj2;
                Iterator it2 = ((c380) obj4).iterator();
                int i15 = 0;
                while (it2.hasNext()) {
                    if (((kba1) it2.next()).a.equals(str4)) {
                        i3 = i15;
                        if (i3 < 0) {
                            return rih1Var;
                        }
                        ptb0VarH = xtb0Var.h();
                        List list = ptb0VarH.l;
                        i = ptb0VarH.m;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : list) {
                            qtb0 qtb0Var = (qtb0) obj5;
                            i2 = qtb0Var.p;
                            if (i2 < i && i2 + qtb0Var.q <= ptb0VarH.n) {
                                arrayList2.add(obj5);
                            }
                        }
                        arrayList = new ArrayList(q7h.U(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Integer(((qtb0) it.next()).a));
                        }
                        if (arrayList.contains(new Integer(i3))) {
                            return rih1Var;
                        }
                        iG = (((int) (ptb0VarH.g() >> 32)) - (-i)) - ptb0VarH.r;
                        if (i3 > 0) {
                            z = false;
                        } else if (e(ptb0VarH, i14, i3) + e(ptb0VarH, i14, i3 - 1) + ptb0VarH.s <= iG) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i3--;
                        }
                        this.b = true;
                        if (xtb0Var.f(i3, 0, this) == comparable) {
                            return comparable;
                        }
                        return rih1Var;
                    }
                    i15++;
                }
                if (i3 < 0) {
                    return rih1Var;
                }
                ptb0VarH = xtb0Var.h();
                List list2 = ptb0VarH.l;
                i = ptb0VarH.m;
                ArrayList arrayList3 = new ArrayList();
                while (r3.hasNext()) {
                    qtb0 qtb0Var2 = (qtb0) obj5;
                    i2 = qtb0Var2.p;
                    if (i2 < i) {
                    }
                }
                arrayList = new ArrayList(q7h.U(arrayList3, 10));
                it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((qtb0) it.next()).a));
                }
                if (arrayList.contains(new Integer(i3))) {
                    return rih1Var;
                }
                iG = (((int) (ptb0VarH.g() >> 32)) - (-i)) - ptb0VarH.r;
                if (i3 > 0) {
                    z = false;
                } else if (e(ptb0VarH, i14, i3) + e(ptb0VarH, i14, i3 - 1) + ptb0VarH.s <= iG) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i3--;
                }
                this.b = true;
                if (xtb0Var.f(i3, 0, this) == comparable) {
                    return comparable;
                }
                return rih1Var;
            default:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                znl1 znl1Var = ((eol1) obj4).a;
                String str5 = ((wnl1) obj3).c;
                String str6 = (String) obj2;
                int i16 = this.c;
                if (i16 == 1) {
                    str = "TRANSFERRED";
                } else {
                    if (i16 != 2) {
                        throw null;
                    }
                    str = "TRANSFERRED_DIFFERENT_DEVICE";
                }
                String str7 = str;
                this.b = true;
                Object objY = fn31.Y(znl1Var.i, new nsf1(znl1Var, str5, str6, str7, (lnm) null, (byte) 16), this);
                if (objY != comparable) {
                    objY = rih1Var;
                }
                return objY == comparable ? comparable : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe6(Object obj, int i, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = i;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe6(Object obj, Object obj2, int i, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = i;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe6(Object obj, Object obj2, Object obj3, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe6(owy0 owy0Var, String str, String str2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = owy0Var;
        this.e = str;
        this.f = str2;
    }
}
