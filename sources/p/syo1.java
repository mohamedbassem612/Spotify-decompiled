package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class syo1 {
    public static b180 a;
    public static b180 b;

    public static boolean A(String str) {
        if (str.length() <= 512 && nhc1.Y(str, "spotify:", false) && ihc1.T0(str, ':', str).length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!eth.H(cCharAt) && !Character.isISOControl(cCharAt)) {
                }
            }
            return true;
        }
        return false;
    }

    public static pkd1 B(y341 y341Var, String str) {
        b7x b7xVarB;
        AbstractSet abstractSet;
        d441 d441VarG1 = y341Var.g1("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (d441VarG1.f1()) {
                int iM = d9y0.m(d441VarG1, "name");
                int iM2 = d9y0.m(d441VarG1, "type");
                int iM3 = d9y0.m(d441VarG1, "notnull");
                int iM4 = d9y0.m(d441VarG1, "pk");
                int iM5 = d9y0.m(d441VarG1, "dflt_value");
                xkg0 xkg0Var = new xkg0();
                do {
                    String strP0 = d441VarG1.P0(iM);
                    xkg0Var.put(strP0, new mkd1((int) d441VarG1.getLong(iM4), 2, strP0, d441VarG1.P0(iM2), d441VarG1.isNull(iM5) ? null : d441VarG1.P0(iM5), d441VarG1.getLong(iM3) != 0));
                } while (d441VarG1.f1());
                b7xVarB = xkg0Var.b();
                o0c.v(d441VarG1, (Throwable) null);
            } else {
                b7xVarB = b7x.a;
                o0c.v(d441VarG1, (Throwable) null);
            }
            d441 d441VarG2 = y341Var.g1("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iM6 = d9y0.m(d441VarG2, "id");
                int iM7 = d9y0.m(d441VarG2, "seq");
                int iM8 = d9y0.m(d441VarG2, "table");
                int iM9 = d9y0.m(d441VarG2, "on_delete");
                int iM10 = d9y0.m(d441VarG2, "on_update");
                List listT = qpn1.t(d441VarG2);
                d441VarG2.reset();
                xj61 xj61Var = new xj61();
                while (d441VarG2.f1()) {
                    if (d441VarG2.getLong(iM7) == j) {
                        int i = (int) d441VarG2.getLong(iM6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iM6;
                        ArrayList<xd30> arrayList3 = new ArrayList();
                        for (Object obj : listT) {
                            int i3 = iM7;
                            List list = listT;
                            if (((xd30) obj).a == i) {
                                arrayList3.add(obj);
                            }
                            iM7 = i3;
                            listT = list;
                        }
                        int i4 = iM7;
                        List list2 = listT;
                        for (xd30 xd30Var : arrayList3) {
                            arrayList.add(xd30Var.c);
                            arrayList2.add(xd30Var.d);
                        }
                        xj61Var.add(new nkd1(arrayList, arrayList2, d441VarG2.P0(iM8), d441VarG2.P0(iM9), d441VarG2.P0(iM10)));
                        iM6 = i2;
                        iM7 = i4;
                        listT = list2;
                        j = 0;
                    }
                }
                xj61 xj61VarJ = cwl1.j(xj61Var);
                o0c.v(d441VarG2, (Throwable) null);
                d441 d441VarG3 = y341Var.g1("PRAGMA index_list(`" + str + "`)");
                try {
                    int iM11 = d9y0.m(d441VarG3, "name");
                    int iM12 = d9y0.m(d441VarG3, "origin");
                    int iM13 = d9y0.m(d441VarG3, "unique");
                    if (iM11 == -1 || iM12 == -1 || iM13 == -1) {
                        o0c.v(d441VarG3, (Throwable) null);
                        abstractSet = null;
                    } else {
                        xj61 xj61Var2 = new xj61();
                        while (d441VarG3.f1()) {
                            if ("c".equals(d441VarG3.P0(iM12))) {
                                okd1 okd1VarU = qpn1.u(y341Var, d441VarG3.P0(iM11), d441VarG3.getLong(iM13) == 1);
                                if (okd1VarU == null) {
                                    o0c.v(d441VarG3, (Throwable) null);
                                    abstractSet = null;
                                } else {
                                    xj61Var2.add(okd1VarU);
                                }
                            }
                        }
                        AbstractSet abstractSetJ = cwl1.j(xj61Var2);
                        o0c.v(d441VarG3, (Throwable) null);
                        abstractSet = abstractSetJ;
                    }
                    return new pkd1(str, b7xVarB, xj61VarJ, abstractSet);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        o0c.v(d441VarG3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    o0c.v(d441VarG2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                o0c.v(d441VarG1, th5);
                throw th6;
            }
        }
    }

    public static Object C(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final List D(String str, List list) {
        Set set = s4b1.f;
        w7x w7xVarS0 = uic.g(str, blc0.ti) ? w7x.a : f46.S0(new o571[]{g571.d, v471.d});
        if (w7xVarS0.isEmpty()) {
            return list;
        }
        List<u771> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (u771 u771Var : list2) {
            bj71 bj71Var = u771Var.c;
            arrayList.add(u771.a(u771Var, (t771) null, (pz61) null, bj71.a(bj71Var, dm61.y0(bj71Var.a, (Iterable) w7xVarS0)), 3));
        }
        return arrayList;
    }

    public static final void a(r7x0 r7x0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z2 = z;
        iu30 iu30Var2 = iu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(433907804);
        int i2 = (i & 6) == 0 ? (x340Var.g(r7x0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 16.0f, 16.0f, 0.0f, 16.0f, 4);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-668043708);
            for (l7x0 l7x0Var : r7x0Var.f) {
                if (l7x0Var instanceof m7x0) {
                    x340Var.i0(1807862311);
                    g((m7x0) l7x0Var, z2, iu30Var2, x340Var, i3 & 1008);
                    x340Var.r(false);
                } else if (l7x0Var instanceof n7x0) {
                    x340Var.i0(1807864864);
                    h(z2, iu30Var2, x340Var, (i3 >> 3) & 126);
                    x340Var.r(false);
                } else if (l7x0Var instanceof l7x0) {
                    x340Var.i0(1807867194);
                    boolean z3 = z2;
                    f(l7x0Var, r7x0Var.b, z3, iu30Var, x340Var, (i3 << 3) & 8064);
                    z2 = z3;
                    iu30Var2 = iu30Var;
                    x340Var.r(false);
                } else if (l7x0Var instanceof k7x0) {
                    x340Var.i0(1807870448);
                    d(iu30Var2, x340Var, (i3 >> 6) & 14);
                    x340Var.r(false);
                } else if (l7x0Var instanceof o7x0) {
                    x340Var.i0(1807872532);
                    i(iu30Var2, x340Var, (i3 >> 6) & 14);
                    x340Var.r(false);
                } else {
                    if (!(l7x0Var instanceof j7x0)) {
                        throw p3d1.k(x340Var, 1807861337, false);
                    }
                    x340Var.i0(1807874628);
                    c(z2, iu30Var2, x340Var, (i3 >> 3) & 126);
                    x340Var.r(false);
                }
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y20(r7x0Var, z2, iu30Var2, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(cnc0 cnc0Var, itk0 itk0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1562323918);
        int i2 = (x340Var.i(cnc0Var) ? 4 : 2) | i | (x340Var.i(itk0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            boolean zI = x340Var.i(itk0Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new rr6(itk0Var, (byte) 27);
                x340Var.s0(objT);
            }
            q1d0 q1d0VarN = jyo1.n(xtb0VarA, cnc0Var, new h3h1((iu30) objT), x340Var, 0);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a);
            u85 u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var).g;
            } else {
                x340Var.i0(-241885792);
            }
            x340Var.r(false);
            vk80 vk80VarX = poo1.x(new bgc0(u85Var, 32), x340Var);
            boolean zI2 = x340Var.i(q1d0VarN);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new xo8(q1d0VarN, (byte) 0);
                x340Var.s0(objT2);
            }
            ujo1.d(qim0VarF, xtb0VarA, vk80VarX, false, null, null, null, false, null, (iu30) objT2, x340Var, 0, 504);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(cnc0Var, itk0Var, i, (byte) 2);
        }
    }

    public static final void c(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1047029825);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new z20(z, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), ldx.c, null, null, yla.s(x340Var), null, null, null, null, null, z2i.c, x340Var, 48, 48, 2012);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a30((byte) 0, i, iu30Var, z);
        }
    }

    public static final void d(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(905711028);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131960484);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new p1(iu30Var, (byte) 8);
                x340Var.s0(objT);
            }
            ryo1.a(0, strO0, (Function0) objT, x340Var, null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 0, i, iu30Var, false);
        }
    }

    public static final void e(String str, z2a z2aVar, qn30 qn30Var, List list, iu30 iu30Var, i8h1 i8h1Var, String str2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1508687949);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(z2aVar) : x340Var.i(z2aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qn30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(i8h1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.g(str2) ? 1048576 : 524288;
        }
        int i3 = i2 | 113246208;
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ny00.Q0;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            int length = str.length();
            qim0 qim0Var3 = nim0.a;
            if (length > 0) {
                x340Var.i0(1510519466);
                qim0 qim0VarA = o2a.a(qim0Var3);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = wo10.f;
                    x340Var.s0(objT2);
                }
                kgx kgxVar = new kgx(0, (vu30) objT2, (vu30) null, (vu30) null, 13);
                vzq0.a.getClass();
                tzq0 tzq0Var = uzq0.b;
                boolean zI = ((i3 & 57344) == 16384) | x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new wq9(iu30Var, ven0Var, (byte) 20);
                    x340Var.s0(objT3);
                }
                cwl1.b(qim0VarA, (tl3) null, d4o1.a, kgxVar, tzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT3), (gbx) null, apo.r(1759630021, new z3y(str, (byte) 5), x340Var), x340Var, 0, 48, 1506);
                x340Var.r(false);
            } else {
                x340Var.i0(1511354575);
                x340Var.r(false);
            }
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            boolean zI2 = x340Var.i(ven0Var) | ((i3 & 57344) == 16384);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new gp0(iu30Var, ven0Var, (byte) 15);
                x340Var.s0(objT4);
            }
            int i4 = i3 >> 6;
            int i5 = (i3 & 112) | (i4 & 7168) | (i4 & 57344);
            int i6 = i3 << 12;
            i0p1.d(zBooleanValue, z2aVar, (iu30) objT4, i8h1Var, str2, null, qn30Var, list, x340Var, i5 | (3670016 & i6) | (i6 & 29360128));
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(str, z2aVar, qn30Var, list, iu30Var, i8h1Var, str2, qim0Var2, i);
        }
    }

    public static final void f(l7x0 l7x0Var, String str, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(411323806);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(l7x0Var) : x340Var.i(l7x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        boolean z2 = true;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z3 = l7x0Var.a;
            boolean z4 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !x340Var.i(l7x0Var))) {
                z2 = false;
            }
            boolean z5 = z4 | z2;
            Object objT = x340Var.T();
            if (z5 || objT == fkj0.X) {
                objT = new c30(z, iu30Var, l7x0Var, (byte) 0);
                x340Var.s0(objT);
            }
            qro1.d(z3, (iu30) objT, str, null, l7x0Var.b, null, null, x340Var, (i2 << 3) & 896, 104);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(l7x0Var, str, z, iu30Var, i, (byte) 0);
        }
    }

    public static final void g(m7x0 m7x0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        hax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1214340463);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(m7x0Var) : b0kVar3.i(m7x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new z20(z, iu30Var, (byte) 1);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx();
            gdx gdxVarS = yla.s(b0kVar3);
            int i3 = m7x0Var.a;
            if (i3 == 2) {
                b0kVar3.i0(1249933596);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131960535));
                b0kVar3.r(false);
            } else if (i3 == 4) {
                b0kVar3.i0(1249939802);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131960440));
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1249944613);
                b0kVar3.r(false);
                haxVar = jax.a;
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, idxVar, uyn1.B(nim0.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), haxVar, gdxVarS, null, null, null, null, null, apo.r(-1840984304, new ab(m7x0Var, b2), b0kVar3), b0kVar2, 0, 48, 1992);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(m7x0Var, z, iu30Var, i, (byte) 0);
        }
    }

    public static final void h(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(409557464);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new z20(z, iu30Var, (byte) 2);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx();
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            foo1.c(gbxVar, idxVar, uyn1.B(nim0.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), null, gdxVarS, null, null, null, null, null, z2i.a, x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a30((byte) 1, i, iu30Var, z);
        }
    }

    public static final void i(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(88799552);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new p1(iu30Var, (byte) 9);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), ldx.c, null, null, yla.r(x340Var), null, null, null, null, null, z2i.b, x340Var, 48, 48, 2012);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 1, i, iu30Var, false);
        }
    }

    public static final void j(wxi1 wxi1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-142103886);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(wxi1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            dmx dmxVar = wxi1Var.c == 1 ? dmx.c : eox.c;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), new uvx(0, ngx.e, 0, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 501), null, false, null, null, null, null, null, apo.r(484211611, new g70(dmxVar, (byte) 13), b0kVar3), null, apo.r(764971130, new xxi1(wxi1Var, (byte) 0), b0kVar3), null, null, null, apo.r(1586191862, new xxi1(wxi1Var, (byte) 1), b0kVar3), b0kVar2, 805306432, 196656, 30204);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(wxi1Var, qim0Var2, i, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    public static final nma0 k(Class cls, nma0... nma0VarArr) {
        Object obj;
        nma0 nma0Var;
        Field field;
        Object obj2;
        nma0 nma0VarU;
        Field field2;
        if (cls.isEnum() && cls.getAnnotation(o661.class) == null && cls.getAnnotation(pcv0.class) == null) {
            return new a1z(cls.getCanonicalName(), (Enum[]) cls.getEnumConstants());
        }
        nma0[] nma0VarArr2 = (nma0[]) Arrays.copyOf(nma0VarArr, nma0VarArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        nma0 nma0VarU2 = obj == null ? null : u(obj, (nma0[]) Arrays.copyOf(nma0VarArr2, nma0VarArr2.length));
        if (nma0VarU2 != null) {
            return nma0VarU2;
        }
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null || nhc1.Y(canonicalName, "java.", false) || nhc1.Y(canonicalName, "kotlin.", false)) {
            nma0Var = null;
        } else {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            Field field3 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Field field4 = declaredFields[i];
                if (u890.j(field4.getName(), "INSTANCE") && u890.j(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                    if (!z) {
                        z = true;
                        field3 = field4;
                    }
                }
                i++;
                field3 = null;
                break;
            }
            if (field3 == null) {
                nma0Var = null;
            } else {
                Object obj3 = field3.get(null);
                Method[] methods = cls.getMethods();
                int length2 = methods.length;
                Method method = null;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i2];
                    if (u890.j(method2.getName(), "serializer") && method2.getParameterTypes().length == 0 && u890.j(method2.getReturnType(), nma0.class)) {
                        if (!z2) {
                            z2 = true;
                            method = method2;
                        }
                    }
                    i2++;
                    method = null;
                    break;
                }
                if (method == null) {
                    nma0Var = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof nma0) {
                        nma0Var = (nma0) objInvoke;
                    } else {
                        nma0Var = null;
                    }
                }
            }
        }
        if (nma0Var != null) {
            return nma0Var;
        }
        nma0[] nma0VarArr3 = (nma0[]) Arrays.copyOf(nma0VarArr, nma0VarArr.length);
        Field[] declaredFields2 = cls.getDeclaredFields();
        int length3 = declaredFields2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                field = null;
                break;
            }
            field = declaredFields2[i3];
            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(lkn0.class) != null) {
                break;
            }
            i3++;
        }
        if (field == null) {
            obj2 = null;
        } else {
            try {
                field.setAccessible(true);
                obj2 = field.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (nma0VarU = u(obj2, (nma0[]) Arrays.copyOf(nma0VarArr3, nma0VarArr3.length))) == null) {
            try {
                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                int length4 = declaredClasses.length;
                Class<?> cls2 = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length4) {
                        Class<?> cls3 = declaredClasses[i4];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z3) {
                                z3 = true;
                                cls2 = cls3;
                            }
                        }
                        i4++;
                    } else if (!z3) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                nma0VarU = obj4 instanceof nma0 ? (nma0) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (nma0VarU != null) {
            return nma0VarU;
        }
        if (cls.getAnnotation(pcv0.class) == null) {
            o661 annotation = cls.getAnnotation(o661.class);
            if (annotation == null) {
                return null;
            }
            Class clsWith = annotation.with();
            jd11 jd11Var = rc11.a;
            if (!jd11Var.b(clsWith).equals(jd11Var.b(tcv0.class))) {
                return null;
            }
        }
        return new tcv0(rc11.a.b(cls));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    public static final vkj0 l(ioj0 ioj0Var, Map map) {
        vkj0 vkj0Var;
        vkj0 vkj0Var2;
        int i;
        int i2;
        Set setKeySet;
        boolean zIsEmpty = map.isEmpty();
        vkj0 vkj0Var3 = vkj0.b;
        if (!zIsEmpty) {
            cqs0 cqs0Var = ioj0Var.a;
            Set setEntrySet = map.entrySet();
            ArrayList arrayList = new ArrayList(q7h.U(setEntrySet, 10));
            Iterator it = setEntrySet.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                vkj0Var = vkj0.c;
                vkj0Var2 = vkj0.a;
                i = 0;
                zContainsAll = false;
                boolean zContainsAll = false;
                i = 0;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Set set = (Set) entry.getValue();
                Map map2 = (Map) cqs0Var.get(entry.getKey());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : set) {
                    if (obj instanceof zp21) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((Class) ((zp21) it2.next()).a);
                }
                if (arrayList3.isEmpty()) {
                    vkj0Var = vkj0Var3;
                } else {
                    if (map2 != null && (setKeySet = map2.keySet()) != null) {
                        zContainsAll = setKeySet.containsAll(arrayList3);
                    }
                    if (zContainsAll) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (arrayList3.contains((Class) entry2.getKey())) {
                                linkedHashMap.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        Collection collectionValues = linkedHashMap.values();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = collectionValues.iterator();
                        while (it3.hasNext()) {
                            goj0 goj0VarA = ((hoj0) it3.next()).a();
                            if (goj0VarA != null) {
                                arrayList4.add(goj0VarA);
                            }
                        }
                        Collection<foj0> collectionValues2 = linkedHashMap.values();
                        ArrayList arrayList5 = new ArrayList();
                        for (foj0 foj0Var : collectionValues2) {
                            foj0Var.getClass();
                            foj0 foj0Var2 = foj0Var instanceof foj0 ? foj0Var : null;
                            if (foj0Var2 != null) {
                                arrayList5.add(foj0Var2);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            vkj0Var = vkj0Var2;
                        } else if (arrayList4.size() == arrayList3.size()) {
                            vkj0Var = vkj0Var3;
                        }
                    }
                }
                arrayList.add(vkj0Var);
            }
            if (arrayList.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it4 = arrayList.iterator();
                i2 = 0;
                while (it4.hasNext()) {
                    if (((vkj0) it4.next()) == vkj0Var2 && (i2 = i2 + 1) < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
            boolean z = i2 > 0;
            if (!arrayList.isEmpty()) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    if (((vkj0) it5.next()) == vkj0Var3 && (i = i + 1) < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
            if (i != arrayList.size()) {
                return z ? vkj0Var2 : vkj0Var;
            }
        }
        return vkj0Var3;
    }

    public static Object m(Collection collection, luo luoVar, ryo1 ryo1Var) {
        ifl1 ifl1Var = new ifl1((byte) 12);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            n(it.next(), luoVar, ifl1Var, ryo1Var);
        }
        return ryo1Var.z();
    }

    public static void n(Object obj, luo luoVar, ifl1 ifl1Var, ryo1 ryo1Var) {
        if (obj != null) {
            if (((HashSet) ifl1Var.b).add(obj) && ryo1Var.q(obj)) {
                Iterator it = luoVar.e(obj).iterator();
                while (it.hasNext()) {
                    n(it.next(), luoVar, ifl1Var, ryo1Var);
                }
                ryo1Var.o(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case grn1.d /* 12 */:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
            case grn1.d /* 12 */:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r4.equals("concert") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r4.equals("chapter") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r4.equals("venue") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r4.equals("track") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r4.equals("album") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r4.equals("show") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r4.equals("clip") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (r4.equals("artist") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        if (r4.equals("episode") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
    
        return p.v9g.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        if (r4.equals("concert-campaign") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
    
        return p.v9g.c;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p.v9g o(java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.syo1.o(java.lang.String):p.v9g");
    }

    public static String p(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final HashSet q(ArrayList arrayList) {
        HashSet hashSet = new HashSet(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(arrayList.get(i));
        }
        return hashSet;
    }

    public static final Observable r(njj0 njj0Var, Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(q7h.U(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(new mmr0(entry.getKey(), ((aq21) it.next()).getKey()));
            }
            r7h.W(arrayList2, arrayList);
        }
        Observable observableA = njj0Var.a(new g4r(arrayList));
        alj0 alj0Var = alj0.b;
        return observableA.map(new fjb((byte) 16));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean s(Collection collection, luo luoVar, iu30 iu30Var) {
        return (Boolean) m(collection, luoVar, new kuo(iu30Var, (Serializable) new boolean[1], (byte) 0));
    }

    public static final go80 t(klm klmVar, ubp0 ubp0Var, obp0 obp0Var) {
        return klmVar.a("InteroperabilityMonitorDaemon", new rap0(ubp0Var, obp0Var, (byte) 20));
    }

    public static final nma0 u(Object obj, nma0... nma0VarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (nma0VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = nma0VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = nma0.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(nma0VarArr, nma0VarArr.length));
            if (objInvoke instanceof nma0) {
                return (nma0) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static boolean v(String str) {
        List listQ0 = ihc1.Q0(str, new String[]{":"}, 0, 6);
        return listQ0.size() >= 2 && u890.j(listQ0.get(0), "spotify") && u890.j(listQ0.get(1), "artist");
    }

    public static final boolean w(tka0 tka0Var) {
        return ((wdg) tka0Var).n().isInterface();
    }

    public static boolean x(String str) {
        List listQ0 = ihc1.Q0(str, new String[]{":"}, 0, 6);
        return listQ0.size() >= 2 && u890.j(listQ0.get(0), "spotify") && u890.j(listQ0.get(1), "show");
    }

    public static boolean y(String str) {
        List listQ0 = ihc1.Q0(str, new String[]{":"}, 0, 6);
        return listQ0.size() >= 2 && u890.j(listQ0.get(0), "spotify") && u890.j(listQ0.get(1), "track");
    }

    public static boolean z(String str) {
        if (str.length() > 0 && str.length() <= 64) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_' || cCharAt == '-') {
                }
            }
            return true;
        }
        return false;
    }
}
