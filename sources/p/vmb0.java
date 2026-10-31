package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vmb0 implements wvj {
    public int N0;
    public int O0;
    public final String P0;
    public final ulc1 X;
    public final nen0 Y;
    public final bfn0 Z;
    public final hmb0 a;
    public v3k b;
    public vlc1 c;
    public int d;
    public int e;
    public final nen0 f;
    public final nen0 g;
    public final pmb0 h;
    public final mmb0 i;
    public final nen0 t;

    public vmb0(hmb0 hmb0Var, vlc1 vlc1Var) {
        this.a = hmb0Var;
        this.c = vlc1Var;
        long[] jArr = hj41.a;
        this.f = new nen0();
        this.g = new nen0();
        this.h = new pmb0(this);
        this.i = new mmb0(this);
        this.t = new nen0();
        this.X = new ulc1();
        this.Y = new nen0();
        this.Z = new bfn0(0, new Object[16]);
        this.P0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void e(nmb0 nmb0Var) {
        nas0 nas0Var = nmb0Var.f;
        if (nas0Var != null) {
            nas0Var.c();
            nmb0Var.f = null;
            h4k h4kVar = nmb0Var.c;
            if (h4kVar != null) {
                h4kVar.dispose();
            }
            nmb0Var.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // p.wvj
    public final void a() {
        h4k h4kVar;
        hmb0 hmb0Var = this.a;
        hmb0Var.R0 = true;
        nen0 nen0Var = this.f;
        Object[] objArr = nen0Var.c;
        long[] jArr = nen0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (h4kVar = ((nmb0) objArr[(i << 3) + i3]).c) != null) {
                            h4kVar.dispose();
                        }
                        j >>= 8;
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
        }
        hmb0Var.Q();
        hmb0Var.R0 = false;
        nen0Var.a();
        this.g.a();
        this.O0 = 0;
        this.N0 = 0;
        this.t.a();
        i();
    }

    @Override // p.wvj
    public final void b() {
        j(true);
    }

    @Override // p.wvj
    public final void c() {
        j(false);
    }

    public final void d(nmb0 nmb0Var, boolean z) {
        nas0 nas0Var = nmb0Var.f;
        if (nas0Var != null) {
            jv91 jv91VarO = ekb.o();
            iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
            jv91 jv91VarU = ekb.u(jv91VarO);
            try {
                hmb0 hmb0Var = this.a;
                hmb0Var.R0 = true;
                if (z) {
                    while (!nas0Var.f()) {
                        try {
                            nas0Var.j(new mna0((byte) 3));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                nas0Var.a();
                nmb0Var.f = null;
                hmb0Var.R0 = false;
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
            } catch (Throwable th2) {
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                throw th2;
            }
        }
    }

    public final rlc1 f(Object obj) {
        return !this.a.I() ? new tmb0() : new umb0(this, obj);
    }

    public final void g(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.N0 = 0;
        hmb0 hmb0Var = this.a;
        afn0 afn0VarP = hmb0Var.p();
        boolean z4 = true;
        int size = (afn0VarP.size() - this.O0) - 1;
        if (i <= size) {
            ulc1 ulc1Var = this.X;
            ulc1Var.clear();
            nen0 nen0Var = this.f;
            if (i <= size) {
                int i2 = i;
                while (true) {
                    Object objG = nen0Var.g((hmb0) afn0VarP.get(i2));
                    objG.getClass();
                    ulc1Var.b(((nmb0) objG).a);
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.c(ulc1Var);
            jv91 jv91VarO = ekb.o();
            iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
            jv91 jv91VarU = ekb.u(jv91VarO);
            boolean z5 = false;
            while (size >= i) {
                try {
                    hmb0 hmb0Var2 = (hmb0) afn0VarP.get(size);
                    Object objG2 = nen0Var.g(hmb0Var2);
                    objG2.getClass();
                    nmb0 nmb0Var = (nmb0) objG2;
                    Object obj = nmb0Var.a;
                    if (ulc1Var.contains(obj)) {
                        boolean z6 = z4;
                        this.N0++;
                        if (((Boolean) nmb0Var.g.getValue()).booleanValue()) {
                            lmb0 lmb0Var = hmb0Var2.f1;
                            lmb0Var.f68p.m1 = 3;
                            c6f0 c6f0Var = lmb0Var.q;
                            if (c6f0Var != null) {
                                c6f0Var.t = 3;
                            }
                            m(nmb0Var, false);
                            if (nmb0Var.h) {
                                z = z6;
                                z5 = z;
                            } else {
                                z = z6;
                            }
                            z2 = false;
                        } else {
                            z2 = z3;
                            z = z6;
                        }
                    } else {
                        hmb0Var.R0 = z4;
                        nen0Var.k(hmb0Var2);
                        h4k h4kVar = nmb0Var.c;
                        if (h4kVar != null) {
                            h4kVar.dispose();
                        }
                        z = true;
                        hmb0Var.R(size, 1);
                        z2 = false;
                        hmb0Var.R0 = false;
                    }
                    this.g.k(obj);
                    size--;
                    boolean z7 = z2;
                    z4 = z;
                    z3 = z7;
                } catch (Throwable th) {
                    ekb.C(jv91VarO, jv91VarU, iu30VarE);
                    throw th;
                }
            }
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            z3 = z5;
        }
        if (z3) {
            ekb.D();
        }
        i();
    }

    public final void h(Object obj) {
        i();
        hmb0 hmb0Var = (hmb0) this.t.k(obj);
        hmb0 hmb0Var2 = this.a;
        if (hmb0Var != null) {
            if (this.O0 <= 0) {
                qf80.c("No pre-composed items to dispose");
            }
            int iIndexOf = hmb0Var2.p().indexOf(hmb0Var);
            if (iIndexOf < hmb0Var2.p().size() - this.O0) {
                qf80.c("Item is not in pre-composed item range");
            }
            this.N0++;
            this.O0--;
            nmb0 nmb0Var = (nmb0) this.f.g(hmb0Var);
            if (nmb0Var != null) {
                e(nmb0Var);
            }
            int size = (hmb0Var2.p().size() - this.O0) - this.N0;
            k(iIndexOf, size);
            g(size);
        }
        if (this.Z.i(obj)) {
            hmb0.W(hmb0Var2, true, 6);
        }
    }

    public final void i() {
        int size = this.a.p().size();
        int i = this.f.e;
        if (i != size) {
            qf80.a("Inconsistency between the count of nodes tracked by the state (" + i + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i2 = this.N0;
        int i3 = this.O0;
        if ((size - i2) - i3 < 0) {
            StringBuilder sbQ = cy30.q(size, i2, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ");
            sbQ.append(i3);
            qf80.a(sbQ.toString());
        }
        int i4 = this.t.e;
        int i5 = this.O0;
        if (i4 == i5) {
            return;
        }
        qf80.a("Incorrect state. Precomposed children " + i5 + ". Map size " + i4);
    }

    public final void j(boolean z) {
        this.O0 = 0;
        this.t.a();
        afn0 afn0VarP = this.a.p();
        int size = afn0VarP.size();
        if (this.N0 != size) {
            this.N0 = size;
            jv91 jv91VarO = ekb.o();
            iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
            jv91 jv91VarU = ekb.u(jv91VarO);
            for (int i = 0; i < size; i++) {
                try {
                    hmb0 hmb0Var = (hmb0) afn0VarP.get(i);
                    nmb0 nmb0Var = (nmb0) this.f.g(hmb0Var);
                    if (nmb0Var != null && ((Boolean) nmb0Var.g.getValue()).booleanValue()) {
                        lmb0 lmb0Var = hmb0Var.f1;
                        lmb0Var.f68p.m1 = 3;
                        c6f0 c6f0Var = lmb0Var.q;
                        if (c6f0Var != null) {
                            c6f0Var.t = 3;
                        }
                        m(nmb0Var, z);
                        nmb0Var.a = ejo1.a;
                    }
                } catch (Throwable th) {
                    ekb.C(jv91VarO, jv91VarU, iu30VarE);
                    throw th;
                }
            }
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            this.g.a();
        }
        i();
    }

    public final void k(int i, int i2) {
        hmb0 hmb0Var = this.a;
        hmb0Var.R0 = true;
        hmb0Var.M(i, i2, 1);
        hmb0Var.R0 = false;
    }

    public final void l(Object obj, vu30 vu30Var, boolean z) {
        hmb0 hmb0Var = this.a;
        if (hmb0Var.I()) {
            i();
            if (this.g.c(obj)) {
                return;
            }
            this.Y.k(obj);
            nen0 nen0Var = this.t;
            Object objG = nen0Var.g(obj);
            if (objG == null) {
                objG = o(obj);
                if (objG != null) {
                    k(hmb0Var.p().indexOf(objG), hmb0Var.p().size());
                    this.O0++;
                } else {
                    int size = hmb0Var.p().size();
                    hmb0 hmb0Var2 = new hmb0(2);
                    hmb0Var.R0 = true;
                    hmb0Var.C(size, hmb0Var2);
                    hmb0Var.R0 = false;
                    this.O0++;
                    objG = hmb0Var2;
                }
                nen0Var.m(obj, objG);
            }
            n((hmb0) objG, obj, z, vu30Var);
        }
    }

    public final void m(nmb0 nmb0Var, boolean z) {
        h4k h4kVar;
        if (z || !nmb0Var.h) {
            nmb0Var.g = xto.t(Boolean.FALSE);
        } else {
            nmb0Var.g.setValue(Boolean.FALSE);
        }
        if (nmb0Var.f != null) {
            e(nmb0Var);
            return;
        }
        if (z) {
            h4k h4kVar2 = nmb0Var.c;
            if (h4kVar2 != null) {
                h4kVar2.o();
                return;
            }
            return;
        }
        lrq0 lrq0VarM32getOutOfFrameExecutor = ((ha4) kmb0.a(this.a)).m32getOutOfFrameExecutor();
        if (lrq0VarM32getOutOfFrameExecutor != null) {
            ((ha4) lrq0VarM32getOutOfFrameExecutor).G(new g030(nmb0Var, (byte) 12));
        } else {
            if (nmb0Var.h || (h4kVar = nmb0Var.c) == null) {
                return;
            }
            h4kVar.o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:58:0x009b, B:60:0x00ad, B:63:0x00c2, B:65:0x00c6, B:77:0x010a, B:66:0x00d3, B:67:0x00de, B:69:0x00e2, B:71:0x00f7, B:75:0x0101, B:74:0x00fc, B:76:0x0107, B:61:0x00b0, B:56:0x0092, B:57:0x0097, B:80:0x0114, B:81:0x011e), top: B:84:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:58:0x009b, B:60:0x00ad, B:63:0x00c2, B:65:0x00c6, B:77:0x010a, B:66:0x00d3, B:67:0x00de, B:69:0x00e2, B:71:0x00f7, B:75:0x0101, B:74:0x00fc, B:76:0x0107, B:61:0x00b0, B:56:0x0092, B:57:0x0097, B:80:0x0114, B:81:0x011e), top: B:84:0x0076 }] */
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
    public final void n(hmb0 hmb0Var, Object obj, boolean z, vu30 vu30Var) {
        boolean z2;
        nen0 nen0Var = this.f;
        Object objG = nen0Var.g(hmb0Var);
        Object obj2 = objG;
        if (objG == null) {
            j2i j2iVar = mlj.a;
            nmb0 nmb0Var = new nmb0();
            nmb0Var.a = obj;
            nmb0Var.b = j2iVar;
            nmb0Var.c = null;
            nmb0Var.g = xto.t(Boolean.TRUE);
            nen0Var.m(hmb0Var, nmb0Var);
            obj2 = nmb0Var;
        }
        nmb0 nmb0Var2 = (nmb0) obj2;
        boolean z3 = nmb0Var2.b != vu30Var;
        if (nmb0Var2.f != null) {
            if (z3) {
                e(nmb0Var2);
            } else if (z) {
                return;
            } else {
                d(nmb0Var2, true);
            }
        }
        h4k h4kVar = nmb0Var2.c;
        if (h4kVar != null) {
            synchronized (h4kVar.d) {
                z2 = h4kVar.N0.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || nmb0Var2.d) {
            nmb0Var2.b = vu30Var;
            if (nmb0Var2.f != null) {
                qf80.a("new subcompose call while paused composition is still active");
            }
            jv91 jv91VarO = ekb.o();
            iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
            jv91 jv91VarU = ekb.u(jv91VarO);
            try {
                hmb0 hmb0Var2 = this.a;
                hmb0Var2.R0 = true;
                h4k h4kVarL = nmb0Var2.c;
                v3k v3kVar = this.b;
                if (v3kVar == null) {
                    qf80.d("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (h4kVarL != null) {
                    if (h4kVarL.W0 == 3) {
                        if (z) {
                            h4kVarL = too1.k(hmb0Var, v3kVar);
                        } else {
                            h4kVarL = too1.l(hmb0Var, v3kVar);
                        }
                    }
                } else if (z) {
                    h4kVarL = too1.k(hmb0Var, v3kVar);
                } else {
                    h4kVarL = too1.l(hmb0Var, v3kVar);
                }
                nmb0Var2.c = h4kVarL;
                vu30 vu30VarJ = nmb0Var2.b;
                if (((ha4) kmb0.a(this.a)).m32getOutOfFrameExecutor() != null) {
                    nmb0Var2.h = false;
                } else {
                    nmb0Var2.h = true;
                    vu30VarJ = apo.j(1524156494, new f14(nmb0Var2, vu30VarJ, (byte) 15), true);
                }
                if (z) {
                    if (nmb0Var2.e) {
                        h4kVarL.l();
                        h4kVarL.s();
                        nmb0Var2.f = h4kVarL.n(true, vu30VarJ);
                    } else {
                        nmb0Var2.f = h4kVarL.n(h4kVarL.l(), vu30VarJ);
                    }
                } else if (nmb0Var2.e) {
                    h4kVarL.l();
                    h4kVarL.s();
                    x340 x340Var = h4kVarL.V0;
                    x340Var.z = 0;
                    x340Var.y = true;
                    h4kVarL.a.a(h4kVarL, vu30VarJ);
                    if (x340Var.F || x340Var.z != 0) {
                        bmv0.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    x340Var.z = -1;
                    x340Var.y = false;
                } else {
                    h4kVarL.A(vu30VarJ);
                }
                nmb0Var2.e = false;
                hmb0Var2.R0 = false;
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                nmb0Var2.d = false;
            } catch (Throwable th) {
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                throw th;
            }
        }
    }

    public final hmb0 o(Object obj) {
        nen0 nen0Var;
        int i;
        if (this.N0 == 0) {
            return null;
        }
        afn0 afn0VarP = this.a.p();
        int size = afn0VarP.size() - this.O0;
        int i2 = size - this.N0;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            nen0Var = this.f;
            if (i4 < i2) {
                i = -1;
                break;
            }
            Object objG = nen0Var.g((hmb0) afn0VarP.get(i4));
            objG.getClass();
            if (u890.j(((nmb0) objG).a, obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    break;
                }
                Object objG2 = nen0Var.g((hmb0) afn0VarP.get(i3));
                objG2.getClass();
                nmb0 nmb0Var = (nmb0) objG2;
                Object obj2 = nmb0Var.a;
                if (obj2 == ejo1.a || this.c.j(obj, obj2)) {
                    nmb0Var.a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            k(i4, i2);
        }
        this.N0--;
        hmb0 hmb0Var = (hmb0) afn0VarP.get(i2);
        Object objG3 = nen0Var.g(hmb0Var);
        objG3.getClass();
        nmb0 nmb0Var2 = (nmb0) objG3;
        nmb0Var2.g = xto.t(Boolean.TRUE);
        nmb0Var2.e = true;
        nmb0Var2.d = true;
        return hmb0Var;
    }
}
