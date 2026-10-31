package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class bbc implements jfe {
    public static final /* synthetic */ long N0;
    public static final /* synthetic */ long O0;
    public static final /* synthetic */ long P0;
    public static final /* synthetic */ long Q0;
    public static final /* synthetic */ long R0;
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    public static final /* synthetic */ long Z;
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(bbc.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    public static final /* synthetic */ AtomicReferenceFieldUpdater g;
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ long t;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = avg.a;
        R0 = unsafe.objectFieldOffset(bbc.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(bbc.class, "receivers$volatile");
        P0 = unsafe.objectFieldOffset(bbc.class.getDeclaredField("receivers$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(bbc.class, "bufferEnd$volatile");
        X = unsafe.objectFieldOffset(bbc.class.getDeclaredField("bufferEnd$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(bbc.class, "completedExpandBuffersAndPauseFlag$volatile");
        N0 = unsafe.objectFieldOffset(bbc.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(bbc.class, Object.class, "sendSegment$volatile");
        Q0 = unsafe.objectFieldOffset(bbc.class.getDeclaredField("sendSegment$volatile"));
        g = AtomicReferenceFieldUpdater.newUpdater(bbc.class, Object.class, "receiveSegment$volatile");
        O0 = unsafe.objectFieldOffset(bbc.class.getDeclaredField("receiveSegment$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(bbc.class, Object.class, "bufferEndSegment$volatile");
        Y = unsafe.objectFieldOffset(bbc.class.getDeclaredField("bufferEndSegment$volatile"));
        t = unsafe.objectFieldOffset(bbc.class.getDeclaredField("_closeCause$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(bbc.class, Object.class, "closeHandler$volatile");
        Z = unsafe.objectFieldOffset(bbc.class.getDeclaredField("closeHandler$volatile"));
    }

    public bbc(int i2) {
        long j;
        this.a = i2;
        if (i2 < 0) {
            hhg1.f(gvg.e(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        rge rgeVar = dbc.a;
        if (i2 != 0) {
            j = i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE;
        } else {
            j = 0;
        }
        this.bufferEnd$volatile = j;
        this.completedExpandBuffersAndPauseFlag$volatile = n();
        rge rgeVar2 = new rge(0L, null, this, 3);
        this.sendSegment$volatile = rgeVar2;
        this.receiveSegment$volatile = rgeVar2;
        this.bufferEndSegment$volatile = E() ? dbc.a : rgeVar2;
        this._closeCause$volatile = dbc.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static /* synthetic */ Object O(bbc bbcVar, onm onmVar) {
        zac zacVar;
        rge rgeVar;
        if (onmVar instanceof zac) {
            zacVar = (zac) onmVar;
            int i2 = zacVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zacVar.c = i2 - Integer.MIN_VALUE;
            } else {
                zacVar = new zac(bbcVar, onmVar);
            }
        } else {
            zacVar = new zac(bbcVar, onmVar);
        }
        zac zacVar2 = zacVar;
        Object obj = zacVar2.a;
        int i3 = zacVar2.c;
        if (i3 != 0) {
            if (i3 == 1) {
                hm5.M(obj);
                return ((qge) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        rge rgeVar2 = (rge) avg.a.getObjectVolatile(bbcVar, O0);
        while (!bbcVar.C()) {
            long andIncrement = c.getAndIncrement(bbcVar);
            long j = dbc.b;
            long j2 = andIncrement / j;
            int i4 = (int) (andIncrement % j);
            if (rgeVar2.e != j2) {
                rge rgeVarK = bbcVar.k(j2, rgeVar2);
                if (rgeVarK == null) {
                    continue;
                } else {
                    rgeVar = rgeVarK;
                }
            } else {
                rgeVar = rgeVar2;
            }
            bbc bbcVar2 = bbcVar;
            Object objU = bbcVar2.U(rgeVar, i4, andIncrement, null);
            if (objU == dbc.m) {
                eg.m("unexpected");
                return null;
            }
            if (objU != dbc.o) {
                if (objU != dbc.n) {
                    rgeVar.b();
                    return objU;
                }
                zacVar2.c = 1;
                Object objP = bbcVar2.P(rgeVar, i4, andIncrement, zacVar2);
                d9n d9nVar = d9n.a;
                return objP == d9nVar ? d9nVar : objP;
            }
            if (andIncrement < bbcVar2.v()) {
                rgeVar.b();
            }
            bbcVar = bbcVar2;
            rgeVar2 = rgeVar;
        }
        return flo1.e(bbcVar.o());
    }

    public final boolean A(long j, boolean z) {
        int i2 = (int) (j >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                g(j & 1152921504606846975L);
                if (!z || !w()) {
                }
            } else {
                if (i2 != 3) {
                    bhn0.f(f4i1.c(i2, "unexpected close status: "));
                    return false;
                }
                rge rgeVarG = g(j & 1152921504606846975L);
                Object objU = null;
                loop0: do {
                    for (int i3 = dbc.b - 1; -1 < i3; i3--) {
                        long j2 = (rgeVarG.e * ((long) dbc.b)) + ((long) i3);
                        while (true) {
                            Object objL = rgeVarG.l(i3);
                            if (objL == dbc.i) {
                                break loop0;
                            }
                            if (objL != dbc.d) {
                                if (objL != dbc.e && objL != null) {
                                    if (!(objL instanceof o4l1) && !(objL instanceof p4l1)) {
                                        jm jmVar = dbc.g;
                                        if (objL == jmVar || objL == dbc.f) {
                                            break loop0;
                                        }
                                        if (objL != jmVar) {
                                            break;
                                        }
                                    } else {
                                        if (j2 < q()) {
                                            break loop0;
                                        }
                                        o4l1 o4l1Var = objL instanceof p4l1 ? ((p4l1) objL).a : (o4l1) objL;
                                        if (rgeVarG.k(i3, objL, dbc.l)) {
                                            objU = mno1.u(objU, o4l1Var);
                                            rgeVarG.n(i3, null);
                                            rgeVarG.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (rgeVarG.k(i3, objL, dbc.l)) {
                                        rgeVarG.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j2 < q()) {
                                    break loop0;
                                }
                                if (rgeVarG.k(i3, objL, dbc.l)) {
                                    rgeVarG.n(i3, null);
                                    rgeVarG.i();
                                    break;
                                }
                            }
                        }
                    }
                    rgeVarG = (rge) ((csk) avg.a.getObjectVolatile(rgeVarG, csk.d));
                } while (rgeVarG != null);
                if (objU != null) {
                    if (objU instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objU;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            R((o4l1) arrayList.get(size), false);
                        }
                    } else {
                        R((o4l1) objU, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p.r261
    public final void B(iu30 iu30Var) {
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = avg.a;
            bbc bbcVar = this;
            if (unsafe2.compareAndSwapObject(bbcVar, Z, (Object) null, iu30Var)) {
                return;
            }
            long j = Z;
            if (unsafe2.getObjectVolatile(bbcVar, j) != null) {
                while (true) {
                    Object objectVolatile = avg.a.getObjectVolatile(bbcVar, j);
                    jm jmVar = dbc.q;
                    if (objectVolatile != jmVar) {
                        if (objectVolatile == dbc.r) {
                            eg.m("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            eg.m(f4i1.d(objectVolatile, "Another handler is already registered: "));
                            return;
                        }
                    }
                    jm jmVar2 = dbc.r;
                    do {
                        bbc bbcVar2 = bbcVar;
                        unsafe = avg.a;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(bbcVar2, Z, jmVar, jmVar2);
                        bbcVar = bbcVar2;
                        if (zCompareAndSwapObject) {
                            iu30Var.invoke(bbcVar.o());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(bbcVar, j) == jmVar);
                }
            } else {
                this = bbcVar;
            }
        }
    }

    public final boolean C() {
        return A(avg.a.getLongVolatile(this, R0), true);
    }

    public boolean D() {
        return false;
    }

    public final boolean E() {
        long jN = n();
        return jN == 0 || jN == Long.MAX_VALUE;
    }

    public final void F(long j, rge rgeVar) {
        rge rgeVar2;
        rge rgeVar3;
        while (rgeVar.e < j && (rgeVar3 = (rge) rgeVar.c()) != null) {
            rgeVar = rgeVar3;
        }
        while (true) {
            if (!rgeVar.d() || (rgeVar2 = (rge) rgeVar.c()) == null) {
                while (true) {
                    hp51 hp51Var = (hp51) avg.a.getObjectVolatile(this, Y);
                    if (hp51Var.e >= rgeVar.e) {
                        return;
                    }
                    if (!rgeVar.j()) {
                        break;
                    }
                    if (z5c.h(this, hp51Var, rgeVar)) {
                        if (hp51Var.f()) {
                            hp51Var.e();
                            return;
                        }
                        return;
                    } else if (rgeVar.f()) {
                        rgeVar.e();
                    }
                }
            } else {
                rgeVar = rgeVar2;
            }
        }
    }

    @Override // p.r261
    public final boolean H(Throwable th) {
        return e(th, false);
    }

    public final Object I(Object obj, lnm lnmVar) {
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        ohdVar.resumeWith(new m231(u()));
        Object objR = ohdVar.r();
        return objR == d9n.a ? objR : rih1.a;
    }

    public final void J(Object obj, ohd ohdVar) {
        ohdVar.resumeWith(new m231(u()));
    }

    @Override // p.r261
    public final boolean K() {
        return A(avg.a.getLongVolatile(this, R0), false);
    }

    public final void N(o4l1 o4l1Var, rge rgeVar, int i2) {
        M();
        o4l1Var.b(rgeVar, i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(rge rgeVar, int i2, long j, onm onmVar) {
        abc abcVar;
        qge qgeVar;
        rge rgeVar2;
        if (onmVar instanceof abc) {
            abcVar = (abc) onmVar;
            int i3 = abcVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                abcVar.c = i3 - Integer.MIN_VALUE;
            } else {
                abcVar = new abc(this, onmVar);
            }
        } else {
            abcVar = new abc(this, onmVar);
        }
        Object objR = abcVar.a;
        int i4 = abcVar.c;
        if (i4 == 0) {
            hm5.M(objR);
            abcVar.c = 1;
            ohd ohdVarU = jzn1.u(aym.t(abcVar));
            try {
                o4l1 tl01Var = new tl01(ohdVarU);
                Object objU = U(rgeVar, i2, j, tl01Var);
                if (objU != dbc.m) {
                    if (objU == dbc.o) {
                        if (j < v()) {
                            rgeVar.b();
                        }
                        rge rgeVar3 = (rge) avg.a.getObjectVolatile(this, O0);
                        while (true) {
                            if (C()) {
                                ohdVarU.resumeWith(new qge(flo1.e(o())));
                                break;
                            }
                            long andIncrement = c.getAndIncrement(this);
                            long j2 = dbc.b;
                            long j3 = andIncrement / j2;
                            int i5 = (int) (andIncrement % j2);
                            if (rgeVar3.e != j3) {
                                rge rgeVarK = k(j3, rgeVar3);
                                if (rgeVarK != null) {
                                    rgeVar2 = rgeVarK;
                                }
                            } else {
                                rgeVar2 = rgeVar3;
                            }
                            Object objU2 = U(rgeVar2, i5, andIncrement, tl01Var);
                            rge rgeVar4 = rgeVar2;
                            if (objU2 == dbc.m) {
                                N(tl01Var, rgeVar4, i5);
                                break;
                            }
                            if (objU2 == dbc.o) {
                                if (andIncrement < v()) {
                                    rgeVar4.b();
                                }
                                rgeVar3 = rgeVar4;
                            } else {
                                if (objU2 == dbc.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                rgeVar4.b();
                                qgeVar = new qge(objU2);
                            }
                        }
                    } else {
                        rgeVar.b();
                        qgeVar = new qge(objU);
                    }
                    ohdVarU.f(qgeVar, null);
                    break;
                }
                N(tl01Var, rgeVar, i2);
                objR = ohdVarU.r();
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            } catch (Throwable th) {
                ohdVarU.A();
                throw th;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objR);
        }
        return ((qge) objR).a;
    }

    public final void Q(ou51 ou51Var) {
        rge rgeVar;
        o4l1 o4l1Var;
        rge rgeVar2 = (rge) avg.a.getObjectVolatile(this, O0);
        while (!this.C()) {
            long andIncrement = c.getAndIncrement(this);
            long j = dbc.b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (rgeVar2.e != j2) {
                rge rgeVarK = this.k(j2, rgeVar2);
                if (rgeVarK == null) {
                    continue;
                } else {
                    rgeVar = rgeVarK;
                }
            } else {
                rgeVar = rgeVar2;
            }
            Object objU = this.U(rgeVar, i2, andIncrement, ou51Var);
            rgeVar2 = rgeVar;
            if (objU == dbc.m) {
                if (ou51Var == 0) {
                    o4l1Var = null;
                }
                if (o4l1Var == null) {
                    o4l1Var = ou51Var;
                    return;
                } else {
                    o4l1Var = ou51Var;
                    this.N(o4l1Var, rgeVar2, i2);
                    return;
                }
            }
            if (objU != dbc.o) {
                if (objU == dbc.n) {
                    eg.m("unexpected");
                    return;
                } else {
                    rgeVar2.b();
                    ou51Var.e = objU;
                    return;
                }
            }
            if (andIncrement < this.v()) {
                rgeVar2.b();
            }
            this = this;
            ou51Var = ou51Var;
        }
        ou51Var.e = dbc.l;
    }

    public final void R(o4l1 o4l1Var, boolean z) {
        if (o4l1Var instanceof mhd) {
            ((lnm) o4l1Var).resumeWith(new m231(z ? p() : u()));
            return;
        }
        if (o4l1Var instanceof tl01) {
            ((tl01) o4l1Var).a.resumeWith(new qge(flo1.e(o())));
            return;
        }
        if (!(o4l1Var instanceof uac)) {
            if (o4l1Var instanceof ou51) {
                ((ou51) o4l1Var).i(this, dbc.l);
                return;
            } else {
                hhg1.o(o4l1Var, "Unexpected waiter: ");
                return;
            }
        }
        uac uacVar = (uac) o4l1Var;
        ohd ohdVar = uacVar.b;
        ohdVar.getClass();
        uacVar.b = null;
        uacVar.a = dbc.l;
        Throwable thO = uacVar.c.o();
        if (thO == null) {
            ohdVar.resumeWith(Boolean.FALSE);
        } else {
            ohdVar.resumeWith(new m231(thO));
        }
    }

    public final boolean S(Object obj, Object obj2) {
        if (obj instanceof ou51) {
            return ((ou51) obj).i(this, obj2) == 0;
        }
        if (obj instanceof tl01) {
            ohd ohdVar = ((tl01) obj).a;
            qge qgeVar = new qge(obj2);
            rge rgeVar = dbc.a;
            jm jmVarM = ohdVar.M(qgeVar, null);
            if (jmVarM == null) {
                return false;
            }
            ohdVar.O(jmVarM);
            return true;
        }
        if (!(obj instanceof uac)) {
            if (!(obj instanceof mhd)) {
                eg.m(f4i1.d(obj, "Unexpected receiver type: "));
                return false;
            }
            mhd mhdVar = (mhd) obj;
            rge rgeVar2 = dbc.a;
            jm jmVarM2 = mhdVar.M(obj2, null);
            if (jmVarM2 == null) {
                return false;
            }
            mhdVar.O(jmVarM2);
            return true;
        }
        uac uacVar = (uac) obj;
        ohd ohdVar2 = uacVar.b;
        ohdVar2.getClass();
        uacVar.b = null;
        uacVar.a = obj2;
        Boolean bool = Boolean.TRUE;
        uacVar.c.getClass();
        rge rgeVar3 = dbc.a;
        jm jmVarM3 = ohdVar2.M(bool, null);
        if (jmVarM3 == null) {
            return false;
        }
        ohdVar2.O(jmVarM3);
        return true;
    }

    public final boolean T(Object obj, rge rgeVar, int i2) {
        char c2;
        boolean z = obj instanceof mhd;
        rih1 rih1Var = rih1.a;
        if (z) {
            mhd mhdVar = (mhd) obj;
            rge rgeVar2 = dbc.a;
            jm jmVarM = mhdVar.M(rih1Var, null);
            if (jmVarM == null) {
                return false;
            }
            mhdVar.O(jmVarM);
            return true;
        }
        if (!(obj instanceof ou51)) {
            eg.m(f4i1.d(obj, "Unexpected waiter: "));
            return false;
        }
        int i3 = ((ou51) obj).i(this, rih1Var);
        if (i3 == 0) {
            c2 = 1;
        } else if (i3 != 1) {
            c2 = 3;
            if (i3 != 2) {
                if (i3 != 3) {
                    bhn0.x(i3, "Unexpected internal result: ");
                    return false;
                }
                c2 = 4;
            }
        } else {
            c2 = 2;
        }
        if (c2 == 2) {
            rgeVar.n(i2, null);
        }
        return c2 == 1;
    }

    public final Object U(rge rgeVar, int i2, long j, Object obj) {
        Object objL = rgeVar.l(i2);
        AtomicReferenceArray atomicReferenceArray = rgeVar.i;
        long j2 = R0;
        if (objL == null) {
            if (j >= (avg.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return dbc.n;
                }
                if (rgeVar.k(i2, objL, obj)) {
                    j();
                    return dbc.m;
                }
            }
        } else if (objL == dbc.d && rgeVar.k(i2, objL, dbc.i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            rgeVar.n(i2, null);
            return obj2;
        }
        while (true) {
            Object objL2 = rgeVar.l(i2);
            if (objL2 == null || objL2 == dbc.e) {
                if (j < (avg.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (rgeVar.k(i2, objL2, dbc.h)) {
                        j();
                        return dbc.o;
                    }
                } else {
                    if (obj == null) {
                        return dbc.n;
                    }
                    if (rgeVar.k(i2, objL2, obj)) {
                        j();
                        return dbc.m;
                    }
                }
            } else if (objL2 != dbc.d) {
                jm jmVar = dbc.j;
                if (objL2 == jmVar) {
                    return dbc.o;
                }
                if (objL2 == dbc.h) {
                    return dbc.o;
                }
                if (objL2 == dbc.l) {
                    j();
                    return dbc.o;
                }
                if (objL2 != dbc.g && rgeVar.k(i2, objL2, dbc.f)) {
                    boolean z = objL2 instanceof p4l1;
                    if (z) {
                        objL2 = ((p4l1) objL2).a;
                    }
                    if (T(objL2, rgeVar, i2)) {
                        rgeVar.o(i2, dbc.i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        rgeVar.n(i2, null);
                        return obj3;
                    }
                    rgeVar.o(i2, jmVar);
                    rgeVar.i();
                    if (z) {
                        j();
                    }
                    return dbc.o;
                }
            } else if (rgeVar.k(i2, objL2, dbc.i)) {
                j();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                rgeVar.n(i2, null);
                return obj4;
            }
        }
    }

    public final int V(rge rgeVar, int i2, Object obj, long j, Object obj2, boolean z) {
        rgeVar.n(i2, obj);
        if (z) {
            return W(rgeVar, i2, obj, j, obj2, z);
        }
        Object objL = rgeVar.l(i2);
        if (objL == null) {
            if (a(j)) {
                if (rgeVar.k(i2, null, dbc.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (rgeVar.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof o4l1) {
            rgeVar.n(i2, null);
            if (S(objL, obj)) {
                rgeVar.o(i2, dbc.i);
                L();
                return 0;
            }
            jm jmVar = dbc.k;
            if (rgeVar.i.getAndSet((i2 * 2) + 1, jmVar) == jmVar) {
                return 5;
            }
            rgeVar.m(i2, true);
            return 5;
        }
        return W(rgeVar, i2, obj, j, obj2, z);
    }

    public final int W(rge rgeVar, int i2, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objL = rgeVar.l(i2);
            if (objL == null) {
                if (!a(j) || z) {
                    if (z) {
                        if (rgeVar.k(i2, null, dbc.j)) {
                            rgeVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (rgeVar.k(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (rgeVar.k(i2, null, dbc.d)) {
                    break;
                }
            } else {
                if (objL != dbc.e) {
                    jm jmVar = dbc.k;
                    if (objL == jmVar) {
                        rgeVar.n(i2, null);
                        return 5;
                    }
                    if (objL == dbc.h) {
                        rgeVar.n(i2, null);
                        return 5;
                    }
                    if (objL == dbc.l) {
                        rgeVar.n(i2, null);
                        K();
                        return 4;
                    }
                    rgeVar.n(i2, null);
                    if (objL instanceof p4l1) {
                        objL = ((p4l1) objL).a;
                    }
                    if (S(objL, obj)) {
                        rgeVar.o(i2, dbc.i);
                        L();
                        return 0;
                    }
                    if (rgeVar.i.getAndSet((i2 * 2) + 1, jmVar) != jmVar) {
                        rgeVar.m(i2, true);
                    }
                    return 5;
                }
                if (rgeVar.k(i2, objL, dbc.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void X(long j) {
        bbc bbcVar = this;
        if (bbcVar.E()) {
            return;
        }
        while (bbcVar.n() <= j) {
            bbcVar = this;
        }
        int i2 = dbc.c;
        int i3 = 0;
        while (true) {
            long j2 = N0;
            if (i3 < i2) {
                long jN = bbcVar.n();
                if (jN == (avg.a.getLongVolatile(bbcVar, j2) & 4611686018427387903L) && jN == bbcVar.n()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = avg.a;
                    long longVolatile = unsafe.getLongVolatile(bbcVar, j2);
                    if (unsafe.compareAndSwapLong(bbcVar, N0, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        bbcVar = this;
                    }
                }
                while (true) {
                    long jN2 = bbcVar.n();
                    Unsafe unsafe2 = avg.a;
                    long longVolatile2 = unsafe2.getLongVolatile(bbcVar, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (jN2 == j3 && jN2 == bbcVar.n()) {
                        break;
                    }
                    if (z) {
                        bbcVar = this;
                    } else {
                        bbcVar = this;
                        unsafe2.compareAndSwapLong(bbcVar, N0, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = avg.a;
                    long longVolatile3 = unsafe3.getLongVolatile(bbcVar, j2);
                    if (unsafe3.compareAndSwapLong(bbcVar, N0, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        bbcVar = this;
                    }
                }
            }
        }
    }

    public final boolean a(long j) {
        return j < n() || j < q() + ((long) this.a);
    }

    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x016e A[RETURN] */
    @Override // p.r261
    public Object b(Object obj, lnm lnmVar) {
        rih1 rih1Var;
        rih1 rih1Var2;
        Object objR;
        int i2;
        bbc bbcVar = this;
        Unsafe unsafe = avg.a;
        long j = Q0;
        rge rgeVar = (rge) unsafe.getObjectVolatile(bbcVar, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bbcVar);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zA = bbcVar.A(andIncrement, false);
            int i3 = dbc.b;
            long j3 = i3;
            long j4 = j2 / j3;
            int i4 = (int) (j2 % j3);
            long j5 = rgeVar.e;
            rih1Var = rih1.a;
            d9n d9nVar = d9n.a;
            if (j5 != j4) {
                rge rgeVarM = bbcVar.m(j4, rgeVar);
                if (rgeVarM != null) {
                    rgeVar = rgeVarM;
                } else if (zA) {
                    Object objI = I(obj, lnmVar);
                    if (objI != d9nVar) {
                        break;
                    }
                    return objI;
                }
            }
            int iV = bbcVar.V(rgeVar, i4, obj, j2, null, zA);
            if (iV == 0) {
                rgeVar.b();
                return rih1Var;
            }
            if (iV == 1) {
                break;
            }
            if (iV == 2) {
                if (!zA) {
                    return rih1Var;
                }
                rgeVar.i();
                Object objI2 = I(obj, lnmVar);
                return objI2 == d9nVar ? objI2 : rih1Var;
            }
            if (iV == 3) {
                ohd ohdVarU = jzn1.u(aym.t(lnmVar));
                try {
                    int iV2 = V(rgeVar, i4, obj, j2, ohdVarU, false);
                    if (iV2 != 0) {
                        if (iV2 == 1) {
                            rih1Var2 = rih1Var;
                            ohdVarU.resumeWith(rih1Var2);
                        } else if (iV2 == 2) {
                            rih1Var2 = rih1Var;
                            ohdVarU.b(rgeVar, i4 + i3);
                        } else if (iV2 != 4) {
                            String str = "unexpected";
                            if (iV2 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            rgeVar.b();
                            rge rgeVar2 = (rge) avg.a.getObjectVolatile(this, j);
                            while (true) {
                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                long j6 = andIncrement2 & 1152921504606846975L;
                                boolean zA2 = A(andIncrement2, false);
                                int i5 = dbc.b;
                                atomicLongFieldUpdater = atomicLongFieldUpdater;
                                long j7 = i5;
                                rih1Var = rih1Var;
                                long j8 = j6 / j7;
                                int i6 = (int) (j6 % j7);
                                if (rgeVar2.e != j8) {
                                    rge rgeVarM2 = m(j8, rgeVar2);
                                    if (rgeVarM2 != null) {
                                        i2 = i6;
                                        rgeVar2 = rgeVarM2;
                                    } else if (zA2) {
                                        J(obj, ohdVarU);
                                        rih1Var2 = rih1Var;
                                    }
                                } else {
                                    i2 = i6;
                                }
                                int iV3 = V(rgeVar2, i2, obj, j6, ohdVarU, zA2);
                                if (iV3 == 0) {
                                    rih1Var2 = rih1Var;
                                    rgeVar2.b();
                                } else if (iV3 != 1) {
                                    if (iV3 == 2) {
                                        if (zA2) {
                                            rgeVar2.i();
                                        } else {
                                            ohdVarU.b(rgeVar2, i2 + i5);
                                        }
                                        rih1Var2 = rih1Var;
                                    } else {
                                        if (iV3 == 3) {
                                            throw new IllegalStateException(str);
                                        }
                                        if (iV3 != 4) {
                                            if (iV3 == 5) {
                                                rgeVar2.b();
                                            }
                                            str = str;
                                        } else if (j6 < q()) {
                                            rgeVar2.b();
                                        }
                                    }
                                    J(obj, ohdVarU);
                                    rih1Var2 = rih1Var;
                                } else {
                                    rih1Var2 = rih1Var;
                                    ohdVarU.resumeWith(rih1Var2);
                                }
                            }
                        } else {
                            rih1Var2 = rih1Var;
                            if (j2 < q()) {
                                rgeVar.b();
                            }
                            J(obj, ohdVarU);
                        }
                        objR = ohdVarU.r();
                        if (objR != d9nVar) {
                            objR = rih1Var2;
                        }
                        if (objR == d9nVar) {
                            return objR;
                        }
                        return rih1Var2;
                    }
                    rih1Var2 = rih1Var;
                    rgeVar.b();
                    ohdVarU.resumeWith(rih1Var2);
                    objR = ohdVarU.r();
                    if (objR != d9nVar) {
                        objR = rih1Var2;
                    }
                    if (objR == d9nVar) {
                        return objR;
                    }
                    return rih1Var2;
                } catch (Throwable th) {
                    ohdVarU.A();
                    throw th;
                }
            }
            if (iV == 4) {
                if (j2 < q()) {
                    rgeVar.b();
                }
                Object objI3 = I(obj, lnmVar);
                if (objI3 != d9nVar) {
                    break;
                }
                return objI3;
            }
            if (iV == 5) {
                rgeVar.b();
            }
            bbcVar = this;
        }
        return rih1Var;
    }

    @Override // p.jfe
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    public final boolean e(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        long j3;
        long longVolatile2;
        Unsafe unsafe3;
        long j4;
        long longVolatile3;
        if (z) {
            do {
                unsafe3 = avg.a;
                j4 = R0;
                longVolatile3 = unsafe3.getLongVolatile(this, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                rge rgeVar = dbc.a;
            } while (!unsafe3.compareAndSwapLong(this, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        jm jmVar = dbc.s;
        while (true) {
            Unsafe unsafe4 = avg.a;
            long j5 = t;
            if (unsafe4.compareAndSwapObject(this, j5, jmVar, th)) {
                z2 = true;
                break;
            }
            if (unsafe4.getObjectVolatile(this, j5) != jmVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe2 = avg.a;
                j3 = R0;
                longVolatile2 = unsafe2.getLongVolatile(this, j3);
            } while (!unsafe2.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = avg.a;
                j = R0;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i2 = (int) (longVolatile >> 60);
                if (i2 == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        K();
        G();
        if (z2) {
            do {
                objectVolatile = avg.a.getObjectVolatile(this, Z);
            } while (!z5c.g(this, objectVolatile, objectVolatile == null ? dbc.q : dbc.r));
            if (objectVolatile != null) {
                w0h1.o(1, objectVolatile);
                ((iu30) objectVolatile).invoke(o());
            }
        }
        return z2;
    }

    public final rge g(long j) {
        long j2;
        Unsafe unsafe = avg.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, Y);
        rge rgeVar = (rge) unsafe.getObjectVolatile(this, Q0);
        if (rgeVar.e > ((rge) objectVolatile).e) {
            objectVolatile = rgeVar;
        }
        rge rgeVar2 = (rge) unsafe.getObjectVolatile(this, O0);
        if (rgeVar2.e > ((rge) objectVolatile).e) {
            objectVolatile = rgeVar2;
        }
        rge rgeVar3 = (rge) lvx.f((csk) objectVolatile);
        if (D()) {
            rge rgeVar4 = rgeVar3;
            loop0: while (true) {
                int i2 = dbc.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j2 = (rgeVar4.e * ((long) dbc.b)) + ((long) i2);
                        if (j2 >= q()) {
                            while (true) {
                                Object objL = rgeVar4.l(i2);
                                if (objL != null && objL != dbc.e) {
                                    if (objL != dbc.d) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (rgeVar4.k(i2, objL, dbc.l)) {
                                    rgeVar4.i();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        rgeVar4 = (rge) ((csk) avg.a.getObjectVolatile(rgeVar4, csk.d));
                        if (rgeVar4 == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                i(j2);
            }
        }
        Object objU = null;
        loop3: for (rge rgeVar5 = rgeVar3; rgeVar5 != null; rgeVar5 = (rge) ((csk) avg.a.getObjectVolatile(rgeVar5, csk.d))) {
            for (int i3 = dbc.b - 1; -1 < i3; i3--) {
                if ((rgeVar5.e * ((long) dbc.b)) + ((long) i3) < j) {
                    break loop3;
                }
                while (true) {
                    Object objL2 = rgeVar5.l(i3);
                    if (objL2 != null && objL2 != dbc.e) {
                        if (!(objL2 instanceof p4l1)) {
                            if (!(objL2 instanceof o4l1)) {
                                break;
                            }
                            if (rgeVar5.k(i3, objL2, dbc.l)) {
                                objU = mno1.u(objU, objL2);
                                rgeVar5.m(i3, true);
                                break;
                            }
                        } else {
                            if (rgeVar5.k(i3, objL2, dbc.l)) {
                                objU = mno1.u(objU, ((p4l1) objL2).a);
                                rgeVar5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (rgeVar5.k(i3, objL2, dbc.l)) {
                            rgeVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objU != null) {
            if (!(objU instanceof ArrayList)) {
                R((o4l1) objU, true);
                return rgeVar3;
            }
            ArrayList arrayList = (ArrayList) objU;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                R((o4l1) arrayList.get(size), true);
            }
        }
        return rgeVar3;
    }

    @Override // p.jfe
    public final Object h(a8d1 a8d1Var) {
        return O(this, a8d1Var);
    }

    public final void i(long j) {
        rge rgeVar = (rge) avg.a.getObjectVolatile(this, O0);
        while (true) {
            Unsafe unsafe = avg.a;
            long j2 = P0;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(((long) this.a) + longVolatile, this.n())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j2, longVolatile, 1 + longVolatile)) {
                long j3 = dbc.b;
                long j4 = longVolatile / j3;
                int i2 = (int) (longVolatile % j3);
                if (rgeVar.e != j4) {
                    rge rgeVarK = this.k(j4, rgeVar);
                    if (rgeVarK != null) {
                        rgeVar = rgeVarK;
                    }
                }
                rge rgeVar2 = rgeVar;
                if (this.U(rgeVar2, i2, longVolatile, null) != dbc.o || longVolatile < this.v()) {
                    rgeVar2.b();
                }
                rgeVar = rgeVar2;
            }
        }
    }

    @Override // p.jfe
    public final uac iterator() {
        return new uac(this);
    }

    public final void j() {
        long j;
        Object objH;
        if (E()) {
            return;
        }
        Unsafe unsafe = avg.a;
        long j2 = Y;
        rge rgeVar = (rge) unsafe.getObjectVolatile(this, j2);
        while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j3 = andIncrement / ((long) dbc.b);
            if (v() <= andIncrement) {
                if (rgeVar.e < j3 && rgeVar.c() != null) {
                    F(j3, rgeVar);
                }
                y(1L);
                return;
            }
            if (rgeVar.e != j3) {
                cbc cbcVar = cbc.a;
                while (true) {
                    objH = lvx.h(rgeVar, j3, cbcVar);
                    if (zgo1.s(objH)) {
                        j = j2;
                        break;
                    }
                    hp51 hp51VarR = zgo1.r(objH);
                    while (true) {
                        hp51 hp51Var = (hp51) avg.a.getObjectVolatile(this, j2);
                        j = j2;
                        if (hp51Var.e >= hp51VarR.e) {
                            break;
                        }
                        if (!hp51VarR.j()) {
                            break;
                        }
                        if (z5c.o(this, hp51Var, hp51VarR)) {
                            if (!hp51Var.f()) {
                                break;
                            }
                            hp51Var.e();
                            break;
                        } else {
                            if (hp51VarR.f()) {
                                hp51VarR.e();
                            }
                            j2 = j;
                        }
                    }
                    j2 = j;
                }
                rge rgeVar2 = null;
                if (zgo1.s(objH)) {
                    K();
                    F(j3, rgeVar);
                    y(1L);
                } else {
                    rge rgeVar3 = (rge) zgo1.r(objH);
                    long j4 = rgeVar3.e;
                    if (j4 > j3) {
                        long j5 = ((long) dbc.b) * j4;
                        if (avg.a.compareAndSwapLong(this, X, 1 + andIncrement, j5)) {
                            y(j5 - andIncrement);
                        } else {
                            y(1L);
                        }
                    } else {
                        rgeVar2 = rgeVar3;
                    }
                }
                if (rgeVar2 == null) {
                    continue;
                } else {
                    rgeVar = rgeVar2;
                }
                j2 = j;
            } else {
                j = j2;
            }
            int i2 = (int) (andIncrement % ((long) dbc.b));
            Object objL = rgeVar.l(i2);
            boolean z = objL instanceof o4l1;
            long j6 = P0;
            if (!z || andIncrement < avg.a.getLongVolatile(this, j6) || !rgeVar.k(i2, objL, dbc.g)) {
                while (true) {
                    Object objL2 = rgeVar.l(i2);
                    if (objL2 instanceof o4l1) {
                        if (andIncrement < avg.a.getLongVolatile(this, j6)) {
                            if (rgeVar.k(i2, objL2, new p4l1((o4l1) objL2))) {
                                y(1L);
                                return;
                            }
                        } else if (rgeVar.k(i2, objL2, dbc.g)) {
                            if (!T(objL2, rgeVar, i2)) {
                                rgeVar.o(i2, dbc.j);
                                rgeVar.i();
                                break;
                            } else {
                                rgeVar.o(i2, dbc.d);
                                y(1L);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == dbc.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (rgeVar.k(i2, objL2, dbc.e)) {
                                y(1L);
                                return;
                            }
                        } else if (objL2 == dbc.d || objL2 == dbc.h || objL2 == dbc.i || objL2 == dbc.k || objL2 == dbc.l) {
                            y(1L);
                            return;
                        } else if (objL2 != dbc.f) {
                            eg.m(f4i1.d(objL2, "Unexpected cell state: "));
                            return;
                        }
                    }
                }
                y(1L);
            } else if (T(objL, rgeVar, i2)) {
                rgeVar.o(i2, dbc.d);
                y(1L);
                return;
            } else {
                rgeVar.o(i2, dbc.j);
                rgeVar.i();
                y(1L);
            }
            j2 = j;
        }
    }

    public final rge k(long j, rge rgeVar) {
        Object objH;
        bbc bbcVar;
        rge rgeVar2 = dbc.a;
        cbc cbcVar = cbc.a;
        loop0: while (true) {
            objH = lvx.h(rgeVar, j, cbcVar);
            if (!zgo1.s(objH)) {
                hp51 hp51VarR = zgo1.r(objH);
                while (true) {
                    hp51 hp51Var = (hp51) avg.a.getObjectVolatile(this, O0);
                    if (hp51Var.e >= hp51VarR.e) {
                        break loop0;
                    }
                    if (!hp51VarR.j()) {
                        break;
                    }
                    if (z5c.i(this, hp51Var, hp51VarR)) {
                        if (!hp51Var.f()) {
                            break loop0;
                        }
                        hp51Var.e();
                        break loop0;
                    }
                    if (hp51VarR.f()) {
                        hp51VarR.e();
                    }
                }
            } else {
                break;
            }
        }
        if (zgo1.s(objH)) {
            K();
            if (rgeVar.e * ((long) dbc.b) < v()) {
                rgeVar.b();
                return null;
            }
        } else {
            rge rgeVar3 = (rge) zgo1.r(objH);
            long j2 = rgeVar3.e;
            if (!E() && j <= n() / ((long) dbc.b)) {
                while (true) {
                    hp51 hp51Var2 = (hp51) avg.a.getObjectVolatile(this, Y);
                    if (hp51Var2.e >= j2 || !rgeVar3.j()) {
                        break;
                    }
                    if (z5c.h(this, hp51Var2, rgeVar3)) {
                        if (!hp51Var2.f()) {
                            break;
                        }
                        hp51Var2.e();
                        break;
                    }
                    if (rgeVar3.f()) {
                        rgeVar3.e();
                    }
                }
            }
            if (j2 <= j) {
                return rgeVar3;
            }
            long j3 = j2 * ((long) dbc.b);
            while (true) {
                Unsafe unsafe = avg.a;
                long j4 = P0;
                long longVolatile = unsafe.getLongVolatile(this, j4);
                if (longVolatile >= j3) {
                    bbcVar = this;
                    break;
                }
                bbcVar = this;
                if (unsafe.compareAndSwapLong(bbcVar, j4, longVolatile, j3)) {
                    break;
                }
                this = bbcVar;
            }
            if (j2 * ((long) dbc.b) < bbcVar.v()) {
                rgeVar3.b();
            }
        }
        return null;
    }

    @Override // p.r261
    public Object l(Object obj) {
        Throwable thU;
        bbc bbcVar = this;
        Unsafe unsafe = avg.a;
        long longVolatile = unsafe.getLongVolatile(bbcVar, R0);
        long j = 1152921504606846975L;
        boolean z = bbcVar.A(longVolatile, false) ? false : !bbcVar.a(longVolatile & 1152921504606846975L);
        pge pgeVar = qge.b;
        if (z) {
            return pgeVar;
        }
        o4l1 o4l1Var = dbc.j;
        rge rgeVar = (rge) unsafe.getObjectVolatile(bbcVar, Q0);
        while (true) {
            long andIncrement = b.getAndIncrement(bbcVar);
            long j2 = andIncrement & j;
            boolean zA = bbcVar.A(andIncrement, false);
            int i2 = dbc.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (rgeVar.e != j4) {
                rge rgeVarM = bbcVar.m(j4, rgeVar);
                if (rgeVarM != null) {
                    rgeVar = rgeVarM;
                } else {
                    if (zA) {
                        thU = bbcVar.u();
                        break;
                    }
                    j = 1152921504606846975L;
                }
            }
            int iV = bbcVar.V(rgeVar, i3, obj, j2, o4l1Var, zA);
            rih1 rih1Var = rih1.a;
            if (iV == 0) {
                rgeVar.b();
                return rih1Var;
            }
            if (iV == 1) {
                return rih1Var;
            }
            if (iV != 2) {
                if (iV == 3) {
                    eg.m("unexpected");
                    return null;
                }
                if (iV != 4) {
                    if (iV == 5) {
                        rgeVar.b();
                    }
                    j = 1152921504606846975L;
                    bbcVar = this;
                } else if (j2 < q()) {
                    rgeVar.b();
                }
            } else {
                if (!zA) {
                    o4l1 o4l1Var2 = o4l1Var instanceof o4l1 ? o4l1Var : null;
                    if (o4l1Var2 != null) {
                        o4l1Var2.b(rgeVar, i3 + i2);
                    }
                    rgeVar.i();
                    return pgeVar;
                }
                rgeVar.i();
            }
            thU = u();
            break;
        }
        return flo1.e(thU);
    }

    public final rge m(long j, rge rgeVar) {
        Object objH;
        rge rgeVar2;
        rge rgeVar3;
        bbc bbcVar = this;
        rge rgeVar4 = dbc.a;
        cbc cbcVar = cbc.a;
        loop0: while (true) {
            objH = lvx.h(rgeVar, j, cbcVar);
            if (!zgo1.s(objH)) {
                hp51 hp51VarR = zgo1.r(objH);
                while (true) {
                    hp51 hp51Var = (hp51) avg.a.getObjectVolatile(bbcVar, Q0);
                    if (hp51Var.e >= hp51VarR.e) {
                        break loop0;
                    }
                    if (!hp51VarR.j()) {
                        break;
                    }
                    if (z5c.n(bbcVar, hp51Var, hp51VarR)) {
                        if (!hp51Var.f()) {
                            break loop0;
                        }
                        hp51Var.e();
                        break loop0;
                    }
                    if (hp51VarR.f()) {
                        hp51VarR.e();
                    }
                }
            } else {
                break;
            }
        }
        rge rgeVar5 = null;
        if (zgo1.s(objH)) {
            bbcVar.K();
            if (rgeVar.e * ((long) dbc.b) >= bbcVar.q()) {
                return null;
            }
            rgeVar.b();
            return null;
        }
        rge rgeVar6 = (rge) zgo1.r(objH);
        long j2 = rgeVar6.e;
        if (j2 <= j) {
            return rgeVar6;
        }
        long j3 = j2 * ((long) dbc.b);
        while (true) {
            Unsafe unsafe = avg.a;
            long j4 = R0;
            long longVolatile = unsafe.getLongVolatile(bbcVar, j4);
            long j5 = 1152921504606846975L & longVolatile;
            if (j5 >= j3) {
                rgeVar2 = rgeVar5;
                rgeVar3 = rgeVar6;
                break;
            }
            rgeVar2 = rgeVar5;
            rgeVar3 = rgeVar6;
            if (unsafe.compareAndSwapLong(bbcVar, j4, longVolatile, j5 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            bbcVar = this;
            rgeVar6 = rgeVar3;
            rgeVar5 = rgeVar2;
        }
        if (j2 * ((long) dbc.b) >= q()) {
            return rgeVar2;
        }
        rgeVar3.b();
        return rgeVar2;
    }

    public final long n() {
        return avg.a.getLongVolatile(this, X);
    }

    public final Throwable o() {
        return (Throwable) avg.a.getObjectVolatile(this, t);
    }

    public void onNext(Object obj) {
        l(obj);
    }

    public final Throwable p() {
        Throwable thO = o();
        return thO == null ? new ClosedReceiveChannelException("Channel was closed") : thO;
    }

    public final long q() {
        return avg.a.getLongVolatile(this, P0);
    }

    @Override // p.jfe
    public final Object r(lnm lnmVar) throws Throwable {
        rge rgeVar;
        Throwable th;
        rge rgeVar2;
        Unsafe unsafe = avg.a;
        long j = O0;
        rge rgeVar3 = (rge) unsafe.getObjectVolatile(this, j);
        while (!this.C()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = dbc.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (rgeVar3.e != j3) {
                rge rgeVarK = this.k(j3, rgeVar3);
                if (rgeVarK == null) {
                    continue;
                } else {
                    rgeVar = rgeVarK;
                }
            } else {
                rgeVar = rgeVar3;
            }
            bbc bbcVar = this;
            Object objU = bbcVar.U(rgeVar, i2, andIncrement, null);
            jm jmVar = dbc.m;
            if (objU == jmVar) {
                eg.m("unexpected");
                return null;
            }
            jm jmVar2 = dbc.o;
            if (objU == jmVar2) {
                if (andIncrement < bbcVar.v()) {
                    rgeVar.b();
                }
                this = bbcVar;
                rgeVar3 = rgeVar;
            } else {
                if (objU != dbc.n) {
                    rgeVar.b();
                    return objU;
                }
                ohd ohdVarU = jzn1.u(aym.t(lnmVar));
                try {
                    Object objU2 = bbcVar.U(rgeVar, i2, andIncrement, ohdVarU);
                    if (objU2 != jmVar) {
                        if (objU2 == jmVar2) {
                            if (andIncrement < bbcVar.v()) {
                                rgeVar.b();
                            }
                            rge rgeVar4 = (rge) avg.a.getObjectVolatile(bbcVar, j);
                            while (true) {
                                if (bbcVar.C()) {
                                    ohdVarU.resumeWith(new m231(bbcVar.p()));
                                    break;
                                }
                                ohd ohdVar = ohdVarU;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bbcVar);
                                    long j4 = dbc.b;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (rgeVar4.e != j5) {
                                        try {
                                            rge rgeVarK2 = bbcVar.k(j5, rgeVar4);
                                            if (rgeVarK2 == null) {
                                                ohdVarU = ohdVar;
                                            } else {
                                                rgeVar2 = rgeVarK2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            ohdVarU = ohdVar;
                                            ohdVarU.A();
                                            throw th;
                                        }
                                    } else {
                                        rgeVar2 = rgeVar4;
                                    }
                                    bbc bbcVar2 = bbcVar;
                                    objU2 = bbcVar2.U(rgeVar2, i3, andIncrement2, ohdVar);
                                    bbcVar = bbcVar2;
                                    rge rgeVar5 = rgeVar2;
                                    ohdVarU = ohdVar;
                                    if (objU2 == dbc.m) {
                                        bbcVar.N(ohdVarU, rgeVar5, i3);
                                        break;
                                    }
                                    if (objU2 == dbc.o) {
                                        if (andIncrement2 < bbcVar.v()) {
                                            rgeVar5.b();
                                        }
                                        rgeVar4 = rgeVar5;
                                    } else {
                                        if (objU2 == dbc.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        rgeVar5.b();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    ohdVarU = ohdVar;
                                    th = th;
                                    ohdVarU.A();
                                    throw th;
                                }
                            }
                        } else {
                            rgeVar.b();
                        }
                        ohdVarU.f(objU2, null);
                        break;
                    }
                    bbcVar.N(ohdVarU, rgeVar, i2);
                    return ohdVarU.r();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thP = this.p();
        int i4 = cab1.a;
        throw thP;
    }

    @Override // p.jfe
    public final zsc s() {
        vac vacVar = vac.a;
        w0h1.o(3, vacVar);
        wac wacVar = wac.a;
        w0h1.o(3, wacVar);
        return new zsc(this, vacVar, wacVar, (Object) null, (byte) 21);
    }

    @Override // p.jfe
    public final zsc t() {
        xac xacVar = xac.a;
        w0h1.o(3, xacVar);
        yac yacVar = yac.a;
        w0h1.o(3, yacVar);
        return new zsc(this, xacVar, yacVar, (Object) null, (byte) 21);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = avg.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, R0) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i2 = 0;
        List listM = p7h.M(unsafe.getObjectVolatile(this, O0), unsafe.getObjectVolatile(this, Q0), unsafe.getObjectVolatile(this, Y));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (((rge) obj) != dbc.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            hhg1.k();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((rge) next).e;
            do {
                Object next2 = it.next();
                long j2 = ((rge) next2).e;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        rge rgeVar = (rge) next;
        long jQ = q();
        long jV = v();
        loop2: while (true) {
            int i3 = dbc.b;
            for (int i4 = i2; i4 < i3; i4++) {
                long j3 = (rgeVar.e * ((long) dbc.b)) + ((long) i4);
                if (j3 >= jV && j3 >= jQ) {
                    break loop2;
                }
                Object objL = rgeVar.l(i4);
                Object obj2 = rgeVar.i.get(i4 * 2);
                if (objL instanceof mhd) {
                    string = (jV > j3 || j3 >= jQ) ? (jQ > j3 || j3 >= jV) ? "cont" : "send" : "receive";
                } else if (objL instanceof ou51) {
                    string = (jV > j3 || j3 >= jQ) ? (jQ > j3 || j3 >= jV) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof tl01) {
                    string = "receiveCatching";
                } else if (objL instanceof p4l1) {
                    string = "EB(" + objL + ')';
                } else if (u890.j(objL, dbc.f) || u890.j(objL, dbc.g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(dbc.e) && !objL.equals(dbc.i) && !objL.equals(dbc.h) && !objL.equals(dbc.k) && !objL.equals(dbc.j) && !objL.equals(dbc.l)) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            rgeVar = (rge) rgeVar.c();
            if (rgeVar == null) {
                break;
            }
            i2 = 0;
        }
        if (ihc1.z0(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thO = o();
        return thO == null ? new ClosedSendChannelException("Channel was closed") : thO;
    }

    public final long v() {
        return avg.a.getLongVolatile(this, R0) & 1152921504606846975L;
    }

    public final boolean w() {
        while (true) {
            Unsafe unsafe = avg.a;
            long j = O0;
            rge rgeVarK = (rge) unsafe.getObjectVolatile(this, j);
            long jQ = q();
            if (v() <= jQ) {
                return false;
            }
            int i2 = dbc.b;
            long j2 = jQ / ((long) i2);
            if (rgeVarK.e == j2 || (rgeVarK = k(j2, rgeVarK)) != null) {
                rgeVarK.b();
                int i3 = (int) (jQ % ((long) i2));
                while (true) {
                    Object objL = rgeVarK.l(i3);
                    if (objL != null && objL != dbc.e) {
                        if (objL != dbc.d) {
                            if (objL != dbc.j && objL != dbc.l && objL != dbc.i && objL != dbc.h) {
                                if (objL != dbc.g) {
                                    if (objL == dbc.f || jQ != q()) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (rgeVarK.k(i3, objL, dbc.h)) {
                        j();
                        break;
                    }
                }
                avg.a.compareAndSwapLong(this, P0, jQ, jQ + 1);
            } else if (((rge) avg.a.getObjectVolatile(this, j)).e < j2) {
                return false;
            }
        }
    }

    @Override // p.jfe
    public final Object x() {
        rge rgeVar;
        Unsafe unsafe = avg.a;
        long longVolatile = unsafe.getLongVolatile(this, P0);
        long longVolatile2 = unsafe.getLongVolatile(this, R0);
        if (A(longVolatile2, true)) {
            return flo1.e(o());
        }
        long j = longVolatile2 & 1152921504606846975L;
        pge pgeVar = qge.b;
        if (longVolatile >= j) {
            return pgeVar;
        }
        jm jmVar = dbc.k;
        rge rgeVar2 = (rge) unsafe.getObjectVolatile(this, O0);
        while (!this.C()) {
            long andIncrement = c.getAndIncrement(this);
            long j2 = dbc.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (rgeVar2.e != j3) {
                rge rgeVarK = this.k(j3, rgeVar2);
                if (rgeVarK == null) {
                    continue;
                } else {
                    rgeVar = rgeVarK;
                }
            } else {
                rgeVar = rgeVar2;
            }
            bbc bbcVar = this;
            Object objU = bbcVar.U(rgeVar, i2, andIncrement, jmVar);
            rgeVar2 = rgeVar;
            if (objU == dbc.m) {
                o4l1 o4l1Var = jmVar instanceof o4l1 ? (o4l1) jmVar : null;
                if (o4l1Var != null) {
                    bbcVar.N(o4l1Var, rgeVar2, i2);
                }
                bbcVar.X(andIncrement);
                rgeVar2.i();
                return pgeVar;
            }
            if (objU != dbc.o) {
                if (objU != dbc.n) {
                    rgeVar2.b();
                    return objU;
                }
                eg.m("unexpected");
                return null;
            }
            if (andIncrement < bbcVar.v()) {
                rgeVar2.b();
            }
            this = bbcVar;
        }
        return flo1.e(this.o());
    }

    public final void y(long j) {
        if ((e.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((avg.a.getLongVolatile(this, N0) & 4611686018427387904L) != 0) {
            }
        }
    }

    public void G() {
    }

    public void L() {
    }

    public void M() {
    }

    public /* synthetic */ bbc() {
        this(Integer.MAX_VALUE);
    }
}
