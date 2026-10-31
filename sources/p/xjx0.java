package p;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xjx0 implements arh0, gc10, d9e0, g9e0, m541 {
    public static final Map v1;
    public static final ie30 w1;
    public final eyh0 N0;
    public final cab O0;
    public final hsk P0;
    public final qjx0 Q0;
    public final qjx0 R0;
    public final Handler S0;
    public zqh0 T0;
    public vl70 U0;
    public tjx0[] V0;
    public n541[] W0;
    public final boolean X;
    public wjx0[] X0;
    public final ie30 Y;
    public boolean Y0;
    public final long Z;
    public boolean Z0;
    public final Uri a;
    public boolean a1;
    public final o2r b;
    public boolean b1;
    public final f9v c;
    public tzr0 c1;
    public final ij81 d;
    public fn51 d1;
    public final mgc e;
    public long e1;
    public final b9v f;
    public boolean f1;
    public final akx0 g;
    public int g1;
    public final hw3 h;
    public long h1 = Long.MIN_VALUE;
    public final String i;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public int m1;
    public final ArrayList n1;
    public boolean o1;
    public long p1;
    public long q1;
    public boolean r1;
    public int s1;
    public final long t;
    public boolean t1;
    public boolean u1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        v1 = Collections.unmodifiableMap(map);
        ge30 ge30Var = new ge30();
        ge30Var.a = "icy";
        ge30Var.o = asj0.p("application/x-icy");
        w1 = new ie30(ge30Var);
    }

    public xjx0(Uri uri, o2r o2rVar, cab cabVar, f9v f9vVar, b9v b9vVar, ij81 ij81Var, mgc mgcVar, akx0 akx0Var, hw3 hw3Var, String str, int i, boolean z, ie30 ie30Var, long j, u8a0 u8a0Var) {
        this.a = uri;
        this.b = o2rVar;
        this.c = f9vVar;
        this.f = b9vVar;
        this.d = ij81Var;
        this.e = mgcVar;
        this.g = akx0Var;
        this.h = hw3Var;
        this.i = str;
        this.t = i;
        this.X = z;
        this.Y = ie30Var;
        this.N0 = u8a0Var != null ? new eyh0((Object) u8a0Var, (byte) 4) : new eyh0("ProgressiveMediaPeriod");
        this.O0 = cabVar;
        this.Z = j;
        this.P0 = new hsk();
        this.Q0 = new qjx0(this, (byte) 0);
        this.R0 = new qjx0(this, (byte) 1);
        this.S0 = zoi1.r((lkh0) null);
        this.X0 = new wjx0[0];
        this.W0 = new n541[0];
        this.V0 = new tjx0[0];
        this.n1 = new ArrayList();
        this.q1 = -9223372036854775807L;
        this.g1 = 1;
    }

    public final int A() {
        int iT = 0;
        for (n541 n541Var : this.W0) {
            iT += n541Var.t();
        }
        return iT;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long B(boolean z) {
        n541 n541Var;
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.W0.length; i++) {
            if (z) {
                n541Var = this.W0[i];
                synchronized (n541Var) {
                    jMax = Math.max(jMax, n541Var.w);
                }
            } else {
                tzr0 tzr0Var = this.c1;
                tzr0Var.getClass();
                if (((boolean[]) tzr0Var.d)[i]) {
                    n541Var = this.W0[i];
                    synchronized (n541Var) {
                    }
                    jMax = Math.max(jMax, n541Var.w);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    public final boolean C() {
        return this.q1 != -9223372036854775807L;
    }

    public final void D() {
        long j;
        char c;
        if (this.u1 || this.Z0 || !this.Y0 || this.d1 == null) {
            return;
        }
        for (n541 n541Var : this.W0) {
            if (n541Var.s() == null) {
                return;
            }
        }
        this.P0.d();
        int length = this.W0.length;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c2 = 1;
            if (i2 >= length) {
                break;
            }
            ie30 ie30VarS = this.W0[i2].s();
            ie30VarS.getClass();
            int i4 = asj0.i(ie30VarS.f66p);
            if (i4 == 1) {
                c = 3;
            } else if (i4 == 2) {
                c = 4;
            } else if (i4 != 3) {
                c = i4 != 4 ? (char) 0 : (char) 2;
            } else {
                c = 1;
            }
            if (i == 1) {
                c2 = 3;
            } else if (i == 2) {
                c2 = 4;
            } else if (i != 3) {
                c2 = i != 4 ? (char) 0 : (char) 2;
            }
            if (c > c2) {
                i3 = i2;
                i = i4;
            }
            i2++;
        }
        pnf1[] pnf1VarArr = new pnf1[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        while (true) {
            j = this.Z;
            if (i5 >= length) {
                break;
            }
            ie30 ie30VarS2 = this.W0[i5].s();
            ie30VarS2.getClass();
            String str = ie30VarS2.f66p;
            boolean zK = asj0.k(str);
            boolean z = zK || asj0.o(str);
            zArr[i5] = z;
            this.a1 |= z;
            this.b1 = j != -9223372036854775807L && length == 1 && asj0.m(str);
            vl70 vl70Var = this.U0;
            if (vl70Var != null) {
                int i6 = vl70Var.a;
                if (zK || this.X0[i5].b) {
                    hjj0 hjj0Var = ie30VarS2.m;
                    hjj0 hjj0Var2 = hjj0Var == null ? new hjj0(vl70Var) : hjj0Var.a(vl70Var);
                    ge30 ge30VarA = ie30VarS2.a();
                    ge30VarA.l = hjj0Var2;
                    ie30VarS2 = new ie30(ge30VarA);
                }
                if (zK && ie30VarS2.i == -1 && ie30VarS2.j == -1 && i6 != -1) {
                    ge30 ge30VarA2 = ie30VarS2.a();
                    ge30VarA2.i = i6;
                    ie30VarS2 = new ie30(ge30VarA2);
                }
            }
            ie30 ie30VarB = ie30VarS2.b(this.c.g(ie30VarS2));
            if (i5 != i3) {
                ge30 ge30VarA3 = ie30VarB.a();
                ge30VarA3.m = Integer.toString(i3);
                ie30VarB = new ie30(ge30VarA3);
            }
            pnf1VarArr[i5] = new pnf1(Integer.toString(i5), ie30VarB);
            this.W0[i5].D(this.h1);
            i5++;
        }
        this.c1 = new tzr0(new qnf1(pnf1VarArr), zArr);
        if (this.b1 && this.e1 == -9223372036854775807L) {
            this.e1 = j;
            this.d1 = new rjx0(this, this.d1);
        }
        this.g.B(this.e1, this.d1, this.f1);
        this.Z0 = true;
        zqh0 zqh0Var = this.T0;
        zqh0Var.getClass();
        zqh0Var.j(this);
    }

    public final void E(int i) {
        z();
        tzr0 tzr0Var = this.c1;
        boolean[] zArr = (boolean[]) tzr0Var.e;
        if (zArr[i]) {
            return;
        }
        ie30 ie30Var = ((qnf1) tzr0Var.b).a(i).d[0];
        this.e.k(asj0.i(ie30Var.f66p), ie30Var, 0, null, this.p1);
        zArr[i] = true;
    }

    public final void F(int i) {
        z();
        if (this.r1) {
            if ((!this.a1 || ((boolean[]) this.c1.c)[i]) && !this.W0[i].u(false)) {
                this.q1 = 0L;
                this.r1 = false;
                this.j1 = true;
                this.p1 = 0L;
                this.s1 = 0;
                for (n541 n541Var : this.W0) {
                    n541Var.A(false);
                }
                zqh0 zqh0Var = this.T0;
                zqh0Var.getClass();
                zqh0Var.c(this);
            }
        }
    }

    public final gtf1 G(wjx0 wjx0Var) {
        int length = this.W0.length;
        for (int i = 0; i < length; i++) {
            if (wjx0Var.equals(this.X0[i])) {
                return this.W0[i];
            }
        }
        if (this.Y0) {
            oon1.H("Extractor added new track (id=" + wjx0Var.a + ") after finishing tracks.");
            return new x6u();
        }
        f9v f9vVar = this.c;
        f9vVar.getClass();
        n541 n541Var = new n541(this.h, f9vVar, this.f);
        tjx0 tjx0Var = new tjx0(n541Var);
        n541Var.f = this;
        int i2 = length + 1;
        wjx0[] wjx0VarArr = (wjx0[]) Arrays.copyOf(this.X0, i2);
        wjx0VarArr[length] = wjx0Var;
        String str = zoi1.a;
        this.X0 = wjx0VarArr;
        n541[] n541VarArr = (n541[]) Arrays.copyOf(this.W0, i2);
        n541VarArr[length] = n541Var;
        this.W0 = n541VarArr;
        tjx0[] tjx0VarArr = (tjx0[]) Arrays.copyOf(this.V0, i2);
        tjx0VarArr[length] = tjx0Var;
        this.V0 = tjx0VarArr;
        return tjx0Var;
    }

    public final void H(fn51 fn51Var) {
        this.d1 = this.U0 == null ? fn51Var : new bc9(-9223372036854775807L);
        this.e1 = fn51Var.g();
        boolean z = !this.o1 && fn51Var.g() == -9223372036854775807L;
        this.f1 = z;
        this.g1 = z ? 7 : 1;
        if (this.Z0) {
            this.g.B(this.e1, fn51Var, z);
        } else {
            D();
        }
    }

    public final void I() {
        ujx0 ujx0Var = new ujx0(this, this.a, this.b, this.O0, this, this.P0);
        if (this.Z0) {
            dm5.y(C());
            long j = this.h1;
            if (j == Long.MIN_VALUE) {
                j = this.e1;
            }
            if (j != -9223372036854775807L && this.q1 > j) {
                this.t1 = true;
                this.q1 = -9223372036854775807L;
                return;
            }
            fn51 fn51Var = this.d1;
            fn51Var.getClass();
            long j2 = fn51Var.b(this.q1).a.b;
            long j3 = this.q1;
            ujx0Var.g.a = j2;
            ujx0Var.j = j3;
            ujx0Var.i = true;
            ujx0Var.m = false;
            for (n541 n541Var : this.W0) {
                n541Var.t = this.q1;
            }
            this.q1 = -9223372036854775807L;
        }
        this.s1 = A();
        this.N0.H(ujx0Var, this, this.d.m(this.g1));
    }

    public final boolean J() {
        return this.j1 || C();
    }

    @Override // p.v561
    public final long a() {
        return x();
    }

    @Override // p.v561
    public final boolean b() {
        return !this.t1 && this.N0.q() && this.P0.e();
    }

    public final void c(fn51 fn51Var) {
        this.S0.post(new zyh0((Object) this, (Object) fn51Var, (byte) 18));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba A[LOOP:2: B:46:0x00b8->B:47:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce A[LOOP:3: B:51:0x00cc->B:52:0x00ce, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00b5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00c6, please report this as an issue */
    @Override // p.arh0
    public final long d(long j) {
        int i;
        int i2;
        Iterator it = this.n1.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            rvi0 rvi0Var = (rvi0) it.next();
            rvi0Var.e.clear();
            rvi0Var.g = null;
            rvi0Var.h = -9223372036854775807L;
            rvi0Var.i = false;
            rvi0Var.t = false;
            rvi0Var.d.g();
        }
        z();
        boolean[] zArr = (boolean[]) this.c1.c;
        if (!this.d1.d()) {
            j = 0;
        }
        this.j1 = false;
        boolean z = this.p1 == j;
        this.p1 = j;
        if (C()) {
            this.q1 = j;
            return j;
        }
        int i3 = this.g1;
        eyh0 eyh0Var = this.N0;
        if (i3 == 7 || !(this.t1 || eyh0Var.q())) {
            this.r1 = false;
            this.q1 = j;
            this.t1 = false;
            this.k1 = false;
            if (eyh0Var.q()) {
                eyh0Var.d = null;
                for (n541 n541Var : this.W0) {
                    n541Var.A(false);
                }
                break;
            }
            for (n541 n541Var2 : this.W0) {
                n541Var2.j();
            }
            eyh0Var.a();
            return j;
        }
        int length = this.W0.length;
        for (int i4 = 0; i4 < length; i4++) {
            n541 n541Var3 = this.W0[i4];
            if (this.V0[i4].d.get() == sjx0.a && (n541Var3.p() != 0 || !z)) {
                if (!(this.b1 ? n541Var3.B(n541Var3.q) : n541Var3.C(j, this.t1)) && (zArr[i4] || !this.a1)) {
                    this.r1 = false;
                    this.q1 = j;
                    this.t1 = false;
                    this.k1 = false;
                    if (eyh0Var.q()) {
                        eyh0Var.d = null;
                        while (i2 < r0) {
                            n541Var.A(false);
                        }
                        break;
                        break;
                    }
                    while (i < r0) {
                        n541Var2.j();
                    }
                    eyh0Var.a();
                    return j;
                }
            }
        }
        return j;
    }

    @Override // p.m541
    public final void e() {
        this.S0.post(this.Q0);
    }

    @Override // p.arh0
    public final long g() {
        if (!this.l1 && this.k1) {
            this.k1 = false;
            return this.p1;
        }
        if (!this.j1) {
            return -9223372036854775807L;
        }
        if (!this.t1 && A() <= this.s1) {
            return -9223372036854775807L;
        }
        this.j1 = false;
        return this.p1;
    }

    public final void h(f9e0 f9e0Var, long j, long j2, int i) {
        ujx0 ujx0Var = (ujx0) f9e0Var;
        rsb1 rsb1Var = ujx0Var.c;
        c2e0 c2e0Var = new c2e0(ujx0Var.a, ujx0Var.k, j);
        if (i != 0) {
            c2e0Var.d = rsb1Var.c;
            c2e0Var.e = rsb1Var.d;
            c2e0Var.f = j2;
            c2e0Var.g = rsb1Var.b;
        }
        this.e.L(new d2e0(c2e0Var), 1, -1, null, 0, null, ujx0Var.j, this.e1, i);
    }

    @Override // p.v561
    public final boolean i(hae0 hae0Var) {
        if (this.t1) {
            return false;
        }
        eyh0 eyh0Var = this.N0;
        if (eyh0Var.l() || this.r1) {
            return false;
        }
        if ((this.Z0 || this.Y != null) && this.m1 == 0) {
            return false;
        }
        boolean zF = this.P0.f();
        if (eyh0Var.q()) {
            return zF;
        }
        I();
        return true;
    }

    public final void j(f9e0 f9e0Var, long j, long j2) {
        ujx0 ujx0Var = (ujx0) f9e0Var;
        if (this.e1 == -9223372036854775807L && this.d1 != null) {
            long jB = B(true);
            long j3 = jB == Long.MIN_VALUE ? 0L : jB + 10000;
            this.e1 = j3;
            this.g.B(j3, this.d1, this.f1);
        }
        rsb1 rsb1Var = ujx0Var.c;
        c2e0 c2e0Var = new c2e0(ujx0Var.a, ujx0Var.k, j);
        c2e0Var.d = rsb1Var.c;
        c2e0Var.e = rsb1Var.d;
        c2e0Var.f = j2;
        c2e0Var.g = rsb1Var.b;
        d2e0 d2e0Var = new d2e0(c2e0Var);
        this.d.getClass();
        this.e.I(d2e0Var, 1, -1, null, 0, null, ujx0Var.j, this.e1);
        this.t1 = true;
        zqh0 zqh0Var = this.T0;
        zqh0Var.getClass();
        zqh0Var.c(this);
    }

    @Override // p.arh0
    public final long k(long j) {
        this.h1 = j;
        for (n541 n541Var : this.W0) {
            n541Var.D(j);
        }
        return j;
    }

    @Override // p.g9e0
    public final void l() {
        for (n541 n541Var : this.W0) {
            n541Var.A(true);
            y8v y8vVar = n541Var.h;
            if (y8vVar != null) {
                y8vVar.c(n541Var.e);
                n541Var.h = null;
                n541Var.g = null;
            }
        }
        cab cabVar = this.O0;
        ec10 ec10Var = (ec10) cabVar.c;
        if (ec10Var != null) {
            ec10Var.release();
            cabVar.c = null;
        }
        cabVar.d = null;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x024b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // p.arh0
    public final long m(qp00[] qp00VarArr, boolean[] zArr, p641[] p641VarArr, boolean[] zArr2, long j) {
        ?? r12;
        boolean z;
        ArrayList arrayList;
        byte[] bArr;
        boolean[] zArr3;
        qnf1 qnf1Var;
        boolean z2;
        qp00 qp00Var;
        Object obj;
        n541 n541Var;
        boolean z3;
        boolean z4;
        Object obj2;
        qp00[] qp00VarArr2 = qp00VarArr;
        long jD = j;
        z();
        tzr0 tzr0Var = this.c1;
        qnf1 qnf1Var2 = (qnf1) tzr0Var.b;
        boolean[] zArr4 = (boolean[]) tzr0Var.d;
        int i = this.m1;
        int i2 = 0;
        while (true) {
            r12 = 1;
            if (i2 >= qp00VarArr2.length) {
                z = false;
                break;
            }
            qp00 qp00Var2 = qp00VarArr2[i2];
            if (qp00Var2 != null && Objects.equals(qnf1Var2.a(qnf1Var2.b(qp00Var2.n())).d[0].f66p, "application/x-itut-t35")) {
                z = true;
                break;
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            int length = qp00VarArr2.length;
            arrayList = this.n1;
            if (i3 >= length) {
                break;
            }
            ?? r13 = p641VarArr[i3];
            if (r13 != 0) {
                if (qp00VarArr2[i3] == null || !zArr[i3]) {
                    obj2 = null;
                } else if (z) {
                    obj2 = null;
                    if (r13 instanceof rvi0) {
                    }
                }
                if (r13 instanceof rvi0) {
                    rvi0 rvi0Var = (rvi0) r13;
                    arrayList.remove(rvi0Var);
                    int i4 = rvi0Var.a.a;
                    dm5.y(zArr4[i4]);
                    this.m1--;
                    zArr4[i4] = false;
                    int i5 = rvi0Var.b.a;
                    dm5.y(zArr4[i5]);
                    this.m1--;
                    zArr4[i5] = false;
                } else {
                    int i6 = ((vjx0) r13).a;
                    dm5.y(zArr4[i6]);
                    this.m1--;
                    zArr4[i6] = false;
                }
                p641VarArr[i3] = obj2;
            }
            i3++;
        }
        byte[] bArr2 = null;
        boolean z5 = !this.i1 ? jD == 0 || this.b1 : i != 0;
        int i7 = 0;
        boolean z6 = false;
        while (i7 < qp00VarArr2.length) {
            if (p641VarArr[i7] != 0 || (qp00Var = qp00VarArr2[i7]) == null) {
                zArr3 = zArr4;
                qnf1Var = qnf1Var2;
                z2 = z5;
            } else {
                dm5.y((boolean) (qp00Var.length() == r12 ? r12 : 0));
                dm5.y((boolean) (qp00Var.f(0) == 0 ? r12 : 0));
                int iB = qnf1Var2.b(qp00Var.n());
                dm5.y(!zArr4[iB]);
                boolean z7 = r12;
                this.m1++;
                zArr4[iB] = z7;
                z6 |= qp00Var.s().v;
                vjx0 vjx0Var = new vjx0(this, iB, qp00Var.s().v);
                if (this.X) {
                    zArr3 = zArr4;
                    if (Build.VERSION.SDK_INT >= 37 && !z && asj0.o(qp00Var.s().f66p)) {
                        int i8 = 0;
                        ?? r18 = z7;
                        while (true) {
                            if (i8 < qnf1Var2.a) {
                                ie30 ie30Var = qnf1Var2.a(i8).d[0];
                                qnf1Var = qnf1Var2;
                                String str = ie30Var.f66p;
                                List list = ie30Var.s;
                                if (Objects.equals(str, "application/x-itut-t35") && !list.isEmpty()) {
                                    byte[] bArr3 = (byte[]) list.get(0);
                                    if (bArr3.length >= 5 && bArr3[0] == -75 && bArr3[r18] == 0 && bArr3[2] == -112 && bArr3[3] == 0 && bArr3[4] == (z4 = r18)) {
                                        dm5.y((zArr3[i8] ? 1 : 0) ^ (z4 ? 1 : 0));
                                        this.m1 += z4 ? 1 : 0;
                                        zArr3[i8] = z4;
                                        z2 = z5;
                                        rvi0 rvi0Var2 = new rvi0(vjx0Var, new vjx0(this, i8, false), qp00Var.s());
                                        arrayList.add(rvi0Var2);
                                        obj = rvi0Var2;
                                        break;
                                    }
                                }
                                i8++;
                                z5 = z5;
                                qnf1Var2 = qnf1Var;
                                r18 = 1;
                            }
                        }
                    }
                    p641VarArr[i7] = obj;
                    zArr2[i7] = true;
                    if (!z2) {
                        n541Var = this.W0[iB];
                        if (n541Var.p() != 0 || n541Var.C(jD, true)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        z5 = z3;
                    }
                    i7++;
                    qp00VarArr2 = qp00VarArr;
                    zArr4 = zArr3;
                    qnf1Var2 = qnf1Var;
                    r12 = 1;
                } else {
                    zArr3 = zArr4;
                }
                qnf1Var = qnf1Var2;
                z2 = z5;
                obj = vjx0Var;
                p641VarArr[i7] = obj;
                zArr2[i7] = true;
                if (!z2) {
                    n541Var = this.W0[iB];
                    if (n541Var.p() != 0) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    z5 = z3;
                }
                i7++;
                qp00VarArr2 = qp00VarArr;
                zArr4 = zArr3;
                qnf1Var2 = qnf1Var;
                r12 = 1;
            }
            z5 = z2;
            i7++;
            qp00VarArr2 = qp00VarArr;
            zArr4 = zArr3;
            qnf1Var2 = qnf1Var;
            r12 = 1;
        }
        boolean z8 = z5;
        if (this.k1 || !this.i1) {
            this.k1 = z6;
        }
        if (this.m1 == 0) {
            this.r1 = false;
            this.j1 = false;
            this.k1 = false;
            eyh0 eyh0Var = this.N0;
            if (eyh0Var.q()) {
                for (n541 n541Var2 : this.W0) {
                    n541Var2.j();
                }
                eyh0Var.a();
            } else {
                boolean z9 = false;
                this.t1 = false;
                n541[] n541VarArr = this.W0;
                int length2 = n541VarArr.length;
                int i9 = 0;
                while (i9 < length2) {
                    n541VarArr[i9].A(z9);
                    i9++;
                    z9 = false;
                }
            }
        } else if (z8) {
            jD = d(jD);
            int i10 = 0;
            while (i10 < p641VarArr.length) {
                ?? r1 = p641VarArr[i10];
                if (r1 != 0) {
                    zArr2[i10] = true;
                    if (r1 instanceof rvi0) {
                        rvi0 rvi0Var3 = (rvi0) r1;
                        rvi0Var3.e.clear();
                        bArr = bArr2;
                        rvi0Var3.g = bArr;
                        rvi0Var3.h = -9223372036854775807L;
                        rvi0Var3.i = false;
                        rvi0Var3.t = false;
                        rvi0Var3.d.g();
                    } else {
                        bArr = bArr2;
                    }
                } else {
                    bArr = bArr2;
                }
                i10++;
                bArr2 = bArr;
            }
        }
        this.i1 = true;
        return jD;
    }

    public final void n(f9e0 f9e0Var, long j, long j2, boolean z) {
        ujx0 ujx0Var = (ujx0) f9e0Var;
        rsb1 rsb1Var = ujx0Var.c;
        c2e0 c2e0Var = new c2e0(ujx0Var.a, ujx0Var.k, j);
        c2e0Var.d = rsb1Var.c;
        c2e0Var.e = rsb1Var.d;
        c2e0Var.f = j2;
        c2e0Var.g = rsb1Var.b;
        d2e0 d2e0Var = new d2e0(c2e0Var);
        this.d.getClass();
        this.e.H(d2e0Var, 1, -1, null, 0, null, ujx0Var.j, this.e1);
        if (z) {
            return;
        }
        for (n541 n541Var : this.W0) {
            n541Var.A(false);
        }
        if (this.m1 > 0) {
            zqh0 zqh0Var = this.T0;
            zqh0Var.getClass();
            zqh0Var.c(this);
        }
    }

    public final o4t o(f9e0 f9e0Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        o4t o4tVar;
        fn51 fn51Var;
        ujx0 ujx0Var = (ujx0) f9e0Var;
        rsb1 rsb1Var = ujx0Var.c;
        c2e0 c2e0Var = new c2e0(ujx0Var.a, ujx0Var.k, j);
        c2e0Var.d = rsb1Var.c;
        c2e0Var.e = rsb1Var.d;
        c2e0Var.f = j2;
        c2e0Var.g = rsb1Var.b;
        d2e0 d2e0Var = new d2e0(c2e0Var);
        String str = zoi1.a;
        this.d.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException) || ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            o4tVar = eyh0.Z;
        } else {
            int iA = A();
            int i2 = iA > this.s1 ? 1 : 0;
            if (this.o1 || !((fn51Var = this.d1) == null || fn51Var.g() == -9223372036854775807L)) {
                this.s1 = iA;
            } else if (!this.Z0 || J()) {
                this.j1 = this.Z0;
                this.p1 = 0L;
                this.s1 = 0;
                for (n541 n541Var : this.W0) {
                    n541Var.A(false);
                }
                ujx0Var.g.a = 0L;
                ujx0Var.j = 0L;
                ujx0Var.i = true;
                ujx0Var.m = false;
            } else {
                this.r1 = true;
                o4tVar = eyh0.Y;
            }
            o4tVar = new o4t(i2, jMin);
        }
        this.e.J(d2e0Var, 1, -1, null, 0, null, ujx0Var.j, this.e1, iOException, !o4tVar.e());
        return o4tVar;
    }

    @Override // p.arh0
    public final void p() {
        this.l1 = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // p.arh0
    public final void q() throws ParserException, IOException {
        int iM = this.d.m(this.g1);
        eyh0 eyh0Var = this.N0;
        IOException iOException = (IOException) eyh0Var.d;
        if (iOException != null) {
            throw iOException;
        }
        e9e0 e9e0Var = (e9e0) eyh0Var.c;
        if (e9e0Var != null) {
            if (iM == Integer.MIN_VALUE) {
                iM = e9e0Var.a;
            }
            IOException iOException2 = e9e0Var.e;
            if (iOException2 != null && e9e0Var.f > iM) {
                throw iOException2;
            }
        }
        if (this.t1 && !this.Z0) {
            throw ParserException.a((RuntimeException) null, "Loading finished before preparation is complete.");
        }
    }

    @Override // p.arh0
    public final void r(long j) throws Throwable {
        if (this.b1) {
            return;
        }
        z();
        if (C()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.c1.d;
        int length = this.W0.length;
        for (int i = 0; i < length; i++) {
            this.W0[i].i(j, zArr[i]);
        }
    }

    public final void s() {
        this.Y0 = true;
        this.S0.post(this.Q0);
    }

    @Override // p.arh0
    public final long t(long j, on51 on51Var) {
        z();
        if (!this.d1.d()) {
            return 0L;
        }
        en51 en51VarB = this.d1.b(j);
        return on51Var.a(j, en51VarB.a.a, en51VarB.b.a);
    }

    @Override // p.arh0
    public final qnf1 u() {
        z();
        return (qnf1) this.c1.b;
    }

    @Override // p.arh0
    public final void v(zqh0 zqh0Var, long j) {
        this.T0 = zqh0Var;
        ie30 ie30Var = this.Y;
        if (ie30Var == null) {
            this.P0.f();
            I();
        } else {
            w(0, 3).a(ie30Var);
            H(new u980(-9223372036854775807L, new long[]{0}, new long[]{0}));
            s();
            this.q1 = j;
        }
    }

    public final gtf1 w(int i, int i2) {
        return G(new wjx0(i, false));
    }

    @Override // p.v561
    public final long x() {
        long jB;
        boolean z;
        long j;
        z();
        if (this.t1 || this.m1 == 0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.q1;
        }
        if (this.a1) {
            int length = this.W0.length;
            jB = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                tzr0 tzr0Var = this.c1;
                if (((boolean[]) tzr0Var.c)[i] && ((boolean[]) tzr0Var.d)[i]) {
                    n541 n541Var = this.W0[i];
                    synchronized (n541Var) {
                        z = n541Var.z;
                    }
                    if (z) {
                        continue;
                    } else {
                        n541 n541Var2 = this.W0[i];
                        synchronized (n541Var2) {
                            j = n541Var2.w;
                        }
                        jB = Math.min(jB, j);
                    }
                }
            }
        } else {
            jB = Long.MAX_VALUE;
        }
        if (jB == Long.MAX_VALUE) {
            jB = B(false);
        }
        return jB == Long.MIN_VALUE ? this.p1 : jB;
    }

    @Override // p.v561
    public final void y(long j) {
        boolean z;
        if (this.m1 <= 0 || C()) {
            return;
        }
        boolean z2 = false;
        if (this.h1 != Long.MIN_VALUE) {
            z();
            boolean z3 = true;
            int i = 0;
            while (true) {
                n541[] n541VarArr = this.W0;
                if (i >= n541VarArr.length) {
                    break;
                }
                tzr0 tzr0Var = this.c1;
                if (((boolean[]) tzr0Var.d)[i] && (((boolean[]) tzr0Var.c)[i] || !this.a1)) {
                    n541 n541Var = n541VarArr[i];
                    synchronized (n541Var) {
                        z = n541Var.x != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.t1 = true;
        }
    }

    public final void z() {
        dm5.y(this.Z0);
        this.c1.getClass();
        this.d1.getClass();
    }
}
