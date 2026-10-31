package p;

import coil3.request.NullRequestDataException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rf01 {
    public static final /* synthetic */ int f = 0;
    public final pf01 a;
    public final llm b = gto1.m();
    public final km3 c;
    public final h1i d;
    public volatile /* synthetic */ int e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(rf01.class, "e");
    }

    public rf01(pf01 pf01Var) {
        this.a = pf01Var;
        i25 i25VarL = byo1.l(this);
        km3 km3VarD = bbp1.d(this);
        this.c = km3VarD;
        g1i g1iVar = new g1i(pf01Var.f);
        gto1.o(g1iVar, pf01Var);
        jto1.p(g1iVar, pf01Var);
        kto1.q(g1iVar);
        gto1.n(g1iVar);
        g1iVar.i(new q8y(this, i25VarL, km3VarD));
        this.d = g1iVar.l();
    }

    public final lku a(zy70 zy70Var) {
        return jto1.v(zy70Var, c921.q(this.b, (o8n) this.a.c.getValue(), 0, new k53(this, zy70Var, null, (byte) 23), 2));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    /* JADX WARN: Code duplicated, block: B:73:0x0133 A[Catch: all -> 0x003f, TryCatch #7 {all -> 0x003f, blocks: (B:15:0x003a, B:71:0x012d, B:73:0x0133, B:74:0x013c, B:76:0x0140, B:79:0x014c, B:80:0x0151), top: B:113:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:74:0x013c A[Catch: all -> 0x003f, TryCatch #7 {all -> 0x003f, blocks: (B:15:0x003a, B:71:0x012d, B:73:0x0133, B:74:0x013c, B:76:0x0140, B:79:0x014c, B:80:0x0151), top: B:113:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0140 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #7 {all -> 0x003f, blocks: (B:15:0x003a, B:71:0x012d, B:73:0x0133, B:74:0x013c, B:76:0x0140, B:79:0x014c, B:80:0x0151), top: B:113:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:79:0x014c A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #7 {all -> 0x003f, blocks: (B:15:0x003a, B:71:0x012d, B:73:0x0133, B:74:0x013c, B:76:0x0140, B:79:0x014c, B:80:0x0151), top: B:113:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0164 A[Catch: all -> 0x016f, TryCatch #6 {all -> 0x016f, blocks: (B:88:0x0160, B:90:0x0164, B:92:0x016b, B:93:0x016e, B:96:0x0171), top: B:112:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x016b A[Catch: all -> 0x016f, TryCatch #6 {all -> 0x016f, blocks: (B:88:0x0160, B:90:0x0164, B:92:0x016b, B:93:0x016e, B:96:0x0171), top: B:112:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0171 A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #6 {all -> 0x016f, blocks: (B:88:0x0160, B:90:0x0164, B:92:0x016b, B:93:0x016e, B:96:0x0171), top: B:112:0x0160 }] */
    public final Object b(zy70 zy70Var, int i, onm onmVar) {
        qf01 qf01Var;
        ko21 ko21VarP;
        zy70 zy70VarW;
        ko21 ko21Var;
        va00 va00Var;
        int i2;
        ko21 ko21Var2;
        ko21 ko21Var3;
        oq70 oq70Var;
        va00 va00Var2;
        zy70 zy70Var2;
        Object objH;
        yy70 yy70Var;
        iz70 iz70Var;
        if (onmVar instanceof qf01) {
            qf01Var = (qf01) onmVar;
            int i3 = qf01Var.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qf01Var.h = i3 - Integer.MIN_VALUE;
            } else {
                qf01Var = new qf01(this, onmVar);
            }
        } else {
            qf01Var = new qf01(this, onmVar);
        }
        qf01 qf01Var2 = qf01Var;
        Object obj = qf01Var2.f;
        int i4 = qf01Var2.h;
        d9n d9nVar = d9n.a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    i2 = qf01Var2.e;
                    va00Var = qf01Var2.c;
                    zy70VarW = qf01Var2.b;
                    ko21Var2 = qf01Var2.a;
                    try {
                        hm5.M(obj);
                        ko21VarP = ko21Var2;
                    } catch (Throwable th) {
                        th = th;
                        ko21Var = ko21Var2;
                    }
                } else if (i4 == 2) {
                    i2 = qf01Var2.e;
                    oq70 oq70Var2 = qf01Var2.d;
                    va00 va00Var3 = qf01Var2.c;
                    zy70 zy70Var3 = qf01Var2.b;
                    ko21Var2 = qf01Var2.a;
                    try {
                        hm5.M(obj);
                        va00Var2 = va00Var3;
                        zy70VarW = zy70Var3;
                        ko21Var3 = ko21Var2;
                        oq70Var = oq70Var2;
                        int i5 = i2;
                        try {
                            k291 k291Var = (k291) obj;
                            va00Var2.getClass();
                            o8n o8nVar = zy70VarW.g;
                            zy70Var2 = zy70VarW;
                            try {
                                rxa rxaVar = new rxa((byte) 1, zy70Var2, this, k291Var, va00Var2, oq70Var, (lnm) null);
                                qf01Var2.a = ko21Var3;
                                qf01Var2.b = zy70Var2;
                                qf01Var2.c = va00Var2;
                                qf01Var2.d = null;
                                qf01Var2.e = i5;
                                qf01Var2.h = 3;
                                objH = c921.H(o8nVar, rxaVar, qf01Var2);
                                if (objH != d9nVar) {
                                    zy70VarW = zy70Var2;
                                    va00Var = va00Var2;
                                    ko21Var = ko21Var3;
                                    obj = objH;
                                    iz70Var = (iz70) obj;
                                    if (iz70Var instanceof tsc1) {
                                        f((tsc1) iz70Var, zy70VarW.c, va00Var);
                                    } else {
                                        if (!(iz70Var instanceof viz)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        e((viz) iz70Var, zy70VarW.c, va00Var);
                                    }
                                    ko21Var.b();
                                    return iz70Var;
                                }
                                return d9nVar;
                            } catch (Throwable th2) {
                                th = th2;
                                zy70VarW = zy70Var2;
                                va00Var = va00Var2;
                                ko21Var = ko21Var3;
                                if (th instanceof CancellationException) {
                                    viz vizVarD = eqr0.d(zy70VarW, th);
                                    e(vizVarD, zy70VarW.c, va00Var);
                                    ko21Var.b();
                                    return vizVarD;
                                }
                                va00Var.getClass();
                                yy70Var = zy70VarW.d;
                                if (yy70Var != null) {
                                    yy70Var.d(zy70VarW);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        va00Var = va00Var3;
                        zy70VarW = zy70Var3;
                        ko21Var = ko21Var2;
                    }
                } else {
                    if (i4 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    va00Var = qf01Var2.c;
                    zy70VarW = qf01Var2.b;
                    ko21Var = qf01Var2.a;
                    try {
                        hm5.M(obj);
                        iz70Var = (iz70) obj;
                        if (iz70Var instanceof tsc1) {
                            f((tsc1) iz70Var, zy70VarW.c, va00Var);
                        } else {
                            if (!(iz70Var instanceof viz)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            e((viz) iz70Var, zy70VarW.c, va00Var);
                        }
                        ko21Var.b();
                        return iz70Var;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                ko21Var = ko21Var2;
                try {
                    if (th instanceof CancellationException) {
                        viz vizVarD2 = eqr0.d(zy70VarW, th);
                        e(vizVarD2, zy70VarW.c, va00Var);
                        ko21Var.b();
                        return vizVarD2;
                    }
                    va00Var.getClass();
                    yy70Var = zy70VarW.d;
                    if (yy70Var != null) {
                        yy70Var.d(zy70VarW);
                    }
                    throw th;
                } catch (Throwable th6) {
                    ko21Var.b();
                    throw th6;
                }
            }
            hm5.M(obj);
            faa0 faa0VarZ = op71.z(qf01Var2.getContext());
            boolean z = i == 0;
            km3 km3Var = this.c;
            ko21VarP = km3Var.P(zy70Var, faa0VarZ, z);
            ko21VarP.c();
            zy70VarW = km3Var.W(zy70Var);
            va00 va00Var4 = va00.a;
            try {
                if (zy70VarW.b.equals(eep0.a)) {
                    throw new NullRequestDataException();
                }
                ko21VarP.start();
                if (i == 0) {
                    qf01Var2.a = ko21VarP;
                    qf01Var2.b = zy70VarW;
                    qf01Var2.c = va00Var4;
                    qf01Var2.e = i;
                    qf01Var2.h = 1;
                    if (ko21VarP.a(qf01Var2) != d9nVar) {
                        i2 = i;
                        ko21Var2 = ko21VarP;
                        va00Var = va00Var4;
                        ko21VarP = ko21Var2;
                    }
                } else {
                    i2 = i;
                    va00Var = va00Var4;
                }
                return d9nVar;
            } catch (Throwable th7) {
                th = th7;
                ko21Var = ko21VarP;
                va00Var = va00Var4;
            }
            zy70VarW.getClass();
            drd1 drd1Var = zy70VarW.c;
            if (drd1Var != null) {
                oq70 oq70Var3 = (oq70) zy70VarW.m.invoke(zy70VarW);
                if (oq70Var3 == null) {
                    oq70Var3 = (oq70) zy70VarW.u.h.invoke(zy70VarW);
                }
                drd1Var.e(oq70Var3);
            }
            va00Var.getClass();
            yy70 yy70Var2 = zy70VarW.d;
            if (yy70Var2 != null) {
                yy70Var2.b();
            }
            z291 z291Var = zy70VarW.f156p;
            qf01Var2.a = ko21VarP;
            qf01Var2.b = zy70VarW;
            qf01Var2.c = va00Var;
            qf01Var2.d = null;
            qf01Var2.e = i2;
            qf01Var2.h = 2;
            Object objA = z291Var.a(qf01Var2);
            if (objA != d9nVar) {
                ko21Var3 = ko21VarP;
                obj = objA;
                oq70Var = null;
                va00Var2 = va00Var;
                int i6 = i2;
                k291 k291Var2 = (k291) obj;
                va00Var2.getClass();
                o8n o8nVar2 = zy70VarW.g;
                zy70Var2 = zy70VarW;
                rxa rxaVar2 = new rxa((byte) 1, zy70Var2, this, k291Var2, va00Var2, oq70Var, (lnm) null);
                qf01Var2.a = ko21Var3;
                qf01Var2.b = zy70Var2;
                qf01Var2.c = va00Var2;
                qf01Var2.d = null;
                qf01Var2.e = i6;
                qf01Var2.h = 3;
                objH = c921.H(o8nVar2, rxaVar2, qf01Var2);
                if (objH != d9nVar) {
                    zy70VarW = zy70Var2;
                    va00Var = va00Var2;
                    ko21Var = ko21Var3;
                    obj = objH;
                    iz70Var = (iz70) obj;
                    if (iz70Var instanceof tsc1) {
                        f((tsc1) iz70Var, zy70VarW.c, va00Var);
                    } else {
                        if (!(iz70Var instanceof viz)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e((viz) iz70Var, zy70VarW.c, va00Var);
                    }
                    ko21Var.b();
                    return iz70Var;
                }
            }
            return d9nVar;
        } catch (Throwable th8) {
            th = th8;
            ko21Var = ko21VarP;
        }
    }

    public final Object c(zy70 zy70Var, onm onmVar) {
        return !jto1.C(zy70Var) ? b(zy70Var, 1, onmVar) : smo1.s(new zfe(this, zy70Var, (lnm) null, (byte) 9), onmVar);
    }

    public final wf01 d() {
        return (wf01) this.a.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final void e(viz vizVar, drd1 drd1Var, va00 va00Var) {
        zy70 zy70Var = vizVar.b;
        oq70 oq70Var = vizVar.a;
        if (drd1Var instanceof kmg1) {
            khg1 khg1VarA = ((ahg1) kto1.u(zy70Var, dz70.a)).a((kmg1) drd1Var, vizVar);
            if (khg1VarA instanceof cfo0) {
                drd1Var.b(oq70Var);
            } else {
                va00Var.getClass();
                khg1VarA.a();
            }
        } else if (drd1Var != null) {
            drd1Var.b(oq70Var);
        }
        va00Var.getClass();
        yy70 yy70Var = zy70Var.d;
        if (yy70Var != null) {
            yy70Var.c(zy70Var, vizVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final void f(tsc1 tsc1Var, drd1 drd1Var, va00 va00Var) {
        zy70 zy70Var = tsc1Var.b;
        oq70 oq70Var = tsc1Var.a;
        if (drd1Var instanceof kmg1) {
            khg1 khg1VarA = ((ahg1) kto1.u(zy70Var, dz70.a)).a((kmg1) drd1Var, tsc1Var);
            if (khg1VarA instanceof cfo0) {
                drd1Var.f(oq70Var);
            } else {
                va00Var.getClass();
                khg1VarA.a();
            }
        } else if (drd1Var != null) {
            drd1Var.f(oq70Var);
        }
        va00Var.getClass();
        yy70 yy70Var = zy70Var.d;
        if (yy70Var != null) {
            yy70Var.a(zy70Var, tsc1Var);
        }
    }
}
