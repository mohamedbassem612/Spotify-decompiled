package p;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g270 implements a6a1 {
    public final f270 X;
    public int Y;
    public IOException Z;
    public final int a;
    public final z170 b;
    public final qql1 c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public boolean g;
    public final e270 h;
    public final d270 i;
    public final f270 t;

    public g270(int i, z170 z170Var, boolean z, boolean z2, v360 v360Var) {
        this.a = i;
        this.b = z170Var;
        this.c = new qql1(i);
        this.e = z170Var.S0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f = arrayDeque;
        this.h = new e270(this, z170Var.R0.a(), z2);
        this.i = new d270(this, z);
        this.t = new f270(this);
        this.X = new f270(this);
        if (v360Var == null) {
            if (g()) {
                return;
            }
            eg.m("remotely-initiated streams should have headers");
            throw null;
        }
        if (g()) {
            eg.m("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(v360Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z;
        boolean zH;
        TimeZone timeZone = z4n1.a;
        synchronized (this) {
            try {
                e270 e270Var = this.h;
                if (e270Var.b || !e270Var.e) {
                    z = false;
                } else {
                    d270 d270Var = this.i;
                    if (d270Var.a || d270Var.c) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (zH) {
                return;
            }
            this.b.d(this.a);
        }
    }

    public final void b() throws IOException {
        d270 d270Var = this.i;
        if (d270Var.c) {
            k220.i("stream closed");
            return;
        }
        if (d270Var.a) {
            k220.i("stream finished");
            return;
        }
        if (f() != 0) {
            IOException iOException = this.Z;
            if (iOException != null) {
                throw iOException;
            }
            int iF = f();
            l1d.b(iF);
            throw new StreamResetException(iF);
        }
    }

    public final void c(int i, IOException iOException) {
        if (d(i, iOException)) {
            this.b.X0.h(this.a, i);
        }
    }

    @Override // p.a6a1
    public final void cancel() {
        e(9);
    }

    public final boolean d(int i, IOException iOException) {
        TimeZone timeZone = z4n1.a;
        synchronized (this) {
            if (f() != 0) {
                return false;
            }
            this.Y = i;
            this.Z = iOException;
            notifyAll();
            if (this.h.b && this.i.a) {
                return false;
            }
            this.b.d(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (d(i, null)) {
            this.b.h(this.a, i);
        }
    }

    public final int f() {
        int i;
        synchronized (this) {
            i = this.Y;
        }
        return i;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    @Override // p.a6a1
    public final fka1 getSource() {
        return this.h;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != 0) {
                    return false;
                }
                e270 e270Var = this.h;
                if (e270Var.b || e270Var.e) {
                    d270 d270Var = this.i;
                    if ((d270Var.a || d270Var.c) && this.g) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(v360 v360Var, boolean z) {
        boolean zH;
        TimeZone timeZone = z4n1.a;
        synchronized (this) {
            try {
                if (this.g && v360Var.c(":status") == null && v360Var.c(":method") == null) {
                    this.h.getClass();
                } else {
                    this.g = true;
                    this.f.add(v360Var);
                }
                if (z) {
                    this.h.b = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.b.d(this.a);
    }

    @Override // p.a6a1
    public final c291 q() {
        return this.i;
    }
}
