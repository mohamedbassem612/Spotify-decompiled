package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class hn6 {
    public static final o3r a;
    public static final o3r b;

    static {
        jd11 jd11Var = rc11.a;
        l4r l4rVar = new l4r(new xv00(jd11Var.b(z6a1.class)), 1, qm6.b1, new j4r(qm6.Y0), qm6.c1);
        hvm hvmVar = hvm.c;
        a = w3p1.n(l4rVar, new l4r(hvmVar, 1, qm6.d1, new j4r(qm6.Z0), qm6.e1), ad5.Y);
        b = w3p1.m(new l4r(new wlu(jd11Var.b(jo70.class)), 1, gn6.b, new j4r(qm6.S0), gn6.c), new l4r(new xv00(jd11Var.b(z6a1.class)), 1, gn6.d, new j4r(qm6.T0), gn6.e), new l4r(hvmVar, 1, gn6.f, new j4r(qm6.U0), qm6.a1), o40.O0);
    }

    public static final mr20 a(d0r d0rVar, String str, String str2, boolean z) {
        if (str == null || !z) {
            return new huz(new i1r((Object) null, (Integer) null), (byte) 10);
        }
        byte b2 = 0;
        if (str2 == null) {
            return hu20.e(d3p1.F(d0rVar, a, new jn6(str)), new an6(null, new en6(d0rVar, (byte) 1), (byte) 0));
        }
        return hu20.e(d3p1.F(d0rVar, b, new in6(str, str2)), new an6(null, new en6(d0rVar, b2), (byte) 0));
    }

    public static final ay8 b(d0r d0rVar, List list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str : list2) {
            arrayList.add(new l4r(new wlu(rc11.a.b(jo70.class)), 2, qm6.W0, new j4r(new wk3(str, (byte) 10)), qm6.X0));
        }
        return d3p1.F(d0rVar, new o3r(arrayList, qm6.V0, false), rih1.a);
    }
}
