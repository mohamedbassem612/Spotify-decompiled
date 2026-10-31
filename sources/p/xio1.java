package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import j$.time.Duration;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xio1 {
    public static b180 b;
    public final /* synthetic */ byte a;

    static {
        new jsg(0.0f, 0.33f);
        new jsg(0.67f, 1.0f);
    }

    public /* synthetic */ xio1(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x019c  */
    /* JADX WARN: Code duplicated, block: B:52:0x019e  */
    /* JADX WARN: Code duplicated, block: B:58:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x020b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0241  */
    /* JADX WARN: Code duplicated, block: B:72:0x0246  */
    /* JADX WARN: Code duplicated, block: B:75:0x0251  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void a(xdc xdcVar, xdc xdcVar2, int i, int i2, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i3, int i4) {
        vu30 vu30Var2;
        int i5;
        boolean z;
        x340 x340Var;
        vu30 vu30Var3;
        h311 h311VarV;
        vu30 vu30Var4;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        Object objT;
        byte b2;
        boolean z3;
        Object objT2;
        ?? r0;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1903026222);
        int i6 = i3 | (x340Var2.g(xdcVar) ? 4 : 2) | (x340Var2.g(xdcVar2) ? 32 : 16) | (x340Var2.e(i) ? 256 : 128) | (x340Var2.e(i2) ? 2048 : 1024) | (x340Var2.i(qim0Var) ? 16384 : 8192);
        int i7 = i4 & 32;
        if (i7 == 0) {
            if ((i3 & 196608) == 0) {
                vu30Var2 = vu30Var;
                i6 |= x340Var2.i(vu30Var2) ? 131072 : 65536;
            }
            i5 = i6;
            if ((i5 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i5 & 1, z)) {
                if (i7 != 0) {
                    vu30Var4 = oni.a;
                } else {
                    vu30Var4 = vu30Var2;
                }
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarZ = uyn1.z(24.0f, 0.0f, 2, x0d.p(lhc.g(x340Var2).g, 32, qim0Var));
                mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarZ);
                hzj.A.getClass();
                if (x340Var2.a != null) {
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
                vu30Var4.invoke(x340Var2, Integer.valueOf((i5 >> 15) & 14));
                String strO0 = cwl1.o0(x340Var2, i2);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var2).d;
                nim0 nim0Var = nim0.a;
                vu30 vu30Var5 = vu30Var4;
                uwo1.e(strO0, uyn1.B(nim0Var, 32.0f, 16.0f, 32.0f, 0.0f, 8), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2024);
                uwo1.e(cwl1.o0(x340Var2, i), uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
                idx idxVar = new idx(4);
                qim0 qim0VarN = anm1.N("primary_button", uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                if ((i5 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = x340Var2.T();
                if (!z2 || objT == m4cVar) {
                    b2 = 0;
                    objT = new tt00(xdcVar, (byte) 0);
                    x340Var2.s0(objT);
                } else {
                    b2 = 0;
                }
                z50 z50Var = z50.c;
                foo1.c(new gbx(z50Var, (Function0) objT), idxVar, qim0VarN, null, null, null, null, null, null, null, apo.r(1725120519, new ut00(xdcVar, b2), x340Var2), x340Var2, 0, 48, 2040);
                ldx ldxVar = ldx.c;
                qim0 qim0VarN2 = anm1.N("secondary_button", uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                if ((i5 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objT2 = x340Var2.T();
                if (!z3 || objT2 == m4cVar) {
                    r0 = 1;
                    objT2 = new tt00(xdcVar2, (byte) 1);
                    x340Var2.s0(objT2);
                } else {
                    r0 = 1;
                }
                foo1.c(new gbx(z50Var, (Function0) objT2), ldxVar, qim0VarN2, null, null, null, null, null, null, null, apo.r(-932093058, new ut00(xdcVar2, (byte) r0), x340Var2), x340Var2, 0, 48, 2040);
                x340Var = x340Var2;
                x340Var.r((boolean) r0);
                vu30Var3 = vu30Var5;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                vu30Var3 = vu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vt00(xdcVar, xdcVar2, i, i2, qim0Var, vu30Var3, i3, i4);
            }
        }
        i6 |= 196608;
        vu30Var2 = vu30Var;
        i5 = i6;
        if ((i5 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i5 & 1, z)) {
            if (i7 != 0) {
                vu30Var4 = oni.a;
            } else {
                vu30Var4 = vu30Var2;
            }
            WeakHashMap weakHashMap2 = osl1.x;
            qim0 qim0VarZ2 = uyn1.z(24.0f, 0.0f, 2, x0d.p(lhc.g(x340Var2).g, 32, qim0Var));
            mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarZ2);
            hzj.A.getClass();
            if (x340Var2.a != null) {
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
            vu30Var4.invoke(x340Var2, Integer.valueOf((i5 >> 15) & 14));
            String strO1 = cwl1.o0(x340Var2, i2);
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var2 = cbx.d(x340Var2).d;
            nim0 nim0Var2 = nim0.a;
            vu30 vu30Var6 = vu30Var4;
            uwo1.e(strO1, uyn1.B(nim0Var2, 32.0f, 16.0f, 32.0f, 0.0f, 8), lee1Var2, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2024);
            uwo1.e(cwl1.o0(x340Var2, i), uyn1.B(nim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
            idx idxVar2 = new idx(4);
            qim0 qim0VarN3 = anm1.N("primary_button", uyn1.B(nim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13));
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objT = x340Var2.T();
            if (z2) {
                b2 = 0;
                objT = new tt00(xdcVar, (byte) 0);
                x340Var2.s0(objT);
            } else {
                b2 = 0;
                objT = new tt00(xdcVar, (byte) 0);
                x340Var2.s0(objT);
            }
            z50 z50Var2 = z50.c;
            foo1.c(new gbx(z50Var2, (Function0) objT), idxVar2, qim0VarN3, null, null, null, null, null, null, null, apo.r(1725120519, new ut00(xdcVar, b2), x340Var2), x340Var2, 0, 48, 2040);
            ldx ldxVar2 = ldx.c;
            qim0 qim0VarN4 = anm1.N("secondary_button", uyn1.B(nim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13));
            if ((i5 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objT2 = x340Var2.T();
            if (z3) {
                r0 = 1;
                objT2 = new tt00(xdcVar2, (byte) 1);
                x340Var2.s0(objT2);
            } else {
                r0 = 1;
                objT2 = new tt00(xdcVar2, (byte) 1);
                x340Var2.s0(objT2);
            }
            foo1.c(new gbx(z50Var2, (Function0) objT2), ldxVar2, qim0VarN4, null, null, null, null, null, null, null, apo.r(-932093058, new ut00(xdcVar2, (byte) r0), x340Var2), x340Var2, 0, 48, 2040);
            x340Var = x340Var2;
            x340Var.r((boolean) r0);
            vu30Var3 = vu30Var6;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            vu30Var3 = vu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vt00(xdcVar, xdcVar2, i, i2, qim0Var, vu30Var3, i3, i4);
        }
    }

    public static final void d(pjh0 pjh0Var, boolean z, jsl jslVar, Function0 function0, b0k b0kVar, int i) {
        rm90 rm90Var;
        rm90 rm90Var2;
        String str = pjh0Var.b;
        as80 as80Var = mif1.P0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1384862796);
        int i2 = i | (x340Var.i(pjh0Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.g(jslVar) ? 256 : 128) | (x340Var.d(16.0f) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(1008523265);
                boolean zG = x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = v8r.q(0);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                boolean zG2 = x340Var.g(str);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = v8r.q(0);
                    x340Var.s0(objT2);
                }
                ven0 ven0Var2 = (ven0) objT2;
                Uri uri = Uri.parse(str);
                boolean zI = x340Var.i(ven0Var) | x340Var.i(ven0Var2);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new xs3(ven0Var, ven0Var2, (byte) 11);
                    x340Var.s0(objT3);
                }
                ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT3, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 126974);
                int i3 = pjh0Var.d;
                Integer numValueOf = Integer.valueOf(i3);
                if (i3 <= 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : ((Number) ven0Var.getValue()).intValue();
                int i4 = pjh0Var.e;
                Integer numValueOf2 = i4 > 0 ? Integer.valueOf(i4) : null;
                int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : ((Number) ven0Var2.getValue()).intValue();
                boolean zE = x340Var.e(iIntValue) | x340Var.e(iIntValue2);
                Object objT4 = x340Var.T();
                if (zE || objT4 == m4cVar) {
                    if (iIntValue <= 0 || iIntValue2 <= 0) {
                        rm90Var = new rm90(128.0f, 128.0f);
                    } else {
                        if (iIntValue2 > iIntValue) {
                            rm90Var2 = new rm90(128.0f, 170.0f);
                        } else if (iIntValue > iIntValue2) {
                            rm90Var2 = new rm90(170.0f, 128.0f);
                        } else {
                            rm90Var = new rm90(128.0f, 128.0f);
                        }
                        objT4 = rm90Var2;
                        x340Var.s0(objT4);
                    }
                    objT4 = rm90Var;
                    x340Var.s0(objT4);
                }
                rm90 rm90Var3 = (rm90) objT4;
                eso1.h(ni7VarA, jslVar, bin.x(i1p1.q(u291.s(nim0Var, rm90Var3.a, rm90Var3.b), er31.b(16.0f)), false, null, null, null, function0, 15), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, x340Var, ((i2 >> 3) & 112) | 224256, 384);
                x340Var.r(false);
            } else {
                x340Var.i0(1009575622);
                ni7 ni7VarA2 = oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070);
                cbx.a.getClass();
                eso1.h(ni7VarA2, jslVar, bin.x(i1p1.q(u291.r(nim0Var, 128.0f), er31.b(16.0f)), false, null, null, null, function0, 15), (p3v) null, (zvx) null, uwr.a(), as80Var, (tl3) null, (ColorFilter) null, x340Var, ((i2 >> 3) & 112) | 27648, 384);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(pjh0Var, z, jslVar, function0, i);
        }
    }

    public static final void e(sj51 sj51Var, lzn0 lzn0Var, ryf ryfVar, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        ryf ryfVar2;
        lzn0 lzn0Var2;
        qim0 qim0VarD;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1867814011);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(sj51Var) : x340Var.i(sj51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lzn0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ryfVar) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            List list = sj51Var.c;
            if (sj51Var.b) {
                x340Var.i0(1549491811);
                qim0VarD = u291.d(d1u.E(1.0f, u7h.g, uyn1.w(l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var), false, 14), vzq0Var), d4o1.a), 1.0f);
                x340Var.r(false);
            } else {
                x340Var.i0(1549679671);
                qim0VarD = u291.d(uyn1.w(l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var), false, 14), vzq0Var), 1.0f);
                x340Var.r(false);
            }
            ryfVar2 = ryfVar;
            upo1.p(list, lzn0Var, ryfVar2, qim0VarD, x340Var, i2 & 1008);
            lzn0Var2 = lzn0Var;
        } else {
            ryfVar2 = ryfVar;
            lzn0Var2 = lzn0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(sj51Var, lzn0Var2, ryfVar2, vzq0Var, i);
        }
    }

    public static final void f(int i, b0k b0kVar, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-688962438);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            boolean z = c380Var.size() == 1;
            qim0Var2 = nim0.a;
            qim0 qim0VarZ = z ? u291.z(qim0Var2, (fra) null, 3) : u291.h(qim0Var2, 128.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = qim0VarZ;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean zI = x340Var.i(c380Var) | x340Var.h(z) | x340Var.d(16.0f) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new c30(c380Var, iu30Var, z);
                x340Var.s0(objT);
            }
            ujo1.e(qim0Var3, null, null, d36Var, null, null, false, null, (iu30) objT, x340Var, 0, 494);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ate(i, iu30Var, c380Var, qim0Var2);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(644596865);
        int i2 = i | (b0kVar2.i(function0) ? 4 : 2) | 48;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new lpx0(function0, (byte) 10);
                b0kVar2.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("QueueAction", bin.x(qim0Var3, false, null, null, null, (Function0) objT, 15));
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            vjx vjxVar = vjx.c;
            uwr uwrVar = cbx.a;
            w0h1.a(vjxVar, new jsl(cwl1.o0(b0kVar2, 2131951786)), u291.r(uyn1.x(qim0Var3, 12.0f), 24.0f), cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, vjx.d | 384, 48);
            String strO0 = cwl1.o0(b0kVar2, 2131951786);
            lee1 lee1Var = cbx.d(b0kVar2).g;
            long j = cbx.a(b0kVar2).b.b;
            b0kVar2 = b0kVar2;
            uwo1.e(strO0, null, lee1Var, j, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 24);
        }
    }

    public static final void h(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1329315807);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("selection_header", qim0Var);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strU = cwl1.U(2131820961, i, new Object[]{Integer.valueOf(i)}, x340Var);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 20.0f, 0.0f, 0.0f, 0.0f, 14);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = wu51.e;
                x340Var.s0(objT);
            }
            uwo1.e(strU, s161.b(qim0VarB, false, (iu30) objT), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 29, i, i2, qim0Var);
        }
    }

    public static final void i(float f, int i, b0k b0kVar, qim0 qim0Var) {
        float fM;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-957166200);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i | 16;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                fM = dsa0.m(x340Var, 2131167085);
            } else {
                x340Var.b0();
                fM = f;
            }
            x340Var.s();
            db80 db80VarR = t5p1.r("infinite", x340Var, 0);
            long jK = f5p1.k(x340Var, 2131104055);
            cb80 cb80VarG = t5p1.g(db80VarR, 0.0f, 360.0f, irn1.Y(irn1.o0(4000, 0, mlv.d, 2), 1, 0L, 4), "rotation", x340Var, 29112, 0);
            ceo ceoVar = mlv.a;
            cb80 cb80VarG2 = t5p1.g(db80VarR, 0.0f, 0.33f, irn1.Y(irn1.o0(1800, 0, ceoVar, 2), 2, 0L, 4), "strokeStart", x340Var, 28680, 0);
            cb80 cb80VarG3 = t5p1.g(db80VarR, 1.0f, 0.67f, irn1.Y(irn1.o0(1800, 0, ceoVar, 2), 2, 0L, 4), "strokeEnd", x340Var, 28680, 0);
            qim0 qim0VarX = uyn1.x(u291.d(qim0Var, 1.0f), fM);
            boolean zG = x340Var.g(cb80VarG) | x340Var.g(cb80VarG2) | x340Var.g(cb80VarG3) | x340Var.f(jK);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                vkt0 vkt0Var = new vkt0(cb80VarG, jK, cb80VarG2, cb80VarG3, (byte) 1);
                x340Var.s0(vkt0Var);
                objT = vkt0Var;
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarX);
        } else {
            x340Var.b0();
            fM = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(qim0Var, fM, i, (byte) 9);
        }
    }

    public static final List j(Class cls) {
        return z561.k0(z561.X(ye3.X0, z561.c0(ye3.W0, cls)));
    }

    public static final p6x k() {
        return new p6x();
    }

    public static ax81 l(Type type, jla0 jla0Var, List list, boolean z) {
        return new ax81(jla0Var, list, z, z6x.a, (oma0) null, false, false, false, (tka0) null, new p2n(type, (byte) 2));
    }

    public static final b0o1 m(jhm jhmVar) {
        ihm ihmVar = jhmVar.i;
        if (!(ihmVar instanceof ihm)) {
            ihmVar = null;
        }
        if (ihmVar != null) {
            return ihmVar.a;
        }
        return null;
    }

    public static final bla0 n(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return rc11.a.b((Class) genericDeclaration);
        }
        eqg.c("Non-class container of a type parameter is not supported: ", genericDeclaration, " (", typeVariable);
        return null;
    }

    public static String o(Long l, Context context, boolean z) {
        ytw0 ytw0Var = jfv.b;
        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(jfv.u(fdg1.l0(l.longValue(), ngv.e), ngv.h));
        long jBetween = ChronoUnit.DAYS.between(LocalDate.now(), localDateOfEpochDay);
        String str = null;
        if (z) {
            long jLongValue = l.longValue();
            if (jBetween >= 14) {
                try {
                    str = DateTimeFormatter.ofPattern("MMMM d, yyyy").format(LocalDate.ofEpochDay(Duration.ofSeconds(jLongValue).toDays()));
                } catch (Exception unused) {
                }
                String string = context.getString(2131963499, str);
                string.getClass();
                return string;
            }
            if (jBetween >= 1) {
                String quantityString = context.getResources().getQuantityString(2131820946, (int) jBetween, Long.valueOf(jBetween));
                quantityString.getClass();
                return quantityString;
            }
            String string2 = context.getString(2131963500);
            string2.getClass();
            return string2;
        }
        long jLongValue2 = l.longValue();
        if (jBetween >= 14) {
            try {
                str = DateTimeFormatter.ofPattern("MMMM d, yyyy").format(LocalDate.ofEpochDay(Duration.ofSeconds(jLongValue2).toDays()));
            } catch (Exception unused2) {
            }
            String string3 = context.getString(2131963498, str);
            string3.getClass();
            return string3;
        }
        if (jBetween >= 1) {
            String quantityString2 = context.getResources().getQuantityString(2131820945, (int) jBetween, Long.valueOf(jBetween));
            quantityString2.getClass();
            return quantityString2;
        }
        String string4 = context.getString(2131963501);
        string4.getClass();
        return string4;
    }

    public static final boolean p(q7r0 q7r0Var) {
        return q7r0Var.d.b().a().b0(kce0.class).a() == null;
    }

    public static final First q(uhm0 uhm0Var) {
        znb1 znb1Var = uhm0Var.a;
        if (u890.j(znb1Var, ylb1.a)) {
            return First.c(uhm0Var, Collections.singleton(zcw.c));
        }
        if (u890.j(znb1Var, plb1.a)) {
            return First.b(uhm0Var);
        }
        if (u890.j(znb1Var, smb1.a)) {
            return First.b(uhm0Var);
        }
        if (u890.j(znb1Var, ulb1.a)) {
            return First.b(uhm0Var);
        }
        if (u890.j(znb1Var, vmb1.a)) {
            return First.b(uhm0Var);
        }
        if (znb1Var instanceof cnb1) {
            return First.b(uhm0Var);
        }
        eg.o();
        return null;
    }

    public static final Next r(lbc1 lbc1Var, boolean z) {
        int i;
        t4c1 t4c1Var = lbc1Var.a;
        if (!(t4c1Var instanceof t4c1) || (i = lbc1Var.c + 1) == t4c1Var.a) {
            return Next.j();
        }
        lbc1 lbc1VarT = t(lbc1Var, i);
        xj61 xj61Var = new xj61();
        xj61Var.add(new mac1(i));
        if (!z) {
            xj61Var.add(bac1.c);
        }
        return Next.i(lbc1VarT, cwl1.j(xj61Var));
    }

    public static final Next s(lbc1 lbc1Var, int i) {
        t4c1 t4c1Var = lbc1Var.a;
        return (!(t4c1Var instanceof t4c1) || i + 1 < t4c1Var.a) ? Next.a(Collections.singleton(new jac1(i + 1))) : Next.j();
    }

    public static final lbc1 t(lbc1 lbc1Var, int i) {
        return lbc1.a(lbc1Var, (u4c1) null, 0, i, (kas0) null, jix0.b, false, false, false, false, (eb71) null, 2027);
    }

    public static final cq20 u(ax81 ax81Var, Type type) {
        jla0 jla0Var = ax81Var.b;
        List<tma0> list = ax81Var.c;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (tma0 tma0Var : list) {
            oma0 oma0Var = tma0Var.b;
            if (oma0Var != null) {
                tma0Var = new tma0(3, oma0Var);
            }
            arrayList.add(tma0Var);
        }
        ax81 ax81VarL = l(type, jla0Var, arrayList, true);
        p2n p2nVar = new p2n(type, (byte) 3);
        if (!ax81Var.equals(ax81VarL)) {
            ax81Var = new cq20(ax81Var, ax81VarL, false, p2nVar);
        }
        return (cq20) ax81Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static oma0 v(Type type, Map map, int i, boolean z, int i2) throws i9n {
        ax81 ax81VarL;
        ArrayList arrayList;
        String strO;
        ye3 ye3Var = ye3.Z0;
        ye3 ye3Var2 = ye3.Y0;
        int i3 = (i2 & 2) != 0 ? 3 : i;
        boolean z2 = (i2 & 4) != 0 ? false : z;
        boolean z3 = type instanceof Class;
        lf30 lf30Var = null;
        z6x z6xVar = z6x.a;
        if (z3) {
            Class cls = (Class) type;
            if (!j(cls).isEmpty() && !z2) {
                tka0 tka0VarB = rc11.a.b(cls);
                List listJ = j(cls);
                ArrayList arrayList2 = new ArrayList(q7h.U(listJ, 10));
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    Type type2 = (Type) f46.j0(((TypeVariable) z561.e0(z561.c0(ye3.V0, (TypeVariable) it.next()))).getBounds());
                    tma0 tma0Var = tma0.c;
                    type2.getClass();
                    arrayList2.add(bqn1.y(v(type2, map, 0, true, 2)));
                }
                ax81 ax81VarL2 = l(cls, tka0VarB, arrayList2, false);
                tka0 tka0VarB2 = rc11.a.b(cls);
                List<TypeVariable> listJ2 = j(cls);
                ArrayList arrayList3 = new ArrayList(q7h.U(listJ2, 10));
                for (TypeVariable typeVariable : listJ2) {
                    arrayList3.add(tma0.c);
                }
                ax81 ax81VarL3 = l(cls, tka0VarB2, arrayList3, true);
                return ax81VarL2.equals(ax81VarL3) ? ax81VarL2 : new cq20(ax81VarL2, ax81VarL3, true, new ka(cls, (byte) 15));
            }
            if (cls.isArray()) {
                return u(l(type, rc11.a.b(cls), Collections.singletonList(w(cls.getComponentType(), map)), false), type);
            }
            tka0 tka0VarB3 = rc11.a.b(cls);
            List<TypeVariable> listJ3 = j(cls);
            ArrayList arrayList4 = new ArrayList(q7h.U(listJ3, 10));
            for (TypeVariable typeVariable2 : listJ3) {
                arrayList4.add(tma0.c);
            }
            ax81VarL = l(type, tka0VarB3, arrayList4, false);
        } else {
            if (type instanceof GenericArrayType) {
                tma0 tma0VarW = w(((GenericArrayType) type).getGenericComponentType(), map);
                oma0 oma0Var = tma0VarW.b;
                oma0Var.getClass();
                Class clsN = jhc1.s(oma0Var).n();
                kf30 kf30Var = bpi1.a;
                return u(l(type, rc11.a.b(Array.newInstance((Class<?>) clsN, 0).getClass()), Collections.singletonList(tma0VarW), false), type);
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                tka0 tka0VarB4 = rc11.a.b((Class) parameterizedType.getRawType());
                if (z2) {
                    List<Type> listK0 = z561.k0(z561.Y(ye3Var, z561.c0(ye3Var2, parameterizedType)));
                    arrayList = new ArrayList(q7h.U(listK0, 10));
                    for (Type type3 : listK0) {
                        arrayList.add(tma0.c);
                    }
                } else {
                    List listK1 = z561.k0(z561.Y(ye3Var, z561.c0(ye3Var2, parameterizedType)));
                    ArrayList arrayList5 = new ArrayList(q7h.U(listK1, 10));
                    Iterator it2 = listK1.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(w((Type) it2.next(), map));
                    }
                    arrayList = arrayList5;
                }
                ax81VarL = l(type, tka0VarB4, arrayList, false);
            } else {
                if (!(type instanceof TypeVariable)) {
                    if (type instanceof WildcardType) {
                        mna0.d(type, "Wildcard type is not possible here: ");
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("Type is not supported: ");
                    sb.append(type);
                    Class<?> cls2 = type.getClass();
                    sb.append(" (");
                    sb.append(cls2);
                    sb.append(')');
                    throw new i9n(sb.toString());
                }
                TypeVariable typeVariable3 = (TypeVariable) type;
                qma0 qma0Var = (qma0) map.get(typeVariable3);
                if (qma0Var == null) {
                    Iterator it3 = n(typeVariable3).getTypeParameters().iterator();
                    boolean z4 = false;
                    Object obj = null;
                    while (true) {
                        if (!it3.hasNext()) {
                            if (!z4) {
                                break;
                            }
                            break;
                        }
                        Object next = it3.next();
                        if (u890.j(((qma0) next).c, typeVariable3.getName())) {
                            if (!z4) {
                                obj = next;
                                z4 = true;
                            }
                        }
                        obj = null;
                        break;
                    }
                    qma0Var = (qma0) obj;
                    if (qma0Var == null) {
                        throw new i9n("Type parameter " + typeVariable3.getName() + " is not found in " + n(typeVariable3));
                    }
                }
                ax81VarL = l(type, qma0Var, z6xVar, false);
            }
        }
        tka0 tka0Var = ax81VarL.b;
        tka0 tka0Var2 = tka0Var instanceof tka0 ? tka0Var : null;
        String str = j8a0.a;
        if (tka0Var2 != null && (strO = tka0Var2.o()) != null) {
            lf30Var = new lf30(strO);
        }
        kf30 kf30VarH = j8a0.h(lf30Var);
        if (kf30VarH != null && tka0Var2 != null) {
            ax81 ax81Var = new ax81(tka0Var, ax81VarL.c, ax81VarL.d, z6xVar, (oma0) null, false, false, false, w6d1.n(kf30VarH, tka0Var2), new p2n(type, (byte) 2));
            ax81VarL = ax81Var.equals(ax81VarL) ? ax81Var : new cq20(ax81Var, ax81VarL, false, new p2n(type, (byte) 0));
        }
        int iC = l1d.C(i3);
        if (iC == 0) {
            return ax81VarL;
        }
        if (iC == 1) {
            return ax81VarL.A(true);
        }
        ax81 ax81VarY = ax81VarL.y();
        if (ax81VarY == null) {
            ax81VarY = ax81VarL;
        }
        ax81 ax81VarB = ax81VarL.B();
        if (ax81VarB != null) {
            ax81VarL = ax81VarB;
        }
        b7 b7VarA = ax81VarL.A(true);
        return ax81VarY.equals(b7VarA) ? ax81VarY : new cq20(ax81VarY, b7VarA, false, new p2n(type, (byte) 1));
    }

    public static final tma0 w(Type type, Map map) {
        if (!(type instanceof WildcardType)) {
            tma0 tma0Var = tma0.c;
            return bqn1.y(v(type, map, 0, false, 6));
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            mna0.d(type, "Wildcard types with many bounds are not supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            tma0 tma0Var2 = tma0.c;
            return new tma0(2, v((Type) f46.B0(lowerBounds), map, 0, false, 6));
        }
        if (upperBounds.length != 1) {
            return tma0.c;
        }
        tma0 tma0Var3 = tma0.c;
        return new tma0(3, v((Type) f46.B0(upperBounds), map, 0, false, 6));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object x(SceneTemplate.ArtistCardsContent.TradingCard tradingCard, int i, bju bjuVar, ti31 ti31Var, kj31 kj31Var, cxc cxcVar, onm onmVar) {
        zj6 zj6Var;
        if (onmVar instanceof zj6) {
            zj6Var = (zj6) onmVar;
            int i2 = zj6Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zj6Var.b = i2 - Integer.MIN_VALUE;
            } else {
                zj6Var = new zj6(onmVar);
            }
        } else {
            zj6Var = new zj6(onmVar);
        }
        zj6 zj6Var2 = zj6Var;
        Object objE = zj6Var2.a;
        int i3 = zj6Var2.b;
        if (i3 == 0) {
            hm5.M(objE);
            if (tradingCard.F() && tradingCard.n().E()) {
                RiveAnimation riveAnimationU = tradingCard.n().u();
                String strC = f4i1.c(i, "artist_card_particle_");
                zj6Var2.b = 1;
                objE = u3k.a.e(riveAnimationU, bjuVar, ti31Var, kj31Var, cxcVar, strC, "Failed to load artist-card particle field", zj6Var2);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            }
            return null;
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objE);
        m3k m3kVar = (m3k) objE;
        if (m3kVar != null) {
            return new hg6(m3kVar.a, m3kVar.b);
        }
        return null;
    }

    public static final dj6 y(SceneTemplate.ArtistCardsContent.Stat stat) {
        return new dj6(stat.o(), stat.getValue(), stat.q(), stat.p());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object z(SceneTemplate.ArtistCardsContent.ArtistCard artistCard, int i, bju bjuVar, gw70 gw70Var, onm onmVar) {
        bk6 bk6Var;
        dj6 dj6VarY;
        dj6 dj6VarY2;
        fj6 fj6Var;
        dj6 dj6Var;
        dj6 dj6Var2;
        dj6 dj6Var3;
        dj6 dj6Var4;
        dj6 dj6Var5;
        dj6 dj6Var6;
        dj6 dj6Var7;
        dj6 dj6Var8;
        String str;
        String str2;
        if (onmVar instanceof bk6) {
            bk6Var = (bk6) onmVar;
            int i2 = bk6Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bk6Var.i = i2 - Integer.MIN_VALUE;
            } else {
                bk6Var = new bk6(onmVar);
            }
        } else {
            bk6Var = new bk6(onmVar);
        }
        Object obj = bk6Var.h;
        int i3 = bk6Var.i;
        if (i3 == 0) {
            hm5.M(obj);
            if (!artistCard.D() || !artistCard.B() || !artistCard.C() || !artistCard.z() || !artistCard.A()) {
                return null;
            }
            dj6VarY = y(artistCard.t());
            dj6VarY2 = y(artistCard.q());
            dj6 dj6VarY3 = y(artistCard.r());
            dj6 dj6VarY4 = y(artistCard.o());
            dj6 dj6VarY5 = y(artistCard.p());
            if (artistCard.y()) {
                String strP = artistCard.n().p();
                String strQ = artistCard.n().q();
                String strC = f4i1.c(i, "top_song_art_");
                i24 i24Var = new i24(artistCard, gw70Var, (lnm) null, (byte) 5);
                bk6Var.a = dj6VarY;
                bk6Var.b = dj6VarY2;
                bk6Var.c = dj6VarY3;
                bk6Var.d = dj6VarY4;
                bk6Var.e = dj6VarY5;
                bk6Var.f = strP;
                bk6Var.g = strQ;
                bk6Var.i = 1;
                Object objE = bjuVar.e(strC, i24Var, bk6Var);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
                dj6Var4 = dj6VarY;
                dj6Var5 = dj6VarY2;
                dj6Var6 = dj6VarY3;
                dj6Var7 = dj6VarY4;
                dj6Var8 = dj6VarY5;
                str = strP;
                obj = objE;
                str2 = strQ;
            } else {
                fj6Var = null;
                dj6Var = dj6VarY4;
                dj6Var2 = dj6VarY3;
                dj6Var3 = dj6VarY5;
            }
            return new aj6(dj6VarY, new wi6(dj6VarY2, dj6Var2, dj6Var, dj6Var3, fj6Var));
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = bk6Var.g;
        str = bk6Var.f;
        dj6Var8 = bk6Var.e;
        dj6Var7 = bk6Var.d;
        dj6Var6 = bk6Var.c;
        dj6Var5 = bk6Var.b;
        dj6Var4 = bk6Var.a;
        hm5.M(obj);
        fj6 fj6Var2 = new fj6(str, str2, (yj41) obj);
        dj6 dj6Var9 = dj6Var5;
        dj6Var2 = dj6Var6;
        dj6VarY2 = dj6Var9;
        dj6Var3 = dj6Var8;
        dj6VarY = dj6Var4;
        fj6Var = fj6Var2;
        dj6Var = dj6Var7;
        return new aj6(dj6VarY, new wi6(dj6VarY2, dj6Var2, dj6Var, dj6Var3, fj6Var));
    }

    public String toString() {
        switch (this.a) {
            case 17:
                return ((hgp1) this).c.toString();
            default:
                return super.toString();
        }
    }
}
