package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.playlist.proto.a;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class k4p1 {
    public static b180 a;
    public static b180 b;

    public static final jfe A(c9n c9nVar, mr20 mr20Var) {
        age hgeVar = mr20Var instanceof age ? (age) mr20Var : null;
        if (hgeVar == null) {
            hgeVar = new hge(mr20Var, (o8n) null, 0, 0, 14);
        }
        return hgeVar.j(c9nVar);
    }

    public static final mfe B(jfe jfeVar) {
        return new mfe(jfeVar, false);
    }

    public static List C(Iterable iterable) {
        List listN1 = o7h.n1(iterable);
        Collections.shuffle(listN1);
        return listN1;
    }

    public static void D(int i, Object[] objArr) {
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    public static final n5r E(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return new csj1();
        }
        if (iC == 1) {
            return new lc20((byte) 6);
        }
        eg.o();
        return null;
    }

    public static final h540 F(k540 k540Var) {
        if (k540Var.equals(j540.a)) {
            return g540.a;
        }
        if (k540Var instanceof i540) {
            return new f540(((i540) k540Var).a);
        }
        eg.o();
        return null;
    }

    public static final int G(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 1;
        }
        if (iC == 1) {
            return 2;
        }
        eg.o();
        return 0;
    }

    public static final void a(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1500686827);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            long jK = f5p1.k(x340Var, 2131100236);
            pdp1.f(z, apo.r(1596609280, new jx9(jK, qim0Var, (byte) 0), x340Var), x340Var, (i2 & 14) | 48);
            pdp1.f(!z, apo.r(-1077551959, new jx9(jK, qim0Var, (byte) 1), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kx9(z, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(boolean z, gx9 gx9Var, long j, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1212043264);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(gx9Var) ? 32 : 16) | (x340Var.f(j) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            tob1 tob1VarA = w191.a(j != 16 ? j : u7h.j, null, "color", x340Var, 384, 10);
            boolean zG = x340Var.g(tob1VarA);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new lq2(tob1VarA, (byte) 15);
                x340Var.s0(objT);
            }
            qim0 qim0VarQ = exd0.q(qim0Var, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
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
            pdp1.f(gx9Var instanceof dx9, apo.r(-2006272005, new lx9(gx9Var, (byte) 0), x340Var), x340Var, 48);
            pdp1.f(gx9Var instanceof ex9, apo.r(476654450, new lx9(gx9Var, (byte) 1), x340Var), x340Var, 48);
            a((i2 & 14) | 48, x340Var, u291.d(nim0.a, 1.0f), z);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mx9(z, gx9Var, j, qim0Var, i);
        }
    }

    public static final void c(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1959851371);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            eso1.e(Uri.parse(str), new jsl(str2), anm1.N("image_background", qim0Var), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 1769472, 0, 3992);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 6);
        }
    }

    public static final void d(int i, String str, Function0 function0, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1681340041);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarX = bin.x(u291.j(48.0f, 0.0f, 2, u291.f(nim0.a, 1.0f)), false, null, null, null, function0, 15);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarX);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            uwo1.e(str, new wnb0(1.0f, true), cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(-148870138);
                w0h1.a(ilx.c, isl.a, (qim0) null, cbx.a(x340Var).c.c, 0L, false, x340Var, ilx.d | 48, 52);
                x340Var.r(false);
            } else {
                x340Var.i0(-148694275);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c980((byte) 0, i, str, function0, z);
        }
    }

    public static final void e(zzz0 zzz0Var, lik1 lik1Var, c380 c380Var, iu30 iu30Var, z201 z201Var, oa0 oa0Var, c101 c101Var, u201 u201Var, idm idmVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        lik1 lik1Var2;
        c380 c380Var2;
        oa0 oa0Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        hdn0 hdn0Var;
        Object next;
        m4c m4cVar = fkj0.X;
        xzz0 xzz0Var = zzz0Var.e;
        List list = zzz0Var.k;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1473332879);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(zzz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            lik1Var2 = lik1Var;
            i2 |= b0kVar3.g(lik1Var2) ? 32 : 16;
        } else {
            lik1Var2 = lik1Var;
        }
        if ((i & 384) == 0) {
            c380Var2 = c380Var;
            i2 |= b0kVar3.g(c380Var2) ? 256 : 128;
        } else {
            c380Var2 = c380Var;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(z201Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            oa0Var2 = oa0Var;
            i2 |= b0kVar3.i(oa0Var2) ? 131072 : 65536;
        } else {
            oa0Var2 = oa0Var;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(c101Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.i(u201Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= b0kVar3.i(idmVar) ? 67108864 : 33554432;
        }
        int i3 = i2 | 805306368;
        if (b0kVar3.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            wat watVar = (wat) b0kVar3.k(t4k.h);
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = bb00.h(!list.isEmpty() ? (int) watVar.X0(30.0f) : 0, b0kVar3);
            }
            hdn0 hdn0Var2 = (hdn0) objT;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hdn0Var = hdn0Var2;
                    next = null;
                    break;
                } else {
                    next = it.next();
                    hdn0Var = hdn0Var2;
                    if (u890.j(((gxz0) next).c.a, xzz0Var.c)) {
                        break;
                    } else {
                        hdn0Var2 = hdn0Var;
                    }
                }
            }
            gxz0 gxz0Var = (gxz0) next;
            String str = gxz0Var != null ? gxz0Var.b : null;
            boolean zG = b0kVar3.g(str);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = z201Var.a(str);
                b0kVar3.s0(objT2);
            }
            ven0 ven0VarG = rwq.g((mr20) objT2, z201.b, null, b0kVar3, 0, 2);
            boolean z = zzz0Var.f;
            boolean zA = xzz0Var.a();
            boolean z2 = zzz0Var.g;
            boolean z3 = zzz0Var.n;
            c380 c380Var3 = (c380) ven0VarG.getValue();
            int i4 = i3 & 7168;
            boolean z4 = i4 == 2048;
            Object objT3 = b0kVar3.T();
            if (z4 || objT3 == m4cVar) {
                objT3 = new jwa0(iu30Var, (byte) 19);
                b0kVar3.s0(objT3);
            }
            iu30 iu30Var2 = (iu30) objT3;
            boolean z5 = i4 == 2048;
            Object objT4 = b0kVar3.T();
            if (z5 || objT4 == m4cVar) {
                objT4 = new jwa0(iu30Var, (byte) 20);
                b0kVar3.s0(objT4);
            }
            iu30 iu30Var3 = (iu30) objT4;
            boolean z6 = i4 == 2048;
            Object objT5 = b0kVar3.T();
            if (z6 || objT5 == m4cVar) {
                objT5 = new ijd0(iu30Var, (byte) 2);
                b0kVar3.s0(objT5);
            }
            b0kVar2 = b0kVar3;
            exd0.h(u201Var, oa0Var2, 0.0f, (qim0) null, z, zA, z2, z3, str, c380Var2, iu30Var2, c380Var3, iu30Var3, (Function0) objT5, apo.r(-188473176, new mse(zzz0Var, c101Var, iu30Var, lik1Var2, idmVar, hdn0Var), b0kVar3), b0kVar2, ((i3 >> 21) & 14) | 384 | ((i3 >> 12) & 112) | (1879048192 & (i3 << 21)), 8);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new is9(zzz0Var, lik1Var, c380Var, iu30Var, z201Var, oa0Var, c101Var, u201Var, idmVar, qim0Var2, i);
        }
    }

    public static final void f(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-62958731);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0Var2 = qim0Var;
            int i3 = i2 << 3;
            q7f0.a("npv-background-element", str, str2, anm1.N("video_background", qim0Var2), b3k1.c, false, x340Var, (i3 & 112) | 24582 | (i3 & 896), 32);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var2, i, (byte) 7);
        }
    }

    public static final void g(float f, int i, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2112814698);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            long j = u7h.f;
            tto1.d(f, (i2 & 112) | (i2 & 14) | 3456, 0, j, u7h.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), x340Var, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(f, qim0Var, i, (byte) 10);
        }
    }

    public static final int i(n4m n4mVar) {
        int iOrdinal = n4mVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                eg.o();
                return 0;
            }
        }
        return i;
    }

    public static final n4m j(ell ellVar) {
        int iOrdinal = ellVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return n4m.b;
            }
            if (iOrdinal == 3) {
                return n4m.a;
            }
            if (iOrdinal != 4 && iOrdinal != 5) {
                eg.o();
                return null;
            }
        }
        return n4m.c;
    }

    public static smc0 k(List list) {
        smc0 smc0Var = (smc0) list;
        smc0Var.i();
        smc0Var.c = true;
        return smc0Var.b > 0 ? smc0Var : smc0.d;
    }

    public static final mfe l(jfe jfeVar) {
        return new mfe(jfeVar, true);
    }

    public static final Object[] m(Object[] objArr, boolean z) {
        return (z && objArr.getClass().equals(Object[].class)) ? objArr : Arrays.copyOf(objArr, objArr.length, Object[].class);
    }

    public static smc0 n() {
        return new smc0(10);
    }

    public static smc0 o() {
        return new smc0(2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object p(bfd bfdVar, op31 op31Var, iyc0 iyc0Var, String str, cqf cqfVar, String str2, String str3, onm onmVar) {
        jw71 jw71Var;
        jw71 jw71Var2;
        iyc0 iyc0Var2;
        String str4;
        String str5;
        String str6;
        if (onmVar instanceof jw71) {
            jw71Var = (jw71) onmVar;
            int i = jw71Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                jw71Var.h = i - Integer.MIN_VALUE;
            } else {
                jw71Var = new jw71(onmVar);
            }
        } else {
            jw71Var = new jw71(onmVar);
        }
        Object objY = jw71Var.g;
        int i2 = jw71Var.h;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objY);
            jw71Var.a = op31Var;
            jw71Var.b = iyc0Var;
            jw71Var.c = str;
            jw71Var.d = str2;
            jw71Var.e = str3;
            jw71Var.h = 1;
            objY = y(bfdVar, str, cqfVar, jw71Var);
            if (objY != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            str3 = jw71Var.e;
            str2 = jw71Var.d;
            str = jw71Var.c;
            iyc0Var = jw71Var.b;
            op31Var = jw71Var.a;
            hm5.M(objY);
        } else {
            if (i2 == 2) {
                str4 = jw71Var.e;
                iyc0Var2 = jw71Var.b;
                hm5.M(objY);
                jw71Var2 = jw71Var;
                str5 = (String) ((py21) objY).d();
                jw71Var2.a = null;
                jw71Var2.b = null;
                jw71Var2.c = null;
                jw71Var2.d = null;
                jw71Var2.e = null;
                jw71Var2.f = str5;
                jw71Var2.h = 3;
                xyc0 xyc0Var = (xyc0) iyc0Var2;
                xyc0Var.getClass();
                a aVarN = ModificationRequest.Attributes.n();
                aVarN.q(str4);
                objY = xyc0Var.r(str5, aVarN, jw71Var2);
                if (objY != d9nVar) {
                    str6 = str5;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str6 = jw71Var.f;
            hm5.M(objY);
        }
        return new xrn(str6, objY instanceof oy21);
        Object obj = objY;
        iyc0 iyc0Var3 = iyc0Var;
        op31 op31Var2 = op31Var;
        String str7 = str2;
        String str8 = str3;
        List list = (List) obj;
        if (list.isEmpty()) {
            eg.m("Cannot create a playlist without shared songs");
            return null;
        }
        Set set = pcf.a;
        String strConcat = "spotify:chat-shares:".concat(str);
        jw71Var.a = null;
        jw71Var.b = iyc0Var3;
        jw71Var.c = null;
        jw71Var.d = null;
        jw71Var.e = str8;
        jw71Var.h = 2;
        jw71Var2 = jw71Var;
        Object objB = op31.b(op31Var2, str7, list, strConcat, strConcat, mp31.a, jw71Var2);
        if (objB != d9nVar) {
            iyc0Var2 = iyc0Var3;
            objY = objB;
            str4 = str8;
            str5 = (String) ((py21) objY).d();
            jw71Var2.a = null;
            jw71Var2.b = null;
            jw71Var2.c = null;
            jw71Var2.d = null;
            jw71Var2.e = null;
            jw71Var2.f = str5;
            jw71Var2.h = 3;
            xyc0 xyc0Var2 = (xyc0) iyc0Var2;
            xyc0Var2.getClass();
            a aVarN2 = ModificationRequest.Attributes.n();
            aVarN2.q(str4);
            objY = xyc0Var2.r(str5, aVarN2, jw71Var2);
            if (objY != d9nVar) {
                str6 = str5;
                return new xrn(str6, objY instanceof oy21);
            }
        }
        return d9nVar;
    }

    public static apk0 q(Integer num, r6h1 r6h1Var) {
        return new apk0(num, r6h1Var);
    }

    public static final Object r(vr20 vr20Var, jfe jfeVar, zfe zfeVar) {
        Object objS = s(vr20Var, jfeVar, true, zfeVar);
        return objS == d9n.a ? objS : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:20:0x0045, B:23:0x004f), top: B:42:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r1.emit(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0082 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(p.vr20 r7, p.jfe r8, boolean r9, p.lnm r10) {
        /*
            boolean r0 = r10 instanceof p.ws20
            if (r0 == 0) goto L13
            r0 = r10
            p.ws20 r0 = (p.ws20) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.ws20 r0 = new p.ws20
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.d
            p.uac r7 = r0.c
            p.jfe r8 = r0.b
            p.vr20 r1 = r0.a
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L53
        L35:
            r7 = move-exception
            goto L8d
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L3d:
            boolean r9 = r0.d
            p.uac r7 = r0.c
            p.jfe r8 = r0.b
            p.vr20 r1 = r0.a
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L35
            goto L68
        L49:
            p.hm5.M(r10)
            p.u4p1.S(r7)
            p.uac r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L53:
            r0.a = r7     // Catch: java.lang.Throwable -> L35
            r0.b = r8     // Catch: java.lang.Throwable -> L35
            r0.c = r10     // Catch: java.lang.Throwable -> L35
            r0.d = r9     // Catch: java.lang.Throwable -> L35
            r0.f = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L64
            goto L84
        L64:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L85
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.a = r1     // Catch: java.lang.Throwable -> L35
            r0.b = r8     // Catch: java.lang.Throwable -> L35
            r0.c = r7     // Catch: java.lang.Throwable -> L35
            r0.d = r9     // Catch: java.lang.Throwable -> L35
            r0.f = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L84:
            return r5
        L85:
            if (r9 == 0) goto L8a
            r8.d(r4)
        L8a:
            p.rih1 r7 = p.rih1.a
            return r7
        L8d:
            throw r7     // Catch: java.lang.Throwable -> L8e
        L8e:
            r10 = move-exception
            if (r9 == 0) goto L94
            p.ulo1.j(r8, r7)
        L94:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k4p1.s(p.vr20, p.jfe, boolean, p.lnm):java.lang.Object");
    }

    public static String t(ihc ihcVar) {
        StringBuilder sb = new StringBuilder(ihcVar.size());
        for (int i = 0; i < ihcVar.size(); i++) {
            byte b2 = ihcVar.b[i];
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case grn1.d /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final String u(i53 i53Var, o5r o5rVar) {
        c53 c53Var = i53Var.c;
        String str = null;
        if ((c53Var instanceof d53) || (c53Var instanceof b53)) {
            return null;
        }
        if (!(c53Var instanceof c53)) {
            eg.o();
            return null;
        }
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", o5rVar.a).parse(c53Var.a);
            if (date != null) {
                str = o5rVar.c.format(date);
            }
        } catch (Exception e) {
            n57.e("Unsupported date format" + e.getLocalizedMessage());
        }
        return str == null ? "" : str;
    }

    public static final go80 v(klm klmVar, adp0 adp0Var) {
        return klmVar.a("SuggestionFrameworkDaemon", new mcp0(adp0Var, (byte) 20));
    }

    public static final boolean w(me2 me2Var) {
        return (me2Var instanceof ke2) && ((ke2) me2Var).a;
    }

    public static List x(Object obj) {
        return Collections.singletonList(obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007b -> B:18:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:36:0x00d8
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object y(p.bfd r12, java.lang.String r13, p.cqf r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k4p1.y(p.bfd, java.lang.String, p.cqf, p.onm):java.lang.Object");
    }

    public static final Observable z(Observable observable, Scheduler scheduler, boolean z) {
        return z ? observable.observeOn(scheduler) : observable;
    }
}
