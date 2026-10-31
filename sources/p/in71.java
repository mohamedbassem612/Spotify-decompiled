package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class in71 {
    public final xrc0 a;
    public final iyc0 b;
    public final eyh0 c;
    public final av1 d;
    public final llm e;
    public final k261 f;
    public final dt71 g;
    public final LinkedHashMap h;
    public boolean i;
    public final ve01 j;

    public in71(xrc0 xrc0Var, iyc0 iyc0Var, eyh0 eyh0Var, av1 av1Var) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = eyh0Var;
        this.d = av1Var;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        this.e = smo1.e(flo1.l(j0d1VarB, pyf0.a).y(new v62(olj0.T0, (byte) 19)));
        this.f = l261.a(8);
        dt71 dt71VarE = mgo1.e(0, 10, 0, 5);
        this.g = dt71VarE;
        this.h = new LinkedHashMap();
        this.j = d5p1.g(dt71VarE);
    }

    public static ArrayList h(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((fji0) it.next()).a.b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        zm71 zm71Var;
        if (onmVar instanceof zm71) {
            zm71Var = (zm71) onmVar;
            int i = zm71Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zm71Var.d = i - Integer.MIN_VALUE;
            } else {
                zm71Var = new zm71(this, onmVar);
            }
        } else {
            zm71Var = new zm71(this, onmVar);
        }
        Object objO = zm71Var.b;
        int i2 = zm71Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                lm61 lm61Var = new lm61(this, str, (lnm) null, (byte) 14);
                zm71Var.a = str;
                zm71Var.d = 1;
                objO = rc2.O(5000L, lm61Var, zm71Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = zm71Var.a;
                hm5.M(objO);
            }
            return (py21) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to get the members of %s", new Object[]{str});
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            return new ly21(new iy21(message));
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(Set set, Set set2, onm onmVar) {
        an71 an71Var;
        in71 in71Var;
        Object obj;
        Set set3;
        Set set4;
        Set set5;
        Set set6;
        boolean zIsEmpty;
        eyh0 eyh0Var;
        if (onmVar instanceof an71) {
            an71Var = (an71) onmVar;
            int i = an71Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                an71Var.f = i - Integer.MIN_VALUE;
            } else {
                an71Var = new an71(this, onmVar);
            }
        } else {
            an71Var = new an71(this, onmVar);
        }
        Object obj2 = an71Var.d;
        int i2 = an71Var.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            an71Var.a = set;
            an71Var.b = set2;
            an71Var.f = 1;
            in71Var = this;
            Object objS = smo1.s(new p651(set2, in71Var, wls0.d, (lnm) null, (byte) 13), an71Var);
            if (objS != d9nVar) {
                obj = objS;
                set3 = set2;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            Set set7 = an71Var.b;
            Set set8 = an71Var.a;
            hm5.M(obj2);
            set3 = set7;
            set = set8;
            obj = obj2;
            in71Var = this;
        } else {
            if (i2 == 2) {
                Set set9 = an71Var.c;
                Set set10 = an71Var.b;
                Set set11 = an71Var.a;
                hm5.M(obj2);
                return rih1Var;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set6 = an71Var.c;
            Set set12 = an71Var.b;
            set5 = an71Var.a;
            hm5.M(obj2);
            in71Var = this;
        }
        set4 = set6;
        set = set5;
        zIsEmpty = set4.isEmpty();
        eyh0Var = in71Var.c;
        if (zIsEmpty) {
            set.size();
            ((Context) eyh0Var.b).getResources();
            eyh0.F(eyh0Var, "");
            return rih1Var;
        }
        m551 m551Var = new m551(this, set, set4, (byte) 10);
        set.size();
        fh61 fh61Var = new fh61(this, m551Var, (byte) 14);
        ((Context) eyh0Var.b).getResources();
        eyh0Var.G(fh61Var);
        return rih1Var;
        set4 = (Set) obj;
        Set setV0 = dm61.v0(set3, set4);
        Iterator it = setV0.iterator();
        while (it.hasNext()) {
            in71Var.h.put((ajk1) it.next(), ym71.a);
        }
        if (!in71Var.i) {
            if (!setV0.isEmpty()) {
                at1 at1Var = new at1(setV0);
                an71Var.a = set;
                an71Var.b = null;
                an71Var.c = set4;
                an71Var.f = 3;
                if (in71Var.g.emit(at1Var, an71Var) != d9nVar) {
                    set5 = set;
                    set6 = set4;
                    set4 = set6;
                    set = set5;
                }
            }
            zIsEmpty = set4.isEmpty();
            eyh0Var = in71Var.c;
            if (zIsEmpty) {
                set.size();
                ((Context) eyh0Var.b).getResources();
                eyh0.F(eyh0Var, "");
                return rih1Var;
            }
            m551 m551Var2 = new m551(this, set, set4, (byte) 10);
            set.size();
            fh61 fh61Var2 = new fh61(this, m551Var2, (byte) 14);
            ((Context) eyh0Var.b).getResources();
            eyh0Var.G(fh61Var2);
            return rih1Var;
        }
        an71Var.a = null;
        an71Var.b = null;
        an71Var.c = null;
        an71Var.f = 2;
        if (e(an71Var) != d9nVar) {
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        cn71 cn71Var;
        if (onmVar instanceof cn71) {
            cn71Var = (cn71) onmVar;
            int i = cn71Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cn71Var.d = i - Integer.MIN_VALUE;
            } else {
                cn71Var = new cn71(this, onmVar);
            }
        } else {
            cn71Var = new cn71(this, onmVar);
        }
        Object objA = cn71Var.b;
        int i2 = cn71Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            cn71Var.a = str;
            cn71Var.d = 1;
            objA = a(str, cn71Var);
            Object obj = d9n.a;
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cn71Var.a;
            hm5.M(objA);
        }
        ly21 ly21Var = (py21) objA;
        if (ly21Var == null) {
            Logger.d("Timed out getting the members of %s", new Object[]{str});
            return null;
        }
        if (ly21Var instanceof ly21) {
            Logger.d("Failed to get the members of %s: %s", new Object[]{str, ly21Var.a});
            return null;
        }
        if (ly21Var instanceof oy21) {
            return ((iqi0) ((oy21) ly21Var).a).f;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(String str, onm onmVar) {
        dn71 dn71Var;
        if (onmVar instanceof dn71) {
            dn71Var = (dn71) onmVar;
            int i = dn71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dn71Var.c = i - Integer.MIN_VALUE;
            } else {
                dn71Var = new dn71(this, onmVar);
            }
        } else {
            dn71Var = new dn71(this, onmVar);
        }
        Object objC = dn71Var.a;
        int i2 = dn71Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            dn71Var.c = 1;
            objC = c(str, dn71Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        List list = (List) objC;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (kji0.a.contains(((fji0) obj).f)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListH = h(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListH) {
            if (!u890.j((String) obj2, this.d.a)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        en71 en71Var;
        in71 in71Var;
        Set<ajk1> set;
        if (onmVar instanceof en71) {
            en71Var = (en71) onmVar;
            int i = en71Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                en71Var.d = i - Integer.MIN_VALUE;
            } else {
                en71Var = new en71(this, onmVar);
            }
        } else {
            en71Var = new en71(this, onmVar);
        }
        Object objS = en71Var.b;
        int i2 = en71Var.d;
        rih1 rih1Var = rih1.a;
        LinkedHashMap linkedHashMap = this.h;
        if (i2 == 0) {
            hm5.M(objS);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((ym71) entry.getValue()) == ym71.a) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap2.keySet();
            if (!setKeySet.isEmpty()) {
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put((ajk1) it.next(), ym71.b);
                }
                en71Var.a = setKeySet;
                en71Var.d = 1;
                in71Var = this;
                objS = smo1.s(new p651(setKeySet, in71Var, (Object) null, (lnm) null, (byte) 13), en71Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
                set = setKeySet;
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        set = en71Var.a;
        hm5.M(objS);
        in71Var = this;
        Set set2 = (Set) objS;
        for (ajk1 ajk1Var : set) {
            if (set2.contains(ajk1Var)) {
                linkedHashMap.put(ajk1Var, ym71.c);
            } else {
                linkedHashMap.remove(ajk1Var);
            }
        }
        if (!set2.isEmpty()) {
            Set set3 = set2;
            ArrayList arrayList = new ArrayList(q7h.U(set3, 10));
            Iterator it2 = set3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ajk1) it2.next()).a);
            }
            o7h.p1(arrayList).size();
            qv61 qv61Var = new qv61(in71Var, (byte) 14);
            eyh0 eyh0Var = in71Var.c;
            ((Context) eyh0Var.b).getResources();
            eyh0Var.G(qv61Var);
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(ajk1 ajk1Var, wls0 wls0Var, onm onmVar) {
        gn71 gn71Var;
        wls0 wls0Var2;
        if (onmVar instanceof gn71) {
            gn71Var = (gn71) onmVar;
            int i = gn71Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gn71Var.e = i - Integer.MIN_VALUE;
            } else {
                gn71Var = new gn71(this, onmVar);
            }
        } else {
            gn71Var = new gn71(this, onmVar);
        }
        gn71 gn71Var2 = gn71Var;
        Object objQ = gn71Var2.c;
        int i2 = gn71Var2.e;
        if (i2 == 0) {
            hm5.M(objQ);
            String str = ajk1Var.a;
            String str2 = ajk1Var.b;
            gn71Var2.a = ajk1Var;
            gn71Var2.b = wls0Var;
            gn71Var2.e = 1;
            objQ = this.b.q(str, str2, wls0Var, 10000, gn71Var2);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
            wls0Var2 = wls0Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wls0Var2 = gn71Var2.b;
            ajk1Var = gn71Var2.a;
            hm5.M(objQ);
        }
        ly21 ly21Var = (py21) objQ;
        c861 c861Var = new c861(wls0Var2, ajk1Var, (byte) 13);
        ly21Var.getClass();
        if (ly21Var instanceof ly21) {
            c861Var.invoke(ly21Var.a);
            return Boolean.FALSE;
        }
        if (ly21Var instanceof oy21) {
            return Boolean.TRUE;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r11 == r7) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r9, java.util.Set r10, p.onm r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.in71.g(java.lang.String, java.util.Set, p.onm):java.lang.Object");
    }
}
