package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class axm extends tv30 implements vu30 {
    public static final axm a = new axm(2, cxm.class, "mapBlendCardState", "mapBlendCardState(Lcom/spotify/songdna/contributorsheet/ContributorSheetBlendCardElement$Props;Lcom/spotify/kodiak/dataloader/DataResult;)Lcom/spotify/songdna/contributorsheet/ContributorSheetBlendCardElement$State;", 1);

    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    public final Object invoke(Object obj, Object obj2) {
        String str;
        List list;
        Object next;
        int iIntValue;
        c380 c380VarA;
        xkk1 xkk1Var;
        mq70 mq70Var;
        pp70 pp70Var;
        xkk1 xkk1Var2;
        mq70 mq70Var2;
        up70 up70VarA;
        xkk1 xkk1Var3;
        mq70 mq70Var3;
        pp70 pp70Var2;
        xkk1 xkk1Var4;
        mq70 mq70Var4;
        up70 up70VarA2;
        uwm uwmVar = (uwm) obj;
        i1r i1rVar = (k1r) obj2;
        if (i1rVar instanceof j1r) {
            return wwm.a;
        }
        if (!(i1rVar instanceof h1r)) {
            u7h u7hVar = null;
            if (!(i1rVar instanceof i1r)) {
                eg.o();
                return null;
            }
            twm twmVar = (twm) i1rVar.a;
            jo70 jo70Var = twmVar.a;
            i1r i1rVar2 = twmVar.d;
            i1r i1rVar3 = twmVar.c;
            String str2 = jo70Var.a;
            if (str2 != null) {
                String str3 = !ihc1.y0(str2) ? str2 : null;
                if (str3 != null && (str = twmVar.b.a) != null) {
                    String str4 = !ihc1.y0(str) ? str : null;
                    if (str4 != null && (list = twmVar.e) != null) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!u890.j(((pvc0) next).c, uwmVar.a));
                        pvc0 pvc0Var = (pvc0) next;
                        if (pvc0Var != null) {
                            String str5 = (String) pvc0Var.f.get("record_count");
                            Integer numC0 = str5 != null ? nhc1.c0(str5) : null;
                            if (numC0 != null && (iIntValue = numC0.intValue()) > 0) {
                                List list2 = twmVar.f;
                                if (list2 != null) {
                                    List listD1 = o7h.d1(list2, 2);
                                    ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
                                    Iterator it2 = listD1.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((pvc0) it2.next()).c);
                                    }
                                    c380VarA = mqo1.A(arrayList);
                                    if (c380VarA == null) {
                                        c380VarA = fg91.b;
                                    }
                                } else {
                                    c380VarA = fg91.b;
                                }
                                c380 c380Var = c380VarA;
                                String str6 = uwmVar.a;
                                String str7 = uwmVar.b;
                                boolean z = i1rVar3 instanceof i1r;
                                i1r i1rVar4 = z ? i1rVar3 : null;
                                vp70 vp70Var = vp70.c;
                                String str8 = (i1rVar4 == null || (xkk1Var4 = (xkk1) i1rVar4.a) == null || (mq70Var4 = xkk1Var4.a) == null || (up70VarA2 = mq70Var4.a(vp70Var)) == null) ? null : up70VarA2.a.a;
                                boolean z2 = !(i1rVar3 instanceof j1r);
                                i1r i1rVar5 = z ? i1rVar3 : null;
                                u7h u7hVar2 = (i1rVar5 == null || (xkk1Var3 = (xkk1) i1rVar5.a) == null || (mq70Var3 = xkk1Var3.a) == null || (pp70Var2 = mq70Var3.b) == null) ? null : new u7h(pp70Var2.c.a.b.a());
                                boolean z3 = i1rVar2 instanceof i1r;
                                i1r i1rVar6 = z3 ? i1rVar2 : null;
                                String str9 = (i1rVar6 == null || (xkk1Var2 = (xkk1) i1rVar6.a) == null || (mq70Var2 = xkk1Var2.a) == null || (up70VarA = mq70Var2.a(vp70Var)) == null) ? null : up70VarA.a.a;
                                boolean z4 = !(i1rVar2 instanceof j1r);
                                i1r i1rVar7 = z3 ? i1rVar2 : null;
                                if (i1rVar7 != null && (xkk1Var = (xkk1) i1rVar7.a) != null && (mq70Var = xkk1Var.a) != null && (pp70Var = mq70Var.b) != null) {
                                    u7hVar = new u7h(pp70Var.c.a.b.a());
                                }
                                return new vwm(str6, str7, str4, str3, iIntValue, str8, z2, u7hVar2, str9, z4, u7hVar, c380Var);
                            }
                        }
                    }
                }
            }
        }
        return xwm.a;
    }
}
