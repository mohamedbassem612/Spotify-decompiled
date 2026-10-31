package p;

import android.os.Build;
import android.os.Trace;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.spotify.mobius.Next;
import com.spotify.pses.v1.proto.AuthMethod;
import com.spotify.pses.v1.proto.Authentication;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import com.spotify.pses.v1.proto.IntentLedLayout;
import com.spotify.pses.v1.proto.ValueProposition;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class hr80 {
    public static final jm a = new jm("UNDEFINED", (byte) 5);
    public static final jm b = new jm("REUSABLE_CLAIMED", (byte) 5);
    public static b180 c;
    public static b180 d;

    public static void A(List list, omv0 omv0Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (omv0Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static Object[] B(Iterable iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            t890.h(arrayList, it);
            collection = arrayList;
        }
        return collection.toArray();
    }

    public static Next C(kak0 kak0Var, z3k0 z3k0Var) {
        return ((kak0Var.e instanceof odm0) && kak0Var.f == null) ? Next.h(kak0.a(kak0Var, (pdm0) null, Boolean.valueOf(z3k0Var.a), (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -33, 1048575)) : Next.j();
    }

    public static final void a(nxb nxbVar, j2i j2iVar, b0k b0kVar, int i) {
        los losVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1322064065);
        int i2 = (x340Var.g(nxbVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                if (nxbVar == null || (losVar = nxbVar.f) == null) {
                    losVar = null;
                }
                objT = new nwb(new owb(losVar, (byte) 0), new owb(losVar, (byte) 1), new owb(losVar, (byte) 2));
                x340Var.s0(objT);
            }
            j2iVar.invoke((nwb) objT, x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(nxbVar, j2iVar, i, (byte) 18);
        }
    }

    public static final void b(boolean z, Function0 function0, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        h2c h2cVar;
        Function0 function1;
        boolean z2;
        vu30 vu30Var2 = vu30Var;
        gra graVar = een.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-317208375);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(vu30Var2) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z3) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            h2c h2cVar2 = h2c.a;
            if (z) {
                h2cVar = h2cVar2;
                function1 = function2;
                x340Var.i0(-1250202977);
                x340Var.r(false);
            } else {
                x340Var.i0(-1250776694);
                h2cVar = h2cVar2;
                function1 = function2;
                t1c.a(dug.e(h2cVar2.a(u291.h(u291.f(nim0Var, 1.0f), dsa0.m(x340Var, 2131166075)), graVar), v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.4f), new u7h(u7h.b(j, 0.75f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(j, 1.0f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
                x340Var.r(false);
            }
            if (vu30Var != null) {
                x340Var.i0(-1250144418);
                qim0 qim0VarN = anm1.N("collection_preview_show_all", h2cVar.a(nim0Var, graVar));
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0VarN, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                cvx cvxVar2 = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function1);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                c(z, function0, null, 0.0f, x340Var, i3 & 126, 4);
                vu30Var2 = vu30Var;
                z2 = true;
                us71.k((i3 >> 9) & 14, vu30Var2, x340Var, true, false);
            } else {
                vu30Var2 = vu30Var;
                x340Var.i0(-1249575723);
                c(z, function0, anm1.N("collection_preview_show_all", h2cVar.a(nim0Var, graVar)), 0.0f, x340Var, i3 & 126, 8);
                x340Var.r(false);
                z2 = true;
            }
            x340Var.r(z2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(z, function0, qim0Var, vu30Var2, i, (byte) 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void c(boolean z, Function0 function0, qim0 qim0Var, float f, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        float f2;
        boolean z2;
        b0k b0kVar2;
        qim0 qim0Var3;
        float f3;
        h311 h311VarV;
        qim0 qim0Var4;
        float f4;
        int i4;
        String strO0;
        gdx gdxVarS;
        jdx jdxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2056652150);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    f2 = f;
                    int i6 = b0kVar3.d(f2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    f2 = f;
                }
                i3 |= i6;
            } else {
                f2 = f;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b0kVar3.Y(i3 & 1, z2)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if (i5 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(b0kVar3).b;
                        qim0Var2 = qim0Var4;
                        f4 = 16.0f;
                    } else {
                        qim0Var2 = qim0Var4;
                    }
                    b0kVar3.s();
                    if (z) {
                        i4 = 2131958273;
                    } else {
                        i4 = 2131958272;
                    }
                    strO0 = cwl1.o0(b0kVar3, i4);
                    gdxVarS = yla.s(b0kVar3);
                    jdxVar = jdx.c;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    b0kVar2 = b0kVar3;
                    foo1.c(new gbx(new y50(strO0), function0), jdxVar, uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, f4, 7), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1843046635, new ps00(strO0, (byte) 22), b0kVar3), b0kVar2, 0, 48, 2008);
                    qim0Var3 = qim0Var2;
                    f3 = f4;
                } else {
                    b0kVar3.b0();
                }
                f4 = f2;
                b0kVar3.s();
                if (z) {
                    i4 = 2131958273;
                } else {
                    i4 = 2131958272;
                }
                strO0 = cwl1.o0(b0kVar3, i4);
                gdxVarS = yla.s(b0kVar3);
                jdxVar = jdx.c;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(strO0), function0), jdxVar, uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, f4, 7), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1843046635, new ps00(strO0, (byte) 22), b0kVar3), b0kVar2, 0, 48, 2008);
                qim0Var3 = qim0Var2;
                f3 = f4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                f3 = f2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new of40(z, function0, qim0Var3, f3, i, i2);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f2 = f;
                if (b0kVar3.d(f2)) {
                }
                i3 |= i6;
            } else {
                f2 = f;
            }
            i3 |= i6;
        } else {
            f2 = f;
        }
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b0kVar3.Y(i3 & 1, z2)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(b0kVar3).b;
                    qim0Var2 = qim0Var4;
                    f4 = 16.0f;
                } else {
                    qim0Var2 = qim0Var4;
                    f4 = f2;
                }
            } else {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar3 = cbx.b(b0kVar3).b;
                    qim0Var2 = qim0Var4;
                    f4 = 16.0f;
                } else {
                    qim0Var2 = qim0Var4;
                    f4 = f2;
                }
            }
            b0kVar3.s();
            if (z) {
                i4 = 2131958273;
            } else {
                i4 = 2131958272;
            }
            strO0 = cwl1.o0(b0kVar3, i4);
            gdxVarS = yla.s(b0kVar3);
            jdxVar = jdx.c;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(new y50(strO0), function0), jdxVar, uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, f4, 7), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1843046635, new ps00(strO0, (byte) 22), b0kVar3), b0kVar2, 0, 48, 2008);
            qim0Var3 = qim0Var2;
            f3 = f4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            f3 = f2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new of40(z, function0, qim0Var3, f3, i, i2);
        }
    }

    public static final void d(qim0 qim0Var, float f, long j, b0k b0kVar, final int i, final int i2) {
        int i3;
        long jE;
        final float f2;
        float f3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            jE = j;
            i3 |= ((i2 & 4) == 0 && x340Var.f(jE)) ? 256 : 128;
        } else {
            jE = j;
        }
        boolean z = true;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if (i4 != 0) {
                    qim0Var = nim0.a;
                }
                f3 = i5 != 0 ? 1.0f : f;
                if ((i2 & 4) != 0) {
                    jE = eah.e(x340Var, 25);
                    i3 &= -897;
                }
            } else {
                x340Var.b0();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                f3 = f;
            }
            x340Var.s();
            qim0 qim0VarH = u291.h(u291.f(qim0Var, 1.0f), f3);
            boolean z2 = (i3 & 112) == 32;
            if ((((i3 & 896) ^ 384) <= 256 || !x340Var.f(jE)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new jmu(f3, jE);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarH);
            f2 = f3;
        } else {
            x340Var.b0();
            f2 = f;
        }
        final qim0 qim0Var2 = qim0Var;
        final long j2 = jE;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.lmu
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hr80.d(qim0Var2, f2, j2, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void e(i091 i091Var, yqg yqgVar, qim0 qim0Var, b0k b0kVar, int i) {
        drr0 drr0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1992049661);
        int i2 = i | (x340Var.i(i091Var) ? 4 : 2) | (x340Var.g(yqgVar) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var2 = (drr0) objT;
            o091 o091Var = i091Var.h;
            Long lValueOf = Long.valueOf(i091Var.d);
            Long lValueOf2 = Long.valueOf(i091Var.e);
            boolean zI = x340Var.i(i091Var) | x340Var.i(drr0Var2) | ((((i2 & 112) ^ 48) > 32 && x340Var.g(yqgVar)) || (i2 & 48) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                drr0Var = drr0Var2;
                gmy gmyVar = new gmy(i091Var, yqgVar, drr0Var, (lnm) null, (byte) 1);
                x340Var.s0(gmyVar);
                objT2 = gmyVar;
            } else {
                drr0Var = drr0Var2;
            }
            qxd0.r(o091Var, lValueOf, lValueOf2, (vu30) objT2, x340Var);
            float fS = drr0Var.s();
            uwr uwrVar = cbx.a;
            xto1.f(fS, 5, ((i2 >> 3) & 112) | 384, 16, cbx.a(x340Var).b.a, 0L, x340Var, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(i091Var, yqgVar, qim0Var, i, (byte) 27);
        }
    }

    public static final void f(o8a1 o8a1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        k8a1 k8a1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-991941435);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(o8a1Var) : x340Var.i(o8a1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (o8a1Var.b) {
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarN = anm1.N("lyrics-song-dna-credits", uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
                qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.c, 7);
                avw0 avw0Var = cbx.b(x340Var).c;
                op71.g(x340Var, anm1.N("SongDNALyricsCreditsDivider", dug.f(u291.h(qim0VarB, 1.0f), cbx.a(x340Var).a.b.a(), d4o1.a)));
                i(o8a1Var.a, iu30Var, x340Var, i2 & 112);
                x340Var.r(true);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    k8a1Var = new k8a1(o8a1Var, iu30Var, i, (byte) 0);
                }
            }
            h311VarV.d = k8a1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            k8a1Var = new k8a1(o8a1Var, iu30Var, i, (byte) 1);
            h311VarV.d = k8a1Var;
        }
    }

    public static final void g(n8a1 n8a1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0VarX;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1985926354);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(n8a1Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            if (function0 != null && (qim0VarX = bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, function0, 15)) != null) {
                qim0VarF = qim0VarX;
            }
            qim0 qim0VarN = anm1.N("SongDNALyricsCreditsWriterRow", qim0VarF);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str = n8a1Var.a;
            ArrayList arrayList = n8a1Var.b;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).k;
            long j = cbx.a(x340Var).b.b;
            cjc0 cjc0Var = new cjc0(1);
            qim0 qim0Var3 = nim0.a;
            uwo1.e(str, anm1.N("SongDNALyricsCreditsWriterName", qim0Var3), lee1Var, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1712);
            if (arrayList.isEmpty()) {
                qim0Var2 = qim0Var3;
                x340Var.i0(-1649324106);
                x340Var.r(false);
            } else {
                x340Var.i0(-1649683768);
                qim0Var2 = qim0Var3;
                uwo1.e(o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62), anm1.N("SongDNALyricsCreditsWriterRoles", qim0Var3), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1712);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (function0 != null) {
                x340Var.i0(-1716048199);
                plx plxVar = plx.c;
                long j2 = cbx.a(x340Var).b.b;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(plxVar, isl.a, anm1.N("SongDNALyricsCreditsWriterChevron", u291.r(qim0Var2, 16.0f)), j2, 0L, true, x340Var, plx.d | 196656, 16);
                x340Var.r(false);
            } else {
                x340Var.i0(-1715716468);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(n8a1Var, qim0Var, function0, i, (byte) 16);
        }
    }

    public static final void h(int i, long j, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1534852205);
        int i2 = i | 6 | (x340Var.d(1.0f) ? 32 : 16) | (x340Var.f(j) ? 256 : 128);
        boolean z = true;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var = nim0.a;
            } else {
                x340Var.b0();
            }
            x340Var.s();
            qim0 qim0VarV = u291.v(u291.c(qim0Var, 1.0f), 1.0f);
            boolean z2 = (i2 & 112) == 32;
            if ((((i2 & 896) ^ 384) <= 256 || !x340Var.f(j)) && (i2 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new gc4((byte) 3, j);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarV);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ic4(qim0Var, j, i);
        }
    }

    public static final void i(List list, iu30 iu30Var, b0k b0kVar, int i) {
        Function0 function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1169093910);
        int i2 = (i & 6) == 0 ? (x340Var.i(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131957819);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, anm1.N("SongDNALyricsCreditsWrittenByHeader", nim0Var), cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.i0(-315870055);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                n8a1 n8a1Var = (n8a1) obj;
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13);
                String str = n8a1Var.c;
                if (str == null) {
                    x340Var.i0(-1676515103);
                    x340Var.r(false);
                    function0 = null;
                } else {
                    x340Var.i0(-1676515102);
                    boolean zG = ((i3 & 112) == 32) | x340Var.g(str) | x340Var.e(i4);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        objT = new wv1(iu30Var, str, i4, (byte) 24);
                        x340Var.s0(objT);
                    }
                    function0 = (Function0) objT;
                    x340Var.r(false);
                }
                g(n8a1Var, qim0VarB, function0, x340Var, 0);
                i4 = i5;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(list, iu30Var, i, (byte) 27);
        }
    }

    public static boolean j(Iterable iterable, Collection collection) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : t890.h(collection, iterable.iterator());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0020 A[RETURN] */
    public static boolean k(Iterable iterable, omv0 omv0Var) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (omv0Var.apply(it.next())) {
                if (i != -1) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return true;
        }
        return false;
    }

    public static void l(String str) {
        Trace.beginSection(str);
    }

    public static void m() {
        Trace.endSection();
    }

    public static InvocationHandler n() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, u()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static wn90 o(Iterable iterable, omv0 omv0Var) {
        iterable.getClass();
        return new wn90(iterable, omv0Var, (byte) 0);
    }

    public static ConfigurationResponse p() {
        nuk nukVarS = ConfigurationResponse.s();
        ht80 ht80VarS = IntentLedLayout.s();
        ij8 ij8VarS = Authentication.s();
        ch8 ch8VarQ = AuthMethod.q();
        ch8VarQ.n(eh8.c);
        fh8 fh8Var = fh8.d;
        ch8VarQ.q(fh8Var);
        AuthMethod authMethodBuild = ch8VarQ.build();
        ch8 ch8VarQ2 = AuthMethod.q();
        ch8VarQ2.n(eh8.g);
        ch8VarQ2.q(fh8Var);
        AuthMethod authMethodBuild2 = ch8VarQ2.build();
        ch8 ch8VarQ3 = AuthMethod.q();
        ch8VarQ3.n(eh8.d);
        ch8VarQ3.q(fh8.c);
        ij8VarS.n(p7h.M(new AuthMethod[]{authMethodBuild, authMethodBuild2, ch8VarQ3.build()}));
        ht80VarS.n(ij8VarS);
        zsi1 zsi1VarP = ValueProposition.p();
        zsi1VarP.q();
        zsi1VarP.n();
        ht80VarS.q(zsi1VarP);
        nukVarS.n(ht80VarS);
        return nukVarS.build();
    }

    public static Object q(AbstractCollection abstractCollection, Object obj) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static Object r(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        hhg1.k();
        return null;
    }

    public static Object s(t380 t380Var) {
        Iterator it = t380Var.iterator();
        if (it.hasNext()) {
            return t890.o(it);
        }
        return null;
    }

    public static List t() {
        return Collections.singletonList(rc11.a.b(u2n.class));
    }

    public static ClassLoader u() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ph5.F();
        }
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null).getClass().getClassLoader();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            eg.j(e);
            return null;
        }
    }

    public static boolean v(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final void w(Object obj, lnm lnmVar) {
        if (!(lnmVar instanceof vfu)) {
            lnmVar.resumeWith(obj);
            return;
        }
        xfu xfuVar = (vfu) lnmVar;
        q8n q8nVar = ((vfu) xfuVar).d;
        onm onmVar = ((vfu) xfuVar).e;
        Object objR = uap1.r(obj);
        if (y(q8nVar, onmVar.getContext())) {
            ((vfu) xfuVar).f = objR;
            xfuVar.c = 1;
            x(q8nVar, onmVar.getContext(), xfuVar);
            return;
        }
        ab00 ab00VarA = jge1.a();
        if (ab00VarA.V()) {
            ((vfu) xfuVar).f = objR;
            xfuVar.c = 1;
            ab00VarA.R(xfuVar);
            return;
        }
        ab00VarA.T(true);
        try {
            faa0 faa0VarA = onmVar.getContext().A(fkj0.W0);
            if (faa0VarA == null || faa0VarA.isActive()) {
                Object obj2 = ((vfu) xfuVar).g;
                o8n context = onmVar.getContext();
                Object objW = flo1.w(context, obj2);
                fhh1 fhh1VarU = objW != flo1.a ? ulo1.u(onmVar, context, objW) : null;
                try {
                    onmVar.resumeWith(obj);
                    if (fhh1VarU == null || fhh1VarU.C0()) {
                        flo1.p(context, objW);
                    }
                } catch (Throwable th) {
                    if (fhh1VarU == null || fhh1VarU.C0()) {
                        flo1.p(context, objW);
                    }
                    throw th;
                }
            } else {
                xfuVar.resumeWith(new m231(faa0VarA.g()));
            }
            while (ab00VarA.Z()) {
            }
        } catch (Throwable th2) {
            try {
                xfuVar.g(th2);
            } finally {
                ab00VarA.N(true);
            }
        }
    }

    public static final void x(q8n q8nVar, o8n o8nVar, Runnable runnable) {
        try {
            q8nVar.h(o8nVar, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, q8nVar, o8nVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.DispatchException */
    public static final boolean y(q8n q8nVar, o8n o8nVar) throws DispatchException {
        try {
            return q8nVar.J(o8nVar);
        } catch (Throwable th) {
            throw new DispatchException(th, q8nVar, o8nVar);
        }
    }

    public static yn90 z(int i, Collection collection) {
        dm5.n(i >= 0, "number to skip cannot be negative");
        return new yn90(i, collection);
    }
}
