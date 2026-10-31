package p;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vv81 extends j9a {
    public final h9d0 b;
    public final Looper c;
    public final wdd1 d;
    public final Set e;
    public final dqe1 f;
    public uv81 g;

    public vv81(Looper looper) {
        this.c = looper;
        rdd1 rdd1Var = rdd1.a;
        this.d = rdd1Var.a(looper, (Handler.Callback) null);
        this.e = Collections.newSetFromMap(new IdentityHashMap());
        this.f = new dqe1();
        this.b = new h9d0(looper, rdd1Var, new uh61(this, (byte) 7));
    }

    public static int k1(uv81 uv81Var, oqe1 oqe1Var, dqe1 dqe1Var) {
        int i = uv81Var.z;
        if (i == -1) {
            i = 0;
        }
        int i2 = i;
        if (uv81Var.v.p()) {
            return i2;
        }
        sqe1 sqe1Var = uv81Var.v;
        return sqe1Var.b(sqe1Var.i(oqe1Var, dqe1Var, i2, zoi1.W(n1(uv81Var.C.get(), uv81Var, oqe1Var))).first);
    }

    public static long l1(uv81 uv81Var, Object obj, dqe1 dqe1Var, oqe1 oqe1Var) {
        return uv81Var.A != -1 ? uv81Var.D.get() : n1(uv81Var.C.get(), uv81Var, oqe1Var) - zoi1.n0(uv81Var.v.g(obj, dqe1Var).e);
    }

    public static p8u0 m1(uv81 uv81Var, oqe1 oqe1Var, dqe1 dqe1Var) {
        yoh0 yoh0Var;
        Object obj;
        Object obj2;
        int i = uv81Var.z;
        if (i == -1) {
            i = 0;
        }
        int i2 = i;
        sv81 sv81Var = uv81Var.C;
        int i3 = uv81Var.A;
        int iK1 = k1(uv81Var, oqe1Var, dqe1Var);
        sqe1 sqe1Var = uv81Var.v;
        if (sqe1Var.p()) {
            yoh0Var = null;
            obj = null;
            obj2 = null;
        } else {
            Object obj3 = sqe1Var.f(iK1, dqe1Var, true).b;
            obj = sqe1Var.n(i2, oqe1Var, 0L).a;
            obj2 = obj3;
            yoh0Var = oqe1Var.c;
        }
        long jN1 = n1(sv81Var.get(), uv81Var, oqe1Var);
        return new p8u0(obj, i2, yoh0Var, obj2, iK1, i3 != -1 ? uv81Var.D.get() : jN1, jN1, uv81Var.A, uv81Var.B);
    }

    public static long n1(long j, uv81 uv81Var, oqe1 oqe1Var) {
        if (j != -9223372036854775807L) {
            return j;
        }
        if (uv81Var.v.p()) {
            return 0L;
        }
        sqe1 sqe1Var = uv81Var.v;
        int i = uv81Var.z;
        if (i == -1) {
            i = 0;
        }
        return zoi1.n0(sqe1Var.n(i, oqe1Var, 0L).l);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    public static uv81 o1(uv81 uv81Var, ArrayList arrayList, int i, long j, oqe1 oqe1Var) {
        long jN0;
        boolean z;
        int i2 = i;
        tv81 tv81VarA = uv81Var.a();
        sqe1 sqe1Var = uv81Var.v;
        sqe1 qv81Var = arrayList == null ? sqe1Var : new qv81(arrayList);
        if (uv81Var.d != 1) {
            if (qv81Var.p() || (i2 != -1 && i2 >= qv81Var.o())) {
                tv81VarA.d = 4;
            } else {
                tv81VarA.d = 2;
            }
        }
        long jN1 = n1(uv81Var.C.get(), uv81Var, oqe1Var);
        boolean z2 = false;
        if (qv81Var.p() || (i2 != -1 && i2 < qv81Var.o())) {
            jN0 = j;
        } else {
            jN0 = -9223372036854775807L;
            i2 = 0;
        }
        if (!qv81Var.p() && jN0 == -9223372036854775807L) {
            jN0 = zoi1.n0(qv81Var.n(i2, oqe1Var, 0L).l);
        }
        l58 l58Var = uv81Var.E;
        boolean z3 = sqe1Var.p() || qv81Var.p();
        if (z3) {
            z = false;
        } else {
            int i3 = uv81Var.z;
            if (i3 == -1) {
                i3 = 0;
            }
            if (sqe1Var.n(i3, oqe1Var, 0L).a.equals(qv81Var.n(i2, oqe1Var, 0L).a)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (qv81Var.p()) {
            o3g1 o3g1Var = o3g1.b;
            tv81VarA.v = null;
            tv81VarA.w = qv81Var;
            tv81VarA.x = o3g1Var;
            tv81VarA.y = null;
        } else if (qv81Var instanceof qv81) {
            nv81 nv81Var = (nv81) ((qv81) qv81Var).e.get(i2);
            o3g1 o3g1Var2 = nv81Var.b;
            tqh0 tqh0Var = nv81Var.d;
            tv81VarA.v = null;
            tv81VarA.w = qv81Var;
            tv81VarA.x = o3g1Var2;
            tv81VarA.y = tqh0Var;
        } else {
            if (!z3 && !z) {
                z2 = true;
            }
            o3g1 o3g1Var3 = z2 ? uv81Var.w : o3g1.b;
            tqh0 tqh0Var2 = z2 ? uv81Var.x : null;
            tv81VarA.v = null;
            tv81VarA.w = qv81Var;
            tv81VarA.x = o3g1Var3;
            tv81VarA.y = tqh0Var2;
        }
        if (z3 || z || jN0 < jN1) {
            tv81VarA.A = i2;
            tv81VarA.a();
            tv81VarA.D = Long.valueOf(jN0);
            tv81VarA.G = new l58(jN0);
            tv81VarA.I = sv81.k0;
        } else if (jN0 == jN1) {
            tv81VarA.A = i2;
            tv81VarA.a();
            tv81VarA.I = new l58(n1(l58Var.a, uv81Var, oqe1Var) - jN1);
        } else {
            long jMax = Math.max(n1(l58Var.a, uv81Var, oqe1Var), jN0);
            long jMax2 = Math.max(0L, uv81Var.G.a - (jN0 - jN1));
            tv81VarA.A = i2;
            tv81VarA.a();
            tv81VarA.D = Long.valueOf(jN0);
            tv81VarA.G = new l58(jMax);
            tv81VarA.I = new l58(jMax2);
        }
        return new uv81(tv81VarA);
    }

    public static boolean r1(uv81 uv81Var) {
        return uv81Var.b && uv81Var.d == 3;
    }

    public final void A() {
        w1();
        uv81 uv81Var = this.g;
        if (t1(26)) {
            zud0 zud0Var = ((x5b1) this).f166p;
            if (zud0Var != null) {
                zud0Var.u(2);
            }
            f280 f280Var = f280.b;
            f280 f280Var2 = f280.b;
            Set set = this.e;
            if (set.isEmpty()) {
                u1(((x5b1) this).l, false, false);
                return;
            }
            set.add(f280Var2);
            tv81 tv81VarA = uv81Var.a();
            tv81VarA.b(Math.max(0, uv81Var.s - 1));
            u1(new uv81(tv81VarA), false, false);
            f280Var2.b(new v241(this), new wkh0(this, (byte) 7));
        }
    }

    public final void A0(int i, int i2) {
        w1();
        uv81 uv81Var = this.g;
        if (t1(33)) {
            p1(i);
            f280 f280Var = f280.b;
            Set set = this.e;
            if (set.isEmpty()) {
                u1(((x5b1) this).l, false, false);
                return;
            }
            set.add(f280Var);
            tv81 tv81VarA = uv81Var.a();
            tv81VarA.b(i);
            u1(new uv81(tv81VarA), false, false);
            f280Var.b(new v241(this), new wkh0(this, (byte) 7));
        }
    }

    public final void B(int i) {
        w1();
        uv81 uv81Var = this.g;
        if (t1(34)) {
            x5b1 x5b1Var = (x5b1) this;
            zud0 zud0Var = x5b1Var.f166p;
            if (zud0Var != null) {
                zud0Var.u(1);
            }
            f280 f280Var = f280.b;
            Set set = this.e;
            if (set.isEmpty()) {
                u1(x5b1Var.l, false, false);
                return;
            }
            set.add(f280Var);
            tv81 tv81VarA = uv81Var.a();
            tv81VarA.b(uv81Var.s + 1);
            u1(new uv81(tv81VarA), false, false);
            f280Var.b(new v241(this), new wkh0(this, (byte) 7));
        }
    }

    public final void D(int i, int i2, List list) {
        w1();
        dm5.m(i >= 0 && i <= i2);
        int iO = this.g.v.o();
        if (!t1(20) || i > iO) {
            return;
        }
        eg.m("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    public final int D0() {
        w1();
        return this.g.B;
    }

    public final void E0(k0g1 k0g1Var) {
        w1();
        if (t1(29)) {
            eg.m("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
        }
    }

    public final void G0(List list, int i, long j) {
        w1();
        if (i == -1) {
            uv81 uv81Var = this.g;
            int i2 = uv81Var.z;
            long j2 = uv81Var.C.get();
            i = i2;
            j = j2;
        }
        s1(list, i, j);
    }

    public final void H(int i, int i2) {
        w1();
        dm5.m(i >= 0 && i2 >= i);
        int iO = this.g.v.o();
        if (!t1(20) || iO == 0 || i >= iO || i == Math.min(i2, iO)) {
            return;
        }
        eg.m("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    public final void I(SurfaceHolder surfaceHolder) {
        w1();
        if (t1(27)) {
            if (surfaceHolder == null) {
                j1();
            } else {
                eg.m("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
            }
        }
    }

    public final long I0() {
        w1();
        return this.g.i;
    }

    public final void J(o8u0 o8u0Var) {
        this.b.a(o8u0Var);
    }

    public final long K0() {
        w1();
        uv81 uv81Var = this.g;
        return n1(uv81Var.C.get(), uv81Var, (oqe1) ((j9a) this).a);
    }

    public final PlaybackException L() {
        w1();
        return this.g.e;
    }

    public final void M(boolean z) {
        w1();
        uv81 uv81Var = this.g;
        if (t1(1)) {
            x5b1 x5b1Var = (x5b1) this;
            String strY1 = x5b1Var.y1();
            if (strY1 != null) {
                wph0 wph0Var = x5b1Var.h;
                if (z) {
                    if (x5b1Var.j.a == null) {
                        wph0Var.a(strY1, kxh0.c, bzg0.a1);
                    }
                } else if (!x5b1Var.l.v.p()) {
                    wph0Var.a(strY1, kxh0.b, bzg0.Z0);
                }
            }
            f280 f280Var = f280.b;
            Set set = this.e;
            if (set.isEmpty()) {
                u1(x5b1Var.l, false, false);
                return;
            }
            set.add(f280Var);
            tv81 tv81VarA = uv81Var.a();
            tv81VarA.b = z;
            tv81VarA.c = true;
            u1(new uv81(tv81VarA), false, false);
            f280Var.b(new v241(this), new wkh0(this, (byte) 7));
        }
    }

    public final void M0(int i, List list) {
        w1();
        dm5.m(i >= 0);
        this.g.v.o();
        if (!t1(20) || list.isEmpty()) {
            return;
        }
        eg.m("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    public final long N0() {
        w1();
        return o() ? Math.max(this.g.F.get(), this.g.D.get()) : X0();
    }

    public final void O() {
        w1();
        uv81 uv81Var = this.g;
        if (t1(24) && this.g.n == 0.0f) {
            float f = uv81Var.o;
            eg.m("Missing implementation to handle COMMAND_SET_VOLUME");
        }
    }

    public final void P(o8u0 o8u0Var) {
        w1();
        this.b.e(o8u0Var);
    }

    public final tqh0 P0() {
        w1();
        return this.g.y;
    }

    public final int Q0() {
        w1();
        int i = this.g.z;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final void S0(int i, int i2, int i3) {
        w1();
        dm5.m(i >= 0 && i2 >= i && i3 >= 0);
        int iO = this.g.v.o();
        if (!t1(20) || iO == 0 || i >= iO) {
            return;
        }
        int iMin = Math.min(i2, iO);
        int iMin2 = Math.min(i3, iO - (iMin - i));
        if (i == iMin || iMin2 == i) {
            return;
        }
        eg.m("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    public final void T(int i) {
        w1();
        uv81 uv81Var = this.g;
        if (t1(34)) {
            zud0 zud0Var = ((x5b1) this).f166p;
            if (zud0Var != null) {
                zud0Var.u(2);
            }
            f280 f280Var = f280.b;
            f280 f280Var2 = f280.b;
            Set set = this.e;
            if (set.isEmpty()) {
                u1(((x5b1) this).l, false, false);
                return;
            }
            set.add(f280Var2);
            tv81 tv81VarA = uv81Var.a();
            tv81VarA.b(Math.max(0, uv81Var.s - 1));
            u1(new uv81(tv81VarA), false, false);
            f280Var2.b(new v241(this), new wkh0(this, (byte) 7));
        }
    }

    public final o3g1 U() {
        w1();
        return this.g.w;
    }

    public final boolean U0() {
        w1();
        this.g.getClass();
        return false;
    }

    public final boolean V0() {
        w1();
        return this.g.g;
    }

    public final qeo W() {
        w1();
        return this.g.q;
    }

    public final int X() {
        w1();
        return this.g.A;
    }

    public final long X0() {
        w1();
        uv81 uv81Var = this.g;
        oqe1 oqe1Var = (oqe1) ((j9a) this).a;
        long jN1 = n1(uv81Var.E.a, uv81Var, oqe1Var);
        uv81 uv81Var2 = this.g;
        return Math.max(jN1, n1(uv81Var2.C.get(), uv81Var2, oqe1Var));
    }

    public final void Y0(int i) {
        w1();
        uv81 uv81Var = this.g;
        if (t1(25)) {
            p1(i);
            f280 f280Var = f280.b;
            Set set = this.e;
            if (set.isEmpty()) {
                u1(((x5b1) this).l, false, false);
                return;
            }
            set.add(f280Var);
            tv81 tv81VarA = uv81Var.a();
            tv81VarA.b(i);
            u1(new uv81(tv81VarA), false, false);
            f280Var.b(new v241(this), new wkh0(this, (byte) 7));
        }
    }

    public final void Z(boolean z) {
        w1();
        if (t1(26)) {
            eg.m("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
        }
    }

    public final boolean b() {
        w1();
        this.g.getClass();
        return false;
    }

    public final tqh0 b1() {
        w1();
        return this.g.x;
    }

    public final float c() {
        w1();
        return this.g.n;
    }

    public final int c0() {
        w1();
        this.g.getClass();
        return 0;
    }

    public final void c1(List list) {
        w1();
        s1(list, -1, -9223372036854775807L);
    }

    public final void d() {
        w1();
        if (t1(24) && this.g.n != 0.0f) {
            eg.m("Missing implementation to handle COMMAND_SET_VOLUME");
        }
    }

    public final sqe1 d0() {
        w1();
        return this.g.v;
    }

    public final long d1() {
        w1();
        return this.g.h;
    }

    public final void e() {
        w1();
        uv81 uv81Var = this.g;
        if (t1(2)) {
            f280 f280Var = f280.b;
            v1(new x7s(uv81Var, (byte) 6), false, false);
        }
    }

    public final Looper e0() {
        return this.c;
    }

    public final void f0() {
        w1();
        uv81 uv81Var = this.g;
        if (t1(26)) {
            x5b1 x5b1Var = (x5b1) this;
            zud0 zud0Var = x5b1Var.f166p;
            if (zud0Var != null) {
                zud0Var.u(1);
            }
            f280 f280Var = f280.b;
            Set set = this.e;
            if (set.isEmpty()) {
                u1(x5b1Var.l, false, false);
                return;
            }
            set.add(f280Var);
            tv81 tv81VarA = uv81Var.a();
            tv81VarA.b(uv81Var.s + 1);
            u1(new uv81(tv81VarA), false, false);
            f280Var.b(new v241(this), new wkh0(this, (byte) 7));
        }
    }

    public final void g(float f) {
        w1();
        if (t1(24)) {
            eg.m("Missing implementation to handle COMMAND_SET_VOLUME");
        }
    }

    public final k0g1 g0() {
        w1();
        return this.g.l;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:3: B:73:0x0108->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0104  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[LOOP:0: B:51:0x00b2->B:91:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[LOOP:1: B:41:0x008b->B:94:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0118 A[SYNTHETIC] */
    public final void g1(int i, int i2, long j, boolean z) {
        Iterator it;
        Iterator it2;
        Iterator it3;
        w1();
        boolean z2 = false;
        dm5.m(i == -1 || i >= 0);
        uv81 uv81VarO1 = this.g;
        if (t1(i2)) {
            if (i == -1 || o() || (!uv81VarO1.v.p() && i >= uv81VarO1.v.o())) {
                z2 = true;
            }
            x5b1 x5b1Var = (x5b1) this;
            String strY1 = x5b1Var.y1();
            if (strY1 != null) {
                wph0 wph0Var = x5b1Var.h;
                switch (i2) {
                    case 5:
                        wph0Var.getClass();
                        wph0Var.a(strY1, kxh0.g, new sre((byte) 27, j));
                        break;
                    case 6:
                    case 7:
                        List list = x5b1Var.m;
                        boolean z3 = list instanceof Collection;
                        if (!z3 || !list.isEmpty()) {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((bhh0) it4.next()) instanceof tgh0) {
                                    }
                                } else if (!z3 || !list.isEmpty()) {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((bhh0) it.next()) instanceof pgh0) {
                                                wph0Var.b(strY1, "SEEK_15_SECONDS_BACK", (Bundle) null);
                                                break;
                                            }
                                        }
                                    }
                                }
                                wph0Var.a(strY1, kxh0.d, bzg0.c1);
                                break;
                            }
                        } else if (!z3) {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    wph0Var.a(strY1, kxh0.d, bzg0.c1);
                                    break;
                                } else if (((bhh0) it.next()) instanceof pgh0) {
                                    wph0Var.b(strY1, "SEEK_15_SECONDS_BACK", (Bundle) null);
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    wph0Var.a(strY1, kxh0.d, bzg0.c1);
                                    break;
                                } else if (((bhh0) it.next()) instanceof pgh0) {
                                    wph0Var.b(strY1, "SEEK_15_SECONDS_BACK", (Bundle) null);
                                    break;
                                }
                            }
                        }
                        break;
                    case 8:
                    case 9:
                        List list2 = x5b1Var.m;
                        boolean z4 = list2 instanceof Collection;
                        if (!z4 || !list2.isEmpty()) {
                            Iterator it5 = list2.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    if (((bhh0) it5.next()) instanceof rgh0) {
                                    }
                                } else if (!z4 || !list2.isEmpty()) {
                                    it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (((bhh0) it2.next()) instanceof sgh0) {
                                                wph0Var.b(strY1, "SKIP_TO_NEXT_CHAPTER", (Bundle) null);
                                                break;
                                            }
                                        } else if (z4 || !list2.isEmpty()) {
                                            it3 = list2.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    if (((bhh0) it3.next()) instanceof qgh0) {
                                                        wph0Var.b(strY1, "SEEK_15_SECONDS_FORWARD", (Bundle) null);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (z4) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (((bhh0) it3.next()) instanceof qgh0) {
                                                wph0Var.b(strY1, "SEEK_15_SECONDS_FORWARD", (Bundle) null);
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (((bhh0) it3.next()) instanceof qgh0) {
                                                wph0Var.b(strY1, "SEEK_15_SECONDS_FORWARD", (Bundle) null);
                                                break;
                                            }
                                        }
                                    }
                                }
                                wph0Var.a(strY1, kxh0.e, bzg0.b1);
                                break;
                            }
                        } else if (!z4) {
                            it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (z4) {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                wph0Var.a(strY1, kxh0.e, bzg0.b1);
                                                break;
                                            } else if (((bhh0) it3.next()) instanceof qgh0) {
                                                wph0Var.b(strY1, "SEEK_15_SECONDS_FORWARD", (Bundle) null);
                                                break;
                                            }
                                        }
                                    } else {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                wph0Var.a(strY1, kxh0.e, bzg0.b1);
                                                break;
                                            } else if (((bhh0) it3.next()) instanceof qgh0) {
                                                wph0Var.b(strY1, "SEEK_15_SECONDS_FORWARD", (Bundle) null);
                                                break;
                                            }
                                        }
                                    }
                                } else if (((bhh0) it2.next()) instanceof sgh0) {
                                    wph0Var.b(strY1, "SKIP_TO_NEXT_CHAPTER", (Bundle) null);
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (z4) {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                wph0Var.a(strY1, kxh0.e, bzg0.b1);
                                                break;
                                            } else if (((bhh0) it3.next()) instanceof qgh0) {
                                                wph0Var.b(strY1, "SEEK_15_SECONDS_FORWARD", (Bundle) null);
                                                break;
                                            }
                                        }
                                    } else {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                wph0Var.a(strY1, kxh0.e, bzg0.b1);
                                                break;
                                            } else if (((bhh0) it3.next()) instanceof qgh0) {
                                                wph0Var.b(strY1, "SEEK_15_SECONDS_FORWARD", (Bundle) null);
                                                break;
                                            }
                                        }
                                    }
                                } else if (((bhh0) it2.next()) instanceof sgh0) {
                                    wph0Var.b(strY1, "SKIP_TO_NEXT_CHAPTER", (Bundle) null);
                                    break;
                                }
                            }
                        }
                        break;
                    case 10:
                        wph0Var.getClass();
                        wph0Var.a(strY1, kxh0.t, new p4g0(i, (byte) 3));
                        break;
                }
            }
            f280 f280Var = f280.b;
            boolean z5 = !z2;
            f280 f280Var2 = f280.b;
            Set set = this.e;
            if (set.isEmpty()) {
                u1(((x5b1) this).l, z5, z);
                return;
            }
            set.add(f280Var2);
            if (!z2) {
                uv81VarO1 = o1(uv81VarO1, null, i, j, (oqe1) ((j9a) this).a);
            }
            u1(uv81VarO1, z5, z);
            f280Var2.b(new v241(this), new wkh0(this, (byte) 7));
        }
    }

    public final long getDuration() {
        w1();
        if (!o()) {
            return u0();
        }
        sqe1 sqe1Var = this.g.v;
        int iV0 = v0();
        dqe1 dqe1Var = this.f;
        sqe1Var.f(iV0, dqe1Var, false);
        uv81 uv81Var = this.g;
        return zoi1.n0(dqe1Var.a(uv81Var.A, uv81Var.B));
    }

    public final int getPlaybackState() {
        w1();
        return this.g.d;
    }

    public final int getRepeatMode() {
        w1();
        return this.g.f;
    }

    public final void i0(tqh0 tqh0Var) {
        w1();
        if (t1(19)) {
            eg.m("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
        }
    }

    public final int j0() {
        w1();
        return this.g.s;
    }

    public final void j1() {
        w1();
        if (t1(27)) {
            eg.m("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
        }
    }

    public final k2u0 l() {
        w1();
        return this.g.k;
    }

    public final void m(k2u0 k2u0Var) {
        w1();
        if (t1(13)) {
            eg.m("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
        }
    }

    public final void n(Surface surface) {
        w1();
        if (t1(27)) {
            if (surface == null) {
                j1();
            } else {
                eg.m("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
            }
        }
    }

    public final m8u0 n0() {
        w1();
        return this.g.a;
    }

    public final boolean o() {
        w1();
        return this.g.A != -1;
    }

    public final void o0(boolean z) {
        w1();
        uv81 uv81Var = this.g;
        if (t1(14)) {
            x5b1 x5b1Var = (x5b1) this;
            String strY1 = x5b1Var.y1();
            if (strY1 != null) {
                int i = z ? 2 : 1;
                wph0 wph0Var = x5b1Var.h;
                wph0Var.getClass();
                wph0Var.a(strY1, kxh0.N0, new p4g0(i, (byte) 4));
            }
            f280 f280Var = f280.b;
            Set set = this.e;
            if (set.isEmpty()) {
                u1(x5b1Var.l, false, false);
                return;
            }
            set.add(f280Var);
            tv81 tv81VarA = uv81Var.a();
            tv81VarA.g = z;
            u1(new uv81(tv81VarA), false, false);
            f280Var.b(new v241(this), new wkh0(this, (byte) 7));
        }
    }

    public final long p() {
        w1();
        return this.g.G.a;
    }

    public abstract void p1(int i);

    public final boolean q() {
        w1();
        return this.g.b;
    }

    public final long q0() {
        w1();
        return this.g.j;
    }

    public final void q1() {
        w1();
        if (this.e.isEmpty()) {
            u1(((x5b1) this).l, false, false);
        }
    }

    public final void r(po7 po7Var, boolean z) {
        w1();
        if (t1(35)) {
            eg.m("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
        }
    }

    public final void s1(final List list, final int i, final long j) {
        dm5.m(i == -1 || i >= 0);
        final uv81 uv81Var = this.g;
        if (t1(20) || (list.size() == 1 && t1(31))) {
            f280 f280Var = f280.b;
            v1(new v0d1() { // from class: p.lv81
                public final Object get() {
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        List list2 = list;
                        if (i2 >= list2.size()) {
                            return vv81.o1(uv81Var, arrayList, i, j, (oqe1) ((j9a) this.a).a);
                        }
                        yoh0 yoh0Var = (yoh0) list2.get(i2);
                        mv81 mv81Var = new mv81(new pv81());
                        mv81Var.c = yoh0Var;
                        mv81Var.k = true;
                        mv81Var.o = true;
                        arrayList.add(new nv81(mv81Var));
                        i2++;
                    }
                }
            }, false, false);
        }
    }

    public final void setRepeatMode(int i) {
        y0i0 y0i0Var;
        w1();
        uv81 uv81Var = this.g;
        if (t1(15)) {
            x5b1 x5b1Var = (x5b1) this;
            String strY1 = x5b1Var.y1();
            if (strY1 != null) {
                if (i == 0) {
                    y0i0Var = y0i0.a;
                } else if (i == 1) {
                    y0i0Var = y0i0.b;
                } else {
                    if (i != 2) {
                        hhg1.n(f4i1.c(i, "Invalid repeat mode: "));
                        return;
                    }
                    y0i0Var = y0i0.c;
                }
                wph0 wph0Var = x5b1Var.h;
                wph0Var.getClass();
                wph0Var.a(strY1, kxh0.Z, new yih0(y0i0Var, (byte) 1));
            }
            f280 f280Var = f280.b;
            Set set = this.e;
            if (set.isEmpty()) {
                u1(x5b1Var.l, false, false);
                return;
            }
            set.add(f280Var);
            tv81 tv81VarA = uv81Var.a();
            tv81VarA.f = i;
            u1(new uv81(tv81VarA), false, false);
            f280Var.b(new v241(this), new wkh0(this, (byte) 7));
        }
    }

    public final void stop() {
        w1();
        final uv81 uv81Var = this.g;
        if (t1(3)) {
            x5b1 x5b1Var = (x5b1) this;
            String strY1 = x5b1Var.y1();
            if (strY1 != null) {
                x5b1Var.h.a(strY1, kxh0.a, bzg0.d1);
            }
            f280 f280Var = f280.b;
            final byte b = 1;
            v1(new v0d1() { // from class: p.y7s
                public final Object get() {
                    byte b2 = b;
                    Object obj = uv81Var;
                    Object obj2 = this;
                    switch (b2) {
                        case 0:
                            zjx0 zjx0Var = new zjx0((k2r) obj, (vyr) ((yjq) obj2).c);
                            zjx0Var.f = true;
                            return zjx0Var;
                        default:
                            uv81 uv81Var2 = (uv81) obj;
                            tv81 tv81VarA = uv81Var2.a();
                            tv81VarA.d = 1;
                            tv81VarA.I = sv81.k0;
                            tv81VarA.G = new l58(vv81.n1(uv81Var2.C.get(), uv81Var2, (oqe1) ((j9a) ((vv81) obj2)).a));
                            tv81VarA.H = uv81Var2.D;
                            return new uv81(tv81VarA);
                    }
                }
            }, false, false);
        }
    }

    public final boolean t1(int i) {
        return this.g.a.a(i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0158  */
    /* JADX WARN: Code duplicated, block: B:102:0x0162 A[EDGE_INSN: B:102:0x0162->B:118:0x0195 BREAK  A[LOOP:0: B:104:0x0165->B:116:0x018f]] */
    /* JADX WARN: Code duplicated, block: B:103:0x0164  */
    /* JADX WARN: Code duplicated, block: B:106:0x016b  */
    /* JADX WARN: Code duplicated, block: B:108:0x017f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0185  */
    /* JADX WARN: Code duplicated, block: B:114:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01be  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:133:0x01de  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:141:0x0212  */
    /* JADX WARN: Code duplicated, block: B:144:0x0227  */
    /* JADX WARN: Code duplicated, block: B:147:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0235  */
    /* JADX WARN: Code duplicated, block: B:151:0x0242  */
    /* JADX WARN: Code duplicated, block: B:154:0x024f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0255  */
    /* JADX WARN: Code duplicated, block: B:159:0x0269  */
    /* JADX WARN: Code duplicated, block: B:162:0x027d  */
    /* JADX WARN: Code duplicated, block: B:165:0x028d  */
    /* JADX WARN: Code duplicated, block: B:168:0x029f  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:177:0x02db  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:183:0x0301  */
    /* JADX WARN: Code duplicated, block: B:186:0x0316  */
    /* JADX WARN: Code duplicated, block: B:189:0x032b  */
    /* JADX WARN: Code duplicated, block: B:192:0x033e  */
    /* JADX WARN: Code duplicated, block: B:195:0x034f  */
    /* JADX WARN: Code duplicated, block: B:199:0x035f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0373  */
    /* JADX WARN: Code duplicated, block: B:205:0x0385  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:214:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x018f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x0130  */
    public final void u1(final uv81 uv81Var, boolean z, boolean z2) {
        boolean z3;
        int i;
        boolean z4;
        int i2;
        h9d0 h9d0Var;
        final byte b;
        final byte b2;
        final byte b3;
        final byte b4;
        final byte b5;
        final byte b6;
        final byte b7;
        final byte b8;
        final byte b9;
        final byte b10;
        final byte b11;
        final byte b12;
        final byte b13;
        final byte b14;
        yoh0 yoh0Var;
        int i3;
        int i4;
        Object obj;
        Object obj2;
        boolean z5;
        oqe1 oqe1Var = (oqe1) ((j9a) this).a;
        uv81 uv81Var2 = this.g;
        this.g = uv81Var;
        uv81Var.getClass();
        hjj0 hjj0Var = uv81Var.u;
        PlaybackException playbackException = uv81Var.e;
        int i5 = uv81Var.z;
        sqe1 sqe1Var = uv81Var.v;
        boolean z6 = uv81Var2.b;
        int i6 = uv81Var2.B;
        int i7 = uv81Var2.A;
        sqe1 sqe1Var2 = uv81Var2.v;
        boolean z7 = z6 != uv81Var.b;
        boolean z8 = uv81Var2.d != uv81Var.d;
        dqe1 dqe1Var = this.f;
        if (z) {
            z3 = z7;
            i = 1;
        } else {
            if (sqe1Var2.p()) {
                z3 = z7;
            } else {
                if (sqe1Var.p()) {
                    z3 = z7;
                } else {
                    Object objL = sqe1Var2.l(k1(uv81Var2, oqe1Var, dqe1Var));
                    Object objL2 = sqe1Var.l(k1(uv81Var, oqe1Var, dqe1Var));
                    z3 = z7;
                    if (!(objL instanceof pv81) || (objL2 instanceof pv81)) {
                        if (objL2.equals(objL) && i7 == uv81Var.A && i6 == uv81Var.B) {
                            long jL1 = l1(uv81Var2, objL, dqe1Var, oqe1Var);
                            if (Math.abs(jL1 - l1(uv81Var, objL2, dqe1Var, oqe1Var)) >= 1000) {
                                sqe1Var2.g(objL, dqe1Var);
                                long jN0 = zoi1.n0(i7 == -1 ? dqe1Var.d : dqe1Var.a(i7, i6));
                                if (jN0 == -9223372036854775807L || jL1 < jN0) {
                                    i = 5;
                                } else {
                                    i = 0;
                                }
                            }
                        } else if (sqe1Var.b(objL) != -1) {
                            long jL2 = l1(uv81Var2, objL, dqe1Var, oqe1Var);
                            sqe1Var2.g(objL, dqe1Var);
                            long jN1 = zoi1.n0(i7 == -1 ? dqe1Var.d : dqe1Var.a(i7, i6));
                            if (jN1 == -9223372036854775807L || jL2 < jN1) {
                                i = 3;
                            } else {
                                i = 0;
                            }
                        }
                    }
                }
                i = 4;
            }
            i = -1;
        }
        boolean zEquals = sqe1Var2.equals(sqe1Var);
        sqe1 sqe1Var3 = sqe1Var2;
        if (!sqe1Var.p() || !sqe1Var3.p()) {
            if (sqe1Var.p() == sqe1Var3.p()) {
                int i8 = uv81Var2.z;
                if (i8 == -1) {
                    i8 = 0;
                }
                Object obj3 = sqe1Var3.n(i8, oqe1Var, 0L).a;
                z4 = z8;
                Object obj4 = sqe1Var.n(i5 != -1 ? i5 : 0, oqe1Var, 0L).a;
                if (!(obj3 instanceof pv81) || (obj4 instanceof pv81)) {
                    if (obj3.equals(obj4)) {
                        if (i == 0 && n1(uv81Var2.C.get(), uv81Var2, oqe1Var) > n1(uv81Var.C.get(), uv81Var, oqe1Var)) {
                            i2 = 0;
                        } else if (i == 1 && z2) {
                            i2 = 2;
                        }
                    } else if (i == 0) {
                        i2 = 1;
                    } else if (i == 1) {
                        i2 = 2;
                    }
                }
                h9d0Var = this.b;
                if (!zEquals) {
                    if (sqe1Var3.o() == sqe1Var.o()) {
                        i3 = 0;
                        while (true) {
                            if (i3 >= sqe1Var3.o()) {
                                i4 = 1;
                                break;
                            }
                            obj = sqe1Var3.n(i3, oqe1Var, 0L).a;
                            sqe1 sqe1Var4 = sqe1Var3;
                            obj2 = sqe1Var.n(i3, oqe1Var, 0L).a;
                            if ((obj instanceof pv81) || (obj2 instanceof pv81)) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            if (obj.equals(obj2) && !z5) {
                                i4 = 0;
                                break;
                            } else {
                                i3++;
                                sqe1Var3 = sqe1Var4;
                            }
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                    h9d0Var.c(0, new mp5(uv81Var, i4, (byte) 9));
                }
                b = 11;
                if (i != -1) {
                    h9d0Var.c(11, new oo00(i, m1(uv81Var2, oqe1Var, dqe1Var), m1(uv81Var, oqe1Var, dqe1Var), (byte) 1));
                }
                if (i2 != -1) {
                    if (sqe1Var.p()) {
                        yoh0Var = null;
                    } else {
                        if (i5 == -1) {
                            i5 = 0;
                        }
                        yoh0Var = sqe1Var.n(i5, oqe1Var, 0L).c;
                    }
                    h9d0Var.c(1, new po00(yoh0Var, i2, (byte) 1));
                }
                b2 = 12;
                if (uv81Var2.e != playbackException) {
                    h9d0Var.c(10, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b15 = b;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b15) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                    if (playbackException != null) {
                        h9d0Var.c(10, new e9d0() { // from class: p.kv81
                            public final void invoke(Object obj5) {
                                byte b15 = b2;
                                uv81 uv81Var3 = uv81Var;
                                o8u0 o8u0Var = (o8u0) obj5;
                                switch (b15) {
                                    case 0:
                                        o8u0Var.y0(uv81Var3.j);
                                        break;
                                    case 1:
                                        o8u0Var.Y(uv81Var3.m);
                                        break;
                                    case 2:
                                        o8u0Var.b(uv81Var3.f155p);
                                        break;
                                    case 3:
                                        o8u0Var.q0(uv81Var3.r);
                                        break;
                                    case 4:
                                        o8u0Var.A(uv81Var3.y);
                                        break;
                                    case 5:
                                        l291 l291Var = uv81Var3.t;
                                        o8u0Var.X(l291Var.a, l291Var.b);
                                        break;
                                    case 6:
                                        o8u0Var.h0(uv81Var3.n);
                                        break;
                                    case 7:
                                        o8u0Var.O(uv81Var3.s, false);
                                        break;
                                    case 8:
                                        o8u0Var.l(uv81Var3.q.a);
                                        o8u0Var.o(uv81Var3.q);
                                        break;
                                    case 9:
                                        o8u0Var.u(uv81Var3.u);
                                        break;
                                    case 10:
                                        o8u0Var.p0(uv81Var3.a);
                                        break;
                                    case 11:
                                        o8u0Var.x0(uv81Var3.e);
                                        break;
                                    case 12:
                                        PlaybackException playbackException2 = uv81Var3.e;
                                        String str = zoi1.a;
                                        o8u0Var.n(playbackException2);
                                        break;
                                    case 13:
                                        o8u0Var.B(uv81Var3.l);
                                        break;
                                    case 14:
                                        o8u0Var.C(uv81Var3.w);
                                        break;
                                    case 15:
                                        o8u0Var.n0(uv81Var3.x);
                                        break;
                                    case 16:
                                        o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                        break;
                                    case 17:
                                        o8u0Var.H(uv81Var3.d);
                                        break;
                                    case 18:
                                        o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                        break;
                                    case 19:
                                        o8u0Var.E0(vv81.r1(uv81Var3));
                                        break;
                                    case 20:
                                        o8u0Var.r0(uv81Var3.k);
                                        break;
                                    case 21:
                                        o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                        break;
                                    case 22:
                                        o8u0Var.K(uv81Var3.g);
                                        break;
                                    case 23:
                                        o8u0Var.P(uv81Var3.h);
                                        break;
                                    default:
                                        o8u0Var.t0(uv81Var3.i);
                                        break;
                                }
                            }
                        });
                    }
                }
                b3 = 13;
                b4 = 19;
                if (!uv81Var2.l.equals(uv81Var.l)) {
                    h9d0Var.c(19, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b15 = b3;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b15) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                b5 = 14;
                if (!uv81Var2.w.equals(uv81Var.w)) {
                    h9d0Var.c(2, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b15 = b5;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b15) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                b6 = 15;
                if (!uv81Var2.x.equals(uv81Var.x)) {
                    h9d0Var.c(14, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b15 = b6;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b15) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                b7 = 16;
                if (z3 || z4) {
                    h9d0Var.c(-1, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b15 = b7;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b15) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                b8 = 17;
                if (z4) {
                    h9d0Var.c(4, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b15 = b8;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b15) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                b9 = 18;
                if (z3 || uv81Var2.c != uv81Var.c) {
                    h9d0Var.c(5, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b15 = b9;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b15) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                b10 = 7;
                if (r1(uv81Var2) != r1(uv81Var)) {
                    h9d0Var.c(7, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b15 = b4;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b15) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                b11 = 20;
                if (!uv81Var2.k.equals(uv81Var.k)) {
                    h9d0Var.c(12, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b15 = b11;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b15) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                b12 = 8;
                if (uv81Var2.f != uv81Var.f) {
                    final byte b15 = 21;
                    h9d0Var.c(8, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b16 = b15;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b16) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                b13 = 22;
                if (uv81Var2.g != uv81Var.g) {
                    h9d0Var.c(9, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b16 = b13;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b16) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (uv81Var2.h != uv81Var.h) {
                    final byte b16 = 23;
                    h9d0Var.c(16, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b17 = b16;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b17) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                b14 = 24;
                if (uv81Var2.i != uv81Var.i) {
                    h9d0Var.c(17, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b17 = b14;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b17) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (uv81Var2.j != uv81Var.j) {
                    final byte b17 = 0;
                    h9d0Var.c(18, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b18 = b17;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b18) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (!uv81Var2.m.equals(uv81Var.m)) {
                    final byte b18 = 1;
                    h9d0Var.c(20, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b19 = b18;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b19) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (!uv81Var2.f155p.equals(uv81Var.f155p)) {
                    final byte b19 = 2;
                    h9d0Var.c(25, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b110 = b19;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b110) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (!uv81Var2.r.equals(uv81Var.r)) {
                    final byte b20 = 3;
                    h9d0Var.c(29, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b110 = b20;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b110) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (!uv81Var2.y.equals(uv81Var.y)) {
                    final byte b21 = 4;
                    h9d0Var.c(15, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b110 = b21;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b110) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (!uv81Var2.t.equals(uv81Var.t)) {
                    final byte b22 = 5;
                    h9d0Var.c(24, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b110 = b22;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b110) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (uv81Var2.n != uv81Var.n) {
                    final byte b23 = 6;
                    h9d0Var.c(22, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b110 = b23;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b110) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (uv81Var2.s != uv81Var.s) {
                    h9d0Var.c(30, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b110 = b10;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b110) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (!uv81Var2.q.equals(uv81Var.q)) {
                    h9d0Var.c(27, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b110 = b12;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b110) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (!uv81Var2.u.equals(hjj0Var) && hjj0Var.b != -9223372036854775807L) {
                    final byte b24 = 9;
                    h9d0Var.c(28, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b110 = b24;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b110) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                if (!uv81Var2.a.equals(uv81Var.a)) {
                    final byte b25 = 10;
                    h9d0Var.c(13, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b110 = b25;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b110) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
                h9d0Var.b();
            }
            z4 = z8;
            i2 = 3;
            h9d0Var = this.b;
            if (!zEquals) {
                if (sqe1Var3.o() == sqe1Var.o()) {
                    i3 = 0;
                    while (true) {
                        if (i3 >= sqe1Var3.o()) {
                            i4 = 1;
                            break;
                        }
                        obj = sqe1Var3.n(i3, oqe1Var, 0L).a;
                        sqe1 sqe1Var5 = sqe1Var3;
                        obj2 = sqe1Var.n(i3, oqe1Var, 0L).a;
                        if (obj instanceof pv81) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (obj.equals(obj2)) {
                        }
                        i3++;
                        sqe1Var3 = sqe1Var5;
                    }
                } else {
                    i4 = 0;
                    break;
                }
                h9d0Var.c(0, new mp5(uv81Var, i4, (byte) 9));
            }
            b = 11;
            if (i != -1) {
                h9d0Var.c(11, new oo00(i, m1(uv81Var2, oqe1Var, dqe1Var), m1(uv81Var, oqe1Var, dqe1Var), (byte) 1));
            }
            if (i2 != -1) {
                if (sqe1Var.p()) {
                    yoh0Var = null;
                } else {
                    if (i5 == -1) {
                        i5 = 0;
                    }
                    yoh0Var = sqe1Var.n(i5, oqe1Var, 0L).c;
                }
                h9d0Var.c(1, new po00(yoh0Var, i2, (byte) 1));
            }
            b2 = 12;
            if (uv81Var2.e != playbackException) {
                h9d0Var.c(10, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
                if (playbackException != null) {
                    h9d0Var.c(10, new e9d0() { // from class: p.kv81
                        public final void invoke(Object obj5) {
                            byte b110 = b2;
                            uv81 uv81Var3 = uv81Var;
                            o8u0 o8u0Var = (o8u0) obj5;
                            switch (b110) {
                                case 0:
                                    o8u0Var.y0(uv81Var3.j);
                                    break;
                                case 1:
                                    o8u0Var.Y(uv81Var3.m);
                                    break;
                                case 2:
                                    o8u0Var.b(uv81Var3.f155p);
                                    break;
                                case 3:
                                    o8u0Var.q0(uv81Var3.r);
                                    break;
                                case 4:
                                    o8u0Var.A(uv81Var3.y);
                                    break;
                                case 5:
                                    l291 l291Var = uv81Var3.t;
                                    o8u0Var.X(l291Var.a, l291Var.b);
                                    break;
                                case 6:
                                    o8u0Var.h0(uv81Var3.n);
                                    break;
                                case 7:
                                    o8u0Var.O(uv81Var3.s, false);
                                    break;
                                case 8:
                                    o8u0Var.l(uv81Var3.q.a);
                                    o8u0Var.o(uv81Var3.q);
                                    break;
                                case 9:
                                    o8u0Var.u(uv81Var3.u);
                                    break;
                                case 10:
                                    o8u0Var.p0(uv81Var3.a);
                                    break;
                                case 11:
                                    o8u0Var.x0(uv81Var3.e);
                                    break;
                                case 12:
                                    PlaybackException playbackException2 = uv81Var3.e;
                                    String str = zoi1.a;
                                    o8u0Var.n(playbackException2);
                                    break;
                                case 13:
                                    o8u0Var.B(uv81Var3.l);
                                    break;
                                case 14:
                                    o8u0Var.C(uv81Var3.w);
                                    break;
                                case 15:
                                    o8u0Var.n0(uv81Var3.x);
                                    break;
                                case 16:
                                    o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                    break;
                                case 17:
                                    o8u0Var.H(uv81Var3.d);
                                    break;
                                case 18:
                                    o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                    break;
                                case 19:
                                    o8u0Var.E0(vv81.r1(uv81Var3));
                                    break;
                                case 20:
                                    o8u0Var.r0(uv81Var3.k);
                                    break;
                                case 21:
                                    o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                    break;
                                case 22:
                                    o8u0Var.K(uv81Var3.g);
                                    break;
                                case 23:
                                    o8u0Var.P(uv81Var3.h);
                                    break;
                                default:
                                    o8u0Var.t0(uv81Var3.i);
                                    break;
                            }
                        }
                    });
                }
            }
            b3 = 13;
            b4 = 19;
            if (!uv81Var2.l.equals(uv81Var.l)) {
                h9d0Var.c(19, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b3;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            b5 = 14;
            if (!uv81Var2.w.equals(uv81Var.w)) {
                h9d0Var.c(2, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b5;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            b6 = 15;
            if (!uv81Var2.x.equals(uv81Var.x)) {
                h9d0Var.c(14, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b6;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            b7 = 16;
            if (z3) {
                h9d0Var.c(-1, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b7;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            } else {
                h9d0Var.c(-1, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b7;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            b8 = 17;
            if (z4) {
                h9d0Var.c(4, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b8;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            b9 = 18;
            if (z3) {
                h9d0Var.c(5, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b9;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            } else {
                h9d0Var.c(5, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b9;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            b10 = 7;
            if (r1(uv81Var2) != r1(uv81Var)) {
                h9d0Var.c(7, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b4;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            b11 = 20;
            if (!uv81Var2.k.equals(uv81Var.k)) {
                h9d0Var.c(12, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b110 = b11;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b110) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            b12 = 8;
            if (uv81Var2.f != uv81Var.f) {
                final byte b110 = 21;
                h9d0Var.c(8, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b111 = b110;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b111) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            b13 = 22;
            if (uv81Var2.g != uv81Var.g) {
                h9d0Var.c(9, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b111 = b13;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b111) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (uv81Var2.h != uv81Var.h) {
                final byte b111 = 23;
                h9d0Var.c(16, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b112 = b111;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b112) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            b14 = 24;
            if (uv81Var2.i != uv81Var.i) {
                h9d0Var.c(17, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b112 = b14;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b112) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (uv81Var2.j != uv81Var.j) {
                final byte b112 = 0;
                h9d0Var.c(18, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b113 = b112;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b113) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (!uv81Var2.m.equals(uv81Var.m)) {
                final byte b113 = 1;
                h9d0Var.c(20, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b114 = b113;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b114) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (!uv81Var2.f155p.equals(uv81Var.f155p)) {
                final byte b114 = 2;
                h9d0Var.c(25, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b115 = b114;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b115) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (!uv81Var2.r.equals(uv81Var.r)) {
                final byte b26 = 3;
                h9d0Var.c(29, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b115 = b26;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b115) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (!uv81Var2.y.equals(uv81Var.y)) {
                final byte b27 = 4;
                h9d0Var.c(15, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b115 = b27;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b115) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (!uv81Var2.t.equals(uv81Var.t)) {
                final byte b28 = 5;
                h9d0Var.c(24, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b115 = b28;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b115) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (uv81Var2.n != uv81Var.n) {
                final byte b29 = 6;
                h9d0Var.c(22, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b115 = b29;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b115) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (uv81Var2.s != uv81Var.s) {
                h9d0Var.c(30, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b115 = b10;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b115) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (!uv81Var2.q.equals(uv81Var.q)) {
                h9d0Var.c(27, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b115 = b12;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b115) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (!uv81Var2.u.equals(hjj0Var)) {
                final byte b210 = 9;
                h9d0Var.c(28, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b115 = b210;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b115) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            if (!uv81Var2.a.equals(uv81Var.a)) {
                final byte b211 = 10;
                h9d0Var.c(13, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b115 = b211;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b115) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
            h9d0Var.b();
        }
        z4 = z8;
        i2 = -1;
        h9d0Var = this.b;
        if (!zEquals) {
            if (sqe1Var3.o() == sqe1Var.o()) {
                i3 = 0;
                while (true) {
                    if (i3 >= sqe1Var3.o()) {
                        i4 = 1;
                        break;
                    }
                    obj = sqe1Var3.n(i3, oqe1Var, 0L).a;
                    sqe1 sqe1Var6 = sqe1Var3;
                    obj2 = sqe1Var.n(i3, oqe1Var, 0L).a;
                    if (obj instanceof pv81) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (obj.equals(obj2)) {
                    }
                    i3++;
                    sqe1Var3 = sqe1Var6;
                }
            } else {
                i4 = 0;
                break;
            }
            h9d0Var.c(0, new mp5(uv81Var, i4, (byte) 9));
        }
        b = 11;
        if (i != -1) {
            h9d0Var.c(11, new oo00(i, m1(uv81Var2, oqe1Var, dqe1Var), m1(uv81Var, oqe1Var, dqe1Var), (byte) 1));
        }
        if (i2 != -1) {
            if (sqe1Var.p()) {
                yoh0Var = null;
            } else {
                if (i5 == -1) {
                    i5 = 0;
                }
                yoh0Var = sqe1Var.n(i5, oqe1Var, 0L).c;
            }
            h9d0Var.c(1, new po00(yoh0Var, i2, (byte) 1));
        }
        b2 = 12;
        if (uv81Var2.e != playbackException) {
            h9d0Var.c(10, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
            if (playbackException != null) {
                h9d0Var.c(10, new e9d0() { // from class: p.kv81
                    public final void invoke(Object obj5) {
                        byte b115 = b2;
                        uv81 uv81Var3 = uv81Var;
                        o8u0 o8u0Var = (o8u0) obj5;
                        switch (b115) {
                            case 0:
                                o8u0Var.y0(uv81Var3.j);
                                break;
                            case 1:
                                o8u0Var.Y(uv81Var3.m);
                                break;
                            case 2:
                                o8u0Var.b(uv81Var3.f155p);
                                break;
                            case 3:
                                o8u0Var.q0(uv81Var3.r);
                                break;
                            case 4:
                                o8u0Var.A(uv81Var3.y);
                                break;
                            case 5:
                                l291 l291Var = uv81Var3.t;
                                o8u0Var.X(l291Var.a, l291Var.b);
                                break;
                            case 6:
                                o8u0Var.h0(uv81Var3.n);
                                break;
                            case 7:
                                o8u0Var.O(uv81Var3.s, false);
                                break;
                            case 8:
                                o8u0Var.l(uv81Var3.q.a);
                                o8u0Var.o(uv81Var3.q);
                                break;
                            case 9:
                                o8u0Var.u(uv81Var3.u);
                                break;
                            case 10:
                                o8u0Var.p0(uv81Var3.a);
                                break;
                            case 11:
                                o8u0Var.x0(uv81Var3.e);
                                break;
                            case 12:
                                PlaybackException playbackException2 = uv81Var3.e;
                                String str = zoi1.a;
                                o8u0Var.n(playbackException2);
                                break;
                            case 13:
                                o8u0Var.B(uv81Var3.l);
                                break;
                            case 14:
                                o8u0Var.C(uv81Var3.w);
                                break;
                            case 15:
                                o8u0Var.n0(uv81Var3.x);
                                break;
                            case 16:
                                o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                                break;
                            case 17:
                                o8u0Var.H(uv81Var3.d);
                                break;
                            case 18:
                                o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                                break;
                            case 19:
                                o8u0Var.E0(vv81.r1(uv81Var3));
                                break;
                            case 20:
                                o8u0Var.r0(uv81Var3.k);
                                break;
                            case 21:
                                o8u0Var.onRepeatModeChanged(uv81Var3.f);
                                break;
                            case 22:
                                o8u0Var.K(uv81Var3.g);
                                break;
                            case 23:
                                o8u0Var.P(uv81Var3.h);
                                break;
                            default:
                                o8u0Var.t0(uv81Var3.i);
                                break;
                        }
                    }
                });
            }
        }
        b3 = 13;
        b4 = 19;
        if (!uv81Var2.l.equals(uv81Var.l)) {
            h9d0Var.c(19, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b3;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        b5 = 14;
        if (!uv81Var2.w.equals(uv81Var.w)) {
            h9d0Var.c(2, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b5;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        b6 = 15;
        if (!uv81Var2.x.equals(uv81Var.x)) {
            h9d0Var.c(14, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b6;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        b7 = 16;
        if (z3) {
            h9d0Var.c(-1, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b7;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        } else {
            h9d0Var.c(-1, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b7;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        b8 = 17;
        if (z4) {
            h9d0Var.c(4, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b8;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        b9 = 18;
        if (z3) {
            h9d0Var.c(5, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b9;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        } else {
            h9d0Var.c(5, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b9;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        b10 = 7;
        if (r1(uv81Var2) != r1(uv81Var)) {
            h9d0Var.c(7, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b4;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        b11 = 20;
        if (!uv81Var2.k.equals(uv81Var.k)) {
            h9d0Var.c(12, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b115 = b11;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b115) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        b12 = 8;
        if (uv81Var2.f != uv81Var.f) {
            final byte b115 = 21;
            h9d0Var.c(8, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b116 = b115;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b116) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        b13 = 22;
        if (uv81Var2.g != uv81Var.g) {
            h9d0Var.c(9, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b116 = b13;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b116) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (uv81Var2.h != uv81Var.h) {
            final byte b116 = 23;
            h9d0Var.c(16, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b117 = b116;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b117) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        b14 = 24;
        if (uv81Var2.i != uv81Var.i) {
            h9d0Var.c(17, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b117 = b14;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b117) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (uv81Var2.j != uv81Var.j) {
            final byte b117 = 0;
            h9d0Var.c(18, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b118 = b117;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b118) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (!uv81Var2.m.equals(uv81Var.m)) {
            final byte b118 = 1;
            h9d0Var.c(20, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b119 = b118;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b119) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (!uv81Var2.f155p.equals(uv81Var.f155p)) {
            final byte b119 = 2;
            h9d0Var.c(25, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b1110 = b119;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b1110) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (!uv81Var2.r.equals(uv81Var.r)) {
            final byte b212 = 3;
            h9d0Var.c(29, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b1110 = b212;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b1110) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (!uv81Var2.y.equals(uv81Var.y)) {
            final byte b213 = 4;
            h9d0Var.c(15, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b1110 = b213;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b1110) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (!uv81Var2.t.equals(uv81Var.t)) {
            final byte b214 = 5;
            h9d0Var.c(24, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b1110 = b214;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b1110) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (uv81Var2.n != uv81Var.n) {
            final byte b215 = 6;
            h9d0Var.c(22, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b1110 = b215;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b1110) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (uv81Var2.s != uv81Var.s) {
            h9d0Var.c(30, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b1110 = b10;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b1110) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (!uv81Var2.q.equals(uv81Var.q)) {
            h9d0Var.c(27, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b1110 = b12;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b1110) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (!uv81Var2.u.equals(hjj0Var)) {
            final byte b216 = 9;
            h9d0Var.c(28, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b1110 = b216;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b1110) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        if (!uv81Var2.a.equals(uv81Var.a)) {
            final byte b217 = 10;
            h9d0Var.c(13, new e9d0() { // from class: p.kv81
                public final void invoke(Object obj5) {
                    byte b1110 = b217;
                    uv81 uv81Var3 = uv81Var;
                    o8u0 o8u0Var = (o8u0) obj5;
                    switch (b1110) {
                        case 0:
                            o8u0Var.y0(uv81Var3.j);
                            break;
                        case 1:
                            o8u0Var.Y(uv81Var3.m);
                            break;
                        case 2:
                            o8u0Var.b(uv81Var3.f155p);
                            break;
                        case 3:
                            o8u0Var.q0(uv81Var3.r);
                            break;
                        case 4:
                            o8u0Var.A(uv81Var3.y);
                            break;
                        case 5:
                            l291 l291Var = uv81Var3.t;
                            o8u0Var.X(l291Var.a, l291Var.b);
                            break;
                        case 6:
                            o8u0Var.h0(uv81Var3.n);
                            break;
                        case 7:
                            o8u0Var.O(uv81Var3.s, false);
                            break;
                        case 8:
                            o8u0Var.l(uv81Var3.q.a);
                            o8u0Var.o(uv81Var3.q);
                            break;
                        case 9:
                            o8u0Var.u(uv81Var3.u);
                            break;
                        case 10:
                            o8u0Var.p0(uv81Var3.a);
                            break;
                        case 11:
                            o8u0Var.x0(uv81Var3.e);
                            break;
                        case 12:
                            PlaybackException playbackException2 = uv81Var3.e;
                            String str = zoi1.a;
                            o8u0Var.n(playbackException2);
                            break;
                        case 13:
                            o8u0Var.B(uv81Var3.l);
                            break;
                        case 14:
                            o8u0Var.C(uv81Var3.w);
                            break;
                        case 15:
                            o8u0Var.n0(uv81Var3.x);
                            break;
                        case 16:
                            o8u0Var.v0(uv81Var3.d, uv81Var3.b);
                            break;
                        case 17:
                            o8u0Var.H(uv81Var3.d);
                            break;
                        case 18:
                            o8u0Var.g0(uv81Var3.c ? 1 : 0, uv81Var3.b);
                            break;
                        case 19:
                            o8u0Var.E0(vv81.r1(uv81Var3));
                            break;
                        case 20:
                            o8u0Var.r0(uv81Var3.k);
                            break;
                        case 21:
                            o8u0Var.onRepeatModeChanged(uv81Var3.f);
                            break;
                        case 22:
                            o8u0Var.K(uv81Var3.g);
                            break;
                        case 23:
                            o8u0Var.P(uv81Var3.h);
                            break;
                        default:
                            o8u0Var.t0(uv81Var3.i);
                            break;
                    }
                }
            });
        }
        h9d0Var.b();
    }

    public final long v() {
        w1();
        return o() ? this.g.D.get() : K0();
    }

    public final int v0() {
        w1();
        return k1(this.g, (oqe1) ((j9a) this).a, this.f);
    }

    public final void v1(v0d1 v0d1Var, boolean z, boolean z2) {
        f280 f280Var = f280.b;
        Set set = this.e;
        if (set.isEmpty()) {
            u1(((x5b1) this).l, z, z2);
            return;
        }
        set.add(f280Var);
        u1((uv81) v0d1Var.get(), z, z2);
        f280Var.b(new v241(this), new wkh0(this, (byte) 7));
    }

    public final z1k1 w0() {
        w1();
        return this.g.f155p;
    }

    public final void w1() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.c;
        if (threadCurrentThread == looper.getThread()) {
            if (this.g == null) {
                this.g = ((x5b1) this).l;
            }
        } else {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zoi1.a;
            Locale locale = Locale.US;
            eg.m(cy30.p("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\n"));
        }
    }

    public final po7 x0() {
        w1();
        return this.g.m;
    }

    public final xqt y0() {
        w1();
        return this.g.r;
    }

    public final void z(int i, boolean z) {
        w1();
        if (t1(34)) {
            eg.m("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
        }
    }
}
