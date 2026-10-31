package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class czj1 {
    public final String a;
    public final c380 b;
    public final bzj1 c;
    public final int d;
    public final int e;
    public final int f;
    public final Set g;

    public czj1(String str, c380 c380Var, bzj1 bzj1Var, int i, int i2) {
        int size;
        Set setP1;
        this.a = str;
        this.b = c380Var;
        this.c = bzj1Var;
        this.d = i;
        this.e = i2;
        yyj1 yyj1Var = yyj1.a;
        boolean zEquals = bzj1Var.equals(yyj1Var);
        zyj1 zyj1Var = zyj1.a;
        if (zEquals) {
            size = c380Var.size();
        } else if (bzj1Var.equals(zyj1Var)) {
            size = 0;
        } else {
            if (!(bzj1Var instanceof azj1)) {
                eg.o();
                throw null;
            }
            size = ((azj1) bzj1Var).a.size();
        }
        this.f = size;
        if (bzj1Var.equals(yyj1Var)) {
            ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((rzj1) it.next()).b);
            }
            setP1 = o7h.p1(arrayList);
        } else if (bzj1Var.equals(zyj1Var)) {
            setP1 = w7x.a;
        } else {
            if (!(bzj1Var instanceof azj1)) {
                eg.o();
                throw null;
            }
            int iS = zno1.s(q7h.U(c380Var, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
            Iterator it2 = c380Var.iterator();
            while (it2.hasNext()) {
                rzj1 rzj1Var = (rzj1) it2.next();
                linkedHashMap.put(rzj1Var.a, rzj1Var.b);
            }
            u380 u380Var = ((azj1) this.c).a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = u380Var.iterator();
            while (it3.hasNext()) {
                String str2 = (String) linkedHashMap.get((String) it3.next());
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            setP1 = o7h.p1(arrayList2);
        }
        this.g = setP1;
    }

    public static czj1 a(czj1 czj1Var, c380 c380Var, bzj1 bzj1Var, int i, int i2) {
        String str = czj1Var.a;
        if ((i2 & 2) != 0) {
            c380Var = czj1Var.b;
        }
        c380 c380Var2 = c380Var;
        if ((i2 & 4) != 0) {
            bzj1Var = czj1Var.c;
        }
        bzj1 bzj1Var2 = bzj1Var;
        if ((i2 & 8) != 0) {
            i = czj1Var.d;
        }
        int i3 = czj1Var.e;
        czj1Var.getClass();
        return new czj1(str, c380Var2, bzj1Var2, i, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czj1)) {
            return false;
        }
        czj1 czj1Var = (czj1) obj;
        return u890.j(this.a, czj1Var.a) && u890.j(this.b, czj1Var.b) && u890.j(this.c, czj1Var.c) && this.d == czj1Var.d && this.e == czj1Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ab80.k(this.d, (this.c.hashCode() + kk0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31);
    }
}
