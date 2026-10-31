package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class hbc1 implements Update {
    public static final hbc1 a = new hbc1();

    public final Next a(Object obj, Object obj2) {
        long jPow;
        lbc1 lbc1Var = (lbc1) obj;
        ebc1 ebc1Var = (ebc1) obj2;
        eb71 eb71Var = lbc1Var.X;
        jix0 jix0Var = lbc1Var.e;
        boolean z = lbc1Var.g;
        boolean z2 = lbc1Var.f;
        boolean z3 = lbc1Var.h;
        int i = lbc1Var.c;
        kas0 kas0Var = lbc1Var.d;
        u4c1 u4c1Var = lbc1Var.a;
        if (ebc1Var instanceof vac1) {
            if (!u890.j(u4c1Var, r4c1.a) && !u890.j(u4c1Var, q4c1.a)) {
                return Next.j();
            }
            int i2 = lbc1Var.b + 1;
            lbc1 lbc1VarA = lbc1.a(lbc1Var, null, i2, 0, null, null, false, false, false, false, null, 2045);
            if (i2 > 0) {
                if (i2 > 5) {
                    i2 = 5;
                }
                jPow = (long) (Math.pow(2.0d, i2) * 200.0d);
            } else {
                jPow = 0;
            }
            return Next.i(lbc1VarA, f46.S0(new sio1[]{new y9c1(jPow), z9c1.c}));
        }
        if (ebc1Var instanceof zac1) {
            u4c1 u4c1Var2 = ((zac1) ebc1Var).a;
            lbc1 lbc1VarA2 = lbc1.a(lbc1Var, u4c1Var2, 0, u4c1Var2.A(), null, null, false, false, false, false, null, 2042);
            return u4c1Var2 instanceof t4c1 ? Next.i(lbc1VarA2, f46.S0(new sio1[]{new mac1(lbc1VarA2.c), new jac1(0)})) : Next.h(lbc1VarA2);
        }
        boolean z4 = ebc1Var instanceof dbc1;
        gac1 gac1Var = gac1.c;
        kas0 kas0Var2 = kas0.a;
        if (!z4) {
            if (ebc1Var instanceof cbc1) {
                o7c1 o7c1Var = ((cbc1) ebc1Var).a;
                lbc1 lbc1VarA3 = lbc1.a(lbc1Var, null, 0, 0, null, null, false, u890.j(o7c1Var.d, gy61.a) || !o7c1Var.e, o7c1Var.e, o7c1Var.g, null, 1343);
                xj61 xj61Var = new xj61();
                xj61Var.add(new hac1(o7c1Var));
                xj61Var.add(new dac1(o7c1Var.f));
                if (kas0Var == kas0Var2) {
                    xj61Var.add(gac1Var);
                }
                return Next.i(lbc1VarA3, cwl1.j(xj61Var));
            }
            if (ebc1Var instanceof bbc1) {
                return xio1.s(lbc1Var, ((bbc1) ebc1Var).a);
            }
            if (ebc1Var instanceof abc1) {
                return xio1.s(lbc1Var, ((abc1) ebc1Var).a);
            }
            if (ebc1Var instanceof wac1) {
                kas0 kas0Var3 = ((wac1) ebc1Var).a;
                if (kas0Var == kas0Var3 || lbc1Var.i) {
                    return Next.j();
                }
                return Next.i(lbc1.a(lbc1Var, null, 0, 0, kas0Var3, null, false, false, false, false, null, 2039), Collections.singleton(kas0Var3 == kas0Var2 ? iac1.c : kac1.c));
            }
            if (ebc1Var instanceof yac1) {
                eb71 eb71Var2 = ((yac1) ebc1Var).a;
                return eb71Var == eb71Var2 ? Next.j() : Next.h(lbc1.a(lbc1Var, null, 0, 0, null, null, false, false, false, false, eb71Var2, 1023));
            }
            if (!(ebc1Var instanceof xac1)) {
                eg.o();
                return null;
            }
            xac1 xac1Var = (xac1) ebc1Var;
            xj61 xj61Var2 = new xj61();
            boolean z5 = z3 && (u4c1Var instanceof t4c1) && !lbc1Var.t;
            o7c1 o7c1Var2 = xac1Var.a;
            boolean z6 = i == o7c1Var2.a;
            boolean z7 = eb71Var == eb71.b;
            xj61Var2.add(new aac1(o7c1Var2.f));
            if (z5 && z6 && z7) {
                xj61Var2.add(new lac1(i, "wrapped-screenshot-detection"));
            }
            return Next.a(cwl1.j(xj61Var2));
        }
        egi1 egi1Var = ((dbc1) ebc1Var).a;
        if (egi1Var.equals(ufi1.a)) {
            return xio1.r(lbc1Var, false);
        }
        if (egi1Var.equals(xfi1.a)) {
            if (!(u4c1Var instanceof t4c1)) {
                return Next.j();
            }
            if (i == 0) {
                return Next.i(xio1.t(lbc1Var, 0), Collections.singleton(new mac1(0)));
            }
            int i3 = i - 1;
            return Next.i(xio1.t(lbc1Var, i3), f46.S0(new sio1[]{new mac1(i3), cac1.c}));
        }
        if (egi1Var.equals(tfi1.a)) {
            return z2 ? Next.j() : Next.i(lbc1.a(lbc1Var, null, 0, 0, null, null, true, false, false, false, null, 2015), Collections.singleton(eac1.c));
        }
        if (egi1Var.equals(dgi1.a)) {
            return !z2 ? Next.j() : Next.i(lbc1.a(lbc1Var, null, 0, 0, null, null, false, false, false, false, null, 2015), Collections.singleton(nac1.c));
        }
        if (egi1Var.equals(rfi1.a)) {
            return Next.i(lbc1.a(lbc1Var, null, 0, 0, null, null, false, false, false, false, null, 1791), Collections.singleton(x9c1.c));
        }
        if (egi1Var.equals(vfi1.a)) {
            return kas0Var == kas0Var2 ? Next.j() : Next.a(Collections.singleton(fac1.c));
        }
        if (egi1Var.equals(zfi1.a)) {
            return kas0Var == kas0.b ? Next.j() : Next.a(Collections.singleton(gac1Var));
        }
        if (egi1Var.equals(bgi1.a)) {
            return (z3 && (u4c1Var instanceof t4c1)) ? Next.a(Collections.singleton(new lac1(i, "share-button"))) : Next.j();
        }
        if (egi1Var.equals(yfi1.a)) {
            return !(u4c1Var instanceof t4c1) ? Next.j() : Next.i(xio1.t(lbc1Var, 0), Collections.singleton(new mac1(0)));
        }
        if (egi1Var.equals(cgi1.a)) {
            return (z && z3) ? Next.h(lbc1.a(lbc1Var, null, 0, 0, null, null, false, false, false, false, null, 1983)) : Next.j();
        }
        if (egi1Var.equals(sfi1.a)) {
            return z ? Next.j() : Next.h(lbc1.a(lbc1Var, null, 0, 0, null, null, false, true, false, false, null, 1983));
        }
        boolean zEquals = egi1Var.equals(wfi1.a);
        jix0 jix0Var2 = jix0.a;
        jix0 jix0Var3 = jix0.b;
        if (zEquals) {
            return jix0Var == jix0Var3 ? Next.h(lbc1.a(lbc1Var, null, 0, 0, null, jix0Var2, false, false, false, false, null, 2031)) : Next.j();
        }
        if (egi1Var.equals(agi1.a)) {
            return jix0Var == jix0Var2 ? Next.h(lbc1.a(lbc1Var, null, 0, 0, null, jix0Var3, false, false, false, false, null, 2031)) : Next.j();
        }
        if (egi1Var.equals(qfi1.a)) {
            return xio1.r(lbc1Var, true);
        }
        eg.o();
        return null;
    }
}
