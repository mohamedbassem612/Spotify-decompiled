package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x340 implements b0k {
    public int A;
    public int B;
    public boolean C;
    public final w340 D;
    public final ArrayList E;
    public boolean F;
    public ye91 G;
    public ze91 H;
    public hf91 I;
    public boolean J;
    public xos0 K;
    public xce L;
    public final c0k M;
    public s340 N;
    public sn20 O;
    public n181 P;
    public final y3k Q;
    public final o8n R;
    public boolean S;
    public long T;
    public y340 U;
    public final j06 a;
    public final v3k b;
    public final ze91 c;
    public final qen0 d;
    public final xce e;
    public final xce f;
    public final oi g;
    public final h4k h;
    public a440 j;
    public int k;
    public int l;
    public int m;
    public int[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ddn0 f139p;
    public boolean q;
    public boolean r;
    public xos0 u;
    public fdn0 v;
    public boolean w;
    public final up20 x;
    public boolean y;
    public int z;
    public final ArrayList i = new ArrayList();
    public final up20 n = new up20((byte) 2);
    public final ArrayList s = new ArrayList();
    public final up20 t = new up20((byte) 2);

    public x340(j06 j06Var, v3k v3kVar, ze91 ze91Var, qen0 qen0Var, xce xceVar, xce xceVar2, oi oiVar, h4k h4kVar) {
        this.a = j06Var;
        this.b = v3kVar;
        this.c = ze91Var;
        this.d = qen0Var;
        this.e = xceVar;
        this.f = xceVar2;
        this.g = oiVar;
        this.h = h4kVar;
        eso1.B();
        this.u = xos0.e;
        this.x = new up20((byte) 2);
        this.z = -1;
        this.C = v3kVar.g() || v3kVar.e();
        this.D = new w340(this);
        this.E = new ArrayList();
        ye91 ye91VarF = ze91Var.f();
        ye91VarF.c();
        this.G = ye91VarF;
        ze91 ze91Var2 = new ze91();
        if (v3kVar.g()) {
            ze91Var2.c();
        }
        if (v3kVar.e()) {
            ze91Var2.X = new fdn0();
        }
        this.H = ze91Var2;
        hf91 hf91VarI = ze91Var2.i();
        hf91VarI.e(true);
        this.I = hf91VarI;
        this.M = new c0k(this, xceVar);
        ye91 ye91VarF2 = this.H.f();
        try {
            s340 s340VarA = ye91VarF2.a(0);
            ye91VarF2.c();
            this.N = s340VarA;
            this.O = new sn20();
            this.Q = new y3k(this);
            o8n o8nVarK = v3kVar.k();
            o6x o6xVarF = F();
            this.R = o8nVarK.y(o6xVarF == null ? o6x.a : o6xVarF);
        } catch (Throwable th) {
            ye91VarF2.c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public static final znm0 V(int i, x340 x340Var) {
        ArrayList arrayList;
        int i2 = x340Var.G.i(i);
        ye91 ye91Var = x340Var.G;
        Object objP = ye91Var.p(i, ye91Var.b);
        if (i2 != 126665345 || !(objP instanceof xnm0)) {
            return null;
        }
        if (x340Var.G.d(i)) {
            ArrayList arrayList2 = new ArrayList();
            W(x340Var, arrayList2, i);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        ye91 ye91Var2 = x340Var.G;
        xnm0 xnm0Var = (xnm0) ye91Var2.p(i, ye91Var2.b);
        Object objH = x340Var.G.h(i, 0);
        s340 s340VarA = x340Var.G.a(i);
        int i3 = x340Var.G.b[(i * 5) + 3] + i;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = x340Var.s;
        for (int iL = ot11.l(i, arrayList4); iL < arrayList4.size(); iL++) {
            bc90 bc90Var = (bc90) arrayList4.get(iL);
            if (bc90Var.b >= i3) {
                break;
            }
            arrayList3.add(oqn1.n(bc90Var.a, bc90Var.c));
        }
        return new znm0(xnm0Var, objH, x340Var.h, x340Var.c, s340VarA, arrayList3, x340Var.n(i), arrayList);
    }

    public static final void W(x340 x340Var, ArrayList arrayList, int i) {
        int i2 = x340Var.G.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (x340Var.G.j(i3)) {
                znm0 znm0VarV = V(i3, x340Var);
                if (znm0VarV != null) {
                    arrayList.add(znm0VarV);
                }
            } else if (x340Var.G.d(i3)) {
                W(x340Var, arrayList, i3);
            }
            i3 += x340Var.G.b[(i3 * 5) + 3];
        }
    }

    public static final int X(x340 x340Var, int i, int i2, boolean z, int i3) {
        int i4;
        long[] jArr;
        Object[] objArr;
        int i5;
        Object[] objArr2;
        int i6;
        ye91 ye91Var = x340Var.G;
        int i7 = 0;
        if (ye91Var.j(i2)) {
            int i8 = ye91Var.i(i2);
            Object objP = ye91Var.p(i2, ye91Var.b);
            if (i8 == 126665345 && (objP instanceof xnm0)) {
                znm0 znm0VarV = V(i2, x340Var);
                if (znm0VarV != null) {
                    x340Var.b.c(znm0VarV);
                    x340Var.M.e();
                    c0k c0kVar = x340Var.M;
                    h4k h4kVar = x340Var.h;
                    v3k v3kVar = x340Var.b;
                    amq0 amq0Var = c0kVar.b.c;
                    amq0Var.B(qkq0.c);
                    y7y0.P(amq0Var, h4kVar, v3kVar, znm0VarV);
                }
                if (!z || i2 == i) {
                    return ye91Var.o(i2);
                }
                c0k c0kVar2 = x340Var.M;
                c0kVar2.c();
                c0kVar2.b();
                x340 x340Var2 = c0kVar2.a;
                int iO = x340Var2.G.l(i2) ? 1 : x340Var2.G.o(i2);
                if (iO > 0) {
                    c0kVar2.f(i3, iO);
                }
                return 0;
            }
            if (i8 == 206 && u890.j(objP, g0k.e)) {
                Object objH = ye91Var.h(i2, 0);
                b440 b440Var = objH instanceof b440 ? (b440) objH : null;
                ky11 ky11Var = b440Var != null ? b440Var.a : null;
                u340 u340Var = ky11Var instanceof u340 ? (u340) ky11Var : null;
                if (u340Var != null) {
                    oen0 oen0Var = u340Var.a.f;
                    Object[] objArr3 = oen0Var.b;
                    long[] jArr2 = oen0Var.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr2[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = i7;
                                while (i12 < i11) {
                                    if ((255 & j) < 128) {
                                        x340 x340Var3 = (x340) objArr3[(i9 << 3) + i12];
                                        ze91 ze91Var = x340Var3.c;
                                        if (ze91Var.b <= 0 || (ze91Var.a[1] & 67108864) == 0) {
                                            objArr2 = objArr3;
                                            i6 = i7;
                                        } else {
                                            h4k h4kVar2 = x340Var3.h;
                                            synchronized (h4kVar2.d) {
                                                h4kVar2.r();
                                                nen0 nen0Var = h4kVar2.N0;
                                                h4kVar2.N0 = dm5.C();
                                                try {
                                                    h4kVar2.V0.p0(nen0Var);
                                                } catch (Throwable th) {
                                                    h4kVar2.N0 = nen0Var;
                                                    throw th;
                                                }
                                            }
                                            xce xceVar = new xce();
                                            x340Var3.L = xceVar;
                                            ye91 ye91VarF = x340Var3.c.f();
                                            try {
                                                x340Var3.G = ye91VarF;
                                                c0k c0kVar3 = x340Var3.M;
                                                xce xceVar2 = c0kVar3.b;
                                                try {
                                                    c0kVar3.b = xceVar;
                                                    x340Var3.U(0);
                                                    c0k c0kVar4 = x340Var3.M;
                                                    c0kVar4.b();
                                                    if (c0kVar4.c) {
                                                        objArr2 = objArr3;
                                                        c0kVar4.b.c.B(xkq0.c);
                                                        if (c0kVar4.c) {
                                                            c0kVar4.d(false);
                                                            c0kVar4.d(false);
                                                            c0kVar4.b.c.B(gkq0.c);
                                                            i6 = 0;
                                                            c0kVar4.c = false;
                                                        }
                                                        c0kVar3.b = xceVar2;
                                                        ye91VarF.c();
                                                    } else {
                                                        objArr2 = objArr3;
                                                    }
                                                    i6 = 0;
                                                    c0kVar3.b = xceVar2;
                                                    ye91VarF.c();
                                                } catch (Throwable th2) {
                                                    c0kVar3.b = xceVar2;
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                ye91VarF.c();
                                                throw th3;
                                            }
                                        }
                                        x340Var.b.v(x340Var3.h);
                                    } else {
                                        jArr2 = jArr2;
                                        objArr2 = objArr3;
                                        i6 = i7;
                                        i10 = i10;
                                    }
                                    j >>= i10;
                                    i12++;
                                    i10 = i10;
                                    objArr3 = objArr2;
                                    i7 = i6;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                objArr = objArr3;
                                i5 = i7;
                                if (i11 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                objArr = objArr3;
                                i5 = i7;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            objArr3 = objArr;
                            i7 = i5;
                            jArr2 = jArr;
                        }
                    }
                }
                return ye91Var.o(i2);
            }
            i4 = 1;
            if (!ye91Var.l(i2)) {
                return ye91Var.o(i2);
            }
        } else {
            i4 = 1;
            if (ye91Var.d(i2)) {
                int i13 = ye91Var.b[(i2 * 5) + 3] + i2;
                int iX = 0;
                for (int i14 = i2 + 1; i14 < i13; i14 += ye91Var.b[(i14 * 5) + 3]) {
                    boolean zL = ye91Var.l(i14);
                    if (zL) {
                        x340Var.M.c();
                        c0k c0kVar5 = x340Var.M;
                        Object objN = ye91Var.n(i14);
                        c0kVar5.c();
                        c0kVar5.h.add(objN);
                    }
                    iX += X(x340Var, i, i14, zL || z, zL ? 0 : i3 + iX);
                    if (zL) {
                        x340Var.M.c();
                        x340Var.M.a();
                    }
                }
                if (!ye91Var.l(i2)) {
                    return iX;
                }
            } else if (!ye91Var.l(i2)) {
                return ye91Var.o(i2);
            }
        }
        return i4;
    }

    public final j06 A() {
        return this.a;
    }

    public final x3k B() {
        y340 y340Var = this.U;
        if (y340Var != null) {
            return y340Var;
        }
        y340 y340Var2 = new y340(this.h);
        this.U = y340Var2;
        return y340Var2;
    }

    public final xos0 C() {
        return m();
    }

    public final h311 D() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (h311) l1d.i(1, arrayList);
    }

    public final boolean E() {
        if (!H() || this.w) {
            return true;
        }
        h311 h311VarD = D();
        return (h311VarD == null || (h311VarD.b & 4) == 0) ? false : true;
    }

    public final y3k F() {
        if (this.b.m()) {
            return this.Q;
        }
        return null;
    }

    public final boolean G() {
        return this.S;
    }

    public final boolean H() {
        h311 h311VarD;
        return (this.S || this.y || this.w || (h311VarD = D()) == null || (h311VarD.b & 8) != 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0053, B:14:0x0066, B:23:0x00a0, B:84:0x01db, B:28:0x00b0, B:29:0x00b3, B:10:0x0058, B:12:0x005e, B:13:0x0063, B:30:0x00b4, B:32:0x00ba, B:35:0x00c8, B:38:0x00d2, B:40:0x00d6, B:41:0x00db, B:45:0x00e5, B:47:0x00f2, B:53:0x0112, B:55:0x0120, B:57:0x012b, B:59:0x013c, B:64:0x0154, B:83:0x01d8, B:115:0x022b, B:116:0x022e, B:62:0x0141, B:52:0x0110, B:48:0x0100, B:44:0x00e0, B:117:0x022f), top: B:126:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0053, B:14:0x0066, B:23:0x00a0, B:84:0x01db, B:28:0x00b0, B:29:0x00b3, B:10:0x0058, B:12:0x005e, B:13:0x0063, B:30:0x00b4, B:32:0x00ba, B:35:0x00c8, B:38:0x00d2, B:40:0x00d6, B:41:0x00db, B:45:0x00e5, B:47:0x00f2, B:53:0x0112, B:55:0x0120, B:57:0x012b, B:59:0x013c, B:64:0x0154, B:83:0x01d8, B:115:0x022b, B:116:0x022e, B:62:0x0141, B:52:0x0110, B:48:0x0100, B:44:0x00e0, B:117:0x022f), top: B:126:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141 A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0053, B:14:0x0066, B:23:0x00a0, B:84:0x01db, B:28:0x00b0, B:29:0x00b3, B:10:0x0058, B:12:0x005e, B:13:0x0063, B:30:0x00b4, B:32:0x00ba, B:35:0x00c8, B:38:0x00d2, B:40:0x00d6, B:41:0x00db, B:45:0x00e5, B:47:0x00f2, B:53:0x0112, B:55:0x0120, B:57:0x012b, B:59:0x013c, B:64:0x0154, B:83:0x01d8, B:115:0x022b, B:116:0x022e, B:62:0x0141, B:52:0x0110, B:48:0x0100, B:44:0x00e0, B:117:0x022f), top: B:126:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0152  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c6 A[Catch: all -> 0x01ee, TRY_LEAVE, TryCatch #5 {all -> 0x01ee, blocks: (B:79:0x01bb, B:81:0x01c6, B:107:0x021a, B:108:0x021c), top: B:131:0x01bb }] */
    public final void I(ArrayList arrayList) {
        int i;
        s340 s340Var;
        s340 s340VarK;
        ArrayList arrayListK;
        ye91 ye91VarF;
        ye91 ye91Var;
        ye91 ye91Var2;
        int[] iArr;
        fdn0 fdn0Var;
        fdn0 fdn0Var2;
        xce xceVar;
        xce xceVar2;
        xce xceVar3;
        boolean z;
        xce xceVar4;
        ze91 ze91Var;
        ye91 ye91Var3;
        x340 x340Var = this;
        v3k v3kVar = x340Var.b;
        xce xceVar5 = x340Var.f;
        c0k c0kVar = x340Var.M;
        xce xceVar6 = c0kVar.b;
        try {
            c0kVar.b = xceVar5;
            xceVar5.c.B(vkq0.c);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                mmr0 mmr0Var = (mmr0) arrayList.get(i3);
                znm0 znm0Var = (znm0) mmr0Var.a;
                znm0 znm0Var2 = (znm0) mmr0Var.b;
                s340 s340VarK2 = aym.k(znm0Var.e);
                ze91 ze91VarA = bf91.a(znm0Var.d);
                int iB = ze91VarA.b(s340VarK2);
                vr80 vr80Var = new vr80();
                c0kVar.b();
                amq0 amq0Var = c0kVar.b.c;
                amq0Var.B(dkq0.c);
                y7y0.O(amq0Var, i2, vr80Var, 1, s340VarK2);
                if (znm0Var2 == null) {
                    if (ze91VarA == x340Var.H) {
                        if (!x340Var.I.w) {
                            g0k.a("Check failed");
                        }
                        x340Var.z();
                    }
                    ye91 ye91VarF2 = ze91VarA.f();
                    try {
                        ye91VarF2.r(iB);
                        c0kVar.f = iB;
                        xce xceVar7 = new xce();
                        qd4 qd4Var = new qd4(x340Var, xceVar7, ye91VarF2, znm0Var, (byte) 2);
                        ye91Var3 = ye91VarF2;
                        try {
                            x340Var = this;
                            x340Var.O(null, null, null, z6x.a, qd4Var);
                            xce xceVar8 = c0kVar.b;
                            xceVar8.getClass();
                            if (xceVar7.z()) {
                                amq0 amq0Var2 = xceVar8.c;
                                amq0Var2.B(zjq0.c);
                                y7y0.O(amq0Var2, i2, xceVar7, 1, vr80Var);
                            }
                            ye91Var3.c();
                            i = size;
                            i3 = i3;
                        } catch (Throwable th) {
                            th = th;
                            ye91Var3.c();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ye91Var3 = ye91VarF2;
                    }
                } else {
                    ynm0 ynm0VarQ = v3kVar.q(znm0Var2);
                    ze91 ze91VarA2 = ynm0VarQ != null ? bf91.a(ynm0VarQ.a()) : null;
                    ze91 ze91VarA3 = ze91VarA2 == null ? bf91.a(znm0Var2.d) : ze91VarA2;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (ze91VarA2 != null) {
                                                                    if (ze91VarA2.g) {
                                                                        g0k.a("use active SlotWriter to create an anchor location instead");
                                                                    }
                                                                    if (ze91VarA2.b <= 0) {
                                                                        bmv0.a("Parameter index is out of range");
                                                                    }
                                                                    ArrayList arrayList2 = ze91VarA2.i;
                                                                    i = size;
                                                                    int iC = bf91.c(arrayList2, 0, ze91VarA2.b);
                                                                    if (iC < 0) {
                                                                        s340Var = new s340(0);
                                                                        arrayList2.add(-(iC + 1), s340Var);
                                                                    } else {
                                                                        s340Var = (s340) arrayList2.get(iC);
                                                                    }
                                                                    if (s340Var != null) {
                                                                    }
                                                                    s340VarK = aym.k(s340Var);
                                                                    arrayListK = ot11.k(ze91VarA3, s340VarK);
                                                                    if (arrayListK.isEmpty()) {
                                                                        s340VarK = s340VarK;
                                                                    } else {
                                                                        xceVar4 = c0kVar.b;
                                                                        xceVar4.getClass();
                                                                        if (!arrayListK.isEmpty()) {
                                                                            amq0 amq0Var3 = xceVar4.c;
                                                                            amq0Var3.B(akq0.c);
                                                                            y7y0.O(amq0Var3, 1, arrayListK, 0, vr80Var);
                                                                        }
                                                                        ze91Var = x340Var.c;
                                                                        if (ze91VarA != ze91Var) {
                                                                            int iB2 = ze91Var.b(s340VarK2);
                                                                            x340Var.q0(iB2, x340Var.u0(iB2) + arrayListK.size());
                                                                        }
                                                                    }
                                                                    amq0 amq0Var4 = c0kVar.b.c;
                                                                    amq0Var4.B(bkq0.c);
                                                                    y7y0.Q(amq0Var4, ynm0VarQ, v3kVar, znm0Var, znm0Var2);
                                                                    ye91VarF = ze91VarA3.f();
                                                                    ye91Var2 = x340Var.G;
                                                                    iArr = x340Var.o;
                                                                    fdn0Var = x340Var.v;
                                                                    x340Var.o = null;
                                                                    x340Var.v = null;
                                                                    x340Var.G = ye91VarF;
                                                                    int iB3 = ze91VarA3.b(aym.k(s340VarK));
                                                                    ye91VarF.r(iB3);
                                                                    c0kVar.f = iB3;
                                                                    xceVar = new xce();
                                                                    xceVar2 = c0kVar.b;
                                                                    c0kVar.b = xceVar;
                                                                    z = c0kVar.e;
                                                                    c0kVar.e = false;
                                                                    h4k h4kVar = znm0Var2.c;
                                                                    h4k h4kVar2 = znm0Var.c;
                                                                    Integer numValueOf = Integer.valueOf(ye91VarF.g);
                                                                    ye91Var = ye91VarF;
                                                                    xceVar3 = xceVar2;
                                                                    z = z;
                                                                    fdn0Var2 = fdn0Var;
                                                                    x340Var.O(h4kVar, h4kVar2, numValueOf, znm0Var2.f, new og(x340Var, znm0Var, (byte) 25));
                                                                    c0kVar.e = z;
                                                                    c0kVar.b = xceVar3;
                                                                    xceVar3.getClass();
                                                                    if (xceVar.z()) {
                                                                        amq0 amq0Var5 = xceVar3.c;
                                                                        amq0Var5.B(zjq0.c);
                                                                        y7y0.O(amq0Var5, 0, xceVar, 1, vr80Var);
                                                                    }
                                                                    x340Var.G = ye91Var2;
                                                                    x340Var.o = iArr;
                                                                    x340Var.v = fdn0Var2;
                                                                    ye91Var.c();
                                                                } else {
                                                                    i = size;
                                                                    i3 = i3;
                                                                }
                                                                x340Var.G = ye91Var2;
                                                                x340Var.o = iArr;
                                                                x340Var.v = fdn0Var2;
                                                                ye91Var.c();
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                ye91Var.c();
                                                                throw th;
                                                            }
                                                            c0kVar.b = xceVar3;
                                                            xceVar3.getClass();
                                                            if (xceVar.z()) {
                                                                amq0 amq0Var6 = xceVar3.c;
                                                                amq0Var6.B(zjq0.c);
                                                                y7y0.O(amq0Var6, 0, xceVar, 1, vr80Var);
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            x340Var.G = ye91Var2;
                                                            x340Var.o = iArr;
                                                            x340Var.v = fdn0Var2;
                                                            throw th;
                                                        }
                                                        c0kVar.e = z;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        c0kVar.b = xceVar3;
                                                        throw th;
                                                    }
                                                    x340Var.O(h4kVar, h4kVar2, numValueOf, znm0Var2.f, new og(x340Var, znm0Var, (byte) 25));
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    c0kVar.e = z;
                                                    throw th;
                                                }
                                                ye91Var = ye91VarF;
                                                xceVar3 = xceVar2;
                                                z = z;
                                                fdn0Var2 = fdn0Var;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                ye91Var = ye91VarF;
                                                xceVar3 = xceVar2;
                                                z = z;
                                                fdn0Var2 = fdn0Var;
                                            }
                                            h4k h4kVar3 = znm0Var.c;
                                            Integer numValueOf2 = Integer.valueOf(ye91VarF.g);
                                        } catch (Throwable th8) {
                                            th = th8;
                                            ye91Var = ye91VarF;
                                            xceVar3 = xceVar2;
                                            z = z;
                                            fdn0Var2 = fdn0Var;
                                        }
                                        h4k h4kVar4 = znm0Var2.c;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        fdn0Var2 = fdn0Var;
                                        ye91Var = ye91VarF;
                                        xceVar3 = xceVar2;
                                        c0kVar.e = z;
                                        throw th;
                                    }
                                    c0kVar.e = false;
                                } catch (Throwable th10) {
                                    th = th10;
                                    fdn0Var2 = fdn0Var;
                                }
                                c0kVar.b = xceVar;
                                z = c0kVar.e;
                            } catch (Throwable th11) {
                                th = th11;
                                fdn0Var2 = fdn0Var;
                                ye91Var = ye91VarF;
                                xceVar3 = xceVar2;
                            }
                            x340Var.G = ye91VarF;
                            int iB4 = ze91VarA3.b(aym.k(s340VarK));
                            ye91VarF.r(iB4);
                            c0kVar.f = iB4;
                            xceVar = new xce();
                            xceVar2 = c0kVar.b;
                        } catch (Throwable th12) {
                            th = th12;
                            fdn0Var2 = fdn0Var;
                            ye91Var = ye91VarF;
                        }
                        ye91Var2 = x340Var.G;
                        iArr = x340Var.o;
                        fdn0Var = x340Var.v;
                        x340Var.o = null;
                        x340Var.v = null;
                    } catch (Throwable th13) {
                        th = th13;
                        ye91Var = ye91VarF;
                    }
                    s340Var = znm0Var2.e;
                    s340VarK = aym.k(s340Var);
                    arrayListK = ot11.k(ze91VarA3, s340VarK);
                    if (arrayListK.isEmpty()) {
                        xceVar4 = c0kVar.b;
                        xceVar4.getClass();
                        if (!arrayListK.isEmpty()) {
                            amq0 amq0Var7 = xceVar4.c;
                            amq0Var7.B(akq0.c);
                            y7y0.O(amq0Var7, 1, arrayListK, 0, vr80Var);
                        }
                        ze91Var = x340Var.c;
                        if (ze91VarA != ze91Var) {
                            int iB5 = ze91Var.b(s340VarK2);
                            x340Var.q0(iB5, x340Var.u0(iB5) + arrayListK.size());
                        }
                    } else {
                        s340VarK = s340VarK;
                    }
                    amq0 amq0Var8 = c0kVar.b.c;
                    amq0Var8.B(bkq0.c);
                    y7y0.Q(amq0Var8, ynm0VarQ, v3kVar, znm0Var, znm0Var2);
                    ye91VarF = ze91VarA3.f();
                }
                c0kVar.b.c.B(xkq0.c);
                i3++;
                v3kVar = v3kVar;
                size = i;
                i2 = 0;
            }
            c0kVar.b();
            c0kVar.b.c.B(hkq0.c);
            c0kVar.f = 0;
            c0kVar.b = xceVar6;
        } catch (Throwable th14) {
            c0kVar.b = xceVar6;
            throw th14;
        }
    }

    public final void J(xnm0 xnm0Var, xos0 xos0Var, Object obj, boolean z) {
        f0(126665345, xnm0Var);
        L();
        t0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                hf91.y(this.I);
            }
            boolean z2 = (this.S || u890.j(this.G.f(), xos0Var)) ? false : true;
            if (z2) {
                R(xos0Var);
            }
            c0(g0k.c, 202, 0, xos0Var);
            this.K = null;
            if (!this.S || z) {
                boolean z3 = this.w;
                this.w = z2;
                j2i j2iVarJ = apo.j(-59194059, new f14(xnm0Var, obj, (byte) 13), true);
                w0h1.o(2, j2iVarJ);
                j2iVarJ.invoke(this, 1);
                this.w = z3;
            } else {
                this.J = true;
                hf91 hf91Var = this.I;
                this.b.n(new znm0(xnm0Var, obj, this.h, this.H, hf91Var.b(hf91Var.F(hf91Var.v, hf91Var.b)), z6x.a, m(), null));
            }
            r(false);
            this.K = null;
            this.T = j;
            r(false);
        } catch (Throwable th) {
            try {
                jm5.g(th, new g030(this, (byte) 2));
                throw th;
            } catch (Throwable th2) {
                r(false);
                this.K = null;
                this.T = j;
                r(false);
                throw th2;
            }
        }
    }

    public final Object K(Object obj, Object obj2) {
        ye91 ye91Var = this.G;
        int i = ye91Var.g;
        Object objO = ot11.o(i < ye91Var.h ? ye91Var.p(i, ye91Var.b) : null, obj, obj2);
        return objO == null ? new yea0(obj, obj2) : objO;
    }

    public final Object L() {
        m4c m4cVar = fkj0.X;
        if (!this.S) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof jd31)) {
                return objM;
            }
        } else if (this.r) {
            g0k.a("A call to createNode(), emitNode() or useNode() expected");
            return m4cVar;
        }
        return m4cVar;
    }

    public final List M() {
        v3k v3kVar = this.b;
        j3k j3kVarI = v3kVar.i();
        h4k h4kVar = j3kVarI != null ? (h4k) j3kVarI : null;
        if (h4kVar != null) {
            ze91 ze91Var = h4kVar.f;
            Integer numT = rc2.t(bf91.a(ze91Var), v3kVar);
            if (numT != null) {
                ye91 ye91VarF = bf91.a(ze91Var).f();
                try {
                    return o7h.N0(h4kVar.V0.M(), rc2.L(ye91VarF, numT.intValue(), 0));
                } finally {
                    ye91VarF.c();
                }
            }
        }
        return z6x.a;
    }

    public final int N(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0005, B:6:0x0015, B:8:0x0023, B:12:0x002c, B:11:0x0029, B:15:0x0033, B:20:0x003f, B:22:0x0047, B:24:0x004d, B:25:0x0051, B:26:0x0052, B:28:0x0058, B:21:0x0043), top: B:33:0x0005, inners: #1 }] */
    public final Object O(h4k h4kVar, h4k h4kVar2, Integer num, List list, Function0 function0) {
        Object objInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                mmr0 mmr0Var = (mmr0) list.get(i2);
                h311 h311Var = (h311) mmr0Var.a;
                Object obj = mmr0Var.b;
                if (obj != null) {
                    o0(h311Var, obj);
                } else {
                    o0(h311Var, null);
                }
            }
            if (h4kVar == null) {
                objInvoke = function0.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (h4kVar2 == null || h4kVar2 == h4kVar || iIntValue < 0) {
                    objInvoke = function0.invoke();
                } else {
                    h4kVar.R0 = h4kVar2;
                    h4kVar.S0 = iIntValue;
                    try {
                        objInvoke = function0.invoke();
                        h4kVar.R0 = null;
                        h4kVar.S0 = 0;
                    } catch (Throwable th) {
                        h4kVar.R0 = null;
                        h4kVar.S0 = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = function0.invoke();
                }
            }
            this.F = z;
            this.k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:103:0x0202  */
    /* JADX WARN: Code duplicated, block: B:104:0x0204  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0106 A[LOOP:5: B:25:0x00a0->B:44:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x011b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x0148  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x0159
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void P() {
        /*
            Method dump skipped, instruction units count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.x340.P():void");
    }

    public final void Q() {
        U(this.G.g);
        c0k c0kVar = this.M;
        c0kVar.d(false);
        c0kVar.e();
        c0kVar.b.c.B(tkq0.c);
        int i = c0kVar.f;
        ye91 ye91Var = c0kVar.a.G;
        c0kVar.f = ye91Var.b[(ye91Var.g * 5) + 3] + i;
    }

    public final void R(xos0 xos0Var) {
        fdn0 fdn0Var = this.v;
        if (fdn0Var == null) {
            fdn0Var = new fdn0();
            this.v = fdn0Var;
        }
        fdn0Var.i(this.G.g, xos0Var);
    }

    public final void S(int i, int i2, int i3) {
        ye91 ye91Var = this.G;
        int iR = ot11.r(ye91Var, i, i2, i3);
        while (i > 0 && i != iR) {
            if (ye91Var.l(i)) {
                this.M.a();
            }
            i = ye91Var.q(i);
        }
        q(i2, iR);
    }

    public final Object T() {
        m4c m4cVar = fkj0.X;
        if (!this.S) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof jd31)) {
                return objM instanceof b440 ? ((b440) objM).a : objM;
            }
        } else if (this.r) {
            g0k.a("A call to createNode(), emitNode() or useNode() expected");
            return m4cVar;
        }
        return m4cVar;
    }

    public final void U(int i) {
        boolean zL = this.G.l(i);
        c0k c0kVar = this.M;
        if (zL) {
            c0kVar.c();
            Object objN = this.G.n(i);
            c0kVar.c();
            c0kVar.h.add(objN);
        }
        X(this, i, i, zL, 0);
        c0kVar.c();
        if (zL) {
            c0kVar.a();
        }
    }

    public final boolean Y(int i, boolean z) {
        h311 h311VarD;
        if ((i & 1) == 0 && (this.S || this.y)) {
            n181 n181Var = this.P;
            if (n181Var != null && (h311VarD = D()) != null && n181Var.c()) {
                int i2 = h311VarD.b;
                if ((i2 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                h311VarD.b = i3;
                h311VarD.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                amq0 amq0Var = this.M.b.c;
                amq0Var.B(skq0.c);
                y7y0.N(amq0Var, 0, h311VarD);
                this.b.u(h311VarD);
                return false;
            }
        } else if (!z && H()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void Z() {
        long jRotateLeft;
        m4c m4cVar = fkj0.X;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        ye91 ye91Var = this.G;
        int iG = ye91Var.g();
        int[] iArr = ye91Var.b;
        int i = ye91Var.g;
        Object objP = i < ye91Var.h ? ye91Var.p(i, iArr) : null;
        Object objF = ye91Var.f();
        int i2 = this.m;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(m4cVar)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            h0(null, (iArr[(ye91Var.g * 5) + 1] & 1073741824) != 0);
            P();
            ye91Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(m4cVar)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) iG), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        h0(null, (iArr[(ye91Var.g * 5) + 1] & 1073741824) != 0);
        P();
        ye91Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) iG), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void a() {
        j();
        this.i.clear();
        this.n.a = 0;
        this.t.a = 0;
        this.x.a = 0;
        this.v = null;
        sn20 sn20Var = this.O;
        sn20Var.c.y();
        sn20Var.b.y();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        ye91 ye91Var = this.G;
        if (!ye91Var.f) {
            ye91Var.c();
        }
        if (this.I.w) {
            return;
        }
        z();
    }

    public final void a0() {
        ye91 ye91Var = this.G;
        int i = ye91Var.i;
        this.l = i >= 0 ? ye91Var.b[(i * 5) + 1] & 67108863 : 0;
        ye91Var.t();
    }

    public final void b(Object obj, vu30 vu30Var) {
        if (this.S) {
            amq0 amq0Var = this.O.b;
            amq0Var.B(elq0.c);
            y7y0.N(amq0Var, 0, obj);
            w0h1.o(2, vu30Var);
            y7y0.N(amq0Var, 1, vu30Var);
            return;
        }
        c0k c0kVar = this.M;
        c0kVar.b();
        amq0 amq0Var2 = c0kVar.b.c;
        amq0Var2.B(elq0.c);
        w0h1.o(2, vu30Var);
        y7y0.O(amq0Var2, 0, obj, 1, vu30Var);
    }

    public final void b0() {
        if (this.l != 0) {
            g0k.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        h311 h311VarD = D();
        if (h311VarD != null) {
            int i = h311VarD.b;
            if ((i & 128) == 0) {
                h311VarD.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            a0();
        } else {
            P();
        }
    }

    public final boolean c(double d) {
        Object objL = L();
        if ((objL instanceof Double) && d == ((Number) objL).doubleValue()) {
            return false;
        }
        t0(Double.valueOf(d));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:168:0x0317  */
    /* JADX WARN: Code duplicated, block: B:169:0x031d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x031f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0323  */
    /* JADX WARN: Code duplicated, block: B:174:0x032a  */
    /* JADX WARN: Code duplicated, block: B:176:0x032d  */
    /* JADX WARN: Code duplicated, block: B:177:0x032f  */
    /* JADX WARN: Code duplicated, block: B:181:0x035b  */
    /* JADX WARN: Code duplicated, block: B:182:0x035d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:71:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:80:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x0175  */
    /* JADX WARN: Code duplicated, block: B:84:0x0177  */
    /* JADX WARN: Code duplicated, block: B:86:0x017b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0188  */
    /* JADX WARN: Code duplicated, block: B:91:0x0190  */
    /* JADX WARN: Code duplicated, block: B:93:0x0199  */
    public final void c0(Object obj, int i, int i2, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        a440 a440Var;
        a440 a440Var2;
        ArrayList arrayList;
        fdn0 fdn0Var;
        int i3;
        Object objValueOf;
        nen0 nen0Var;
        Object objG;
        wdn0 wdn0Var;
        hf91 hf91Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        ye91 ye91Var;
        int[] iArr;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        ye91 ye91Var2;
        int i12;
        Object objP;
        hf91 hf91Var2;
        int i13;
        a440 a440Var3;
        Object obj4 = obj;
        Object obj5 = fkj0.X;
        if (this.r) {
            g0k.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i14 = this.m;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i14);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i14);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                hf91Var2 = this.I;
                i13 = hf91Var2.t;
                if (z) {
                    hf91Var2.R(i, obj5, obj5, true);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    hf91Var2.R(i, obj4, obj2, false);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    hf91Var2.R(i, obj4, obj5, false);
                }
                a440Var3 = this.j;
                if (a440Var3 != null) {
                    int i15 = (-2) - i13;
                    fpa0 fpa0Var = new fpa0(-1, i, i15, -1);
                    a440Var3.e.i(i15, new rl50(-1, this.k - a440Var3.b, 0));
                    a440Var3.d.add(fpa0Var);
                }
                y(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    ye91Var2 = this.G;
                    i12 = ye91Var2.g;
                    if (i12 < ye91Var2.h) {
                        objP = ye91Var2.p(i12, ye91Var2.b);
                    } else {
                        objP = null;
                    }
                    if (u890.j(obj4, objP)) {
                        h0(obj2, z);
                        z3 = z2;
                    }
                }
                ye91Var = this.G;
                iArr = ye91Var.b;
                arrayList2 = new ArrayList();
                if (ye91Var.k <= 0) {
                    i9 = ye91Var.g;
                    while (i9 < ye91Var.h) {
                        int i16 = i9 * 5;
                        int i17 = iArr[i16];
                        Object objP2 = ye91Var.p(i9, iArr);
                        i10 = iArr[i16 + 1];
                        if ((i10 & 1073741824) != 0) {
                            i11 = 1;
                        } else {
                            i11 = i10 & 67108863;
                        }
                        arrayList2.add(new fpa0(objP2, i17, i9, i11));
                        i9 += iArr[i16 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new a440(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            a440Var = this.j;
            if (a440Var != null) {
                arrayList = a440Var.d;
                fdn0Var = a440Var.e;
                i3 = a440Var.b;
                if (obj4 != null) {
                    objValueOf = new yea0(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                nen0Var = ((dwm0) a440Var.f.getValue()).a;
                objG = nen0Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof wdn0) {
                    wdn0Var = (wdn0) objG;
                    Object objL = wdn0Var.l(0);
                    if (wdn0Var.i()) {
                        nen0Var.k(objValueOf);
                    }
                    if (wdn0Var.b == 1) {
                        nen0Var.m(objValueOf, wdn0Var.f());
                    }
                    objG = objL;
                } else {
                    nen0Var.k(objValueOf);
                }
                fpa0 fpa0Var2 = (fpa0) objG;
                if (!z3 || fpa0Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        hf91 hf91VarI = this.H.i();
                        this.I = hf91VarI;
                        hf91VarI.N();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    hf91Var = this.I;
                    int i18 = hf91Var.t;
                    if (z) {
                        hf91Var.R(i, obj5, obj5, true);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        hf91Var.R(i, obj5, obj2, false);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        hf91Var.R(i, obj3, obj5, false);
                    }
                    this.N = this.I.b(i18);
                    int i19 = (-2) - i18;
                    fpa0 fpa0Var3 = new fpa0(-1, i, i19, -1);
                    fdn0Var.i(i19, new rl50(-1, this.k - i3, i4));
                    arrayList.add(fpa0Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    a440Var2 = new a440(i5, arrayList3);
                } else {
                    int i20 = fpa0Var2.c;
                    arrayList.add(fpa0Var2);
                    rl50 rl50Var = (rl50) fdn0Var.b(i20);
                    this.k = (rl50Var != null ? rl50Var.b : -1) + i3;
                    rl50 rl50Var2 = (rl50) fdn0Var.b(i20);
                    int i21 = rl50Var2 != null ? rl50Var2.a : -1;
                    int i22 = a440Var.c;
                    int i23 = i21 - i22;
                    int i24 = 8;
                    if (i21 <= i22) {
                        i6 = i23;
                        if (i22 > i21) {
                            Object[] objArr3 = fdn0Var.c;
                            long[] jArr = fdn0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                rl50 rl50Var3 = (rl50) objArr3[(i25 << 3) + i27];
                                                int i28 = rl50Var3.a;
                                                if (i28 == i21) {
                                                    rl50Var3.a = i22;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i21 + 1 <= i28 && i28 < i22) {
                                                        rl50Var3.a = i28 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i27++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i26 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = fdn0Var.c;
                        long[] jArr2 = fdn0Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i29 = 0;
                            while (true) {
                                long j2 = jArr2[i29];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        if ((j2 & 255) < 128) {
                                            i8 = i24;
                                            rl50 rl50Var4 = (rl50) objArr4[(i29 << 3) + i31];
                                            i7 = i23;
                                            int i32 = rl50Var4.a;
                                            if (i32 == i21) {
                                                rl50Var4.a = i22;
                                            } else if (i22 <= i32 && i32 < i21) {
                                                rl50Var4.a = i32 + 1;
                                            }
                                        } else {
                                            i7 = i23;
                                            i8 = i24;
                                        }
                                        j2 >>= i8;
                                        i31++;
                                        i23 = i7;
                                        i24 = i8;
                                    }
                                    i6 = i23;
                                    if (i30 != i24) {
                                        break;
                                    }
                                } else {
                                    i6 = i23;
                                }
                                if (i29 == length2) {
                                    break;
                                }
                                i29++;
                                i23 = i6;
                                i24 = 8;
                            }
                        } else {
                            i6 = i23;
                        }
                    }
                    c0k c0kVar = this.M;
                    c0kVar.f = (i20 - c0kVar.a.G.g) + c0kVar.f;
                    this.G.r(i20);
                    if (i6 > 0) {
                        c0kVar.d(false);
                        c0kVar.e();
                        amq0 amq0Var = c0kVar.b.c;
                        amq0Var.B(okq0.c);
                        amq0Var.d[amq0Var.e - amq0Var.b[amq0Var.c - 1].a] = i6;
                    }
                    h0(obj2, z);
                    a440Var2 = null;
                }
            } else {
                a440Var2 = null;
            }
            y(z, a440Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            hf91Var2 = this.I;
            i13 = hf91Var2.t;
            if (z) {
                hf91Var2.R(i, obj5, obj5, true);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                hf91Var2.R(i, obj4, obj2, false);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                hf91Var2.R(i, obj4, obj5, false);
            }
            a440Var3 = this.j;
            if (a440Var3 != null) {
                int i110 = (-2) - i13;
                fpa0 fpa0Var4 = new fpa0(-1, i, i110, -1);
                a440Var3.e.i(i110, new rl50(-1, this.k - a440Var3.b, 0));
                a440Var3.d.add(fpa0Var4);
            }
            y(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                ye91Var2 = this.G;
                i12 = ye91Var2.g;
                if (i12 < ye91Var2.h) {
                    objP = ye91Var2.p(i12, ye91Var2.b);
                } else {
                    objP = null;
                }
                if (u890.j(obj4, objP)) {
                    h0(obj2, z);
                    z3 = z2;
                }
            }
            ye91Var = this.G;
            iArr = ye91Var.b;
            arrayList2 = new ArrayList();
            if (ye91Var.k <= 0) {
                i9 = ye91Var.g;
                while (i9 < ye91Var.h) {
                    int i111 = i9 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = ye91Var.p(i9, iArr);
                    i10 = iArr[i111 + 1];
                    if ((i10 & 1073741824) != 0) {
                        i11 = 1;
                    } else {
                        i11 = i10 & 67108863;
                    }
                    arrayList2.add(new fpa0(objP3, i112, i9, i11));
                    i9 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new a440(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        a440Var = this.j;
        if (a440Var != null) {
            arrayList = a440Var.d;
            fdn0Var = a440Var.e;
            i3 = a440Var.b;
            if (obj4 != null) {
                objValueOf = new yea0(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            nen0Var = ((dwm0) a440Var.f.getValue()).a;
            objG = nen0Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof wdn0) {
                wdn0Var = (wdn0) objG;
                Object objL2 = wdn0Var.l(0);
                if (wdn0Var.i()) {
                    nen0Var.k(objValueOf);
                }
                if (wdn0Var.b == 1) {
                    nen0Var.m(objValueOf, wdn0Var.f());
                }
                objG = objL2;
            } else {
                nen0Var.k(objValueOf);
            }
            fpa0 fpa0Var5 = (fpa0) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                hf91 hf91VarI2 = this.H.i();
                this.I = hf91VarI2;
                hf91VarI2.N();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            hf91Var = this.I;
            int i113 = hf91Var.t;
            if (z) {
                hf91Var.R(i, obj5, obj5, true);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                hf91Var.R(i, obj5, obj2, false);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                hf91Var.R(i, obj3, obj5, false);
            }
            this.N = this.I.b(i113);
            int i114 = (-2) - i113;
            fpa0 fpa0Var6 = new fpa0(-1, i, i114, -1);
            fdn0Var.i(i114, new rl50(-1, this.k - i3, i4));
            arrayList.add(fpa0Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            a440Var2 = new a440(i5, arrayList4);
        } else {
            a440Var2 = null;
        }
        y(z, a440Var2);
    }

    public final boolean d(float f) {
        Object objL = L();
        if ((objL instanceof Float) && f == ((Number) objL).floatValue()) {
            return false;
        }
        t0(Float.valueOf(f));
        return true;
    }

    public final void d0() {
        c0(null, -127, 0, null);
    }

    public final boolean e(int i) {
        Object objL = L();
        if ((objL instanceof Integer) && i == ((Number) objL).intValue()) {
            return false;
        }
        t0(Integer.valueOf(i));
        return true;
    }

    public final void e0(int i, fjq0 fjq0Var) {
        c0(fjq0Var, i, 0, null);
    }

    public final boolean f(long j) {
        Object objL = L();
        if ((objL instanceof Long) && j == ((Number) objL).longValue()) {
            return false;
        }
        t0(Long.valueOf(j));
        return true;
    }

    public final void f0(int i, Object obj) {
        c0(obj, i, 0, null);
    }

    public final boolean g(Object obj) {
        if (u890.j(L(), obj)) {
            return false;
        }
        t0(obj);
        return true;
    }

    public final void g0() {
        c0(null, 125, 1, null);
        this.r = true;
    }

    public final boolean h(boolean z) {
        Object objL = L();
        if ((objL instanceof Boolean) && z == ((Boolean) objL).booleanValue()) {
            return false;
        }
        t0(Boolean.valueOf(z));
        return true;
    }

    public final void h0(Object obj, boolean z) {
        if (z) {
            ye91 ye91Var = this.G;
            if (ye91Var.k <= 0) {
                if ((ye91Var.b[(ye91Var.g * 5) + 1] & 1073741824) == 0) {
                    bmv0.a("Expected a node group");
                }
                ye91Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            c0k c0kVar = this.M;
            c0kVar.getClass();
            c0kVar.d(false);
            amq0 amq0Var = c0kVar.b.c;
            amq0Var.B(dlq0.c);
            y7y0.N(amq0Var, 0, obj);
        }
        this.G.u();
    }

    public final boolean i(Object obj) {
        if (L() == obj) {
            return false;
        }
        t0(obj);
        return true;
    }

    public final void i0(int i) {
        int i2;
        int i3;
        m4c m4cVar = fkj0.X;
        if (this.j != null) {
            c0(null, i, 0, null);
            return;
        }
        if (this.r) {
            g0k.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        ye91 ye91Var = this.G;
        if (this.S) {
            ye91Var.k++;
            this.I.R(i, m4cVar, m4cVar, false);
            y(false, null);
            return;
        }
        if (ye91Var.g() == i && ((i3 = ye91Var.g) >= ye91Var.h || (ye91Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            ye91Var.u();
            y(false, null);
            return;
        }
        if (ye91Var.k <= 0 && (i2 = ye91Var.g) != ye91Var.h) {
            int i4 = this.k;
            Q();
            this.M.f(i4, ye91Var.s());
            ot11.t(i2, ye91Var.g, this.s);
        }
        ye91Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            hf91 hf91VarI = this.H.i();
            this.I = hf91VarI;
            hf91VarI.N();
            this.J = false;
            this.K = null;
        }
        hf91 hf91Var = this.I;
        hf91Var.d();
        int i5 = hf91Var.t;
        hf91Var.R(i, m4cVar, m4cVar, false);
        this.N = hf91Var.b(i5);
        y(false, null);
    }

    public final void j() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        c0k c0kVar = this.M;
        c0kVar.c = false;
        c0kVar.d.a = 0;
        c0kVar.f = 0;
        c0kVar.e = true;
        c0kVar.g = 0;
        c0kVar.h.clear();
        c0kVar.i = -1;
        c0kVar.j = -1;
        c0kVar.k = -1;
        c0kVar.l = 0;
        this.E.clear();
        this.o = null;
        this.f139p = null;
    }

    public final void j0(int i) {
        c0(null, i, 0, null);
    }

    public final Object k(xky0 xky0Var) {
        return d7e.x(m(), xky0Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    public final x340 k0(int i) {
        h311 h311Var;
        boolean z;
        i0(i);
        boolean z2 = this.S;
        oi oiVar = this.g;
        ArrayList arrayList = this.E;
        h4k h4kVar = this.h;
        if (z2) {
            h311 h311Var2 = new h311(h4kVar);
            arrayList.add(h311Var2);
            t0(h311Var2);
            h311Var2.e = this.B;
            h311Var2.b &= -17;
            oiVar.y();
            return this;
        }
        bc90 bc90VarS = ot11.s(this.G.i, this.s);
        Object objM = this.G.m();
        if (u890.j(objM, fkj0.X)) {
            h311Var = new h311(h4kVar);
            t0(h311Var);
        } else {
            h311Var = (h311) objM;
        }
        if (bc90VarS == null) {
            int i2 = h311Var.b;
            boolean z3 = (i2 & 64) != 0;
            if (z3) {
                h311Var.b = i2 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i3 = h311Var.b;
        h311Var.b = z ? i3 | 8 : i3 & (-9);
        arrayList.add(h311Var);
        h311Var.e = this.B;
        h311Var.b &= -17;
        oiVar.y();
        int i4 = h311Var.b;
        if ((i4 & 256) != 0) {
            h311Var.b = (i4 & (-257)) | NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
            amq0 amq0Var = this.M.b.c;
            amq0Var.B(ykq0.c);
            y7y0.N(amq0Var, 0, h311Var);
            if (!this.y) {
                int i5 = h311Var.b;
                if ((i5 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    h311Var.b = i5 | 1024;
                }
            }
        }
        return this;
    }

    public final void l(Function0 function0) {
        if (!this.r) {
            g0k.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            g0k.a("createNode() can only be called when inserting");
        }
        up20 up20Var = this.n;
        int i = ((int[]) up20Var.b)[up20Var.a - 1];
        hf91 hf91Var = this.I;
        s340 s340VarB = hf91Var.b(hf91Var.v);
        this.l++;
        sn20 sn20Var = this.O;
        amq0 amq0Var = sn20Var.b;
        amq0Var.B(lkq0.d);
        y7y0.N(amq0Var, 0, function0);
        amq0Var.d[amq0Var.e - amq0Var.b[amq0Var.c - 1].a] = i;
        y7y0.N(amq0Var, 1, s340VarB);
        amq0 amq0Var2 = sn20Var.c;
        amq0Var2.B(lkq0.e);
        amq0Var2.d[amq0Var2.e - amq0Var2.b[amq0Var2.c - 1].a] = i;
        y7y0.N(amq0Var2, 0, s340VarB);
    }

    public final void l0(Object obj) {
        if (!this.S && this.G.g() == 207 && !u890.j(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        c0(null, 207, 0, obj);
    }

    public final xos0 m() {
        xos0 xos0Var = this.K;
        return xos0Var != null ? xos0Var : n(this.G.i);
    }

    public final void m0() {
        c0(null, 125, 2, null);
        this.r = true;
    }

    public final xos0 n(int i) {
        xos0 xos0Var;
        boolean z = this.S;
        fjq0 fjq0Var = g0k.c;
        if (z && this.J) {
            int iF = this.I.v;
            while (iF > 0) {
                if (this.I.r(iF) == 202 && u890.j(this.I.s(iF), fjq0Var)) {
                    xos0 xos0Var2 = (xos0) this.I.p(iF);
                    this.K = xos0Var2;
                    return xos0Var2;
                }
                hf91 hf91Var = this.I;
                iF = hf91Var.F(iF, hf91Var.b);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    ye91 ye91Var = this.G;
                    if (u890.j(ye91Var.p(i, ye91Var.b), fjq0Var)) {
                        fdn0 fdn0Var = this.v;
                        if (fdn0Var == null || (xos0Var = (xos0) fdn0Var.b(i)) == null) {
                            ye91 ye91Var2 = this.G;
                            xos0Var = (xos0) ye91Var2.b(i, ye91Var2.b);
                        }
                        this.K = xos0Var;
                        return xos0Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        xos0 xos0Var3 = this.u;
        this.K = xos0Var3;
        return xos0Var3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n0() {
        this.m = 0;
        this.G = this.c.f();
        c0(null, 100, 0, null);
        v3k v3kVar = this.b;
        v3kVar.x();
        xos0 xos0VarJ = v3kVar.j();
        this.x.h(this.w ? 1 : 0);
        this.w = g(xos0VarJ);
        this.K = null;
        if (!this.q) {
            this.q = v3kVar.f();
        }
        boolean zG = this.C;
        if (!zG) {
            zG = v3kVar.g();
            this.C = zG;
        }
        if (zG) {
            xos0VarJ = xos0VarJ.h(z3k.a(), new fsb1(F()));
        }
        this.u = xos0VarJ;
        Set set = (Set) d7e.x(xos0VarJ, dn80.a);
        if (set != null) {
            set.add(B());
            v3kVar.s(set);
        }
        c0(null, Long.hashCode(v3kVar.h()), 0, null);
    }

    public final xyj o() {
        if (!this.b.m()) {
            return null;
        }
        smc0 smc0VarN = k4p1.n();
        smc0VarN.addAll(rc2.r(this.I));
        smc0VarN.addAll(rc2.p(this.G));
        smc0VarN.addAll(M());
        return new xyj(k4p1.k(smc0VarN), this.C);
    }

    public final boolean o0(h311 h311Var, Object obj) {
        s340 s340Var = h311Var.c;
        if (s340Var == null) {
            return false;
        }
        int iB = this.G.a.b(aym.k(s340Var));
        if (!this.F || iB < this.G.g) {
            return false;
        }
        ot11.p(this.s, iB, h311Var, obj);
        return true;
    }

    public final void p(nen0 nen0Var, vu30 vu30Var) {
        ArrayList arrayList = this.s;
        byte b = 1;
        if (this.F) {
            g0k.a("Reentrant composition is not supported");
        }
        v1k v1kVarY = this.g.y();
        hr80.l("Compose:recompose");
        try {
            this.B = Long.hashCode(pv91.h().g());
            this.v = null;
            p0(nen0Var);
            this.k = 0;
            this.F = true;
            try {
                n0();
                Object objL = L();
                if (objL != vu30Var && vu30Var != null) {
                    t0(vu30Var);
                }
                w340 w340Var = this.D;
                bfn0 bfn0VarK = xto.k();
                try {
                    bfn0VarK.b(w340Var);
                    fjq0 fjq0Var = g0k.a;
                    if (vu30Var != null) {
                        e0(200, fjq0Var);
                        w0h1.o(2, vu30Var);
                        vu30Var.invoke(this, 1);
                        r(false);
                    } else if (!this.w || objL == null || objL.equals(fkj0.X)) {
                        Z();
                    } else {
                        e0(200, fjq0Var);
                        w0h1.o(2, objL);
                        vu30 vu30Var2 = (vu30) objL;
                        w0h1.o(2, vu30Var2);
                        vu30Var2.invoke(this, 1);
                        r(false);
                    }
                    bfn0VarK.l(bfn0VarK.c - 1);
                    x();
                    if (v1kVarY != null) {
                        v1kVarY.B();
                    }
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        g0k.a("Check failed");
                    }
                    z();
                    hr80.m();
                } catch (Throwable th) {
                    bfn0VarK.l(bfn0VarK.c - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    jm5.g(th2, new g24(this, b));
                    throw th2;
                } catch (Throwable th3) {
                    if (v1kVarY != null) {
                        v1kVarY.B();
                    }
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        g0k.a("Check failed");
                    }
                    z();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            hr80.m();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[LOOP:1: B:20:0x0043->B:35:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[EDGE_INSN: B:43:0x0093->B:36:0x0093 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0090], SYNTHETIC] */
    public final void p0(nen0 nen0Var) {
        ArrayList arrayList = this.s;
        for (int iL = p7h.L(arrayList); -1 < iL; iL--) {
            bc90 bc90Var = (bc90) arrayList.get(iL);
            s340 s340Var = bc90Var.a.c;
            s340 s340VarK = s340Var != null ? aym.k(s340Var) : null;
            if (s340VarK == null || !s340VarK.a()) {
                arrayList.remove(iL);
            } else {
                int i = bc90Var.b;
                int i2 = s340VarK.a;
                if (i != i2) {
                    bc90Var.b = i2;
                }
            }
        }
        Object[] objArr = nen0Var.b;
        Object[] objArr2 = nen0Var.c;
        long[] jArr = nen0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            h311 h311Var = (h311) obj;
                            s340 s340Var2 = h311Var.c;
                            if (s340Var2 != null) {
                                int i7 = aym.k(s340Var2).a;
                                if (obj2 == djx0.i) {
                                    obj2 = null;
                                }
                                arrayList.add(new bc90(h311Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        r7h.f0(arrayList, ot11.a);
    }

    public final void q(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        q(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            c0k c0kVar = this.M;
            c0kVar.c();
            c0kVar.h.add(objN);
        }
    }

    public final void q0(int i, int i2) {
        if (u0(i) != i2) {
            if (i < 0) {
                ddn0 ddn0Var = this.f139p;
                if (ddn0Var == null) {
                    ddn0Var = new ddn0();
                    this.f139p = ddn0Var;
                }
                ddn0Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                iArr = new int[this.G.c];
                f46.f0(-1, 0, 6, iArr);
                this.o = iArr;
            }
            iArr[i] = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x037d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r(boolean z) {
        long jRotateRight;
        int i;
        up20 up20Var;
        int i2;
        int i3;
        x340 x340Var;
        int i4;
        ?? r4;
        int i5;
        up20 up20Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashSet hashSet;
        int i10;
        a440 a440Var;
        int i11;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        int i12;
        Object[] objArr3;
        int i13;
        int i14;
        Object[] objArr4;
        long jRotateRight2;
        x340 x340Var2 = this;
        m4c m4cVar = fkj0.X;
        up20 up20Var3 = x340Var2.n;
        int i15 = ((int[]) up20Var3.b)[up20Var3.a - 2] - 1;
        if (x340Var2.S) {
            hf91 hf91Var = x340Var2.I;
            int i16 = hf91Var.v;
            int iR = hf91Var.r(i16);
            Object objS = x340Var2.I.s(i16);
            Object objP = x340Var2.I.p(i16);
            if (objS != null) {
                jRotateRight2 = Long.rotateRight(x340Var2.T, 3) ^ ((long) (objS instanceof Enum ? ((Enum) objS).ordinal() : objS.hashCode()));
            } else if (objP == null || iR != 207 || objP.equals(m4cVar)) {
                jRotateRight2 = ((long) iR) ^ Long.rotateRight(x340Var2.T ^ ((long) i15), 3);
            } else {
                x340Var2.T = Long.rotateRight(Long.rotateRight(x340Var2.T ^ ((long) i15), 3) ^ ((long) objP.hashCode()), 3);
            }
            x340Var2.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            ye91 ye91Var = x340Var2.G;
            int i17 = ye91Var.i;
            int i18 = ye91Var.i(i17);
            ye91 ye91Var2 = x340Var2.G;
            Object objP2 = ye91Var2.p(i17, ye91Var2.b);
            ye91 ye91Var3 = x340Var2.G;
            Object objB = ye91Var3.b(i17, ye91Var3.b);
            if (objP2 != null) {
                jRotateRight = Long.rotateRight(x340Var2.T, 3) ^ ((long) (objP2 instanceof Enum ? ((Enum) objP2).ordinal() : objP2.hashCode()));
            } else if (objB == null || i18 != 207 || objB.equals(m4cVar)) {
                jRotateRight = ((long) i18) ^ Long.rotateRight(x340Var2.T ^ ((long) i15), 3);
            } else {
                x340Var2.T = Long.rotateRight(Long.rotateRight(x340Var2.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            x340Var2.T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = x340Var2.l;
        a440 a440Var2 = x340Var2.j;
        ArrayList arrayList3 = x340Var2.s;
        c0k c0kVar = x340Var2.M;
        if (a440Var2 != null) {
            fdn0 fdn0Var = a440Var2.e;
            int i20 = a440Var2.b;
            ArrayList arrayList4 = a440Var2.a;
            if (arrayList4.size() > 0) {
                ArrayList arrayList5 = a440Var2.d;
                HashSet hashSetQ = syo1.q(arrayList5);
                oen0 oen0Var = ij41.a;
                oen0 oen0Var2 = new oen0();
                int size = arrayList5.size();
                i3 = -1;
                int size2 = arrayList4.size();
                i2 = 1;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size2) {
                    fpa0 fpa0Var = (fpa0) arrayList4.get(i21);
                    if (hashSetQ.contains(fpa0Var)) {
                        up20Var2 = up20Var3;
                        i6 = i21;
                        if (!oen0Var2.c(fpa0Var)) {
                            int i24 = i22;
                            if (i24 < size) {
                                fpa0 fpa0Var2 = (fpa0) arrayList5.get(i24);
                                if (fpa0Var2 != fpa0Var) {
                                    rl50 rl50Var = (rl50) fdn0Var.b(fpa0Var2.c);
                                    int i25 = rl50Var != null ? rl50Var.b : -1;
                                    oen0Var2.a(fpa0Var2);
                                    i10 = i23;
                                    if (i25 != i10) {
                                        a440Var = a440Var2;
                                        rl50 rl50Var2 = (rl50) fdn0Var.b(fpa0Var2.c);
                                        int i26 = rl50Var2 != null ? rl50Var2.c : fpa0Var2.d;
                                        i7 = size2;
                                        int i27 = i25 + i20;
                                        i8 = size;
                                        int i28 = i10 + i20;
                                        if (i26 > 0) {
                                            i9 = i20;
                                            int i29 = c0kVar.l;
                                            if (i29 > 0) {
                                                arrayList = arrayList4;
                                                if (c0kVar.j == i27 - i29 && c0kVar.k == i28 - i29) {
                                                    c0kVar.l = i29 + i26;
                                                }
                                            } else {
                                                arrayList = arrayList4;
                                            }
                                            c0kVar.c();
                                            c0kVar.j = i27;
                                            c0kVar.k = i28;
                                            c0kVar.l = i26;
                                        } else {
                                            i9 = i20;
                                            arrayList = arrayList4;
                                            c0kVar.getClass();
                                        }
                                        if (i25 <= i10) {
                                            i19 = i19;
                                            int i30 = i26;
                                            arrayList2 = arrayList5;
                                            hashSet = hashSetQ;
                                            if (i10 > i25) {
                                                Object[] objArr5 = fdn0Var.c;
                                                long[] jArr3 = fdn0Var.a;
                                                int length = jArr3.length - 2;
                                                if (length >= 0) {
                                                    int i31 = 0;
                                                    while (true) {
                                                        long j = jArr3[i31];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i32 = 8 - ((~(i31 - length)) >>> 31);
                                                            int i33 = 0;
                                                            while (i33 < i32) {
                                                                if ((j & 255) < 128) {
                                                                    rl50 rl50Var3 = (rl50) objArr5[(i31 << 3) + i33];
                                                                    objArr2 = objArr5;
                                                                    int i34 = rl50Var3.b;
                                                                    jArr2 = jArr3;
                                                                    if (i25 <= i34 && i34 < i25 + i30) {
                                                                        rl50Var3.b = (i34 - i25) + i10;
                                                                    } else if (i25 + 1 <= i34 && i34 < i10) {
                                                                        rl50Var3.b = i34 - i30;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr3;
                                                                }
                                                                j >>= 8;
                                                                i33++;
                                                                objArr5 = objArr2;
                                                                jArr3 = jArr2;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr3;
                                                            if (i32 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr3;
                                                        }
                                                        if (i31 == length) {
                                                            break;
                                                        }
                                                        i31++;
                                                        objArr5 = objArr;
                                                        jArr3 = jArr;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = fdn0Var.c;
                                            long[] jArr4 = fdn0Var.a;
                                            int length2 = jArr4.length - 2;
                                            if (length2 >= 0) {
                                                arrayList2 = arrayList5;
                                                hashSet = hashSetQ;
                                                int i35 = 0;
                                                while (true) {
                                                    long j2 = jArr4[i35];
                                                    i19 = i19;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i36 = 8 - ((~(i35 - length2)) >>> 31);
                                                        int i37 = 0;
                                                        while (i37 < i36) {
                                                            if ((j2 & 255) < 128) {
                                                                i13 = i37;
                                                                rl50 rl50Var4 = (rl50) objArr6[(i35 << 3) + i37];
                                                                i14 = i26;
                                                                int i38 = rl50Var4.b;
                                                                objArr4 = objArr6;
                                                                if (i25 <= i38 && i38 < i25 + i14) {
                                                                    rl50Var4.b = (i38 - i25) + i10;
                                                                } else if (i10 <= i38 && i38 < i25) {
                                                                    rl50Var4.b = i38 + i14;
                                                                }
                                                            } else {
                                                                i13 = i37;
                                                                i14 = i26;
                                                                objArr4 = objArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i37 = i13 + 1;
                                                            i26 = i14;
                                                            objArr6 = objArr4;
                                                        }
                                                        i12 = i26;
                                                        objArr3 = objArr6;
                                                        if (i36 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        i12 = i26;
                                                        objArr3 = objArr6;
                                                    }
                                                    if (i35 == length2) {
                                                        break;
                                                    }
                                                    i35++;
                                                    i19 = i19;
                                                    i26 = i12;
                                                    objArr6 = objArr3;
                                                }
                                            }
                                        }
                                        i11 = i6;
                                    } else {
                                        a440Var = a440Var2;
                                        i7 = size2;
                                        i8 = size;
                                        i9 = i20;
                                        arrayList = arrayList4;
                                    }
                                    arrayList2 = arrayList5;
                                    hashSet = hashSetQ;
                                    i11 = i6;
                                } else {
                                    i19 = i19;
                                    i7 = size2;
                                    i8 = size;
                                    i9 = i20;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList5;
                                    hashSet = hashSetQ;
                                    i10 = i23;
                                    a440Var = a440Var2;
                                    i11 = i6 + 1;
                                }
                                i22 = i24 + 1;
                                rl50 rl50Var5 = (rl50) fdn0Var.b(fpa0Var2.c);
                                int i39 = (rl50Var5 != null ? rl50Var5.c : fpa0Var2.d) + i10;
                                i21 = i11;
                                a440Var2 = a440Var;
                                up20Var3 = up20Var2;
                                size2 = i7;
                                size = i8;
                                i20 = i9;
                                arrayList4 = arrayList;
                                arrayList5 = arrayList2;
                                hashSetQ = hashSet;
                                x340Var2 = this;
                                i23 = i39;
                                i19 = i19;
                            } else {
                                i22 = i24;
                                x340Var2 = this;
                                up20Var3 = up20Var2;
                                i21 = i6;
                            }
                        }
                    } else {
                        up20Var2 = up20Var3;
                        rl50 rl50Var6 = (rl50) fdn0Var.b(fpa0Var.c);
                        int i40 = rl50Var6 != null ? rl50Var6.b : -1;
                        int i41 = fpa0Var.c;
                        i6 = i21;
                        c0kVar.f(i40 + i20, fpa0Var.d);
                        a440Var2.a(i41, 0);
                        c0kVar.f = (i41 - c0kVar.a.G.g) + c0kVar.f;
                        x340Var2.G.r(i41);
                        x340Var2.Q();
                        x340Var2.G.s();
                        ot11.t(i41, x340Var2.G.b[(i41 * 5) + 3] + i41, arrayList3);
                    }
                    i21 = i6 + 1;
                    up20Var3 = up20Var2;
                }
                i = i19;
                up20Var = up20Var3;
                c0kVar.c();
                if (arrayList4.size() > 0) {
                    x340 x340Var3 = this;
                    ye91 ye91Var4 = x340Var3.G;
                    c0kVar.f = (ye91Var4.h - c0kVar.a.G.g) + c0kVar.f;
                    ye91Var4.t();
                    x340Var = x340Var3;
                } else {
                    x340Var = this;
                }
            } else {
                i = i19;
                up20Var = up20Var3;
                i2 = 1;
                i3 = -1;
                x340Var = x340Var2;
            }
        } else {
            i = i19;
            up20Var = up20Var3;
            i2 = 1;
            i3 = -1;
            x340Var = x340Var2;
        }
        boolean z2 = x340Var.S;
        if (!z2) {
            ye91 ye91Var5 = x340Var.G;
            int i42 = ye91Var5.m - ye91Var5.l;
            if (i42 > 0) {
                if (i42 > 0) {
                    c0kVar.d(false);
                    c0kVar.e();
                    amq0 amq0Var = c0kVar.b.c;
                    amq0Var.B(clq0.c);
                    amq0Var.d[amq0Var.e - amq0Var.b[amq0Var.c - 1].a] = i42;
                } else {
                    c0kVar.getClass();
                }
            }
        }
        int i43 = x340Var.k;
        while (true) {
            ye91 ye91Var6 = x340Var.G;
            if (ye91Var6.k > 0 || (i5 = ye91Var6.g) == ye91Var6.h) {
                break;
            }
            x340Var.Q();
            c0kVar.f(i43, x340Var.G.s());
            ot11.t(i5, x340Var.G.g, arrayList3);
        }
        if (z2) {
            if (z) {
                sn20 sn20Var = x340Var.O;
                amq0 amq0Var2 = sn20Var.c;
                if (amq0Var2.c == 0) {
                    g0k.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                amq0 amq0Var3 = sn20Var.b;
                klq0[] klq0VarArr = amq0Var2.b;
                int i44 = amq0Var2.c - 1;
                amq0Var2.c = i44;
                klq0 klq0Var = klq0VarArr[i44];
                klq0VarArr[i44] = null;
                amq0Var3.B(klq0Var);
                Object[] objArr7 = amq0Var2.f;
                Object[] objArr8 = amq0Var3.f;
                int i45 = amq0Var3.g;
                int i46 = klq0Var.b;
                int i47 = amq0Var2.g;
                int i48 = i47 - i46;
                System.arraycopy(objArr7, i48, objArr8, i45 - i46, i47 - i48);
                Object[] objArr9 = amq0Var2.f;
                int i49 = amq0Var2.g;
                f46.e0(objArr9, (te70) null, i49 - i46, i49);
                int[] iArr = amq0Var2.d;
                int[] iArr2 = amq0Var3.d;
                int i50 = amq0Var3.e;
                int i51 = klq0Var.a;
                int i52 = amq0Var2.e;
                f46.P(i50 - i51, i52 - i51, i52, iArr, iArr2);
                amq0Var2.g -= i46;
                amq0Var2.e -= i51;
                i4 = i2;
            } else {
                i4 = i;
            }
            ye91 ye91Var7 = x340Var.G;
            if (ye91Var7.k <= 0) {
                bmv0.a("Unbalanced begin/end empty");
            }
            ye91Var7.k--;
            hf91 hf91Var2 = x340Var.I;
            int i53 = hf91Var2.v;
            hf91Var2.i();
            if (x340Var.G.k <= 0) {
                int i54 = (-2) - i53;
                x340Var.I.j();
                x340Var.I.e(i2);
                s340 s340Var = x340Var.N;
                boolean zA = x340Var.O.b.A();
                ze91 ze91Var = x340Var.H;
                if (zA) {
                    c0kVar.b();
                    c0kVar.d(false);
                    c0kVar.e();
                    c0kVar.c();
                    amq0 amq0Var4 = c0kVar.b.c;
                    amq0Var4.B(mkq0.c);
                    y7y0.O(amq0Var4, 0, s340Var, 1, ze91Var);
                    r4 = 0;
                } else {
                    sn20 sn20Var2 = x340Var.O;
                    c0kVar.b();
                    c0kVar.d(false);
                    c0kVar.e();
                    c0kVar.c();
                    amq0 amq0Var5 = c0kVar.b.c;
                    amq0Var5.B(nkq0.c);
                    y7y0.P(amq0Var5, s340Var, ze91Var, sn20Var2);
                    x340Var.O = new sn20();
                    r4 = 0;
                }
                x340Var.S = r4;
                if (x340Var.c.b != 0) {
                    x340Var.q0(i54, r4);
                    x340Var.r0(i54, i4);
                }
            }
        } else {
            if (z) {
                c0kVar.a();
            }
            int i55 = c0kVar.a.G.i;
            up20 up20Var4 = c0kVar.d;
            int i56 = i3;
            if (up20Var4.f(i56) > i55) {
                g0k.a("Missed recording an endGroup");
            }
            if (up20Var4.f(i56) == i55) {
                c0kVar.d(false);
                up20Var4.g();
                c0kVar.b.c.B(gkq0.c);
            }
            int i57 = x340Var.G.i;
            int i58 = i;
            if (i58 != x340Var.u0(i57)) {
                x340Var.r0(i57, i58);
            }
            if (z) {
                i58 = 1;
            }
            x340Var.G.e();
            c0kVar.c();
            i4 = i58;
        }
        ArrayList arrayList6 = x340Var.i;
        a440 a440Var3 = (a440) arrayList6.remove(arrayList6.size() - 1);
        if (a440Var3 != null && !z2) {
            a440Var3.c++;
        }
        x340Var.j = a440Var3;
        x340Var.k = up20Var.g() + i4;
        x340Var.m = up20Var.g();
        x340Var.l = up20Var.g() + i4;
    }

    public final void r0(int i, int i2) {
        int iU0 = u0(i);
        if (iU0 != i2) {
            int i3 = i2 - iU0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iU1 = u0(i) + i3;
                q0(i, iU1);
                for (int i4 = size; -1 < i4; i4--) {
                    a440 a440Var = (a440) arrayList.get(i4);
                    if (a440Var != null && a440Var.a(i, iU1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                ye91 ye91Var = this.G;
                if (i < 0) {
                    i = ye91Var.i;
                } else if (ye91Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final void s() {
        r(false);
        h311 h311VarD = D();
        if (h311VarD != null) {
            int i = h311VarD.b;
            if ((i & 1) != 0) {
                h311VarD.b = i | 2;
            }
        }
    }

    public final void s0(Object obj) {
        if (obj instanceof ky11) {
            b440 b440Var = new b440((ky11) obj, this.m - 1);
            if (this.S) {
                amq0 amq0Var = this.M.b.c;
                amq0Var.B(rkq0.c);
                y7y0.N(amq0Var, 0, b440Var);
            }
            this.d.add(obj);
            obj = b440Var;
        }
        t0(obj);
    }

    public final void t() {
        r(true);
    }

    public final void t0(Object obj) {
        if (this.S) {
            this.I.T(obj);
            return;
        }
        ye91 ye91Var = this.G;
        boolean z = ye91Var.n;
        c0k c0kVar = this.M;
        if (!z) {
            s340 s340VarA = ye91Var.a(ye91Var.i);
            amq0 amq0Var = c0kVar.b.c;
            amq0Var.B(yjq0.c);
            y7y0.O(amq0Var, 0, s340VarA, 1, obj);
            return;
        }
        int iD = (ye91Var.l - bf91.d(ye91Var.i, ye91Var.b)) - 1;
        if (c0kVar.a.G.i - c0kVar.f >= 0) {
            c0kVar.d(true);
            amq0 amq0Var2 = c0kVar.b.c;
            amq0Var2.B(flq0.c);
            y7y0.N(amq0Var2, 0, obj);
            amq0Var2.d[amq0Var2.e - amq0Var2.b[amq0Var2.c - 1].a] = iD;
            return;
        }
        ye91 ye91Var2 = this.G;
        s340 s340VarA2 = ye91Var2.a(ye91Var2.i);
        amq0 amq0Var3 = c0kVar.b.c;
        amq0Var3.B(lkq0.f);
        y7y0.O(amq0Var3, 0, obj, 1, s340VarA2);
        amq0Var3.d[amq0Var3.e - amq0Var3.b[amq0Var3.c - 1].a] = iD;
    }

    public final void u() {
        r(false);
    }

    public final int u0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        ddn0 ddn0Var = this.f139p;
        if (ddn0Var != null && ddn0Var.c(i) >= 0) {
            int iC = ddn0Var.c(i);
            if (iC >= 0) {
                return ddn0Var.c[iC];
            }
            bhn0.t(f4i1.c(i, "Cannot find value for key "));
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[LOOP:0: B:16:0x003f->B:28:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[EDGE_INSN: B:29:0x0085->B:30:0x0086 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x0085 A[SYNTHETIC] */
    public final h311 v() {
        h311 h311Var;
        s340 s340VarA;
        g311 g311Var;
        ArrayList arrayList = this.E;
        h311 h311Var2 = !arrayList.isEmpty() ? (h311) arrayList.remove(arrayList.size() - 1) : null;
        if (h311Var2 != null) {
            h311Var2.b &= -9;
            this.g.y();
            int i = this.B;
            sdn0 sdn0Var = h311Var2.f;
            if (sdn0Var == null || (h311Var2.b & 16) != 0) {
                g311Var = null;
                break;
            }
            Object[] objArr = sdn0Var.b;
            int[] iArr = sdn0Var.c;
            long[] jArr = sdn0Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                g311Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                g311Var = new g311(h311Var2, i, sdn0Var, (byte) 0);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    g311Var = null;
                    break;
                }
                if (i2 == length) {
                    g311Var = null;
                    break;
                }
                i2++;
            }
            c0k c0kVar = this.M;
            if (g311Var != null) {
                amq0 amq0Var = c0kVar.b.c;
                amq0Var.B(fkq0.c);
                y7y0.O(amq0Var, 0, g311Var, 1, this.h);
            }
            int i6 = h311Var2.b;
            if ((i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                h311Var2.b = i6 & (-513);
                amq0 amq0Var2 = c0kVar.b.c;
                amq0Var2.B(ikq0.c);
                y7y0.N(amq0Var2, 0, h311Var2);
                int i7 = h311Var2.b;
                h311Var2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    h311Var2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (h311Var2 != null) {
            int i8 = h311Var2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (h311Var2.c == null) {
                    if (this.S) {
                        hf91 hf91Var = this.I;
                        s340VarA = hf91Var.b(hf91Var.v);
                    } else {
                        ye91 ye91Var = this.G;
                        s340VarA = ye91Var.a(ye91Var.i);
                    }
                    h311Var2.c = s340VarA;
                }
                h311Var2.b &= -5;
                h311Var = h311Var2;
            } else {
                h311Var = null;
            }
        } else {
            h311Var = null;
        }
        r(false);
        return h311Var;
    }

    public final void v0() {
        if (!this.r) {
            g0k.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            g0k.a("useNode() called while inserting");
        }
        ye91 ye91Var = this.G;
        Object objN = ye91Var.n(ye91Var.i);
        c0k c0kVar = this.M;
        c0kVar.c();
        c0kVar.h.add(objN);
        if (this.y && (objN instanceof wvj)) {
            c0kVar.b();
            c0kVar.b.c.B(hlq0.c);
        }
    }

    public final void w() {
        if (this.y && this.G.i == this.z) {
            this.z = -1;
            this.y = false;
        }
        r(false);
    }

    public final void x() {
        r(false);
        this.b.d();
        r(false);
        c0k c0kVar = this.M;
        if (c0kVar.c) {
            c0kVar.d(false);
            c0kVar.d(false);
            c0kVar.b.c.B(gkq0.c);
            c0kVar.c = false;
        }
        c0kVar.b();
        if (c0kVar.d.a != 0) {
            g0k.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            g0k.a("Start/end imbalance");
        }
        j();
        this.G.c();
        this.w = ot11.j(this.x.g());
    }

    public final void y(boolean z, a440 a440Var) {
        this.i.add(this.j);
        this.j = a440Var;
        int i = this.l;
        up20 up20Var = this.n;
        up20Var.h(i);
        up20Var.h(this.m);
        up20Var.h(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void z() {
        ze91 ze91Var = new ze91();
        if (this.C) {
            ze91Var.c();
        }
        if (this.b.e()) {
            ze91Var.X = new fdn0();
        }
        this.H = ze91Var;
        hf91 hf91VarI = ze91Var.i();
        hf91VarI.e(true);
        this.I = hf91VarI;
    }
}
