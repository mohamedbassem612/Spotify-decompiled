package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ua80 implements f6v {
    public final m5v a;
    public pa80 b;
    public sa80 c;
    public ra80 d;
    public qa80 e;
    public b5p1 f;
    public tui1 g;
    public o0g h;
    public final sw9 i;
    public final sw9 t;

    public ua80(m5v m5vVar) {
        this.a = m5vVar;
        sw9 sw9Var = new sw9((byte) 14, false);
        sw9Var.c = new wdn0();
        this.i = sw9Var;
        sw9 sw9Var2 = new sw9((byte) 24, false);
        sw9Var2.c = new ldn0();
        this.t = sw9Var2;
    }

    public static void d(ua80 ua80Var, oa80 oa80Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        m5v m5vVar = ua80Var.a;
        ra80 ra80Var = ua80Var.d;
        if (ra80Var == null) {
            ra80Var = new ra80();
            ra80Var.c = null;
            ra80Var.d = Long.MAX_VALUE;
            ra80Var.e = false;
            ua80Var.d = ra80Var;
        }
        ra80Var.c = oa80Var;
        ra80Var.d = j;
        o0g o0gVar = ua80Var.h;
        qqq0 qqq0Var = m5vVar.Q0;
        if (o0gVar == null) {
            ua80Var.h = new o0g(qqq0Var);
        } else {
            o0gVar.c = qqq0Var;
            o0gVar.b = j2;
        }
        ra80Var.e = false;
        ua80Var.f = ra80Var;
    }

    public final String Q() {
        b5p1 b5p1Var = this.f;
        if (b5p1Var instanceof pa80) {
            return ((pa80) b5p1Var).e ? "waiting" : "idle";
        }
        if ((b5p1Var instanceof ra80) || (b5p1Var instanceof qa80)) {
            return "waiting";
        }
        return b5p1Var instanceof sa80 ? "recognized" : "idle";
    }

    @Override // p.f6v
    public final qqq0 a() {
        return this.a.Q0;
    }

    public final void b() {
        pa80 pa80Var = this.b;
        if (pa80Var == null) {
            pa80Var = new pa80();
            pa80Var.c = 3;
            pa80Var.d = false;
            pa80Var.e = false;
            this.b = pa80Var;
        }
        pa80Var.c = 3;
        pa80Var.d = false;
        pa80Var.e = false;
        this.f = pa80Var;
    }

    public final void c(oa80 oa80Var, long j, o0g o0gVar) {
        qa80 qa80Var = this.e;
        if (qa80Var == null) {
            qa80Var = new qa80();
            qa80Var.c = null;
            qa80Var.d = Long.MAX_VALUE;
            this.e = qa80Var;
        }
        qa80Var.c = oa80Var;
        qa80Var.d = j;
        o0gVar.b = 0L;
        this.f = qa80Var;
    }

    public final void e(mgc mgcVar, cav0 cav0Var) {
        Object obj;
        float f;
        char c;
        float fIntBitsToFloat;
        Object obj2;
        ra80 ra80Var;
        oa80 oa80Var;
        Object obj3;
        pa80 pa80Var;
        int i = mgcVar.b;
        ArrayList arrayList = (ArrayList) mgcVar.c;
        b5p1 b5p1Var = this.f;
        Object obj4 = b5p1Var;
        if (b5p1Var == null) {
            pa80 pa80Var2 = this.b;
            if (pa80Var2 == null) {
                pa80Var = pa80Var2;
                pa80 pa80Var3 = new pa80();
                pa80Var3.c = 3;
                pa80Var3.d = false;
                pa80Var3.e = false;
                this.b = pa80Var3;
                pa80Var = pa80Var3;
            }
            pa80Var = pa80Var2;
            this.f = pa80Var;
            obj4 = pa80Var;
        }
        boolean z = obj4 instanceof pa80;
        cav0 cav0Var2 = cav0.a;
        cav0 cav0Var3 = cav0.b;
        m5v m5vVar = this.a;
        boolean z2 = true;
        if (z) {
            pa80 pa80Var4 = (pa80) obj4;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!d5p1.i((oa80) arrayList.get(i2))) {
                    return;
                }
            }
            oa80 oa80Var2 = (oa80) o7h.q0(arrayList);
            int i3 = ta80.a[l1d.C(pa80Var4.c)] == 1 ? !m5vVar.Z1() ? 1 : 2 : pa80Var4.c;
            pa80Var4.c = i3;
            if (cav0Var == cav0Var2) {
                if (i3 == 2) {
                    oa80Var2.i = true;
                    pa80Var4.d = true;
                }
                pa80Var4.e = true;
            }
            if (cav0Var == cav0Var3) {
                if (i3 == 1) {
                    d(this, oa80Var2, oa80Var2.a, 0L, 12);
                    return;
                }
                if (pa80Var4.d) {
                    i(oa80Var2, oa80Var2, new na80(i), 0L);
                    h(oa80Var2, new na80(i), 0L);
                    long j = oa80Var2.a;
                    sa80 sa80Var = this.c;
                    if (sa80Var == null) {
                        sa80Var = new sa80();
                        sa80Var.c = Long.MAX_VALUE;
                        this.c = sa80Var;
                    }
                    sa80Var.c = j;
                    this.f = sa80Var;
                    return;
                }
                return;
            }
            return;
        }
        boolean z3 = obj4 instanceof ra80;
        cav0 cav0Var4 = cav0.c;
        Object obj5 = null;
        if (z3) {
            ra80 ra80Var2 = (ra80) obj4;
            if (cav0Var == cav0Var2) {
                return;
            }
            int size2 = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i4);
                if (w8p1.n(((oa80) obj2).a, ra80Var2.d)) {
                    break;
                } else {
                    i4++;
                }
            }
            oa80 oa80Var3 = (oa80) obj2;
            if (oa80Var3 == null) {
                int size3 = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i5);
                    if (((oa80) obj3).d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                oa80Var3 = (oa80) obj3;
                if (oa80Var3 == null) {
                    b();
                    return;
                }
                ra80Var2.d = oa80Var3.a;
            }
            if (cav0Var != cav0Var3) {
                ra80Var = ra80Var2;
                oa80Var = oa80Var3;
            } else if (oa80Var3.i) {
                ra80Var = ra80Var2;
                oa80Var = oa80Var3;
                oa80 oa80Var4 = ra80Var.c;
                if (oa80Var4 == null) {
                    hhg1.n("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j2 = ra80Var.d;
                o0g o0gVar = this.h;
                if (o0gVar == null) {
                    hhg1.n("AwaitTouchSlop.touchSlopDetector was not initialized");
                    return;
                }
                c(oa80Var4, j2, o0gVar);
            } else if (d5p1.j(oa80Var3)) {
                int size4 = arrayList.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    Object obj6 = arrayList.get(i6);
                    if (((oa80) obj6).d) {
                        obj5 = obj6;
                        break;
                    }
                }
                oa80 oa80Var5 = (oa80) obj5;
                if (oa80Var5 == null) {
                    b();
                } else {
                    ra80Var2.d = oa80Var5.a;
                }
                ra80Var = ra80Var2;
                oa80Var = oa80Var3;
            } else {
                e8k1 e8k1Var = (e8k1) lcc.z(m5vVar, t4k.t);
                float f2 = g5v.a;
                float fG = e8k1Var.g();
                o0g o0gVar2 = this.h;
                if (o0gVar2 == null) {
                    hhg1.n("Touch slop detector not initialized.");
                    return;
                }
                long jG = o0g.G(o0gVar2, d5p1.n(oa80Var3, m5vVar.Q0, new na80(i), true), fG);
                if ((9223372034707292159L & jG) != 9205357640488583168L) {
                    oa80Var3.i = true;
                    oa80 oa80Var6 = ra80Var2.c;
                    oa80Var6.getClass();
                    ra80Var = ra80Var2;
                    oa80Var = oa80Var3;
                    i(oa80Var6, oa80Var, new na80(i), jG);
                    h(oa80Var, new na80(i), jG);
                    long j3 = oa80Var.a;
                    sa80 sa80Var2 = this.c;
                    if (sa80Var2 == null) {
                        sa80Var2 = new sa80();
                        sa80Var2.c = Long.MAX_VALUE;
                        this.c = sa80Var2;
                    }
                    sa80Var2.c = j3;
                    this.f = sa80Var2;
                } else {
                    ra80Var = ra80Var2;
                    oa80Var = oa80Var3;
                    ra80Var.e = true;
                }
            }
            if (cav0Var == cav0Var4 && ra80Var.e) {
                if (!oa80Var.i) {
                    ra80Var.e = false;
                    return;
                }
                oa80 oa80Var7 = ra80Var.c;
                if (oa80Var7 == null) {
                    hhg1.n("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j4 = ra80Var.d;
                o0g o0gVar3 = this.h;
                if (o0gVar3 != null) {
                    c(oa80Var7, j4, o0gVar3);
                    return;
                } else {
                    hhg1.n("AwaitTouchSlop.touchSlopDetector was not initialized");
                    return;
                }
            }
            return;
        }
        if (obj4 instanceof qa80) {
            qa80 qa80Var = (qa80) obj4;
            if (cav0Var != cav0Var4) {
                return;
            }
            int size5 = arrayList.size();
            for (int i7 = 0; i7 < size5; i7++) {
                if (((oa80) arrayList.get(i7)).i) {
                    z2 = false;
                    break;
                }
            }
            int size6 = arrayList.size();
            for (int i8 = 0; i8 < size6; i8++) {
                if (((oa80) arrayList.get(i8)).d) {
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    if (z2) {
                        long jO = d5p1.o((oa80) o7h.q0(arrayList), m5vVar.Q0, new na80(i));
                        oa80 oa80Var8 = qa80Var.c;
                        oa80Var8.getClass();
                        long jF = Offset.f(jO, d5p1.o(oa80Var8, m5vVar.Q0, new na80(i)));
                        oa80 oa80Var9 = qa80Var.c;
                        if (oa80Var9 != null) {
                            d(this, oa80Var9, qa80Var.d, jF, 8);
                            return;
                        } else {
                            hhg1.n("AwaitGesturePickup.initialDown was not initialized.");
                            return;
                        }
                    }
                    return;
                }
            }
            b();
            return;
        }
        if (!(obj4 instanceof sa80)) {
            eg.o();
            return;
        }
        sa80 sa80Var3 = (sa80) obj4;
        if (cav0Var != cav0Var3) {
            return;
        }
        long j5 = sa80Var3.c;
        int size7 = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size7) {
                obj = null;
                break;
            }
            obj = arrayList.get(i9);
            if (w8p1.n(((oa80) obj).a, j5)) {
                break;
            } else {
                i9++;
            }
        }
        oa80 oa80Var10 = (oa80) obj;
        if (oa80Var10 == null) {
            return;
        }
        long j6 = oa80Var10.c;
        boolean zJ = d5p1.j(oa80Var10);
        k4v k4vVar = k4v.a;
        if (!zJ) {
            if (oa80Var10.i) {
                m5vVar.P1(k4vVar);
                return;
            } else {
                if (Offset.d(d5p1.n(oa80Var10, m5vVar.Q0, new na80(i), true)) == 0.0f) {
                    return;
                }
                h(oa80Var10, new na80(i), d5p1.n(oa80Var10, m5vVar.Q0, new na80(i), false));
                oa80Var10.i = true;
                return;
            }
        }
        int size8 = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size8) {
                f = 0.0f;
                break;
            }
            Object obj7 = arrayList.get(i10);
            f = 0.0f;
            if (((oa80) obj7).d) {
                obj5 = obj7;
                break;
            }
            i10++;
        }
        oa80 oa80Var11 = (oa80) obj5;
        if (oa80Var11 != null) {
            sa80Var3.c = oa80Var11.a;
            return;
        }
        if (oa80Var10.i || !d5p1.j(oa80Var10)) {
            m5vVar.P1(k4vVar);
        } else {
            tui1 tui1VarF = f();
            qqq0 qqq0Var = m5vVar.Q0;
            sw9 sw9Var = this.i;
            wdn0 wdn0Var = (wdn0) sw9Var.c;
            char c2 = ' ';
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 & 4294967295L));
            if (d5p1.i(oa80Var10)) {
                sw9Var.b = 0;
                wdn0Var.e();
            }
            if (d5p1.j(oa80Var10) || d5p1.i(oa80Var10)) {
                c = ' ';
            } else {
                if (wdn0Var.b == 3) {
                    int i11 = sw9Var.b;
                    sw9Var.b = i11 + 1;
                    wdn0Var.o(i11, oa80Var10);
                } else {
                    wdn0Var.b(oa80Var10);
                }
                if (sw9Var.b == 3) {
                    sw9Var.b = 0;
                }
                Object[] objArr = wdn0Var.a;
                int i12 = wdn0Var.b;
                float fIntBitsToFloat4 = f;
                for (int i13 = 0; i13 < i12; i13++) {
                    fIntBitsToFloat4 += Float.intBitsToFloat((int) (((oa80) objArr[i13]).c >> 32));
                }
                int i14 = wdn0Var.b;
                fIntBitsToFloat2 = fIntBitsToFloat4 / i14;
                Object[] objArr2 = wdn0Var.a;
                float fIntBitsToFloat5 = f;
                int i15 = 0;
                while (i15 < i14) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((oa80) objArr2[i15]).c & 4294967295L));
                    i15++;
                    c2 = c2;
                }
                c = c2;
                fIntBitsToFloat3 = fIntBitsToFloat5 / wdn0Var.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
            if (qqq0Var != null) {
                if (i == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
                } else if (i == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                }
                jFloatToRawIntBits = qqq0Var == qqq0.b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(f)) & 4294967295L) : (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
            }
            tui1VarF.a(oa80Var10.b, jFloatToRawIntBits);
            float f3 = ((e8k1) lcc.z(m5vVar, t4k.t)).f();
            long jC = f().c(j2h1.g(f3, f3));
            f().d();
            m5vVar.P1(new n4v(k6v.d(jC), true));
        }
        b();
    }

    public final tui1 f() {
        tui1 tui1Var = this.g;
        if (tui1Var != null) {
            return tui1Var;
        }
        hhg1.n("Velocity Tracker not initialized.");
        return null;
    }

    public final void g() {
        b();
        m5v m5vVar = this.a;
        if (m5vVar.W0) {
            m5vVar.P1(k4v.a);
        }
        this.g = null;
        sw9 sw9Var = this.t;
        sw9Var.b = 0;
        ((ldn0) sw9Var.c).b = 0;
    }

    public final void h(oa80 oa80Var, na80 na80Var, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = oa80Var.c;
        m5v m5vVar = this.a;
        qqq0 qqq0Var = m5vVar.Q0;
        qqq0Var.getClass();
        bz0 bz0Var = k6v.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (qqq0Var == qqq0.a ? j & 4294967295L : j >> 32))) > 2.0f) {
            tui1 tui1VarF = f();
            qqq0 qqq0Var2 = m5vVar.Q0;
            sw9 sw9Var = this.i;
            wdn0 wdn0Var = (wdn0) sw9Var.c;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (d5p1.i(oa80Var)) {
                sw9Var.b = 0;
                wdn0Var.e();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (d5p1.j(oa80Var) || d5p1.i(oa80Var)) {
                j2 = 4294967295L;
            } else {
                if (wdn0Var.b == 3) {
                    int i = sw9Var.b;
                    sw9Var.b = i + 1;
                    wdn0Var.o(i, oa80Var);
                } else {
                    wdn0Var.b(oa80Var);
                }
                if (sw9Var.b == 3) {
                    sw9Var.b = 0;
                }
                Object[] objArr = wdn0Var.a;
                int i2 = wdn0Var.b;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((oa80) objArr[i3]).c >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = wdn0Var.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = wdn0Var.a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((oa80) objArr2[i5]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / wdn0Var.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (qqq0Var2 != null) {
                int i6 = na80Var.a;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = qqq0Var2 == qqq0.b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            tui1VarF.a(oa80Var.b, jFloatToRawIntBits);
            sw9 sw9Var2 = this.t;
            ldn0 ldn0Var = (ldn0) sw9Var2.c;
            if (ldn0Var.b == 3) {
                int i7 = sw9Var2.b;
                sw9Var2.b = i7 + 1;
                ldn0Var.f(i7, j);
            } else {
                ldn0Var.a(j);
            }
            if (sw9Var2.b == 3) {
                sw9Var2.b = 0;
            }
            long[] jArr = ldn0Var.a;
            int i8 = ldn0Var.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i9 = 0; i9 < i8; i9++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr[i9] >> 32));
            }
            int i10 = ldn0Var.b;
            float f = fIntBitsToFloat7 / i10;
            long[] jArr2 = ldn0Var.a;
            for (int i11 = 0; i11 < i10; i11++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr2[i11] & j2)) + fIntBitsToFloat4;
            }
            m5vVar.P1(new l4v((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / ldn0Var.b)) & j2), true));
        }
    }

    public final void i(oa80 oa80Var, oa80 oa80Var2, na80 na80Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.g == null) {
            this.g = new tui1();
        }
        tui1 tui1VarF = f();
        m5v m5vVar = this.a;
        qqq0 qqq0Var = m5vVar.Q0;
        sw9 sw9Var = this.i;
        wdn0 wdn0Var = (wdn0) sw9Var.c;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (oa80Var.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (oa80Var.c & 4294967295L));
        if (d5p1.i(oa80Var)) {
            sw9Var.b = 0;
            wdn0Var.e();
        }
        if (d5p1.j(oa80Var) || d5p1.i(oa80Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (wdn0Var.b == 3) {
                int i = sw9Var.b;
                sw9Var.b = i + 1;
                wdn0Var.o(i, oa80Var);
            } else {
                wdn0Var.b(oa80Var);
            }
            if (sw9Var.b == 3) {
                sw9Var.b = 0;
            }
            Object[] objArr = wdn0Var.a;
            int i2 = wdn0Var.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((oa80) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = wdn0Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = wdn0Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((oa80) objArr2[i5]).c & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / wdn0Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (qqq0Var != null) {
            int i6 = na80Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = qqq0Var == qqq0.b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        }
        tui1VarF.a(oa80Var.b, jFloatToRawIntBits);
        long jF = Offset.f(d5p1.o(oa80Var2, m5vVar.Q0, na80Var), j);
        if (((Boolean) m5vVar.R0.invoke(new rav0(1))).booleanValue()) {
            m5vVar.P1(new m4v(jF));
        }
        sw9 sw9Var2 = this.t;
        sw9Var2.b = 0;
        ((ldn0) sw9Var2.c).b = 0;
    }
}
