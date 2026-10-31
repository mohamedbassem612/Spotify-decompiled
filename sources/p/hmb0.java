package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hmb0 implements wvj, txq0, hzj {
    public static final vn31 s1 = new vn31("Undefined intrinsics block and it is required", 1);
    public static final n4k t1 = new n4k(12);
    public static final emb0 u1 = new emb0();
    public static final fhn v1 = new fhn(3);
    public hmb0 N0;
    public oxq0 O0;
    public k75 P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public o161 T0;
    public boolean U0;
    public final bfn0 V0;
    public boolean W0;
    public final drj0 X;
    public gfh0 X0;
    public bfn0 Y;
    public x390 Y0;
    public boolean Z;
    public wat Z0;
    public final boolean a;
    public flb0 a1;
    public int b;
    public e8k1 b1;
    public boolean c;
    public m4k c1;
    public long d;
    public boolean d1;
    public boolean e;
    public final jdo0 e1;
    public boolean f;
    public final lmb0 f1;
    public int g;
    public vmb0 g1;
    public boolean h;
    public ndo0 h1;
    public hmb0 i;
    public boolean i1;
    public qim0 j1;
    public qim0 k1;
    public e75 l1;
    public f75 m1;
    public boolean n1;
    public int o1;
    public boolean p1;
    public int q1;
    public int r1;
    public int t;

    public hmb0(int i, boolean z) {
        this.a = z;
        this.b = i;
        this.d = 9223372034707292159L;
        this.e = true;
        this.f = true;
        this.g = -4;
        this.X = new drj0(new bfn0(0, new hmb0[16]), new g24(this, (byte) 4), (byte) 7);
        this.V0 = new bfn0(0, new hmb0[16]);
        this.W0 = true;
        this.X0 = s1;
        this.Z0 = kmb0.a;
        this.a1 = flb0.a;
        this.b1 = u1;
        m4k.B.getClass();
        this.c1 = l4k.b;
        this.q1 = 3;
        this.r1 = 3;
        this.e1 = new jdo0(this);
        this.f1 = new lmb0(this);
        this.i1 = true;
        this.j1 = nim0.a;
    }

    public static void U(hmb0 hmb0Var, boolean z, int i) {
        hmb0 hmb0VarV;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (hmb0Var.i == null) {
            qf80.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        oxq0 oxq0Var = hmb0Var.O0;
        if (oxq0Var == null || hmb0Var.R0 || hmb0Var.a) {
            return;
        }
        ((ha4) oxq0Var).y(hmb0Var, true, z, z2);
        if (z3) {
            c6f0 c6f0Var = hmb0Var.f1.q;
            c6f0Var.getClass();
            lmb0 lmb0Var = c6f0Var.f;
            hmb0 hmb0VarV2 = lmb0Var.a.v();
            int i2 = lmb0Var.a.q1;
            if (hmb0VarV2 == null || i2 == 3) {
                return;
            }
            while (hmb0VarV2.q1 == i2 && (hmb0VarV = hmb0VarV2.v()) != null) {
                hmb0VarV2 = hmb0VarV;
            }
            int iC = l1d.C(i2);
            if (iC == 0) {
                if (hmb0VarV2.i != null) {
                    U(hmb0VarV2, z, 6);
                    return;
                } else {
                    W(hmb0VarV2, z, 6);
                    return;
                }
            }
            if (iC != 1) {
                eg.m("Intrinsics isn't used by the parent");
            } else if (hmb0VarV2.i != null) {
                hmb0VarV2.T(z);
            } else {
                hmb0VarV2.V(z);
            }
        }
    }

    public static void W(hmb0 hmb0Var, boolean z, int i) {
        oxq0 oxq0Var;
        hmb0 hmb0VarV;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (hmb0Var.R0 || hmb0Var.a || (oxq0Var = hmb0Var.O0) == null) {
            return;
        }
        ((ha4) oxq0Var).y(hmb0Var, false, z, z2);
        if (z3) {
            lmb0 lmb0Var = hmb0Var.f1.f68p.f;
            hmb0 hmb0VarV2 = lmb0Var.a.v();
            int i2 = lmb0Var.a.q1;
            if (hmb0VarV2 == null || i2 == 3) {
                return;
            }
            while (hmb0VarV2.q1 == i2 && (hmb0VarV = hmb0VarV2.v()) != null) {
                hmb0VarV2 = hmb0VarV;
            }
            int iC = l1d.C(i2);
            if (iC == 0) {
                W(hmb0VarV2, z, 6);
            } else if (iC == 1) {
                hmb0VarV2.V(z);
            } else {
                eg.m("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void X(hmb0 hmb0Var) {
        lmb0 lmb0Var = hmb0Var.f1;
        if (gmb0.a[l1d.C(lmb0Var.d)] != 1) {
            eg.m("Unexpected state ".concat(kaa0.p(lmb0Var.d)));
            return;
        }
        if (lmb0Var.e) {
            U(hmb0Var, true, 6);
            return;
        }
        if (lmb0Var.f) {
            hmb0Var.T(true);
        }
        if (hmb0Var.r()) {
            W(hmb0Var, true, 6);
        } else if (hmb0Var.q()) {
            hmb0Var.V(true);
        }
    }

    private final String k(hmb0 hmb0Var) {
        String strH = h(0);
        hmb0 hmb0Var2 = hmb0Var.N0;
        return "Cannot insert " + hmb0Var + " because it already has a parent or an owner. This tree: " + strH + " Other tree: " + (hmb0Var2 != null ? hmb0Var2.h(0) : null);
    }

    public final bfn0 A() {
        g0();
        if (this.t == 0) {
            return this.X.i();
        }
        bfn0 bfn0Var = this.Y;
        bfn0Var.getClass();
        return bfn0Var;
    }

    public final void B(long j, gk60 gk60Var, int i, boolean z) {
        jdo0 jdo0Var = this.e1;
        ndo0 ndo0Var = (ndo0) jdo0Var.e;
        ia4 ia4Var = ndo0.x1;
        ((ndo0) jdo0Var.e).r1(a6o1.m(), ndo0Var.b1(j, true), gk60Var, i, z);
    }

    @Override // p.txq0
    public final boolean B0() {
        return I();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void C(int i, hmb0 hmb0Var) throws KotlinNothingValueException {
        if (hmb0Var.N0 != null && hmb0Var.O0 != null) {
            qf80.c(k(hmb0Var));
        }
        hmb0Var.N0 = this;
        this.X.a(i, hmb0Var);
        P();
        if (hmb0Var.a) {
            this.t++;
        }
        H();
        oxq0 oxq0Var = this.O0;
        if (oxq0Var != null) {
            hmb0Var.e(oxq0Var);
        }
        if (hmb0Var.f1.l > 0) {
            lmb0 lmb0Var = this.f1;
            lmb0Var.d(lmb0Var.l + 1);
        }
        if (hmb0Var.o1 > 0) {
            b0(this.o1 + 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void D() throws KotlinNothingValueException {
        if (this.i1) {
            jdo0 jdo0Var = this.e1;
            ndo0 ndo0Var = (sh80) jdo0Var.d;
            ndo0 ndo0Var2 = ((ndo0) jdo0Var.e).Y0;
            this.h1 = null;
            while (!u890.j(ndo0Var, ndo0Var2)) {
                if ((ndo0Var != null ? ndo0Var.v1 : null) != null) {
                    this.h1 = ndo0Var;
                    break;
                }
                ndo0Var = ndo0Var != null ? ndo0Var.Y0 : null;
            }
            this.i1 = false;
        }
        ndo0 ndo0Var3 = this.h1;
        if (ndo0Var3 != null && ndo0Var3.v1 == null) {
            throw l1d.w("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (ndo0Var3 != null) {
            ndo0Var3.u1();
            return;
        }
        hmb0 hmb0VarV = v();
        if (hmb0VarV != null) {
            hmb0VarV.D();
            return;
        }
        oxq0 oxq0Var = this.O0;
        if (oxq0Var != null) {
            ((ha4) oxq0Var).invalidate();
        }
    }

    public final void E() {
        jdo0 jdo0Var = this.e1;
        ndo0 ndo0Var = (ndo0) jdo0Var.e;
        sh80 sh80Var = (sh80) jdo0Var.d;
        while (ndo0Var != sh80Var) {
            cmb0 cmb0Var = (cmb0) ndo0Var;
            mxq0 mxq0Var = cmb0Var.v1;
            if (mxq0Var != null) {
                ((ge50) mxq0Var).c();
            }
            ndo0Var = cmb0Var.X0;
        }
        mxq0 mxq0Var2 = sh80Var.v1;
        if (mxq0Var2 != null) {
            ((ge50) mxq0Var2).c();
        }
    }

    public final void F() {
        if (this.a) {
            hmb0 hmb0VarV = v();
            if (hmb0VarV != null) {
                hmb0VarV.F();
                return;
            }
            return;
        }
        if (this.i != null) {
            U(this, false, 7);
        } else {
            W(this, false, 7);
        }
    }

    public final void G() {
        if (this.U0) {
            return;
        }
        if (((ido0) this.e1.c).f != null || this.k1 != null) {
            this.S0 = true;
            return;
        }
        o161 o161Var = this.T0;
        this.U0 = true;
        p811 p811Var = new p811();
        p811Var.a = new o161();
        uxq0 snapshotObserver = ((ha4) kmb0.a(this)).getSnapshotObserver();
        Function0 qga0Var = new qga0(this, p811Var, (byte) 1);
        snapshotObserver.a.d(this, snapshotObserver.d, qga0Var);
        this.U0 = false;
        this.T0 = (o161) p811Var.a;
        this.S0 = false;
        ha4 ha4Var = (ha4) kmb0.a(this);
        ha4Var.getSemanticsOwner().b(this, o161Var);
        ha4Var.A();
    }

    public final void H() {
        hmb0 hmb0Var;
        if (this.t > 0) {
            this.Z = true;
        }
        if (!this.a || (hmb0Var = this.N0) == null) {
            return;
        }
        hmb0Var.H();
    }

    public final boolean I() {
        return this.O0 != null;
    }

    public final boolean J() {
        return this.f1.f68p.S0;
    }

    public final Boolean K() {
        c6f0 c6f0Var = this.f1.q;
        if (c6f0Var != null) {
            return Boolean.valueOf(c6f0Var.R0 != 3);
        }
        return null;
    }

    public final void L() {
        hmb0 hmb0VarV;
        if (this.q1 == 3) {
            g();
        }
        c6f0 c6f0Var = this.f1.q;
        c6f0Var.getClass();
        boolean z = true;
        try {
            c6f0Var.g = true;
            if (!c6f0Var.Y) {
                qf80.c("replace() called on item that was not placed");
            }
            c6f0Var.c1 = false;
            if (c6f0Var.R0 == 3) {
                z = false;
            }
            c6f0Var.y0(c6f0Var.O0, c6f0Var.P0, c6f0Var.Q0);
            if (z && !c6f0Var.c1 && (hmb0VarV = c6f0Var.f.a.v()) != null) {
                hmb0VarV.T(false);
            }
        } finally {
            c6f0Var.g = false;
        }
    }

    public final void M(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            drj0 drj0Var = this.X;
            drj0Var.a(i6, (hmb0) drj0Var.k(i5));
        }
        P();
        H();
        F();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void N(hmb0 hmb0Var) throws KotlinNothingValueException {
        if (hmb0Var.f1.l > 0) {
            lmb0 lmb0Var = this.f1;
            lmb0Var.d(lmb0Var.l - 1);
        }
        if (this.O0 != null) {
            hmb0Var.i();
        }
        hmb0Var.N0 = null;
        if (hmb0Var.o1 > 0) {
            b0(this.o1 - 1);
        }
        ((ndo0) hmb0Var.e1.e).Y0 = null;
        if (hmb0Var.a) {
            this.t--;
            bfn0 bfn0VarI = hmb0Var.X.i();
            Object[] objArr = bfn0VarI.a;
            int i = bfn0VarI.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((ndo0) ((hmb0) objArr[i2]).e1.e).Y0 = null;
            }
        }
        H();
        P();
    }

    public final void O(ndo0 ndo0Var) {
        oxq0 oxq0Var = this.O0;
        q511 rectManager = oxq0Var != null ? ((ha4) oxq0Var).getRectManager() : null;
        lmb0 lmb0Var = this.f1;
        boolean z = lmb0Var.d != 5 || r() || q();
        if (this.g != -4 && rectManager != null) {
            if (ndo0Var == ((ndo0) this.e1.e)) {
                this.f = true;
                if (!z) {
                    rectManager.g(this);
                }
            } else {
                this.e = true;
                bfn0 bfn0VarA = A();
                Object[] objArr = bfn0VarA.a;
                int i = bfn0VarA.c;
                for (int i2 = 0; i2 < i; i2++) {
                    hmb0 hmb0Var = (hmb0) objArr[i2];
                    hmb0Var.f = true;
                    if (!z) {
                        rectManager.g(hmb0Var);
                    }
                }
                if (this.g != -4) {
                    rectManager.f = true;
                    int iD = rectManager.d(this);
                    long[] jArr = (long[]) rectManager.c.c;
                    int i3 = iD + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                rectManager.j();
            }
        }
        lmb0Var.f68p.A0();
    }

    public final void P() {
        if (!this.a) {
            this.W0 = true;
            return;
        }
        hmb0 hmb0VarV = v();
        if (hmb0VarV != null) {
            hmb0VarV.P();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void Q() throws KotlinNothingValueException {
        drj0 drj0Var = this.X;
        int i = drj0Var.i().c;
        while (true) {
            i--;
            if (-1 >= i) {
                drj0Var.f();
                return;
            }
            N((hmb0) drj0Var.i().a[i]);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void R(int i, int i2) throws KotlinNothingValueException {
        if (i2 < 0) {
            qf80.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            drj0 drj0Var = this.X;
            N((hmb0) drj0Var.i().a[i3]);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void S() {
        hmb0 hmb0VarV;
        if (this.q1 == 3) {
            g();
        }
        ffh0 ffh0Var = this.f1.f68p;
        lmb0 lmb0Var = ffh0Var.f;
        try {
            ffh0Var.g = true;
            if (!ffh0Var.X) {
                qf80.c("replace called on unplaced item");
            }
            boolean z = ffh0Var.S0;
            ffh0Var.x0(ffh0Var.Z, ffh0Var.P0, ffh0Var.N0, ffh0Var.O0);
            if (z && !ffh0Var.f1 && (hmb0VarV = lmb0Var.a.v()) != null) {
                hmb0VarV.V(false);
            }
            ffh0Var.g = false;
        } catch (Throwable th) {
            try {
                lmb0Var.a.Z(th);
                throw null;
            } catch (Throwable th2) {
                ffh0Var.g = false;
                throw th2;
            }
        }
    }

    public final void T(boolean z) {
        oxq0 oxq0Var;
        if (this.a || (oxq0Var = this.O0) == null) {
            return;
        }
        ((ha4) oxq0Var).z(this, true, z);
    }

    public final void V(boolean z) {
        oxq0 oxq0Var;
        if (this.a || (oxq0Var = this.O0) == null) {
            return;
        }
        ((ha4) oxq0Var).z(this, false, z);
    }

    public final void Y() {
        bfn0 bfn0VarA = A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var = (hmb0) objArr[i2];
            int i3 = hmb0Var.r1;
            hmb0Var.q1 = i3;
            if (i3 != 3) {
                hmb0Var.Y();
            }
        }
    }

    public final void Z(Throwable th) throws Throwable {
        m4k m4kVar = this.c1;
        kiv kivVarA = z3k.a();
        xos0 xos0Var = (xos0) m4kVar;
        xos0Var.getClass();
        y3k y3kVar = (y3k) d7e.x(xos0Var, kivVarA);
        if (y3kVar == null) {
            throw th;
        }
        jm5.r(th, new og(y3kVar, this, (byte) 18));
        throw th;
    }

    @Override // p.wvj
    public final void a() {
        k75 k75Var = this.P0;
        if (k75Var != null) {
            k75Var.a();
        }
        vmb0 vmb0Var = this.g1;
        if (vmb0Var != null) {
            vmb0Var.a();
        }
        jdo0 jdo0Var = this.e1;
        ndo0 ndo0Var = ((sh80) jdo0Var.d).X0;
        for (ndo0 ndo0Var2 = (ndo0) jdo0Var.e; !u890.j(ndo0Var2, ndo0Var) && ndo0Var2 != null; ndo0Var2 = ndo0Var2.X0) {
            ndo0Var2.z1();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void a0(wat watVar) throws KotlinNothingValueException {
        if (u890.j(this.Z0, watVar)) {
            return;
        }
        this.Z0 = watVar;
        F();
        hmb0 hmb0VarV = v();
        if (hmb0VarV != null) {
            hmb0VarV.D();
        } else {
            oxq0 oxq0Var = this.O0;
            if (oxq0Var != null) {
                ((ha4) oxq0Var).invalidate();
            }
        }
        E();
        for (pim0 pim0Var = (pim0) this.e1.g; pim0Var != null; pim0Var = pim0Var.f) {
            pim0Var.i();
        }
    }

    @Override // p.wvj
    public final void b() {
        m74 m74VarM28getAutofillManager;
        k75 k75Var = this.P0;
        if (k75Var != null) {
            k75Var.b();
        }
        vmb0 vmb0Var = this.g1;
        if (vmb0Var != null) {
            vmb0Var.j(true);
        }
        this.p1 = true;
        pim0 pim0Var = (gpd1) this.e1.f;
        for (pim0 pim0Var2 = pim0Var; pim0Var2 != null; pim0Var2 = pim0Var2.e) {
            if (pim0Var2.N0) {
                pim0Var2.C1();
            }
        }
        for (pim0 pim0Var3 = pim0Var; pim0Var3 != null; pim0Var3 = pim0Var3.e) {
            if (pim0Var3.N0) {
                pim0Var3.E1();
            }
        }
        while (pim0Var != null) {
            if (pim0Var.N0) {
                pim0Var.y1();
            }
            pim0Var = pim0Var.e;
        }
        if (I()) {
            this.T0 = null;
            this.S0 = false;
        }
        oxq0 oxq0Var = this.O0;
        if (oxq0Var != null) {
            ha4 ha4Var = (ha4) oxq0Var;
            if (ha4.c() && (m74VarM28getAutofillManager = ha4Var.getAutofillManager()) != null && m74VarM28getAutofillManager.h.g(this.b)) {
                m74VarM28getAutofillManager.a.f(m74VarM28getAutofillManager.c, this.b, false);
            }
        }
    }

    public final void b0(int i) {
        hmb0 hmb0VarV;
        hmb0 hmb0VarV2;
        int i2 = this.o1;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (hmb0VarV2 = v()) != null) {
                hmb0VarV2.b0(hmb0VarV2.o1 + 1);
            }
            if (i == 0 && this.o1 > 0 && (hmb0VarV = v()) != null) {
                hmb0VarV.b0(hmb0VarV.o1 - 1);
            }
            this.o1 = i;
        }
    }

    @Override // p.wvj
    public final void c() {
        q511 rectManager;
        m74 m74VarM28getAutofillManager;
        q511 rectManager2;
        if (!I()) {
            qf80.a("onReuse is only expected on attached node");
        }
        k75 k75Var = this.P0;
        if (k75Var != null) {
            k75Var.c();
        }
        vmb0 vmb0Var = this.g1;
        if (vmb0Var != null) {
            vmb0Var.j(false);
        }
        this.U0 = false;
        boolean z = this.p1;
        jdo0 jdo0Var = this.e1;
        if (z) {
            this.p1 = false;
        } else {
            pim0 pim0Var = (gpd1) jdo0Var.f;
            for (pim0 pim0Var2 = pim0Var; pim0Var2 != null; pim0Var2 = pim0Var2.e) {
                if (pim0Var2.N0) {
                    pim0Var2.C1();
                }
            }
            for (pim0 pim0Var3 = pim0Var; pim0Var3 != null; pim0Var3 = pim0Var3.e) {
                if (pim0Var3.N0) {
                    pim0Var3.E1();
                }
            }
            while (pim0Var != null) {
                if (pim0Var.N0) {
                    pim0Var.y1();
                }
                pim0Var = pim0Var.e;
            }
        }
        int i = this.b;
        oxq0 oxq0Var = this.O0;
        if (oxq0Var != null && (rectManager2 = ((ha4) oxq0Var).getRectManager()) != null) {
            rectManager2.h(this);
        }
        this.b = s161.a.addAndGet(1);
        oxq0 oxq0Var2 = this.O0;
        if (oxq0Var2 != null) {
            ha4 ha4Var = (ha4) oxq0Var2;
            ha4Var.m31getLayoutNodes().g(i);
            ha4Var.m31getLayoutNodes().i(this.b, this);
        }
        for (pim0 pim0Var4 = (pim0) jdo0Var.g; pim0Var4 != null; pim0Var4 = pim0Var4.f) {
            pim0Var4.x1();
        }
        jdo0Var.m();
        if (jdo0Var.k(8)) {
            G();
        }
        X(this);
        oxq0 oxq0Var3 = this.O0;
        if (oxq0Var3 != null) {
            ha4 ha4Var2 = (ha4) oxq0Var3;
            if (ha4.c() && (m74VarM28getAutofillManager = ha4Var2.getAutofillManager()) != null) {
                ha4 ha4Var3 = m74VarM28getAutofillManager.c;
                pct0 pct0Var = m74VarM28getAutofillManager.a;
                gdn0 gdn0Var = m74VarM28getAutofillManager.h;
                if (gdn0Var.g(i)) {
                    pct0Var.f(ha4Var3, i, false);
                }
                o161 o161VarX = x();
                if (o161VarX != null && i541.k(o161VarX)) {
                    gdn0Var.a(this.b);
                    pct0Var.f(ha4Var3, this.b, true);
                }
            }
        }
        oxq0 oxq0Var4 = this.O0;
        if (oxq0Var4 == null || (rectManager = ((ha4) oxq0Var4).getRectManager()) == null) {
            return;
        }
        rectManager.g(this);
    }

    public final void c0(hmb0 hmb0Var) {
        if (u890.j(hmb0Var, this.i)) {
            return;
        }
        this.i = hmb0Var;
        lmb0 lmb0Var = this.f1;
        if (hmb0Var != null) {
            if (lmb0Var.q == null) {
                lmb0Var.q = new c6f0(lmb0Var);
            }
            jdo0 jdo0Var = this.e1;
            ndo0 ndo0Var = ((sh80) jdo0Var.d).X0;
            for (ndo0 ndo0Var2 = (ndo0) jdo0Var.e; !u890.j(ndo0Var2, ndo0Var) && ndo0Var2 != null; ndo0Var2 = ndo0Var2.X0) {
                ndo0Var2.Y0();
            }
        } else {
            lmb0Var.q = null;
            lmb0Var.f = false;
            lmb0Var.e = false;
        }
        F();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(qim0 qim0Var) throws KotlinNothingValueException {
        wdn0 wdn0Var;
        wdn0 wdn0Var2;
        boolean z;
        jdo0 jdo0Var;
        jdo0 jdo0Var2;
        jdo0 jdo0Var3;
        wdn0 wdn0Var3;
        jdo0 jdo0Var4 = this.e1;
        boolean zK = jdo0Var4.k(16);
        pim0 pim0Var = (gpd1) jdo0Var4.f;
        boolean zK2 = jdo0Var4.k(1024);
        this.j1 = qim0Var;
        sh80 sh80Var = (sh80) jdo0Var4.d;
        hmb0 hmb0Var = (hmb0) jdo0Var4.b;
        pim0 pim0Var2 = (pim0) jdo0Var4.g;
        pim0 pim0Var3 = (ido0) jdo0Var4.c;
        if (pim0Var2 == pim0Var3) {
            qf80.c("padChain called on already padded chain");
        }
        pim0 pim0Var4 = (pim0) jdo0Var4.g;
        pim0Var4.e = pim0Var3;
        pim0Var3.f = pim0Var4;
        wdn0 wdn0Var4 = (wdn0) jdo0Var4.h;
        int i = wdn0Var4.b;
        hmb0 hmb0Var2 = hmb0Var;
        for (hmb0 hmb0VarV = hmb0Var.v(); hmb0VarV != null; hmb0VarV = hmb0VarV.v()) {
            hmb0Var2 = hmb0VarV;
        }
        jdo0 jdo0Var5 = hmb0Var2.e1;
        wdn0 wdn0Var5 = (wdn0) jdo0Var5.i;
        if (wdn0Var5 == null) {
            wdn0Var5 = new wdn0();
            jdo0Var5.i = wdn0Var5;
        }
        int i2 = wdn0Var5.b - 1;
        wdn0 wdn0Var6 = i2 >= 0 ? (wdn0) wdn0Var5.l(i2) : new wdn0();
        wdn0 wdn0Var7 = (wdn0) jdo0Var5.j;
        if (wdn0Var7 == null) {
            wdn0Var7 = new wdn0();
        }
        jdo0Var5.j = null;
        y4o1.q(qim0Var, wdn0Var6, wdn0Var7);
        int i3 = wdn0Var6.b;
        int i4 = 0;
        if (i3 == i) {
            pim0 pim0Var5 = pim0Var3.f;
            jdo0 jdo0Var6 = jdo0Var4;
            int i5 = 0;
            while (true) {
                if (pim0Var5 == null || i5 >= i) {
                    jdo0Var3 = jdo0Var6;
                    wdn0Var3 = wdn0Var4;
                    break;
                }
                oim0 oim0Var = (oim0) wdn0Var4.g(i5);
                jdo0Var3 = jdo0Var6;
                oim0 oim0Var2 = (oim0) wdn0Var6.g(i5);
                wdn0Var3 = wdn0Var4;
                int iS = y4o1.s(oim0Var, oim0Var2);
                if (iS == 0) {
                    pim0Var5 = pim0Var5.e;
                    break;
                }
                wdn0 wdn0Var8 = wdn0Var6;
                if (iS == 1) {
                    jdo0.p(oim0Var, oim0Var2, pim0Var5);
                }
                pim0Var5 = pim0Var5.f;
                i5++;
                jdo0Var6 = jdo0Var3;
                wdn0Var4 = wdn0Var3;
                wdn0Var6 = wdn0Var8;
            }
            pim0 pim0Var6 = pim0Var5;
            if (i5 >= i) {
                jdo0Var4 = jdo0Var3;
                wdn0Var4 = wdn0Var3;
                wdn0Var6 = wdn0Var6;
                jdo0Var2 = jdo0Var4;
                wdn0Var = wdn0Var4;
                pim0Var3 = pim0Var3;
                wdn0Var2 = wdn0Var6;
                z = false;
            } else {
                if (pim0Var6 == null) {
                    throw l1d.w("structuralUpdate requires a non-null tail");
                }
                boolean z2 = hmb0Var.k1 != null;
                jdo0 jdo0Var7 = jdo0Var3;
                wdn0Var = wdn0Var3;
                wdn0Var2 = wdn0Var6;
                jdo0Var7.n(i5, wdn0Var, wdn0Var2, pim0Var6, !z2);
                jdo0Var = jdo0Var7;
                z = true;
                jdo0Var2 = jdo0Var;
            }
        } else {
            qim0 qim0Var2 = hmb0Var.k1;
            if (qim0Var2 != null && i == 0) {
                pim0 pim0VarI = pim0Var3;
                for (int i6 = 0; i6 < wdn0Var6.b; i6++) {
                    pim0VarI = jdo0.i((oim0) wdn0Var6.g(i6), pim0VarI);
                }
                pim0 pim0Var7 = pim0Var.e;
                while (pim0Var7 != null && pim0Var7 != pim0Var3) {
                    int i7 = i4 | pim0Var7.c;
                    pim0Var7.d = i7;
                    pim0Var7 = pim0Var7.e;
                    i4 = i7;
                }
                jdo0Var = jdo0Var4;
                wdn0Var = wdn0Var4;
                wdn0Var2 = wdn0Var6;
                z = true;
                jdo0Var2 = jdo0Var;
            } else if (i3 == 0) {
                pim0 pim0Var8 = pim0Var3.f;
                for (int i8 = 0; pim0Var8 != null && i8 < wdn0Var4.b; i8++) {
                    pim0Var8 = jdo0.j(pim0Var8).f;
                }
                hmb0 hmb0VarV2 = hmb0Var.v();
                sh80Var.Y0 = hmb0VarV2 != null ? (sh80) hmb0VarV2.e1.d : null;
                jdo0Var4.e = sh80Var;
                jdo0Var2 = jdo0Var4;
                wdn0Var = wdn0Var4;
                pim0Var3 = pim0Var3;
                wdn0Var2 = wdn0Var6;
                z = false;
            } else {
                jdo0 jdo0Var8 = jdo0Var4;
                wdn0Var = wdn0Var4;
                pim0Var3 = pim0Var3;
                wdn0Var2 = wdn0Var6;
                jdo0Var8.n(0, wdn0Var, wdn0Var2, pim0Var3, (qim0Var2 != null ? 1 : 0) ^ 1);
                z = true;
                jdo0Var2 = jdo0Var8;
            }
        }
        jdo0Var2.h = wdn0Var2;
        wdn0Var.e();
        wdn0Var5.b(wdn0Var);
        wdn0Var7.e();
        jdo0Var5.j = wdn0Var7;
        pim0 pim0Var9 = pim0Var3.f;
        if (pim0Var9 != null) {
            pim0Var = pim0Var9;
        }
        pim0Var.e = null;
        pim0Var3.f = null;
        pim0Var3.d = -1;
        pim0Var3.h = null;
        if (pim0Var == pim0Var3) {
            qf80.c("trimChain did not update the head");
        }
        jdo0Var2.g = pim0Var;
        if (z) {
            jdo0Var2.o();
        }
        boolean zK3 = jdo0Var2.k(16);
        boolean zK4 = jdo0Var2.k(1024);
        this.f1.j();
        if (this.i == null && jdo0Var2.k(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS)) {
            c0(this);
        }
        if (zK == zK3 && zK2 == zK4) {
            return;
        }
        q511 rectManager = ((ha4) kmb0.a(this)).getRectManager();
        rectManager.getClass();
        if (!I() || this.g == -4) {
            return;
        }
        que0 que0Var = rectManager.c;
        int iD = rectManager.d(this);
        long[] jArr = (long[]) que0Var.c;
        int i9 = iD + 2;
        jArr[i9] = (jArr[i9] & (-6917529027641081857L)) | ((zK4 ? 1L : 0L) * 2305843009213693952L) | ((zK3 ? 1L : 0L) * 4611686018427387904L);
    }

    public final void d0(gfh0 gfh0Var) {
        if (u890.j(this.X0, gfh0Var)) {
            return;
        }
        this.X0 = gfh0Var;
        x390 x390Var = this.Y0;
        if (x390Var != null) {
            x390Var.A(gfh0Var);
        }
        F();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void e(oxq0 oxq0Var) throws KotlinNothingValueException {
        hmb0 hmb0Var;
        m74 m74VarM28getAutofillManager;
        o161 o161VarX;
        if (this.O0 != null) {
            qf80.c("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
        }
        hmb0 hmb0Var2 = this.N0;
        if (hmb0Var2 != null && !u890.j(hmb0Var2.O0, oxq0Var)) {
            hmb0 hmb0VarV = v();
            oxq0 oxq0Var2 = hmb0VarV != null ? hmb0VarV.O0 : null;
            String strH = h(0);
            hmb0 hmb0Var3 = this.N0;
            qf80.c("Attaching to a different owner(" + oxq0Var + ") than the parent's owner(" + oxq0Var2 + "). This tree: " + strH + " Parent tree: " + (hmb0Var3 != null ? hmb0Var3.h(0) : null));
        }
        hmb0 hmb0VarV2 = v();
        lmb0 lmb0Var = this.f1;
        if (hmb0VarV2 == null) {
            lmb0Var.f68p.S0 = true;
            ((ha4) oxq0Var).getRectManager().g(this);
            c6f0 c6f0Var = lmb0Var.q;
            if (c6f0Var != null) {
                c6f0Var.R0 = 1;
            }
        }
        jdo0 jdo0Var = this.e1;
        ((ndo0) jdo0Var.e).Y0 = hmb0VarV2 != null ? (sh80) hmb0VarV2.e1.d : null;
        this.O0 = oxq0Var;
        this.Q0 = (hmb0VarV2 != null ? hmb0VarV2.Q0 : -1) + 1;
        qim0 qim0Var = this.k1;
        if (qim0Var != null) {
            d(qim0Var);
        }
        this.k1 = null;
        ((ha4) oxq0Var).m31getLayoutNodes().i(this.b, this);
        if (this.h) {
            c0(this);
        } else {
            hmb0 hmb0Var4 = this.N0;
            if (hmb0Var4 == null || (hmb0Var = hmb0Var4.i) == null) {
                hmb0Var = this.i;
            }
            c0(hmb0Var);
            if (this.i == null && jdo0Var.k(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS)) {
                c0(this);
            }
        }
        if (!this.p1) {
            for (pim0 pim0Var = (pim0) jdo0Var.g; pim0Var != null; pim0Var = pim0Var.f) {
                pim0Var.x1();
            }
        }
        bfn0 bfn0VarI = this.X.i();
        Object[] objArr = bfn0VarI.a;
        int i = bfn0VarI.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((hmb0) objArr[i2]).e(oxq0Var);
        }
        if (!this.p1) {
            jdo0Var.m();
        }
        F();
        if (hmb0VarV2 != null) {
            hmb0VarV2.F();
        }
        e75 e75Var = this.l1;
        if (e75Var != null) {
            e75Var.invoke(oxq0Var);
        }
        lmb0Var.j();
        if (!this.p1 && jdo0Var.k(8)) {
            G();
        }
        ha4 ha4Var = (ha4) oxq0Var;
        if (!ha4.c() || (m74VarM28getAutofillManager = ha4Var.getAutofillManager()) == null || (o161VarX = x()) == null || !i541.k(o161VarX)) {
            return;
        }
        m74VarM28getAutofillManager.h.a(this.b);
        m74VarM28getAutofillManager.a.f(m74VarM28getAutofillManager.c, this.b, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void e0(qim0 qim0Var) throws KotlinNothingValueException {
        if (this.a && this.j1 != nim0.a) {
            qf80.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.p1) {
            qf80.a("modifier is updated when deactivated");
        }
        if (!I()) {
            this.k1 = qim0Var;
            return;
        }
        d(qim0Var);
        if (this.S0) {
            G();
        }
    }

    public final void f() {
        this.r1 = this.q1;
        this.q1 = 3;
        bfn0 bfn0VarA = A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var = (hmb0) objArr[i2];
            if (hmb0Var.q1 != 3) {
                hmb0Var.f();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void f0(e8k1 e8k1Var) {
        if (u890.j(this.b1, e8k1Var)) {
            return;
        }
        this.b1 = e8k1Var;
        pim0 pim0Var = (pim0) this.e1.g;
        if ((pim0Var.d & 16) != 0) {
            while (pim0Var != null) {
                if ((pim0Var.c & 16) != 0) {
                    ?? E = pim0Var;
                    ?? bfn0Var = 0;
                    while (E != 0) {
                        if (E instanceof mav0) {
                            ((mav0) E).m1();
                        } else if ((E.c & 16) != 0 && (E instanceof l5t)) {
                            pim0 pim0Var2 = ((l5t) E).P0;
                            int i = 0;
                            E = E;
                            bfn0Var = bfn0Var;
                            while (pim0Var2 != null) {
                                if ((pim0Var2.c & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        bfn0Var = bfn0Var;
                                        E = pim0Var2;
                                    } else {
                                        if (bfn0Var == 0) {
                                            bfn0Var = new bfn0(0, new pim0[16]);
                                        }
                                        if (E != 0) {
                                            bfn0Var.b(E);
                                            E = 0;
                                        }
                                        bfn0Var.b(pim0Var2);
                                    }
                                }
                                pim0Var2 = pim0Var2.f;
                                E = E;
                                bfn0Var = bfn0Var;
                            }
                            if (i == 1) {
                            }
                        }
                        E = oap1.e((bfn0) bfn0Var);
                    }
                }
                if ((pim0Var.d & 16) == 0) {
                    return;
                } else {
                    pim0Var = pim0Var.f;
                }
            }
        }
    }

    public final void g() {
        this.r1 = this.q1;
        this.q1 = 3;
        bfn0 bfn0VarA = A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var = (hmb0) objArr[i2];
            if (hmb0Var.q1 == 2) {
                hmb0Var.g();
            }
        }
    }

    public final void g0() {
        if (this.t <= 0 || !this.Z) {
            return;
        }
        this.Z = false;
        bfn0 bfn0Var = this.Y;
        if (bfn0Var == null) {
            bfn0Var = new bfn0(0, new hmb0[16]);
            this.Y = bfn0Var;
        }
        bfn0Var.g();
        bfn0 bfn0VarI = this.X.i();
        Object[] objArr = bfn0VarI.a;
        int i = bfn0VarI.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var = (hmb0) objArr[i2];
            if (hmb0Var.a) {
                bfn0Var.d(bfn0Var.c, hmb0Var.A());
            } else {
                bfn0Var.b(hmb0Var);
            }
        }
        lmb0 lmb0Var = this.f1;
        lmb0Var.f68p.Z0 = true;
        c6f0 c6f0Var = lmb0Var.q;
        if (c6f0Var != null) {
            c6f0Var.U0 = true;
        }
    }

    public final String h(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        bfn0 bfn0VarA = A();
        Object[] objArr = bfn0VarA.a;
        int i3 = bfn0VarA.c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((hmb0) objArr[i4]).h(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? cy30.h(1, 0, string) : string;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void i() throws KotlinNothingValueException {
        m74 m74VarM28getAutofillManager;
        t5f0 t5f0Var;
        oxq0 oxq0Var = this.O0;
        if (oxq0Var == null) {
            hmb0 hmb0VarV = v();
            qf80.d("Cannot detach node that is already detached!  Tree: " + (hmb0VarV != null ? hmb0VarV.h(0) : null));
            jah.d();
            return;
        }
        hmb0 hmb0VarV2 = v();
        lmb0 lmb0Var = this.f1;
        if (hmb0VarV2 != null) {
            hmb0VarV2.D();
            hmb0VarV2.F();
            lmb0Var.f68p.m1 = 3;
            c6f0 c6f0Var = lmb0Var.q;
            if (c6f0Var != null) {
                c6f0Var.t = 3;
            }
        }
        lmb0Var.f68p.X0.m();
        c6f0 c6f0Var2 = lmb0Var.q;
        if (c6f0Var2 != null && (t5f0Var = c6f0Var2.S0) != null) {
            t5f0Var.m();
        }
        jdo0 jdo0Var = this.e1;
        pim0 pim0Var = (gpd1) jdo0Var.f;
        ndo0 ndo0Var = ((sh80) jdo0Var.d).X0;
        for (ndo0 ndo0Var2 = (ndo0) jdo0Var.e; !u890.j(ndo0Var2, ndo0Var) && ndo0Var2 != null; ndo0Var2 = ndo0Var2.X0) {
            ndo0Var2.F1();
            if (ndo0Var2.U0.J()) {
                ndo0Var2.A1();
            }
        }
        f75 f75Var = this.m1;
        if (f75Var != null) {
            f75Var.invoke(oxq0Var);
        }
        for (pim0 pim0Var2 = pim0Var; pim0Var2 != null; pim0Var2 = pim0Var2.e) {
            if (pim0Var2.N0) {
                pim0Var2.E1();
            }
        }
        this.R0 = true;
        bfn0 bfn0VarI = this.X.i();
        Object[] objArr = bfn0VarI.a;
        int i = bfn0VarI.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((hmb0) objArr[i2]).i();
        }
        this.R0 = false;
        while (pim0Var != null) {
            if (pim0Var.N0) {
                pim0Var.y1();
            }
            pim0Var = pim0Var.e;
        }
        ha4 ha4Var = (ha4) oxq0Var;
        ha4Var.m31getLayoutNodes().g(this.b);
        q420 q420Var = ha4Var.t1;
        ((l6s) q420Var.e).t(this);
        ((rok0) q420Var.f).s(this);
        ha4Var.n1 = true;
        if (ha4.c() && (m74VarM28getAutofillManager = ha4Var.getAutofillManager()) != null && m74VarM28getAutofillManager.h.g(this.b)) {
            m74VarM28getAutofillManager.a.f(m74VarM28getAutofillManager.c, this.b, false);
        }
        ha4Var.getRectManager().h(this);
        this.O0 = null;
        c0(null);
        this.Q0 = 0;
        ffh0 ffh0Var = lmb0Var.f68p;
        ffh0Var.i = Integer.MAX_VALUE;
        ffh0Var.h = Integer.MAX_VALUE;
        ffh0Var.S0 = false;
        c6f0 c6f0Var3 = lmb0Var.q;
        if (c6f0Var3 != null) {
            c6f0Var3.i = Integer.MAX_VALUE;
            c6f0Var3.h = Integer.MAX_VALUE;
            c6f0Var3.R0 = 3;
        }
        if (jdo0Var.k(8)) {
            o161 o161Var = this.T0;
            this.T0 = null;
            this.S0 = false;
            ha4Var.getSemanticsOwner().b(this, o161Var);
            ha4Var.A();
        }
    }

    public final void j(fid fidVar, be50 be50Var) throws Throwable {
        try {
            ((ndo0) this.e1.e).V0(fidVar, be50Var);
        } catch (Throwable th) {
            Z(th);
            throw null;
        }
    }

    public final void l() {
        if (this.i != null) {
            U(this, false, 5);
        } else {
            W(this, false, 5);
        }
        ffh0 ffh0Var = this.f1.f68p;
        hjl hjlVar = ffh0Var.t ? new hjl(ffh0Var.d) : null;
        oxq0 oxq0Var = this.O0;
        if (hjlVar != null) {
            if (oxq0Var != null) {
                ((ha4) oxq0Var).u(this, hjlVar.a);
            }
        } else if (oxq0Var != null) {
            ((ha4) oxq0Var).t(true);
        }
    }

    public final List m() {
        c6f0 c6f0Var = this.f1.q;
        c6f0Var.getClass();
        bfn0 bfn0Var = c6f0Var.T0;
        lmb0 lmb0Var = c6f0Var.f;
        lmb0Var.a.o();
        if (!c6f0Var.U0) {
            return bfn0Var.f();
        }
        hmb0 hmb0Var = lmb0Var.a;
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var2 = (hmb0) objArr[i2];
            if (bfn0Var.c <= i2) {
                c6f0 c6f0Var2 = hmb0Var2.f1.q;
                c6f0Var2.getClass();
                bfn0Var.b(c6f0Var2);
            } else {
                c6f0 c6f0Var3 = hmb0Var2.f1.q;
                c6f0Var3.getClass();
                Object[] objArr2 = bfn0Var.a;
                Object obj = objArr2[i2];
                objArr2[i2] = c6f0Var3;
            }
        }
        bfn0Var.m(hmb0Var.o().size(), bfn0Var.c);
        c6f0Var.U0 = false;
        return bfn0Var.f();
    }

    public final List n() {
        return this.f1.f68p.l0();
    }

    public final List o() {
        return A().f();
    }

    public final List p() {
        return this.X.i().f();
    }

    public final boolean q() {
        return this.f1.f68p.V0;
    }

    public final boolean r() {
        return this.f1.f68p.U0;
    }

    public final int s() {
        return this.f1.f68p.m1;
    }

    public final int t() {
        int i;
        c6f0 c6f0Var = this.f1.q;
        if (c6f0Var == null || (i = c6f0Var.t) == 0) {
            return 3;
        }
        return i;
    }

    public final String toString() {
        return nmn1.r(this) + " children: " + o().size() + " measurePolicy: " + this.X0 + " deactivated: " + this.p1 + " isVirtual: " + this.a + " isPlaced: " + J();
    }

    public final x390 u() {
        x390 x390Var = this.Y0;
        if (x390Var != null) {
            return x390Var;
        }
        x390 x390Var2 = new x390(this, this.X0);
        this.Y0 = x390Var2;
        return x390Var2;
    }

    public final hmb0 v() {
        hmb0 hmb0Var = this.N0;
        while (hmb0Var != null && hmb0Var.a) {
            hmb0Var = hmb0Var.N0;
        }
        return hmb0Var;
    }

    public final int w() {
        return this.f1.f68p.i;
    }

    public final o161 x() {
        if (I() && !this.p1 && this.e1.k(8)) {
            return this.T0;
        }
        return null;
    }

    public final float y() {
        return this.f1.f68p.e1;
    }

    public final bfn0 z() {
        boolean z = this.W0;
        bfn0 bfn0Var = this.V0;
        if (z) {
            bfn0Var.g();
            bfn0Var.d(bfn0Var.c, A());
            f46.G0(bfn0Var.a, v1, bfn0Var.c);
            this.W0 = false;
        }
        return bfn0Var;
    }

    public hmb0(int i) {
        this(s161.a.addAndGet(1), (i & 1) == 0);
    }
}
