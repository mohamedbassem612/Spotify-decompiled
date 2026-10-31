package p;

import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bcl1 {
    public final i8h1 a;
    public final b2r0 b;
    public final q9l1 c;

    public bcl1(i8h1 i8h1Var, b2r0 b2r0Var, q9l1 q9l1Var) {
        this.a = i8h1Var;
        this.b = b2r0Var;
        this.c = q9l1Var;
    }

    public static r6h1 b(bcl1 bcl1Var, hp80 hp80Var, String str) {
        x6h1 x6h1VarC = bcl1Var.i(hp80Var).a.c();
        x6h1VarC.i.add(new a7h1("watch_feed_component", str, null, "", ""));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(y6h1VarA), null);
    }

    public static /* synthetic */ tv80 f(bcl1 bcl1Var, hp80 hp80Var, String str, String str2, String str3, iu30 iu30Var, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        return bcl1Var.d(hp80Var, str, str2, str3, iu30Var);
    }

    public final brl0 a(String str) {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        String lowerCase = yon1.h6().a.toLowerCase(Locale.ROOT);
        q9l1 q9l1Var = this.c;
        return new brl0(lowerCase, str, (Integer) q9l1Var.c().getValue(), q9l1Var.b());
    }

    public final tv80 c(e5l0 e5l0Var, iu30 iu30Var) {
        fp80 fp80VarB = e5l0Var.b();
        String strA = fp80VarB.a();
        return this.a.m((w7h1) iu30Var.invoke(a(strA).k(Integer.valueOf(fp80VarB.c()), strA)), null);
    }

    public final tv80 d(hp80 hp80Var, String str, String str2, String str3, iu30 iu30Var) {
        return this.a.m((w7h1) iu30Var.invoke(h(hp80Var != null ? hp80Var.b() : null).i(str, str3, str2)), null);
    }

    public final tv80 e(hp80 hp80Var, iu30 iu30Var) {
        return this.a.m((w7h1) iu30Var.invoke(h(hp80Var != null ? hp80Var.b() : null)), null);
    }

    public final void g(t480 t480Var) {
        if (t480Var != null) {
            ((uba) this.b).o(t480Var, Collections.singleton(c3h1.b));
        }
    }

    public final p3m0 h(fp80 fp80Var) {
        Integer numValueOf = Integer.valueOf(fp80Var != null ? fp80Var.c() : 0);
        String strB = fp80Var != null ? fp80Var.b() : null;
        String strA = fp80Var != null ? fp80Var.a() : "";
        return a(strA).k(numValueOf, strA).e(strA, strB, 0);
    }

    public final p3m0 i(hp80 hp80Var) {
        if (hp80Var == null) {
            o0i o0iVar = (o0i) this.c.a().getValue();
            hp80Var = o0iVar != null ? o0iVar.e : null;
        }
        return h(hp80Var != null ? hp80Var.b() : null);
    }
}
