package p;

import com.google.android.recaptcha.internal.zzak;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qin1 {
    public static final HashMap a;

    static {
        v2p1 p4p1Var;
        Map.Entry entry;
        utw0 utw0Var = new utw0();
        utw0Var.D(new Long[]{-80L, -74L}, dfp1.a);
        utw0Var.D(new Long[]{-58L, -73L}, dfp1.b);
        utw0Var.D(new Long[]{-44L, -41L}, dfp1.c);
        utw0Var.D(new Long[]{-51L, -20L}, dfp1.d);
        utw0Var.D(new Long[]{-82L, -15L}, dfp1.e);
        utw0Var.D(new Long[]{-69L, -17L}, dfp1.f);
        utw0Var.D(new Long[]{-59L, -64L}, dfp1.g);
        utw0Var.D(new Long[]{-49L, -46L}, dfp1.h);
        utw0Var.D(new Long[]{-55L, -5L}, dfp1.i);
        utw0Var.D(new Long[]{-7L, -84L}, dfp1.t);
        utw0Var.D(new Long[]{-70L, -34L}, dfp1.X);
        utw0Var.D(new Long[]{-83L, -18L}, dfp1.Y);
        utw0Var.D(new Long[]{-32L, -13L}, dfp1.Z);
        utw0Var.D(new Long[]{-85L, -47L}, dfp1.N0);
        utw0Var.D(new Long[]{-86L, -16L}, dfp1.O0);
        utw0Var.D(new Long[]{-89L, -48L}, dfp1.P0);
        utw0Var.D(new Long[]{-30L, -14L}, dfp1.Q0);
        utw0Var.D(new Long[]{-60L, -75L}, dfp1.R0);
        utw0Var.D(new Long[]{-45L, -79L}, dfp1.S0);
        utw0Var.D(new Long[]{-65L, -66L}, dfp1.T0);
        utw0Var.D(new Long[]{-19L, -72L}, dfp1.U0);
        utw0Var.D(new Long[]{-62L, -39L}, dfp1.W0);
        utw0Var.D(new Long[]{-23L, -42L}, dfp1.X0);
        utw0Var.D(new Long[]{-25L}, dfp1.Y0);
        utw0Var.D(new Long[]{-3L}, dfp1.Z0);
        utw0Var.D(new Long[]{-10L}, dfp1.a1);
        utw0Var.D(new Long[]{-67L}, dfp1.b1);
        utw0Var.D(new Long[]{-28L}, dfp1.c1);
        utw0Var.D(new Long[]{-12L}, dfp1.e1);
        utw0Var.D(new Long[]{-27L}, dfp1.g1);
        utw0Var.D(new Long[]{-71L}, dfp1.h1);
        utw0Var.D(new Long[]{-37L}, dfp1.i1);
        utw0Var.D(new Long[]{-8L}, dfp1.j1);
        utw0Var.D(new Long[]{-1L}, dfp1.k1);
        utw0Var.D(new Long[]{-38L}, dfp1.l1);
        utw0Var.D(new Long[]{-52L}, dfp1.m1);
        utw0Var.D(new Long[]{-35L}, dfp1.n1);
        utw0Var.D(new Long[]{-78L}, dfp1.o1);
        utw0Var.D(new Long[]{-77L}, dfp1.p1);
        utw0Var.D(new Long[]{-87L}, dfp1.q1);
        utw0Var.D(new Long[]{-4L}, dfp1.r1);
        utw0Var.D(new Long[]{-61L}, dfp1.s1);
        utw0Var.D(new Long[]{-50L}, dfp1.t1);
        utw0Var.D(new Long[]{-2L}, dfp1.u1);
        utw0Var.D(new Long[]{-76L}, dfp1.f1);
        utw0Var.D(new Long[]{-24L}, dfp1.d1);
        utw0Var.D(new Long[]{-63L}, dfp1.v1);
        utw0Var.D(new Long[]{-68L}, dfp1.w1);
        utw0Var.D(new Long[]{-81L}, dfp1.x1);
        utw0Var.D(new Long[]{-11L}, dfp1.V0);
        utw0Var.D(new Long[]{-26L}, dfp1.y1);
        utw0Var.D(new Long[]{-53L}, dfp1.z1);
        utw0Var.D(new Long[]{-31L}, dfp1.A1);
        utw0Var.D(new Long[]{-56L}, dfp1.F1);
        utw0Var.D(new Long[]{-57L}, dfp1.G1);
        utw0Var.D(new Long[]{-29L}, dfp1.B1);
        utw0Var.D(new Long[]{-36L}, dfp1.C1);
        utw0Var.D(new Long[]{-21L}, dfp1.D1);
        utw0Var.D(new Long[]{-22L}, dfp1.E1);
        utw0Var.D(new Long[]{-40L}, dfp1.H1);
        utw0Var.D(new Long[]{-54L}, dfp1.I1);
        utw0Var.D(new Long[]{-6L}, dfp1.J1);
        utw0Var.D(new Long[]{-33L}, dfp1.K1);
        utw0Var.D(new Long[]{-88L}, dfp1.L1);
        utw0Var.D(new Long[]{-9L}, dfp1.M1);
        utw0Var.D(new Long[]{-43L}, dfp1.N1);
        p2p1 p2p1Var = (p2p1) utw0Var.a;
        if (p2p1Var == null) {
            p4p1Var = v2p1.c;
        } else {
            e2p1<Map.Entry> e2p1Var = new e2p1(p2p1Var);
            if (e2p1Var.isEmpty()) {
                p4p1Var = v2p1.c;
            } else {
                que0 que0Var = new que0(e2p1Var.b.size());
                int size = 0;
                for (Map.Entry entry2 : e2p1Var) {
                    Object key = entry2.getKey();
                    i4p1 i4p1VarL = i4p1.l(((g4p1) entry2.getValue()).d());
                    if (!i4p1VarL.isEmpty()) {
                        que0Var.g(key, i4p1VarL);
                        size += i4p1VarL.size();
                    }
                }
                p4p1Var = new p4p1(que0Var.h(), size);
            }
        }
        k5n1 k5n1VarB = new m4p1(p4p1Var, (byte) 0).b();
        do {
            b4p1 b4p1Var = (b4p1) k5n1VarB;
            if (b4p1Var.hasNext()) {
                entry = (Map.Entry) b4p1Var.next();
                if (((Long) entry.getValue()).longValue() > -1) {
                    break;
                }
            } else {
                HashMap map = new HashMap();
                k5n1 k5n1VarB2 = new m4p1(p4p1Var, (byte) 0).b();
                while (true) {
                    b4p1 b4p1Var2 = (b4p1) k5n1VarB2;
                    if (!b4p1Var2.hasNext()) {
                        a = map;
                        return;
                    }
                    Map.Entry entry3 = (Map.Entry) b4p1Var2.next();
                    dfp1 dfp1Var = (dfp1) entry3.getKey();
                    Long l = (Long) entry3.getValue();
                    long jLongValue = l.longValue();
                    if (map.containsKey(l)) {
                        String strValueOf = String.valueOf(map.get(l));
                        String strValueOf2 = String.valueOf(dfp1Var);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(jLongValue).length() + 27 + 5 + strValueOf2.length());
                        String strA = bap1.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA==");
                        String strA2 = bap1.a("cQk=");
                        String strA3 = bap1.a("a0ivq0U=");
                        sb.append(strA);
                        sb.append(jLongValue);
                        sb.append(strA2);
                        sb.append(strValueOf);
                        sb.append(strA3);
                        sb.append(strValueOf2);
                        throw new zzak(sb.toString());
                    }
                    map.put(l, dfp1Var);
                }
            }
        } while (((Long) entry.getValue()).longValue() >= -89);
        throw new zzak(bap1.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry.getValue())));
    }
}
