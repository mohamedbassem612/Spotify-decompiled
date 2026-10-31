package p;

import android.graphics.Color;
import com.spotify.campaignsservice.retrieval.v1.CardViewedState;
import com.spotify.campaignsservice.retrieval.v1.Retrieval;
import com.spotify.campaignsservice.retrieval.v1.RetrievalCard;
import com.spotify.campaignsservice.retrieval.v1.SummaryShareCard;
import com.spotify.wrapped.v1.proto.AccessibilityDefinition;
import com.spotify.wrapped.v1.proto.Paragraph;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o931 {
    public final ohm1 a;
    public final da31 b;

    public o931(ohm1 ohm1Var, da31 da31Var) {
        this.a = ohm1Var;
        this.b = da31Var;
    }

    public static List c(String str, List list) {
        List list2;
        boolean z;
        z5c1 z5c1Var;
        Object next;
        if (!list.isEmpty() && (!((z = (list2 = list) instanceof Collection)) || !list2.isEmpty())) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((z5c1) it.next()).d != 1) {
                    if (!z || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((z5c1) it2.next()).d != 3) {
                                ca80 it3 = o7h.u1(list2).iterator();
                                do {
                                    ca80 ca80Var = it3;
                                    z5c1Var = null;
                                    if (!((Iterator) ca80Var.c).hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = ca80Var.next();
                                } while (((z5c1) ((aa80) next).b).d == 3);
                                aa80 aa80Var = (aa80) next;
                                if (aa80Var != null) {
                                    int i = aa80Var.a;
                                    z5c1 z5c1Var2 = (z5c1) aa80Var.b;
                                    z5c1Var = z5c1Var2.d == 2 ? z5c1Var2 : (z5c1) o7h.t0(i - 1, list);
                                }
                                List listN = p7h.N(z5c1Var);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : list2) {
                                    if (!u890.j((z5c1) obj, z5c1Var)) {
                                        arrayList.add(obj);
                                    }
                                }
                                return o7h.N0(arrayList, listN);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (u890.j(((z5c1) obj2).a, str)) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!u890.j(((z5c1) obj3).a, str)) {
                            arrayList3.add(obj3);
                        }
                    }
                    return o7h.N0(arrayList3, arrayList2);
                }
            }
        }
        return list;
    }

    public static mmr0 d(Retrieval retrieval, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((z5c1) it.next()).d != 3) {
                    return new mmr0(retrieval.r().p(), retrieval.r().n());
                }
            }
        }
        return new mmr0(retrieval.p().p(), retrieval.p().n());
    }

    public static ff e(AccessibilityDefinition accessibilityDefinition) {
        return new ff(accessibilityDefinition.getDescription(), accessibilityDefinition.n(), null);
    }

    public static p5c1 f(RetrievalCard.RetrievalBackground retrievalBackground) {
        x660 x660Var;
        if (retrievalBackground.s()) {
            fi31 fi31VarR = RiveAnimation.r();
            fi31VarR.q(retrievalBackground.p().getUrl());
            fi31VarR.n(retrievalBackground.p().o());
            return new n5c1(fi31VarR.build());
        }
        if (retrievalBackground.r()) {
            return new m5c1(retrievalBackground.o().getUrl());
        }
        if (!retrievalBackground.t()) {
            eg.m("the background must have some resource");
            return null;
        }
        SummaryShareCard summaryShareCardQ = retrievalBackground.q();
        int iOrdinal = summaryShareCardQ.n().x().q().ordinal();
        if (iOrdinal == 2) {
            x660Var = x660.b;
        } else if (iOrdinal != 3) {
            x660Var = iOrdinal != 4 ? x660.a : x660.d;
        } else {
            x660Var = x660.c;
        }
        ArrayList arrayListA = syc1.a(summaryShareCardQ.n().x(), x660Var);
        ArrayList arrayList = new ArrayList(q7h.U(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(new wp70((String) it.next()));
        }
        return new o5c1(new jxc1(new v660(arrayList, x660Var, summaryShareCardQ.n().x().t() ? new wp70(summaryShareCardQ.n().x().p().getUrl()) : null, syc1.c(summaryShareCardQ.n().x())), new wp70(summaryShareCardQ.n().o().getUrl()), summaryShareCardQ.n().F() ? syc1.b(summaryShareCardQ.n().z()) : null, summaryShareCardQ.n().G() ? syc1.b(summaryShareCardQ.n().A()) : null, summaryShareCardQ.n().C() ? syc1.b(summaryShareCardQ.n().q()) : null, summaryShareCardQ.n().D() ? syc1.b(summaryShareCardQ.n().r()) : null, summaryShareCardQ.n().v(), Color.parseColor(summaryShareCardQ.n().u()), summaryShareCardQ.n().y(), summaryShareCardQ.n().n(), summaryShareCardQ.n().t(), summaryShareCardQ.n().B() ? new wp70(summaryShareCardQ.n().p().getUrl()) : null), Color.parseColor(summaryShareCardQ.p()));
    }

    public static ArrayList g(List list) {
        List<z5c1> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (z5c1 z5c1Var : list2) {
            ff ffVar = z5c1Var.g;
            x5c1 x5c1Var = z5c1Var.i;
            arrayList.add(new z5c1(z5c1Var.a, z5c1Var.b, z5c1Var.c, z5c1Var.d, z5c1Var.e, z5c1Var.f, ffVar != null ? new ff(ffVar.a, ffVar.b, x5c1Var.b) : null, z5c1Var.h, x5c1Var));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        m931 m931Var;
        Object objB;
        Retrieval retrieval;
        o931 o931Var;
        if (onmVar instanceof m931) {
            m931Var = (m931) onmVar;
            int i = m931Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                m931Var.f = i - Integer.MIN_VALUE;
            } else {
                m931Var = new m931(this, onmVar);
            }
        } else {
            m931Var = new m931(this, onmVar);
        }
        Object objA = m931Var.d;
        int i2 = m931Var.f;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                da31 da31Var = this.b;
                m931Var.f = 1;
                objA = da31Var.a(m931Var);
                if (objA == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                hm5.M(objA);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o931 o931Var2 = m931Var.c;
                o931 o931Var3 = m931Var.b;
                Retrieval retrieval2 = m931Var.a;
                hm5.M(objA);
                o931Var = o931Var2;
                this = o931Var3;
                retrieval = retrieval2;
                objB = objA;
            }
            String strQ = retrieval.q();
            o931Var.getClass();
            List listC = c(strQ, (List) objB);
            this.getClass();
            ArrayList arrayListG = g(listC);
            mmr0 mmr0VarD = d(retrieval, arrayListG);
            return new ja31(arrayListG, (String) mmr0VarD.a, retrieval.v(), (String) mmr0VarD.b, retrieval.t(), retrieval.n(), false, e(retrieval.s()), e(retrieval.w()), e(retrieval.u()));
            Retrieval retrieval3 = (Retrieval) objA;
            h290 h290VarO = retrieval3.o();
            m931Var.a = retrieval3;
            m931Var.b = this;
            m931Var.c = this;
            m931Var.f = 2;
            objB = b(h290VarO, m931Var);
            if (objB != d9nVar) {
                retrieval = retrieval3;
                o931Var = this;
                String strQ2 = retrieval.q();
                o931Var.getClass();
                List listC2 = c(strQ2, (List) objB);
                this.getClass();
                ArrayList arrayListG2 = g(listC2);
                mmr0 mmr0VarD2 = d(retrieval, arrayListG2);
                return new ja31(arrayListG2, (String) mmr0VarD2.a, retrieval.v(), (String) mmr0VarD2.b, retrieval.t(), retrieval.n(), false, e(retrieval.s()), e(retrieval.w()), e(retrieval.u()));
            }
            return d9nVar;
        } catch (Exception unused) {
            return ia31.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable b(h290 h290Var, onm onmVar) {
        n931 n931Var;
        h290<RetrievalCard> h290Var2;
        int i;
        int i2;
        if (onmVar instanceof n931) {
            n931Var = (n931) onmVar;
            int i3 = n931Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n931Var.d = i3 - Integer.MIN_VALUE;
            } else {
                n931Var = new n931(this, onmVar);
            }
        } else {
            n931Var = new n931(this, onmVar);
        }
        Object obj = n931Var.b;
        int i4 = n931Var.d;
        int i5 = 1;
        if (i4 == 0) {
            hm5.M(obj);
            n931Var.a = h290Var;
            n931Var.d = 1;
            Object objC = this.a.c("2026_wrapped_seen_story_cards", n931Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
            obj = objC;
            h290Var2 = h290Var;
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h290Var2 = n931Var.a;
            hm5.M(obj);
        }
        w7x w7xVar = (Set) obj;
        if (w7xVar == null) {
            w7xVar = w7x.a;
        }
        ArrayList arrayList = new ArrayList(q7h.U(h290Var2, 10));
        for (RetrievalCard retrievalCard : h290Var2) {
            h290 h290VarO = retrievalCard.o();
            if (h290VarO.isEmpty()) {
                i2 = i5;
            } else {
                if (h290VarO.isEmpty()) {
                    i = 3;
                } else {
                    Iterator it = h290VarO.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = 3;
                        } else if (!w7xVar.contains((String) it.next())) {
                            if (!h290VarO.isEmpty()) {
                                Iterator it2 = h290VarO.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (w7xVar.contains((String) it2.next())) {
                                            i = 2;
                                        }
                                    }
                                }
                            }
                            i2 = i5;
                        }
                    }
                }
                i2 = i;
            }
            String strR = retrievalCard.r();
            Paragraph paragraphP = retrievalCard.q().p();
            Paragraph paragraphP2 = retrievalCard.t().p();
            p5c1 p5c1VarF = f(retrievalCard.q().n());
            p5c1 p5c1VarF2 = f(retrievalCard.t().n());
            ff ffVarE = e(retrievalCard.n());
            String strS = retrievalCard.s();
            CardViewedState cardViewedStateP = retrievalCard.p();
            arrayList.add(new z5c1(strR, paragraphP, paragraphP2, i2, p5c1VarF, p5c1VarF2, ffVarE, strS, new x5c1(cardViewedStateP.q(), cardViewedStateP.n(), Color.parseColor(cardViewedStateP.o()))));
            i5 = 1;
        }
        return arrayList;
    }
}
