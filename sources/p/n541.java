package p;

import android.util.SparseArray;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class n541 implements gtf1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public ie30 D;
    public ie30 E;
    public long F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public final fo00 a;
    public final dna1 c;
    public final f9v d;
    public final b9v e;
    public m541 f;
    public ie30 g;
    public y8v h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f101p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;
    public long w;
    public int x;
    public int y;
    public boolean z;
    public final qjb b = new qjb();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public ftf1[] o = new ftf1[1000];

    public n541(hw3 hw3Var, f9v f9vVar, b9v b9vVar) {
        this.d = f9vVar;
        this.e = b9vVar;
        this.a = new fo00(hw3Var);
        f341 f341Var = new f341((byte) 3);
        dna1 dna1Var = new dna1();
        dna1Var.b = new SparseArray();
        dna1Var.c = f341Var;
        dna1Var.a = -1;
        this.c = dna1Var;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.B = true;
        this.A = true;
        this.G = true;
        this.u = Long.MIN_VALUE;
        this.x = -1;
        this.y = -1;
    }

    public final void A(boolean z) {
        fo00 fo00Var = this.a;
        hw3 hw3Var = (hw3) fo00Var.c;
        z1c z1cVar = (z1c) fo00Var.e;
        if (((nu3) z1cVar.c) != null) {
            hw3Var.d(z1cVar);
            z1cVar.c = null;
            z1cVar.d = null;
        }
        z1c z1cVar2 = (z1c) fo00Var.e;
        int i = fo00Var.a;
        dm5.y(((nu3) z1cVar2.c) == null);
        z1cVar2.a = 0L;
        z1cVar2.b = i;
        z1c z1cVar3 = (z1c) fo00Var.e;
        fo00Var.f = z1cVar3;
        fo00Var.g = z1cVar3;
        fo00Var.b = 0L;
        hw3Var.e();
        this.f101p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.y = -1;
        this.A = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.z = false;
        dna1 dna1Var = this.c;
        SparseArray sparseArray = (SparseArray) dna1Var.b;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((f341) dna1Var.c).accept(sparseArray.valueAt(i2));
        }
        dna1Var.a = -1;
        sparseArray.clear();
        if (z) {
            this.D = null;
            this.E = null;
            this.B = true;
            this.G = true;
        }
    }

    public final synchronized boolean B(int i) {
        synchronized (this) {
            this.s = 0;
            fo00 fo00Var = this.a;
            fo00Var.f = (z1c) fo00Var.e;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.f101p + i2) {
            int i3 = this.x;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            int i4 = this.y;
            if (i4 != -1 && i >= i4) {
                return false;
            }
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0093 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean C(long r12, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L84
            r0 = 0
            r11.s = r0     // Catch: java.lang.Throwable -> L8c
            p.fo00 r1 = r11.a     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r2 = r1.e     // Catch: java.lang.Throwable -> L8c
            p.z1c r2 = (p.z1c) r2     // Catch: java.lang.Throwable -> L8c
            r1.f = r2     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L89
            int r4 = r11.q(r0)     // Catch: java.lang.Throwable -> L7f
            long r1 = r11.u     // Catch: java.lang.Throwable -> L7f
            r5 = -9223372036854775808
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            long r5 = r11.w
            if (r3 == 0) goto L26
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.Throwable -> L21
            goto L26
        L21:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto L95
        L26:
            int r1 = r11.s     // Catch: java.lang.Throwable -> L84
            int r2 = r11.f101p     // Catch: java.lang.Throwable -> L84
            r9 = 1
            if (r1 == r2) goto L2f
            r3 = r9
            goto L30
        L2f:
            r3 = r0
        L30:
            if (r3 == 0) goto L40
            long[] r3 = r11.n     // Catch: java.lang.Throwable -> L7f
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L7f
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 < 0) goto L40
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 <= 0) goto L42
            if (r14 != 0) goto L42
        L40:
            r3 = r11
            goto L82
        L42:
            boolean r3 = r11.G     // Catch: java.lang.Throwable -> L7f
            r10 = -1
            if (r3 == 0) goto L66
            int r2 = r2 - r1
            r1 = r0
        L49:
            if (r1 >= r2) goto L5f
            long[] r3 = r11.n     // Catch: java.lang.Throwable -> L21
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L21
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 < 0) goto L55
            r2 = r1
            goto L63
        L55:
            int r4 = r4 + 1
            int r3 = r11.i     // Catch: java.lang.Throwable -> L21
            if (r4 != r3) goto L5c
            r4 = r0
        L5c:
            int r1 = r1 + 1
            goto L49
        L5f:
            if (r14 == 0) goto L62
            goto L63
        L62:
            r2 = r10
        L63:
            r3 = r11
            r6 = r12
            goto L6f
        L66:
            int r5 = r2 - r1
            r8 = 1
            r3 = r11
            r6 = r12
            int r2 = r3.m(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L7c
        L6f:
            if (r2 != r10) goto L73
            monitor-exit(r3)
            return r0
        L73:
            r3.t = r6     // Catch: java.lang.Throwable -> L7c
            int r11 = r3.s     // Catch: java.lang.Throwable -> L7c
            int r11 = r11 + r2
            r3.s = r11     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r3)
            return r9
        L7c:
            r0 = move-exception
        L7d:
            r12 = r0
            goto L95
        L7f:
            r0 = move-exception
            r3 = r11
            goto L7d
        L82:
            monitor-exit(r3)
            return r0
        L84:
            r0 = move-exception
            r3 = r11
        L86:
            r11 = r0
            r12 = r11
            goto L95
        L89:
            r0 = move-exception
            r3 = r11
            goto L86
        L8c:
            r0 = move-exception
            r3 = r11
        L8e:
            r11 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L93
            throw r11     // Catch: java.lang.Throwable -> L91
        L91:
            r0 = move-exception
            goto L86
        L93:
            r0 = move-exception
            goto L8e
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n541.C(long, boolean):boolean");
    }

    public final synchronized void D(long j) {
        if (j == this.u) {
            return;
        }
        this.u = j;
        this.x = -1;
        this.y = -1;
        if (j != Long.MIN_VALUE && j <= this.w) {
            for (int i = 0; i < this.f101p; i++) {
                int iQ = q(i);
                F(this.q + i, this.n[iQ], this.m[iQ]);
                if (this.x != -1) {
                    break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void E(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.f101p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        dm5.m(z);
        this.s += i;
    }

    public final void F(int i, long j, int i2) {
        int i3;
        long j2 = this.u;
        if (j2 != Long.MIN_VALUE && this.x == -1) {
            if (j < j2) {
                this.y = -1;
                return;
            }
            int i4 = this.y;
            if (i4 == -1) {
                this.y = i;
                i4 = i;
            }
            int i5 = (i - i4) + 1;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 536870912) != 0;
            ie30 ie30Var = this.E;
            if (ie30Var == null || (i3 = ie30Var.r) == -1) {
                i3 = 16;
            }
            if (i5 >= i3 + 1 || z || z2) {
                this.x = i4;
                this.y = -1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:21:0x0067, B:25:0x0070, B:18:0x0059), top: B:35:0x000a }] */
    @Override // p.gtf1
    public final void a(ie30 ie30Var) {
        ie30 ie30VarN = n(ie30Var);
        boolean z = false;
        this.C = false;
        this.D = ie30Var;
        synchronized (this) {
            try {
                this.B = false;
                if (!Objects.equals(ie30VarN, this.E)) {
                    if (((SparseArray) this.c.b).size() == 0) {
                        this.E = ie30VarN;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.c.b;
                        if (((l541) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(ie30VarN)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.b;
                            ie30VarN = ((l541) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            this.E = ie30VarN;
                        } else {
                            this.E = ie30VarN;
                        }
                    }
                    boolean z2 = this.G;
                    String str = ie30VarN.f66p;
                    this.G = z2 & (asj0.i(str) == 1 && asj0.a(str, ie30VarN.l));
                    this.H = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m541 m541Var = this.f;
        if (m541Var == null || !z) {
            return;
        }
        m541Var.e();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017d A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0188  */
    /* JADX WARN: Code duplicated, block: B:105:0x018a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0190 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:89:0x0144 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:91:0x014d A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0154 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0169 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:97:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0171  */
    @Override // p.gtf1
    public void b(long j, int i, int i2, int i3, ftf1 ftf1Var) {
        int i4;
        ie30 ie30Var;
        f9v f9vVar;
        e9v e9vVarF;
        dna1 dna1Var;
        int iT;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.C) {
            ie30 ie30Var2 = this.D;
            ie30Var2.getClass();
            a(ie30Var2);
        }
        int i5 = i & 1;
        boolean z4 = i5 != 0;
        if (this.A) {
            if (!z4) {
                return;
            } else {
                this.A = false;
            }
        }
        long j2 = j + this.I;
        if (!this.G) {
            i4 = i;
        } else {
            if (j2 < this.t) {
                return;
            }
            if (i5 == 0) {
                if (!this.H) {
                    oon1.H("Overriding unexpected non-sync sample for format: " + this.E);
                    this.H = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.J) {
            if (!z4) {
                return;
            }
            synchronized (this) {
                if (this.f101p == 0) {
                    z3 = j2 > this.v;
                } else {
                    synchronized (this) {
                        long jMax = Math.max(this.v, o(this.s));
                        if (jMax >= j2) {
                            z3 = false;
                        } else {
                            int i6 = this.f101p;
                            int iQ = q(i6 - 1);
                            while (i6 > this.s && this.n[iQ] >= j2) {
                                i6--;
                                iQ--;
                                if (iQ == -1) {
                                    iQ = this.i - 1;
                                }
                            }
                            k(this.q + i6);
                            z3 = true;
                        }
                    }
                }
            }
            if (!z3) {
                return;
            } else {
                this.J = false;
            }
        }
        long j3 = (this.a.b - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i7 = this.f101p;
                if (i7 > 0) {
                    int iQ2 = q(i7 - 1);
                    dm5.m(this.k[iQ2] + ((long) this.l[iQ2]) <= j3);
                }
                this.z = (536870912 & i4) != 0;
                this.w = Math.max(this.w, j2);
                F(t(), j2, i4);
                int iQ3 = q(this.f101p);
                this.n[iQ3] = j2;
                this.k[iQ3] = j3;
                this.l[iQ3] = i2;
                this.m[iQ3] = i4;
                this.o[iQ3] = ftf1Var;
                this.j[iQ3] = this.F;
                if (((SparseArray) this.c.b).size() == 0) {
                    ie30Var = this.E;
                    ie30Var.getClass();
                    f9vVar = this.d;
                    if (f9vVar != null) {
                        e9vVarF = f9vVar.f(this.e, ie30Var);
                    } else {
                        e9vVarF = e9v.E;
                    }
                    dna1Var = this.c;
                    iT = t();
                    l541 l541Var = new l541(ie30Var, e9vVarF);
                    sparseArray = (SparseArray) dna1Var.b;
                    if (dna1Var.a == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        dm5.y(z2);
                        dna1Var.a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (iT >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dm5.m(z);
                        if (iKeyAt == iT) {
                            ((f341) dna1Var.c).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(iT, l541Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.c.b;
                    if (!((l541) sparseArray2.valueAt(sparseArray2.size() - 1)).a.equals(this.E)) {
                        ie30Var = this.E;
                        ie30Var.getClass();
                        f9vVar = this.d;
                        if (f9vVar != null) {
                            e9vVarF = f9vVar.f(this.e, ie30Var);
                        } else {
                            e9vVarF = e9v.E;
                        }
                        dna1Var = this.c;
                        iT = t();
                        l541 l541Var2 = new l541(ie30Var, e9vVarF);
                        sparseArray = (SparseArray) dna1Var.b;
                        if (dna1Var.a == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            dm5.y(z2);
                            dna1Var.a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (iT >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            dm5.m(z);
                            if (iKeyAt == iT) {
                                ((f341) dna1Var.c).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(iT, l541Var2);
                    }
                }
                int i8 = this.f101p + 1;
                this.f101p = i8;
                int i9 = this.i;
                if (i8 == i9) {
                    int i10 = i9 + 1000;
                    long[] jArr = new long[i10];
                    long[] jArr2 = new long[i10];
                    long[] jArr3 = new long[i10];
                    int[] iArr = new int[i10];
                    int[] iArr2 = new int[i10];
                    ftf1[] ftf1VarArr = new ftf1[i10];
                    int i11 = this.r;
                    int i12 = i9 - i11;
                    System.arraycopy(this.k, i11, jArr2, 0, i12);
                    System.arraycopy(this.n, this.r, jArr3, 0, i12);
                    System.arraycopy(this.m, this.r, iArr, 0, i12);
                    System.arraycopy(this.l, this.r, iArr2, 0, i12);
                    System.arraycopy(this.o, this.r, ftf1VarArr, 0, i12);
                    System.arraycopy(this.j, this.r, jArr, 0, i12);
                    int i13 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i12, i13);
                    System.arraycopy(this.n, 0, jArr3, i12, i13);
                    System.arraycopy(this.m, 0, iArr, i12, i13);
                    System.arraycopy(this.l, 0, iArr2, i12, i13);
                    System.arraycopy(this.o, 0, ftf1VarArr, i12, i13);
                    System.arraycopy(this.j, 0, jArr, i12, i13);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = ftf1VarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.gtf1
    public final void c(izr0 izr0Var, int i, int i2) {
        while (i > 0) {
            fo00 fo00Var = this.a;
            int iB = fo00Var.b(i);
            z1c z1cVar = (z1c) fo00Var.g;
            nu3 nu3Var = (nu3) z1cVar.c;
            izr0Var.o(((int) (fo00Var.b - z1cVar.a)) + nu3Var.b, nu3Var.a, iB);
            i -= iB;
            long j = fo00Var.b + ((long) iB);
            fo00Var.b = j;
            z1c z1cVar2 = (z1c) fo00Var.g;
            if (j == z1cVar2.b) {
                fo00Var.g = (z1c) z1cVar2.d;
            }
        }
    }

    @Override // p.gtf1
    public final int d(z0r z0rVar, int i, boolean z) {
        fo00 fo00Var = this.a;
        int iB = fo00Var.b(i);
        z1c z1cVar = (z1c) fo00Var.g;
        nu3 nu3Var = (nu3) z1cVar.c;
        int i2 = z0rVar.read(nu3Var.a, ((int) (fo00Var.b - z1cVar.a)) + nu3Var.b, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            eg.l();
            return 0;
        }
        long j = fo00Var.b + ((long) i2);
        fo00Var.b = j;
        z1c z1cVar2 = (z1c) fo00Var.g;
        if (j == z1cVar2.b) {
            fo00Var.g = (z1c) z1cVar2.d;
        }
        return i2;
    }

    public final long h(int i) {
        this.v = Math.max(this.v, o(i));
        this.f101p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        dna1 dna1Var = this.c;
        SparseArray sparseArray = (SparseArray) dna1Var.b;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((f341) dna1Var.c).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = dna1Var.a;
            if (i8 > 0) {
                dna1Var.a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.f101p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void i(long j, boolean z) throws Throwable {
        Throwable th;
        fo00 fo00Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.f101p;
                    long jH = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iM = m(i2, i, j, false);
                            if (iM != -1) {
                                jH = h(iM);
                            }
                        }
                    }
                    fo00Var.a(jH);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void j() {
        long jH;
        fo00 fo00Var = this.a;
        synchronized (this) {
            int i = this.f101p;
            jH = i == 0 ? -1L : h(i);
        }
        fo00Var.a(jH);
    }

    public final long k(int i) {
        int iT = t() - i;
        boolean z = false;
        dm5.m(iT >= 0 && iT <= this.f101p - this.s);
        int i2 = this.f101p - iT;
        this.f101p = i2;
        this.w = Math.max(this.v, o(i2));
        if (iT == 0 && this.z) {
            z = true;
        }
        this.z = z;
        int i3 = this.x;
        if (i3 != -1 && i < i3) {
            this.x = -1;
        }
        int i4 = this.y;
        if (i4 != -1 && i < i4) {
            this.y = -1;
        }
        dna1 dna1Var = this.c;
        SparseArray sparseArray = (SparseArray) dna1Var.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((f341) dna1Var.c).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        dna1Var.a = sparseArray.size() > 0 ? Math.min(dna1Var.a, sparseArray.size() - 1) : -1;
        int i5 = this.f101p;
        if (i5 == 0) {
            return 0L;
        }
        int iQ = q(i5 - 1);
        return this.k[iQ] + ((long) this.l[iQ]);
    }

    public final void l(int i) {
        z1c z1cVar;
        fo00 fo00Var = this.a;
        hw3 hw3Var = (hw3) fo00Var.c;
        long jK = k(i);
        int i2 = fo00Var.a;
        dm5.m(jK <= fo00Var.b);
        fo00Var.b = jK;
        if (jK != 0) {
            z1c z1cVar2 = (z1c) fo00Var.e;
            if (jK != z1cVar2.a) {
                while (true) {
                    long j = fo00Var.b;
                    long j2 = z1cVar2.b;
                    z1cVar = (z1c) z1cVar2.d;
                    if (j <= j2) {
                        break;
                    } else {
                        z1cVar2 = z1cVar;
                    }
                }
                z1cVar.getClass();
                if (((nu3) z1cVar.c) != null) {
                    hw3Var.d(z1cVar);
                    z1cVar.c = null;
                    z1cVar.d = null;
                }
                z1c z1cVar3 = new z1c(z1cVar2.b, i2);
                z1cVar2.d = z1cVar3;
                if (fo00Var.b == z1cVar2.b) {
                    z1cVar2 = z1cVar3;
                }
                fo00Var.g = z1cVar2;
                if (((z1c) fo00Var.f) == z1cVar) {
                    fo00Var.f = z1cVar3;
                    return;
                }
                return;
            }
        }
        z1c z1cVar4 = (z1c) fo00Var.e;
        if (((nu3) z1cVar4.c) != null) {
            hw3Var.d(z1cVar4);
            z1cVar4.c = null;
            z1cVar4.d = null;
        }
        z1c z1cVar5 = new z1c(fo00Var.b, i2);
        fo00Var.e = z1cVar5;
        fo00Var.f = z1cVar5;
        fo00Var.g = z1cVar5;
    }

    public final int m(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public ie30 n(ie30 ie30Var) {
        if (this.I == 0 || ie30Var.u == Long.MAX_VALUE) {
            return ie30Var;
        }
        ge30 ge30VarA = ie30Var.a();
        ge30VarA.t = ie30Var.u + this.I;
        return new ie30(ge30VarA);
    }

    public final long o(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iQ = q(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iQ]);
            if ((this.m[iQ] & 1) != 0) {
                return jMax;
            }
            iQ--;
            if (iQ == -1) {
                iQ = this.i - 1;
            }
        }
        return jMax;
    }

    public final int p() {
        return this.q + this.s;
    }

    public final int q(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int r(long j, boolean z) throws Throwable {
        try {
            try {
                int iQ = q(this.s);
                int i = this.s;
                int i2 = this.f101p;
                if (!(i != i2) || j < this.n[iQ]) {
                    return 0;
                }
                if (j > this.w && z) {
                    return i2 - i;
                }
                int iM = m(iQ, i2 - i, j, true);
                if (iM == -1) {
                    return 0;
                }
                return iM;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized ie30 s() {
        return this.B ? null : this.E;
    }

    public final int t() {
        return this.q + this.f101p;
    }

    public final synchronized boolean u(boolean z) {
        ie30 ie30Var;
        int iP = p();
        int i = this.x;
        boolean z2 = true;
        if (i != -1 && iP >= i) {
            return true;
        }
        if (this.s != this.f101p) {
            if (!(i == -1 && this.y != -1 && p() >= this.y)) {
                if (((l541) this.c.a(iP)).a != this.g) {
                    return true;
                }
                return v(q(this.s));
            }
        }
        if (!z && !this.z && ((ie30Var = this.E) == null || ie30Var == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean v(int i) {
        y8v y8vVar = this.h;
        if (y8vVar == null || y8vVar.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.d();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.drm.DrmSession$DrmSessionException */
    public final void w() throws DrmSession.DrmSessionException {
        y8v y8vVar = this.h;
        if (y8vVar == null || y8vVar.getState() != 1) {
            return;
        }
        DrmSession.DrmSessionException drmSessionExceptionA = this.h.a();
        drmSessionExceptionA.getClass();
        throw drmSessionExceptionA;
    }

    public final void x(ie30 ie30Var, w2z w2zVar) {
        ie30 ie30Var2 = this.g;
        boolean z = ie30Var2 == null;
        x8v x8vVar = ie30Var2 == null ? null : ie30Var2.t;
        this.g = ie30Var;
        x8v x8vVar2 = ie30Var.t;
        f9v f9vVar = this.d;
        w2zVar.c = f9vVar != null ? ie30Var.b(f9vVar.g(ie30Var)) : ie30Var;
        w2zVar.b = this.h;
        if (f9vVar == null) {
            return;
        }
        if (z || !Objects.equals(x8vVar, x8vVar2)) {
            y8v y8vVar = this.h;
            b9v b9vVar = this.e;
            y8v y8vVarI = f9vVar.i(b9vVar, ie30Var);
            this.h = y8vVarI;
            w2zVar.b = y8vVarI;
            if (y8vVar != null) {
                y8vVar.c(b9vVar);
            }
        }
    }

    public final synchronized long y() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.f101p ? this.j[q(this.s)] : this.F;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    public final int z(w2z w2zVar, gar garVar, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        qjb qjbVar = this.b;
        synchronized (this) {
            garVar.e = false;
            int iP = p();
            int i3 = this.x;
            boolean z3 = i3 != -1 && iP >= i3;
            i2 = -5;
            if (this.s != this.f101p) {
                if ((i3 == -1 && this.y != -1 && p() >= this.y) || z3) {
                    if (z) {
                    }
                    ((oac) garVar).a = 4;
                    garVar.f = Long.MIN_VALUE;
                    i2 = -4;
                } else {
                    ie30 ie30Var = ((l541) this.c.a(iP)).a;
                    if (z2 || ie30Var != this.g) {
                        x(ie30Var, w2zVar);
                    } else {
                        int iQ = q(this.s);
                        if (v(iQ)) {
                            ((oac) garVar).a = this.m[iQ];
                            if (this.s == this.f101p - 1 && (z || this.z)) {
                                garVar.e(536870912);
                            }
                            garVar.f = this.n[iQ];
                            qjbVar.a = this.l[iQ];
                            qjbVar.b = this.k[iQ];
                            qjbVar.c = this.o[iQ];
                            i2 = -4;
                        } else {
                            garVar.e = true;
                            i2 = -3;
                        }
                    }
                }
            } else if (!z || this.z || z3) {
                ((oac) garVar).a = 4;
                garVar.f = Long.MIN_VALUE;
                i2 = -4;
            } else {
                ie30 ie30Var2 = this.E;
                if (ie30Var2 == null || (!z2 && ie30Var2 == this.g)) {
                    i2 = -3;
                } else {
                    x(ie30Var2, w2zVar);
                }
            }
        }
        if (i2 == -4 && !garVar.f(4)) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                fo00 fo00Var = this.a;
                qjb qjbVar2 = this.b;
                if (z4) {
                    fo00.f((z1c) fo00Var.f, garVar, qjbVar2, (izr0) fo00Var.d);
                } else {
                    fo00Var.f = fo00.f((z1c) fo00Var.f, garVar, qjbVar2, (izr0) fo00Var.d);
                }
            }
            if (!z4) {
                this.s++;
            }
        }
        return i2;
    }
}
