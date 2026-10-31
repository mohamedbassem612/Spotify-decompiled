package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class w4s implements Update {
    public final Next a(Object obj, Object obj2) {
        ee9 ee9Var;
        cih1 cih1Var;
        si41 si41Var;
        String str;
        k4a0 k4a0Var = (k4a0) obj;
        g4a0 g4a0Var = (g4a0) obj2;
        si41 si41Var2 = k4a0Var.a;
        Object obj3 = null;
        v3a0Var = null;
        v3a0 v3a0Var = null;
        ee9Var = null;
        ee9Var = null;
        ee9 ee9Var2 = null;
        if (g4a0Var instanceof d4a0) {
            k4a0 k4a0VarA = k4a0.a(k4a0Var, si41.a(si41Var2, ((d4a0) g4a0Var).a, false, null, null, 30), null, 6);
            return Next.i(k4a0VarA, poz0.n(k4a0VarA));
        }
        if (g4a0Var instanceof a4a0) {
            k4a0 k4a0VarA2 = k4a0.a(k4a0Var, si41.a(si41Var2, false, false, ((a4a0) g4a0Var).a, null, 23), null, 6);
            Set setO1 = o7h.o1(poz0.n(k4a0VarA2));
            if (poz0.H(k4a0Var, k4a0VarA2)) {
                si41 si41Var3 = k4a0VarA2.a;
                String str2 = si41Var3.d;
                v3a0 v3a0Var2 = str2 != null ? new v3a0(str2, si41Var3.e) : null;
                if (v3a0Var2 != null) {
                    setO1.add(v3a0Var2);
                }
            }
            return Next.i(k4a0VarA2, setO1);
        }
        if (g4a0Var instanceof e4a0) {
            k4a0 k4a0VarA3 = k4a0.a(k4a0Var, null, ((e4a0) g4a0Var).a, 5);
            if (poz0.H(k4a0Var, k4a0VarA3) && (str = (si41Var = k4a0VarA3.a).d) != null) {
                v3a0Var = new v3a0(str, si41Var.e);
            }
            return v3a0Var != null ? Next.i(k4a0VarA3, Collections.singleton(v3a0Var)) : Next.h(k4a0VarA3);
        }
        if (!(g4a0Var instanceof b4a0)) {
            if (g4a0Var instanceof c4a0) {
                k4a0 k4a0VarA4 = k4a0.a(k4a0Var, si41.a(si41Var2, false, ((c4a0) g4a0Var).a, null, null, 29), null, 6);
                return Next.i(k4a0VarA4, poz0.n(k4a0VarA4));
            }
            if (g4a0Var instanceof f4a0) {
                return Next.h(k4a0.a(k4a0Var, si41.a(si41Var2, false, false, null, ((f4a0) g4a0Var).a, 15), null, 6));
            }
            eg.o();
            return null;
        }
        re9 re9Var = ((b4a0) g4a0Var).a;
        boolean z = k4a0Var.c;
        Set set = k4a0Var.b;
        ei9 ei9Var = re9Var.b;
        if (z) {
            int iOrdinal = ei9Var.b.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                cih1Var = cih1.b;
            } else if (iOrdinal == 2) {
                cih1Var = cih1.c;
            } else if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            ee9 ce9Var = new ce9(cih1Var);
            if (set.contains(ce9Var)) {
                ee9Var2 = ce9Var;
            }
        } else {
            int iOrdinal2 = ei9Var.b.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                ee9Var = r2a0.b.a;
            } else if (iOrdinal2 == 2) {
                ee9Var = r2a0.c.a;
            } else if (iOrdinal2 != 3) {
                eg.o();
                return null;
            }
            LinkedHashSet linkedHashSetV0 = o7h.v0(set, re9Var.d);
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : linkedHashSetV0) {
                if (obj4 instanceof de9) {
                    arrayList.add(obj4);
                }
            }
            for (Object obj5 : arrayList) {
                if (u890.j((de9) obj5, ee9Var)) {
                    obj3 = obj5;
                    break;
                }
            }
            ee9Var2 = (de9) obj3;
        }
        String str3 = si41Var2.d;
        if (str3 == null) {
            return Next.j();
        }
        return ee9Var2 == null ? Next.j() : Next.a(Collections.singleton(new x3a0(re9Var.a, ee9Var2, str3)));
    }
}
