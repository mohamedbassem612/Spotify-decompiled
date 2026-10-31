package p;

import com.spotify.messages.UbiProd1ImpressionSegment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q7h1 {
    public final t2j0 a;
    public final v6h1 b;

    public q7h1(t2j0 t2j0Var, v6h1 v6h1Var, s7h1 s7h1Var) {
        this.a = t2j0Var;
        this.b = v6h1Var;
    }

    public final void a(p480 p480Var, int i, long j, long j2, ArrayList arrayList, ArrayList arrayList2, Set set, String str, Integer num) {
        u6h1 u6h1VarA = this.b.a();
        LinkedHashMap linkedHashMapU = f0o1.u(set);
        String str2 = u6h1VarA.h;
        Integer num2 = u6h1VarA.i;
        f9h1 f9h1VarQ = UbiProd1ImpressionSegment.q();
        f9h1VarQ.v(p480Var.a);
        f9h1VarQ.y(i);
        f9h1VarQ.u(j2);
        f9h1VarQ.z(j);
        f9h1VarQ.n(arrayList2);
        f9h1VarQ.q(arrayList);
        f9h1VarQ.r(linkedHashMapU);
        if (str != null) {
            f9h1VarQ.x(str);
        }
        if (num != null) {
            f9h1VarQ.w(num.intValue());
        }
        if (str2 != null) {
            f9h1VarQ.s(str2);
        }
        if (num2 != null) {
            f9h1VarQ.t(num2.intValue());
        }
        this.a.a((UbiProd1ImpressionSegment) f9h1VarQ.build());
    }

    public final void b(p480 p480Var, l7h1 l7h1Var, a8r0 a8r0Var, Set set, g6h1 g6h1Var) {
        u6h1 u6h1VarA = this.b.a();
        y6r0 y6r0Var = a8r0Var.a;
        String str = a8r0Var.b;
        u6h1 u6h1VarA2 = u6h1.a(u6h1VarA, y6r0Var, a8r0Var.c, str == null ? "" : str, 489);
        String str2 = p480Var.a;
        String str3 = y6r0Var != null ? y6r0Var.a : null;
        this.a.a(b7h1.c(l7h1Var, str2, str3 == null ? "" : str3, a8r0Var.c, u6h1VarA2.d, str == null ? "" : str, u6h1VarA2.f, u6h1VarA2.g, f0o1.u(set), u6h1VarA2.h, null, g6h1Var, 4608));
    }
}
