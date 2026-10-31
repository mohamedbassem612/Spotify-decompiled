package p;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qk60 extends tjh0 {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public fdc C;
    public rl60 D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public b380 I;
    public boolean J;
    public long K;
    public boolean L;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o2r f121p;
    public final n3r q;
    public final fdc r;
    public final boolean s;
    public final boolean t;
    public final yve1 u;
    public final d1s v;
    public final List w;
    public final x8v x;
    public final zl70 y;
    public final izr0 z;

    public qk60(d1s d1sVar, o2r o2rVar, n3r n3rVar, ie30 ie30Var, boolean z, o2r o2rVar2, n3r n3rVar2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, yve1 yve1Var, x8v x8vVar, fdc fdcVar, zl70 zl70Var, izr0 izr0Var, boolean z6, boolean z7, dbu0 dbu0Var, String str) {
        super(o2rVar, n3rVar, ie30Var, i, obj, j, j2, j3, str);
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : -9223372036854775807L;
        this.l = i3;
        this.q = n3rVar2;
        this.f121p = o2rVar2;
        this.F = n3rVar2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = yve1Var;
        this.t = z4;
        this.v = d1sVar;
        this.w = list;
        this.x = x8vVar;
        this.r = fdcVar;
        this.y = zl70Var;
        this.z = izr0Var;
        this.L = z6;
        this.n = z7;
        w280 w280Var = b380.b;
        this.I = bg11.e;
        this.k = M.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (eth.W(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // p.f9e0
    public final void a() {
        fdc fdcVar;
        this.D.getClass();
        if (this.C == null && (fdcVar = this.r) != null) {
            ec10 ec10Var = (ec10) fdcVar.c;
            if ((ec10Var instanceof uwg1) || (ec10Var instanceof pj30)) {
                this.C = fdcVar;
                this.F = false;
            }
        }
        n3r n3rVar = this.q;
        o2r o2rVar = this.f121p;
        if (this.F) {
            o2rVar.getClass();
            n3rVar.getClass();
            e(o2rVar, n3rVar, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            e(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // p.f9e0
    public final void b() {
        this.G = true;
    }

    public final void e(o2r o2rVar, n3r n3rVar, boolean z, boolean z2) {
        n3r n3rVarD;
        boolean z3;
        long j;
        int i = this.E;
        if (z) {
            z3 = i != 0;
            n3rVarD = n3rVar;
        } else {
            n3rVarD = n3rVar.d(i);
            z3 = false;
        }
        try {
            uyr uyrVarI = i(o2rVar, n3rVarD, z2);
            if (z3) {
                uyrVarI.b(this.E, false);
            }
            while (!this.G && ((ec10) this.C.c).c(uyrVarI, fdc.g) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & TlsSocketProvider.READ_BUFFER_SIZE) == 0) {
                            throw e;
                        }
                        ((ec10) this.C.c).a(0L, 0L);
                        j = uyrVarI.d;
                    }
                } catch (Throwable th) {
                    this.E = (int) (uyrVarI.d - n3rVar.f);
                    throw th;
                }
            }
            j = uyrVarI.d;
            this.E = (int) (j - n3rVar.f);
            n3p1.k(o2rVar);
        } catch (Throwable th2) {
            n3p1.k(o2rVar);
            throw th2;
        }
    }

    public final int g(int i) {
        dm5.y(!this.L);
        if (i >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i)).intValue();
    }

    public final boolean h() {
        return this.K != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x034f  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:208:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, p.ec10] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v26 */
    public final uyr i(o2r o2rVar, n3r n3rVar, boolean z) throws IOException {
        int i;
        uyr uyrVar;
        long jY;
        long j;
        fdc fdcVar;
        fdc fdcVar2;
        Object taVar;
        ?? pj30Var;
        boolean zD;
        khc khcVar;
        int i2;
        int i3;
        ?? r29;
        boolean z2;
        Object ipm0Var;
        rij0 rij0Var;
        long jT = o2rVar.t(n3rVar);
        long j2 = this.g;
        yve1 yve1Var = this.u;
        if (z) {
            try {
                yve1Var.g(j2, this.s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        uyr uyrVar2 = new uyr(o2rVar, n3rVar.f, jT);
        int i4 = 1;
        int i5 = 0;
        if (this.C == null) {
            izr0 izr0Var = this.z;
            uyrVar2.f = 0;
            try {
                izr0Var.O(10);
                uyrVar2.d(izr0Var.a, 0, 10, false);
                if (izr0Var.H() != 4801587) {
                    jY = -9223372036854775807L;
                    uyrVar = null;
                } else {
                    izr0Var.S(3);
                    int iD = izr0Var.D();
                    int i6 = iD + 10;
                    byte[] bArr = izr0Var.a;
                    if (i6 > bArr.length) {
                        izr0Var.O(i6);
                        System.arraycopy(bArr, 0, izr0Var.a, 0, 10);
                    }
                    uyrVar2.d(izr0Var.a, 10, iD, false);
                    hjj0 hjj0VarT = this.y.t(izr0Var.a, iD);
                    if (hjj0VarT == null) {
                        jY = -9223372036854775807L;
                        uyrVar = null;
                    } else {
                        rij0[] rij0VarArr = hjj0VarT.a;
                        int length = rij0VarArr.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                uyrVar = null;
                                rij0Var = null;
                                break;
                            }
                            rij0 rij0Var2 = rij0VarArr[i7];
                            uyrVar = null;
                            if (how0.class.isAssignableFrom(rij0Var2.getClass())) {
                                rij0Var = (rij0) how0.class.cast(rij0Var2);
                                if (!((how0) rij0Var).b.equals("com.apple.streaming.transportStreamTimestamp")) {
                                    rij0Var = null;
                                }
                            } else {
                                rij0Var = null;
                            }
                            if (rij0Var != null) {
                                break;
                            }
                            i7++;
                        }
                        how0 how0Var = (how0) rij0Var;
                        if (how0Var == null) {
                            jY = -9223372036854775807L;
                        } else {
                            System.arraycopy(how0Var.c, 0, izr0Var.a, 0, 8);
                            izr0Var.R(0);
                            izr0Var.Q(8);
                            jY = izr0Var.y() & 8589934591L;
                        }
                    }
                }
            } catch (EOFException unused2) {
                uyrVar = null;
            }
            uyrVar2.f = 0;
            fdc fdcVar3 = this.r;
            if (fdcVar3 != null) {
                yve1 yve1Var2 = (yve1) fdcVar3.e;
                ec10 ec10Var = (ec10) fdcVar3.c;
                dm5.y(!((ec10Var instanceof uwg1) || (ec10Var instanceof pj30)));
                if (ec10Var instanceof aml1) {
                    ipm0Var = new aml1(((ie30) fdcVar3.d).d, yve1Var2, (jqc1) fdcVar3.f, fdcVar3.b);
                } else if (ec10Var instanceof p72) {
                    ipm0Var = new p72(0);
                } else if (ec10Var instanceof ta) {
                    ipm0Var = new ta();
                } else if (ec10Var instanceof va) {
                    ipm0Var = new va();
                } else {
                    if (!(ec10Var instanceof ipm0)) {
                        eg.m("Unexpected extractor type for recreation: ".concat(ec10Var.getClass().getSimpleName()));
                        return uyrVar;
                    }
                    ipm0Var = new ipm0(0);
                }
                fdcVar2 = new fdc(ipm0Var, fdcVar3.d, (Object) yve1Var2, fdcVar3.f, fdcVar3.b, (byte) 0);
                i = 0;
                j2 = j2;
                j = 0;
            } else {
                Uri uri = n3rVar.a;
                Map mapE = o2rVar.e();
                d1s d1sVar = this.v;
                d1sVar.getClass();
                ie30 ie30Var = this.d;
                int iY = jhc1.y(ie30Var.f66p);
                List list = (List) mapE.get("Content-Type");
                int iY2 = jhc1.y((String) ((list == null || list.isEmpty()) ? uyrVar : (String) list.get(0)));
                int iZ = jhc1.z(uri);
                int i8 = 7;
                ArrayList arrayList = new ArrayList(7);
                d1s.b(iY, arrayList);
                d1s.b(iY2, arrayList);
                d1s.b(iZ, arrayList);
                for (int i9 = 0; i9 < 7; i9++) {
                    d1s.b(d1s.d[i9], arrayList);
                }
                uyrVar2.f = 0;
                ?? r16 = uyrVar;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        i = i5;
                        j2 = j2;
                        j = 0;
                        r16.getClass();
                        fdcVar = new fdc((Object) r16, (Object) ie30Var, (Object) yve1Var, d1sVar.c, d1sVar.a, (byte) 0);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i10)).intValue();
                    try {
                        if (iIntValue == 0) {
                            j = 0;
                            taVar = new ta();
                        } else if (iIntValue == i4) {
                            j = 0;
                            taVar = new va();
                        } else if (iIntValue != 2) {
                            if (iIntValue != i8) {
                                List listSingletonList = this.w;
                                khc khcVar2 = jqc1.o0;
                                if (iIntValue == 8) {
                                    i10 = i10;
                                    j2 = j2;
                                    iIntValue = iIntValue;
                                    ie30Var = ie30Var;
                                    iY = iY;
                                    arrayList = arrayList;
                                    j = 0;
                                    i8 = 7;
                                    khc khcVar3 = (sjb) d1sVar.c;
                                    boolean z3 = d1sVar.a;
                                    byte b = d1sVar.b;
                                    if (z3) {
                                        khcVar = khcVar3;
                                        i2 = 4;
                                    } else {
                                        i2 = 36;
                                        khcVar = khcVar2;
                                    }
                                    int iF = i2 | pj30.f(b);
                                    if (listSingletonList == null) {
                                        w280 w280Var = b380.b;
                                        listSingletonList = bg11.e;
                                    }
                                    pj30Var = new pj30(khcVar, iF, yve1Var, listSingletonList);
                                } else if (iIntValue == 11) {
                                    i10 = i10;
                                    khc khcVar4 = (sjb) d1sVar.c;
                                    boolean z4 = d1sVar.a;
                                    if (listSingletonList != null) {
                                        i3 = 48;
                                    } else {
                                        ge30 ge30Var = new ge30();
                                        ge30Var.o = asj0.p("application/cea-608");
                                        listSingletonList = Collections.singletonList(new ie30(ge30Var));
                                        i3 = 16;
                                    }
                                    String str = ie30Var.l;
                                    if (TextUtils.isEmpty(str)) {
                                        r29 = z4;
                                    } else {
                                        z2 = z4;
                                        if (asj0.c(str, "audio/mp4a-latm") == null) {
                                            i3 |= 2;
                                        }
                                        r29 = z2;
                                        if (asj0.c(str, "video/avc") == null) {
                                            i3 |= 4;
                                        }
                                    }
                                    if (r29 != 0) {
                                        r29 = z2;
                                        khcVar2 = khcVar4;
                                    }
                                    r29 = z2;
                                    iIntValue = iIntValue;
                                    arrayList = arrayList;
                                    j2 = j2;
                                    ie30Var = ie30Var;
                                    j = 0;
                                    i8 = 7;
                                    iY = iY;
                                    yve1 yve1Var3 = yve1Var;
                                    yve1Var = yve1Var3;
                                    pj30Var = new uwg1(2, r29 ^ 1, khcVar2, yve1Var3, new yxs(i3, listSingletonList));
                                } else if (iIntValue != 13) {
                                    i10 = i10;
                                    j2 = j2;
                                    iIntValue = iIntValue;
                                    ie30Var = ie30Var;
                                    iY = iY;
                                    arrayList = arrayList;
                                    j = 0;
                                    i8 = 7;
                                    pj30Var = uyrVar;
                                } else {
                                    i10 = i10;
                                    pj30Var = new aml1(ie30Var.d, yve1Var, (sjb) d1sVar.c, d1sVar.a);
                                    j2 = j2;
                                    iIntValue = iIntValue;
                                    ie30Var = ie30Var;
                                    iY = iY;
                                    arrayList = arrayList;
                                    j = 0;
                                    i8 = 7;
                                }
                            } else {
                                j = 0;
                                taVar = new ipm0(0L);
                            }
                            pj30Var.getClass();
                            zD = pj30Var.d(uyrVar2);
                            i = 0;
                            uyrVar2.f = 0;
                            if (zD) {
                                fdcVar = new fdc((Object) pj30Var, (Object) ie30Var, (Object) yve1Var, d1sVar.c, d1sVar.a, (byte) 0);
                                break;
                            }
                            ie30Var = ie30Var;
                            if (r16 != 0 && (iIntValue == iY || iIntValue == iY2 || iIntValue == iZ || iIntValue == 11)) {
                                r16 = pj30Var;
                            }
                            i10++;
                            iY = iY;
                            j2 = j2;
                            arrayList = arrayList;
                            i8 = i8;
                            i5 = i;
                            i4 = 1;
                            r16 = r16;
                        } else {
                            j = 0;
                            taVar = new p72(0);
                        }
                        zD = pj30Var.d(uyrVar2);
                        i = 0;
                        uyrVar2.f = 0;
                    } catch (EOFException unused3) {
                        i = 0;
                        uyrVar2.f = 0;
                        zD = false;
                    } catch (Throwable th) {
                        uyrVar2.f = 0;
                        throw th;
                    }
                    pj30Var = taVar;
                    pj30Var.getClass();
                    if (zD) {
                        fdcVar = new fdc((Object) pj30Var, (Object) ie30Var, (Object) yve1Var, d1sVar.c, d1sVar.a, (byte) 0);
                        break;
                    }
                    ie30Var = ie30Var;
                    if (r16 != 0) {
                    }
                    i10++;
                    iY = iY;
                    j2 = j2;
                    arrayList = arrayList;
                    i8 = i8;
                    i5 = i;
                    i4 = 1;
                    r16 = r16;
                }
                fdcVar2 = fdcVar;
            }
            fdc fdcVar4 = fdcVar2;
            this.C = fdcVar4;
            ec10 ec10Var2 = (ec10) fdcVar4.c;
            if ((ec10Var2 instanceof p72) || (ec10Var2 instanceof ta) || (ec10Var2 instanceof va) || (ec10Var2 instanceof ipm0)) {
                rl60 rl60Var = this.D;
                long jB = jY != -9223372036854775807L ? yve1Var.b(jY) : j2;
                if (rl60Var.w1 != jB) {
                    rl60Var.w1 = jB;
                    ql60[] ql60VarArr = rl60Var.V0;
                    int length2 = ql60VarArr.length;
                    for (int i11 = i; i11 < length2; i11++) {
                        ql60 ql60Var = ql60VarArr[i11];
                        if (ql60Var.I != jB) {
                            ql60Var.I = jB;
                            ql60Var.C = true;
                        }
                    }
                }
            } else {
                rl60 rl60Var2 = this.D;
                if (rl60Var2.w1 != j) {
                    rl60Var2.w1 = j;
                    ql60[] ql60VarArr2 = rl60Var2.V0;
                    int length3 = ql60VarArr2.length;
                    for (int i12 = i; i12 < length3; i12++) {
                        ql60 ql60Var2 = ql60VarArr2[i12];
                        if (ql60Var2.I != j) {
                            ql60Var2.I = j;
                            ql60Var2.C = true;
                        }
                    }
                }
            }
            this.D.X0.clear();
            ((ec10) this.C.c).b(this.D);
        } else {
            i = 0;
        }
        rl60 rl60Var3 = this.D;
        x8v x8vVar = rl60Var3.x1;
        x8v x8vVar2 = this.x;
        if (!Objects.equals(x8vVar, x8vVar2)) {
            rl60Var3.x1 = x8vVar2;
            int i13 = i;
            while (true) {
                ql60[] ql60VarArr3 = rl60Var3.V0;
                if (i13 >= ql60VarArr3.length) {
                    break;
                }
                if (rl60Var3.o1[i13]) {
                    ql60 ql60Var3 = ql60VarArr3[i13];
                    ql60Var3.L = x8vVar2;
                    ql60Var3.C = true;
                }
                i13++;
            }
        }
        return uyrVar2;
    }
}
