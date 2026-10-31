package p;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bf3 {
    public final yqg a;

    public static o3r a(bf3 bf3Var, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) != 0;
        jd11 jd11Var = rc11.a;
        return w3p1.l(new l4r(new wlu(jd11Var.b(jo70.class)), 2, we3.d, new j4r(we3.Y), we3.e), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, we3.f, new j4r(we3.Z), we3.g), new l4r(new wlu(jd11Var.b(zoy0.class)), 2, we3.h, new j4r(we3.N0), we3.i), new l4r(new xv00(jd11Var.b(bql.class)), 2, we3.t, new j4r(new gy((byte) 2, z2)), we3.X), new af3(z3, bf3Var, z2));
    }

    public static taz b(jbz jbzVar) {
        String str = jbzVar.a;
        if (jbzVar.A) {
            return null;
        }
        fap1 fap1Var = jbzVar.w;
        if (fap1Var instanceof lz1) {
            return new taz(new pk1(qk1.a, false, str, ((lz1) fap1Var).c, (j7p1) null, 16));
        }
        if (fap1Var instanceof mz1) {
            return new taz(new pk1(qk1.b, false, str, ((mz1) fap1Var).c, (j7p1) null, 16));
        }
        eg.o();
        return null;
    }

    public static vaz c(jbz jbzVar) {
        h1v k1vVar;
        h1v h1vVar;
        j1v j1vVar = jbzVar.l;
        boolean zEquals = j1vVar.equals(g1v.b);
        h1v h1vVar2 = m1v.a;
        h1v h1vVar3 = i1v.a;
        if (!zEquals) {
            if (j1vVar instanceof j1v) {
                k1vVar = new k1v(Float.valueOf(j1vVar.b));
            } else if (j1vVar.equals(g1v.c)) {
                k1vVar = h1vVar3;
            } else if (j1vVar.equals(g1v.d)) {
                h1vVar = l1v.a;
            } else if (j1vVar.equals(g1v.f)) {
                h1vVar = n1v.a;
            } else {
                if (!j1vVar.equals(g1v.e)) {
                    eg.o();
                    return null;
                }
                k1vVar = h1vVar2;
            }
            if (!k1vVar.equals(h1vVar2) || (jbzVar.y && !k1vVar.equals(h1vVar3))) {
                return null;
            }
            return new vaz(new sru(k1vVar, (String) null, jbzVar.z, jbzVar.a, 2));
        }
        h1vVar = h1v.a;
        k1vVar = h1vVar;
        if (k1vVar.equals(h1vVar2)) {
        }
        return null;
    }

    public String d() {
        yqg yqgVar = this.a;
        int offset = (yqgVar.g().getOffset(yqgVar.b()) / 1000) / 60;
        return "timezone_".concat(zno1.z(String.format(Locale.ROOT, "%+03d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(offset / 60), Integer.valueOf(Math.abs(offset) % 60)}, 2)).getBytes(nne.a)));
    }
}
