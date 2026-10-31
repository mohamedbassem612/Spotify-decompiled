package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class saa0 implements faa0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(saa0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = avg.a;
        c = unsafe.objectFieldOffset(saa0.class.getDeclaredField("_state$volatile"));
        b = unsafe.objectFieldOffset(saa0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public saa0(boolean z) {
        this._state$volatile = z ? j1e1.g : j1e1.f;
    }

    public static n0g p0(yoe0 yoe0Var) {
        while (yoe0Var.i()) {
            yoe0Var = yoe0Var.h();
        }
        while (true) {
            yoe0Var = yoe0Var.g();
            if (!yoe0Var.i()) {
                if (yoe0Var instanceof n0g) {
                    return (n0g) yoe0Var;
                }
                if (yoe0Var instanceof pdo0) {
                    return null;
                }
            }
        }
    }

    public static String v0(Object obj) {
        if (!(obj instanceof naa0)) {
            if (obj instanceof i980) {
                return ((i980) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof nyh ? "Cancelled" : "Completed";
        }
        naa0 naa0Var = (naa0) obj;
        if (naa0Var.d()) {
            return "Cancelling";
        }
        return naa0Var.e() ? "Completing" : "Active";
    }

    @Override // p.o8n
    public final /* bridge */ m8n A(n8n n8nVar) {
        return ha71.w(this, n8nVar);
    }

    @Override // p.o8n
    public final /* bridge */ o8n C(n8n n8nVar) {
        return ha71.z(this, n8nVar);
    }

    public Object E(lnm lnmVar) {
        return Q(lnmVar);
    }

    @Override // p.faa0
    public final qku F(boolean z, boolean z2, v6a v6aVar) {
        return k0(z2, z ? new se90(v6aVar) : new te90(v6aVar));
    }

    public boolean H(Throwable th) {
        return R(th);
    }

    @Override // p.faa0
    public final qku L(iu30 iu30Var) {
        return k0(true, new te90(iu30Var));
    }

    public void P(Object obj) {
        N(obj);
    }

    public final Object Q(lnm lnmVar) throws Throwable {
        Object objG0;
        do {
            objG0 = g0();
            if (!(objG0 instanceof i980)) {
                if (objG0 instanceof nyh) {
                    throw ((nyh) objG0).a;
                }
                return j1e1.D(objG0);
            }
        } while (u0(objG0) < 0);
        laa0 laa0Var = new laa0(aym.t(lnmVar), this);
        laa0Var.t();
        jzn1.r(laa0Var, op71.B(this, new k631(laa0Var)));
        return laa0Var.r();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
      0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0060, B:37:0x0077, B:35:0x006d, B:36:0x0071), top: B:78:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060 A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0060, B:37:0x0077, B:35:0x006d, B:36:0x0071), top: B:78:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006d A[Catch: all -> 0x005e, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0060, B:37:0x0077, B:35:0x006d, B:36:0x0071), top: B:78:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean R(Object obj) {
        Throwable thX;
        Object objG0;
        Throwable thC;
        jm jmVar;
        i980 i980Var;
        pdo0 pdo0VarF0;
        Object objW0;
        Object objW1 = j1e1.a;
        if (e0()) {
            do {
                Object objG1 = g0();
                if (!(objG1 instanceof i980) || ((objG1 instanceof naa0) && ((naa0) objG1).e())) {
                    objW1 = j1e1.a;
                    break;
                }
                objW1 = w0(objG1, new nyh(X(obj), false));
            } while (objW1 == j1e1.c);
            if (objW1 != j1e1.b) {
                if (objW1 == j1e1.a) {
                    thX = null;
                    while (true) {
                        objG0 = g0();
                        if (objG0 instanceof naa0) {
                            synchronized (objG0) {
                                if (avg.a.getObjectVolatile((naa0) objG0, naa0.b) == j1e1.e) {
                                    jmVar = j1e1.d;
                                } else {
                                    boolean zD = ((naa0) objG0).d();
                                    if (obj == null || !zD) {
                                        if (thX == null) {
                                            thX = X(obj);
                                        }
                                        ((naa0) objG0).a(thX);
                                    }
                                    thC = zD ? null : ((naa0) objG0).c();
                                    if (thC != null) {
                                        q0(((naa0) objG0).a, thC);
                                    }
                                    jmVar = j1e1.a;
                                }
                            }
                        } else if (objG0 instanceof i980) {
                            if (thX == null) {
                                thX = X(obj);
                            }
                            i980Var = (i980) objG0;
                            if (i980Var.isActive()) {
                                pdo0VarF0 = f0(i980Var);
                                if (pdo0VarF0 == null && ab80.r(this, i980Var, new naa0(pdo0VarF0, thX))) {
                                    q0(pdo0VarF0, thX);
                                    jmVar = j1e1.a;
                                }
                            } else {
                                objW0 = w0(objG0, new nyh(thX, false));
                                if (objW0 != j1e1.a) {
                                    eg.m(f4i1.d(objG0, "Cannot happen in "));
                                    return false;
                                }
                                if (objW0 != j1e1.c) {
                                    objW1 = objW0;
                                    break;
                                }
                            }
                        } else {
                            jmVar = j1e1.d;
                        }
                        objW1 = jmVar;
                        break;
                    }
                }
                if (objW1 != j1e1.a && objW1 != j1e1.b) {
                    if (objW1 == j1e1.d) {
                        return false;
                    }
                    N(objW1);
                    return true;
                }
            }
        } else {
            if (objW1 == j1e1.a) {
                thX = null;
                while (true) {
                    objG0 = g0();
                    if (objG0 instanceof naa0) {
                        synchronized (objG0) {
                            if (avg.a.getObjectVolatile((naa0) objG0, naa0.b) == j1e1.e) {
                                jmVar = j1e1.d;
                            } else {
                                boolean zD2 = ((naa0) objG0).d();
                                if (obj == null) {
                                    if (thX == null) {
                                        thX = X(obj);
                                    }
                                    ((naa0) objG0).a(thX);
                                } else {
                                    if (thX == null) {
                                        thX = X(obj);
                                    }
                                    ((naa0) objG0).a(thX);
                                }
                                if (zD2) {
                                }
                                if (thC != null) {
                                    q0(((naa0) objG0).a, thC);
                                }
                                jmVar = j1e1.a;
                            }
                        }
                    } else if (objG0 instanceof i980) {
                        if (thX == null) {
                            thX = X(obj);
                        }
                        i980Var = (i980) objG0;
                        if (i980Var.isActive()) {
                            pdo0VarF0 = f0(i980Var);
                            if (pdo0VarF0 == null) {
                                continue;
                            } else {
                                q0(pdo0VarF0, thX);
                                jmVar = j1e1.a;
                            }
                        } else {
                            objW0 = w0(objG0, new nyh(thX, false));
                            if (objW0 != j1e1.a) {
                                eg.m(f4i1.d(objG0, "Cannot happen in "));
                                return false;
                            }
                            if (objW0 != j1e1.c) {
                                objW1 = objW0;
                                break;
                            }
                        }
                    } else {
                        jmVar = j1e1.d;
                    }
                    objW1 = jmVar;
                    break;
                }
            }
            if (objW1 != j1e1.a) {
                if (objW1 == j1e1.d) {
                    return false;
                }
                N(objW1);
                return true;
            }
        }
        return true;
    }

    public void S(CancellationException cancellationException) {
        R(cancellationException);
    }

    public final boolean T(Throwable th) {
        if (l0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        m0g m0gVar = (m0g) avg.a.getObjectVolatile(this, b);
        if (m0gVar == null || m0gVar == keo0.a) {
            return z;
        }
        return m0gVar.a(th) || z;
    }

    public String U() {
        return "Job was cancelled";
    }

    public boolean V(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return R(th) && c0();
    }

    public final void W(i980 i980Var, Object obj) {
        Unsafe unsafe = avg.a;
        long j = b;
        m0g m0gVar = (m0g) unsafe.getObjectVolatile(this, j);
        if (m0gVar != null) {
            m0gVar.dispose();
            unsafe.putObjectVolatile(this, j, keo0.a);
        }
        CompletionHandlerException completionHandlerException = null;
        nyh nyhVar = obj instanceof nyh ? (nyh) obj : null;
        Throwable th = nyhVar != null ? nyhVar.a : null;
        if (i980Var instanceof iaa0) {
            try {
                ((iaa0) i980Var).l(th);
                return;
            } catch (Throwable th2) {
                i0(new CompletionHandlerException("Exception in completion handler " + i980Var + " for " + this, th2));
                return;
            }
        }
        pdo0 pdo0VarB = i980Var.b();
        if (pdo0VarB != null) {
            pdo0VarB.c(new xmc0(1), 1);
            for (yoe0 yoe0VarG = (yoe0) pdo0VarB.f(); !yoe0VarG.equals(pdo0VarB); yoe0VarG = yoe0VarG.g()) {
                if (yoe0VarG instanceof iaa0) {
                    try {
                        ((iaa0) yoe0VarG).l(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            j2h1.h(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + yoe0VarG + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                i0(completionHandlerException);
            }
        }
    }

    public final Throwable X(Object obj) {
        Throwable thC;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(U(), null, this) : th;
        }
        saa0 saa0Var = (saa0) obj;
        Object objG0 = saa0Var.g0();
        if (objG0 instanceof naa0) {
            thC = ((naa0) objG0).c();
        } else if (objG0 instanceof nyh) {
            thC = ((nyh) objG0).a;
        } else {
            if (objG0 instanceof i980) {
                eg.m(f4i1.d(objG0, "Cannot be cancelling child in this state: "));
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(v0(objG0)), thC, saa0Var) : cancellationException;
    }

    public final Object Y(naa0 naa0Var, Object obj) throws Throwable {
        Throwable th;
        saa0 saa0Var;
        naa0 naa0Var2;
        nyh nyhVar = obj instanceof nyh ? (nyh) obj : null;
        Throwable th2 = nyhVar != null ? nyhVar.a : null;
        synchronized (naa0Var) {
            try {
                naa0Var.d();
                ArrayList<Throwable> arrayListF = naa0Var.f(th2);
                Throwable thB0 = b0(naa0Var, arrayListF);
                if (thB0 != null) {
                    try {
                        if (arrayListF.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                            for (Throwable th3 : arrayListF) {
                                if (th3 != thB0 && th3 != thB0 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    j2h1.h(thB0, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thB0 != null && thB0 != th2) {
                    obj = new nyh(thB0, false);
                }
                if (thB0 != null && (T(thB0) || h0(thB0))) {
                    avg.a.compareAndSwapInt((nyh) obj, nyh.b, 0, 1);
                }
                r0(obj);
                Object objM = j1e1.m(obj);
                while (true) {
                    Unsafe unsafe = avg.a;
                    long j = c;
                    saa0Var = this;
                    naa0Var2 = naa0Var;
                    if (unsafe.compareAndSwapObject(saa0Var, j, naa0Var2, objM) || unsafe.getObjectVolatile(saa0Var, j) != naa0Var2) {
                        break;
                    }
                    this = saa0Var;
                    naa0Var = naa0Var2;
                }
                saa0Var.W(naa0Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Object Z() throws Throwable {
        Object objG0 = g0();
        if (objG0 instanceof i980) {
            eg.m("This job has not completed yet");
            return null;
        }
        if (objG0 instanceof nyh) {
            throw ((nyh) objG0).a;
        }
        return j1e1.D(objG0);
    }

    @Override // p.faa0
    public final n561 a() {
        return new i46(new paa0(null, this), (byte) 3);
    }

    public final Throwable a0() {
        Object objG0 = g0();
        if (objG0 instanceof naa0) {
            Throwable thC = ((naa0) objG0).c();
            if (thC != null) {
                return thC;
            }
            hhg1.o(this, "Job is still new or active: ");
            return null;
        }
        if (objG0 instanceof i980) {
            hhg1.o(this, "Job is still new or active: ");
            return null;
        }
        if (objG0 instanceof nyh) {
            return ((nyh) objG0).a;
        }
        return null;
    }

    public final Throwable b0(naa0 naa0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (naa0Var.d()) {
                return new JobCancellationException(U(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean c0() {
        return true;
    }

    @Override // p.faa0
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(U(), null, this);
        }
        S(cancellationException);
    }

    public final zsc d0() {
        qaa0 qaa0Var = qaa0.a;
        w0h1.o(3, qaa0Var);
        raa0 raa0Var = raa0.a;
        w0h1.o(3, raa0Var);
        return new zsc(this, qaa0Var, raa0Var, (Object) null, (byte) 21);
    }

    public Object e() {
        return Z();
    }

    public boolean e0() {
        return this instanceof ayh;
    }

    public final pdo0 f0(i980 i980Var) {
        pdo0 pdo0VarB = i980Var.b();
        if (pdo0VarB != null) {
            return pdo0VarB;
        }
        if (i980Var instanceof z5x) {
            return new pdo0();
        }
        if (i980Var instanceof iaa0) {
            t0((iaa0) i980Var);
            return null;
        }
        hhg1.o(i980Var, "State should have list: ");
        return null;
    }

    @Override // p.faa0
    public final CancellationException g() {
        CancellationException cancellationException;
        Object objG0 = g0();
        if (objG0 instanceof naa0) {
            Throwable thC = ((naa0) objG0).c();
            if (thC == null) {
                hhg1.o(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = v8r.l(this).concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thC, this) : cancellationException;
        }
        if (objG0 instanceof i980) {
            hhg1.o(this, "Job is still new or active: ");
            return null;
        }
        if (!(objG0 instanceof nyh)) {
            return new JobCancellationException(v8r.l(this).concat(" has completed normally"), null, this);
        }
        Throwable th = ((nyh) objG0).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(U(), th, this) : cancellationException;
    }

    public final Object g0() {
        return avg.a.getObjectVolatile(this, c);
    }

    @Override // p.m8n
    public final n8n getKey() {
        return fkj0.W0;
    }

    public boolean h0(Throwable th) {
        return false;
    }

    @Override // p.faa0
    public boolean isActive() {
        Object objG0 = g0();
        return (objG0 instanceof i980) && ((i980) objG0).isActive();
    }

    @Override // p.faa0
    public final boolean isCancelled() {
        Object objG0 = g0();
        if (objG0 instanceof nyh) {
            return true;
        }
        return (objG0 instanceof naa0) && ((naa0) objG0).d();
    }

    @Override // p.faa0
    public final Object j(lnm lnmVar) {
        Object objG0;
        rih1 rih1Var;
        do {
            objG0 = g0();
            boolean z = objG0 instanceof i980;
            rih1Var = rih1.a;
            if (!z) {
                op71.x(lnmVar.getContext());
                return rih1Var;
            }
        } while (u0(objG0) < 0);
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        jzn1.r(ohdVar, op71.B(this, new r631(ohdVar)));
        Object objR = ohdVar.r();
        d9n d9nVar = d9n.a;
        if (objR != d9nVar) {
            objR = rih1Var;
        }
        return objR == d9nVar ? objR : rih1Var;
    }

    public final void j0(faa0 faa0Var) {
        long j = b;
        keo0 keo0Var = keo0.a;
        if (faa0Var == null) {
            avg.a.putObjectVolatile(this, j, keo0Var);
            return;
        }
        faa0Var.start();
        m0g m0gVarW = faa0Var.w(this);
        Unsafe unsafe = avg.a;
        unsafe.putObjectVolatile(this, j, m0gVarW);
        if (v()) {
            m0gVarW.dispose();
            unsafe.putObjectVolatile(this, j, keo0Var);
        }
    }

    public final qku k0(boolean z, iaa0 iaa0Var) {
        iaa0 iaa0Var2;
        saa0 saa0Var;
        boolean zC;
        i980 k780Var;
        iaa0Var.f = this;
        loop0: while (true) {
            Object objG0 = this.g0();
            if (!(objG0 instanceof z5x)) {
                iaa0Var2 = iaa0Var;
                saa0Var = this;
                boolean z2 = objG0 instanceof i980;
                keo0 keo0Var = keo0.a;
                if (z2) {
                    i980 i980Var = (i980) objG0;
                    pdo0 pdo0VarB = i980Var.b();
                    if (pdo0VarB == null) {
                        saa0Var.t0((iaa0) objG0);
                    } else {
                        if (iaa0Var2.k()) {
                            naa0 naa0Var = i980Var instanceof naa0 ? (naa0) i980Var : null;
                            Throwable thC = naa0Var != null ? naa0Var.c() : null;
                            if (thC == null) {
                                zC = pdo0VarB.c(iaa0Var2, 5);
                            } else if (z) {
                                iaa0Var2.l(thC);
                                return keo0Var;
                            }
                        } else {
                            zC = pdo0VarB.c(iaa0Var2, 1);
                        }
                        if (zC) {
                            break;
                        }
                    }
                    this = saa0Var;
                    iaa0Var = iaa0Var2;
                } else if (z) {
                    Object objG1 = saa0Var.g0();
                    nyh nyhVar = objG1 instanceof nyh ? (nyh) objG1 : null;
                    iaa0Var2.l(nyhVar != null ? nyhVar.a : null);
                }
                return keo0Var;
            }
            z5x z5xVar = (z5x) objG0;
            boolean z3 = z5xVar.a;
            if (z3) {
                while (true) {
                    Unsafe unsafe = avg.a;
                    long j = c;
                    saa0 saa0Var2 = this;
                    iaa0Var2 = iaa0Var;
                    saa0Var = saa0Var2;
                    if (unsafe.compareAndSwapObject(saa0Var2, j, objG0, iaa0Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(saa0Var, j) != objG0) {
                        break;
                    }
                    this = saa0Var;
                    iaa0Var = iaa0Var2;
                }
            } else {
                iaa0Var2 = iaa0Var;
                saa0Var = this;
                pdo0 pdo0Var = new pdo0();
                if (!z3) {
                    k780Var = pdo0Var;
                    k780Var = new k780(pdo0Var);
                }
                k780Var = pdo0Var;
                kaa0.l(saa0Var, z5xVar, k780Var);
            }
            this = saa0Var;
            iaa0Var = iaa0Var2;
        }
        return iaa0Var2;
    }

    public boolean l0() {
        return this instanceof l8b;
    }

    public final boolean m0(Object obj) {
        Object objW0;
        do {
            objW0 = w0(g0(), obj);
            if (objW0 == j1e1.a) {
                return false;
            }
            if (objW0 == j1e1.b) {
                return true;
            }
        } while (objW0 == j1e1.c);
        N(objW0);
        return true;
    }

    public final Object n0(Object obj) {
        Object objW0;
        do {
            objW0 = w0(g0(), obj);
            if (objW0 == j1e1.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                nyh nyhVar = obj instanceof nyh ? (nyh) obj : null;
                throw new IllegalStateException(str, nyhVar != null ? nyhVar.a : null);
            }
        } while (objW0 == j1e1.c);
        return objW0;
    }

    @Override // p.o8n
    public final /* bridge */ Object o(Object obj, vu30 vu30Var) {
        return ha71.v(this, obj, vu30Var);
    }

    public String o0() {
        return v8r.l(this);
    }

    public final void q0(pdo0 pdo0Var, Throwable th) {
        pdo0Var.c(new xmc0(4), 4);
        CompletionHandlerException completionHandlerException = null;
        for (yoe0 yoe0VarG = (yoe0) pdo0Var.f(); !yoe0VarG.equals(pdo0Var); yoe0VarG = yoe0VarG.g()) {
            if ((yoe0VarG instanceof iaa0) && ((iaa0) yoe0VarG).k()) {
                try {
                    ((iaa0) yoe0VarG).l(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        j2h1.h(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + yoe0VarG + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            i0(completionHandlerException);
        }
        T(th);
    }

    @Override // p.faa0
    public final boolean start() {
        int iU0;
        do {
            iU0 = u0(g0());
            if (iU0 == 0) {
                return false;
            }
        } while (iU0 != 1);
        return true;
    }

    public final void t0(iaa0 iaa0Var) {
        pdo0 pdo0Var = new pdo0();
        Unsafe unsafe = avg.a;
        unsafe.putObjectVolatile(pdo0Var, yoe0.d, iaa0Var);
        unsafe.putObjectVolatile(pdo0Var, yoe0.c, iaa0Var);
        while (iaa0Var.f() == iaa0Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yoe0.a;
            if (g5d0.j(iaa0Var, iaa0Var, pdo0Var)) {
                pdo0Var.e(iaa0Var);
                break;
            }
        }
        yoe0 yoe0VarG = iaa0Var.g();
        while (true) {
            Unsafe unsafe2 = avg.a;
            long j = c;
            saa0 saa0Var = this;
            iaa0 iaa0Var2 = iaa0Var;
            if (unsafe2.compareAndSwapObject(saa0Var, j, iaa0Var2, yoe0VarG) || unsafe2.getObjectVolatile(saa0Var, j) != iaa0Var2) {
                return;
            }
            this = saa0Var;
            iaa0Var = iaa0Var2;
        }
    }

    public final String toString() {
        return (o0() + '{' + v0(g0()) + '}') + '@' + v8r.n(this);
    }

    public final int u0(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof z5x;
        long j = c;
        if (!z) {
            saa0 saa0Var = this;
            Object obj2 = obj;
            if (!(obj2 instanceof k780)) {
                return 0;
            }
            pdo0 pdo0Var = ((k780) obj2).a;
            do {
                saa0 saa0Var2 = saa0Var;
                unsafe = avg.a;
                Object obj3 = obj2;
                boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(saa0Var2, c, obj3, pdo0Var);
                saa0Var = saa0Var2;
                obj2 = obj3;
                if (zCompareAndSwapObject) {
                    saa0Var.s0();
                    return 1;
                }
            } while (unsafe.getObjectVolatile(saa0Var, j) == obj2);
            return -1;
        }
        if (((z5x) obj).a) {
            return 0;
        }
        while (true) {
            Unsafe unsafe2 = avg.a;
            saa0 saa0Var3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(saa0Var3, c, obj4, j1e1.g)) {
                saa0Var3.s0();
                return 1;
            }
            if (unsafe2.getObjectVolatile(saa0Var3, j) != obj4) {
                return -1;
            }
            this = saa0Var3;
            obj = obj4;
        }
    }

    @Override // p.faa0
    public final boolean v() {
        return !(g0() instanceof i980);
    }

    @Override // p.faa0
    public final m0g w(saa0 saa0Var) {
        n0g n0gVar = new n0g(saa0Var);
        n0gVar.f = this;
        while (true) {
            Object objG0 = g0();
            if (objG0 instanceof z5x) {
                z5x z5xVar = (z5x) objG0;
                boolean z = z5xVar.a;
                if (!z) {
                    pdo0 pdo0Var = new pdo0();
                    i980 k780Var = pdo0Var;
                    if (!z) {
                        k780Var = new k780(pdo0Var);
                    }
                    kaa0.l(this, z5xVar, k780Var);
                } else if (kaa0.n(this, z5xVar, n0gVar)) {
                    break;
                }
            } else {
                boolean z2 = objG0 instanceof i980;
                keo0 keo0Var = keo0.a;
                Throwable thC = null;
                if (!z2) {
                    Object objG1 = g0();
                    nyh nyhVar = objG1 instanceof nyh ? (nyh) objG1 : null;
                    n0gVar.l(nyhVar != null ? nyhVar.a : null);
                    return keo0Var;
                }
                pdo0 pdo0VarB = ((i980) objG0).b();
                if (pdo0VarB != null) {
                    if (pdo0VarB.c(n0gVar, 7)) {
                        break;
                    }
                    boolean zC = pdo0VarB.c(n0gVar, 3);
                    Object objG2 = g0();
                    if (objG2 instanceof naa0) {
                        thC = ((naa0) objG2).c();
                    } else {
                        nyh nyhVar2 = objG2 instanceof nyh ? (nyh) objG2 : null;
                        if (nyhVar2 != null) {
                            thC = nyhVar2.a;
                        }
                    }
                    n0gVar.l(thC);
                    if (zC) {
                        break;
                    }
                    return keo0Var;
                }
                t0((iaa0) objG0);
            }
        }
        return n0gVar;
    }

    public final Object w0(Object obj, Object obj2) {
        if (!(obj instanceof i980)) {
            return j1e1.a;
        }
        if (((obj instanceof z5x) || (obj instanceof iaa0)) && !(obj instanceof n0g) && !(obj2 instanceof nyh)) {
            i980 i980Var = (i980) obj;
            if (!kaa0.m(this, i980Var, j1e1.m(obj2))) {
                return j1e1.c;
            }
            r0(obj2);
            W(i980Var, obj2);
            return obj2;
        }
        i980 i980Var2 = (i980) obj;
        pdo0 pdo0VarF0 = f0(i980Var2);
        if (pdo0VarF0 == null) {
            return j1e1.c;
        }
        naa0 naa0Var = i980Var2 instanceof naa0 ? (naa0) i980Var2 : null;
        if (naa0Var == null) {
            naa0Var = new naa0(pdo0VarF0, null);
        }
        synchronized (naa0Var) {
            if (naa0Var.e()) {
                return j1e1.a;
            }
            avg.a.putIntVolatile(naa0Var, naa0.c, 1);
            if (naa0Var != i980Var2 && !ab80.q(this, i980Var2, naa0Var)) {
                return j1e1.c;
            }
            boolean zD = naa0Var.d();
            nyh nyhVar = obj2 instanceof nyh ? (nyh) obj2 : null;
            if (nyhVar != null) {
                naa0Var.a(nyhVar.a);
            }
            Throwable thC = zD ? null : naa0Var.c();
            if (thC != null) {
                q0(pdo0VarF0, thC);
            }
            n0g n0gVarP0 = p0(pdo0VarF0);
            if (n0gVarP0 != null && x0(naa0Var, n0gVarP0, obj2)) {
                return j1e1.b;
            }
            pdo0VarF0.c(new xmc0(2), 2);
            n0g n0gVarP1 = p0(pdo0VarF0);
            return (n0gVarP1 == null || !x0(naa0Var, n0gVarP1, obj2)) ? Y(naa0Var, obj2) : j1e1.b;
        }
    }

    public final boolean x0(naa0 naa0Var, n0g n0gVar, Object obj) {
        while (op71.A(n0gVar.g, false, new maa0(this, naa0Var, n0gVar, obj)) == keo0.a) {
            n0gVar = p0(n0gVar);
            if (n0gVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p.o8n
    public final /* bridge */ o8n y(o8n o8nVar) {
        return ha71.A(this, o8nVar);
    }

    public void s0() {
    }

    public void N(Object obj) {
    }

    public void i0(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public void r0(Object obj) {
    }
}
