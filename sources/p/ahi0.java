package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ahi0 implements xpw {
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object R0;
    public final Object S0;
    public final Object T0;
    public final Object U0;
    public final Object V0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public final js20 b;
    public final ia00 c;
    public final psw d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public ahi0(zei0 zei0Var, kci0 kci0Var, jly0 jly0Var, jxa jxaVar, yy4 yy4Var, d0r d0rVar, Function0 function0, kko kkoVar, p731 p731Var, uei0 uei0Var, wei0 wei0Var, cgi0 cgi0Var, Function0 function1, hs00 hs00Var, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, ojv0 ojv0Var, zob1 zob1Var, vu30 vu30Var2) {
        this.a = (byte) 0;
        this.e = zei0Var;
        this.f = kci0Var;
        this.g = yy4Var;
        this.h = d0rVar;
        this.i = function0;
        this.t = kkoVar;
        this.X = p731Var;
        this.Y = uei0Var;
        this.Z = wei0Var;
        this.N0 = hs00Var;
        this.O0 = iu30Var;
        this.P0 = iu30Var2;
        this.Q0 = vu30Var;
        this.S0 = ojv0Var;
        this.T0 = zob1Var;
        this.R0 = vu30Var2;
        this.U0 = new AtomicBoolean(false);
        this.V0 = new ioj0();
        this.b = x3p1.n(new zgi0(this, (byte) 0), new zgi0(this, (byte) 1), new yih0(this, (byte) 12), (o8n) null, pfi0.i, 8);
        this.c = vqo1.i(this);
        this.d = oqo1.n(this, cgi0.a(cgi0Var, uei0Var.b), jly0Var, jxaVar, function1, new j2i(163099914, new sw1(this, (byte) 24), true));
    }

    public static boolean o(xtb0 xtb0Var) {
        List list = xtb0Var.h().l;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((qtb0) it.next()).l.equals("GroupedDevices")) {
                return true;
            }
        }
        return false;
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public void e(g5r0 g5r0Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(389509660);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(g5r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarL = bmq0.L(nim0.a, k1o1.q(b0kVar3), (g6o0) null);
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            boolean zI = ((i2 & 14) == 4) | b0kVar3.i(this) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new a5r0(this, g5r0Var, z, function0);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarL, xtb0VarA, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, b0kVar2, 0, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_NEGATIVE_PROCESS_BLOCK_COUNT);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new b5r0(this, g5r0Var, z, function0, i, (byte) 0);
        }
    }

    public void f(g5r0 g5r0Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        List list = g5r0Var.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(802824452);
        int i2 = (x340Var.g(g5r0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (list.isEmpty()) {
            x340Var.i0(-1729175490);
            x340Var.r(false);
        } else {
            x340Var.i0(-1729449375);
            otw.c((maa) ((ynb0) this.O0).get(), new hp50(list, function0, z), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90((byte) 17, i, this, g5r0Var, function0, z);
        }
    }

    public void g(g5r0 g5r0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-126428806);
        int i2 = (x340Var.g(g5r0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            j1p1.a(((i2 >> 3) & 14) | 24624, 12, (Function0) null, apo.r(683937834, new f5r0(this, g5r0Var, (byte) 0), x340Var), x340Var, qim0Var, false, false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(this, g5r0Var, qim0Var, i, (byte) 21);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public void h(g5r0 g5r0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(680010968);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(g5r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarL = bmq0.L(nim0.a, k1o1.q(x340Var), (g6o0) null);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            boolean zI = x340Var.i(this) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ozp0(this, g5r0Var, (byte) 17);
                x340Var.s0(objT);
            }
            s3o1.d(qim0VarL, xtb0VarA, (vzq0) null, (g36) null, (nl3) null, (iq20) null, false, (h3h1) null, (iu30) objT, x340Var, 0, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_NEGATIVE_PROCESS_BLOCK_COUNT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(this, g5r0Var, i, (byte) 25);
        }
    }

    public void i(g5r0 g5r0Var, boolean z, Function0 function0, boolean z2, b0k b0kVar, int i) throws Throwable {
        int i2;
        Object hgo0Var;
        int i3;
        Throwable th;
        xtb0 xtb0Var;
        List list = g5r0Var.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(894487677);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(g5r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            yv31 yv31Var = (yv31) o7h.s0(list);
            x340Var.f0(609210713, yv31Var != null ? yv31Var.a : null);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean z3 = (i2 & 7168) == 2048;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new hj6(z2, ven0Var, (lnm) null, (byte) 17);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            boolean zG = x340Var.g(xtb0VarA) | x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                i3 = i2;
                th = null;
                xtb0Var = xtb0VarA;
                hgo0Var = new hgo0(this, xtb0Var, ven0Var, (lnm) null, (byte) 3);
                x340Var.s0(hgo0Var);
            } else {
                i3 = i2;
                hgo0Var = objT3;
                th = null;
                xtb0Var = xtb0VarA;
            }
            qxd0.t(bool, x340Var, (vu30) hgo0Var);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT4);
            }
            c9n c9nVar = (c9n) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = new pcp0(c9nVar, ven0Var, xtb0Var, (byte) 14);
                x340Var.s0(objT5);
            }
            Function0 function1 = (Function0) objT5;
            x340Var.i0(609289235);
            Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    Throwable th2 = th;
                    p7h.T();
                    throw th2;
                }
                yv31 yv31Var2 = (yv31) next;
                x340Var.f0(-643363079, yv31Var2.a);
                otw.c((maa) ((ynb0) this.h).get(), new zc0(yv31Var2, i4, g5r0Var.f, g5r0Var.g, new yc0(g5r0Var.i, function1, ((Boolean) ven0Var.getValue()).booleanValue())), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
                i3 = i3;
                i4 = i5;
                th = th;
                it = it;
                xtb0Var = xtb0Var;
            }
            xtb0 xtb0Var2 = xtb0Var;
            Throwable th3 = th;
            int i6 = i3;
            x340Var.r(false);
            qim0 qim0VarN = anm1.N("device-picker-scrollable-content", bmq0.L(nim0.a, k1o1.q(x340Var), th3));
            boolean zI = x340Var.i(this) | ((i6 & 14) == 4) | ((i6 & 112) == 32) | ((i6 & 896) == 256);
            Object objT6 = x340Var.T();
            if (zI || objT6 == m4cVar) {
                o96 o96Var = new o96(g5r0Var, z, this, ven0Var, function0);
                x340Var.s0(o96Var);
                objT6 = o96Var;
            }
            s3o1.d(qim0VarN, xtb0Var2, (vzq0) null, (g36) null, (nl3) null, (iq20) null, false, (h3h1) null, (iu30) objT6, x340Var, 0, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_NEGATIVE_PROCESS_BLOCK_COUNT);
            x340Var = x340Var;
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(this, g5r0Var, z, function0, z2, i);
        }
    }

    public void j(g5r0 g5r0Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(643513035);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(g5r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            yv31 yv31Var = (yv31) o7h.s0(g5r0Var.a);
            String str = yv31Var != null ? yv31Var.a : null;
            boolean z3 = !g5r0Var.h.isEmpty();
            List list = g5r0Var.c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    } else if (((ki90) it.next()).b == wly0.d) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zG = x340Var.g(xtb0VarA);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new pw1(xtb0VarA, (lnm) null, (byte) 7);
                x340Var.s0(objT);
            }
            qxd0.s(str, boolValueOf, (vu30) objT, x340Var);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zH = x340Var.h(z2) | x340Var.g(xtb0VarA);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar) {
                objT2 = new oy3(z2, xtb0VarA, (lnm) null, (byte) 13);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf2, x340Var, (vu30) objT2);
            qim0 qim0VarN = anm1.N("device-picker-scrollable-content", bmq0.L(nim0.a, k1o1.q(x340Var), (g6o0) null));
            boolean zI = ((i2 & 14) == 4) | x340Var.i(this) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new a5r0(z, this, g5r0Var, function0);
                x340Var.s0(objT3);
            }
            s3o1.d(qim0VarN, xtb0VarA, (vzq0) null, (g36) null, (nl3) null, (iq20) null, false, (h3h1) null, (iu30) objT3, x340Var, 0, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_NEGATIVE_PROCESS_BLOCK_COUNT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5r0(this, g5r0Var, z, function0, i, (byte) 1);
        }
    }

    public void k(g5r0 g5r0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2139158373);
        int i2 = (x340Var.g(g5r0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gd80 gd80Var = g5r0Var.b;
            if (gd80Var == null) {
                x340Var.i0(1057713819);
            } else {
                x340Var.i0(1057713820);
                j6p1.c(gd80Var, x340Var, 0);
            }
            x340Var.r(false);
            gd80 gd80Var2 = g5r0Var.d;
            if (gd80Var2 == null) {
                x340Var.i0(1057782267);
            } else {
                x340Var.i0(1057782268);
                j6p1.c(gd80Var2, x340Var, 0);
            }
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f5r0(this, g5r0Var, i);
        }
    }

    public void l(rtb0 rtb0Var, g5r0 g5r0Var) {
        List list = g5r0Var.a;
        rtb0Var.e(list.size(), new iio0(list, (byte) 6), new iio0(list, (byte) 7), new j2i(2039820996, new rf1((byte) 24, this, g5r0Var, list), true));
    }

    public void m(rtb0 rtb0Var, g5r0 g5r0Var) {
        List list = g5r0Var.c;
        String str = g5r0Var.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ki90) obj).a.e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((ki90) obj2).a.e) {
                arrayList2.add(obj2);
            }
        }
        n(rtb0Var, arrayList, 0, str);
        if (arrayList2.isEmpty()) {
            return;
        }
        rtb0.c(rtb0Var, "OnOtherNetworksRow", i5j.a, 2);
        n(rtb0Var, arrayList2, arrayList.size(), str);
    }

    public void n(rtb0 rtb0Var, ArrayList arrayList, int i, String str) {
        rtb0Var.e(arrayList.size(), new qbb0(arrayList, (byte) 15), new qbb0(arrayList, (byte) 16), new j2i(2039820996, new ixj(arrayList, this, i, str, (byte) 1), true));
    }

    public ahi0(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, ynb0 ynb0Var6, ynb0 ynb0Var7, ynb0 ynb0Var8, ynb0 ynb0Var9, ynb0 ynb0Var10, ynb0 ynb0Var11, ynb0 ynb0Var12, ynb0 ynb0Var13, los losVar, ynb0 ynb0Var14, wtr wtrVar, ynb0 ynb0Var15, ynb0 ynb0Var16) {
        this.a = (byte) 1;
        this.e = ynb0Var;
        this.f = ynb0Var2;
        this.g = ynb0Var3;
        this.h = ynb0Var4;
        this.i = ynb0Var5;
        this.t = ynb0Var6;
        this.X = ynb0Var7;
        this.Y = ynb0Var8;
        this.Z = ynb0Var9;
        this.N0 = ynb0Var10;
        this.O0 = ynb0Var11;
        this.P0 = ynb0Var12;
        this.Q0 = ynb0Var13;
        this.R0 = losVar;
        this.S0 = ynb0Var14;
        this.T0 = wtrVar;
        this.U0 = ynb0Var15;
        this.V0 = ynb0Var16;
        this.b = x3p1.n(new wvq0(this, (byte) 6), q4r0.i, w0q0.X, (o8n) null, (iu30) null, 24);
        this.c = n3o1.q(this).a(new x3o0(this, (byte) 13), jgq0.g);
        j2i j2iVar = new j2i(-1398432449, new aso0(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
