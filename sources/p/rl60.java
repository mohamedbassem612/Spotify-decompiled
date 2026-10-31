package p;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rl60 implements d9e0, g9e0, v561, gc10, m541 {
    public static final Set z1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList N0;
    public final List O0;
    public final ol60 P0;
    public final ol60 Q0;
    public final Handler R0;
    public final ArrayList S0;
    public final Map T0;
    public yag U0;
    public ql60[] V0;
    public int[] W0;
    public final mgc X;
    public final HashSet X0;
    public final boolean Y;
    public final SparseIntArray Y0;
    public final oi Z;
    public pl60 Z0;
    public final String a;
    public int a1;
    public final int b;
    public int b1;
    public final fey c;
    public boolean c1;
    public final lk60 d;
    public boolean d1;
    public final hw3 e;
    public int e1;
    public final ie30 f;
    public ie30 f1;
    public final f9v g;
    public ie30 g1;
    public final b9v h;
    public boolean h1;
    public final ij81 i;
    public qnf1 i1;
    public Set j1;
    public int[] k1;
    public int l1;
    public boolean m1;
    public boolean[] n1;
    public boolean[] o1;
    public long p1;
    public long q1;
    public boolean r1;
    public boolean s1;
    public final eyh0 t;
    public boolean t1;
    public long u1;
    public boolean v1;
    public long w1;
    public x8v x1;
    public qk60 y1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [p.ol60] */
    /* JADX WARN: Type inference failed for: r2v14, types: [p.ol60] */
    public rl60(String str, int i, fey feyVar, lk60 lk60Var, Map map, hw3 hw3Var, long j, ie30 ie30Var, f9v f9vVar, b9v b9vVar, ij81 ij81Var, mgc mgcVar, int i2, u8a0 u8a0Var) {
        this.a = str;
        this.b = i;
        this.c = feyVar;
        this.d = lk60Var;
        this.T0 = map;
        this.e = hw3Var;
        this.f = ie30Var;
        this.g = f9vVar;
        this.h = b9vVar;
        this.i = ij81Var;
        this.X = mgcVar;
        this.Y = i2;
        this.t = u8a0Var != null ? new eyh0((Object) u8a0Var, (byte) 4) : new eyh0("Loader:HlsSampleStreamWrapper");
        oi oiVar = new oi((byte) 23);
        oiVar.c = null;
        final byte b = 0;
        oiVar.b = false;
        oiVar.d = null;
        this.Z = oiVar;
        this.W0 = new int[0];
        Set set = z1;
        this.X0 = new HashSet(set.size());
        this.Y0 = new SparseIntArray(set.size());
        this.V0 = new ql60[0];
        this.o1 = new boolean[0];
        this.n1 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.N0 = arrayList;
        this.O0 = Collections.unmodifiableList(arrayList);
        this.S0 = new ArrayList();
        this.P0 = new Runnable(this) { // from class: p.ol60
            public final /* synthetic */ rl60 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                rl60 rl60Var = this.b;
                switch (b2) {
                    case 0:
                        rl60Var.I();
                        break;
                    default:
                        for (ql60 ql60Var : rl60Var.V0) {
                            ql60Var.D(rl60Var.u1);
                        }
                        rl60Var.c1 = true;
                        rl60Var.I();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.Q0 = new Runnable(this) { // from class: p.ol60
            public final /* synthetic */ rl60 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                rl60 rl60Var = this.b;
                switch (b3) {
                    case 0:
                        rl60Var.I();
                        break;
                    default:
                        for (ql60 ql60Var : rl60Var.V0) {
                            ql60Var.D(rl60Var.u1);
                        }
                        rl60Var.c1 = true;
                        rl60Var.I();
                        break;
                }
            }
        };
        this.R0 = zoi1.r((lkh0) null);
        this.p1 = j;
        this.q1 = j;
        this.u1 = Long.MIN_VALUE;
    }

    public static x6u B(int i, int i2) {
        oon1.H("Unmapped track with id " + i + " of type " + i2);
        return new x6u();
    }

    public static ie30 D(ie30 ie30Var, ie30 ie30Var2, boolean z) {
        String strC;
        if (ie30Var == null) {
            return ie30Var2;
        }
        String str = ie30Var.l;
        String strE = ie30Var2.f66p;
        int i = asj0.i(strE);
        if (zoi1.A(i, str) == 1) {
            strC = zoi1.B(i, str);
            strE = asj0.e(strC);
        } else {
            strC = asj0.c(str, strE);
        }
        ge30 ge30VarA = ie30Var2.a();
        ge30VarA.a = ie30Var.a;
        ge30VarA.b = ie30Var.b;
        ge30VarA.c = b380.p(ie30Var.c);
        ge30VarA.d = ie30Var.d;
        ge30VarA.e = ie30Var.e;
        ge30VarA.f = ie30Var.f;
        ge30VarA.i = z ? ie30Var.i : -1;
        ge30VarA.j = z ? ie30Var.j : -1;
        ge30VarA.k = strC;
        if (i == 2) {
            ge30VarA.v = ie30Var.w;
            ge30VarA.w = ie30Var.x;
            ge30VarA.c(ie30Var.B);
        }
        if (strE != null) {
            ge30VarA.e(strE);
        }
        int i2 = ie30Var.J;
        if (i2 != -1 && i == 1) {
            ge30VarA.I = i2;
        }
        hjj0 hjj0VarB = ie30Var.m;
        if (hjj0VarB != null) {
            hjj0 hjj0Var = ie30Var2.m;
            if (hjj0Var != null) {
                hjj0VarB = hjj0Var.b(hjj0VarB);
            }
            ge30VarA.l = hjj0VarB;
        }
        return new ie30(ge30VarA);
    }

    public static int G(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public final boolean A(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.N0;
            if (i2 >= arrayList.size()) {
                qk60 qk60Var = (qk60) arrayList.get(i);
                for (int i3 = 0; i3 < this.V0.length; i3++) {
                    if (this.V0[i3].p() > qk60Var.g(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (((qk60) arrayList.get(i2)).L) {
                return false;
            }
            i2++;
        }
    }

    public final qnf1 C(pnf1[] pnf1VarArr) {
        for (int i = 0; i < pnf1VarArr.length; i++) {
            pnf1 pnf1Var = pnf1VarArr[i];
            ie30[] ie30VarArr = new ie30[pnf1Var.a];
            for (int i2 = 0; i2 < pnf1Var.a; i2++) {
                ie30 ie30Var = pnf1Var.d[i2];
                ie30VarArr[i2] = ie30Var.b(this.g.g(ie30Var));
            }
            pnf1VarArr[i] = new pnf1(pnf1Var.b, ie30VarArr);
        }
        return new qnf1(pnf1VarArr);
    }

    public final void E(int i) {
        ArrayList arrayList;
        dm5.y(!this.t.q());
        int i2 = i;
        while (true) {
            arrayList = this.N0;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            } else if (A(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j = F().h;
        qk60 qk60Var = (qk60) arrayList.get(i2);
        zoi1.d0(i2, arrayList.size(), arrayList);
        for (int i3 = 0; i3 < this.V0.length; i3++) {
            this.V0[i3].l(qk60Var.g(i3));
        }
        if (arrayList.isEmpty()) {
            this.q1 = Math.max(this.p1, qk60Var.g);
        } else {
            ((qk60) hr80.r(arrayList)).J = true;
        }
        this.t1 = false;
        qqh0 qqh0Var = new qqh0(1, this.a1, null, 3, null, zoi1.n0(qk60Var.g), zoi1.n0(j));
        mgc mgcVar = this.X;
        p2i0 p2i0Var = (p2i0) mgcVar.c;
        p2i0Var.getClass();
        mgcVar.j(new k65(mgcVar, p2i0Var, qqh0Var, (byte) 15));
    }

    public final qk60 F() {
        return (qk60) l1d.i(1, this.N0);
    }

    public final boolean H() {
        return this.q1 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I() {
        int i;
        if (!this.h1 && this.k1 == null && this.c1) {
            int i2 = 0;
            for (ql60 ql60Var : this.V0) {
                if (ql60Var.s() == null) {
                    return;
                }
            }
            qnf1 qnf1Var = this.i1;
            if (qnf1Var != null) {
                int i3 = qnf1Var.a;
                int[] iArr = new int[i3];
                this.k1 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        ql60[] ql60VarArr = this.V0;
                        if (i5 >= ql60VarArr.length) {
                            break;
                        }
                        ie30 ie30VarS = ql60VarArr[i5].s();
                        ie30VarS.getClass();
                        ie30 ie30Var = this.i1.a(i4).d[0];
                        String str = ie30VarS.f66p;
                        String str2 = ie30Var.f66p;
                        int i6 = asj0.i(str);
                        if (i6 != 3) {
                            if (i6 == asj0.i(str2)) {
                                this.k1[i4] = i5;
                                break;
                            }
                            i5++;
                        } else {
                            if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || ie30VarS.P == ie30Var.P)) {
                                this.k1[i4] = i5;
                                break;
                                break;
                            }
                            i5++;
                        }
                    }
                }
                Iterator it = this.S0.iterator();
                while (it.hasNext()) {
                    ((nl60) it.next()).a();
                }
                return;
            }
            int length = this.V0.length;
            int i7 = 0;
            int i8 = -1;
            int i9 = -2;
            while (true) {
                int i10 = 1;
                if (i7 >= length) {
                    break;
                }
                ie30 ie30VarS2 = this.V0[i7].s();
                ie30VarS2.getClass();
                String str3 = ie30VarS2.f66p;
                if (asj0.o(str3)) {
                    i10 = 2;
                } else if (!asj0.k(str3)) {
                    i10 = asj0.n(str3) ? 3 : -2;
                }
                if (G(i10) > G(i9)) {
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i8 != -1) {
                    i8 = -1;
                }
                i7++;
            }
            pnf1 pnf1Var = this.d.i;
            int i11 = pnf1Var.a;
            this.l1 = -1;
            this.k1 = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                this.k1[i12] = i12;
            }
            pnf1[] pnf1VarArr = new pnf1[length];
            int i13 = 0;
            while (i13 < length) {
                ie30 ie30VarS3 = this.V0[i13].s();
                ie30VarS3.getClass();
                ie30 ie30Var2 = this.f;
                String str4 = this.a;
                if (i13 == i8) {
                    ie30[] ie30VarArr = new ie30[i11];
                    for (int i14 = i2; i14 < i11; i14++) {
                        ie30 ie30VarF = pnf1Var.d[i14];
                        if (i9 == 1 && ie30Var2 != null) {
                            ie30VarF = ie30VarF.f(ie30Var2);
                        }
                        ie30VarArr[i14] = i11 == 1 ? ie30VarS3.f(ie30VarF) : D(ie30VarF, ie30VarS3, true);
                    }
                    pnf1VarArr[i13] = new pnf1(str4, ie30VarArr);
                    this.l1 = i13;
                    i = 0;
                } else {
                    if (i9 != 2 || !asj0.k(ie30VarS3.f66p)) {
                        ie30Var2 = null;
                    }
                    StringBuilder sbG = dv20.g(str4, ":muxed:");
                    sbG.append(i13 < i8 ? i13 : i13 - 1);
                    String string = sbG.toString();
                    i = 0;
                    ge30 ge30VarA = D(ie30Var2, ie30VarS3, false).a();
                    ge30VarA.m = str4;
                    pnf1VarArr[i13] = new pnf1(string, new ie30(ge30VarA));
                }
                i13++;
                i2 = i;
            }
            int i15 = i2;
            this.i1 = C(pnf1VarArr);
            dm5.y(this.j1 == null ? 1 : i15);
            this.j1 = Collections.EMPTY_SET;
            this.d1 = true;
            this.c.d();
        }
    }

    public final void J() throws IOException {
        this.t.s();
        lk60 lk60Var = this.d;
        BehindLiveWindowException behindLiveWindowException = lk60Var.o;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = lk60Var.f87p;
        if (uri == null || !uri.equals(lk60Var.q)) {
            return;
        }
        lk60Var.g.k(lk60Var.f87p);
    }

    public final void K(pnf1[] pnf1VarArr, int... iArr) {
        this.i1 = C(pnf1VarArr);
        this.j1 = new HashSet();
        for (int i : iArr) {
            this.j1.add(this.i1.a(i));
        }
        this.l1 = 0;
        this.R0.post(new gv40(this.c, (byte) 1));
        this.d1 = true;
    }

    public final void L() {
        for (ql60 ql60Var : this.V0) {
            ql60Var.A(this.r1);
        }
        this.r1 = false;
    }

    public final boolean M(long j, boolean z) {
        qk60 qk60Var;
        boolean zC;
        this.p1 = j;
        if (H()) {
            this.q1 = j;
            return true;
        }
        boolean z2 = this.d.r;
        ArrayList arrayList = this.N0;
        if (!z2) {
            qk60Var = null;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                qk60Var = null;
                break;
            }
            qk60Var = (qk60) arrayList.get(i);
            if (qk60Var.g == j) {
                break;
            }
            i++;
        }
        if (this.c1 && !z && !arrayList.isEmpty()) {
            int length = this.V0.length;
            for (int i2 = 0; i2 < length; i2++) {
                ql60 ql60Var = this.V0[i2];
                if (qk60Var != null) {
                    zC = ql60Var.B(qk60Var.g(i2));
                } else {
                    long jA = a();
                    zC = ql60Var.C(j, jA == Long.MIN_VALUE || j < jA);
                }
                if (zC || (!this.o1[i2] && this.m1)) {
                }
            }
            return false;
        }
        this.q1 = j;
        this.t1 = false;
        arrayList.clear();
        eyh0 eyh0Var = this.t;
        if (!eyh0Var.q()) {
            eyh0Var.d = null;
            L();
            return true;
        }
        if (this.c1) {
            for (ql60 ql60Var2 : this.V0) {
                ql60Var2.j();
            }
        }
        eyh0Var.a();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    public final void N(long j) {
        boolean z;
        if (this.t1) {
            long j2 = this.u1;
            if (j2 == Long.MIN_VALUE || (j != Long.MIN_VALUE && j <= j2)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        this.u1 = j;
        if (this.c1) {
            for (ql60 ql60Var : this.V0) {
                ql60Var.D(j);
            }
        }
        if (z) {
            this.t1 = false;
            this.c.c(this);
        }
    }

    @Override // p.v561
    public final long a() {
        if (H()) {
            return this.q1;
        }
        if (this.t1) {
            return Long.MIN_VALUE;
        }
        return F().h;
    }

    @Override // p.v561
    public final boolean b() {
        return this.t.q();
    }

    @Override // p.m541
    public final void e() {
        this.R0.post(this.P0);
    }

    public final void h(f9e0 f9e0Var, long j, long j2, int i) {
        yag yagVar = (yag) f9e0Var;
        c2e0 c2e0Var = new c2e0(yagVar.a, yagVar.b, j);
        if (i != 0) {
            rsb1 rsb1Var = yagVar.i;
            c2e0Var.d = rsb1Var.c;
            c2e0Var.e = rsb1Var.d;
            c2e0Var.f = j2;
            c2e0Var.g = rsb1Var.b;
        }
        this.X.L(new d2e0(c2e0Var), yagVar.c, this.b, yagVar.d, yagVar.e, yagVar.f, yagVar.g, yagVar.h, i);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x023d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0250  */
    /* JADX WARN: Code duplicated, block: B:118:0x0269  */
    /* JADX WARN: Code duplicated, block: B:119:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x027a  */
    /* JADX WARN: Code duplicated, block: B:123:0x027e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0286  */
    /* JADX WARN: Code duplicated, block: B:126:0x028a  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:155:0x0305  */
    /* JADX WARN: Code duplicated, block: B:160:0x030f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0312  */
    /* JADX WARN: Code duplicated, block: B:163:0x0316  */
    /* JADX WARN: Code duplicated, block: B:165:0x031b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0323  */
    /* JADX WARN: Code duplicated, block: B:170:0x0328  */
    /* JADX WARN: Code duplicated, block: B:172:0x032c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0334 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0338  */
    /* JADX WARN: Code duplicated, block: B:180:0x0356  */
    /* JADX WARN: Code duplicated, block: B:181:0x035a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0368  */
    /* JADX WARN: Code duplicated, block: B:184:0x036a  */
    /* JADX WARN: Code duplicated, block: B:187:0x038e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0393  */
    /* JADX WARN: Code duplicated, block: B:191:0x03af  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:194:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:198:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:201:0x03d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:203:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:205:0x03db  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:209:0x0411  */
    /* JADX WARN: Code duplicated, block: B:210:0x041b  */
    /* JADX WARN: Code duplicated, block: B:212:0x0423  */
    /* JADX WARN: Code duplicated, block: B:215:0x0439  */
    /* JADX WARN: Code duplicated, block: B:217:0x043f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x0458  */
    /* JADX WARN: Code duplicated, block: B:228:0x0461  */
    /* JADX WARN: Code duplicated, block: B:231:0x0467  */
    /* JADX WARN: Code duplicated, block: B:234:0x046e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:240:0x047b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0483  */
    /* JADX WARN: Code duplicated, block: B:246:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:250:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:252:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:255:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:257:0x04f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:260:0x04fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:262:0x0501  */
    /* JADX WARN: Code duplicated, block: B:266:0x051a  */
    /* JADX WARN: Code duplicated, block: B:268:0x051e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0527 A[EDGE_INSN: B:270:0x0527->B:289:0x0577 BREAK  A[LOOP:3: B:280:0x0550->B:288:0x0572], PHI: r34
      0x0527: PHI (r34v3 java.util.ArrayList) = (r34v0 java.util.ArrayList), (r34v0 java.util.ArrayList), (r34v0 java.util.ArrayList), (r34v1 java.util.ArrayList) binds: [B:269:0x0525, B:276:0x0544, B:278:0x0548, B:311:0x0527] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:271:0x052a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0534  */
    /* JADX WARN: Code duplicated, block: B:274:0x0540  */
    /* JADX WARN: Code duplicated, block: B:277:0x0546  */
    /* JADX WARN: Code duplicated, block: B:291:0x058e A[LOOP:1: B:290:0x058c->B:291:0x058e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:294:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:296:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:300:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:310:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x0138  */
    /* JADX WARN: Code duplicated, block: B:73:0x013b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0169  */
    /* JADX WARN: Code duplicated, block: B:78:0x016c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0178  */
    /* JADX WARN: Code duplicated, block: B:84:0x0183  */
    /* JADX WARN: Code duplicated, block: B:87:0x018b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.v561
    public final boolean i(hae0 hae0Var) {
        long jMax;
        long j;
        long j2;
        long j3;
        List list;
        long j4;
        List list2;
        long jMax2;
        long j5;
        long j6;
        long jMax3;
        bm00 bm00Var;
        int i;
        ArrayList arrayList;
        long j7;
        bm00 bm00Var2;
        int i2;
        qk60 qk60Var;
        int iR;
        boolean z;
        Uri uriB;
        mk60 mk60Var;
        String str;
        bl60 bl60VarB;
        long j8;
        long j9;
        long jLongValue;
        int iIntValue;
        int iIntValue2;
        int i3;
        bl60 bl60Var;
        kk60 kk60VarF;
        String str2;
        boolean z2;
        long j10;
        kk60 kk60VarF2;
        oi oiVar;
        boolean z3;
        zk60 zk60Var;
        long j11;
        Uri uriQ;
        hk60 hk60VarG;
        String str3;
        Uri uriQ2;
        hk60 hk60VarG2;
        boolean z4;
        boolean z5;
        o2r o2rVar;
        byte[] bArr;
        byte[] bArr2;
        Map map;
        int i4;
        boolean z6;
        byte[] bArrF;
        o2r w82Var;
        yk60 yk60Var;
        n3r n3rVar;
        o2r o2rVar2;
        boolean z7;
        int i5;
        zl70 zl70Var;
        izr0 izr0Var;
        fdc fdcVar;
        SparseArray sparseArray;
        yve1 yve1Var;
        n3r n3rVar2;
        boolean z8;
        boolean z9;
        fdc fdcVar2;
        boolean z10;
        byte[] bArrF2;
        o2r w82Var2;
        String str4;
        Uri uriB2;
        g1s g1sVar;
        boolean z11;
        yag yagVar;
        Uri uri;
        boolean z12;
        long j12;
        qk60 qk60Var2;
        ArrayList arrayList2;
        v280 v280VarM;
        int i6;
        int i7;
        g1s g1sVar2;
        long j13;
        ArrayList arrayList3 = this.N0;
        oi oiVar2 = this.Z;
        eyh0 eyh0Var = this.t;
        if (this.t1 || eyh0Var.q() || eyh0Var.l()) {
            return false;
        }
        long j14 = -9223372036854775807L;
        if (H()) {
            List list3 = Collections.EMPTY_LIST;
            long j15 = this.q1;
            for (ql60 ql60Var : this.V0) {
                ql60Var.t = this.q1;
            }
            list = list3;
            j = -9223372036854775807L;
            j2 = j15;
            j3 = j2;
        } else {
            List list4 = this.O0;
            qk60 qk60VarF = F();
            boolean z13 = qk60VarF.H;
            long j16 = qk60VarF.g;
            if (z13 && qk60VarF.h()) {
                long j17 = qk60VarF.K;
                jMax = j17 != -9223372036854775807L ? j16 + j17 : -9223372036854775807L;
            } else {
                jMax = Math.max(this.p1, j16);
            }
            long jMax4 = this.p1;
            if (this.c1) {
                ql60[] ql60VarArr = this.V0;
                int length = ql60VarArr.length;
                int i8 = 0;
                while (i8 < length) {
                    ql60 ql60Var2 = ql60VarArr[i8];
                    synchronized (ql60Var2) {
                        j4 = j14;
                        list2 = list4;
                        jMax2 = Math.max(ql60Var2.v, ql60Var2.o(ql60Var2.s));
                    }
                    jMax4 = Math.max(jMax4, jMax2);
                    i8++;
                    j14 = j4;
                    list4 = list2;
                }
            }
            j = j14;
            j2 = jMax;
            j3 = jMax4;
            list = list4;
        }
        oiVar2.c = null;
        oiVar2.b = false;
        oiVar2.d = null;
        lk60 lk60Var = this.d;
        boolean z14 = this.d1 || !list.isEmpty();
        bm00 bm00Var3 = lk60Var.k;
        ml60[] ml60VarArr = lk60Var.e;
        h1s h1sVar = lk60Var.g;
        qk60 qk60Var3 = list.isEmpty() ? null : (qk60) hr80.r(list);
        int iB = qk60Var3 == null ? -1 : lk60Var.i.b(qk60Var3.d);
        List list5 = list;
        long j18 = hae0Var.a;
        long jMax5 = j2 - j18;
        long j19 = lk60Var.t;
        long j20 = j19 != j ? j19 - j18 : j;
        if (qk60Var3 != null && !lk60Var.r) {
            j5 = j20;
            long j21 = qk60Var3.h - qk60Var3.g;
            j6 = j18;
            jMax5 = Math.max(0L, jMax5 - j21);
            if (j5 != j) {
                jMax3 = Math.max(0L, j5 - j21);
            }
            vjh0[] vjh0VarArrB = lk60Var.b(qk60Var3, j2);
            if (iB != -1) {
                qp00 qp00Var = lk60Var.s;
                bm00Var = bm00Var3;
                i = iB;
                boolean z15 = qp00Var.a(qp00Var.m(iB), SystemClock.elapsedRealtime());
                arrayList = arrayList3;
                j7 = j2;
                boolean z16 = z15;
                bm00Var2 = bm00Var;
                i2 = i;
                qk60Var = qk60Var3;
                lk60Var.s.l(j6, jMax5, jMax3, list5, vjh0VarArrB);
                iR = lk60Var.s.r();
                if (i2 != iR) {
                    z = true;
                } else {
                    z = false;
                }
                uriB = ml60VarArr[iR].b();
                mk60Var = lk60Var.h;
                if (mk60Var == null && mk60Var.k) {
                    str = ml60VarArr[iR].d;
                } else {
                    str = null;
                }
                if (h1sVar.g(uriB)) {
                    bl60VarB = h1sVar.b(uriB, true);
                    bl60VarB.getClass();
                    lk60Var.r = bl60VarB.c;
                    if (bl60VarB.o) {
                        j8 = j;
                    } else {
                        j8 = (bl60VarB.h + bl60VarB.u) - h1sVar.V0;
                    }
                    lk60Var.t = j8;
                    j9 = bl60VarB.h - h1sVar.V0;
                    Pair pairE = lk60Var.e(qk60Var, z, bl60VarB, j9, j7);
                    jLongValue = ((Long) pairE.first).longValue();
                    iIntValue = ((Integer) pairE.second).intValue();
                    if (z || z16 || qk60Var == null || (jLongValue >= bl60VarB.k && ((kk60VarF = lk60.f(bl60VarB, jLongValue, iIntValue)) == null || j9 + kk60VarF.a.e >= j3))) {
                        iIntValue2 = iIntValue;
                        bl60Var = bl60VarB;
                        i3 = iR;
                    } else {
                        uriB = ml60VarArr[i2].b();
                        bl60 bl60VarB2 = h1sVar.b(uriB, true);
                        bl60VarB2.getClass();
                        j9 = bl60VarB2.h - h1sVar.V0;
                        Pair pairE2 = lk60Var.e(qk60Var, false, bl60VarB2, j9, j7);
                        jLongValue = ((Long) pairE2.first).longValue();
                        iIntValue2 = ((Integer) pairE2.second).intValue();
                        i3 = i2;
                        bl60Var = bl60VarB2;
                    }
                    str2 = bl60Var.a;
                    z2 = bl60Var.c;
                    j10 = bl60Var.k;
                    b380 b380Var = bl60Var.r;
                    if (i3 != i2 && i2 != -1) {
                        uriB2 = ml60VarArr[i2].b();
                        g1sVar = (g1s) h1sVar.d.get(uriB2);
                        if (g1sVar != null) {
                            HashMap map2 = g1sVar.b;
                            dm5.y(map2.containsKey(uriB2));
                            f1s f1sVar = (f1s) map2.get(uriB2);
                            f1sVar.getClass();
                            f1sVar.Y = false;
                        }
                    }
                    if (jLongValue < j10) {
                        lk60Var.o = new BehindLiveWindowException();
                        oiVar = oiVar2;
                    } else {
                        kk60VarF2 = lk60.f(bl60Var, jLongValue, iIntValue2);
                        if (kk60VarF2 == null) {
                            oiVar = oiVar2;
                        } else if (bl60Var.o) {
                            oiVar = oiVar2;
                            if (!z14 || b380Var.isEmpty()) {
                                oiVar.b = true;
                            } else {
                                kk60VarF2 = new kk60((zk60) hr80.r(b380Var), (j10 + ((long) b380Var.size())) - 1, -1);
                            }
                        } else {
                            oiVar = oiVar2;
                            oiVar.d = uriB;
                            
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0282: IPUT (r4v18 'uriB' android.net.Uri), (r19v2 ?? I:??[OBJECT, ARRAY]) (LINE:643) p.lk60.q android.net.Uri in method: p.rl60.i(p.hae0):boolean, file: /workspace/spotify-analysis/dex-input/classes3.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v2 ??
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 1502
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p.rl60.i(p.hae0):boolean");
                        }

                        public final void j(f9e0 f9e0Var, long j, long j2) {
                            yag yagVar = (yag) f9e0Var;
                            this.U0 = null;
                            if (yagVar instanceof hk60) {
                                hk60 hk60Var = (hk60) yagVar;
                                byte[] bArr = hk60Var.j;
                                lk60 lk60Var = this.d;
                                lk60Var.n = bArr;
                                bm00 bm00Var = lk60Var.k;
                                Uri uri = hk60Var.b.a;
                                byte[] bArr2 = hk60Var.l;
                                bArr2.getClass();
                                nr30 nr30Var = (nr30) bm00Var.b;
                                uri.getClass();
                            }
                            c2e0 c2e0Var = new c2e0(yagVar.a, yagVar.b, j);
                            rsb1 rsb1Var = yagVar.i;
                            c2e0Var.d = rsb1Var.c;
                            c2e0Var.e = rsb1Var.d;
                            c2e0Var.f = j2;
                            c2e0Var.g = rsb1Var.b;
                            d2e0 d2e0Var = new d2e0(c2e0Var);
                            this.i.getClass();
                            this.X.I(d2e0Var, yagVar.c, this.b, yagVar.d, yagVar.e, yagVar.f, yagVar.g, yagVar.h);
                            if (this.d1) {
                                this.c.c(this);
                                return;
                            }
                            gae0 gae0Var = new gae0();
                            gae0Var.a = this.p1;
                            i(new hae0(gae0Var));
                        }

                        @Override // p.g9e0
                        public final void l() {
                            for (ql60 ql60Var : this.V0) {
                                ql60Var.A(true);
                                y8v y8vVar = ql60Var.h;
                                if (y8vVar != null) {
                                    y8vVar.c(ql60Var.e);
                                    ql60Var.h = null;
                                    ql60Var.g = null;
                                }
                            }
                        }

                        public final void n(f9e0 f9e0Var, long j, long j2, boolean z) {
                            yag yagVar = (yag) f9e0Var;
                            this.U0 = null;
                            c2e0 c2e0Var = new c2e0(yagVar.a, yagVar.b, j);
                            rsb1 rsb1Var = yagVar.i;
                            c2e0Var.d = rsb1Var.c;
                            c2e0Var.e = rsb1Var.d;
                            c2e0Var.f = j2;
                            c2e0Var.g = rsb1Var.b;
                            d2e0 d2e0Var = new d2e0(c2e0Var);
                            this.i.getClass();
                            this.X.H(d2e0Var, yagVar.c, this.b, yagVar.d, yagVar.e, yagVar.f, yagVar.g, yagVar.h);
                            if (z) {
                                return;
                            }
                            if (H() || this.e1 == 0) {
                                L();
                            }
                            if (this.e1 > 0) {
                                this.c.c(this);
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:56:0x010f  */
                        /* JADX WARN: Code duplicated, block: B:61:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:62:0x0128  */
                        /* JADX WARN: Code duplicated, block: B:65:0x0132  */
                        /* JADX WARN: Code duplicated, block: B:66:0x0137  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0144  */
                        /* JADX WARN: Code duplicated, block: B:71:0x0151  */
                        /* JADX WARN: Code duplicated, block: B:72:0x0159  */
                        /* JADX WARN: Code duplicated, block: B:75:0x0178  */
                        /* JADX WARN: Code duplicated, block: B:77:0x017c  */
                        /* JADX WARN: Code duplicated, block: B:79:0x0180  */
                        /* JADX WARN: Code duplicated, block: B:81:0x0192  */
                        public final o4t o(f9e0 f9e0Var, long j, long j2, IOException iOException, int i) {
                            a2e0 a2e0Var;
                            boolean z;
                            long j3;
                            boolean zA;
                            boolean z2;
                            int iM;
                            long jN;
                            o4t o4tVar;
                            o4t o4tVar2;
                            boolean zE;
                            ArrayList arrayList;
                            boolean z3;
                            int i2;
                            yag yagVar = (yag) f9e0Var;
                            lk60 lk60Var = this.d;
                            mk60 mk60Var = lk60Var.h;
                            boolean z4 = yagVar instanceof qk60;
                            if (z4 && !((qk60) yagVar).h() && (iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i2 = ((HttpDataSource.InvalidResponseCodeException) iOException).d) == 410 || i2 == 404)) {
                                return eyh0.X;
                            }
                            long j4 = yagVar.i.b;
                            c2e0 c2e0Var = new c2e0(yagVar.a, yagVar.b, j);
                            rsb1 rsb1Var = yagVar.i;
                            c2e0Var.d = rsb1Var.c;
                            c2e0Var.e = rsb1Var.d;
                            c2e0Var.f = j2;
                            c2e0Var.g = j4;
                            d2e0 d2e0Var = new d2e0(c2e0Var);
                            zoi1.n0(yagVar.g);
                            zoi1.n0(yagVar.h);
                            sw9 sw9Var = new sw9(iOException, i, (byte) 18);
                            boolean z5 = yagVar instanceof qk60;
                            if (z5) {
                                a2e0Var = lk60Var.a(((qk60) yagVar).m);
                            } else {
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                int length = lk60Var.s.length();
                                boolean z6 = mk60Var != null && mk60Var.k;
                                a2e0Var = new a2e0(z6, 1, 0, length, lk60Var.d(jElapsedRealtime, z6));
                            }
                            this.i.getClass();
                            b2e0 b2e0VarL = ij81.l(a2e0Var, sw9Var);
                            if (b2e0VarL != null) {
                                byte b = b2e0VarL.b;
                                if (mk60Var == null || !mk60Var.k) {
                                    mk60Var = null;
                                }
                                int i3 = b2e0VarL.a;
                                z = z4;
                                j3 = j4;
                                long j5 = i3;
                                if (b == 1) {
                                    if (mk60Var != null) {
                                        lk60Var.s.d();
                                        zA = mk60Var.a(j5);
                                    } else if (z5) {
                                        h1s h1sVar = lk60Var.g;
                                        Uri uri = ((qk60) yagVar).m;
                                        g1s g1sVar = (g1s) h1sVar.d.get(uri);
                                        zA = g1sVar != null ? g1sVar.a(j5, uri, null) : false;
                                    }
                                    z2 = zA;
                                } else {
                                    if (b != 2) {
                                        eg.m(f4i1.c(b, "Invalid fallback selection type: "));
                                        return null;
                                    }
                                    int iB = lk60Var.i.b(yagVar.d);
                                    if (iB != -1 && (iM = lk60Var.s.m(iB)) != -1) {
                                        zA = lk60Var.s.h(iM, j5);
                                        z2 = zA;
                                    }
                                }
                                if (z2) {
                                    if (z && j3 == 0) {
                                        arrayList = this.N0;
                                        if (((qk60) arrayList.remove(arrayList.size() - 1)) == yagVar) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        dm5.y(z3);
                                        if (arrayList.isEmpty()) {
                                            this.q1 = this.p1;
                                        } else {
                                            ((qk60) hr80.r(arrayList)).J = true;
                                        }
                                    }
                                    o4tVar = eyh0.Y;
                                } else {
                                    jN = ij81.n(sw9Var);
                                    if (jN != -9223372036854775807L) {
                                        o4tVar = new o4t(0, jN);
                                    } else {
                                        o4tVar = eyh0.Z;
                                    }
                                }
                                o4tVar2 = o4tVar;
                                zE = o4tVar2.e();
                                this.X.J(d2e0Var, yagVar.c, this.b, yagVar.d, yagVar.e, yagVar.f, yagVar.g, yagVar.h, iOException, !zE);
                                if (!zE) {
                                    this.U0 = null;
                                }
                                if (z2) {
                                    if (!this.d1) {
                                        gae0 gae0Var = new gae0();
                                        gae0Var.a = this.p1;
                                        i(new hae0(gae0Var));
                                        return o4tVar2;
                                    }
                                    this.c.c(this);
                                }
                                return o4tVar2;
                            }
                            z = z4;
                            j3 = j4;
                            z2 = false;
                            if (z2) {
                                if (z) {
                                    arrayList = this.N0;
                                    if (((qk60) arrayList.remove(arrayList.size() - 1)) == yagVar) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    dm5.y(z3);
                                    if (arrayList.isEmpty()) {
                                        this.q1 = this.p1;
                                    } else {
                                        ((qk60) hr80.r(arrayList)).J = true;
                                    }
                                }
                                o4tVar = eyh0.Y;
                            } else {
                                jN = ij81.n(sw9Var);
                                if (jN != -9223372036854775807L) {
                                    o4tVar = new o4t(0, jN);
                                } else {
                                    o4tVar = eyh0.Z;
                                }
                            }
                            o4tVar2 = o4tVar;
                            zE = o4tVar2.e();
                            this.X.J(d2e0Var, yagVar.c, this.b, yagVar.d, yagVar.e, yagVar.f, yagVar.g, yagVar.h, iOException, !zE);
                            if (!zE) {
                                this.U0 = null;
                            }
                            if (z2) {
                                if (!this.d1) {
                                    gae0 gae0Var2 = new gae0();
                                    gae0Var2.a = this.p1;
                                    i(new hae0(gae0Var2));
                                    return o4tVar2;
                                }
                                this.c.c(this);
                            }
                            return o4tVar2;
                        }

                        public final void s() {
                            this.v1 = true;
                            this.R0.post(this.Q0);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v15, types: [p.ql60[]] */
                        /* JADX WARN: Type inference failed for: r1v1, types: [p.ql60[]] */
                        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
                        /* JADX WARN: Type inference failed for: r5v0 */
                        /* JADX WARN: Type inference failed for: r5v1 */
                        /* JADX WARN: Type inference failed for: r5v2 */
                        /* JADX WARN: Type inference failed for: r5v3, types: [p.gtf1] */
                        /* JADX WARN: Type inference failed for: r5v4, types: [p.n541, p.ql60] */
                        /* JADX WARN: Type inference failed for: r5v6, types: [p.x6u] */
                        /* JADX WARN: Type inference failed for: r5v7 */
                        /* JADX WARN: Type inference failed for: r5v8 */
                        public final gtf1 w(int i, int i2) {
                            Integer numValueOf = Integer.valueOf(i2);
                            Set set = z1;
                            boolean zContains = set.contains(numValueOf);
                            HashSet hashSet = this.X0;
                            SparseIntArray sparseIntArray = this.Y0;
                            ?? ql60Var = 0;
                            ql60Var = 0;
                            if (zContains) {
                                dm5.m(set.contains(Integer.valueOf(i2)));
                                int i3 = sparseIntArray.get(i2, -1);
                                if (i3 != -1) {
                                    if (hashSet.add(Integer.valueOf(i2))) {
                                        this.W0[i3] = i;
                                    }
                                    ql60Var = this.W0[i3] == i ? this.V0[i3] : B(i, i2);
                                }
                            } else {
                                int i4 = 0;
                                while (true) {
                                    ?? r1 = this.V0;
                                    if (i4 >= r1.length) {
                                        break;
                                    }
                                    if (this.W0[i4] == i) {
                                        ql60Var = r1[i4];
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            if (ql60Var == 0) {
                                if (this.v1) {
                                    return B(i, i2);
                                }
                                int length = this.V0.length;
                                boolean z = i2 == 1 || i2 == 2;
                                ql60Var = new ql60(this.e, this.g, this.h, this.T0);
                                ql60Var.t = this.p1;
                                if (z) {
                                    ql60Var.L = this.x1;
                                    ql60Var.C = true;
                                }
                                long j = this.w1;
                                if (ql60Var.I != j) {
                                    ql60Var.I = j;
                                    ql60Var.C = true;
                                }
                                qk60 qk60Var = this.y1;
                                if (qk60Var != null) {
                                    ql60Var.F = qk60Var.k;
                                }
                                ql60Var.f = this;
                                int i5 = length + 1;
                                int[] iArrCopyOf = Arrays.copyOf(this.W0, i5);
                                this.W0 = iArrCopyOf;
                                iArrCopyOf[length] = i;
                                ql60[] ql60VarArr = this.V0;
                                String str = zoi1.a;
                                ?? CopyOf = Arrays.copyOf(ql60VarArr, ql60VarArr.length + 1);
                                CopyOf[ql60VarArr.length] = ql60Var;
                                this.V0 = (ql60[]) CopyOf;
                                boolean[] zArrCopyOf = Arrays.copyOf(this.o1, i5);
                                this.o1 = zArrCopyOf;
                                zArrCopyOf[length] = z;
                                this.m1 |= z;
                                hashSet.add(Integer.valueOf(i2));
                                sparseIntArray.append(i2, length);
                                if (G(i2) > G(this.a1)) {
                                    this.b1 = length;
                                    this.a1 = i2;
                                }
                                this.n1 = Arrays.copyOf(this.n1, i5);
                            }
                            if (i2 != 5) {
                                return ql60Var;
                            }
                            pl60 pl60Var = this.Z0;
                            if (pl60Var != null) {
                                return pl60Var;
                            }
                            pl60 pl60Var2 = new pl60(ql60Var, this.Y ? 1 : 0);
                            this.Z0 = pl60Var2;
                            return pl60Var2;
                        }

                        @Override // p.v561
                        public final long x() {
                            long j;
                            ArrayList arrayList = this.N0;
                            if (this.t1) {
                                return Long.MIN_VALUE;
                            }
                            if (H()) {
                                return this.q1;
                            }
                            long jMax = this.p1;
                            qk60 qk60VarF = F();
                            if (!qk60VarF.H) {
                                qk60VarF = arrayList.size() > 1 ? (qk60) l1d.i(2, arrayList) : null;
                            }
                            if (qk60VarF != null) {
                                jMax = Math.max(jMax, qk60VarF.h);
                            }
                            if (this.c1) {
                                for (ql60 ql60Var : this.V0) {
                                    synchronized (ql60Var) {
                                        j = ql60Var.w;
                                    }
                                    jMax = Math.max(jMax, j);
                                }
                            }
                            return jMax;
                        }

                        @Override // p.v561
                        public final void y(long j) {
                            eyh0 eyh0Var = this.t;
                            if (eyh0Var.l() || H()) {
                                return;
                            }
                            boolean zQ = eyh0Var.q();
                            boolean z = false;
                            lk60 lk60Var = this.d;
                            ArrayList arrayList = this.N0;
                            List list = this.O0;
                            if (zQ) {
                                yag yagVar = this.U0;
                                yagVar.getClass();
                                if (!(yagVar instanceof qk60) || A(arrayList.size() - 1)) {
                                    long j2 = this.u1;
                                    if (j2 == Long.MIN_VALUE || yagVar.g < j2) {
                                        if (!(lk60Var.o == null ? lk60Var.s.b(j, yagVar, list) : false)) {
                                            return;
                                        }
                                    }
                                    eyh0Var.a();
                                    return;
                                }
                                return;
                            }
                            int size = list.size();
                            while (size > 0 && lk60Var.c((qk60) list.get(size - 1)) == 2) {
                                size--;
                            }
                            if (size < list.size()) {
                                E(size);
                            }
                            int iMin = Math.min(arrayList.size(), (lk60Var.o != null || lk60Var.s.length() < 2) ? list.size() : lk60Var.s.q(j, list));
                            if (this.u1 != Long.MIN_VALUE) {
                                while (iMin > 0 && ((qk60) arrayList.get(iMin - 1)).g >= this.u1) {
                                    iMin--;
                                    z = true;
                                }
                            }
                            if (iMin < arrayList.size()) {
                                E(iMin);
                            }
                            if (z) {
                                this.q1 = -9223372036854775807L;
                                this.t1 = true;
                            }
                        }

                        public final void z() {
                            dm5.y(this.d1);
                            this.i1.getClass();
                            this.j1.getClass();
                        }

                        public final void c(fn51 fn51Var) {
                        }
                    }
