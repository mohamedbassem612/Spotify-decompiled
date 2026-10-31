package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ur90 implements xu40 {
    public final g0l a;
    public final c9c0 b;
    public final yt91 c;
    public final zor d;
    public final tz01 e;
    public final vu60 f;
    public final i3b g;

    public ur90(g0l g0lVar, c9c0 c9c0Var, yt91 yt91Var, zor zorVar, tz01 tz01Var, vu60 vu60Var, i3b i3bVar) {
        this.a = g0lVar;
        this.b = c9c0Var;
        this.c = yt91Var;
        this.d = zorVar;
        this.e = tz01Var;
        this.f = vu60Var;
        this.g = i3bVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[PHI: r3
      0x0020: PHI (r3v6 int) = (r3v3 int), (r3v1 int) binds: [B:15:0x0029, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static qq80 c(aut autVar) {
        String str = autVar.g;
        boolean z = autVar.c;
        f0u f0uVar = autVar.d;
        int i = autVar.a;
        int i2 = 5;
        int iM = autVar.j == 3 ? 5 : yap1.m(f0uVar);
        int i3 = 6;
        if (i != 0) {
            if (z && i == 4) {
                i2 = i3;
            } else {
                int iC = l1d.C(i);
                if (iC != 0) {
                    i3 = 1;
                    if (iC == 1) {
                        i2 = i3;
                    } else if (iC == 2) {
                        i2 = 4;
                    } else if (iC != 3) {
                        eg.o();
                        return null;
                    }
                } else {
                    i2 = 3;
                }
            }
            i3 = i2;
        }
        return new qq80(str, new sq80(iM, i3));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    public final o090 a(zv31 zv31Var, int i, String str) {
        aut autVar;
        Object next;
        aut autVar2;
        o090 n090Var;
        o090 n090Var2;
        ns60 ns60Var;
        int i2;
        Object obj = zv31Var.j;
        c0a0 c0a0Var = obj instanceof c0a0 ? (c0a0) obj : null;
        if (c0a0Var != null) {
            String str2 = zv31Var.a;
            autVar = new aut(c0a0Var.e, i, c0a0Var.a, c0a0Var.d, c0a0Var.c, str2, str2, new cy31(c0a0Var.b), str, c0a0Var.h);
        } else {
            autVar = null;
        }
        Iterator it = this.a.i().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((l0l) next).d(), zv31Var.a));
        l0l l0lVar = (l0l) next;
        if (l0lVar != null) {
            int iP = l0lVar.p();
            int i3 = kr90.b;
            int iC = l1d.C(iP);
            if (iC == 0) {
                i2 = 4;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                i2 = 3;
            }
            autVar2 = new aut(i2, i, l0lVar.l(), l0lVar.getType(), l0lVar.getName(), l0lVar.j(), l0lVar.G().a, by31.a, str, 0);
        } else {
            autVar2 = null;
        }
        if (autVar2 != null) {
            autVar = autVar2;
        }
        m090 m090Var = m090.a;
        if (autVar != null) {
            os60 os60Var = (os60) d5p1.h(this.f.e).a.getValue();
            if (os60Var == null || (ns60Var = os60Var.a) == null) {
                n090Var = m090Var;
            } else {
                if (ns60Var.e != j16.a) {
                    ns60Var = null;
                }
                if (ns60Var != null && u890.j(ns60Var.c.a, autVar.f)) {
                    ou80 ou80VarB = b(autVar);
                    this.g.i(ou80VarB.a, ns60Var);
                    n090Var = new n090(ou80VarB);
                } else {
                    n090Var = m090Var;
                }
            }
            if (n090Var instanceof n090) {
                return n090Var;
            }
            if (!(n090Var instanceof m090)) {
                eg.o();
                return null;
            }
            pp90 pp90Var = (pp90) this.b.b.current().getValue();
            if (pp90Var != null) {
                np90 np90Var = pp90Var.h;
                if (np90Var.b.e || !np90Var.d) {
                    n090Var2 = m090Var;
                } else {
                    ou80 ou80VarB2 = b(autVar);
                    this.c.k(pno1.h(pp90Var.c).b, new tr90(this, pp90Var, autVar, (byte) 0), new tr90(this, pp90Var, autVar, (byte) 1));
                    n090Var2 = new n090(ou80VarB2);
                }
            } else {
                n090Var2 = m090Var;
            }
            if (n090Var2 instanceof n090) {
                return n090Var2;
            }
            if (!(n090Var2 instanceof m090)) {
                eg.o();
                return null;
            }
        }
        return m090Var;
    }

    public final ou80 b(aut autVar) {
        tz5 tz5Var = (tz5) this.e.b;
        dy31 dy31Var = autVar.h;
        String str = autVar.i;
        int i = autVar.b;
        if (!(dy31Var instanceof by31)) {
            if (dy31Var instanceof cy31) {
                return tz5Var.a(((cy31) dy31Var).a, i, c(autVar), str);
            }
            eg.o();
            return null;
        }
        String str2 = autVar.f;
        i8h1 i8h1Var = tz5Var.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-connect-menu";
        x6h1VarI.f = "6.6.0";
        x6h1VarI.g = "22.0.0";
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "connect/devicepicker");
        x6h1VarR.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        y6h1 y6h1VarA = x6h1VarR.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("connect_device", (String) null, numValueOf, str2, str));
        x6h1VarC.j = true;
        y6h1 y6h1VarA2 = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null).a;
    }

    public final yu40 getType() {
        return yu40.a;
    }
}
