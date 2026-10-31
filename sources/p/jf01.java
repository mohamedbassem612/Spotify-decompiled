package p;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jf01 implements Cloneable {
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public volatile boolean R0;
    public volatile i25 S0;
    public final CopyOnWriteArrayList T0;
    public boolean X;
    public i25 Y;
    public boolean Z;
    public final azp0 a;
    public final ln21 b;
    public final boolean c;
    public final k7v d;
    public final xa00 e;
    public final if01 f;
    public final AtomicBoolean g;
    public Object h;
    public tl00 i;
    public kf01 t;

    public jf01(azp0 azp0Var, ln21 ln21Var, boolean z) {
        this.a = azp0Var;
        this.b = ln21Var;
        this.c = z;
        this.d = azp0Var.F.a;
        this.e = azp0Var.d.c(this);
        if01 if01Var = new if01(this);
        if01Var.g(azp0Var.w, TimeUnit.MILLISECONDS);
        this.f = if01Var;
        this.g = new AtomicBoolean();
        this.Q0 = true;
        this.T0 = new CopyOnWriteArrayList();
        new AtomicReference(ln21Var.e);
    }

    public final void a(kf01 kf01Var) {
        TimeZone timeZone = z4n1.a;
        if (this.t != null) {
            eg.m("Check failed.");
        } else {
            this.t = kf01Var;
            kf01Var.q.add(new hf01(this, this.h));
        }
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketK;
        TimeZone timeZone = z4n1.a;
        kf01 kf01Var = this.t;
        if (kf01Var != null) {
            synchronized (kf01Var) {
                socketK = k();
            }
            if (this.t == null) {
                if (socketK != null) {
                    z4n1.c(socketK);
                }
                this.e.l(this, kf01Var);
            } else if (socketK != null) {
                eg.m("Check failed.");
                return null;
            }
        }
        if (!this.X && this.f.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        xa00 xa00Var = this.e;
        if (iOException == null) {
            xa00Var.d(this);
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        xa00Var.e(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void cancel() {
        if (this.R0) {
            return;
        }
        this.R0 = true;
        i25 i25Var = this.S0;
        if (i25Var != null) {
            ((sl00) i25Var.e).cancel();
        }
        Iterator it = this.T0.iterator();
        while (it.hasNext()) {
            ((es31) it.next()).cancel();
        }
        this.e.g(this);
    }

    public final Object clone() {
        return new jf01(this.a, this.b, this.c);
    }

    public final void d(nyc nycVar) {
        if (!this.g.compareAndSet(false, true)) {
            eg.m("Already Executed");
            return;
        }
        nct0 nct0Var = nct0.a;
        this.h = nct0.a.g();
        this.e.f(this);
        zfu zfuVar = this.a.a;
        gf01 gf01Var = new gf01(this, nycVar);
        zfuVar.getClass();
        zfu.c(zfuVar, gf01Var, null, null, 6);
    }

    public final ry21 e() {
        if (!this.g.compareAndSet(false, true)) {
            eg.m("Already Executed");
            return null;
        }
        this.f.i();
        nct0 nct0Var = nct0.a;
        this.h = nct0.a.g();
        this.e.f(this);
        try {
            zfu zfuVar = this.a.a;
            synchronized (zfuVar) {
                zfuVar.g.add(this);
            }
            ry21 ry21VarH = h();
            zfu zfuVar2 = this.a.a;
            zfuVar2.getClass();
            zfu.c(zfuVar2, null, this, null, 5);
            return ry21VarH;
        } catch (Throwable th) {
            zfu zfuVar3 = this.a.a;
            zfuVar3.getClass();
            zfu.c(zfuVar3, null, this, null, 5);
            throw th;
        }
    }

    public final void g(boolean z) {
        i25 i25Var;
        synchronized (this) {
            if (!this.Q0) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (i25Var = this.S0) != null) {
            ((sl00) i25Var.e).cancel();
            ((jf01) i25Var.b).i(i25Var, true, true, true, true, null);
        }
        this.Y = null;
    }

    public final ry21 h() {
        ArrayList arrayList = new ArrayList();
        r7h.W(this.a.b, arrayList);
        arrayList.add(new o4c((Object) this.a, (byte) 4));
        arrayList.add(new o4c((Object) this.a.j, (byte) 0));
        arrayList.add(new o4c((Object) this.a.k, (byte) 2));
        arrayList.add(nxc.c);
        if (!this.c) {
            r7h.W(this.a.c, arrayList);
        }
        arrayList.add(nxc.b);
        ln21 ln21Var = this.b;
        azp0 azp0Var = this.a;
        try {
            try {
                ry21 ry21VarB = new uf01(this, arrayList, 0, null, ln21Var, azp0Var.x, azp0Var.y, azp0Var.z).b(ln21Var);
                if (this.R0) {
                    w4n1.b(ry21VarB);
                    throw new IOException("Canceled");
                }
                j(null);
                return ry21VarB;
            } catch (IOException e) {
                throw j(e);
            }
        } catch (Throwable th) {
            if (0 == 0) {
                j(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003c, B:34:0x0040, B:36:0x0044, B:41:0x004d, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:63:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002e A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003c, B:34:0x0040, B:36:0x0044, B:41:0x004d, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:63:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0032 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003c, B:34:0x0040, B:36:0x0044, B:41:0x004d, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:63:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0036 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003c, B:34:0x0040, B:36:0x0044, B:41:0x004d, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:63:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004a  */
    public final IOException i(i25 i25Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        if (i25Var.equals(this.S0)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.Z) {
                            if (z) {
                                this.Z = false;
                            }
                            if (z2) {
                                this.N0 = false;
                            }
                            if (z4) {
                                this.O0 = false;
                            }
                            if (z3) {
                                this.P0 = false;
                            }
                            if (this.Z) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = true;
                            }
                            boolean z8 = z5;
                            z5 = z7;
                            z6 = z8;
                        } else if ((!z2 && this.N0) || ((z4 && this.O0) || (z3 && this.P0))) {
                            if (z) {
                                this.Z = false;
                            }
                            if (z2) {
                                this.N0 = false;
                            }
                            if (z4) {
                                this.O0 = false;
                            }
                            if (z3) {
                                this.P0 = false;
                            }
                            if (this.Z || this.N0 || this.O0 || this.P0) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && !this.Q0) {
                                z5 = true;
                            }
                            boolean z9 = z5;
                            z5 = z7;
                            z6 = z9;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = !z2 ? false : false;
                }
            }
            if (z5) {
                this.S0 = null;
                kf01 kf01Var = this.t;
                if (kf01Var != null) {
                    synchronized (kf01Var) {
                        kf01Var.n++;
                    }
                }
            }
            if (z6) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.Q0) {
                this.Q0 = false;
                if (!this.Z && !this.N0 && !this.O0 && !this.P0) {
                    z = true;
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket k() {
        kf01 kf01Var = this.t;
        kf01Var.getClass();
        TimeZone timeZone = z4n1.a;
        ArrayList arrayList = kf01Var.q;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (u890.j(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            eg.m("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.t = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        kf01Var.r = System.nanoTime();
        k7v k7vVar = this.d;
        hsd1 hsd1Var = (hsd1) k7vVar.c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) k7vVar.e;
        TimeZone timeZone2 = z4n1.a;
        if (!kf01Var.k && k7vVar.a != 0) {
            hsd1Var.d((ydu) k7vVar.d, 0L);
            return null;
        }
        kf01Var.k = true;
        concurrentLinkedQueue.remove(kf01Var);
        if (concurrentLinkedQueue.isEmpty()) {
            hsd1Var.a();
        }
        return kf01Var.e;
    }
}
