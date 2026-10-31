package p;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fl10 implements tl00 {
    public final zf01 a;
    public final isd1 b;
    public long c = Long.MIN_VALUE;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final LinkedBlockingDeque e = new LinkedBlockingDeque();

    public fl10(zf01 zf01Var, isd1 isd1Var) {
        this.a = zf01Var;
        this.b = isd1Var;
    }

    public final void a() {
        CopyOnWriteArrayList<es31> copyOnWriteArrayList = this.d;
        for (es31 es31Var : copyOnWriteArrayList) {
            es31Var.cancel();
            es31 es31VarP = es31Var.p();
            if (es31VarP != null) {
                this.a.q.addLast(es31VarP);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // p.tl00
    public final kf01 b() throws IOException {
        ds31 ds31VarC;
        long j;
        ds31 ds31Var;
        IOException iOException = null;
        while (true) {
            try {
                if (this.d.isEmpty() && !this.a.a(null)) {
                    a();
                    iOException.getClass();
                    throw iOException;
                }
                if (this.a.l.R0) {
                    throw new IOException("Canceled");
                }
                utw0 utw0Var = this.b.a;
                long jNanoTime = System.nanoTime();
                long j2 = this.c - jNanoTime;
                if (this.d.isEmpty() || j2 <= 0) {
                    ds31VarC = c();
                    j = 250000000;
                    this.c = jNanoTime + 250000000;
                } else {
                    j = j2;
                    ds31VarC = null;
                }
                if (ds31VarC == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.d;
                    if (copyOnWriteArrayList.isEmpty() || (ds31Var = (ds31) this.e.poll(j, timeUnit)) == null) {
                        ds31VarC = null;
                    } else {
                        copyOnWriteArrayList.remove(ds31Var.a);
                        ds31VarC = ds31Var;
                    }
                    if (ds31VarC == null) {
                    }
                }
                boolean z = false;
                if (ds31VarC.b == null && ds31VarC.c == null) {
                    a();
                    if (!ds31VarC.a.isReady()) {
                        ds31VarC = ds31VarC.a.c();
                    }
                    if (ds31VarC.b == null && ds31VarC.c == null) {
                        z = true;
                    }
                    if (z) {
                        kf01 kf01VarA = ds31VarC.a.a();
                        a();
                        return kf01VarA;
                    }
                }
                Throwable th = ds31VarC.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        j2h1.h(iOException, th);
                    }
                }
                es31 es31Var = ds31VarC.b;
                if (es31Var != null) {
                    this.a.q.addFirst(es31Var);
                }
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    public final ds31 c() {
        es31 jh10Var;
        zf01 zf01Var = this.a;
        if (zf01Var.a(null)) {
            try {
                jh10Var = zf01Var.b();
            } catch (Throwable th) {
                jh10Var = new jh10(th);
            }
            if (jh10Var.isReady()) {
                return new ds31(jh10Var, (Throwable) null, 6);
            }
            if (jh10Var instanceof jh10) {
                return ((jh10) jh10Var).a;
            }
            this.d.add(jh10Var);
            this.b.d().d(new el10(z4n1.b + " connect " + zf01Var.j.h.h(), jh10Var, this), 0L);
        }
        return null;
    }

    @Override // p.tl00
    public final zf01 f() {
        return this.a;
    }
}
