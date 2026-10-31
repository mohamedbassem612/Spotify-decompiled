package p;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class cjl {
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final lhl J;
    public final lhl K;
    public final lhl L;
    public final lhl M;
    public final lhl N;
    public final lhl O;
    public final lhl P;
    public final lhl Q;
    public final lhl[] R;
    public final ArrayList S;
    public final boolean[] T;
    public bjl[] U;
    public cjl V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public boolean a;
    public int a0;
    public xbe b;
    public int b0;
    public xbe c;
    public int c0;
    public ur60 d;
    public int d0;
    public s6j1 e;
    public int e0;
    public final boolean[] f;
    public float f0;
    public boolean g;
    public float g0;
    public int h;
    public Object h0;
    public int i;
    public int i0;
    public final xol1 j;
    public boolean j0;
    public String k;
    public String k0;
    public boolean l;
    public int l0;
    public boolean m;
    public int m0;
    public boolean n;
    public final float[] n0;
    public boolean o;
    public final cjl[] o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22p;
    public final cjl[] p0;
    public int q;
    public cjl q0;
    public int r;
    public cjl r0;
    public int s;
    public int s0;
    public int t;
    public int t0;
    public final int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    public cjl() {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new xol1(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.f22p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        lhl lhlVar = new lhl(this, 2);
        this.J = lhlVar;
        lhl lhlVar2 = new lhl(this, 3);
        this.K = lhlVar2;
        lhl lhlVar3 = new lhl(this, 4);
        this.L = lhlVar3;
        lhl lhlVar4 = new lhl(this, 5);
        this.M = lhlVar4;
        lhl lhlVar5 = new lhl(this, 6);
        this.N = lhlVar5;
        this.O = new lhl(this, 8);
        this.P = new lhl(this, 9);
        lhl lhlVar6 = new lhl(this, 7);
        this.Q = lhlVar6;
        this.R = new lhl[]{lhlVar, lhlVar3, lhlVar2, lhlVar4, lhlVar5, lhlVar6};
        this.S = new ArrayList();
        this.T = new boolean[2];
        bjl bjlVar = bjl.a;
        this.U = new bjl[]{bjlVar, bjlVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new float[]{-1.0f, -1.0f};
        this.o0 = new cjl[]{null, null};
        this.p0 = new cjl[]{null, null};
        this.q0 = null;
        this.r0 = null;
        this.s0 = -1;
        this.t0 = -1;
        a();
    }

    public static void I(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void J(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void q(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, bjl bjlVar) {
        sb.append(str);
        sb.append(" :  {\n");
        String string = bjlVar.toString();
        if (!"FIXED".equals(string)) {
            bb00.j(sb, "      behavior", " :   ", string, ",\n");
        }
        J(sb, "      size", i, 0);
        J(sb, "      min", i2, 0);
        J(sb, "      max", i3, Integer.MAX_VALUE);
        J(sb, "      matchMin", i4, 0);
        J(sb, "      matchDef", i5, 0);
        I(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void r(StringBuilder sb, String str, lhl lhlVar) {
        if (lhlVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(lhlVar.f);
        sb.append("'");
        if (lhlVar.h != Integer.MIN_VALUE || lhlVar.g != 0) {
            sb.append(",");
            sb.append(lhlVar.g);
            if (lhlVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(lhlVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        lhl lhlVar = this.K;
        lhl lhlVar2 = lhlVar.f;
        if (lhlVar2 != null && lhlVar2.f == lhlVar) {
            return true;
        }
        lhl lhlVar3 = this.M;
        lhl lhlVar4 = lhlVar3.f;
        return lhlVar4 != null && lhlVar4.f == lhlVar3;
    }

    public final boolean B() {
        return this.g && this.i0 != 8;
    }

    public boolean C() {
        if (this.l) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean D() {
        if (this.m) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public void E() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.V = null;
        this.E = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        bjl[] bjlVarArr = this.U;
        bjl bjlVar = bjl.a;
        bjlVarArr[0] = bjlVar;
        bjlVarArr[1] = bjlVar;
        this.h0 = null;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        float[] fArr = this.n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f22p = -1;
        this.q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void F() {
        cjl cjlVar = this.V;
        if (cjlVar != null && (cjlVar instanceof djl)) {
            ((djl) cjlVar).getClass();
        }
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lhl) arrayList.get(i)).j();
        }
    }

    public final void G() {
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lhl lhlVar = (lhl) arrayList.get(i);
            lhlVar.c = false;
            lhlVar.b = 0;
        }
    }

    public void H(cab cabVar) {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.Q.k();
        this.O.k();
        this.P.k();
    }

    public final void K(int i) {
        this.c0 = i;
        this.F = i > 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public final void L(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.Y = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i2);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i;
                }
            } else {
                String strSubstring3 = str.substring(i2, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else {
                        fAbs = i3 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.Y = fAbs;
            this.Z = i3;
        }
    }

    public final void M(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        this.l = true;
    }

    public final void N(int i, int i2) {
        if (this.m) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        if (this.F) {
            this.N.l(i + this.c0);
        }
        this.m = true;
    }

    public final void O(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public final void P(bjl bjlVar) {
        this.U[0] = bjlVar;
    }

    public final void Q(float f, int i, int i2, int i3) {
        this.s = i;
        this.v = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.w = i3;
        this.x = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.s = 2;
    }

    public final void R(bjl bjlVar) {
        this.U[1] = bjlVar;
    }

    public final void S(float f, int i, int i2, int i3) {
        this.t = i;
        this.y = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.z = i3;
        this.A = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.t = 2;
    }

    public final void T(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void U(boolean z, boolean z2) {
        int i;
        int i2;
        ur60 ur60Var = this.d;
        boolean z3 = z & ur60Var.g;
        s6j1 s6j1Var = this.e;
        boolean z4 = z2 & s6j1Var.g;
        int i3 = ur60Var.h.g;
        int i4 = s6j1Var.h.g;
        int i5 = ur60Var.i.g;
        int i6 = s6j1Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.a0 = i3;
        }
        if (z4) {
            this.b0 = i4;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        bjl bjlVar = bjl.a;
        if (z3) {
            if (this.U[0] == bjlVar && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i10 = this.d0;
            if (i8 < i10) {
                this.W = i10;
            }
        }
        if (z4) {
            if (this.U[1] == bjlVar && i9 < (i = this.X)) {
                i9 = i;
            }
            this.X = i9;
            int i11 = this.e0;
            if (i9 < i11) {
                this.X = i11;
            }
        }
    }

    public void V(yic0 yic0Var, boolean z) {
        int i;
        int i2;
        s6j1 s6j1Var;
        ur60 ur60Var;
        yic0Var.getClass();
        int iN = yic0.n(this.J);
        int iN2 = yic0.n(this.K);
        int iN3 = yic0.n(this.L);
        int iN4 = yic0.n(this.M);
        if (z && (ur60Var = this.d) != null) {
            zct zctVar = ur60Var.h;
            if (zctVar.j) {
                zct zctVar2 = ur60Var.i;
                if (zctVar2.j) {
                    iN = zctVar.g;
                    iN3 = zctVar2.g;
                }
            }
        }
        if (z && (s6j1Var = this.e) != null) {
            zct zctVar3 = s6j1Var.h;
            if (zctVar3.j) {
                zct zctVar4 = s6j1Var.i;
                if (zctVar4.j) {
                    iN2 = zctVar3.g;
                    iN4 = zctVar4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.a0 = iN;
        this.b0 = iN2;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        bjl[] bjlVarArr = this.U;
        bjl bjlVar = bjlVarArr[0];
        bjl bjlVar2 = bjl.a;
        if (bjlVar == bjlVar2 && i4 < (i2 = this.W)) {
            i4 = i2;
        }
        if (bjlVarArr[1] == bjlVar2 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i4;
        this.X = i5;
        int i6 = this.e0;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.d0;
        if (i4 < i7) {
            this.W = i7;
        } else {
            i7 = i4;
        }
        int i8 = this.w;
        bjl bjlVar3 = bjl.c;
        if (i8 > 0 && bjlVar == bjlVar3) {
            this.W = Math.min(i7, i8);
        }
        int i9 = this.z;
        if (i9 > 0 && this.U[1] == bjlVar3) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void a() {
        lhl lhlVar = this.J;
        ArrayList arrayList = this.S;
        arrayList.add(lhlVar);
        arrayList.add(this.K);
        arrayList.add(this.L);
        arrayList.add(this.M);
        arrayList.add(this.O);
        arrayList.add(this.P);
        arrayList.add(this.Q);
        arrayList.add(this.N);
    }

    public final void b(djl djlVar, yic0 yic0Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            ltn1.v(djlVar, yic0Var, this);
            hashSet.remove(this);
            c(yic0Var, djlVar.b0(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((lhl) it.next()).d.b(djlVar, yic0Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((lhl) it2.next()).d.b(djlVar, yic0Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((lhl) it3.next()).d.b(djlVar, yic0Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((lhl) it4.next()).d.b(djlVar, yic0Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((lhl) it5.next()).d.b(djlVar, yic0Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0210  */
    /* JADX WARN: Code duplicated, block: B:128:0x0218  */
    /* JADX WARN: Code duplicated, block: B:131:0x0221  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:137:0x023e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0247  */
    /* JADX WARN: Code duplicated, block: B:148:0x026d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0293  */
    /* JADX WARN: Code duplicated, block: B:164:0x029e  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:190:0x0302  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:256:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:266:0x03da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:277:0x0403  */
    /* JADX WARN: Code duplicated, block: B:281:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x0421  */
    /* JADX WARN: Code duplicated, block: B:287:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x042d  */
    /* JADX WARN: Code duplicated, block: B:293:0x0437  */
    /* JADX WARN: Code duplicated, block: B:296:0x043e  */
    /* JADX WARN: Code duplicated, block: B:298:0x0442  */
    /* JADX WARN: Code duplicated, block: B:301:0x045b  */
    /* JADX WARN: Code duplicated, block: B:320:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:335:0x054f  */
    /* JADX WARN: Code duplicated, block: B:351:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:354:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:355:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:358:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:395:0x0674  */
    /* JADX WARN: Code duplicated, block: B:397:0x067a  */
    /* JADX WARN: Code duplicated, block: B:399:0x0683  */
    /* JADX WARN: Code duplicated, block: B:400:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:403:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r37v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r60v0, types: [p.cjl] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    public void c(yic0 yic0Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r19;
        int i6;
        boolean z2;
        HashSet hashSet;
        cjl cjlVar;
        djl djlVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        cjl cjlVar2;
        djl djlVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr;
        lhl lhlVar;
        boolean[] zArr2;
        boolean z3;
        ?? r12;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        bjl bjlVar;
        bjl bjlVar2;
        boolean z5;
        bjl bjlVar3;
        boolean z6;
        float f;
        int i12;
        int i13;
        p6a1 p6a1Var;
        p6a1 p6a1Var2;
        int i14;
        int i15;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        lhl lhlVar2;
        boolean z11;
        p6a1 p6a1Var3;
        p6a1 p6a1Var4;
        int i16;
        ?? r20;
        bjl bjlVar4;
        boolean z12;
        ?? r3;
        boolean z13;
        ?? r110;
        p6a1 p6a1Var5;
        p6a1 p6a1Var6;
        p6a1 p6a1Var7;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f2;
        ?? r27;
        s6j1 s6j1Var;
        ur60 ur60Var;
        int i23;
        int i24;
        ?? Z;
        boolean zA;
        ur60 ur60Var2;
        s6j1 s6j1Var2;
        boolean z14;
        yic0 yic0Var2 = yic0Var;
        lhl lhlVar3 = this.J;
        p6a1 p6a1VarK = yic0Var2.k(lhlVar3);
        lhl lhlVar4 = this.L;
        p6a1 p6a1VarK2 = yic0Var2.k(lhlVar4);
        lhl lhlVar5 = this.K;
        p6a1 p6a1VarK3 = yic0Var2.k(lhlVar5);
        lhl lhlVar6 = this.M;
        p6a1 p6a1VarK4 = yic0Var2.k(lhlVar6);
        lhl lhlVar7 = this.N;
        p6a1 p6a1VarK5 = yic0Var2.k(lhlVar7);
        cjl cjlVar3 = this.V;
        bjl bjlVar5 = bjl.b;
        if (cjlVar3 != null) {
            bjl[] bjlVarArr = cjlVar3.U;
            i2 = 0;
            i4 = bjlVarArr[0] == bjlVar5 ? 1 : 0;
            int i25 = bjlVarArr[1] == bjlVar5 ? 1 : 0;
            int i26 = this.r;
            if (i26 != 1) {
                i = 1;
                if (i26 == 2) {
                    i4 = 0;
                } else if (i26 != 3) {
                }
                i3 = i25;
            } else {
                i = 1;
                i3 = 0;
            }
            i5 = this.i0;
            r19 = i3;
            boolean[] zArr3 = this.T;
            if (i5 != 8 && !this.j0) {
                ArrayList arrayList = this.S;
                int size = arrayList.size();
                i6 = i4;
                int i27 = i2;
                while (true) {
                    if (i27 >= size) {
                        if (zArr3[i2] || zArr3[i]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i28 = size;
                    HashSet hashSet2 = ((lhl) arrayList.get(i27)).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i27++;
                    size = i28;
                }
            } else {
                i6 = i4;
            }
            z2 = this.l;
            if (z2 || this.m) {
                if (z2) {
                    yic0Var2.d(p6a1VarK, this.a0);
                    yic0Var2.d(p6a1VarK2, this.a0 + this.W);
                    if (i6 != 0 && (cjlVar2 = this.V) != null) {
                        djlVar2 = (djl) cjlVar2;
                        weakReference3 = djlVar2.L0;
                        if (weakReference3 != null || weakReference3.get() == null || lhlVar3.d() > ((lhl) djlVar2.L0.get()).d()) {
                            djlVar2.L0 = new WeakReference(lhlVar3);
                        }
                        weakReference4 = djlVar2.N0;
                        if (weakReference4 != null || weakReference4.get() == null || lhlVar4.d() > ((lhl) djlVar2.N0.get()).d()) {
                            djlVar2.N0 = new WeakReference(lhlVar4);
                        }
                    }
                }
                if (this.m) {
                    yic0Var2.d(p6a1VarK3, this.b0);
                    yic0Var2.d(p6a1VarK4, this.b0 + this.X);
                    hashSet = lhlVar7.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        yic0Var2.d(p6a1VarK5, this.b0 + this.c0);
                    }
                    if (r19 != 0 && (cjlVar = this.V) != null) {
                        djlVar = (djl) cjlVar;
                        weakReference = djlVar.K0;
                        if (weakReference != null || weakReference.get() == null || lhlVar5.d() > ((lhl) djlVar.K0.get()).d()) {
                            djlVar.K0 = new WeakReference(lhlVar5);
                        }
                        weakReference2 = djlVar.M0;
                        if (weakReference2 != null || weakReference2.get() == null || lhlVar6.d() > ((lhl) djlVar.M0.get()).d()) {
                            djlVar.M0 = new WeakReference(lhlVar6);
                        }
                    }
                }
                if (this.l && this.m) {
                    ?? r13 = i2;
                    this.l = r13;
                    this.m = r13;
                    return;
                }
            }
            zArr = this.f;
            if (z || (ur60Var2 = this.d) == null || (s6j1Var2 = this.e) == null) {
                lhlVar = lhlVar7;
                zArr2 = zArr;
            } else {
                lhlVar = lhlVar7;
                zct zctVar = ur60Var2.h;
                zArr2 = zArr;
                if (zctVar.j && ur60Var2.i.j && s6j1Var2.h.j && s6j1Var2.i.j) {
                    yic0Var2.d(p6a1VarK, zctVar.g);
                    yic0Var2.d(p6a1VarK2, this.d.i.g);
                    yic0Var2.d(p6a1VarK3, this.e.h.g);
                    yic0Var2.d(p6a1VarK4, this.e.i.g);
                    yic0Var2.d(p6a1VarK5, this.e.k.g);
                    if (this.V == null) {
                        z14 = false;
                    } else {
                        if (i6 != 0 && zArr2[0] && !z()) {
                            yic0Var2.f(yic0Var2.k(this.V.L), p6a1VarK2, 0, 8);
                        }
                        if (r19 == 0 || !zArr2[i] || A()) {
                            z14 = false;
                        } else {
                            z14 = false;
                            yic0Var2.f(yic0Var2.k(this.V.M), p6a1VarK4, 0, 8);
                        }
                    }
                    this.l = z14;
                    this.m = z14;
                    return;
                }
            }
            if (this.V != null) {
                if (y(0)) {
                    ((djl) this.V).X(this, 0);
                    int i29 = i;
                    i24 = i29 == true ? 1 : 0;
                    Z = i29;
                } else {
                    i24 = i;
                    Z = z();
                }
                if (y(i24)) {
                    ((djl) this.V).X(this, i24);
                    zA = true;
                } else {
                    zA = A();
                }
                if (Z != 0 && i6 != 0 && this.i0 != 8 && lhlVar3.f == null && lhlVar4.f == null) {
                    yic0Var2.f(yic0Var2.k(this.V.L), p6a1VarK2, 0, 1);
                }
                if (!zA && r19 != 0 && this.i0 != 8 && lhlVar5.f == null && lhlVar6.f == null && lhlVar == null) {
                    yic0Var2.f(yic0Var2.k(this.V.M), p6a1VarK4, 0, 1);
                }
                z3 = zA;
                r12 = Z;
            } else {
                lhlVar3 = lhlVar3;
                z3 = false;
                r12 = 0;
            }
            i7 = this.W;
            i8 = this.d0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.X;
            z4 = z3;
            i10 = this.e0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            bjl[] bjlVarArr2 = this.U;
            bjlVar = bjlVarArr2[0];
            bjlVar2 = bjl.c;
            if (bjlVar != bjlVar2) {
                z5 = true;
            } else {
                z5 = false;
            }
            bjlVar3 = bjlVarArr2[1];
            if (bjlVar3 != bjlVar2) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i30 = this.Z;
            this.B = i30;
            float f3 = this.Y;
            this.C = f3;
            f = f3;
            i12 = this.s;
            i13 = this.t;
            if (f > 0.0f) {
                p6a1Var = p6a1VarK4;
                if (this.i0 != 8) {
                    if (bjlVar == bjlVar2 || i12 != 0) {
                        i14 = i12;
                    } else {
                        i14 = 3;
                    }
                    if (bjlVar3 == bjlVar2 || i13 != 0) {
                        i23 = i13;
                    } else {
                        i23 = 3;
                    }
                    if (bjlVar != bjlVar2 && bjlVar3 == bjlVar2) {
                        p6a1Var2 = p6a1VarK5;
                        if (i14 == 3 && i23 == 3) {
                            if (i30 == -1) {
                                if (z5 && !z6) {
                                    this.B = 0;
                                    i30 = 0;
                                } else if (!z5 && z6) {
                                    this.B = 1;
                                    if (i30 == -1) {
                                        this.C = 1.0f / f;
                                    }
                                    i30 = 1;
                                }
                            }
                            if (i30 == 0 && (!lhlVar5.h() || !lhlVar6.h())) {
                                this.B = 1;
                            } else if (this.B == 1 && (!lhlVar3.h() || !lhlVar4.h())) {
                                this.B = 0;
                            }
                            if (this.B == -1 && (!lhlVar5.h() || !lhlVar6.h() || !lhlVar3.h() || !lhlVar4.h())) {
                                if (lhlVar5.h() && lhlVar6.h()) {
                                    this.B = 0;
                                } else if (lhlVar3.h() && lhlVar4.h()) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                }
                            }
                            int i31 = this.B;
                            if (i31 == -1) {
                                int i32 = this.v;
                                if (i32 > 0 && this.y == 0) {
                                    this.B = 0;
                                    i31 = 0;
                                } else if (i32 == 0 && this.y > 0) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                    i31 = 1;
                                }
                            }
                            i30 = i31;
                        }
                        i6 = i6;
                        z7 = true;
                        i15 = i23;
                        int[] iArr = this.u;
                        iArr[0] = i14;
                        iArr[1] = i15;
                        if (z7 || !(i30 == 0 || i30 == -1)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z7 || !(i30 == 1 || i30 == -1)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (this.U[0] == bjlVar5 || !(this instanceof djl)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            i8 = 0;
                        }
                        lhlVar2 = this.Q;
                        z11 = !lhlVar2.h();
                        boolean z15 = zArr3[0];
                        boolean z16 = zArr3[1];
                        if (this.f22p != 2 || this.l) {
                            p6a1Var3 = p6a1VarK;
                            p6a1Var4 = p6a1VarK2;
                            i16 = i14;
                            r20 = r12;
                            bjlVar4 = bjlVar5;
                            z12 = z4;
                            r3 = i6;
                            z13 = z11;
                            r110 = r19;
                        } else {
                            if (z && (ur60Var = this.d) != null) {
                                zct zctVar2 = ur60Var.h;
                                if (zctVar2.j && ur60Var.i.j) {
                                    if (z) {
                                        yic0Var2.d(p6a1VarK, zctVar2.g);
                                        yic0Var2.d(p6a1VarK2, this.d.i.g);
                                        if (this.V != null && i6 != 0 && zArr2[0] && !z()) {
                                            yic0Var2.f(yic0Var2.k(this.V.L), p6a1VarK2, 0, 8);
                                        }
                                    }
                                    p6a1Var3 = p6a1VarK;
                                    p6a1Var4 = p6a1VarK2;
                                    i16 = i14;
                                    r20 = r12;
                                    bjlVar4 = bjlVar5;
                                    z12 = z4;
                                    r3 = i6;
                                    z13 = z11;
                                    r110 = r19;
                                }
                            }
                            cjl cjlVar4 = this.V;
                            p6a1 p6a1VarK6 = cjlVar4 != null ? yic0Var2.k(cjlVar4.L) : null;
                            cjl cjlVar5 = this.V;
                            p6a1 p6a1VarK7 = cjlVar5 != null ? yic0Var2.k(cjlVar5.J) : null;
                            boolean z17 = zArr2[0];
                            bjl[] bjlVarArr3 = this.U;
                            i16 = i14;
                            ?? r111 = r12;
                            ?? r4 = i6;
                            boolean z18 = z11;
                            p6a1Var4 = p6a1VarK2;
                            bjlVar4 = bjlVar5;
                            p6a1Var3 = p6a1VarK;
                            yic0Var2 = yic0Var;
                            e(yic0Var2, true, r4, r19, z17, p6a1VarK7, p6a1VarK6, bjlVarArr3[0], z10, this.J, this.L, this.a0, i8, this.d0, this.D[0], this.f0, z8, bjlVarArr3[1] == bjlVar2, r111, z4, z15, i16, i15, this.v, this.w, this.x, z18);
                            z12 = z4;
                            r20 = r111 == true ? 1 : 0;
                            r110 = r19 == true ? 1 : 0;
                            r3 = r4;
                            z13 = z18;
                        }
                        if (z || (s6j1Var = this.e) == null) {
                            p6a1Var5 = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05a0: MOVE (r4v2 'p6a1Var5' p.p6a1) = (r33v0 p.p6a1) (LINE:1441) in method: p.cjl.c(p.yic0, boolean):void, file: /workspace/spotify-analysis/dex-input/classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 p.p6a1
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 1929
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p.cjl.c(p.yic0, boolean):void");
                        }

                        public boolean d() {
                            return this.i0 != 8;
                        }

                        /* JADX WARN: Code duplicated, block: B:220:0x03c4  */
                        /* JADX WARN: Code duplicated, block: B:222:0x03c8  */
                        /* JADX WARN: Code duplicated, block: B:229:0x03dc  */
                        /* JADX WARN: Code duplicated, block: B:231:0x0401  */
                        /* JADX WARN: Code duplicated, block: B:240:0x041e  */
                        /* JADX WARN: Code duplicated, block: B:257:0x0451  */
                        /* JADX WARN: Code duplicated, block: B:259:0x0457  */
                        /* JADX WARN: Code duplicated, block: B:270:0x046c  */
                        /* JADX WARN: Code duplicated, block: B:275:0x0476  */
                        /* JADX WARN: Code duplicated, block: B:277:0x047a  */
                        /* JADX WARN: Code duplicated, block: B:278:0x047c  */
                        /* JADX WARN: Code duplicated, block: B:281:0x0484  */
                        /* JADX WARN: Code duplicated, block: B:287:0x0492 A[PHI: r0
                          0x0492: PHI (r0v15 int) = (r0v14 int), (r0v19 int), (r0v19 int), (r0v19 int) binds: [B:280:0x0482, B:282:0x0488, B:283:0x048a, B:285:0x048e] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:290:0x04a4 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:291:0x04a6  */
                        /* JADX WARN: Code duplicated, block: B:292:0x04ab  */
                        /* JADX WARN: Code duplicated, block: B:294:0x04ae  */
                        /* JADX WARN: Code duplicated, block: B:303:0x04c5  */
                        /* JADX WARN: Code duplicated, block: B:337:0x0522  */
                        public final void e(yic0 yic0Var, boolean z, boolean z2, boolean z3, boolean z4, p6a1 p6a1Var, p6a1 p6a1Var2, bjl bjlVar, boolean z5, lhl lhlVar, lhl lhlVar2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
                            boolean z12;
                            boolean z13;
                            int iMin;
                            boolean z14;
                            int i9;
                            int i10;
                            boolean z15;
                            p6a1 p6a1VarK;
                            p6a1 p6a1VarK2;
                            lhl lhlVar3;
                            p6a1 p6a1Var3;
                            int i11;
                            int i12;
                            boolean z16;
                            boolean z17;
                            boolean z18;
                            boolean z19;
                            cjl cjlVar;
                            boolean z20;
                            int iMin2;
                            boolean z21;
                            int i13;
                            int iE;
                            int i14;
                            int i15;
                            HashSet hashSet;
                            boolean z22;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int i20;
                            boolean z23;
                            boolean z24;
                            int i21;
                            yic0Var = yic0Var;
                            int i22 = i7;
                            int i23 = i8;
                            p6a1 p6a1VarK3 = yic0Var.k(lhlVar);
                            p6a1 p6a1VarK4 = yic0Var.k(lhlVar2);
                            p6a1 p6a1VarK5 = yic0Var.k(lhlVar.f);
                            p6a1 p6a1VarK6 = yic0Var.k(lhlVar2.f);
                            boolean zH = lhlVar.h();
                            boolean zH2 = lhlVar2.h();
                            boolean zH3 = this.Q.h();
                            int i24 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
                            if (zH3) {
                                i24++;
                            }
                            int i25 = i24;
                            int i26 = z6 ? 3 : i5;
                            int iOrdinal = bjlVar.ordinal();
                            boolean z25 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i26 == 4) ? false : true;
                            int i27 = this.h;
                            if (i27 == -1 || !z) {
                                i27 = i2;
                                z12 = z25;
                            } else {
                                this.h = -1;
                                z12 = false;
                            }
                            int i28 = this.i;
                            if (i28 == -1 || z) {
                                z13 = z12;
                            } else {
                                this.i = -1;
                                i27 = i28;
                                z13 = false;
                            }
                            boolean z26 = z13;
                            if (this.i0 == 8) {
                                z14 = false;
                                iMin = 0;
                            } else {
                                iMin = i27;
                                z14 = z26;
                            }
                            if (z11) {
                                if (!zH && !zH2 && !zH3) {
                                    yic0Var.d(p6a1VarK3, i);
                                } else if (zH && !zH2) {
                                    i9 = 8;
                                    yic0Var.e(p6a1VarK3, p6a1VarK5, lhlVar.e(), 8);
                                }
                                i9 = 8;
                            } else {
                                i9 = 8;
                            }
                            if (z14 != 0) {
                                if (i25 == 2 || z6 || !(i26 == 1 || i26 == 0)) {
                                    if (i22 == -2) {
                                        i22 = iMin;
                                    }
                                    if (i23 == -2) {
                                        i23 = iMin;
                                    }
                                    if (iMin > 0 && i26 != 1) {
                                        iMin = 0;
                                    }
                                    if (i22 > 0) {
                                        yic0Var.f(p6a1VarK4, p6a1VarK3, i22, 8);
                                        iMin = Math.max(iMin, i22);
                                    }
                                    if (i23 > 0) {
                                        if (!z2 || i26 != 1) {
                                            yic0Var.g(p6a1VarK4, p6a1VarK3, i23, 8);
                                        }
                                        iMin = Math.min(iMin, i23);
                                    }
                                    if (i26 == 1) {
                                        if (z2) {
                                            yic0Var.e(p6a1VarK4, p6a1VarK3, iMin, 8);
                                        } else if (z8) {
                                            yic0Var.e(p6a1VarK4, p6a1VarK3, iMin, 5);
                                            yic0Var.g(p6a1VarK4, p6a1VarK3, iMin, 8);
                                        } else {
                                            yic0Var.e(p6a1VarK4, p6a1VarK3, iMin, 5);
                                            yic0Var.g(p6a1VarK4, p6a1VarK3, iMin, 8);
                                        }
                                    } else if (i26 == 2) {
                                        int i29 = lhlVar.e;
                                        if (i29 == 3 || i29 == 5) {
                                            p6a1VarK = yic0Var.k(this.V.k(3));
                                            p6a1VarK2 = yic0Var.k(this.V.k(5));
                                        } else {
                                            p6a1VarK = yic0Var.k(this.V.k(2));
                                            p6a1VarK2 = yic0Var.k(this.V.k(4));
                                        }
                                        c46 c46VarL = yic0Var.l();
                                        int i30 = i22;
                                        c46VarL.d.g(p6a1VarK4, -1.0f);
                                        c46VarL.d.g(p6a1VarK3, 1.0f);
                                        c46VarL.d.g(p6a1VarK2, f2);
                                        c46VarL.d.g(p6a1VarK, -f2);
                                        yic0Var.c(c46VarL);
                                        if (z2) {
                                            z14 = false;
                                        }
                                        z15 = z4;
                                        i10 = i30;
                                    } else {
                                        i10 = i22;
                                        z15 = true;
                                    }
                                } else {
                                    int iMax = Math.max(i22, iMin);
                                    if (i23 > 0) {
                                        iMax = Math.min(i23, iMax);
                                    }
                                    yic0Var.e(p6a1VarK4, p6a1VarK3, iMax, 8);
                                    z15 = z4;
                                    i10 = i22;
                                    z14 = false;
                                }
                                if (z11 || z8) {
                                    boolean z27 = z15;
                                    if (i25 >= 2 && z2 && z27) {
                                        yic0Var.f(p6a1VarK3, p6a1Var, 0, 8);
                                        lhl lhlVar4 = this.N;
                                        boolean z28 = z || lhlVar4.f == null;
                                        if (!z && (lhlVar3 = lhlVar4.f) != null) {
                                            cjl cjlVar2 = lhlVar3.d;
                                            if (cjlVar2.Y != 0.0f) {
                                                bjl[] bjlVarArr = cjlVar2.U;
                                                bjl bjlVar2 = bjlVarArr[0];
                                                bjl bjlVar3 = bjl.c;
                                                if (bjlVar2 == bjlVar3 && bjlVarArr[1] == bjlVar3) {
                                                    z28 = true;
                                                } else {
                                                    z28 = false;
                                                }
                                            } else {
                                                z28 = false;
                                            }
                                        }
                                        if (z28) {
                                            yic0Var.f(p6a1Var2, p6a1VarK4, 0, 8);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                if (zH || zH2 || zH3) {
                                    if (zH && !zH2) {
                                        lhlVar2 = lhlVar2;
                                        p6a1VarK4 = p6a1VarK4;
                                        z15 = z15;
                                        p6a1Var3 = p6a1VarK6;
                                        z20 = z2;
                                        i21 = (z2 && (lhlVar.f.d instanceof c9a)) ? 8 : 5;
                                    } else if (zH || !zH2) {
                                        p6a1Var3 = p6a1VarK6;
                                        if (zH && zH2) {
                                            cjl cjlVar3 = lhlVar.f.d;
                                            cjl cjlVar4 = lhlVar2.f.d;
                                            z15 = z15;
                                            cjl cjlVar5 = this.V;
                                            int i31 = 6;
                                            if (z14) {
                                                if (i26 == 0) {
                                                    if (i23 != 0 || i10 != 0) {
                                                        i19 = 5;
                                                        i20 = 5;
                                                        z23 = true;
                                                        z24 = false;
                                                        z17 = true;
                                                    } else if (p6a1VarK5.f && p6a1Var3.f) {
                                                        yic0Var.e(p6a1VarK3, p6a1VarK5, lhlVar.e(), 8);
                                                        yic0Var.e(p6a1VarK4, p6a1Var3, -lhlVar2.e(), 8);
                                                        return;
                                                    } else {
                                                        i19 = 8;
                                                        i20 = 8;
                                                        z23 = false;
                                                        z24 = true;
                                                        z17 = false;
                                                    }
                                                    if ((cjlVar3 instanceof c9a) || (cjlVar4 instanceof c9a)) {
                                                        yic0Var = yic0Var;
                                                        i26 = i26;
                                                        p6a1VarK3 = p6a1VarK3;
                                                        p6a1VarK4 = p6a1VarK4;
                                                        z18 = z24;
                                                        p6a1Var2 = p6a1Var2;
                                                        i11 = i19;
                                                        p6a1VarK5 = p6a1VarK5;
                                                        i31 = 6;
                                                        z16 = z23;
                                                        i12 = 4;
                                                    } else {
                                                        yic0Var = yic0Var;
                                                        p6a1VarK3 = p6a1VarK3;
                                                        p6a1VarK4 = p6a1VarK4;
                                                        z18 = z24;
                                                        i11 = i19;
                                                        p6a1VarK5 = p6a1VarK5;
                                                        i31 = 6;
                                                        z16 = z23;
                                                        i12 = i20;
                                                        i26 = i26;
                                                        p6a1Var2 = p6a1Var2;
                                                    }
                                                } else {
                                                    if (i26 == 2) {
                                                        if ((cjlVar3 instanceof c9a) || (cjlVar4 instanceof c9a)) {
                                                            i11 = 5;
                                                        } else {
                                                            yic0Var = yic0Var;
                                                            i26 = i26;
                                                            p6a1VarK3 = p6a1VarK3;
                                                            p6a1VarK4 = p6a1VarK4;
                                                            p6a1VarK5 = p6a1VarK5;
                                                            i31 = 6;
                                                            i11 = 5;
                                                            i12 = 5;
                                                        }
                                                        z16 = true;
                                                        z17 = true;
                                                        z18 = false;
                                                        p6a1Var2 = p6a1Var2;
                                                    } else if (i26 == 1) {
                                                        i11 = 8;
                                                    } else if (i26 == 3) {
                                                        i26 = i26;
                                                        if (this.B != -1) {
                                                            if (z6) {
                                                                if (i6 == 2 || i6 == 1) {
                                                                    i17 = 5;
                                                                    i18 = 4;
                                                                } else {
                                                                    i17 = 8;
                                                                    i18 = 5;
                                                                }
                                                                i12 = i18;
                                                                z16 = true;
                                                                z17 = true;
                                                                z18 = true;
                                                            } else {
                                                                if (i23 > 0) {
                                                                    yic0Var = yic0Var;
                                                                    p6a1Var2 = p6a1Var2;
                                                                    p6a1VarK3 = p6a1VarK3;
                                                                    p6a1VarK4 = p6a1VarK4;
                                                                    p6a1VarK5 = p6a1VarK5;
                                                                    i31 = 6;
                                                                    i11 = 5;
                                                                } else if (i23 != 0 || i10 != 0) {
                                                                    yic0Var = yic0Var;
                                                                    p6a1Var2 = p6a1Var2;
                                                                    p6a1VarK3 = p6a1VarK3;
                                                                    p6a1VarK4 = p6a1VarK4;
                                                                    p6a1VarK5 = p6a1VarK5;
                                                                    i31 = 6;
                                                                    i11 = 5;
                                                                    i12 = 4;
                                                                } else if (z9) {
                                                                    i17 = (cjlVar3 == cjlVar5 || cjlVar4 == cjlVar5) ? 5 : 4;
                                                                    i12 = 4;
                                                                    z16 = true;
                                                                    z17 = true;
                                                                    z18 = true;
                                                                } else {
                                                                    yic0Var = yic0Var;
                                                                    p6a1Var2 = p6a1Var2;
                                                                    p6a1VarK3 = p6a1VarK3;
                                                                    p6a1VarK4 = p6a1VarK4;
                                                                    p6a1VarK5 = p6a1VarK5;
                                                                    i31 = 6;
                                                                    i11 = 5;
                                                                    i12 = 8;
                                                                }
                                                                z16 = true;
                                                                z17 = true;
                                                                z18 = true;
                                                            }
                                                            i11 = i17;
                                                            yic0Var = yic0Var;
                                                        } else if (z9) {
                                                            yic0Var = yic0Var;
                                                            p6a1Var2 = p6a1Var2;
                                                            p6a1VarK3 = p6a1VarK3;
                                                            p6a1VarK4 = p6a1VarK4;
                                                            p6a1VarK5 = p6a1VarK5;
                                                            i11 = 8;
                                                            i31 = z2 ? 5 : 4;
                                                        } else {
                                                            yic0Var = yic0Var;
                                                            p6a1Var2 = p6a1Var2;
                                                            p6a1VarK3 = p6a1VarK3;
                                                            p6a1VarK4 = p6a1VarK4;
                                                            p6a1VarK5 = p6a1VarK5;
                                                            i11 = 8;
                                                            i31 = 8;
                                                        }
                                                        i12 = 5;
                                                        z16 = true;
                                                        z17 = true;
                                                        z18 = true;
                                                    } else {
                                                        i11 = 5;
                                                        i12 = 4;
                                                        z16 = false;
                                                        z17 = false;
                                                    }
                                                    i12 = 4;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = false;
                                                    p6a1Var2 = p6a1Var2;
                                                }
                                                if (z17 || p6a1VarK5 != p6a1Var3 || cjlVar3 == cjlVar5) {
                                                    z19 = true;
                                                } else {
                                                    z17 = false;
                                                    z19 = false;
                                                }
                                                if (z16) {
                                                    if (z14 && !z7 && !z9 && p6a1VarK5 == p6a1Var && p6a1Var3 == p6a1Var2) {
                                                        i31 = 8;
                                                        z20 = false;
                                                        i16 = 8;
                                                        z22 = false;
                                                    } else {
                                                        z20 = z2;
                                                        z22 = z19;
                                                        i16 = i11;
                                                    }
                                                    p6a1 p6a1Var4 = p6a1VarK5;
                                                    cjlVar = cjlVar4;
                                                    yic0Var.b(p6a1VarK3, p6a1Var4, lhlVar.e(), f, p6a1Var3, p6a1VarK4, lhlVar2.e(), i31);
                                                    p6a1VarK5 = p6a1Var4;
                                                    i11 = i16;
                                                    z19 = z22;
                                                } else {
                                                    cjlVar = cjlVar4;
                                                    z20 = z2;
                                                }
                                                if (this.i0 != 8 && ((hashSet = lhlVar2.a) == null || hashSet.size() <= 0)) {
                                                    return;
                                                }
                                                if (z17) {
                                                    if (z20 && p6a1VarK5 != p6a1Var3 && !z14 && ((cjlVar3 instanceof c9a) || (cjlVar instanceof c9a))) {
                                                        i11 = 6;
                                                    }
                                                    yic0Var.f(p6a1VarK3, p6a1VarK5, lhlVar.e(), i11);
                                                    yic0Var.g(p6a1VarK4, p6a1Var3, -lhlVar2.e(), i11);
                                                }
                                                if (z20 || !z10 || (cjlVar3 instanceof c9a) || (cjlVar instanceof c9a) || cjlVar == cjlVar5) {
                                                    iMin2 = i12;
                                                    z21 = z19;
                                                } else {
                                                    iMin2 = 6;
                                                    i11 = 6;
                                                    z21 = true;
                                                }
                                                if (z21) {
                                                    if (z18 && (!z9 || z3)) {
                                                        if (cjlVar3 != cjlVar5 && cjlVar != cjlVar5) {
                                                            i31 = iMin2;
                                                        }
                                                        if ((cjlVar3 instanceof tq50) || (cjlVar instanceof tq50)) {
                                                            i31 = 5;
                                                        }
                                                        if ((cjlVar3 instanceof c9a) || (cjlVar instanceof c9a)) {
                                                            i31 = 5;
                                                        }
                                                        if (z9) {
                                                            i15 = 5;
                                                        } else {
                                                            i15 = i31;
                                                        }
                                                        iMin2 = Math.max(i15, iMin2);
                                                    }
                                                    if (z20) {
                                                        iMin2 = Math.min(i11, iMin2);
                                                        if (z6 || z9 || !(cjlVar3 == cjlVar5 || cjlVar == cjlVar5)) {
                                                            i14 = iMin2;
                                                        } else {
                                                            i14 = 4;
                                                        }
                                                    } else {
                                                        i14 = iMin2;
                                                    }
                                                    yic0Var.e(p6a1VarK3, p6a1VarK5, lhlVar.e(), i14);
                                                    yic0Var.e(p6a1VarK4, p6a1Var3, -lhlVar2.e(), i14);
                                                }
                                                if (z20) {
                                                    if (p6a1Var == p6a1VarK5) {
                                                        iE = lhlVar.e();
                                                    } else {
                                                        iE = 0;
                                                    }
                                                    if (p6a1VarK5 != p6a1Var) {
                                                        yic0Var.f(p6a1VarK3, p6a1Var, iE, 5);
                                                    }
                                                }
                                                if (z20 || !z14 || i3 != 0 || i10 != 0) {
                                                    i13 = 5;
                                                } else if (z14 && i26 == 3) {
                                                    yic0Var.f(p6a1VarK4, p6a1VarK3, 0, 8);
                                                    i13 = 5;
                                                } else {
                                                    i13 = 5;
                                                    yic0Var.f(p6a1VarK4, p6a1VarK3, 0, 5);
                                                }
                                            } else {
                                                if (p6a1VarK5.f && p6a1Var3.f) {
                                                    yic0Var.b(p6a1VarK3, p6a1VarK5, lhlVar.e(), f, p6a1Var3, p6a1VarK4, lhlVar2.e(), 8);
                                                    if (z2 && z15) {
                                                        int iE2 = lhlVar2.f != null ? lhlVar2.e() : 0;
                                                        if (p6a1Var3 != p6a1Var2) {
                                                            yic0Var.f(p6a1Var2, p6a1VarK4, iE2, 5);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                i11 = 5;
                                                i12 = 4;
                                                z16 = true;
                                                z17 = true;
                                            }
                                            z18 = false;
                                            if (z17) {
                                                z19 = true;
                                            } else {
                                                z19 = true;
                                            }
                                            if (z16) {
                                                if (z14) {
                                                    z20 = z2;
                                                    z22 = z19;
                                                    i16 = i11;
                                                } else {
                                                    z20 = z2;
                                                    z22 = z19;
                                                    i16 = i11;
                                                }
                                                p6a1 p6a1Var5 = p6a1VarK5;
                                                cjlVar = cjlVar4;
                                                yic0Var.b(p6a1VarK3, p6a1Var5, lhlVar.e(), f, p6a1Var3, p6a1VarK4, lhlVar2.e(), i31);
                                                p6a1VarK5 = p6a1Var5;
                                                i11 = i16;
                                                z19 = z22;
                                            } else {
                                                cjlVar = cjlVar4;
                                                z20 = z2;
                                            }
                                            if (this.i0 != 8) {
                                            }
                                            if (z17) {
                                                if (z20) {
                                                    i11 = 6;
                                                }
                                                yic0Var.f(p6a1VarK3, p6a1VarK5, lhlVar.e(), i11);
                                                yic0Var.g(p6a1VarK4, p6a1Var3, -lhlVar2.e(), i11);
                                            }
                                            if (z20) {
                                                iMin2 = i12;
                                                z21 = z19;
                                            } else {
                                                iMin2 = i12;
                                                z21 = z19;
                                            }
                                            if (z21) {
                                                if (z18) {
                                                    if (cjlVar3 != cjlVar5) {
                                                        i31 = iMin2;
                                                    }
                                                    if (cjlVar3 instanceof tq50) {
                                                        i31 = 5;
                                                    } else {
                                                        i31 = 5;
                                                    }
                                                    if (cjlVar3 instanceof c9a) {
                                                        i31 = 5;
                                                    } else {
                                                        i31 = 5;
                                                    }
                                                    if (z9) {
                                                        i15 = 5;
                                                    } else {
                                                        i15 = i31;
                                                    }
                                                    iMin2 = Math.max(i15, iMin2);
                                                }
                                                if (z20) {
                                                    iMin2 = Math.min(i11, iMin2);
                                                    if (z6) {
                                                        i14 = iMin2;
                                                    } else {
                                                        i14 = iMin2;
                                                    }
                                                } else {
                                                    i14 = iMin2;
                                                }
                                                yic0Var.e(p6a1VarK3, p6a1VarK5, lhlVar.e(), i14);
                                                yic0Var.e(p6a1VarK4, p6a1Var3, -lhlVar2.e(), i14);
                                            }
                                            if (z20) {
                                                if (p6a1Var == p6a1VarK5) {
                                                    iE = lhlVar.e();
                                                } else {
                                                    iE = 0;
                                                }
                                                if (p6a1VarK5 != p6a1Var) {
                                                    yic0Var.f(p6a1VarK3, p6a1Var, iE, 5);
                                                }
                                            }
                                            if (z20) {
                                                i13 = 5;
                                            } else {
                                                i13 = 5;
                                            }
                                        }
                                        i21 = i13;
                                    } else {
                                        p6a1Var3 = p6a1VarK6;
                                        yic0Var.e(p6a1VarK4, p6a1Var3, -lhlVar2.e(), 8);
                                        if (z2) {
                                            yic0Var.f(p6a1VarK3, p6a1Var, 0, 5);
                                            lhlVar2 = lhlVar2;
                                            i13 = 5;
                                            p6a1VarK4 = p6a1VarK4;
                                            z15 = z15;
                                        }
                                        z20 = z2;
                                        i21 = i13;
                                    }
                                    if (z20 || !z15) {
                                        return;
                                    }
                                    int iE3 = lhlVar2.f != null ? lhlVar2.e() : 0;
                                    if (p6a1Var3 != p6a1Var2) {
                                        yic0Var.f(p6a1Var2, p6a1VarK4, iE3, i21);
                                        return;
                                    }
                                    return;
                                }
                                p6a1Var3 = p6a1VarK6;
                                i13 = 5;
                                z20 = z2;
                                i21 = i13;
                                if (z20) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            if (z5) {
                                yic0Var.e(p6a1VarK4, p6a1VarK3, 0, 3);
                                if (i3 > 0) {
                                    yic0Var.f(p6a1VarK4, p6a1VarK3, i3, i9);
                                }
                                if (i4 < Integer.MAX_VALUE) {
                                    yic0Var.g(p6a1VarK4, p6a1VarK3, i4, i9);
                                }
                            } else {
                                yic0Var.e(p6a1VarK4, p6a1VarK3, iMin, i9);
                            }
                            z15 = z4;
                            i10 = i22;
                            if (z11) {
                            }
                            boolean z29 = z15;
                            if (i25 >= 2) {
                            }
                        }

                        public final void f(int i, cjl cjlVar, int i2, int i3) {
                            boolean z;
                            if (i == 7) {
                                if (i2 != 7) {
                                    if (i2 == 2 || i2 == 4) {
                                        f(2, cjlVar, i2, 0);
                                        f(4, cjlVar, i2, 0);
                                        k(7).a(cjlVar.k(i2), 0);
                                        return;
                                    } else {
                                        if (i2 == 3 || i2 == 5) {
                                            f(3, cjlVar, i2, 0);
                                            f(5, cjlVar, i2, 0);
                                            k(7).a(cjlVar.k(i2), 0);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                lhl lhlVarK = k(2);
                                lhl lhlVarK2 = k(4);
                                lhl lhlVarK3 = k(3);
                                lhl lhlVarK4 = k(5);
                                boolean z2 = true;
                                if ((lhlVarK == null || !lhlVarK.h()) && (lhlVarK2 == null || !lhlVarK2.h())) {
                                    f(2, cjlVar, 2, 0);
                                    f(4, cjlVar, 4, 0);
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if ((lhlVarK3 == null || !lhlVarK3.h()) && (lhlVarK4 == null || !lhlVarK4.h())) {
                                    f(3, cjlVar, 3, 0);
                                    f(5, cjlVar, 5, 0);
                                } else {
                                    z2 = false;
                                }
                                if (z && z2) {
                                    k(7).a(cjlVar.k(7), 0);
                                    return;
                                } else if (z) {
                                    k(8).a(cjlVar.k(8), 0);
                                    return;
                                } else {
                                    if (z2) {
                                        k(9).a(cjlVar.k(9), 0);
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (i == 8 && (i2 == 2 || i2 == 4)) {
                                lhl lhlVarK5 = k(2);
                                lhl lhlVarK6 = cjlVar.k(i2);
                                lhl lhlVarK7 = k(4);
                                lhlVarK5.a(lhlVarK6, 0);
                                lhlVarK7.a(lhlVarK6, 0);
                                k(8).a(lhlVarK6, 0);
                                return;
                            }
                            if (i == 9 && (i2 == 3 || i2 == 5)) {
                                lhl lhlVarK8 = cjlVar.k(i2);
                                k(3).a(lhlVarK8, 0);
                                k(5).a(lhlVarK8, 0);
                                k(9).a(lhlVarK8, 0);
                                return;
                            }
                            if (i == 8 && i2 == 8) {
                                k(2).a(cjlVar.k(2), 0);
                                k(4).a(cjlVar.k(4), 0);
                                k(8).a(cjlVar.k(i2), 0);
                                return;
                            }
                            if (i == 9 && i2 == 9) {
                                k(3).a(cjlVar.k(3), 0);
                                k(5).a(cjlVar.k(5), 0);
                                k(9).a(cjlVar.k(i2), 0);
                                return;
                            }
                            lhl lhlVarK9 = k(i);
                            lhl lhlVarK10 = cjlVar.k(i2);
                            if (lhlVarK9.i(lhlVarK10)) {
                                if (i == 6) {
                                    lhl lhlVarK11 = k(3);
                                    lhl lhlVarK12 = k(5);
                                    if (lhlVarK11 != null) {
                                        lhlVarK11.j();
                                    }
                                    if (lhlVarK12 != null) {
                                        lhlVarK12.j();
                                    }
                                } else if (i == 3 || i == 5) {
                                    lhl lhlVarK13 = k(6);
                                    if (lhlVarK13 != null) {
                                        lhlVarK13.j();
                                    }
                                    lhl lhlVarK14 = k(7);
                                    if (lhlVarK14.f != lhlVarK10) {
                                        lhlVarK14.j();
                                    }
                                    lhl lhlVarF = k(i).f();
                                    lhl lhlVarK15 = k(9);
                                    if (lhlVarK15.h()) {
                                        lhlVarF.j();
                                        lhlVarK15.j();
                                    }
                                } else if (i == 2 || i == 4) {
                                    lhl lhlVarK16 = k(7);
                                    if (lhlVarK16.f != lhlVarK10) {
                                        lhlVarK16.j();
                                    }
                                    lhl lhlVarF2 = k(i).f();
                                    lhl lhlVarK17 = k(8);
                                    if (lhlVarK17.h()) {
                                        lhlVarF2.j();
                                        lhlVarK17.j();
                                    }
                                }
                                lhlVarK9.a(lhlVarK10, i3);
                            }
                        }

                        public final void g(lhl lhlVar, lhl lhlVar2, int i) {
                            if (lhlVar.d == this) {
                                f(lhlVar.e, lhlVar2.d, lhlVar2.e, i);
                            }
                        }

                        public void h(cjl cjlVar, HashMap map) {
                            this.f22p = cjlVar.f22p;
                            this.q = cjlVar.q;
                            this.s = cjlVar.s;
                            this.t = cjlVar.t;
                            int[] iArr = cjlVar.u;
                            int i = iArr[0];
                            int[] iArr2 = this.u;
                            iArr2[0] = i;
                            iArr2[1] = iArr[1];
                            this.v = cjlVar.v;
                            this.w = cjlVar.w;
                            this.y = cjlVar.y;
                            this.z = cjlVar.z;
                            this.A = cjlVar.A;
                            this.B = cjlVar.B;
                            this.C = cjlVar.C;
                            int[] iArr3 = cjlVar.D;
                            this.D = Arrays.copyOf(iArr3, iArr3.length);
                            this.E = cjlVar.E;
                            this.F = cjlVar.F;
                            this.J.j();
                            this.K.j();
                            this.L.j();
                            this.M.j();
                            this.N.j();
                            this.O.j();
                            this.P.j();
                            this.Q.j();
                            this.U = (bjl[]) Arrays.copyOf(this.U, 2);
                            this.V = this.V == null ? null : (cjl) map.get(cjlVar.V);
                            this.W = cjlVar.W;
                            this.X = cjlVar.X;
                            this.Y = cjlVar.Y;
                            this.Z = cjlVar.Z;
                            this.a0 = cjlVar.a0;
                            this.b0 = cjlVar.b0;
                            this.c0 = cjlVar.c0;
                            this.d0 = cjlVar.d0;
                            this.e0 = cjlVar.e0;
                            this.f0 = cjlVar.f0;
                            this.g0 = cjlVar.g0;
                            this.h0 = cjlVar.h0;
                            this.i0 = cjlVar.i0;
                            this.j0 = cjlVar.j0;
                            this.k0 = cjlVar.k0;
                            this.l0 = cjlVar.l0;
                            this.m0 = cjlVar.m0;
                            float[] fArr = cjlVar.n0;
                            float f = fArr[0];
                            float[] fArr2 = this.n0;
                            fArr2[0] = f;
                            fArr2[1] = fArr[1];
                            cjl[] cjlVarArr = cjlVar.o0;
                            cjl cjlVar2 = cjlVarArr[0];
                            cjl[] cjlVarArr2 = this.o0;
                            cjlVarArr2[0] = cjlVar2;
                            cjlVarArr2[1] = cjlVarArr[1];
                            cjl[] cjlVarArr3 = cjlVar.p0;
                            cjl cjlVar3 = cjlVarArr3[0];
                            cjl[] cjlVarArr4 = this.p0;
                            cjlVarArr4[0] = cjlVar3;
                            cjlVarArr4[1] = cjlVarArr3[1];
                            cjl cjlVar4 = cjlVar.q0;
                            this.q0 = cjlVar4 == null ? null : (cjl) map.get(cjlVar4);
                            cjl cjlVar5 = cjlVar.r0;
                            this.r0 = cjlVar5 != null ? (cjl) map.get(cjlVar5) : null;
                        }

                        public final void i(yic0 yic0Var) {
                            yic0Var.k(this.J);
                            yic0Var.k(this.K);
                            yic0Var.k(this.L);
                            yic0Var.k(this.M);
                            if (this.c0 > 0) {
                                yic0Var.k(this.N);
                            }
                        }

                        public final void j() {
                            if (this.d == null) {
                                ur60 ur60Var = new ur60(this);
                                ur60Var.h.e = 4;
                                ur60Var.i.e = 5;
                                ur60Var.f = 0;
                                this.d = ur60Var;
                            }
                            if (this.e == null) {
                                s6j1 s6j1Var = new s6j1(this);
                                zct zctVar = new zct(s6j1Var);
                                s6j1Var.k = zctVar;
                                s6j1Var.l = null;
                                s6j1Var.h.e = 6;
                                s6j1Var.i.e = 7;
                                zctVar.e = 8;
                                s6j1Var.f = 1;
                                this.e = s6j1Var;
                            }
                        }

                        public lhl k(int i) {
                            switch (l1d.C(i)) {
                                case 0:
                                    return null;
                                case 1:
                                    return this.J;
                                case 2:
                                    return this.K;
                                case 3:
                                    return this.L;
                                case 4:
                                    return this.M;
                                case 5:
                                    return this.N;
                                case 6:
                                    return this.Q;
                                case 7:
                                    return this.O;
                                case 8:
                                    return this.P;
                                default:
                                    eg.f(gvg.C(i));
                                    return null;
                            }
                        }

                        public final bjl l(int i) {
                            if (i == 0) {
                                return this.U[0];
                            }
                            if (i == 1) {
                                return this.U[1];
                            }
                            return null;
                        }

                        public final int m() {
                            if (this.i0 == 8) {
                                return 0;
                            }
                            return this.X;
                        }

                        public final cjl n(int i) {
                            lhl lhlVar;
                            lhl lhlVar2;
                            if (i != 0) {
                                if (i == 1 && (lhlVar2 = (lhlVar = this.M).f) != null && lhlVar2.f == lhlVar) {
                                    return lhlVar2.d;
                                }
                                return null;
                            }
                            lhl lhlVar3 = this.L;
                            lhl lhlVar4 = lhlVar3.f;
                            if (lhlVar4 == null || lhlVar4.f != lhlVar3) {
                                return null;
                            }
                            return lhlVar4.d;
                        }

                        public final cjl o(int i) {
                            lhl lhlVar;
                            lhl lhlVar2;
                            if (i != 0) {
                                if (i == 1 && (lhlVar2 = (lhlVar = this.K).f) != null && lhlVar2.f == lhlVar) {
                                    return lhlVar2.d;
                                }
                                return null;
                            }
                            lhl lhlVar3 = this.J;
                            lhl lhlVar4 = lhlVar3.f;
                            if (lhlVar4 == null || lhlVar4.f != lhlVar3) {
                                return null;
                            }
                            return lhlVar4.d;
                        }

                        public void p(StringBuilder sb) {
                            sb.append("  " + this.k + ":{\n");
                            StringBuilder sb2 = new StringBuilder("    actualWidth:");
                            sb2.append(this.W);
                            sb.append(sb2.toString());
                            sb.append("\n");
                            sb.append("    actualHeight:" + this.X);
                            sb.append("\n");
                            sb.append("    actualLeft:" + this.a0);
                            sb.append("\n");
                            sb.append("    actualTop:" + this.b0);
                            sb.append("\n");
                            r(sb, "left", this.J);
                            r(sb, "top", this.K);
                            r(sb, "right", this.L);
                            r(sb, "bottom", this.M);
                            r(sb, "baseline", this.N);
                            r(sb, "centerX", this.O);
                            r(sb, "centerY", this.P);
                            int i = this.W;
                            int i2 = this.d0;
                            int i3 = this.D[0];
                            int i4 = this.v;
                            int i5 = this.s;
                            float f = this.x;
                            bjl bjlVar = this.U[0];
                            float[] fArr = this.n0;
                            float f2 = fArr[0];
                            q(sb, "    width", i, i2, i3, i4, i5, f, bjlVar);
                            int i6 = this.X;
                            int i7 = this.e0;
                            int i8 = this.D[1];
                            int i9 = this.y;
                            int i10 = this.t;
                            float f3 = this.A;
                            bjl bjlVar2 = this.U[1];
                            float f4 = fArr[1];
                            q(sb, "    height", i6, i7, i8, i9, i10, f3, bjlVar2);
                            float f5 = this.Y;
                            int i11 = this.Z;
                            if (f5 != 0.0f) {
                                sb.append("    dimensionRatio");
                                sb.append(" :  [");
                                sb.append(f5);
                                sb.append(",");
                                sb.append(i11);
                                sb.append("");
                                sb.append("],\n");
                            }
                            I(sb, "    horizontalBias", this.f0, 0.5f);
                            I(sb, "    verticalBias", this.g0, 0.5f);
                            J(sb, "    horizontalChainStyle", this.l0, 0);
                            J(sb, "    verticalChainStyle", this.m0, 0);
                            sb.append("  }");
                        }

                        public final int s() {
                            if (this.i0 == 8) {
                                return 0;
                            }
                            return this.W;
                        }

                        public final int t() {
                            cjl cjlVar = this.V;
                            return (cjlVar == null || !(cjlVar instanceof djl)) ? this.a0 : ((djl) cjlVar).B0 + this.a0;
                        }

                        public String toString() {
                            String strN;
                            if (this.k0 != null) {
                                strN = l1d.n(this.k0, " ", new StringBuilder("id: "));
                            } else {
                                strN = "";
                            }
                            StringBuilder sb = new StringBuilder(strN);
                            sb.append("(");
                            sb.append(this.a0);
                            sb.append(", ");
                            sb.append(this.b0);
                            sb.append(") - (");
                            sb.append(this.W);
                            sb.append(" x ");
                            return gvg.j(sb, this.X, ")");
                        }

                        public final int u() {
                            cjl cjlVar = this.V;
                            return (cjlVar == null || !(cjlVar instanceof djl)) ? this.b0 : ((djl) cjlVar).C0 + this.b0;
                        }

                        /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
                        /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
                        public final boolean v(int i) {
                            if (i == 0) {
                                if ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
                                    return true;
                                }
                                return false;
                            }
                            if ((this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) < 2) {
                                return true;
                            }
                            return false;
                        }

                        public final boolean w(int i, int i2) {
                            lhl lhlVar;
                            lhl lhlVar2;
                            lhl lhlVar3;
                            lhl lhlVar4;
                            if (i == 0) {
                                lhl lhlVar5 = this.J;
                                lhl lhlVar6 = lhlVar5.f;
                                if (lhlVar6 == null || !lhlVar6.c || (lhlVar4 = (lhlVar3 = this.L).f) == null || !lhlVar4.c) {
                                    return false;
                                }
                                return (lhlVar4.d() - lhlVar3.e()) - (lhlVar5.e() + lhlVar5.f.d()) >= i2;
                            }
                            lhl lhlVar7 = this.K;
                            lhl lhlVar8 = lhlVar7.f;
                            if (lhlVar8 == null || !lhlVar8.c || (lhlVar2 = (lhlVar = this.M).f) == null || !lhlVar2.c) {
                                return false;
                            }
                            return (lhlVar2.d() - lhlVar.e()) - (lhlVar7.e() + lhlVar7.f.d()) >= i2;
                        }

                        public final void x(int i, int i2, int i3, int i4, cjl cjlVar) {
                            k(i).b(cjlVar.k(i2), i3, i4, true);
                        }

                        public final boolean y(int i) {
                            lhl lhlVar;
                            lhl lhlVar2;
                            int i2 = i * 2;
                            lhl[] lhlVarArr = this.R;
                            lhl lhlVar3 = lhlVarArr[i2];
                            lhl lhlVar4 = lhlVar3.f;
                            return (lhlVar4 == null || lhlVar4.f == lhlVar3 || (lhlVar2 = (lhlVar = lhlVarArr[i2 + 1]).f) == null || lhlVar2.f != lhlVar) ? false : true;
                        }

                        public final boolean z() {
                            lhl lhlVar = this.J;
                            lhl lhlVar2 = lhlVar.f;
                            if (lhlVar2 != null && lhlVar2.f == lhlVar) {
                                return true;
                            }
                            lhl lhlVar3 = this.L;
                            lhl lhlVar4 = lhlVar3.f;
                            return lhlVar4 != null && lhlVar4.f == lhlVar3;
                        }

                        public cjl(int i, int i2) {
                            this.a = false;
                            this.d = null;
                            this.e = null;
                            this.f = new boolean[]{true, true};
                            this.g = true;
                            this.h = -1;
                            this.i = -1;
                            this.j = new xol1(this);
                            this.l = false;
                            this.m = false;
                            this.n = false;
                            this.o = false;
                            this.f22p = -1;
                            this.q = -1;
                            this.r = 0;
                            this.s = 0;
                            this.t = 0;
                            this.u = new int[2];
                            this.v = 0;
                            this.w = 0;
                            this.x = 1.0f;
                            this.y = 0;
                            this.z = 0;
                            this.A = 1.0f;
                            this.B = -1;
                            this.C = 1.0f;
                            this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
                            this.E = Float.NaN;
                            this.F = false;
                            this.G = false;
                            this.H = 0;
                            this.I = 0;
                            lhl lhlVar = new lhl(this, 2);
                            this.J = lhlVar;
                            lhl lhlVar2 = new lhl(this, 3);
                            this.K = lhlVar2;
                            lhl lhlVar3 = new lhl(this, 4);
                            this.L = lhlVar3;
                            lhl lhlVar4 = new lhl(this, 5);
                            this.M = lhlVar4;
                            lhl lhlVar5 = new lhl(this, 6);
                            this.N = lhlVar5;
                            this.O = new lhl(this, 8);
                            this.P = new lhl(this, 9);
                            lhl lhlVar6 = new lhl(this, 7);
                            this.Q = lhlVar6;
                            this.R = new lhl[]{lhlVar, lhlVar3, lhlVar2, lhlVar4, lhlVar5, lhlVar6};
                            this.S = new ArrayList();
                            this.T = new boolean[2];
                            bjl bjlVar = bjl.a;
                            this.U = new bjl[]{bjlVar, bjlVar};
                            this.V = null;
                            this.Y = 0.0f;
                            this.Z = -1;
                            this.c0 = 0;
                            this.f0 = 0.5f;
                            this.g0 = 0.5f;
                            this.i0 = 0;
                            this.j0 = false;
                            this.k0 = null;
                            this.l0 = 0;
                            this.m0 = 0;
                            this.n0 = new float[]{-1.0f, -1.0f};
                            this.o0 = new cjl[]{null, null};
                            this.p0 = new cjl[]{null, null};
                            this.q0 = null;
                            this.r0 = null;
                            this.s0 = -1;
                            this.t0 = -1;
                            this.a0 = 0;
                            this.b0 = 0;
                            this.W = i;
                            this.X = i2;
                            a();
                        }
                    }
