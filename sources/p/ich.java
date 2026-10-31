package p;

import android.view.KeyEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ich extends i6 {
    public boolean A1;
    public boolean B1;
    public long C1;
    public boolean D1;
    public String k1;
    public Function0 l1;
    public Function0 m1;
    public boolean n1;
    public final mdn0 o1;
    public final mdn0 p1;
    public hav0 q1;
    public faa0 r1;
    public faa0 s1;
    public boolean t1;
    public boolean u1;
    public long v1;
    public boolean w1;
    public oa80 x1;
    public faa0 y1;
    public faa0 z1;

    public ich(String str, String str2, Function0 function0, Function0 function1, Function0 function2, ga80 ga80Var, idn0 idn0Var, pm31 pm31Var, boolean z, boolean z2) {
        super(idn0Var, ga80Var, z, z2, str2, pm31Var, function0);
        this.k1 = str;
        this.l1 = function1;
        this.m1 = function2;
        this.n1 = true;
        int i = a5f0.a;
        this.o1 = new mdn0(6);
        this.p1 = new mdn0(6);
        this.v1 = -1L;
        this.C1 = -1L;
    }

    @Override // p.pim0
    public final void B1() {
        b2();
    }

    @Override // p.i6, p.mav0
    public final void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        super.D0(bav0Var, cav0Var, j);
        if (cav0Var != cav0.b) {
            if (cav0Var != cav0.c || this.q1 == null || this.u1) {
                return;
            }
            List list = bav0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                hav0 hav0Var = (hav0) list.get(i);
                if (hav0Var.l() && hav0Var != this.q1) {
                    Y1(false);
                    return;
                }
            }
            return;
        }
        if (this.q1 == null) {
            if (rqd1.e(bav0Var, true)) {
                hav0 hav0Var2 = (hav0) bav0Var.a.get(0);
                hav0Var2.a();
                this.q1 = hav0Var2;
                if (this.V0) {
                    faa0 faa0Var = this.s1;
                    if (faa0Var != null && faa0Var.isActive()) {
                        ((e8k1) lcc.z(this, t4k.t)).getClass();
                        if (hav0Var2.k() - this.v1 < 40) {
                            this.w1 = true;
                            return;
                        }
                        this.t1 = true;
                        faa0 faa0Var2 = this.s1;
                        if (faa0Var2 != null) {
                            ha71.o(faa0Var2);
                        }
                        this.s1 = null;
                    }
                    this.u1 = false;
                    Q1(hav0Var2);
                    if (this.l1 != null) {
                        this.r1 = c921.y(v1(), (o8n) null, 0, new gch(this, (lnm) null, (byte) 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean zP = h0p1.p(bav0Var);
        List list2 = bav0Var.a;
        if (zP && !this.u1 && this.V0 && this.l1 != null) {
            faa0 faa0Var3 = this.r1;
            if (faa0Var3 != null) {
                ha71.o(faa0Var3);
            }
            this.r1 = null;
            Function0 function0 = this.l1;
            if (function0 != null) {
                function0.invoke();
            }
            if (this.n1) {
                ((sct0) ((ss50) lcc.z(this, t4k.l))).a(0);
            }
            this.u1 = true;
        }
        if (this.u1) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!p8p1.k((hav0) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((hav0) list2.get(i3)).a();
                    }
                    return;
                }
            }
            hav0 hav0Var3 = (hav0) list2.get(0);
            hav0Var3.a();
            long jK = hav0Var3.k();
            hav0 hav0Var4 = this.q1;
            hav0Var4.getClass();
            a2(jK, hav0Var4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!p8p1.j((hav0) list2.get(i4))) {
                long jM1 = M1(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    hav0 hav0Var5 = (hav0) list2.get(i5);
                    if (hav0Var5.l() || p8p1.w(hav0Var5, j, jM1)) {
                        Y1(false);
                        return;
                    }
                }
                return;
            }
        }
        hav0 hav0Var6 = (hav0) list2.get(0);
        hav0Var6.a();
        long jK2 = hav0Var6.k();
        hav0 hav0Var7 = this.q1;
        hav0Var7.getClass();
        a2(jK2, hav0Var7);
    }

    @Override // p.mav0
    public final void K0() {
        dy60 dy60Var;
        idn0 idn0Var = this.Q0;
        if (idn0Var != null && (dy60Var = this.d1) != null) {
            idn0Var.a(new ey60(dy60Var));
        }
        this.d1 = null;
        Y1(false);
    }

    @Override // p.i6
    public final void K1(e261 e261Var) {
        if (this.l1 != null) {
            b261.i(e261Var, this.k1, new hx4(this, (byte) 16));
        }
    }

    @Override // p.i6
    public final void S1() {
        b2();
    }

    @Override // p.i6
    public final boolean T1(KeyEvent keyEvent) {
        long jR = ern1.r(keyEvent);
        boolean z = false;
        if (this.l1 != null) {
            mdn0 mdn0Var = this.o1;
            if (mdn0Var.d(jR) == null) {
                mdn0Var.g(jR, c921.y(v1(), (o8n) null, 0, new gch(this, (lnm) null, (byte) 4), 3));
                z = true;
            }
        }
        mdn0 mdn0Var2 = this.p1;
        fch fchVar = (fch) mdn0Var2.d(jR);
        if (fchVar != null) {
            if (fchVar.b().isActive()) {
                ha71.o(fchVar.b());
                if (!fchVar.a()) {
                    this.W0.invoke();
                    mdn0Var2.f(jR);
                    return z;
                }
            } else {
                mdn0Var2.f(jR);
            }
        }
        return z;
    }

    @Override // p.i6
    public final void U1(KeyEvent keyEvent) {
        boolean z;
        Function0 function0;
        long jR = ern1.r(keyEvent);
        mdn0 mdn0Var = this.o1;
        if (mdn0Var.d(jR) != null) {
            faa0 faa0Var = (faa0) mdn0Var.d(jR);
            if (faa0Var == null) {
                z = false;
            } else if (faa0Var.isActive()) {
                ha71.o(faa0Var);
                z = false;
            } else {
                z = true;
            }
            mdn0Var.f(jR);
        } else {
            z = false;
        }
        if (this.m1 == null) {
            if (z) {
                return;
            }
            V1();
            return;
        }
        mdn0 mdn0Var2 = this.p1;
        if (mdn0Var2.d(jR) == null) {
            if (z) {
                return;
            }
            W1();
            mdn0Var2.g(jR, new fch(c921.y(v1(), (o8n) null, 0, new hch(this, jR, (lnm) null), 3)));
            return;
        }
        if (!z && (function0 = this.m1) != null) {
            function0.invoke();
        }
        mdn0Var2.f(jR);
    }

    public final void Y1(boolean z) {
        if (z) {
            this.x1 = null;
            faa0 faa0Var = this.y1;
            if (faa0Var != null) {
                ha71.o(faa0Var);
            }
            this.y1 = null;
            faa0 faa0Var2 = this.z1;
            if (faa0Var2 != null) {
                ha71.o(faa0Var2);
            }
            this.z1 = null;
            this.A1 = false;
            this.B1 = false;
            this.C1 = -1L;
            this.D1 = false;
        } else {
            this.q1 = null;
            faa0 faa0Var3 = this.r1;
            if (faa0Var3 != null) {
                ha71.o(faa0Var3);
            }
            this.r1 = null;
            faa0 faa0Var4 = this.s1;
            if (faa0Var4 != null) {
                ha71.o(faa0Var4);
            }
            this.s1 = null;
            this.t1 = false;
            this.u1 = false;
            this.v1 = -1L;
            this.w1 = false;
        }
        N1(z);
    }

    @Override // p.va80
    public final void Z0() {
        Y1(true);
    }

    public final void Z1(long j, oa80 oa80Var) {
        if (this.V0 && !this.D1) {
            O1(oa80Var.b(), true);
            this.C1 = j;
            if (!this.B1) {
                boolean z = this.A1;
                Function0 function0 = this.m1;
                if (z) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else if (function0 != null) {
                    W1();
                    this.z1 = c921.y(v1(), (o8n) null, 0, new gch(this, (lnm) null, (byte) 3), 3);
                } else {
                    V1();
                }
            }
        }
        this.x1 = null;
        this.D1 = false;
        this.A1 = false;
        faa0 faa0Var = this.y1;
        if (faa0Var != null) {
            ha71.o(faa0Var);
        }
        this.y1 = null;
        this.B1 = false;
    }

    public final void a2(long j, hav0 hav0Var) {
        if (this.V0 && !this.w1) {
            O1(hav0Var.e(), false);
            this.v1 = j;
            if (!this.u1) {
                boolean z = this.t1;
                Function0 function0 = this.m1;
                if (z) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else if (function0 != null) {
                    W1();
                    this.s1 = c921.y(v1(), (o8n) null, 0, new gch(this, (lnm) null, (byte) 2), 3);
                } else {
                    V1();
                }
            }
        }
        this.q1 = null;
        this.w1 = false;
        this.t1 = false;
        faa0 faa0Var = this.r1;
        if (faa0Var != null) {
            ha71.o(faa0Var);
        }
        this.r1 = null;
        this.u1 = false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0048 A[LOOP:0: B:5:0x0019->B:15:0x0048, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008e A[LOOP:2: B:20:0x005e->B:30:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x004f A[EDGE_INSN: B:34:0x004f->B:17:0x004f BREAK  A[LOOP:0: B:5:0x0019->B:15:0x0048], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:31:0x0091 BREAK  A[LOOP:2: B:20:0x005e->B:30:0x008e], SYNTHETIC] */
    public final void b2() {
        long j;
        long j2;
        mdn0 mdn0Var = this.o1;
        Object[] objArr = mdn0Var.c;
        long[] jArr = mdn0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j3 & 255) < 128) {
                            ha71.o((faa0) objArr[(i << 3) + i3]);
                        }
                        j3 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            j = 128;
            j2 = 255;
        }
        mdn0Var.a();
        mdn0 mdn0Var2 = this.p1;
        Object[] objArr2 = mdn0Var2.c;
        long[] jArr2 = mdn0Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ha71.o(((fch) objArr2[(i4 << 3) + i6]).b());
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        mdn0Var2.a();
    }

    @Override // p.va80
    public final void r(mgc mgcVar, cav0 cav0Var) {
        R1();
        if (this.V0 && this.Z0 == null) {
            rj40 rj40VarX = crm0.x(this);
            H1(rj40VarX);
            this.Z0 = rj40VarX;
        }
        int i = 0;
        if (cav0Var != cav0.b) {
            if (cav0Var != cav0.c || this.x1 == null || this.B1) {
                return;
            }
            List listT = mgcVar.t();
            int size = listT.size();
            while (i < size) {
                oa80 oa80Var = (oa80) ((ArrayList) listT).get(i);
                if (oa80Var.d() && oa80Var != this.x1) {
                    Y1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.x1 == null) {
            List listT2 = mgcVar.t();
            int size2 = listT2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (d5p1.i((oa80) ((ArrayList) listT2).get(i2))) {
                    oa80 oa80Var2 = (oa80) ((ArrayList) mgcVar.t()).get(0);
                    oa80Var2.a();
                    this.x1 = oa80Var2;
                    if (this.V0) {
                        faa0 faa0Var = this.z1;
                        if (faa0Var != null && faa0Var.isActive()) {
                            ((e8k1) lcc.z(this, t4k.t)).getClass();
                            if (oa80Var2.c() - this.C1 < 40) {
                                this.D1 = true;
                                return;
                            }
                            this.A1 = true;
                            faa0 faa0Var2 = this.z1;
                            if (faa0Var2 != null) {
                                ha71.o(faa0Var2);
                            }
                            this.z1 = null;
                        }
                        this.B1 = false;
                        P1(oa80Var2);
                        if (this.l1 != null) {
                            this.y1 = c921.y(v1(), (o8n) null, 0, new gch(this, (lnm) null, (byte) 1), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.B1) {
            List listT3 = mgcVar.t();
            int size3 = listT3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                if (!bin.o((oa80) ((ArrayList) listT3).get(i3))) {
                    List listT4 = mgcVar.t();
                    int size4 = listT4.size();
                    while (i < size4) {
                        ((oa80) ((ArrayList) listT4).get(i)).a();
                        i++;
                    }
                    return;
                }
            }
            oa80 oa80Var3 = (oa80) ((ArrayList) mgcVar.t()).get(0);
            oa80Var3.a();
            long jC = oa80Var3.c();
            oa80 oa80Var4 = this.x1;
            oa80Var4.getClass();
            Z1(jC, oa80Var4);
            return;
        }
        List listT5 = mgcVar.t();
        int size5 = listT5.size();
        for (int i4 = 0; i4 < size5; i4++) {
            if (!bin.n((oa80) ((ArrayList) listT5).get(i4))) {
                float fG = ((e8k1) lcc.z(this, t4k.t)).g();
                List listT6 = mgcVar.t();
                int size6 = listT6.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    oa80 oa80Var5 = (oa80) ((ArrayList) listT6).get(i5);
                    long jB = oa80Var5.b();
                    oa80 oa80Var6 = this.x1;
                    oa80Var6.getClass();
                    boolean z = Math.abs(Offset.d(Offset.f(jB, oa80Var6.b()))) > fG;
                    if (oa80Var5.d() || z) {
                        Y1(true);
                        return;
                    }
                }
                return;
            }
        }
        oa80 oa80Var7 = (oa80) ((ArrayList) mgcVar.t()).get(0);
        oa80Var7.a();
        long jC2 = oa80Var7.c();
        oa80 oa80Var8 = this.x1;
        oa80Var8.getClass();
        Z1(jC2, oa80Var8);
    }
}
