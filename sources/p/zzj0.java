package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class zzj0 implements Update {
    /* JADX WARN: Code duplicated, block: B:71:0x0370 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x0371  */
    public final Next a(Object obj, Object obj2) {
        lhg1 lhg1Var;
        kak0 kak0VarA;
        Next nextI;
        Next nextT;
        woo wooVar;
        boolean z;
        Next nextI2;
        kak0 kak0Var = (kak0) obj;
        l3k0 l3k0Var = (k4k0) obj2;
        Boolean bool = kak0Var.f;
        boolean z2 = kak0Var.p1;
        lhg1 lhg1Var2 = kak0Var.S0;
        if (kak0Var.g1.a() && !(l3k0Var instanceof g4k0) && !u890.j(l3k0Var, c4k0.a) && !(l3k0Var instanceof z2k0) && !(l3k0Var instanceof y2k0) && !(l3k0Var instanceof o2k0) && !u890.j(l3k0Var, n2k0.a) && !(l3k0Var instanceof b3k0) && !(l3k0Var instanceof a3k0) && !(l3k0Var instanceof l3k0) && !(l3k0Var instanceof k3k0)) {
            return Next.j();
        }
        if (l3k0Var instanceof i4k0) {
            return Next.a(Collections.singleton(new h1k0(new f7k0(o2p1.f(kak0Var), ((i4k0) l3k0Var).a))));
        }
        if (l3k0Var instanceof m3k0) {
            return Next.a(Collections.singleton(new h1k0(new e7k0(o2p1.f(kak0Var), ((m3k0) l3k0Var).a))));
        }
        if (l3k0Var instanceof b3k0) {
            return Next.h(kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, ((b3k0) l3k0Var).a, 0L, null, null, -1, 1015807));
        }
        boolean z3 = l3k0Var instanceof a3k0;
        rcu0 rcu0Var = rcu0.a;
        e1k0 e1k0Var = e1k0.a;
        if (z3) {
            a3k0 a3k0Var = (a3k0) l3k0Var;
            j7k0 j7k0Var = a3k0Var.a;
            kak0 kak0VarA2 = kak0.a(o2p1.p(kak0Var, new a7k0(j7k0Var.a, j7k0Var.b)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kak0Var.X0 && !j7k0Var.d, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, j7k0Var.c, 0L, null, null, -8388609, 229375);
            if (kak0VarA2.S0.a.a == b8w0.None) {
                return Next.i(kak0.a(kak0VarA2, null, null, wcu0.a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -65, 1048575), Collections.singleton(e1k0Var));
            }
            kak0 kak0VarA3 = kak0.a(kak0VarA2, null, null, rcu0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -65, 1048575);
            return Next.i(kak0VarA3, Collections.singleton(new r0k0(kak0VarA3.S0, a3k0Var.b, false, 0L, kak0VarA3.b(), 12)));
        }
        if (l3k0Var instanceof j3k0) {
            return Next.i(kak0.a(kak0Var, null, null, rcu0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -65, 1048575), Collections.singleton(new r0k0(kak0Var.S0, ((j3k0) l3k0Var).a, false, 0L, kak0Var.b(), 12)));
        }
        if (l3k0Var instanceof t3k0) {
            return Next.a(Collections.singleton(e1k0Var));
        }
        if (l3k0Var instanceof p3k0) {
            p3k0 p3k0Var = (p3k0) l3k0Var;
            if (i2p1.p(kak0Var)) {
                if (z2) {
                    nextI2 = Next.a(Collections.singleton(new d1k0(p3u.a)));
                } else {
                    z = z2;
                    nextI2 = Next.i(kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, giq0.c, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -1, 1048574), Collections.singleton(q3p1.m(kak0Var, new v0k0(p3k0Var.a))));
                }
                if (z) {
                    return nextI2;
                }
                return zz10.a(nextI2);
            }
            nextI2 = Next.j();
            z = z2;
            if (z) {
                return nextI2;
            }
            return zz10.a(nextI2);
        }
        if (l3k0Var instanceof d2k0) {
            return l2p1.m(kak0Var) ? Next.a(Collections.singleton(new d1k0(l3u.a))) : Next.a(Collections.singleton(new g0k0(bool, ((d2k0) l3k0Var).a)));
        }
        if (l3k0Var instanceof g2k0) {
            return zz10.c(x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, null, null, lhg1.a(lhg1Var2, q6w0.a(lhg1Var2.a, null, new hez(((g2k0) l3k0Var).a), null, null, null, null, null, null, null, null, null, null, null, null, null, 63995), null, false, false, 14), null, null, null, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -8650753, 1048575)), kak0Var))), 3), kak0Var, null);
        }
        if (l3k0Var instanceof f2k0) {
            ruq0 ruq0Var = lhg1Var2.b;
            ruq0 ruq0VarT = i2p1.t(kak0Var, ((f2k0) l3k0Var).a);
            if (ruq0VarT == null) {
                nextT = Next.j();
                wooVar = null;
            } else {
                int i = ruq0VarT.X;
                nextT = x1p1.t(x1p1.B(x1p1.C(x1p1.w(dzo1.l(x1p1.E(x1p1.F(Next.h(kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, null, null, lhg1.a(kak0Var.S0, null, ruq0.a(ruq0VarT, null, null, null, null, null, null, null, null, x1p1.e(ruq0Var.i, i, kak0Var.d1), x1p1.e(ruq0Var.t, i, kak0Var.e1), 0, null, null, null, false, 0.0f, 0.0f, 0.0d, 0.0d, 523519), false, false, 13), null, null, null, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -262145, 1048575)), kak0Var)), kak0Var)))), 3);
                wooVar = null;
            }
            return zz10.c(nextT, kak0Var, wooVar);
        }
        if (l3k0Var instanceof g4k0) {
            g4k0 g4k0Var = (g4k0) l3k0Var;
            lhg1 lhg1VarW = g4k0Var.a;
            String str = g4k0Var.d;
            f4k0 f4k0Var = g4k0Var.b;
            String str2 = g4k0Var.c;
            if (str2 == null || str == null) {
                lhg1Var = lhg1VarW;
            } else if (lhg1VarW != null) {
                lhg1VarW = dsa0.w(lhg1VarW, g4k0Var);
                lhg1Var = lhg1VarW;
            } else {
                lhg1Var = null;
            }
            if (str2 == null || str == null) {
                kak0VarA = kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, lhg1Var, null, null, null, null, lhg1Var, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -2162689, 1048575);
            } else {
                lhg1 lhg1VarW2 = dsa0.w(kak0Var.h, g4k0Var);
                lhg1 lhg1Var3 = kak0Var.i;
                lhg1 lhg1VarW3 = lhg1Var3 != null ? dsa0.w(lhg1Var3, g4k0Var) : null;
                lhg1 lhg1Var4 = kak0Var.t;
                lhg1 lhg1VarW4 = lhg1Var4 != null ? dsa0.w(lhg1Var4, g4k0Var) : null;
                List<sr10> list = kak0Var.Y;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (sr10 sr10Var : list) {
                    arrayList.add(sr10.a(sr10Var, dsa0.w(sr10Var.c, g4k0Var)));
                }
                List<sr10> list2 = kak0Var.Z;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (sr10 sr10Var2 : list2) {
                    arrayList2.add(sr10.a(sr10Var2, dsa0.w(sr10Var2.c, g4k0Var)));
                }
                lhg1 lhg1Var5 = kak0Var.R0;
                lhg1 lhg1VarW5 = lhg1Var5 != null ? dsa0.w(lhg1Var5, g4k0Var) : null;
                lhg1 lhg1VarW6 = dsa0.w(kak0Var.S0, g4k0Var);
                String str3 = g4k0Var.c;
                String str4 = g4k0Var.d;
                lhg1 lhg1Var6 = kak0Var.s1;
                kak0VarA = kak0.a(kak0Var, null, null, null, lhg1VarW2, lhg1VarW3, lhg1VarW4, null, arrayList, arrayList2, null, lhg1Var, lhg1VarW5, lhg1VarW6, str3, str4, lhg1Var, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, lhg1Var6 != null ? dsa0.w(lhg1Var6, g4k0Var) : null, null, null, null, 0L, null, null, -4135809, 1044479);
            }
            kak0 kak0Var2 = kak0VarA;
            if (f4k0Var instanceof e4k0) {
                nextI = Next.i(kak0.a(kak0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, giq0.a, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -1, 1048574), Collections.singleton(new k0k0(((e4k0) f4k0Var).a)));
            } else if (f4k0Var instanceof d4k0) {
                nextI = u890.j(kak0Var2.W0, j8w0.a) ? Next.i(kak0Var2, Collections.singleton(new l0k0(kak0Var2.S0, ((d4k0) f4k0Var).a))) : Next.i(kak0Var2, Collections.singleton(new j1k0(((d4k0) f4k0Var).a)));
            } else {
                eg.o();
                nextI = null;
            }
            ntf1 ntf1VarO = o2p1.o(kak0Var);
            if (!nextI.d()) {
                return nextI;
            }
            kak0 kak0Var3 = (kak0) nextI.g();
            return Next.i(kak0Var3, dm61.x0(new h1k0(new c7k0(ntf1VarO, o2p1.f(kak0Var3))), nextI.b()));
        }
        if (l3k0Var instanceof l2k0) {
            return zz10.c(x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, null, null, lhg1.a(lhg1Var2, q6w0.a(lhg1Var2.a, new buk1(((l2k0) l3k0Var).a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65149), null, false, false, 14), null, null, null, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -8650753, 1048575)), kak0Var))), 3), kak0Var, null);
        }
        boolean z4 = l3k0Var instanceof e2k0;
        i0k0 i0k0Var = i0k0.a;
        if (z4) {
            e2k0 e2k0Var = (e2k0) l3k0Var;
            int iC = l1d.C(e2k0Var.a);
            if (iC == 0) {
                return Next.a(f46.S0(new k1k0[]{i0k0Var, new g0k0(bool, e2k0Var.b)}));
            }
            if (iC == 1) {
                return Next.a(Collections.singleton(i0k0Var));
            }
            eg.o();
            return null;
        }
        if (l3k0Var instanceof l3k0) {
            return s110.p(kak0Var, l3k0Var);
        }
        if (l3k0Var instanceof q2k0) {
            return Next.i(kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -8388609, 1048575), Collections.singleton(h0k0.a));
        }
        if (l3k0Var instanceof s3k0) {
            return up30.z(kak0Var, (s3k0) l3k0Var);
        }
        if (l3k0Var instanceof h2k0) {
            return zz10.c(mod.v(kak0Var, (h2k0) l3k0Var), kak0Var, null);
        }
        if (l3k0Var instanceof i2k0) {
            return zz10.c(d7e.B(kak0Var, (i2k0) l3k0Var), kak0Var, null);
        }
        if (l3k0Var instanceof k2k0) {
            return zz10.c(sqe.A(kak0Var, (k2k0) l3k0Var), kak0Var, null);
        }
        if (l3k0Var instanceof j2k0) {
            return zz10.c(vbe.A(kak0Var, (j2k0) l3k0Var), kak0Var, null);
        }
        if (l3k0Var instanceof p2k0) {
            return Next.h(kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -8388609, 1048575));
        }
        if (l3k0Var instanceof k3k0) {
            return lvx.A(kak0Var, (k3k0) l3k0Var);
        }
        if (l3k0Var instanceof y1k0) {
            return zz10.c(fq7.M(kak0Var), kak0Var, null);
        }
        if (l3k0Var instanceof x1k0) {
            return zz10.c(c97.y(kak0Var, (x1k0) l3k0Var), kak0Var, null);
        }
        if (l3k0Var instanceof w2k0) {
            return zz10.c(mym.p(kak0Var, (w2k0) l3k0Var), kak0Var, null);
        }
        if (l3k0Var instanceof m2k0) {
            return zz10.c(upf.m(kak0Var), kak0Var, null);
        }
        if (l3k0Var instanceof h4k0) {
            h4k0 h4k0Var = (h4k0) l3k0Var;
            Next nextY = exd0.y(kak0Var, h4k0Var);
            if (h4k0Var.d) {
                return zz10.e(nextY, kak0Var);
            }
            return !h4k0Var.c ? zz10.c(nextY, kak0Var, null) : nextY;
        }
        if (l3k0Var instanceof c2k0) {
            return zz10.f(lcc.H(kak0Var, (c2k0) l3k0Var));
        }
        if (l3k0Var instanceof q3k0) {
            return Next.a(Collections.singleton(new d1k0(kak0Var.b == dbk0.b ? r3u.a : !kak0Var.d ? k3u.a : m3u.a)));
        }
        if (l3k0Var instanceof g3k0) {
            return yto.v(kak0Var);
        }
        if (l3k0Var instanceof u3k0) {
            u3k0 u3k0Var = (u3k0) l3k0Var;
            return Next.a(Collections.singleton(new s0k0(u3k0Var.a, u3k0Var.b, u3k0Var.c, u3k0Var.d)));
        }
        if (l3k0Var instanceof x3k0) {
            x3k0 x3k0Var = (x3k0) l3k0Var;
            ruq0 ruq0Var2 = lhg1Var2.b;
            if (u890.j(x3k0Var.a, ruq0Var2.b)) {
                String str5 = x3k0Var.b;
                if (str5 == null) {
                    str5 = "";
                }
                if (str5.equals(ruq0Var2.h)) {
                    return Next.j();
                }
            }
            String str6 = ruq0Var2.a;
            String str7 = x3k0Var.a;
            String str8 = x3k0Var.b;
            double d = ruq0Var2.R0;
            Double d2 = x3k0Var.c;
            return Next.a(Collections.singleton(new n0k0(str6, str7, str8, d, d2 != null ? d2.doubleValue() : 1.0d, kak0Var.d1, x3k0Var.d)));
        }
        boolean z5 = l3k0Var instanceof c4k0;
        giq0 giq0Var = giq0.a;
        if (z5) {
            return Next.h(kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, giq0Var, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -1, 1048574));
        }
        if (l3k0Var instanceof w3k0) {
            return zz10.c(gm50.B(kak0Var, (w3k0) l3k0Var), kak0Var, roo.a);
        }
        if (l3k0Var instanceof v3k0) {
            return Next.j();
        }
        if (l3k0Var instanceof f3k0) {
            return xto.y(kak0Var, (f3k0) l3k0Var);
        }
        if (l3k0Var instanceof o3k0) {
            o3k0 o3k0Var = (o3k0) l3k0Var;
            Next nextB = mp10.B(kak0Var, o3k0Var);
            return o3k0Var.b == 1 ? zz10.a(nextB) : nextB;
        }
        if (l3k0Var instanceof r2k0) {
            return e9k.A(kak0Var, (r2k0) l3k0Var);
        }
        if (l3k0Var instanceof s1k0) {
            s1k0 s1k0Var = (s1k0) l3k0Var;
            int iC2 = l1d.C(s1k0Var.a);
            if (iC2 == 0) {
                return Next.a(f46.S0(new k1k0[]{i0k0Var, new f0k0(lhg1Var2, s1k0Var.b)}));
            }
            if (iC2 == 1) {
                return Next.a(Collections.singleton(i0k0Var));
            }
            eg.o();
            return null;
        }
        if (l3k0Var instanceof s2k0) {
            return sok.B(kak0Var, (s2k0) l3k0Var);
        }
        if (l3k0Var instanceof c3k0) {
            return zz10.a(x1p1.t(Next.h(kak0Var), 3));
        }
        if (l3k0Var instanceof j4k0) {
            return zz10.b(pxd0.W(kak0Var, (j4k0) l3k0Var), kak0Var, new w8k0(l3k0Var, (byte) 2));
        }
        if (l3k0Var instanceof w1k0) {
            return zz10.b(m87.C(kak0Var, (w1k0) l3k0Var), kak0Var, new w8k0(l3k0Var, (byte) 3));
        }
        if (l3k0Var instanceof u2k0) {
            return zz10.b(sbl.J(kak0Var, (u2k0) l3k0Var), kak0Var, new w8k0(l3k0Var, (byte) 4));
        }
        if (l3k0Var instanceof t1k0) {
            return zz10.b(lm5.w(kak0Var, (t1k0) l3k0Var), kak0Var, new w8k0(l3k0Var, (byte) 5));
        }
        if (l3k0Var instanceof v2k0) {
            return zz10.b(brl.z(kak0Var, (v2k0) l3k0Var), kak0Var, new w8k0(l3k0Var, (byte) 6));
        }
        if (l3k0Var instanceof u1k0) {
            return zz10.b(wm5.K(kak0Var, (u1k0) l3k0Var), kak0Var, new w8k0(l3k0Var, (byte) 7));
        }
        if (l3k0Var instanceof x2k0) {
            return zz10.b(bin.J(kak0Var, (x2k0) l3k0Var), kak0Var, new w8k0(l3k0Var, (byte) 0));
        }
        if (l3k0Var instanceof v1k0) {
            return zz10.b(z47.v(kak0Var, (v1k0) l3k0Var), kak0Var, new w8k0(l3k0Var, (byte) 1));
        }
        if (l3k0Var instanceof r3k0) {
            return e130.x(kak0Var, (r3k0) l3k0Var);
        }
        if (l3k0Var instanceof z2k0) {
            return a8o.E(kak0Var, (z2k0) l3k0Var);
        }
        if (l3k0Var instanceof y2k0) {
            return nln.B(kak0Var);
        }
        if (l3k0Var instanceof o2k0) {
            return qtg.p(kak0Var, (o2k0) l3k0Var);
        }
        if (l3k0Var instanceof n2k0) {
            return Next.h(kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, giq0Var, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -1, 1048574));
        }
        if (l3k0Var instanceof d3k0) {
            return apo.z(kak0Var);
        }
        if (l3k0Var instanceof r1k0) {
            return jm5.s(kak0Var, (r1k0) l3k0Var);
        }
        if (l3k0Var instanceof e3k0) {
            return pqo.q(kak0Var);
        }
        if (l3k0Var instanceof i3k0) {
            i3k0 i3k0Var = (i3k0) l3k0Var;
            Next nextK = d1u.K(kak0Var, i3k0Var);
            return i3k0Var.a == 1 ? zz10.a(nextK) : nextK;
        }
        if (l3k0Var instanceof z1k0) {
            return tx9.w(kak0Var, (z1k0) l3k0Var);
        }
        if (l3k0Var instanceof a2k0) {
            return kbb.L(kak0Var);
        }
        if (l3k0Var instanceof h3k0) {
            return rwq.u(kak0Var);
        }
        if (l3k0Var instanceof y3k0) {
            return tm80.I(kak0Var);
        }
        if (l3k0Var instanceof z3k0) {
            return hr80.C(kak0Var, (z3k0) l3k0Var);
        }
        if (l3k0Var instanceof b4k0) {
            return zz10.c(t890.v(kak0Var, (b4k0) l3k0Var), kak0Var, null);
        }
        if (l3k0Var instanceof a4k0) {
            pdm0 pdm0Var = kak0Var.e;
            odm0 odm0Var = pdm0Var instanceof odm0 ? (odm0) pdm0Var : null;
            if (odm0Var == null) {
                return Next.j();
            }
            a4k0 a4k0Var = (a4k0) l3k0Var;
            return Next.h(kak0.a(kak0Var, new odm0(a4k0Var.a, a4k0Var.c, odm0Var.a, odm0Var.b, odm0Var.c, a4k0Var.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, 0L, null, null, -17, 1048575));
        }
        if (l3k0Var instanceof b2k0) {
            return zz10.c(t0c.u(kak0Var, (b2k0) l3k0Var), kak0Var, null);
        }
        if (l3k0Var instanceof t2k0) {
            return Next.a(Collections.singleton(new p0k0(((t2k0) l3k0Var).a)));
        }
        if (l3k0Var instanceof n3k0) {
            return Next.a(Collections.singleton(i0k0Var));
        }
        eg.o();
        return null;
    }
}
