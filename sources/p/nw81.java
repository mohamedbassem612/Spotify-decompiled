package p;

import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class nw81 implements ear {
    public final mw81 a;
    public final gar[] e;
    public final har[] f;
    public int g;
    public int h;
    public gar i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public nw81(gar[] garVarArr, har[] harVarArr) {
        this.e = garVarArr;
        this.g = garVarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = harVarArr;
        this.h = harVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        mw81 mw81Var = new mw81(this);
        this.a = mw81Var;
        mw81Var.start();
    }

    @Override // p.ear
    public final void d(long j) {
        synchronized (this.b) {
            try {
                dm5.y(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.ear
    public final Object e() {
        gar garVar;
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                dm5.y(this.i == null);
                int i = this.g;
                if (i == 0) {
                    garVar = null;
                } else {
                    gar[] garVarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    garVar = garVarArr[i2];
                }
                this.i = garVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return garVar;
    }

    public gar f() {
        return new gar(1);
    }

    @Override // p.ear
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                gar garVar = this.i;
                if (garVar != null) {
                    garVar.g();
                    gar[] garVarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    garVarArr[i] = garVar;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    gar garVar2 = (gar) this.c.removeFirst();
                    garVar2.g();
                    gar[] garVarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    garVarArr2[i2] = garVar2;
                }
                while (!this.d.isEmpty()) {
                    ((har) this.d.removeFirst()).h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract har g();

    public DecoderException h(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    public abstract DecoderException i(gar garVar, har harVar, boolean z);

    public final boolean j() {
        boolean z;
        DecoderException decoderExceptionH;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            gar garVar = (gar) this.c.removeFirst();
            har[] harVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            har harVar = harVarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (garVar.f(4)) {
                harVar.e(4);
            } else {
                harVar.b = garVar.f;
                if (garVar.f(134217728)) {
                    harVar.e(134217728);
                }
                long j = garVar.f;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    harVar.c = true;
                }
                try {
                    decoderExceptionH = i(garVar, harVar, z2);
                } catch (OutOfMemoryError e) {
                    decoderExceptionH = h(e);
                } catch (RuntimeException e2) {
                    decoderExceptionH = h(e2);
                }
                if (decoderExceptionH != null) {
                    synchronized (this.b) {
                        this.j = decoderExceptionH;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || harVar.c) {
                        harVar.h();
                    } else {
                        this.d.addLast(harVar);
                    }
                    garVar.g();
                    gar[] garVarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    garVarArr[i2] = garVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // p.ear
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final har b() {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (har) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.ear
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void c(gar garVar) {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                dm5.m(garVar == this.i);
                this.c.addLast(garVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(har harVar) {
        synchronized (this.b) {
            harVar.g();
            har[] harVarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            harVarArr[i] = harVar;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // p.ear
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
