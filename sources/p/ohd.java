package p;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class ohd extends xfu implements mhd, e9n, o4l1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final lnm d;
    public final o8n e;

    static {
        Unsafe unsafe = avg.a;
        g = unsafe.objectFieldOffset(ohd.class.getDeclaredField("_decisionAndIndex$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(ohd.class, Object.class, "_state$volatile");
        i = unsafe.objectFieldOffset(ohd.class.getDeclaredField("_state$volatile"));
        h = unsafe.objectFieldOffset(ohd.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ohd(int i2, lnm lnmVar) {
        super(i2);
        this.d = lnmVar;
        this.e = lnmVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = ra0.a;
    }

    public static Object D(ago0 ago0Var, Object obj, int i2, xu30 xu30Var) {
        if (!(obj instanceof nyh) && mp10.u(i2) && (xu30Var != null || (ago0Var instanceof bgd))) {
            return new lyh(obj, ago0Var instanceof bgd ? (bgd) ago0Var : null, xu30Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        lnm lnmVar = this.d;
        Throwable th = null;
        vfu vfuVar = lnmVar instanceof vfu ? (vfu) lnmVar : null;
        if (vfuVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vfu.h;
            do {
                Object objectVolatile = avg.a.getObjectVolatile(vfuVar, vfu.i);
                if (objectVolatile != hr80.b) {
                    if (!(objectVolatile instanceof Throwable)) {
                        eg.m(f4i1.d(objectVolatile, "Inconsistent state "));
                        return;
                    }
                    th = (Throwable) objectVolatile;
                    if (hrt.s(vfuVar, th)) {
                        break;
                    }
                    hhg1.n("Failed requirement.");
                    return;
                }
            } while (!hrt.t(vfuVar, this));
            if (th == null) {
                return;
            }
            m();
            q(th);
        }
    }

    public final void B(Object obj, int i2, xu30 xu30Var) {
        ohd ohdVar;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof ago0)) {
                ohd ohdVar2 = this;
                if (objectVolatile instanceof whd) {
                    whd whdVar = (whd) objectVolatile;
                    if (unsafe.compareAndSwapInt(whdVar, whd.c, 0, 1)) {
                        if (xu30Var != null) {
                            ohdVar2.j(xu30Var, whdVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                eg.m(f4i1.d(obj, "Already resumed, but proposed with update "));
                return;
            }
            Object objD = D((ago0) objectVolatile, obj, i2, xu30Var);
            while (true) {
                Unsafe unsafe2 = avg.a;
                ohdVar = this;
                if (unsafe2.compareAndSwapObject(ohdVar, i, objectVolatile, objD)) {
                    if (!ohdVar.x()) {
                        ohdVar.m();
                    }
                    ohdVar.o(i2);
                    return;
                } else if (unsafe2.getObjectVolatile(ohdVar, j) != objectVolatile) {
                    break;
                } else {
                    this = ohdVar;
                }
            }
            this = ohdVar;
        }
    }

    public final void C(q8n q8nVar, Object obj) {
        lnm lnmVar = this.d;
        vfu vfuVar = lnmVar instanceof vfu ? (vfu) lnmVar : null;
        B(obj, (vfuVar != null ? vfuVar.d : null) == q8nVar ? 4 : this.c, null);
    }

    public final jm E(Object obj, xu30 xu30Var) {
        ago0 ago0Var;
        do {
            Object objectVolatile = avg.a.getObjectVolatile(this, i);
            if (!(objectVolatile instanceof ago0)) {
                return null;
            }
            ago0Var = (ago0) objectVolatile;
        } while (!z5c.m(this, ago0Var, D(ago0Var, obj, this.c, xu30Var)));
        boolean zX = x();
        jm jmVar = mym.a;
        if (!zX) {
            m();
        }
        return jmVar;
    }

    @Override // p.mhd
    public final jm M(Object obj, xu30 xu30Var) {
        return E(obj, xu30Var);
    }

    @Override // p.mhd
    public final void O(Object obj) {
        o(this.c);
    }

    @Override // p.xfu
    public final void a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            Object objectVolatile = avg.a.getObjectVolatile(this, i);
            if (objectVolatile instanceof ago0) {
                eg.m("Not completed");
                return;
            }
            if (objectVolatile instanceof nyh) {
                return;
            }
            if (objectVolatile instanceof lyh) {
                lyh lyhVar = (lyh) objectVolatile;
                if (lyhVar.e != null) {
                    eg.m("Must be called at most once");
                    return;
                }
                if (z5c.l(this, lyhVar, lyh.a(lyhVar, null, cancellationException, 15))) {
                    bgd bgdVar = lyhVar.b;
                    if (bgdVar != null) {
                        i(bgdVar, cancellationException);
                    }
                    xu30 xu30Var = lyhVar.c;
                    if (xu30Var != null) {
                        j(xu30Var, cancellationException, lyhVar.a);
                        return;
                    }
                    return;
                }
                cancellationException2 = cancellationException;
            } else {
                cancellationException2 = cancellationException;
                if (z5c.j(this, objectVolatile, new lyh(objectVolatile, (bgd) null, (xu30) null, cancellationException2, 14))) {
                    return;
                }
            }
            cancellationException = cancellationException2;
        }
    }

    @Override // p.o4l1
    public final void b(hp51 hp51Var, int i2) {
        while (true) {
            Unsafe unsafe = avg.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                eg.m("invokeOnCancellation should be called at most once");
                return;
            }
            ohd ohdVar = this;
            if (unsafe.compareAndSwapInt(ohdVar, j, intVolatile, ((intVolatile >> 29) << 29) + i2)) {
                ohdVar.v(hp51Var);
                return;
            }
            this = ohdVar;
        }
    }

    @Override // p.xfu
    public final lnm c() {
        return this.d;
    }

    @Override // p.xfu
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // p.xfu
    public final Object e(Object obj) {
        return obj instanceof lyh ? ((lyh) obj).a : obj;
    }

    @Override // p.mhd
    public final void f(Object obj, xu30 xu30Var) {
        B(obj, this.c, xu30Var);
    }

    @Override // p.e9n
    public final e9n getCallerFrame() {
        lnm lnmVar = this.d;
        if (lnmVar instanceof e9n) {
            return (e9n) lnmVar;
        }
        return null;
    }

    @Override // p.lnm
    public final o8n getContext() {
        return this.e;
    }

    @Override // p.xfu
    public final Object h() {
        return s();
    }

    public final void i(bgd bgdVar, Throwable th) {
        try {
            bgdVar.a(th);
        } catch (Throwable th2) {
            omo1.p(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), this.e);
        }
    }

    @Override // p.mhd
    public final boolean isActive() {
        return s() instanceof ago0;
    }

    @Override // p.mhd
    public final boolean isCancelled() {
        return s() instanceof whd;
    }

    public final void j(xu30 xu30Var, Throwable th, Object obj) {
        o8n o8nVar = this.e;
        try {
            xu30Var.invoke(th, obj, o8nVar);
        } catch (Throwable th2) {
            omo1.p(new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2), o8nVar);
        }
    }

    @Override // p.mhd
    public final void k(iu30 iu30Var, Object obj) {
        B(obj, this.c, iu30Var != null ? new nhd(iu30Var, (byte) 0) : null);
    }

    public final void l(hp51 hp51Var, Throwable th) {
        o8n o8nVar = this.e;
        int intVolatile = avg.a.getIntVolatile(this, g) & 536870911;
        if (intVolatile == 536870911) {
            eg.m("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            hp51Var.h(intVolatile, o8nVar);
        } catch (Throwable th2) {
            omo1.p(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), o8nVar);
        }
    }

    public final void m() {
        Unsafe unsafe = avg.a;
        long j = h;
        qku qkuVar = (qku) unsafe.getObjectVolatile(this, j);
        if (qkuVar == null) {
            return;
        }
        qkuVar.dispose();
        unsafe.putObjectVolatile(this, j, keo0.a);
    }

    @Override // p.mhd
    public final void n(iu30 iu30Var) {
        jzn1.v(this, new agd(iu30Var, (byte) 1));
    }

    public final void o(int i2) {
        while (true) {
            Unsafe unsafe = avg.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i3 = intVolatile >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    mp10.m(this, i2);
                    return;
                } else {
                    eg.m("Already resumed");
                    return;
                }
            }
            ohd ohdVar = this;
            if (unsafe.compareAndSwapInt(ohdVar, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = ohdVar;
            }
        }
    }

    public Throwable p(saa0 saa0Var) {
        return saa0Var.g();
    }

    @Override // p.mhd
    public final boolean q(Throwable th) {
        Throwable cancellationException;
        ohd ohdVar;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof ago0)) {
                return false;
            }
            boolean z = (objectVolatile instanceof bgd) || (objectVolatile instanceof hp51);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            whd whdVar = new whd(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = avg.a;
                ohdVar = this;
                if (unsafe2.compareAndSwapObject(ohdVar, i, objectVolatile, whdVar)) {
                    ago0 ago0Var = (ago0) objectVolatile;
                    if (ago0Var instanceof bgd) {
                        ohdVar.i((bgd) objectVolatile, th);
                    } else if (ago0Var instanceof hp51) {
                        ohdVar.l((hp51) objectVolatile, th);
                    }
                    if (!ohdVar.x()) {
                        ohdVar.m();
                    }
                    ohdVar.o(ohdVar.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(ohdVar, j) != objectVolatile) {
                    break;
                }
                this = ohdVar;
            }
            this = ohdVar;
        }
    }

    public final Object r() {
        faa0 faa0Var;
        boolean zX = x();
        while (true) {
            Unsafe unsafe = avg.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    eg.m("Already suspended");
                    return null;
                }
                if (zX) {
                    this.A();
                }
                Object objS = this.s();
                if (objS instanceof nyh) {
                    throw ((nyh) objS).a;
                }
                if (!mp10.u(this.c) || (faa0Var = (faa0) this.e.A(fkj0.W0)) == null || faa0Var.isActive()) {
                    return this.e(objS);
                }
                CancellationException cancellationExceptionG = faa0Var.g();
                this.a(cancellationExceptionG);
                throw cancellationExceptionG;
            }
            ohd ohdVar = this;
            if (unsafe.compareAndSwapInt(ohdVar, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((qku) unsafe.getObjectVolatile(ohdVar, h)) == null) {
                    ohdVar.u();
                }
                if (zX) {
                    ohdVar.A();
                }
                return d9n.a;
            }
            this = ohdVar;
        }
    }

    @Override // p.lnm
    public final void resumeWith(Object obj) {
        B(uap1.s(obj), this.c, null);
    }

    public final Object s() {
        return avg.a.getObjectVolatile(this, i);
    }

    public final void t() {
        qku qkuVarU = u();
        if (qkuVarU != null && w()) {
            qkuVarU.dispose();
            avg.a.putObjectVolatile(this, h, keo0.a);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(z());
        sb.append('(');
        sb.append(v8r.v(this.d));
        sb.append("){");
        Object objS = s();
        if (objS instanceof ago0) {
            str = "Active";
        } else {
            str = objS instanceof whd ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(v8r.n(this));
        return sb.toString();
    }

    public final qku u() {
        faa0 faa0Var = (faa0) this.e.A(fkj0.W0);
        if (faa0Var == null) {
            return null;
        }
        qku qkuVarB = op71.B(faa0Var, new f0g(this));
        while (true) {
            Unsafe unsafe = avg.a;
            long j = h;
            ohd ohdVar = this;
            if (unsafe.compareAndSwapObject(ohdVar, j, (Object) null, qkuVarB) || unsafe.getObjectVolatile(ohdVar, j) != null) {
                break;
            }
            this = ohdVar;
        }
        return qkuVarB;
    }

    public final void v(ago0 ago0Var) {
        while (true) {
            Unsafe unsafe = avg.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, i);
            if (objectVolatile instanceof ra0) {
                if (z5c.k(this, (ra0) objectVolatile, ago0Var)) {
                    return;
                }
            } else {
                if ((objectVolatile instanceof bgd) || (objectVolatile instanceof hp51)) {
                    y(ago0Var, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof nyh) {
                    nyh nyhVar = (nyh) objectVolatile;
                    if (!unsafe.compareAndSwapInt(nyhVar, nyh.b, 0, 1)) {
                        y(ago0Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof whd) {
                        Throwable th = nyhVar.a;
                        if (ago0Var instanceof bgd) {
                            i((bgd) ago0Var, th);
                            return;
                        } else {
                            l((hp51) ago0Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof lyh) {
                    lyh lyhVar = (lyh) objectVolatile;
                    if (lyhVar.b != null) {
                        y(ago0Var, objectVolatile);
                        throw null;
                    }
                    if (ago0Var instanceof hp51) {
                        return;
                    }
                    bgd bgdVar = (bgd) ago0Var;
                    Throwable th2 = lyhVar.e;
                    if (th2 != null) {
                        i(bgdVar, th2);
                        return;
                    } else if (z5c.l(this, lyhVar, lyh.a(lyhVar, bgdVar, null, 29))) {
                        return;
                    }
                } else {
                    if (ago0Var instanceof hp51) {
                        return;
                    }
                    if (z5c.j(this, objectVolatile, new lyh(objectVolatile, (bgd) ago0Var, (xu30) null, (Throwable) null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean w() {
        return !(s() instanceof ago0);
    }

    public final boolean x() {
        if (mp10.x(this.c)) {
            return avg.a.getObjectVolatile((vfu) this.d, vfu.i) != null;
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
