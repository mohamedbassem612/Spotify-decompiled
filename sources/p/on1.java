package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.inappuserfeedback.issuereporter.FeedbackSubmissionException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class on1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 9;
    public boolean b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(cem1 cem1Var, boolean z, tob1 tob1Var, ven0 ven0Var, ven0 ven0Var2, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.e = cem1Var;
        this.b = z;
        this.f = tob1Var;
        this.d = ven0Var;
        this.g = ven0Var2;
        this.c = z2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                on1 on1Var = new on1((pn1) this.f, (String) obj3, this.c, (tv80) obj2, lnmVar);
                on1Var.e = obj;
                return on1Var;
            case 1:
                return new on1(this.b, this.c, (xgm1) this.e, (String) obj3, (rx7) this.f, (ven0) obj2, lnmVar);
            case 2:
                return new on1((mmf) this.e, (String) obj3, (cmf) this.f, this.c, (ven0) obj2, lnmVar);
            case 3:
                on1 on1Var2 = new on1((y9s) obj2, this.c, (String) obj3, lnmVar);
                on1Var2.e = obj;
                return on1Var2;
            case 4:
                on1 on1Var3 = new on1((Map) this.f, this.c, (hre1) obj2, (String) obj3, lnmVar);
                on1Var3.e = obj;
                return on1Var3;
            case 5:
                return new on1((ven0) this.e, (c380) this.f, this.c, (xtb0) obj3, (ven0) obj2, lnmVar);
            case 6:
                return new on1((hb4) this.e, this.c, (zwz0) this.f, (ecl) obj3, (g9r) obj2, lnmVar);
            case 7:
                return new on1((y0q0) this.e, (q0q0) this.f, (slt0) obj3, (tv80) obj2, this.c, lnmVar);
            case 8:
                on1 on1Var4 = new on1((iu30) this.e, (nl9) this.f, (ven0) obj2, (String) obj3, lnmVar);
                on1Var4.c = ((Boolean) obj).booleanValue();
                return on1Var4;
            case 9:
                return new on1((String) obj3, (String) this.e, (List) this.f, this.c, (g9i1) obj2, lnmVar);
            case 10:
                return new on1(this.c, (drr0) this.f, (ven0) obj3, (ven0) obj2, lnmVar);
            default:
                return new on1((cem1) this.e, this.b, (tob1) this.f, (ven0) obj3, (ven0) obj2, this.c, lnmVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.inappuserfeedback.issuereporter.FeedbackSubmissionException */
    public final Object invoke(Object obj, Object obj2) throws FeedbackSubmissionException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((on1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                ((on1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return ((on1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((on1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((on1) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((on1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((on1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((on1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((on1) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                return ((on1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                return ((on1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                ((on1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.inappuserfeedback.issuereporter.FeedbackSubmissionException */
    public final Object invokeSuspend(Object obj) throws FeedbackSubmissionException {
        nj3 m231Var;
        Object objJ;
        y9s y9sVar;
        Object objQ;
        ArrayList arrayList;
        Integer num;
        Observable observableH;
        gjk0 gjk0Var;
        Object objA;
        o811 o811Var;
        m9i1 m9i1Var;
        hth0 hth0Var;
        qem1 qem1Var;
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        Single singleC = ((pn1) this.f).b.c(Collections.singletonList(str), str, str, this.c, new gj3(27, (tv80) this.g));
                        this.e = null;
                        this.b = true;
                        objJ = fc11.j(singleC, this);
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    m231Var = (nj3) objJ;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.e(thA, f4i1.f("Failed to curate playlist, ", str, "."), new Object[0]);
                }
                return rih1.a;
            case 1:
                ven0 ven0Var = (ven0) this.g;
                hm5.M(obj);
                if (this.b && !this.c && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    nho1.z((xgm1) this.e, (String) this.d, (rx7) this.f);
                }
                return rih1.a;
            case 2:
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        mdd0 mdd0Var = ((mmf) this.e).e;
                        String str2 = (String) this.d;
                        boolean z3 = !((cmf) this.f).a;
                        this.b = true;
                        if (mdd0Var.j(str2, this, z3) == d9nVar2) {
                            return d9nVar2;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused) {
                    ((ven0) this.g).setValue(Boolean.valueOf(this.c));
                }
                return rih1.a;
            case 3:
                c9n c9nVar = (c9n) this.e;
                d9n d9nVar3 = d9n.a;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 4, new p9s((y9s) this.g, (lnm) null, (byte) 3), 1);
                    znl1 znl1Var = ((y9s) this.g).f;
                    boolean z5 = this.c;
                    String str3 = (String) this.d;
                    synchronized (znl1Var) {
                        try {
                            faa0 faa0Var = znl1Var.Y;
                            if (faa0Var != null) {
                                faa0Var.d((CancellationException) null);
                            }
                            znl1Var.Y = fn31.T(znl1Var.t, (o8n) null, 0, new du2(znl1Var, z5, str3, (lnm) null, (byte) 25), 3);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    y9sVar = (y9s) this.g;
                    this.e = null;
                    this.f = y9sVar;
                    this.b = true;
                    objQ = s2tVarQ.Q(this);
                    if (objQ == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y9s y9sVar2 = (y9s) this.f;
                    hm5.M(obj);
                    y9sVar = y9sVar2;
                    objQ = obj;
                }
                return new bla1(y9sVar.g((xnl1) objQ));
            case 4:
                Map map = (Map) this.f;
                vr20 vr20Var = (vr20) this.e;
                d9n d9nVar4 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    Collection<lvy> collectionValues = map.values();
                    ArrayList arrayList2 = new ArrayList();
                    for (lvy lvyVar : collectionValues) {
                        r7h.W(p7h.M(new Long[]{new Long(lvyVar.b.a), new Long(lvyVar.c.a)}), arrayList2);
                    }
                    List listJ0 = o7h.j0(arrayList2);
                    if (this.c) {
                        List list = listJ0;
                        arrayList = new ArrayList(q7h.U(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new uve1(((Number) it.next()).longValue()));
                        }
                    } else {
                        List list2 = listJ0;
                        arrayList = new ArrayList(q7h.U(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new tve1(((Number) it2.next()).longValue()));
                        }
                    }
                    lt20 lt20VarH = ((hre1) this.g).h((String) this.d, arrayList);
                    wem wemVar = new wem((byte) 12, listJ0, map, vr20Var);
                    this.e = null;
                    this.b = true;
                    if (lt20VarH.collect(wemVar, this) == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 5:
                d9n d9nVar5 = d9n.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    Integer num2 = (Integer) ((ven0) this.e).getValue();
                    if (num2 != null) {
                        c380 c380Var = (c380) this.f;
                        boolean z8 = this.c;
                        xtb0 xtb0Var = (xtb0) this.d;
                        ven0 ven0Var2 = (ven0) this.g;
                        int iIntValue = num2.intValue();
                        if (iIntValue < c380Var.size() && ((num = (Integer) ven0Var2.getValue()) == null || num.intValue() != iIntValue)) {
                            ven0Var2.setValue(new Integer(iIntValue));
                            if (!z8) {
                                int size = c380Var.size();
                                d7v d7vVar = new d7v(ven0Var2, (byte) 19);
                                this.b = true;
                                if (y9g1.u(xtb0Var, iIntValue, size, d7vVar, this) == d9nVar5) {
                                    return d9nVar5;
                                }
                            }
                        }
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 6:
                d9n d9nVar6 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    hb4 hb4Var = (hb4) this.e;
                    if (hb4Var.t != null) {
                        observableH = ((Observable) hb4Var.v.getValue()).map(qzs0.g).distinctUntilChanged();
                        observableH.getClass();
                    } else {
                        observableH = l1d.h(hb4Var.s);
                    }
                    ezc ezcVarG = yoi1.g(observableH.startWithItem(Boolean.valueOf(this.c)).distinctUntilChanged());
                    lqv lqvVar = new lqv((zwz0) this.f, (ecl) this.d, (g9r) this.g, (lnm) null, (byte) 22);
                    this.b = true;
                    if (l4p1.q(ezcVarG, lqvVar, this) == d9nVar6) {
                        return d9nVar6;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 7:
                d9n d9nVar7 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    ylt0 ylt0Var = ((y0q0) this.e).f;
                    q0q0 q0q0Var = (q0q0) this.f;
                    ast0 ast0Var = q0q0Var.e;
                    y4m y4mVar = q0q0Var.c;
                    r840 r840Var = q0q0Var.d;
                    g0q0 g0q0Var = q0q0Var.g;
                    if (g0q0Var instanceof g0q0) {
                        gjk0Var = new gjk0(g0q0Var.b);
                    } else {
                        if (!g0q0Var.equals(h0q0.a)) {
                            eg.o();
                            return null;
                        }
                        gjk0Var = hjk0.a;
                    }
                    slt0 slt0Var = (slt0) this.d;
                    tv80 tv80Var = (tv80) this.g;
                    boolean z11 = this.c;
                    this.b = true;
                    if (ylt0Var.a(slt0Var, ast0Var, r840Var, y4mVar, tv80Var, gjk0Var, z11, this) == d9nVar7) {
                        return d9nVar7;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 8:
                iu30 iu30Var = (iu30) this.e;
                ven0 ven0Var3 = (ven0) this.g;
                boolean z12 = this.c;
                d9n d9nVar8 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    if (z12) {
                        iu30Var.invoke(j1c1.a((j1c1) ven0Var3.getValue(), (List) null, (String) null, new gax(new Integer(2131962036), (String) null), (String) null, 23));
                        return rih1.a;
                    }
                    nl9 nl9Var = (nl9) this.f;
                    ve01 ve01Var = (ve01) ((esa1) nl9Var.e).c;
                    p651 p651Var = new p651(nl9Var, (String) this.d, iu30Var, ven0Var3, (lnm) null, (byte) 22);
                    this.c = z12;
                    this.b = true;
                    if (l4p1.q(ve01Var, p651Var, this) == d9nVar8) {
                        return d9nVar8;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                eg.m("SharedFlow never completes, this call should never return.");
                return null;
            case 9:
                d9n d9nVar9 = d9n.a;
                boolean z14 = this.b;
                try {
                    if (!z14) {
                        hm5.M(obj);
                        xg90 xg90Var = new xg90((String) this.d, (String) this.e, (List) this.f, this.c);
                        ug90 ug90Var = ((g9i1) this.g).a;
                        this.b = true;
                        objA = ug90Var.a(xg90Var, this);
                        if (objA == d9nVar9) {
                            return d9nVar9;
                        }
                    } else {
                        if (!z14) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objA = obj;
                    }
                    return (String) objA;
                } catch (Exception e3) {
                    Logger.e(e3, "Failed to send user feedback", new Object[0]);
                    throw new FeedbackSubmissionException("Failed to send user feedback", e3);
                }
            case 10:
                d9n d9nVar10 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    if (this.c) {
                        return rih1.a;
                    }
                    o811Var = new o811();
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o811Var = (o811) this.e;
                    hm5.M(obj);
                }
                o811 o811Var2 = o811Var;
                do {
                    m9i1Var = new m9i1(o811Var2, (ven0) this.d, (drr0) this.f, (ven0) this.g, (byte) 10);
                    this.e = o811Var2;
                    this.b = true;
                } while (s110.h(getContext()).D(m9i1Var, this) != d9nVar10);
                return d9nVar10;
            default:
                hm5.M(obj);
                ycm1 ycm1Var = ((cem1) this.e).e;
                boolean z16 = !((Boolean) ((ven0) this.d).getValue()).booleanValue();
                if (z16 != ycm1Var.q) {
                    ycm1Var.q = z16;
                    ycm1Var.g();
                    wcm1 wcm1Var = wcm1.a;
                    m3c m3cVar = ycm1Var.j;
                    if (m3cVar != null && (qem1Var = ycm1Var.a) != null) {
                        if (ycm1Var.q) {
                            m3cVar.i(wcm1Var);
                        } else {
                            qem1Var.f();
                            m3cVar.a(wcm1Var, qem1Var);
                            if (ycm1Var.l) {
                                qem1Var.h();
                            }
                        }
                    }
                    ycm1Var.f();
                    ycm1Var.h();
                }
                boolean z17 = this.b;
                oem1 oem1Var = this.c ? (oem1) ((ven0) this.g).getValue() : null;
                float fFloatValue = ((Number) ((tob1) this.f).getValue()).floatValue();
                boolean z18 = ycm1Var.o;
                ycm1Var.o = z17;
                ycm1Var.k = fFloatValue;
                ycm1Var.h();
                boolean z19 = u890.j(oem1Var, nem1.a) || u890.j(oem1Var, kem1.a) || u890.j(oem1Var, jem1.a);
                if (z17 || z19) {
                    ycm1Var.d();
                } else if (!z18) {
                    ycm1Var.l = true;
                    m3c m3cVar2 = ycm1Var.j;
                    if (m3cVar2 != null) {
                        Iterator it3 = ycm1Var.e().iterator();
                        while (it3.hasNext()) {
                            xcm1 xcm1Var = new xcm1((cdm1) it3.next());
                            if (!m3cVar2.b && (hth0Var = (hth0) ((LinkedHashMap) m3cVar2.d).get(xcm1Var)) != null) {
                                hth0Var.j();
                            }
                        }
                    }
                } else if (!ycm1Var.l) {
                    ycm1Var.l = true;
                    m3c m3cVar3 = ycm1Var.j;
                    if (m3cVar3 != null) {
                        m3cVar3.g();
                    }
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(Map map, boolean z, hre1 hre1Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.f = map;
        this.c = z;
        this.g = hre1Var;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(pn1 pn1Var, String str, boolean z, tv80 tv80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = pn1Var;
        this.d = str;
        this.c = z;
        this.g = tv80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(hb4 hb4Var, boolean z, zwz0 zwz0Var, ecl eclVar, g9r g9rVar, lnm lnmVar) {
        super(2, lnmVar);
        this.e = hb4Var;
        this.c = z;
        this.f = zwz0Var;
        this.d = eclVar;
        this.g = g9rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(mmf mmfVar, String str, cmf cmfVar, boolean z, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = mmfVar;
        this.d = str;
        this.f = cmfVar;
        this.c = z;
        this.g = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(y9s y9sVar, boolean z, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.g = y9sVar;
        this.c = z;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(iu30 iu30Var, nl9 nl9Var, ven0 ven0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.e = iu30Var;
        this.f = nl9Var;
        this.g = ven0Var;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(ven0 ven0Var, c380 c380Var, boolean z, xtb0 xtb0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.e = ven0Var;
        this.f = c380Var;
        this.c = z;
        this.d = xtb0Var;
        this.g = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(y0q0 y0q0Var, q0q0 q0q0Var, slt0 slt0Var, tv80 tv80Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.e = y0q0Var;
        this.f = q0q0Var;
        this.d = slt0Var;
        this.g = tv80Var;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(String str, String str2, List list, boolean z, g9i1 g9i1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = str;
        this.e = str2;
        this.f = list;
        this.c = z;
        this.g = g9i1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(boolean z, drr0 drr0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.f = drr0Var;
        this.d = ven0Var;
        this.g = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(boolean z, boolean z2, xgm1 xgm1Var, String str, rx7 rx7Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = z2;
        this.e = xgm1Var;
        this.d = str;
        this.f = rx7Var;
        this.g = ven0Var;
    }
}
