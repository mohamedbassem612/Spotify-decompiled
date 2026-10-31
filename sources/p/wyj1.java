package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class wyj1 implements Update {
    public static final wyj1 a = new wyj1();

    /* JADX WARN: Code duplicated, block: B:119:0x0205  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0166  */
    public final Next a(Object obj, Object obj2) {
        boolean z;
        czj1 czj1Var = (czj1) obj;
        syj1 syj1Var = (syj1) obj2;
        c380 c380Var = czj1Var.b;
        bzj1 bzj1Var = czj1Var.c;
        int i = czj1Var.d;
        boolean z2 = syj1Var instanceof qyj1;
        bzj1 azj1Var = yyj1.a;
        bzj1 bzj1Var2 = zyj1.a;
        if (z2) {
            qyj1 qyj1Var = (qyj1) syj1Var;
            c380 c380Var2 = qyj1Var.a;
            boolean z3 = qyj1Var.b;
            if (c380Var2.isEmpty()) {
                z = i == 1;
                return Next.i(czj1.a(czj1Var, null, null, z ? 5 : 4, 23), z ? Collections.singleton(new cyj1("")) : w7x.a);
            }
            if (bzj1Var instanceof zyj1) {
                if (!c380Var.isEmpty() || czj1Var.e != 0 || !z3) {
                    azj1Var = bzj1Var2;
                }
            } else if (!(bzj1Var instanceof yyj1)) {
                if (!(bzj1Var instanceof azj1)) {
                    eg.o();
                    return null;
                }
                ArrayList arrayList = new ArrayList(q7h.U(c380Var2, 10));
                Iterator it = c380Var2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rzj1) it.next()).a);
                }
                Set setP1 = o7h.p1(arrayList);
                u380 u380Var = ((azj1) bzj1Var).a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : u380Var) {
                    if (setP1.contains((String) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                u380 u380VarC = mqo1.C(arrayList2);
                if (u380VarC.isEmpty()) {
                    azj1Var = bzj1Var2;
                } else {
                    azj1Var = new azj1(u380VarC);
                }
            }
            return Next.h(czj1.a(czj1Var, c380Var2, azj1Var, 0, 25));
        }
        if (syj1Var.equals(pyj1.a)) {
            Set setW0 = dm61.w0(new eyj1[]{new dyj1()});
            z = i == 1;
            if (z) {
                setW0.add(new cyj1(""));
            }
            return Next.i(czj1.a(czj1Var, null, null, z ? 5 : 4, 23), setW0);
        }
        if (!(syj1Var instanceof nyj1)) {
            if (!(syj1Var instanceof ryj1)) {
                if (syj1Var instanceof oyj1) {
                    return i == 1 ? Next.h(czj1.a(czj1Var, null, null, 2, 23)) : Next.j();
                }
                if (syj1Var instanceof lyj1) {
                    if (l1d.c(i, 3) >= 0) {
                        return Next.j();
                    }
                    Set set = czj1Var.g;
                    return set.isEmpty() ? Next.j() : Next.i(czj1.a(czj1Var, null, null, 3, 23), Collections.singleton(new byj1(czj1Var.a, set)));
                }
                if (syj1Var instanceof myj1) {
                    return l1d.c(i, 4) < 0 ? Next.h(czj1.a(czj1Var, null, null, 4, 23)) : Next.j();
                }
                if (syj1Var instanceof kyj1) {
                    return i == 5 ? Next.j() : Next.i(czj1.a(czj1Var, null, null, 5, 23), Collections.singleton(new cyj1(((kyj1) syj1Var).a)));
                }
                eg.o();
                return null;
            }
            if (bzj1Var instanceof yyj1) {
                azj1Var = bzj1Var2;
            } else if (bzj1Var instanceof azj1) {
                if (!c380Var.isEmpty()) {
                    if (c380Var.isEmpty()) {
                        azj1Var = bzj1Var2;
                    } else {
                        Iterator it2 = c380Var.iterator();
                        while (it2.hasNext()) {
                            if (!x4p1.l(bzj1Var, ((rzj1) it2.next()).a)) {
                            }
                        }
                        azj1Var = bzj1Var2;
                    }
                }
            } else if (!(bzj1Var instanceof zyj1)) {
                eg.o();
                return null;
            }
            return Next.h(czj1.a(czj1Var, null, azj1Var, 0, 27));
        }
        String str = ((nyj1) syj1Var).a;
        if (bzj1Var instanceof zyj1) {
            azj1Var = new azj1(mqo1.C(Collections.singleton(str)));
        } else if (bzj1Var instanceof yyj1) {
            ArrayList arrayList3 = new ArrayList(q7h.U(c380Var, 10));
            Iterator it3 = c380Var.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((rzj1) it3.next()).a);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList3) {
                if (!u890.j((String) obj4, str)) {
                    arrayList4.add(obj4);
                }
            }
            u380 u380VarC2 = mqo1.C(arrayList4);
            if (u380VarC2.isEmpty()) {
                azj1Var = bzj1Var2;
            } else {
                azj1Var = new azj1(u380VarC2);
            }
        } else {
            if (!(bzj1Var instanceof azj1)) {
                eg.o();
                return null;
            }
            u380 u380Var2 = ((azj1) bzj1Var).a;
            if (u380Var2.contains(str)) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : u380Var2) {
                    if (!u890.j((String) obj5, str)) {
                        arrayList5.add(obj5);
                    }
                }
                u380 u380VarC3 = mqo1.C(arrayList5);
                if (u380VarC3.isEmpty()) {
                    azj1Var = bzj1Var2;
                } else {
                    azj1Var = new azj1(u380VarC3);
                }
            } else {
                u380 u380VarC4 = mqo1.C(dm61.x0(str, u380Var2));
                if (u380VarC4.size() != c380Var.size()) {
                    azj1Var = new azj1(u380VarC4);
                }
            }
        }
        return Next.h(czj1.a(czj1Var, null, azj1Var, 0, 27));
    }
}
