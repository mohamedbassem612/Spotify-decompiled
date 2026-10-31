package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dk60 {
    public final elb0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final wdn0 f = new wdn0();
    public final qdo0 g = new qdo0();
    public final mdn0 h = new mdn0(10);

    public dk60(elb0 elb0Var) {
        this.a = elb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    public final void a(long j, List list, boolean z) {
        mdn0 mdn0Var;
        long[] jArr;
        ddo0 ddo0Var;
        Object objD;
        Object obj;
        int size = list.size();
        qdo0 qdo0Var = this.g;
        qdo0 qdo0Var2 = qdo0Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            mdn0Var = this.h;
            if (i >= size) {
                break;
            }
            pim0 pim0Var = (pim0) list.get(i);
            if (pim0Var.N0) {
                pim0Var.Z = new og(this, pim0Var, (byte) 26);
                if (z2) {
                    bfn0 bfn0Var = qdo0Var2.a;
                    Object[] objArr = bfn0Var.a;
                    int i2 = bfn0Var.c;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((ddo0) obj).c.equals(pim0Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    ddo0Var = (ddo0) obj;
                    if (ddo0Var != null) {
                        ddo0Var.i = true;
                        ddo0Var.d.a(j);
                        if (z) {
                            Object objD2 = mdn0Var.d(j);
                            if (objD2 == null) {
                                objD2 = new wdn0();
                                mdn0Var.g(j, objD2);
                            }
                            ((wdn0) objD2).b(ddo0Var);
                        }
                    } else {
                        z2 = false;
                        ddo0Var = new ddo0(pim0Var);
                        ddo0Var.d.a(j);
                        if (z) {
                            objD = mdn0Var.d(j);
                            if (objD == null) {
                                objD = new wdn0();
                                mdn0Var.g(j, objD);
                            }
                            ((wdn0) objD).b(ddo0Var);
                        }
                        qdo0Var2.a.b(ddo0Var);
                    }
                } else {
                    ddo0Var = new ddo0(pim0Var);
                    ddo0Var.d.a(j);
                    if (z) {
                        objD = mdn0Var.d(j);
                        if (objD == null) {
                            objD = new wdn0();
                            mdn0Var.g(j, objD);
                        }
                        ((wdn0) objD).b(ddo0Var);
                    }
                    qdo0Var2.a.b(ddo0Var);
                }
                qdo0Var2 = ddo0Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = mdn0Var.b;
            Object[] objArr2 = mdn0Var.c;
            long[] jArr3 = mdn0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                wdn0 wdn0Var = (wdn0) objArr2[i8];
                                bfn0 bfn0Var2 = qdo0Var.a;
                                Object[] objArr3 = bfn0Var2.a;
                                int i9 = bfn0Var2.c;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((ddo0) objArr3[i10]).f(j3, wdn0Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        mdn0Var.a();
    }

    public final boolean b(oi oiVar, boolean z) {
        qdo0 qdo0Var = this.g;
        bfn0 bfn0Var = qdo0Var.a;
        if (!qdo0Var.a(oiVar.C(), this.a, oiVar, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = bfn0Var.a;
        int i = bfn0Var.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((ddo0) objArr[i2]).e(oiVar, z) || z3;
        }
        Object[] objArr2 = bfn0Var.a;
        int i3 = bfn0Var.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((ddo0) objArr2[i4]).d(oiVar) || z4;
        }
        qdo0Var.b(oiVar);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            wdn0 wdn0Var = this.f;
            int i5 = wdn0Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((pim0) wdn0Var.g(i6));
            }
            wdn0Var.e();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            qdo0Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        qdo0 qdo0Var = this.g;
        bfn0 bfn0Var = qdo0Var.a;
        Object[] objArr = bfn0Var.a;
        int i = bfn0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ddo0) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            qdo0Var.a.g();
        }
    }

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
    public final void d(pim0 pim0Var) {
        if (this.b) {
            this.e = true;
            this.f.b(pim0Var);
            return;
        }
        qdo0 qdo0Var = this.g;
        wdn0 wdn0Var = qdo0Var.b;
        wdn0Var.e();
        wdn0Var.b(qdo0Var);
        while (wdn0Var.j()) {
            qdo0 qdo0Var2 = (qdo0) wdn0Var.l(wdn0Var.b - 1);
            int i = 0;
            while (true) {
                bfn0 bfn0Var = qdo0Var2.a;
                if (i < bfn0Var.c) {
                    ddo0 ddo0Var = (ddo0) bfn0Var.a[i];
                    if (ddo0Var.c.equals(pim0Var)) {
                        qdo0Var2.a.k(ddo0Var);
                        ddo0Var.c();
                    } else {
                        wdn0Var.b(ddo0Var);
                        i++;
                    }
                }
            }
        }
    }
}
