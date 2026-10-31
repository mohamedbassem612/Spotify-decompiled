package p;

import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t0a extends pim0 implements zlb0, m7v, t161, mav0, sim0, csr0, zkb0, mv40, ay20, iz20, nz20, txq0, lbc {
    public oim0 O0;
    public s0a P0;
    public HashSet Q0;

    @Override // p.pim0
    public final void A1() {
        I1();
    }

    @Override // p.txq0
    public final boolean B0() {
        return this.N0;
    }

    @Override // p.mav0
    public final void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        this.O0.getPointerInputFilter().onPointerEvent-H0pRuoY(bav0Var, cav0Var, j);
    }

    @Override // p.mv40
    public final void E(elb0 elb0Var) {
        ((g6e1) this.O0).E(elb0Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    public final void H1(boolean z) {
        rim0 modifierLocalManager;
        wdn0 wdn0Var;
        wdn0 wdn0Var2;
        if (!this.N0) {
            qf80.c("initializeModifier called on unattached node");
        }
        tim0 tim0Var = this.O0;
        if ((this.c & 32) != 0 && (tim0Var instanceof tim0)) {
            tim0 tim0Var2 = tim0Var;
            s0a s0aVar = this.P0;
            if (s0aVar != null) {
                yky0 yky0Var = c3t.a;
                if (s0aVar.m(yky0Var)) {
                    s0aVar.Q(tim0Var2);
                    rim0 modifierLocalManager2 = ((ha4) oap1.C(this)).getModifierLocalManager();
                    wdn0 wdn0Var3 = modifierLocalManager2.b;
                    if (wdn0Var3 == null) {
                        wdn0Var3 = new wdn0();
                        modifierLocalManager2.b = wdn0Var3;
                    }
                    wdn0Var3.b(this);
                    wdn0 wdn0Var4 = modifierLocalManager2.c;
                    if (wdn0Var4 == null) {
                        wdn0Var4 = new wdn0();
                        modifierLocalManager2.c = wdn0Var4;
                    }
                    wdn0Var4.b(yky0Var);
                    modifierLocalManager2.a();
                } else {
                    this.P0 = new s0a(tim0Var2);
                    if (lyg.l(this)) {
                        modifierLocalManager = ((ha4) oap1.C(this)).getModifierLocalManager();
                        yky0 yky0Var2 = c3t.a;
                        wdn0Var = modifierLocalManager.b;
                        if (wdn0Var == null) {
                            wdn0Var = new wdn0();
                            modifierLocalManager.b = wdn0Var;
                        }
                        wdn0Var.b(this);
                        wdn0Var2 = modifierLocalManager.c;
                        if (wdn0Var2 == null) {
                            wdn0Var2 = new wdn0();
                            modifierLocalManager.c = wdn0Var2;
                        }
                        wdn0Var2.b(yky0Var2);
                        modifierLocalManager.a();
                    }
                }
            } else {
                this.P0 = new s0a(tim0Var2);
                if (lyg.l(this)) {
                    modifierLocalManager = ((ha4) oap1.C(this)).getModifierLocalManager();
                    yky0 yky0Var3 = c3t.a;
                    wdn0Var = modifierLocalManager.b;
                    if (wdn0Var == null) {
                        wdn0Var = new wdn0();
                        modifierLocalManager.b = wdn0Var;
                    }
                    wdn0Var.b(this);
                    wdn0Var2 = modifierLocalManager.c;
                    if (wdn0Var2 == null) {
                        wdn0Var2 = new wdn0();
                        modifierLocalManager.c = wdn0Var2;
                    }
                    wdn0Var2.b(yky0Var3);
                    modifierLocalManager.a();
                }
            }
        }
        if ((this.c & 4) != 0 && !z) {
            dio1.x(this);
        }
        if ((this.c & 2) != 0) {
            if (lyg.l(this)) {
                ndo0 ndo0Var = this.h;
                ndo0Var.getClass();
                ((cmb0) ndo0Var).Q1(this);
                mxq0 mxq0Var = ndo0Var.v1;
                if (mxq0Var != null) {
                    ((ge50) mxq0Var).c();
                }
            }
            if (!z) {
                dio1.x(this);
                oap1.B(this).F();
            }
        }
        if (tim0Var instanceof fy11) {
            ((fy11) tim0Var).w(oap1.B(this));
        }
        if ((this.c & 256) != 0 && (tim0Var instanceof g6e1) && lyg.l(this)) {
            oap1.B(this).F();
        }
        if ((this.c & 16) != 0 && (tim0Var instanceof lav0)) {
            ((lav0) tim0Var).getPointerInputFilter().setLayoutCoordinates$ui(this.h);
        }
        if ((this.c & 8) != 0) {
            ((ha4) oap1.C(this)).A();
        }
    }

    public final void I1() {
        if (!this.N0) {
            qf80.c("unInitializeModifier called on unattached node");
        }
        oim0 oim0Var = this.O0;
        if ((this.c & 32) != 0 && (oim0Var instanceof tim0)) {
            rim0 modifierLocalManager = ((ha4) oap1.C(this)).getModifierLocalManager();
            yky0 yky0Var = c3t.a;
            wdn0 wdn0Var = modifierLocalManager.d;
            if (wdn0Var == null) {
                wdn0Var = new wdn0();
                modifierLocalManager.d = wdn0Var;
            }
            wdn0Var.b(oap1.B(this));
            wdn0 wdn0Var2 = modifierLocalManager.e;
            if (wdn0Var2 == null) {
                wdn0Var2 = new wdn0();
                modifierLocalManager.e = wdn0Var2;
            }
            wdn0Var2.b(yky0Var);
            modifierLocalManager.a();
        }
        if ((this.c & 8) != 0) {
            ((ha4) oap1.C(this)).A();
        }
    }

    public final void J1() {
        if (this.N0) {
            this.Q0.clear();
            uxq0 snapshotObserver = ((ha4) oap1.C(this)).getSnapshotObserver();
            snapshotObserver.a.d(this, lyg.a, new xh3(this, (byte) 11));
        }
    }

    @Override // p.mav0
    public final void K0() {
        this.O0.getPointerInputFilter().onCancel();
    }

    @Override // p.m7v
    public final void L0() {
        ha71.x(this);
    }

    @Override // p.mav0
    public final boolean O() {
        return this.O0.getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // p.zlb0
    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return eio1.v((xlb0) this.O0, x5f0Var, afh0Var, i);
    }

    @Override // p.iz20
    public final void T0(ez20 ez20Var) {
        oim0 oim0Var = this.O0;
        qf80.c("applyFocusProperties called on wrong node");
        pze0.m(oim0Var);
        throw null;
    }

    @Override // p.sim0
    public final j2h1 U() {
        s0a s0aVar = this.P0;
        return s0aVar != null ? s0aVar : c7x.d;
    }

    @Override // p.zlb0
    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return eio1.t((xlb0) this.O0, x5f0Var, afh0Var, i);
    }

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        return ((xlb0) this.O0).d(ifh0Var, afh0Var, j);
    }

    @Override // p.csr0
    public final Object e(wat watVar, Object obj) {
        return ((bsr0) this.O0).e(watVar, obj);
    }

    @Override // p.ay20
    public final void e0(wz20 wz20Var) {
        oim0 oim0Var = this.O0;
        qf80.c("onFocusEvent called on wrong node");
        pze0.m(oim0Var);
        throw null;
    }

    @Override // p.t161
    public final void g(e261 e261Var) {
        o161 o161VarR1 = ((r161) this.O0).r1();
        o161 o161Var = (o161) e261Var;
        nen0 nen0Var = o161Var.a;
        if (o161VarR1.c) {
            o161Var.c = true;
        }
        if (o161VarR1.d) {
            o161Var.d = true;
        }
        nen0 nen0Var2 = o161VarR1.a;
        Object[] objArr = nen0Var2.b;
        Object[] objArr2 = nen0Var2.c;
        long[] jArr = nen0Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        d261 d261Var = (d261) obj;
                        if (!nen0Var.b(d261Var)) {
                            nen0Var.m(d261Var, obj2);
                        } else if (obj2 instanceof we) {
                            we weVar = (we) nen0Var.g(d261Var);
                            String str = weVar.a;
                            if (str == null) {
                                str = ((we) obj2).a;
                            }
                            cv30 cv30Var = weVar.b;
                            if (cv30Var == null) {
                                cv30Var = ((we) obj2).b;
                            }
                            nen0Var.m(d261Var, new we(str, cv30Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p.lbc
    public final flb0 getLayoutDirection() {
        return oap1.B(this).a1;
    }

    @Override // p.lbc
    public final wat h() {
        return oap1.B(this).Z0;
    }

    @Override // p.mav0
    public final boolean h1() {
        return this.O0.getPointerInputFilter().getShareWithSiblings();
    }

    @Override // p.x4t, p.mav0
    public final void i() {
        if (this.O0 instanceof lav0) {
            K0();
        }
    }

    @Override // p.lbc
    public final long j() {
        return o0c.R(oap1.w(this, 128).c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // p.sim0
    public final Object n1(yky0 yky0Var) {
        jdo0 jdo0Var;
        HashSet hashSet = this.Q0;
        yky0 yky0Var2 = s3o1.a;
        hashSet.add(yky0Var2);
        if (!this.a.N0) {
            qf80.c("visitAncestors called on an unattached node");
        }
        pim0 pim0Var = this.a.e;
        hmb0 hmb0VarB = oap1.B(this);
        while (hmb0VarB != null) {
            if ((((pim0) hmb0VarB.e1.g).d & 32) != 0) {
                while (pim0Var != null) {
                    if ((pim0Var.c & 32) != 0) {
                        ?? E = pim0Var;
                        ?? bfn0Var = 0;
                        while (E != 0) {
                            if (E instanceof sim0) {
                                sim0 sim0Var = (sim0) E;
                                if (sim0Var.U().m(yky0Var2)) {
                                    return sim0Var.U().r(yky0Var2);
                                }
                            } else if ((E.c & 32) != 0 && (E instanceof l5t)) {
                                pim0 pim0Var2 = ((l5t) E).P0;
                                int i = 0;
                                E = E;
                                bfn0Var = bfn0Var;
                                while (pim0Var2 != null) {
                                    if ((pim0Var2.c & 32) != 0) {
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
                    pim0Var = pim0Var.e;
                }
            }
            hmb0VarB = hmb0VarB.v();
            pim0Var = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
        }
        return yky0Var2.a().invoke();
    }

    @Override // p.zlb0
    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return eio1.u((xlb0) this.O0, x5f0Var, afh0Var, i);
    }

    @Override // p.m7v
    public final void t0(lsl lslVar) {
        pxe1 pxe1Var = (pxe1) this.O0;
        fid fidVarP = lslVar.a1().p();
        fidVarP.j(new n511(0.0f, 0.0f, Float.intBitsToFloat((int) (lslVar.j() >> 32)), Float.intBitsToFloat((int) (lslVar.j() & 4294967295L))), pxe1Var.a);
        lslVar.s1();
        fidVarP.i();
    }

    public final String toString() {
        return this.O0.toString();
    }

    @Override // p.zlb0
    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return eio1.s((xlb0) this.O0, x5f0Var, afh0Var, i);
    }

    @Override // p.pim0
    public final void z1() {
        H1(true);
    }

    @Override // p.zkb0
    public final void d1(elb0 elb0Var) {
    }

    @Override // p.zkb0, p.ofh0
    public final void f(long j) {
    }
}
