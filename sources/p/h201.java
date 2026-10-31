package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class h201 implements Update {
    public static final h201 a = new h201();

    public final Next a(Object obj, Object obj2) {
        q001 q001Var;
        String str;
        l201 l201Var = (l201) obj;
        z101 z101Var = (z101) obj2;
        String str2 = l201Var.c;
        String str3 = l201Var.b;
        yae0 yae0Var = l201Var.a;
        if (z101Var.equals(p101.a)) {
            boolean z = yae0Var instanceof gbe0;
            if (z && u890.j(str3, ((q001) ((gbe0) yae0Var).a).c)) {
                return Next.j();
            }
            return (!z || (str = (q001Var = (q001) ((gbe0) yae0Var).a).c) == null || str.length() == 0) ? Next.j() : Next.i(l201.a(l201Var, null, q001Var.c, null, 0, 13), Collections.singleton(new g101(q001Var.c)));
        }
        if (z101Var instanceof q101) {
            return Next.a(Collections.singleton(new j101(((q101) z101Var).a)));
        }
        boolean z2 = z101Var instanceof r101;
        f101 f101Var = f101.a;
        if (z2) {
            r101 r101Var = (r101) z101Var;
            return Next.a(f46.S0(new m101[]{new h101(r101Var.a, r101Var.b), f101Var, i101.a}));
        }
        if (z101Var instanceof u101) {
            q001 q001Var2 = ((u101) z101Var).a;
            if (yae0Var instanceof qbe0) {
                return Next.h(l201.a(l201Var, new gbe0(q001Var2), null, null, 5, 6));
            }
            if (yae0Var instanceof gbe0) {
                String str4 = q001Var2.d;
                if (u890.j(str3, str4)) {
                    q001 q001Var3 = (q001) ((gbe0) yae0Var).a;
                    if (str4 != null) {
                        String str5 = q001Var3.c;
                        List list = q001Var3.a;
                        if (str4.equals(str5)) {
                            List list2 = q001Var2.a;
                            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                            int i = 0;
                            for (Object obj3 : list2) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    p7h.T();
                                    throw null;
                                }
                                fxz0 fxz0Var = (fxz0) obj3;
                                fxz0 fxz0Var2 = (fxz0) o7h.C0(list);
                                arrayList.add(new fxz0(i + (fxz0Var2 != null ? fxz0Var2.a : 0) + 1, fxz0Var.b));
                                i = i2;
                            }
                            q001Var2 = new q001(q001Var3.b + 1, q001Var2.c, str4, o7h.N0(arrayList, list));
                        } else {
                            q001Var2 = q001Var3;
                        }
                    }
                    return Next.h(l201.a(l201Var, new gbe0(q001Var2), null, null, 5, 4));
                }
            }
            return Next.j();
        }
        if (z101Var instanceof s101) {
            s101 s101Var = (s101) z101Var;
            g101 g101Var = new g101(s101Var.a);
            Throwable th = s101Var.b;
            return Next.a(Collections.singleton(new l101(g101Var, i3a.j("Failed to load reactions: ", th), th)));
        }
        if (z101Var instanceof y101) {
            String str6 = ((y101) z101Var).a;
            return !str6.equals(str2) ? Next.h(l201.a(l201Var, null, null, str6, 0, 11)) : Next.j();
        }
        if (z101Var instanceof t101) {
            String str7 = ((t101) z101Var).a;
            if (yae0Var instanceof gbe0) {
                q001 q001Var4 = (q001) ((gbe0) yae0Var).a;
                List<fxz0> list3 = q001Var4.a;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (fxz0 fxz0Var3 : list3) {
                        if (fqo1.E(fxz0Var3.b, str2 == null ? "" : str2) && u890.j(fxz0Var3.b.b, str7)) {
                            List list4 = q001Var4.a;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : list4) {
                                fxz0 fxz0Var4 = (fxz0) obj4;
                                if (!fqo1.E(fxz0Var4.b, str2 == null ? "" : str2) || !u890.j(fxz0Var4.b.b, str7)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            return Next.i(l201.a(l201Var, new gbe0(new q001(q001Var4.b, q001Var4.c, q001Var4.d, arrayList2)), null, null, 0, 14), Collections.singleton(f101Var));
                        }
                    }
                }
            }
            return Next.j();
        }
        if (z101Var instanceof v101) {
            v101 v101Var = (v101) z101Var;
            j101 j101Var = new j101(v101Var.a);
            Throwable th2 = v101Var.b;
            return Next.a(Collections.singleton(new l101(j101Var, i3a.j("Failed to remove reaction: ", th2), th2)));
        }
        if (z101Var instanceof w101) {
            k101 k101Var = ((w101) z101Var).a;
            if ((k101Var instanceof g101) || (k101Var instanceof j101)) {
                return Next.a(Collections.singleton(k101Var));
            }
            eg.o();
            return null;
        }
        if (!(z101Var instanceof x101)) {
            eg.o();
            return null;
        }
        x101 x101Var = (x101) z101Var;
        k101 k101Var2 = x101Var.a;
        if (k101Var2 instanceof g101) {
            return Next.h(l201.a(l201Var, yae0Var instanceof qbe0 ? new yae0(x101Var.b) : yae0Var, null, null, 0, 4));
        }
        if (k101Var2 instanceof j101) {
            return Next.j();
        }
        eg.o();
        return null;
    }
}
