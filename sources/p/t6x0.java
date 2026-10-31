package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class t6x0 implements Update {
    /* JADX WARN: Code duplicated, block: B:187:0x0394  */
    /* JADX WARN: Code duplicated, block: B:189:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:226:0x0429  */
    /* JADX WARN: Code duplicated, block: B:228:0x0432  */
    public final Next a(Object obj, Object obj2) {
        j4x0 b5x0Var;
        j4x0 a5x0Var;
        e5x0 y4x0Var;
        z6x0 z6x0Var = (z6x0) obj;
        q6x0 q6x0Var = (q6x0) obj2;
        boolean z = z6x0Var.t;
        String str = z6x0Var.Z;
        int i = z6x0Var.X;
        String str2 = z6x0Var.g;
        wbk1 wbk1Var = z6x0Var.Y;
        m3x0 m3x0Var = z6x0Var.a;
        Boolean bool = z6x0Var.f;
        boolean z2 = false;
        if (q6x0Var instanceof a6x0) {
            m3x0 m3x0Var2 = ((a6x0) q6x0Var).a;
            boolean z3 = m3x0Var2.c1;
            if (z3) {
                bool = m3x0Var2.d1;
            }
            if (z3) {
                str2 = m3x0Var2.e1;
            }
            z6x0 z6x0VarE = y6x0.e(z6x0.a(z6x0Var, m3x0Var2, false, false, false, false, bool, str2, false, false, false, 0, 1950));
            m3x0 m3x0Var3 = z6x0VarE.a;
            wbk1 wbk1Var2 = z6x0VarE.Y;
            wbk1 wbk1Var3 = wbk1.b;
            if (wbk1Var2 == wbk1Var3 && z6x0VarE.X == 1 && m3x0Var3.c1 && m3x0Var3.a.length() > 0 && m3x0Var3.b.length() > 0) {
                z2 = true;
            }
            if (z2) {
                z6x0VarE = z6x0.a(z6x0VarE, null, false, false, false, false, null, null, false, false, false, 2, 1023);
            }
            m3x0 m3x0Var4 = z6x0VarE.a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (z6x0VarE.Y == wbk1Var3) {
                boolean z4 = m3x0Var4.c1;
                String str3 = m3x0Var4.b;
                String str4 = m3x0Var4.a;
                if (!z4 && !m3x0Var4.X.b && z6x0VarE.f == null && str4.length() > 0 && str3.length() > 0) {
                    linkedHashSet.add(new i4x0(str3, str4));
                }
            }
            if (z2) {
                linkedHashSet.add(new l4x0(m3x0Var4.b, m3x0Var4.a));
            }
            return linkedHashSet.isEmpty() ? Next.h(z6x0VarE) : Next.i(z6x0VarE, linkedHashSet);
        }
        boolean z5 = q6x0Var instanceof o6x0;
        wbk1 wbk1Var4 = wbk1.a;
        if (z5) {
            return wbk1Var == wbk1Var4 ? Next.a(Effects.a(new p4x0[]{new p4x0(y6x0.f(z6x0Var))})) : Next.j();
        }
        if (q6x0Var instanceof c6x0) {
            return Next.a(Effects.a(new p4x0[]{new p4x0(y6x0.f(z6x0Var))}));
        }
        if (q6x0Var instanceof n6x0) {
            return Next.a(Effects.a(new s4x0[]{new s4x0(((n6x0) q6x0Var).a)}));
        }
        if (q6x0Var instanceof d6x0) {
            return jo31.e(z6x0Var, new g1x0(z6x0Var, (d6x0) q6x0Var, (byte) 3));
        }
        if (q6x0Var instanceof l6x0) {
            return jo31.e(z6x0Var, new x6x0(z6x0Var, (byte) 2));
        }
        boolean z6 = q6x0Var instanceof k6x0;
        wbk1 wbk1Var5 = wbk1.c;
        if (z6) {
            if (wbk1Var == wbk1Var5 || !z || !u890.j(bool, Boolean.TRUE)) {
                return Next.j();
            }
            if (i == 4) {
                return Next.i(y6x0.e(z6x0.a(z6x0Var, null, false, false, false, false, null, null, false, false, false, 5, 1023)), Collections.singleton(new h4x0(m3x0Var.b, m3x0Var.a)));
            }
            return i != 3 ? Next.j() : Next.a(Effects.a(new i541[]{new e5x0(m3x0Var.O0, m3x0Var.a, m3x0Var.b, z6x0Var.Z, m3x0Var.d)}));
        }
        if (q6x0Var instanceof i6x0) {
            return (z && u890.j(bool, Boolean.TRUE) && i == 3) ? Next.i(z6x0.a(z6x0Var, null, false, false, false, false, null, null, false, false, false, 6, 1023), Collections.singleton(new u4x0(m3x0Var.b, m3x0Var.a))) : Next.j();
        }
        if (q6x0Var instanceof b6x0) {
            return wbk1Var == wbk1Var5 ? Next.j() : Next.a(Effects.a(new k4x0[]{k4x0.d}));
        }
        if (q6x0Var instanceof g6x0) {
            return jo31.e(z6x0Var, new x6x0(z6x0Var, (byte) 0));
        }
        if (q6x0Var instanceof h6x0) {
            return jo31.e(z6x0Var, new x6x0(z6x0Var, (byte) 1));
        }
        if (q6x0Var instanceof v5x0) {
            return Next.a(Effects.a(new o4x0[]{new o4x0(m3x0Var.a, ((v5x0) q6x0Var).a)}));
        }
        boolean z7 = q6x0Var instanceof w5x0;
        m4x0 m4x0Var = m4x0.d;
        if (z7) {
            return Next.a(Effects.a(new m4x0[]{m4x0Var}));
        }
        if (q6x0Var instanceof z5x0) {
            return jo31.e(z6x0Var, new g1x0(z6x0Var, (z5x0) q6x0Var, (byte) 2));
        }
        if (q6x0Var instanceof y5x0) {
            y5x0 y5x0Var = (y5x0) q6x0Var;
            return Next.h(y6x0.g(z6x0.a(z6x0Var, null, false, false, false, false, Boolean.valueOf(y5x0Var.a), y5x0Var.b, false, false, false, 0, 1951)));
        }
        if (q6x0Var instanceof x5x0) {
            x5x0 x5x0Var = (x5x0) q6x0Var;
            Boolean bool2 = x5x0Var.a;
            String str5 = x5x0Var.e;
            if (bool2 != null) {
                bool = bool2;
            }
            z6x0 z6x0VarG = y6x0.g(z6x0.a(z6x0Var, null, false, false, false, false, bool, str5 == null ? str2 : str5, false, false, false, 0, 1951));
            Boolean bool3 = z6x0VarG.f;
            if (z6x0VarG.t && u890.j(bool3, Boolean.TRUE) && z6x0VarG.X == 3) {
                m3x0 m3x0Var5 = z6x0VarG.a;
                y4x0Var = new e5x0(m3x0Var5.O0, m3x0Var5.a, m3x0Var5.b, z6x0VarG.Z, m3x0Var5.d);
            } else {
                y4x0Var = u890.j(bool3, Boolean.TRUE) ? new y4x0(x5x0Var.b, str5, x5x0Var.d) : new a5x0(x5x0Var.c);
            }
            return Next.i(z6x0VarG, Collections.singleton(y4x0Var));
        }
        if (q6x0Var instanceof p6x0) {
            return wbk1Var == wbk1Var4 ? Next.a(Effects.a(new p4x0[]{new p4x0(y6x0.f(z6x0Var))})) : Next.j();
        }
        if (q6x0Var instanceof m6x0) {
            return Next.a(Effects.a(new m4x0[]{m4x0Var}));
        }
        if (q6x0Var instanceof e6x0) {
            a530 a530Var = ((e6x0) q6x0Var).a;
            return a530Var instanceof a530 ? Next.a(Effects.a(new z4x0[]{new z4x0(a530Var)})) : Next.j();
        }
        j4x0 j4x0Var = null;
        if (q6x0Var instanceof f6x0) {
            f6x0 f6x0Var = (f6x0) q6x0Var;
            int iC = l1d.C(f6x0Var.a);
            if (iC == 0) {
                a5x0Var = new a5x0(str);
            } else {
                if (iC != 1) {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    if ((z && u890.j(bool, Boolean.TRUE) && i == 3) || m3x0Var.Z0) {
                        a5x0Var = new j4x0(m3x0Var.b, m3x0Var.a, str, f6x0Var.b);
                    }
                    return j4x0Var != null ? Next.a(Effects.a(new i541[]{j4x0Var})) : Next.j();
                }
                a5x0Var = new h5x0(str);
            }
            j4x0Var = a5x0Var;
            if (j4x0Var != null) {
            }
        }
        if (!(q6x0Var instanceof j6x0)) {
            eg.o();
            return null;
        }
        j6x0 j6x0Var = (j6x0) q6x0Var;
        if (!u890.j(j6x0Var.a, m3x0Var.a)) {
            return Next.j();
        }
        int i2 = j6x0Var.b;
        String str6 = j6x0Var.c;
        String str7 = str6 == null ? str2 : str6;
        if (str6 != null) {
            bool = Boolean.TRUE;
        }
        z6x0 z6x0VarE2 = y6x0.e(z6x0.a(z6x0Var, null, false, false, false, false, bool, str7, false, false, false, i2, 927));
        String str8 = z6x0VarE2.g;
        String str9 = z6x0VarE2.Z;
        m3x0 m3x0Var6 = z6x0VarE2.a;
        int i3 = j6x0Var.b;
        if (i == 6 && i3 == 7) {
            b5x0Var = new d5x0(m3x0Var6.a, str9, str8);
        } else {
            if (i != 6 || i3 != 8) {
                if (i == 6 && i3 == 3) {
                    j4x0Var = c5x0.d;
                } else if (i == 5 && i3 == 8) {
                    b5x0Var = new b5x0(m3x0Var6.a, str9, str8);
                } else if (i == 5 && i3 == 4) {
                    j4x0Var = w4x0.d;
                }
                return j4x0Var != null ? Next.i(z6x0VarE2, Collections.singleton(j4x0Var)) : Next.h(z6x0VarE2);
            }
            b5x0Var = new b5x0(m3x0Var6.a, str9, str8);
        }
        j4x0Var = b5x0Var;
        if (j4x0Var != null) {
        }
    }
}
