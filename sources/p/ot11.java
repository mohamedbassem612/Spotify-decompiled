package p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ot11 {
    public static final m a = new m((byte) 16);
    public static b180 b;

    public static final int A(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iQ = u890.q(((bc90) list.get(i3)).b, i);
            if (iQ < 0) {
                i2 = i3 + 1;
            } else {
                if (iQ <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static g3d0 B(String str, g3d0 g3d0Var) {
        z2d0 z2d0Var = null;
        if (g3d0Var instanceof z2d0) {
            z2d0 z2d0Var2 = (z2d0) g3d0Var;
            String str2 = z2d0Var2.b;
            String str3 = z2d0Var2.a;
            z2d0 z2d0Var3 = new z2d0(str3, str2, false);
            if (str.equals(O(z2d0Var3))) {
                g3d0Var = z2d0Var3;
            } else {
                if (str.equals(O(new z2d0(str3, str2, true)))) {
                    z2d0Var = new z2d0(str3, str2, true);
                }
                g3d0Var = z2d0Var;
            }
        } else if (!(g3d0Var instanceof a3d0) || !str.equals(O((a3d0) g3d0Var))) {
            g3d0Var = z2d0Var;
        }
        if (g3d0Var != null) {
            return g3d0Var;
        }
        boolean zR = nhc1.R(str, " REVERSE", false);
        String strJ0 = ihc1.J0(str, " REVERSE");
        int iHashCode = strJ0.hashCode();
        u2d0 u2d0Var = u2d0.a;
        switch (iHashCode) {
            case -2112490667:
                if (strJ0.equals("artist.name.asc")) {
                    return t2d0.a;
                }
                return u2d0Var;
            case -1992012396:
                if (strJ0.equals("duration")) {
                    return new w2d0(zR);
                }
                return u2d0Var;
            case -1982576430:
                if (strJ0.equals("artist.name")) {
                    return new s2d0(zR);
                }
                return u2d0Var;
            case -1948766500:
                if (strJ0.equals("show.name")) {
                    return new e3d0(zR);
                }
                return u2d0Var;
            case -1148582130:
                if (strJ0.equals("addTime")) {
                    return new m2d0(zR);
                }
                return u2d0Var;
            case -1148081801:
                if (strJ0.equals("addedBy")) {
                    return new o2d0(zR);
                }
                return u2d0Var;
            case -891624790:
                if (strJ0.equals("album.name")) {
                    return new q2d0(zR);
                }
                return u2d0Var;
            case -741584941:
                if (strJ0.equals("album.artist.name")) {
                    return new p2d0(zR);
                }
                return u2d0Var;
            case -615128739:
                if (strJ0.equals("publishDate")) {
                    return new c3d0(zR);
                }
                return u2d0Var;
            case -407924418:
                if (strJ0.equals("discNumber")) {
                    return new v2d0(zR);
                }
                return u2d0Var;
            case -146970255:
                if (strJ0.equals("addTime.desc")) {
                    return n2d0.a;
                }
                return u2d0Var;
            case 0:
                strJ0.equals("");
                return u2d0Var;
            case 3373707:
                if (strJ0.equals("name")) {
                    return new x2d0(zR);
                }
                return u2d0Var;
            case 1112560756:
                if (strJ0.equals("trackNumber")) {
                    return new f3d0(zR);
                }
                return u2d0Var;
            case 1208738093:
                if (strJ0.equals("album.name.asc")) {
                    return r2d0.a;
                }
                return u2d0Var;
            case 1839440014:
                if (strJ0.equals("name.asc")) {
                    return y2d0.a;
                }
                return u2d0Var;
            default:
                return u2d0Var;
        }
    }

    public static final Object C(Object obj, Object obj2, Object obj3) {
        yea0 yea0Var = obj instanceof yea0 ? (yea0) obj : null;
        if (yea0Var == null) {
            return null;
        }
        Object obj4 = yea0Var.b;
        Object obj5 = yea0Var.a;
        if (u890.j(obj5, obj2) && u890.j(obj4, obj3)) {
            return obj;
        }
        Object objC = C(obj5, obj2, obj3);
        return objC == null ? C(obj4, obj2, obj3) : objC;
    }

    public static String D(String str, d3d0 d3d0Var) {
        return str.concat(d3d0Var.a() ? " REVERSE" : "");
    }

    public static int E(int i) {
        return i >>> 3;
    }

    public static int F(int i) {
        return i & 7;
    }

    public static final wcm G(uv11 uv11Var) {
        return new wcm(uv11Var.a, nik1.z0.a, (String) null, (ucm) null, (Function0) null, w0n0.P0, false, (String) null, (String) null, 988);
    }

    public static c380 H(c380 c380Var) {
        eql eqlVar;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            plf1 plf1Var = (plf1) it.next();
            String str = plf1Var.f;
            int i = plf1Var.G;
            boolean z = plf1Var.u;
            boolean z2 = plf1Var.t;
            boolean z3 = i != 3 && z;
            boolean zF = o0c.F(i, z2, z2);
            if (z3) {
                eqlVar = eql.b;
            } else {
                eqlVar = zF ? fql.b : gql.b;
            }
            Uri uri = null;
            if (!(eqlVar instanceof gql)) {
                str = null;
            }
            if (str != null) {
                uri = Uri.parse(str);
            }
            arrayList.add(uri);
        }
        return mqo1.A(arrayList);
    }

    public static boolean I(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }

    public static int J(int i, int i2) {
        return (i << 3) | i2;
    }

    public static final mnv0 K(j7y j7yVar) {
        j7yVar.getClass();
        return new mnv0(j7yVar.a);
    }

    public static final void L(hf91 hf91Var, int i, Object obj) {
        int iG = hf91Var.g(i);
        Object[] objArr = hf91Var.c;
        Object obj2 = objArr[iG];
        objArr[iG] = fkj0.X;
        if (obj == obj2) {
            return;
        }
        g0k.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static final r9x M(z6x0 z6x0Var, Context context) {
        l1x0 l1x0Var;
        if (z6x0Var.a.W0) {
            l1x0Var = l1x0.g;
        } else {
            l1x0Var = z6x0Var.Y == wbk1.a ? l1x0.Editable : l1x0.f;
        }
        boolean z = l1x0Var.d;
        String string = context.getString(l1x0Var.a);
        Integer num = l1x0Var.b;
        String string2 = num != null ? context.getString(num.intValue()) : null;
        if (string2 == null) {
            string2 = "";
        }
        Integer num2 = l1x0Var.c;
        String string3 = num2 != null ? context.getString(num2.intValue()) : null;
        return new r9x(string, string2, string3 != null ? string3 : "", z);
    }

    public static final i04 N(f04 f04Var, Boolean bool) {
        if (f04Var instanceof d04) {
            return new g04();
        }
        if (f04Var instanceof e04) {
            e04 e04Var = (e04) f04Var;
            return new h04(e04Var.a, e04Var.b, e04Var.d, e04Var.e, bool != null ? bool.booleanValue() : false);
        }
        eg.o();
        return null;
    }

    public static String O(g3d0 g3d0Var) {
        if (g3d0Var instanceof u2d0) {
            return "";
        }
        if (g3d0Var instanceof y2d0) {
            return "name.asc";
        }
        if (g3d0Var instanceof n2d0) {
            return "addTime.desc";
        }
        if (g3d0Var instanceof r2d0) {
            return "album.name.asc";
        }
        if (g3d0Var instanceof t2d0) {
            return "artist.name.asc";
        }
        if (g3d0Var instanceof x2d0) {
            return D("name", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof o2d0) {
            return D("addedBy", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof m2d0) {
            return D("addTime", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof w2d0) {
            return D("duration", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof e3d0) {
            return D("show.name", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof q2d0) {
            return D("album.name", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof s2d0) {
            return D("artist.name", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof v2d0) {
            return D("discNumber", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof c3d0) {
            return D("publishDate", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof f3d0) {
            return D("trackNumber", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof p2d0) {
            return D("album.artist.name", (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof z2d0) {
            return D(l1d.m("provided.", ((z2d0) g3d0Var).b), (d3d0) g3d0Var);
        }
        if (g3d0Var instanceof a3d0) {
            return l1d.m("providedNonReversible.", ((a3d0) g3d0Var).b);
        }
        eg.o();
        return null;
    }

    public static final Integer P(p1v p1vVar, p1v p1vVar2) {
        if (!p1vVar.equals(m1v.a) && !p1vVar.equals(f1v.a)) {
            h1v h1vVar = h1v.a;
            boolean zEquals = p1vVar.equals(h1vVar);
            n1v n1vVar = n1v.a;
            if (!zEquals) {
                boolean zEquals2 = p1vVar.equals(n1vVar);
                l1v l1vVar = l1v.a;
                if (!zEquals2) {
                    boolean z = p1vVar instanceof k1v;
                    i1v i1vVar = i1v.a;
                    if (z) {
                        if (p1vVar2.equals(h1vVar)) {
                            return 2131886105;
                        }
                        if (p1vVar2.equals(i1vVar)) {
                            return 2131886106;
                        }
                        if (p1vVar2.equals(l1vVar)) {
                            return 2131886107;
                        }
                    } else if (p1vVar.equals(i1vVar)) {
                        if (p1vVar2.equals(h1vVar)) {
                            return 2131886102;
                        }
                    } else {
                        if (!p1vVar.equals(l1vVar)) {
                            eg.o();
                            return null;
                        }
                        if (p1vVar2.equals(h1vVar)) {
                            return 2131886108;
                        }
                    }
                } else {
                    if (p1vVar2.equals(h1vVar)) {
                        return 2131886110;
                    }
                    if (p1vVar2 instanceof k1v) {
                        return 2131886111;
                    }
                    if (p1vVar2.equals(l1vVar)) {
                        return 2131886112;
                    }
                }
            } else {
                if (p1vVar2 instanceof k1v) {
                    return 2131886100;
                }
                if (p1vVar2.equals(n1vVar)) {
                    return 2131886101;
                }
            }
        }
        return null;
    }

    public static final void a(dgy dgyVar, String str, String str2, boolean z, boolean z2, long j, j2i j2iVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z3;
        j2i j2iVar2;
        b0k b0kVar2;
        qim0 qim0Var2;
        Integer num = dgyVar.a;
        Integer num2 = dgyVar.b;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-277205844);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(dgyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= b0kVar3.h(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.f(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            j2iVar2 = j2iVar;
            i2 |= b0kVar3.i(j2iVar2) ? 1048576 : 524288;
        } else {
            j2iVar2 = j2iVar;
        }
        if ((i & 12582912) == 0) {
            i2 |= b0kVar3.i(function0) ? 8388608 : 4194304;
        }
        int i3 = i2 | 100663296;
        if (b0kVar3.Y(i3 & 1, (i3 & 38347923) != 38347922)) {
            float f = z2 ? 34.0f : 32.0f;
            boolean z4 = (num == null || num2 == null) ? false : true;
            float fMin = z4 ? Math.min(num.intValue() / f, num2.intValue() / 40.0f) : 1.0f;
            float fIntValue = num != null ? num.intValue() : f;
            float fIntValue2 = num2 != null ? num2.intValue() : 40.0f;
            float f2 = fMin;
            Integer num3 = dgyVar.c;
            float fIntValue3 = num3 != null ? num3.intValue() : 0.0f;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarS = u291.s(uyn1.B(qim0Var3, 0.0f, 0.0f, fIntValue3, 0.0f, 11), fIntValue, fIntValue2);
            boolean z5 = (i3 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z5 || objT == m4cVar) {
                objT = new kov(str2, (byte) 12);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarS, false, (iu30) objT);
            gra graVar = een.h;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            boolean z6 = (29360128 & i3) == 8388608;
            Object objT2 = b0kVar3.T();
            if (z6 || objT2 == m4cVar) {
                objT2 = new ivw(function0, (byte) 7);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarB, graVar, (hw61) null, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT2), (gbx) null, apo.r(402028003, new zfy(z2, f2, z4, z3, j, str, j2iVar2), b0kVar3), b0kVar2, 24624, 48, 1516);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new agy(dgyVar, str, str2, z, z2, j, j2iVar, function0, qim0Var2, i);
        }
    }

    public static final void b(a6a0 a6a0Var, yqg yqgVar, b0k b0kVar, int i) {
        yqg yqgVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1337231580);
        int i2 = (x340Var.g(a6a0Var) ? 4 : 2) | i | (x340Var.g(yqgVar) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = ((i2 << 9) & 57344) | 3078;
            yqgVar2 = yqgVar;
            h("Scanner", a6a0Var.a, a6a0Var.c, "Last write", yqgVar2, x340Var, i3);
            h("Advertiser", a6a0Var.b, a6a0Var.d, "Last received", yqgVar2, x340Var, i3);
            x340Var.r(true);
        } else {
            yqgVar2 = yqgVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(a6a0Var, yqgVar2, i, (byte) 3);
        }
    }

    public static final void c(char c, int i, boolean z, b0k b0kVar, int i2) {
        int i3;
        mmr0 mmr0Var;
        float f;
        lee1 lee1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(749726669);
        Object objL = x340Var.L();
        if ((objL instanceof Character) && c == ((Character) objL).charValue()) {
            i3 = 2;
        } else {
            x340Var.t0(Character.valueOf(c));
            i3 = 4;
        }
        int i4 = i3 | i2 | (x340Var.e(l1d.C(i)) ? 32 : 16) | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            klz0 klz0Var = (klz0) x340Var.k(llz0.a);
            int iC = l1d.C(i);
            if (iC == 0) {
                uwr uwrVar = cbx.a;
                mmr0Var = new mmr0(new u7h(((vex) zex.a.e).n), new u7h(klz0Var.a.b));
            } else if (iC == 1) {
                mmr0Var = new mmr0(new u7h(klz0Var.a.a), new u7h(klz0Var.a.c));
            } else if (iC != 2) {
                if (iC != 3) {
                    eg.o();
                    return;
                }
                uwr uwrVar2 = cbx.a;
                mmr0Var = new mmr0(new u7h(((vex) zex.a.e).n), new u7h(klz0Var.a.b));
            } else {
                mmr0Var = new mmr0(new u7h(klz0Var.a.a), new u7h(klz0Var.a.d));
            }
            long j = ((u7h) mmr0Var.a).a;
            long j2 = ((u7h) mmr0Var.b).a;
            if (z) {
                x340Var.i0(-1067157986);
                uwr uwrVar3 = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                x340Var.r(false);
                f = 16.0f;
            } else {
                x340Var.i0(-1067156101);
                uwr uwrVar4 = cbx.a;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                x340Var.r(false);
                f = 24.0f;
            }
            if (z) {
                x340Var.i0(-1067153931);
                lee1Var = cbx.d(x340Var).m;
            } else {
                x340Var.i0(-1067152903);
                lee1Var = cbx.d(x340Var).n;
            }
            x340Var.r(false);
            qim0 qim0VarF = dug.f(u291.r(nim0.a, f), j, er31.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(String.valueOf(c), (qim0) null, lee1Var, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixm0(c, i, z, i2);
        }
    }

    public static final void d(bff0 bff0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1723282508);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(bff0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            long jB = u7h.b(z4p1.e(bff0Var.d), 0.3f, 0.0f, 0.0f, 0.0f, 14);
            boolean zF = x340Var.f(jB);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                objT = new ps((byte) 12, jB);
                x340Var.s0(objT);
            }
            ujo1.d(qim0Var, (xtb0) null, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, ((i2 >> 3) & 14) | 12582912, 382);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(bff0Var, qim0Var, i, (byte) 2);
        }
    }

    public static final void e(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1213772870);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            nyx.a(2, (wux) null, apo.r(-75755321, new u2y(i, function0, z), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fou(i, z, function0, qim0Var2, i2, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(hh5 hh5Var, boolean z, boolean z2, Integer num, iu30 iu30Var, zja1 zja1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        qim0 qim0Var2;
        float f;
        Object nxVar;
        int i2;
        o95 o95Var;
        tob1 tob1Var;
        int i3;
        aka1 aka1Var;
        int i4;
        zja1 zja1Var2 = zja1Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(508723449);
        int i5 = i | (x340Var2.i(hh5Var) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.g(num) ? 2048 : 1024) | (x340Var2.i(iu30Var) ? 16384 : 8192) | (x340Var2.i(zja1Var2) ? 131072 : 65536) | 1572864;
        if (x340Var2.Y(i5 & 1, (i5 & 599187) != 599186)) {
            aka1 aka1Var2 = (aka1) x340Var2.k(bka1.a);
            if (z2) {
                x340Var2.i0(-743025695);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 6.0f;
            } else {
                x340Var2.i0(-743024383);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 8.0f;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(new d36(f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.i0(1913737678);
            List list = hh5Var.a;
            int i6 = hh5Var.b;
            int i7 = 0;
            for (Object obj : list) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    p7h.T();
                    throw null;
                }
                String str = (String) obj;
                aka1 aka1Var3 = aka1.b;
                int i9 = 800;
                if (i7 != 0) {
                    if (i7 == 1) {
                        i9 = 900;
                    } else if (i7 == 2) {
                        i9 = 1050;
                    } else if (i7 != 3) {
                        i9 = i7 != 4 ? 800 + (i7 * 300) : 1500;
                    } else {
                        i9 = 1250;
                    }
                }
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = c97.b(0.0f);
                    x340Var2.s0(objT);
                }
                o95 o95Var2 = (o95) objT;
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = c97.b(20.0f);
                    x340Var2.s0(objT2);
                }
                o95 o95Var3 = (o95) objT2;
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT3);
                }
                tob1 tob1Var2 = (ven0) objT3;
                int i10 = i7;
                n8b1 n8b1VarL0 = irn1.l0(0.8f, 400.0f, (Object) null, 4);
                boolean zE = x340Var2.e(i9) | x340Var2.i(zja1Var2) | x340Var2.i(aka1Var2) | x340Var2.i(o95Var2) | x340Var2.i(n8b1VarL0) | x340Var2.i(o95Var3) | x340Var2.i(tob1Var2);
                Object objT4 = x340Var2.T();
                if (zE || objT4 == m4cVar) {
                    i2 = 3;
                    aka1 aka1Var4 = aka1Var2;
                    zja1 zja1Var3 = zja1Var2;
                    int i11 = i9;
                    o95Var = o95Var2;
                    tob1Var = tob1Var2;
                    i3 = 1;
                    nxVar = new nx(i11, zja1Var3, aka1Var4, o95Var, n8b1VarL0, o95Var3, (ven0) tob1Var, (lnm) null);
                    aka1Var = aka1Var4;
                    o95Var3 = o95Var3;
                    x340Var2.s0(nxVar);
                } else {
                    o95Var = o95Var2;
                    nxVar = objT4;
                    tob1Var = tob1Var2;
                    i3 = 1;
                    i2 = 3;
                    aka1Var = aka1Var2;
                }
                qxd0.t(hh5Var, x340Var2, (vu30) nxVar);
                float fFloatValue = ((Number) o95Var.e()).floatValue();
                float fFloatValue2 = ((Number) o95Var3.e()).floatValue();
                boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
                ma5 ma5Var = new ma5(fFloatValue, fFloatValue2, zBooleanValue);
                if (z) {
                    i4 = i10;
                    if (i4 == i6) {
                        i2 = 2;
                    } else if (num == null || i4 != num.intValue()) {
                        i2 = 4;
                    }
                } else {
                    i4 = i10;
                    i2 = i3;
                }
                int i12 = (zBooleanValue && i2 == i3) ? i3 : 0;
                int i13 = i4 == i6 ? i3 : 0;
                boolean zG = x340Var2.g(ma5Var);
                Object objT5 = x340Var2.T();
                if (zG || objT5 == m4cVar) {
                    objT5 = new xkm0(ma5Var, (byte) 5);
                    x340Var2.s0(objT5);
                }
                qim0 qim0VarD = eqr0.D(0.0f, fFloatValue2, i3, i541.C(qim0Var3, (iu30) objT5));
                int i14 = i5 << 3;
                x340 x340Var3 = x340Var2;
                boolean z3 = i13;
                zja1Var2 = zja1Var;
                g(i4, str, z3, i2, z2, iu30Var, zja1Var2, i12, qim0VarD, x340Var3, (57344 & (i5 << 6)) | (458752 & i14) | (i14 & 3670016));
                i6 = i6;
                x340Var2 = x340Var3;
                aka1Var2 = aka1Var;
                qim0Var3 = qim0Var3;
                i7 = i8;
            }
            x340Var = x340Var2;
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(hh5Var, z, z2, num, iu30Var, zja1Var, qim0Var2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:107:0x01b3  */
    public static final void g(int i, String str, boolean z, int i2, boolean z2, iu30 iu30Var, zja1 zja1Var, boolean z3, qim0 qim0Var, b0k b0kVar, int i3) throws NoWhenBranchMatchedException {
        int i4;
        iu30 iu30Var2;
        b0k b0kVar2;
        Object objT;
        yf hdxVar;
        boolean z4;
        yf yfVar;
        boolean z5;
        gdx gdxVarP;
        float f;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(128825747);
        if ((i3 & 6) == 0) {
            i4 = (b0kVar3.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar3.e(l1d.C(i2)) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar3.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            iu30Var2 = iu30Var;
            i4 |= b0kVar3.i(iu30Var2) ? 131072 : 65536;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i3 & 1572864) == 0) {
            i4 |= b0kVar3.i(zja1Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= b0kVar3.h(z3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= b0kVar3.i(qim0Var) ? 67108864 : 33554432;
        }
        if (b0kVar3.Y(i4 & 1, (i4 & 38347923) != 38347922)) {
            klz0 klz0Var = (klz0) b0kVar3.k(llz0.a);
            aka1 aka1Var = (aka1) b0kVar3.k(bka1.a);
            yla.p(b0kVar3);
            cr31 cr31VarB = er31.b(28.0f);
            int iC = l1d.C(i2);
            if (iC == 0) {
                b0kVar3.i0(-752489527);
                objT = b0kVar3.T();
                if (objT == m4cVar) {
                    objT = dbm0.S0;
                    b0kVar3.s0(objT);
                }
                hdxVar = new hdx(0, (vu30) null, (vu30) objT, (vu30) null, cr31VarB, 11);
                z4 = false;
                b0kVar3.r(false);
                yfVar = hdxVar;
            } else if (iC == 1) {
                b0kVar3.i0(-752483851);
                boolean zI = b0kVar3.i(klz0Var);
                Object objT2 = b0kVar3.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new dae0(klz0Var, (byte) 1);
                    b0kVar3.s0(objT2);
                }
                vu30 vu30Var = (vu30) objT2;
                boolean zI2 = b0kVar3.i(klz0Var);
                Object objT3 = b0kVar3.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new dae0(klz0Var, (byte) 2);
                    b0kVar3.s0(objT3);
                }
                hdxVar = new hdx(0, vu30Var, (vu30) objT3, (vu30) null, cr31VarB, 9);
                z4 = false;
                b0kVar3.r(false);
                yfVar = hdxVar;
            } else if (iC != 2) {
                if (iC != 3) {
                    throw p3d1.k(b0kVar3, -752492457, false);
                }
                b0kVar3.i0(-752489527);
                objT = b0kVar3.T();
                if (objT == m4cVar) {
                    objT = dbm0.S0;
                    b0kVar3.s0(objT);
                }
                hdxVar = new hdx(0, (vu30) null, (vu30) objT, (vu30) null, cr31VarB, 11);
                z4 = false;
                b0kVar3.r(false);
                yfVar = hdxVar;
            } else {
                b0kVar3.i0(-752476746);
                boolean zI3 = b0kVar3.i(klz0Var);
                Object objT4 = b0kVar3.T();
                if (zI3 || objT4 == m4cVar) {
                    objT4 = new dae0(klz0Var, (byte) 3);
                    b0kVar3.s0(objT4);
                }
                vu30 vu30Var2 = (vu30) objT4;
                boolean zI4 = b0kVar3.i(klz0Var);
                Object objT5 = b0kVar3.T();
                if (zI4 || objT5 == m4cVar) {
                    objT5 = new dae0(klz0Var, (byte) 4);
                    b0kVar3.s0(objT5);
                }
                yf hdxVar2 = new hdx(0, vu30Var2, (vu30) objT5, (vu30) null, cr31VarB, 9);
                b0kVar3.r(false);
                z4 = false;
                yfVar = hdxVar2;
            }
            boolean zI5 = ((29360128 & i4) == 8388608 ? true : z4) | b0kVar3.i(zja1Var) | b0kVar3.i(aka1Var) | ((i4 & 896) == 256) | ((458752 & i4) == 131072) | ((i4 & 14) == 4);
            Object objT6 = b0kVar3.T();
            if (zI5 || objT6 == m4cVar) {
                iu30 iu30Var3 = iu30Var2;
                z5 = false;
                jxm0 jxm0Var = new jxm0(z3, zja1Var, aka1Var, z, iu30Var3, i);
                b0kVar3.s0(jxm0Var);
                objT6 = jxm0Var;
            } else {
                z5 = false;
            }
            Function0 function0 = (Function0) objT6;
            if (ihc1.y0("Select answer")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50("Select answer"), function0);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            hax haxVar = i2 == 4 ? new hax("answered") : jax.a;
            if (z2) {
                b0kVar3.i0(-752447399);
                gdxVarP = yla.r(b0kVar3);
            } else {
                b0kVar3.i0(-752446472);
                gdxVarP = yla.p(b0kVar3);
            }
            b0kVar3.r(z5);
            gdx gdxVar = gdxVarP;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            if (z2) {
                b0kVar3.i0(-752440902);
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar3.r(z5);
                f = 12.0f;
            } else {
                b0kVar3.i0(-752439625);
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                b0kVar3.r(z5);
                f = 16.0f;
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, yfVar, qim0VarF, haxVar, gdxVar, new zzq0(16.0f, f, 16.0f, f), (idn0) null, (ga80) null, apo.r(-1895715549, new rpf(i, i2, z2), b0kVar3), (vu30) null, apo.r(-1043908492, new mv8(z2, str, (byte) 5), b0kVar3), b0kVar2, 805306368, 48, 1416);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kxm0(i, str, z, i2, z2, iu30Var, zja1Var, z3, qim0Var, i3);
        }
    }

    public static final void h(String str, boolean z, Long l, String str2, yqg yqgVar, b0k b0kVar, int i) {
        int i2;
        yqg yqgVar2;
        long j;
        String strF;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1130035800);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(l) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            yqgVar2 = yqgVar;
            i2 |= x340Var.g(yqgVar2) ? 16384 : 8192;
        } else {
            yqgVar2 = yqgVar;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                x340Var.i0(-662315744);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).c.f;
            } else {
                x340Var.i0(-662314464);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).c.d;
            }
            x340Var.r(false);
            String str3 = z ? "Active" : "Inactive";
            if (l != null) {
                Date date = new Date(l.longValue());
                Date date2 = new Date(yqgVar2.b());
                Calendar calendarD = yqgVar2.d();
                calendarD.setTime(date);
                int i3 = calendarD.get(6);
                int i4 = calendarD.get(1);
                calendarD.setTime(date2);
                strF = l1d.n(": ", new SimpleDateFormat((i3 == calendarD.get(6) && i4 == calendarD.get(1)) ? "HH:mm:ss" : "MM-dd HH:mm:ss", Locale.US).format(date), gvg.n(str, ": ", str3, " - ", str2));
            } else {
                strF = f4i1.f(str, ": ", str3);
            }
            i(strF, j, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(str, z, l, str2, yqgVar, i, (byte) 22);
        }
    }

    public static final void i(String str, long j, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1289464654);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.f(j) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("social-radar-debug-info", uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13));
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            t1c.a(dug.f(i1p1.q(u291.r(nim0Var, 8.0f), er31.a), j, d4o1.a), x340Var2, 0);
            lee1 lee1Var = cbx.d(x340Var2).m;
            long j2 = cbx.a(x340Var2).b.b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            uwo1.e(str, uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i2 & 14, 0, 2032);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new icc(str, j, i, (byte) 5);
        }
    }

    public static final boolean j(int i) {
        return i != 0;
    }

    public static final ArrayList k(ze91 ze91Var, s340 s340Var) {
        ArrayList arrayList = new ArrayList();
        ye91 ye91VarF = ze91Var.f();
        try {
            y(ye91VarF, arrayList, ze91Var.b(s340Var));
            return arrayList;
        } finally {
            ye91VarF.c();
        }
    }

    public static final int l(int i, ArrayList arrayList) {
        int iA = A(i, arrayList);
        return iA < 0 ? -(iA + 1) : iA;
    }

    public static final bc90 m(ArrayList arrayList, int i, int i2) {
        int iA = A(i, arrayList);
        if (iA < 0) {
            iA = -(iA + 1);
        }
        if (iA >= arrayList.size()) {
            return null;
        }
        bc90 bc90Var = (bc90) arrayList.get(iA);
        if (bc90Var.b < i2) {
            return bc90Var;
        }
        return null;
    }

    public static final Object n(fpa0 fpa0Var) {
        Object obj = fpa0Var.b;
        int i = fpa0Var.a;
        return obj != null ? new yea0(Integer.valueOf(i), fpa0Var.b) : Integer.valueOf(i);
    }

    public static final void p(ArrayList arrayList, int i, h311 h311Var, Object obj) {
        int iA = A(i, arrayList);
        if (iA < 0) {
            int i2 = -(iA + 1);
            if (!(obj instanceof mdt)) {
                obj = null;
            }
            arrayList.add(i2, new bc90(h311Var, i, obj));
            return;
        }
        bc90 bc90Var = (bc90) arrayList.get(iA);
        if (!(obj instanceof mdt)) {
            bc90Var.c = null;
            return;
        }
        Object obj2 = bc90Var.c;
        if (obj2 == null) {
            bc90Var.c = obj;
            return;
        }
        if (obj2 instanceof oen0) {
            ((oen0) obj2).a(obj);
            return;
        }
        oen0 oen0Var = ij41.a;
        oen0 oen0Var2 = new oen0(2);
        oen0Var2.j(obj2);
        oen0Var2.j(obj);
        bc90Var.c = oen0Var2;
    }

    public static final nen0 q(int i) {
        return new nen0(i);
    }

    public static final int r(ye91 ye91Var, int i, int i2, int i3) {
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                return i3;
            }
            if (ye91Var.q(i) == i2) {
                return i2;
            }
            if (ye91Var.q(i2) != i) {
                if (ye91Var.q(i) == ye91Var.q(i2)) {
                    return ye91Var.q(i);
                }
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = ye91Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = ye91Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                for (int i7 = 0; i7 < i6; i7++) {
                    i = ye91Var.q(i);
                }
                int i8 = i5 - i4;
                for (int i9 = 0; i9 < i8; i9++) {
                    i2 = ye91Var.q(i2);
                }
                while (i != i2) {
                    i = ye91Var.q(i);
                    i2 = ye91Var.q(i2);
                }
                return i;
            }
        }
        return i;
    }

    public static final bc90 s(int i, ArrayList arrayList) {
        int iA = A(i, arrayList);
        if (iA >= 0) {
            return (bc90) arrayList.remove(iA);
        }
        return null;
    }

    public static final void t(int i, int i2, List list) {
        int iA = A(i, list);
        if (iA < 0) {
            iA = -(iA + 1);
        }
        while (iA < list.size() && ((bc90) list.get(iA)).b < i2) {
        }
    }

    public static final b440 v(b440 b440Var) {
        if (!(b440Var instanceof b440)) {
            b440Var = null;
        }
        if (b440Var != null) {
            return b440Var;
        }
        g0k.b("Inconsistent composition");
        jah.d();
        return null;
    }

    public static final af5 w(String str, hhg... hhgVarArr) {
        ArrayList arrayList = new ArrayList(hhgVarArr.length);
        for (hhg hhgVar : hhgVarArr) {
            ye5 ye5Var = new ye5();
            vhg.c(ye5Var, hhgVar.a, hhgVar.b, hhgVar.c, hhgVar.d);
            arrayList.add(ye5Var.p());
        }
        af5[] af5VarArr = (af5[]) arrayList.toArray(new af5[0]);
        af5[] af5VarArr2 = (af5[]) Arrays.copyOf(af5VarArr, af5VarArr.length);
        ye5 ye5Var2 = new ye5();
        int length = 0;
        int i = 0;
        for (af5 af5Var : af5VarArr2) {
            i++;
            String strE = gvg.e(i, "%", "$s");
            int iW0 = ihc1.w0(str, strE, length, false, 4);
            if (iW0 != -1) {
                ye5Var2.g(str.substring(length, iW0));
                ye5Var2.h(af5Var);
                length = strE.length() + iW0;
            }
        }
        if (length < str.length()) {
            ye5Var2.g(str.substring(length));
        }
        return ye5Var2.p();
    }

    public static final void x(h441 h441Var, o8n o8nVar) {
        if (((Number) o8nVar.o(0, new w9(h441Var, (byte) 21))).intValue() == h441Var.c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + h441Var.b + ",\n\t\tbut emission happened in " + o8nVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final void y(ye91 ye91Var, ArrayList arrayList, int i) {
        boolean zL = ye91Var.l(i);
        int[] iArr = ye91Var.b;
        if (zL) {
            arrayList.add(ye91Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            y(ye91Var, arrayList, i3);
        }
    }

    public static final void z(hf91 hf91Var, h72 h72Var) {
        hf91Var.m(hf91Var.t, new f14(h72Var, hf91Var, (byte) 14));
    }
}
