package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mbs extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ String c;
    public final /* synthetic */ pbq d;
    public final /* synthetic */ List e;
    public final /* synthetic */ tv80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbs(String str, pbq pbqVar, List list, tv80 tv80Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = str;
        this.d = pbqVar;
        this.e = list;
        this.f = tv80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new mbs(this.c, this.d, this.e, this.f, lnmVar, (byte) 0);
            default:
                return new mbs(this.c, this.d, this.e, this.f, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0302  */
    /* JADX WARN: Code duplicated, block: B:179:0x0327 A[LOOP:3: B:177:0x0321->B:179:0x0327, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0170  */
    public final Object invokeSuspend(Object obj) {
        Object objP;
        Object objN;
        Object objM;
        Object objN2;
        Object objN3;
        aum0 aum0Var;
        LinkedHashMap linkedHashMap;
        Iterator it;
        Object objO0;
        Object objN0;
        Object objM0;
        Object objN1;
        Object objN4;
        aum0 aum0Var2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        pbq pbqVar = this.d;
        List list = this.e;
        String str = this.c;
        tv80 tv80Var = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                        objN3 = obj;
                        return (bum0) objN3;
                    }
                    if (b2 == 2) {
                        hm5.M(obj);
                        objN2 = obj;
                        return (bum0) objN2;
                    }
                    if (b2 == 3) {
                        hm5.M(obj);
                        objM = obj;
                        return (bum0) objM;
                    }
                    if (b2 != 4) {
                        if (b2 != 5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objP = obj;
                        return (bum0) objP;
                    }
                    hm5.M(obj);
                    objN = obj;
                    aum0Var = (bum0) objN;
                    if (aum0Var instanceof aum0) {
                        return aum0Var;
                    }
                    aum0 aum0Var3 = aum0Var;
                    List listSingletonList = Collections.singletonList(str);
                    Map map = aum0Var3.d;
                    linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(str, ((Map.Entry) it.next()).getValue());
                    }
                    return aum0.a(aum0Var3, listSingletonList, (List) null, linkedHashMap, 6);
                }
                hm5.M(obj);
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(str);
                blc0 blc0Var = s4b1VarX.c;
                if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) {
                    this.b = (byte) 1;
                    objN3 = pbqVar.n("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", list, this, tv80Var);
                    if (objN3 == d9nVar) {
                        return d9nVar;
                    }
                    return (bum0) objN3;
                }
                if (bo1.a(s4b1VarX)) {
                    this.b = (byte) 2;
                    objN2 = pbqVar.n(str, list, this, tv80Var);
                    if (objN2 == d9nVar) {
                        return d9nVar;
                    }
                    return (bum0) objN2;
                }
                if (bo1.d(blc0Var)) {
                    String str2 = bo1.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        Set set2 = s4b1.f;
                        if (uic.x((String) obj2).c == blc0.fh) {
                            arrayList.add(obj2);
                        }
                    }
                    this.b = (byte) 3;
                    objM = pbqVar.m(str2, arrayList, tv80Var, this);
                    if (objM == d9nVar) {
                        return d9nVar;
                    }
                    return (bum0) objM;
                }
                if (blc0Var != blc0.C4 && blc0Var != blc0.D4) {
                    return new ytm0(new IllegalArgumentException("Invalid link type, " + blc0Var + ", " + str));
                }
                if (!list.isEmpty() && ((vlo) pbqVar.c).b(blc0.ti)) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                String str3 = (String) it2.next();
                                Set set3 = s4b1.f;
                                if (uic.x(str3).c == blc0.ti) {
                                }
                            }
                        }
                    }
                    this.b = (byte) 4;
                    objN = pbqVar.n("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", list, this, tv80Var);
                    if (objN == d9nVar) {
                        return d9nVar;
                    }
                    aum0Var = (bum0) objN;
                    if (aum0Var instanceof aum0) {
                        return aum0Var;
                    }
                    aum0 aum0Var4 = aum0Var;
                    List listSingletonList2 = Collections.singletonList(str);
                    Map map2 = aum0Var4.d;
                    linkedHashMap = new LinkedHashMap(zno1.s(map2.size()));
                    it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(str, ((Map.Entry) it.next()).getValue());
                    }
                    return aum0.a(aum0Var4, listSingletonList2, (List) null, linkedHashMap, 6);
                }
                String str4 = bo1.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    Set set4 = s4b1.f;
                    if (uic.x((String) obj3).c == blc0.Pg) {
                        arrayList2.add(obj3);
                    }
                }
                this.b = (byte) 5;
                objP = pbqVar.p(str4, arrayList2, tv80Var, this);
                if (objP == d9nVar) {
                    return d9nVar;
                }
                return (bum0) objP;
            default:
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1) {
                        hm5.M(obj);
                        objN4 = obj;
                        return (bum0) objN4;
                    }
                    if (b3 == 2) {
                        hm5.M(obj);
                        objN1 = obj;
                        return (bum0) objN1;
                    }
                    if (b3 == 3) {
                        hm5.M(obj);
                        objM0 = obj;
                        return (bum0) objM0;
                    }
                    if (b3 != 4) {
                        if (b3 != 5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objO0 = obj;
                        return (bum0) objO0;
                    }
                    hm5.M(obj);
                    objN0 = obj;
                    aum0Var2 = (bum0) objN0;
                    if (aum0Var2 instanceof aum0) {
                        return aum0.a(aum0Var2, (List) null, Collections.singletonList(str), (LinkedHashMap) null, 13);
                    }
                    return aum0Var2;
                }
                hm5.M(obj);
                Set set5 = s4b1.f;
                s4b1 s4b1VarX2 = uic.x(str);
                blc0 blc0Var2 = s4b1VarX2.c;
                if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) {
                    this.b = (byte) 1;
                    objN4 = pbqVar.n0("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", list, this, tv80Var);
                    if (objN4 == d9nVar) {
                        return d9nVar;
                    }
                    return (bum0) objN4;
                }
                if (bo1.a(s4b1VarX2)) {
                    this.b = (byte) 2;
                    objN1 = pbqVar.n0(str, list, this, tv80Var);
                    if (objN1 == d9nVar) {
                        return d9nVar;
                    }
                    return (bum0) objN1;
                }
                if (bo1.d(blc0Var2)) {
                    String str5 = bo1.b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list) {
                        Set set6 = s4b1.f;
                        if (uic.x((String) obj4).c == blc0.fh) {
                            arrayList3.add(obj4);
                        }
                    }
                    this.b = (byte) 3;
                    objM0 = pbqVar.m0(str5, arrayList3, tv80Var, this);
                    if (objM0 == d9nVar) {
                        return d9nVar;
                    }
                    return (bum0) objM0;
                }
                if (blc0Var2 != blc0.C4 && blc0Var2 != blc0.D4) {
                    return new ytm0(new IllegalArgumentException("Invalid link type, " + blc0Var2 + ", " + str));
                }
                if (!list.isEmpty() && ((vlo) pbqVar.c).b(blc0.ti)) {
                    List list3 = list;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                String str6 = (String) it3.next();
                                Set set7 = s4b1.f;
                                if (uic.x(str6).c == blc0.ti) {
                                }
                            }
                        }
                    }
                    this.b = (byte) 4;
                    objN0 = pbqVar.n0("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", list, this, tv80Var);
                    if (objN0 == d9nVar) {
                        return d9nVar;
                    }
                    aum0Var2 = (bum0) objN0;
                    if (aum0Var2 instanceof aum0) {
                        return aum0.a(aum0Var2, (List) null, Collections.singletonList(str), (LinkedHashMap) null, 13);
                    }
                    return aum0Var2;
                }
                String str7 = bo1.a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list) {
                    Set set8 = s4b1.f;
                    if (uic.x((String) obj5).c == blc0.Pg) {
                        arrayList4.add(obj5);
                    }
                }
                this.b = (byte) 5;
                objO0 = pbqVar.o0(str7, arrayList4, tv80Var, this);
                if (objO0 == d9nVar) {
                    return d9nVar;
                }
                return (bum0) objO0;
        }
    }
}
