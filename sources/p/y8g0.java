package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class y8g0 implements Update {
    public final Next a(Object obj, Object obj2) {
        Object a8g0Var;
        b9g0 b9g0Var = (b9g0) obj;
        x8g0 x8g0Var = (x8g0) obj2;
        String str = b9g0Var.a;
        Map map = b9g0Var.d;
        if (x8g0Var instanceof r8g0) {
            String str2 = ((r8g0) x8g0Var).a;
            List listD = fj10.d(b9g0Var, str2);
            return listD.isEmpty() ? Next.j() : Next.i(fj10.e(b9g0Var, o7h.p1(listD), j2g0.Y), Collections.singleton(new w7g0(str, listD, str2)));
        }
        if (x8g0Var instanceof t8g0) {
            t8g0 t8g0Var = (t8g0) x8g0Var;
            List list = t8g0Var.b;
            String str3 = t8g0Var.a;
            Set setP1 = o7h.p1(list);
            LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                String str4 = (String) entry.getKey();
                a9g0 a9g0Var = (a9g0) entry.getValue();
                if (setP1.contains(str4)) {
                    a9g0Var.getClass();
                    a9g0Var = new a9g0(ox3.b, false);
                }
                linkedHashMap.put(key, a9g0Var);
            }
            return Next.i(b9g0.a(b9g0Var, linkedHashMap, dm61.x0(str3, b9g0Var.e), false, 39), Collections.singleton(new z7g0(str, str3)));
        }
        if (x8g0Var instanceof s8g0) {
            String str5 = ((s8g0) x8g0Var).a;
            return Next.i(fj10.e(b9g0Var, o7h.p1(fj10.d(b9g0Var, str5)), j2g0.Z), Collections.singleton(new y7g0(str5)));
        }
        boolean z = x8g0Var instanceof w8g0;
        Object b8g0Var = null;
        int i = 2;
        ox3 ox3Var = ox3.a;
        if (z) {
            w8g0 w8g0Var = (w8g0) x8g0Var;
            String str6 = w8g0Var.a;
            a9g0 a9g0Var2 = (a9g0) map.get(str6);
            if (a9g0Var2 == null) {
                return Next.j();
            }
            if (a9g0Var2.a != ox3Var || a9g0Var2.b) {
                return Next.j();
            }
            int iOrdinal = w8g0Var.b.ordinal();
            if (iOrdinal == 0) {
                return Next.j();
            }
            if (iOrdinal == 1) {
                i = 1;
            } else if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            return Next.i(b9g0.a(b9g0Var, sqg0.P(map, new mmr0(str6, a9g0.a((a9g0) sqg0.G(str6, map), true))), null, false, 55), Collections.singleton(new x7g0(str6, i)));
        }
        if (x8g0Var instanceof v8g0) {
            v8g0 v8g0Var = (v8g0) x8g0Var;
            String str7 = v8g0Var.a;
            a9g0 a9g0Var3 = (a9g0) map.get(str7);
            if ((a9g0Var3 != null ? a9g0Var3.a : null) != ox3Var) {
                return Next.j();
            }
            b9g0 b9g0VarA = b9g0.a(b9g0Var, sqg0.P(map, new mmr0(str7, new e4f0(v8g0Var, (byte) 18).invoke(sqg0.G(str7, map)))), null, false, 55);
            String strC = fj10.c(b9g0Var, str7);
            int iC = l1d.C(v8g0Var.b);
            if (iC == 0) {
                b8g0Var = new b8g0(str, strC);
            } else if (iC == 1) {
                b8g0Var = new d8g0(strC);
            } else if (iC != 2) {
                eg.o();
                return null;
            }
            return b8g0Var != null ? Next.i(b9g0VarA, Collections.singleton(b8g0Var)) : Next.h(b9g0VarA);
        }
        if (!(x8g0Var instanceof u8g0)) {
            eg.o();
            return null;
        }
        u8g0 u8g0Var = (u8g0) x8g0Var;
        String str8 = u8g0Var.a;
        a9g0 a9g0Var4 = (a9g0) map.get(str8);
        if ((a9g0Var4 != null ? a9g0Var4.a : null) != ox3Var) {
            return Next.j();
        }
        b9g0 b9g0VarA2 = b9g0.a(b9g0Var, sqg0.P(map, new mmr0(str8, new a9g0(ox3Var, false))), null, false, 55);
        String strC2 = fj10.c(b9g0Var, str8);
        int iC2 = l1d.C(u8g0Var.b);
        if (iC2 == 0) {
            a8g0Var = new a8g0(strC2);
        } else {
            if (iC2 != 1) {
                if (iC2 == 2) {
                    return Next.h(b9g0VarA2);
                }
                eg.o();
                return null;
            }
            a8g0Var = new c8g0(strC2);
        }
        return Next.i(b9g0VarA2, Collections.singleton(a8g0Var));
    }
}
