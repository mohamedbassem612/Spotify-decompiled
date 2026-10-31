package p;

import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v6w implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ v6w(vr20 vr20Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0254  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code duplicated, block: B:81:0x018f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        u6w u6wVar;
        bxn bxnVar;
        mq70 mq70Var;
        List list;
        up70 up70Var;
        l5b0 l5b0Var;
        Object sed0Var;
        fhd0 fhd0Var;
        tcd0 tcd0Var;
        tcd0 tcd0Var2;
        fhd0 fhd0Var2;
        s0v0 s0v0Var;
        p1b1 p1b1Var;
        zqe1 zqe1Var;
        yqe1 yqe1Var;
        byte b = this.a;
        int i = 0;
        rih1 rih1Var = rih1.a;
        ArrayList<mmr0> arrayList = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof u6w) {
                    u6wVar = (u6w) lnmVar;
                    int i2 = u6wVar.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        u6wVar.b = i2 - Integer.MIN_VALUE;
                    } else {
                        u6wVar = new u6w(this, lnmVar);
                    }
                } else {
                    u6wVar = new u6w(this, lnmVar);
                }
                Object obj2 = u6wVar.a;
                int i3 = u6wVar.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                uv00 uv00Var = (uv00) obj;
                ArrayList arrayList2 = new ArrayList();
                for (mmr0 mmr0Var : arrayList) {
                    String str = (String) mmr0Var.a;
                    String str2 = (String) mmr0Var.b;
                    tv00 tv00VarA = uv00Var.a(jo70.class, str2);
                    jo70 jo70Var = tv00VarA.b;
                    if (jo70Var == null || tv00VarA.c.b != 2) {
                        bxnVar = null;
                    } else {
                        xkk1 xkk1Var = uv00Var.a(xkk1.class, str2).b;
                        String str3 = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (list = mq70Var.a) == null || (up70Var = (up70) o7h.s0(list)) == null) ? null : up70Var.a.a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        bxnVar = new bxn(str2, str, jo70Var.a, str3);
                    }
                    if (bxnVar != null) {
                        arrayList2.add(bxnVar);
                    }
                }
                n6w n6wVar = new n6w(arrayList2);
                u6wVar.b = 1;
                return vr20Var.emit(n6wVar, u6wVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof l5b0) {
                    l5b0Var = (l5b0) lnmVar;
                    int i4 = l5b0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        l5b0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        l5b0Var = new l5b0(this, lnmVar);
                    }
                } else {
                    l5b0Var = new l5b0(this, lnmVar);
                }
                Object obj3 = l5b0Var.a;
                int i5 = l5b0Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                List<i1r> list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList();
                for (i1r i1rVar : list2) {
                    i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                    if (i1rVar2 == null || (fhd0Var2 = (fhd0) i1rVar2.a) == null || (tcd0Var2 = fhd0Var2.a) == null || !tcd0Var2.c) {
                        tcd0Var2 = null;
                    }
                    if (tcd0Var2 != null) {
                        arrayList3.add(tcd0Var2);
                    }
                }
                int size = arrayList3.size();
                if (size == 0) {
                    sed0Var = qed0.a;
                } else if (size != 1) {
                    sed0Var = new red0(arrayList3.size());
                } else {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            i1r i1rVar3 = (k1r) it.next();
                            i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                            if (i1rVar4 == null || (fhd0Var = (fhd0) i1rVar4.a) == null || (tcd0Var = fhd0Var.a) == null || !tcd0Var.c) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    led0 led0Var = (led0) o7h.t0(i, arrayList);
                    String str4 = led0Var != null ? led0Var.b : null;
                    sed0Var = new sed0(str4 != null ? str4 : "");
                }
                l5b0Var.b = 1;
                return vr20Var.emit(sed0Var, l5b0Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof s0v0) {
                    s0v0Var = (s0v0) lnmVar;
                    int i6 = s0v0Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        s0v0Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        s0v0Var = new s0v0(this, lnmVar);
                    }
                } else {
                    s0v0Var = new s0v0(this, lnmVar);
                }
                Object obj4 = s0v0Var.a;
                int i7 = s0v0Var.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                Set set = (Set) obj;
                smc0 smc0VarN = k4p1.n();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    s1v0 s1v0Var = (s1v0) it2.next();
                    if (set.contains(s1v0Var.a)) {
                        smc0VarN.add(s1v0Var.a);
                    }
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                s0v0Var.b = 1;
                return vr20Var.emit(smc0VarK, s0v0Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof p1b1) {
                    p1b1Var = (p1b1) lnmVar;
                    int i8 = p1b1Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        p1b1Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        p1b1Var = new p1b1(this, lnmVar);
                    }
                } else {
                    p1b1Var = new p1b1(this, lnmVar);
                }
                Object obj5 = p1b1Var.a;
                int i9 = p1b1Var.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                uv00 uv00Var2 = (uv00) obj;
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj6 : arrayList) {
                    linkedHashMap.put(obj6, new r1b1(lnn1.l(uv00Var2.a(m1b1.class, (String) obj6).b)));
                }
                cbr cbrVar = new cbr(linkedHashMap);
                p1b1Var.b = 1;
                return vr20Var.emit(cbrVar, p1b1Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof zqe1) {
                    zqe1Var = (zqe1) lnmVar;
                    int i10 = zqe1Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        zqe1Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        zqe1Var = new zqe1(this, lnmVar);
                    }
                } else {
                    zqe1Var = new zqe1(this, lnmVar);
                }
                Object obj7 = zqe1Var.a;
                int i11 = zqe1Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                AdDetectionOuterClass.SubscribeCanonicalToUserTimestampResponse subscribeCanonicalToUserTimestampResponse = (AdDetectionOuterClass.SubscribeCanonicalToUserTimestampResponse) obj;
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                boolean z = false;
                while (true) {
                    if (it3.hasNext()) {
                        AdDetectionOuterClass.UserTimestamp userTimestamp = (AdDetectionOuterClass.UserTimestamp) subscribeCanonicalToUserTimestampResponse.n().get(new Integer(((Number) it3.next()).intValue()));
                        if (userTimestamp == null) {
                            yqe1Var = new yqe1(subscribeCanonicalToUserTimestampResponse.o(), null, false);
                        } else {
                            z = z || userTimestamp.o();
                            arrayList4.add(new vve1(userTimestamp.p()));
                        }
                    } else {
                        yqe1Var = new yqe1(subscribeCanonicalToUserTimestampResponse.o(), o7h.l1(arrayList4), z);
                    }
                }
                zqe1Var.b = 1;
                return vr20Var.emit(yqe1Var, zqe1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
