package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class od7 implements Update {
    public final Next a(Object obj, Object obj2) {
        Set setSingleton;
        sd7 sd7Var = (sd7) obj;
        ld7 ld7Var = (ld7) obj2;
        List list = sd7Var.f;
        String str = sd7Var.a;
        if (ld7Var instanceof dd7) {
            return Next.h(sd7.a(sd7Var, ((dd7) ld7Var).a, null, "", false, null, z6x.a, 3, null, null, null, false, 1946));
        }
        if (ld7Var instanceof id7) {
            List listB = sd7Var.b();
            return Next.i(sd7.a(sd7Var, null, null, null, false, null, null, 0, null, null, null, true, 1023), listB.isEmpty() ? w7x.a : Collections.singleton(new zc7(listB)));
        }
        if (ld7Var instanceof cd7) {
            cd7 cd7Var = (cd7) ld7Var;
            List<hi90> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (hi90 hi90VarA : list2) {
                Boolean bool = (Boolean) cd7Var.a.get(hi90VarA.getUri());
                if ((hi90VarA instanceof yh90) && bool != null) {
                    hi90VarA = yh90.a((yh90) hi90VarA, bool.booleanValue(), 2047);
                }
                arrayList.add(hi90VarA);
            }
            return Next.h(sd7.a(sd7Var, null, null, null, false, null, arrayList, 0, null, null, null, false, 2015));
        }
        if (ld7Var instanceof ed7) {
            ed7 ed7Var = (ed7) ld7Var;
            List listN0 = ed7Var.e;
            if (ed7Var.d) {
                listN0 = o7h.N0(listN0, list);
            }
            sd7 sd7VarA = sd7.a(sd7Var, ed7Var.a, ed7Var.b, ed7Var.c, false, null, listN0, 2, null, ed7Var.f, null, false, 664);
            List listB2 = sd7VarA.b();
            return (!sd7Var.X || listB2.isEmpty()) ? Next.h(sd7VarA) : Next.i(sd7VarA, Collections.singleton(new zc7(listB2)));
        }
        if (ld7Var instanceof kd7) {
            return Next.h(sd7.a(sd7Var, null, null, null, ((kd7) ld7Var).a, null, null, 0, null, null, null, false, 2039));
        }
        boolean z = ld7Var instanceof fd7;
        yc7 yc7Var = yc7.e;
        if (z) {
            fd7 fd7Var = (fd7) ld7Var;
            return Next.i(sd7.a(sd7Var, null, null, null, false, null, null, 0, fd7Var.a, null, null, false, 1919), f46.S0(new fqo1[]{yc7Var, new wc7(fd7Var.a)}));
        }
        if (ld7Var instanceof gd7) {
            List list3 = ((gd7) ld7Var).a;
            return Next.i(sd7.a(sd7Var, null, null, null, false, null, null, 0, null, null, list3, false, 1535), str.length() == 0 ? f46.S0(new fqo1[]{yc7Var, new xc7(list3)}) : f46.S0(new fqo1[]{yc7Var, new ad7(sd7Var.a, "", sd7Var.d, sd7Var.e, list3, sd7Var.i)}));
        }
        if (ld7Var instanceof hd7) {
            if (str.length() == 0) {
                return Next.j();
            }
            return Next.a(Collections.singleton(new ad7(sd7Var.a, sd7Var.c, sd7Var.d, sd7Var.e, sd7Var.t, sd7Var.i)));
        }
        if (!(ld7Var instanceof jd7)) {
            eg.o();
            return null;
        }
        jd7 jd7Var = (jd7) ld7Var;
        r620 r620Var = sd7Var.e;
        String str2 = jd7Var.a;
        r620 r620Var2 = jd7Var.b;
        sd7 sd7VarA2 = sd7.a(sd7Var, null, null, "", false, r620Var2 == null ? r620Var : r620Var2, null, 0, null, null, null, false, 2027);
        if (ihc1.e1(str2 == null ? str : str2).toString().length() == 0) {
            setSingleton = Collections.singleton(new xc7(sd7Var.t));
        } else {
            setSingleton = Collections.singleton(new ad7(str2 == null ? str : str2, "", sd7Var.d, r620Var2 == null ? r620Var : r620Var2, sd7Var.t, sd7Var.i));
        }
        return Next.i(sd7VarA2, setSingleton);
    }
}
