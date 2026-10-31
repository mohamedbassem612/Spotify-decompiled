package p;

import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rdr {
    public final fwo a;
    public final fwo b;

    public rdr(fwo fwoVar, fwo fwoVar2) {
        this.a = fwoVar;
        this.b = fwoVar2;
    }

    public static void b(hi hiVar) {
        if (u890.j(((qi) hiVar).g, Boolean.TRUE)) {
            return;
        }
        Logger.k(l1d.m("Attempted to update last active accessory with inactive state: ", ((qi) hiVar).b), new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable a(List list, fuf0 fuf0Var, onm onmVar) {
        pdr pdrVar;
        List list2;
        ak akVar;
        boolean z;
        fuf0 fuf0Var2 = fuf0Var;
        if (onmVar instanceof pdr) {
            pdrVar = (pdr) onmVar;
            int i = pdrVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdrVar.e = i - Integer.MIN_VALUE;
            } else {
                pdrVar = new pdr(this, onmVar);
            }
        } else {
            pdrVar = new pdr(this, onmVar);
        }
        Object objB = pdrVar.c;
        int i2 = pdrVar.e;
        if (i2 == 0) {
            hm5.M(objB);
            if (Build.VERSION.SDK_INT >= 34) {
                pdrVar.a = list;
                pdrVar.b = fuf0Var2;
                pdrVar.e = 1;
                objB = fuf0Var2.b(pdrVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
                list2 = list;
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fuf0Var2 = pdrVar.b;
        list2 = pdrVar.a;
        hm5.M(objB);
        if (((Boolean) objB).booleanValue()) {
            List list3 = list2;
            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(qi.c((qi) ((hi) it.next()), null, null, null, null, yah0.m(false), null, null, 223));
            }
            return arrayList;
        }
        List<hi> list4 = list2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list4.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            akVar = ak.a;
            if (!zHasNext) {
                break;
            }
            Object next = it2.next();
            if (((qi) ((hi) next)).i.b(akVar)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
            for (hi hiVarC : list4) {
                Boolean bool = ((qi) hiVarC).g;
                qi qiVar = (qi) hiVarC;
                cn70 cn70Var = qiVar.i;
                List list5 = cn70Var.a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : list5) {
                    if (((cz81) obj).a == akVar) {
                        arrayList4.add(obj);
                    }
                }
                arrayList4.toString();
                if (!arrayList4.isEmpty()) {
                    List list6 = cn70Var.a;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator it3 = list6.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z = false;
                                break;
                            }
                            String str = ((cz81) it3.next()).b;
                            if (str != null && fuf0Var2.a(str, qiVar.b())) {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        z = false;
                        break;
                    }
                    qi qiVar2 = (qi) hiVarC;
                    if (u890.j(qiVar2.g, Boolean.valueOf(z))) {
                        hiVarC = qiVar2;
                    } else {
                        hiVarC = qi.c(qiVar2, null, null, null, null, Boolean.valueOf(z), null, null, 223);
                        if (z) {
                            b(hiVarC);
                        }
                    }
                }
                arrayList3.add(hiVarC);
            }
            return arrayList3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x027d  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02af  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02df A[LOOP:5: B:128:0x02d9->B:130:0x02df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:134:0x0302  */
    /* JADX WARN: Code duplicated, block: B:137:0x0318 A[LOOP:6: B:135:0x0312->B:137:0x0318, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0335  */
    /* JADX WARN: Code duplicated, block: B:143:0x034a  */
    /* JADX WARN: Code duplicated, block: B:149:0x035a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0384  */
    /* JADX WARN: Code duplicated, block: B:154:0x0390  */
    /* JADX WARN: Code duplicated, block: B:155:0x0392  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:159:0x03c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:160:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:166:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[LOOP:4: B:121:0x02a9->B:186:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0356 A[EDGE_INSN: B:191:0x0356->B:147:0x0356 BREAK  A[LOOP:7: B:139:0x032f->B:192:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:93:0x0231  */
    /* JADX WARN: Code duplicated, block: B:99:0x0255  */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x03a7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [p.rdr] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Object c(List list, onm onmVar) {
        qdr qdrVar;
        ak akVar;
        ?? arrayList;
        d9n d9nVarA;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it;
        Set setP1;
        List<hi> list2;
        Iterator it2;
        Object next;
        hi hiVar;
        qi qiVarC;
        qi qiVarC2;
        hi hiVar2;
        Set set;
        Iterator it3;
        Iterator it4;
        int i;
        Object obj;
        List list3 = list;
        if (onmVar instanceof qdr) {
            qdrVar = (qdr) onmVar;
            int i2 = qdrVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qdrVar.d = i2 - Integer.MIN_VALUE;
            } else {
                qdrVar = new qdr(this, onmVar);
            }
        } else {
            qdrVar = new qdr(this, onmVar);
        }
        Object obj2 = qdrVar.b;
        int i3 = qdrVar.d;
        ArrayList arrayList6 = null;
        Object obj3 = null;
        arrayList6 = null;
        if (i3 == 0) {
            hm5.M(obj2);
            list3.size();
            list3.toString();
            List list4 = list3;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = list4.iterator();
            while (true) {
                boolean zHasNext = it5.hasNext();
                akVar = ak.e;
                if (!zHasNext) {
                    break;
                }
                Object next2 = it5.next();
                if (((qi) ((hi) next2)).i.b(akVar)) {
                    arrayList7.add(next2);
                }
            }
            if (arrayList7.isEmpty()) {
                arrayList7 = null;
            }
            if (arrayList7 != null) {
                if (arrayList7.isEmpty()) {
                    hhg1.n("Car accessories list cannot be empty");
                    return null;
                }
                if (arrayList7.size() > 1) {
                    n57.e("Multiple car accessories found: " + arrayList7);
                }
                smc0 smc0VarN = k4p1.n();
                qi qiVarC3 = qi.c((qi) o7h.q0(arrayList7), null, null, null, null, Boolean.TRUE, null, null, 223);
                b(qiVarC3);
                smc0VarN.add(qiVarC3);
                ArrayList arrayList8 = new ArrayList();
                for (Object obj4 : list4) {
                    if (!((qi) ((hi) obj4)).i.b(akVar)) {
                        arrayList8.add(obj4);
                    }
                }
                ArrayList arrayList9 = new ArrayList(q7h.U(arrayList8, 10));
                Iterator it6 = arrayList8.iterator();
                while (it6.hasNext()) {
                    arrayList9.add(qi.c((qi) ((hi) it6.next()), null, null, null, null, Boolean.FALSE, null, null, 223));
                }
                smc0VarN.addAll(arrayList9);
                smc0 smc0VarK = k4p1.k(smc0VarN);
                Objects.toString(smc0VarK);
                return smc0VarK;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                arrayList = 0;
            } else {
                ArrayList arrayList10 = new ArrayList();
                for (Object obj5 : list4) {
                    if (((qi) ((hi) obj5)).i.b(ak.b)) {
                        arrayList10.add(obj5);
                    }
                }
                arrayList10.size();
                arrayList10.toString();
                ArrayList arrayList11 = new ArrayList();
                for (Object obj6 : arrayList10) {
                    if (u890.j(((qi) ((hi) obj6)).g, Boolean.TRUE)) {
                        arrayList11.add(obj6);
                    }
                }
                int size = arrayList11.size();
                if (size != 0) {
                    if (size != 1) {
                        arrayList11.size();
                    } else {
                        hi hiVar3 = (hi) o7h.q0(arrayList11);
                        if (list3.size() == 1) {
                            Objects.toString(hiVar3);
                            b(hiVar3);
                            arrayList = list3;
                        } else {
                            list3.size();
                            Objects.toString(hiVar3);
                        }
                    }
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList(q7h.U(list4, 10));
                    Iterator it7 = list4.iterator();
                    while (it7.hasNext()) {
                        arrayList.add(qi.c((qi) ((hi) it7.next()), null, null, null, null, Boolean.FALSE, null, null, 223));
                    }
                }
            }
            if (arrayList != 0) {
                return arrayList;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                fuf0 fuf0Var = (fuf0) this.a.get();
                qdrVar.a = list3;
                qdrVar.d = 1;
                d9nVarA = a(list3, fuf0Var, qdrVar);
                d9n d9nVar = d9n.a;
                if (d9nVarA == d9nVar) {
                    obj = d9nVarA;
                    return d9nVar;
                }
            }
            ArrayList arrayListD = ((p7s) this.b.get()).d();
            arrayList2 = new ArrayList();
            for (Object obj7 : arrayListD) {
                if (((pr31) obj7).n) {
                    arrayList2.add(obj7);
                }
            }
            arrayList2.size();
            arrayList2.toString();
            arrayList3 = new ArrayList();
            for (Object obj8 : arrayList2) {
                if (((Boolean) ((pr31) obj8).p.getValue()).booleanValue()) {
                    arrayList3.add(obj8);
                }
            }
            arrayList4 = new ArrayList();
            for (Object obj9 : arrayList3) {
                i = ((pr31) obj9).e;
                if (i != 3 || i == 22 || i == 13 || i == 14 || i == 20) {
                    arrayList4.add(obj9);
                }
            }
            if (arrayList3.isEmpty()) {
                it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        if (((Boolean) ((pr31) it3.next()).o.getValue()).booleanValue()) {
                            if (arrayList4.isEmpty()) {
                                List list5 = list3;
                                arrayList6 = new ArrayList(q7h.U(list5, 10));
                                it4 = list5.iterator();
                                while (it4.hasNext()) {
                                    arrayList6.add(qi.c((qi) ((hi) it4.next()), null, null, null, null, Boolean.FALSE, null, null, 223));
                                }
                            }
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        arrayList4.toString();
                        arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                        it = arrayList4.iterator();
                        while (it.hasNext()) {
                            arrayList5.add(((pr31) it.next()).b);
                        }
                        setP1 = o7h.p1(arrayList5);
                        list2 = list3;
                        it2 = list2.iterator();
                        do {
                            if (it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            hiVar2 = (hi) next;
                            set = setP1;
                            if (!o7h.i0(set, ((qi) hiVar2).b)) {
                                break;
                                break;
                            }
                        } while (!o7h.i0(set, ((qi) hiVar2).c));
                        hiVar = (hi) next;
                        if (hiVar != null) {
                            hiVar.toString();
                            qiVarC = qi.c((qi) hiVar, null, null, null, null, Boolean.TRUE, null, null, 223);
                            b(qiVarC);
                            arrayList6 = new ArrayList(q7h.U(list2, 10));
                            for (hi hiVar4 : list2) {
                                if (u890.j(hiVar4, hiVar)) {
                                    qiVarC2 = qiVarC;
                                } else {
                                    qiVarC2 = qi.c((qi) hiVar4, null, null, null, null, Boolean.FALSE, null, null, 223);
                                }
                                arrayList6.add(qiVarC2);
                            }
                        } else {
                            Logger.d("AndroidX MediaRouter selected routes not in accessories list. Routes: " + arrayList4 + ", Accessories: " + list3, new Object[0]);
                        }
                    }
                }
            } else if (!arrayList4.isEmpty()) {
                arrayList4.toString();
                arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((pr31) it.next()).b);
                }
                setP1 = o7h.p1(arrayList5);
                list2 = list3;
                it2 = list2.iterator();
                do {
                    if (it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    hiVar2 = (hi) next;
                    set = setP1;
                    if (!o7h.i0(set, ((qi) hiVar2).b)) {
                        break;
                    }
                } while (!o7h.i0(set, ((qi) hiVar2).c));
                hiVar = (hi) next;
                if (hiVar != null) {
                    hiVar.toString();
                    qiVarC = qi.c((qi) hiVar, null, null, null, null, Boolean.TRUE, null, null, 223);
                    b(qiVarC);
                    arrayList6 = new ArrayList(q7h.U(list2, 10));
                    while (r2.hasNext()) {
                        if (u890.j(hiVar4, hiVar)) {
                            qiVarC2 = qiVarC;
                        } else {
                            qiVarC2 = qi.c((qi) hiVar4, null, null, null, null, Boolean.FALSE, null, null, 223);
                        }
                        arrayList6.add(qiVarC2);
                    }
                } else {
                    Logger.d("AndroidX MediaRouter selected routes not in accessories list. Routes: " + arrayList4 + ", Accessories: " + list3, new Object[0]);
                }
            }
            if (arrayList6 != null) {
                return arrayList6;
            }
            Objects.toString(list3);
            return list3;
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list3 = qdrVar.a;
        hm5.M(obj2);
        obj = obj2;
        obj = d9nVarA;
        List list6 = (List) obj;
        if (list6 != null) {
            for (Object obj10 : list6) {
                if (u890.j(((qi) ((hi) obj10)).g, yah0.m(true))) {
                    obj3 = obj10;
                    break;
                }
            }
            hi hiVar5 = (hi) obj3;
            if (hiVar5 != null) {
                b(hiVar5);
            }
            return list6;
        }
        ArrayList arrayListD2 = ((p7s) this.b.get()).d();
        arrayList2 = new ArrayList();
        while (r0.hasNext()) {
            if (((pr31) obj7).n) {
                arrayList2.add(obj7);
            }
        }
        arrayList2.size();
        arrayList2.toString();
        arrayList3 = new ArrayList();
        while (r2.hasNext()) {
            if (((Boolean) ((pr31) obj8).p.getValue()).booleanValue()) {
                arrayList3.add(obj8);
            }
        }
        arrayList4 = new ArrayList();
        while (r3.hasNext()) {
            i = ((pr31) obj9).e;
            if (i != 3) {
            }
            arrayList4.add(obj9);
        }
        if (arrayList3.isEmpty()) {
            it3 = arrayList3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    if (((Boolean) ((pr31) it3.next()).o.getValue()).booleanValue()) {
                        if (arrayList4.isEmpty()) {
                            List list7 = list3;
                            arrayList6 = new ArrayList(q7h.U(list7, 10));
                            it4 = list7.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(qi.c((qi) ((hi) it4.next()), null, null, null, null, Boolean.FALSE, null, null, 223));
                            }
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList4.toString();
                    arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                    it = arrayList4.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(((pr31) it.next()).b);
                    }
                    setP1 = o7h.p1(arrayList5);
                    list2 = list3;
                    it2 = list2.iterator();
                    do {
                        if (it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        hiVar2 = (hi) next;
                        set = setP1;
                        if (!o7h.i0(set, ((qi) hiVar2).b)) {
                            break;
                            break;
                        }
                    } while (!o7h.i0(set, ((qi) hiVar2).c));
                    hiVar = (hi) next;
                    if (hiVar != null) {
                        hiVar.toString();
                        qiVarC = qi.c((qi) hiVar, null, null, null, null, Boolean.TRUE, null, null, 223);
                        b(qiVarC);
                        arrayList6 = new ArrayList(q7h.U(list2, 10));
                        while (r2.hasNext()) {
                            if (u890.j(hiVar4, hiVar)) {
                                qiVarC2 = qiVarC;
                            } else {
                                qiVarC2 = qi.c((qi) hiVar4, null, null, null, null, Boolean.FALSE, null, null, 223);
                            }
                            arrayList6.add(qiVarC2);
                        }
                    } else {
                        Logger.d("AndroidX MediaRouter selected routes not in accessories list. Routes: " + arrayList4 + ", Accessories: " + list3, new Object[0]);
                    }
                }
            }
        } else if (!arrayList4.isEmpty()) {
            arrayList4.toString();
            arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
            it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList5.add(((pr31) it.next()).b);
            }
            setP1 = o7h.p1(arrayList5);
            list2 = list3;
            it2 = list2.iterator();
            do {
                if (it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                hiVar2 = (hi) next;
                set = setP1;
                if (!o7h.i0(set, ((qi) hiVar2).b)) {
                    break;
                    break;
                }
            } while (!o7h.i0(set, ((qi) hiVar2).c));
            hiVar = (hi) next;
            if (hiVar != null) {
                hiVar.toString();
                qiVarC = qi.c((qi) hiVar, null, null, null, null, Boolean.TRUE, null, null, 223);
                b(qiVarC);
                arrayList6 = new ArrayList(q7h.U(list2, 10));
                while (r2.hasNext()) {
                    if (u890.j(hiVar4, hiVar)) {
                        qiVarC2 = qiVarC;
                    } else {
                        qiVarC2 = qi.c((qi) hiVar4, null, null, null, null, Boolean.FALSE, null, null, 223);
                    }
                    arrayList6.add(qiVarC2);
                }
            } else {
                Logger.d("AndroidX MediaRouter selected routes not in accessories list. Routes: " + arrayList4 + ", Accessories: " + list3, new Object[0]);
            }
        }
        if (arrayList6 != null) {
            return arrayList6;
        }
        Objects.toString(list3);
        return list3;
    }
}
